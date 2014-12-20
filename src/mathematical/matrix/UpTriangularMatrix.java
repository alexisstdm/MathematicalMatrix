package mathematical.matrix;

import java.util.ArrayList;

/**
 * Created by casa on 2/11/14.
 */
public class UpTriangularMatrix extends Matrix {

    public UpTriangularMatrix(){
        super();
    }

    public UpTriangularMatrix(Double[][] matrix){
        super();
        for (int i = 0; i < matrix.length; i++){
            ArrayList<Double> row = new ArrayList<Double>();
            for (int j = i; j < matrix.length; j++){
                row.add(matrix[i][j]);
            }
            matrix_values.add(row);
        }
    }
    public void setElement(int rowPos, int columnPos, Double value){
        if (columnPos >= rowPos){
            int dimension = this.matrix_values.size();
            for (int i = 0; i < dimension; i++) {
                ArrayList<Double> row;
                row = matrix_values.get(i);
                for (int j = dimension; j <= columnPos; j++)
                    row.add(0.0);
            }

            for (int i = dimension; i <= columnPos; i++){
                ArrayList<Double> row = new ArrayList<Double>();
                for (int j = 0; j <= columnPos - i; j++)
                    row.add(0.0);
                matrix_values.add(row);
            }

            matrix_values.get(rowPos).set(columnPos-rowPos, value);
        }
    }

    public Double getElement(int rowPos, int columnPos){
        return matrix_values.get(rowPos).get(columnPos-rowPos);
    }
}
