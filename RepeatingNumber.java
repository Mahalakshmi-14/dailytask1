public class RepeatingNumber {

    void count_duplicate (int arr[]){
        int a [] = { };
        int counts;
        int prop;

        for(int i =0; i < a.length; i++){
            if (counts[a[i]]){
                counts[a[i]] += 1;
            } else {
                counts[a[i]] = 1;
            }
        }
        System.out.println("Repeating Number is:");

        for (int i =0; i < a.length; i++) {
            if (counts[prop] >= 2) {
                System.out.println(prop + " counted: " + counts[prop] + " times");
            } else
                System.out.println("Non-Repeating Number is: " + prop);
        }
    }

        public static void main(String[] args){
             int arr[] = {1,3,1,5,7,3,1};
            RepeatingNumber elem = new RepeatingNumber();
            elem.count_duplicate(arr);
        }
}
