package mathematical.matrix;

import java.util.ArrayList;

/**
 * Created by casa on 1/11/14.
 */
public class Matrix {
    protected ArrayList<ArrayList<Double>> matrix_values;

    public Matrix(){
        matrix_values = new ArrayList<ArrayList<Double>>();
    }

    public Matrix(double matrix[][]){
        matrix_values = new ArrayList<ArrayList<Double>>();
        for (int i = 0; i < matrix.length; i++) {
            ArrayList<Double> row = new ArrayList<Double>();
            for (int j = 0; j <= matrix[0].length; j++) {
                row.add(matrix[i][j]);
            }

            matrix_values.add(row);
        }
    }

    public void setElement(int rowPos, int columnPos, Double value){
        int numRows = matrix_values.size();
        int numColumns = 0;

        if (numRows > 0) numColumns = matrix_values.get(0).size();

        for (int i = 0; i < numRows; i++){
            ArrayList<Double> auxRow;
            auxRow = matrix_values.get(i);
            for (int j = numColumns; j <= columnPos; j++)
                auxRow.add(0.0);
        }

        for (int i = numRows; i <=rowPos; i++){
            ArrayList<Double> auxRow = new ArrayList<Double>();
            for (int j = 0; j <= columnPos; j++)
                auxRow.add(0.0);
            matrix_values.add(auxRow);
        }

        matrix_values.get(rowPos).set(columnPos, value);
    }

    public Double getElement(int rowPos, int columnPos){
        return matrix_values.get(rowPos).get(columnPos);
    }
 }
