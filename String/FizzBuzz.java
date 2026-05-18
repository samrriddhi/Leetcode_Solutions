class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> FizzBuzz=new ArrayList<>();
        for(int i = 1;i<n+1;i++){
            if(i%3==0 && i%5==0){
                FizzBuzz.add("FizzBuzz");
            }
            else if(i%3==0){
                FizzBuzz.add("Fizz");
            }
            else if(i%5==0){
                FizzBuzz.add("Buzz");
            }
            else{
                FizzBuzz.add(String.valueOf(i));
            }
        }
        return FizzBuzz;
    }
}