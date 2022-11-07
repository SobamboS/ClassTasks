import  java.util.Arrays;
public class SchoolComparator {
      private static  String[] nigerianInstitutions = {"unilag", "Lasu"," ABSU","nSUKKA","Unical", "Laspotech"};
    public static void main ( String[] args ) {
        String temp;

        for( int firstIndex = 0; firstIndex < nigerianInstitutions.length; firstIndex++){
            for(int secondIndex = firstIndex + 1; secondIndex < nigerianInstitutions.length; secondIndex++){
                if(nigerianInstitutions[firstIndex].compareTo ( nigerianInstitutions[secondIndex])>0)
                    swapElements(firstIndex, secondIndex);

            }

        }
        System.out.println (Arrays.toString(nigerianInstitutions));
    }

    private  static void swapElements(int firstIndex, int secondIndex){
        String temp;
        temp = nigerianInstitutions[firstIndex];
        nigerianInstitutions[firstIndex] = nigerianInstitutions[secondIndex];
        nigerianInstitutions[secondIndex] = temp;
    }
}
