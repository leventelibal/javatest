public class findmax {

    public static void main(String[] args) {
        
    }

    public Integer maximum(Integer[] list) {

        int maximum = list[0];
        for (int i : list) {
            if (i > maximum) {
                maximum = i;
            }
        }
        return maximum;



    }

  
}
