import java.io.IOException;
import java.text.ParseException;

class Test {
    public static void main(String[] args) {
        try{
            Test test = new Test();
            try{
                test.f();
                test.g();
                System.out.println(test.x);
                test.f();
                System.out.println(test.x);
            }
            catch(ParseException e) {
                System.out.println("ParseException 1");
            }
            catch(IOException e) {
                System.out.println("IOException 1");
                throw new IOException();
            }
            finally {
                System.out.println("finally 1");
            }
            System.out.println("done1");

        } catch(IOException e) {
            System.out.println("IOException 2");
        }
        finally {
            System.out.println("finally 2");
        }

        System.out.println("done 2");
    }


    int x = 0;

    public void g() throws ParseException {

    }

    public void f() throws IOException {
        if(x == 1)
            throw new IOException();

        ++x;
    }
}