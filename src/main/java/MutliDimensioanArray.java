public class MutliDimensioanArray {

    public static void main(String[] args) {

        int [] oneDimensioanlArray= {12,40,100};

        System.out.println(oneDimensioanlArray[1]);

        int [] [] multiDimensionalArray = {{12,40,100}, {23,56,78,10},{90,83,12,34}};


        System.out.println(multiDimensionalArray [1][3]);
        System.out.println(multiDimensionalArray[2] [1]);

        double [] [] doublearray = new double[4] [3];
        doublearray [3] [1]=2.6;
        System.out.println(doublearray[3] [1]);

        for(int array=0; array<multiDimensionalArray.length;array++) {

            for(int item=0; item<multiDimensionalArray[array].length; item++) {
            System.out.print(multiDimensionalArray[array] [item] +"\t");
            }
        System.out.println();

        }
    }
}
