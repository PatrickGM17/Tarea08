public class MatrizTranspuesta {
    public static void main(String[] args) {

        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] matrizTranspuesta = new int[matriz[0].length][matriz.length];
        int x, y;

        System.out.println("Matriz");

        for(x = 0; x < 4; x++)
        {
            for(y = 0; y < 3; y++)
            {
                System.out.print(matriz[x][y] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");

        for (x = 0; x < matriz.length; x++)
        {
            for (y = 0; y < matriz[x].length; y++)
            {
                matrizTranspuesta[y][x] = matriz[x][y];
            }
        }
        System.out.println("Matriz Traspuesta" + "\n");

        for(x = 0; x < matriz[x].length; x++)
        {
            for(y = 0; y < matriz.length; y++)
            {
                System.out.print(matrizTranspuesta[x][y] + "\t" );
            }
            System.out.println();
        }

    }
}
