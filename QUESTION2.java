import java.util.ArrayList;

import gurobi.*;

public class QUESTION2 {
	// creating upperbounds for our loops
	public static int initUpperBound = 50;
	public static int constraintUpperBound = 50;
	public static ArrayList<GRBVar> gurobiVariables = new ArrayList<GRBVar>();

	public static void main(String[] args) {

		try {
			// initializing our environment
			GRBEnv env = new GRBEnv();
			GRBModel model = new GRBModel(env);

			for (int i = 0; i < initUpperBound; i++) {
				gurobiVariables.add(model.addVar(0, (i + 1) * (i + 1) + 10, 0, GRB.INTEGER, i + "x"));
			}

			// limiting our variables according to subjective
			GRBLinExpr expres = new GRBLinExpr();
			for (int j = 0; j < constraintUpperBound; j++) {
				expres.addTerm(j + 1, gurobiVariables.get(j));
			}
			model.addConstr(expres, GRB.LESS_EQUAL, 1000, null);

			// expressing our objective
			GRBLinExpr obj = new GRBLinExpr();
			for (GRBVar k : gurobiVariables) {
				obj.addTerm(1, k);
			}
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
