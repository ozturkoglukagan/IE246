
import gurobi.*;

public class QUESTION1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// initializing our environment
			GRBEnv env = new GRBEnv();
			GRBModel model = new GRBModel(env);

			// creating our variables
			GRBVar x = model.addVar(-GRB.INFINITY, GRB.INFINITY, 0, GRB.INTEGER, "x");
			GRBVar y = model.addVar(0, GRB.INFINITY, 0, GRB.INTEGER, "y");
			GRBVar z = model.addVar(0, GRB.INFINITY, 0, GRB.INTEGER, "z");

			// limiting our variables according to our subjective
			GRBLinExpr expres1 = new GRBLinExpr();
			expres1.addTerm(1, x);
			expres1.addTerm(1, y);
			expres1.addTerm(3, z);
			model.addConstr(expres1, GRB.GREATER_EQUAL, 30, "CORN1");

			// limiting our variables according to our subjective
			GRBLinExpr expres2 = new GRBLinExpr();
			expres2.addTerm(2, x);
			expres2.addTerm(3, y);
			expres2.addTerm(-1, z);
			model.addConstr(expres2, GRB.LESS_EQUAL, 50, "CORN1");

			// expressing our objective
			GRBLinExpr obj = new GRBLinExpr();
			obj.addTerm(3, x);
			obj.addTerm(4, y);
			obj.addTerm(-2, z);
			obj.addConstant(10);
			model.setObjective(obj, GRB.MAXIMIZE);

			// finding a solution
			model.optimize();

			// disposing to clean our ram
			model.dispose();
		} catch (GRBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}