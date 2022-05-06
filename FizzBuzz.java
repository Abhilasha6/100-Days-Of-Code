public class FizzBuzz {
        public List<String> fizzBuzz(int n) {
            List<String> fizzBuzz=new List<>();
            for(int i=1;i<=n;i++)
            {
                if(i%3==0 && i%5==0)
                    fizzBuzz.add("FizzBuzz");
                else if(i%3==0)
                fizzBuzz.add("Fizz");
                else if(i%5==0)
                    fizzBuzz.add("Buzz");
                else
                    fizzBuzz.add(Integer.toString(i));
            }
            return fizzBuzz;
        }
}
