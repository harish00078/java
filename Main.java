public class Main{
    public static void main(String[] args) {
        //write code here
        System.out.println("hello world"); // println = ln represent here to jump on next line 
        System.out.println("my name is harish");
        /*
         * variables
         * just like:
         * for water - webucket
         * for store masala - we use boxes
         * for storing lunch - we use lunchbox
         * In java:
         * variables are contains which store data values:
         * string ex("string"),int ex(1,2,3),float ex(0.1,0.2),char ex('harish'),boolean ex(true,false)
         * 
         * # how to declare variables:
         * syntax - <datatype> <variableName> = value;
         */
        String name = "Harry";
        System.out.println(name);
        
        int a = 45, x=56, y=67;
        char grade = 'a';
        float b = 45.22f; // In java we have define the float value by writing a (f) with the value.
        
        boolean isadult = false;
        System.out.println(a);
        System.out.println(x);
        System.out.println(y);

        System.out.println(grade);

        System.out.println(b);
        
        System.out.println(isadult);

        /*
         * rules for constructing name of variables in java
         * 1. can contain digits, underscore, dollar signs, letters
         * 2. should begin with a letter, $ or _
         * 3. java is case sensitive language which means that harry and Harry are two different variables altogether        
         * 4. should not contain whitespaces -> already know about \n ,\t ,\r and space.
         * 5. you cannot use reserved keywords from java. example of the reserved keyword in java is 
         *  function java() {
            alert("This function can not be called");
            }
         * */


         /*
          * in java we have a two types of data types:
          1. primitive data types  --> (define = primitive data typese are those data types who are already define) In primivite data types we have a limitation.( because we can only stores data in primitive data types acc to there types and there range(range means how much we can go -ve to how much positive we can go + ve))
            => the primitive data types are:
            a. byte = only have one byte(1byte) => range of byte(-128 to +127 this means we can only stores negative 128 to positive 128 numbers in bytes)
            b. short = only have two bytes(2bytes)
            c. int = only have four bytes(4bytes)
            d. long = only have eight bytes(8bytes)
            e. float = only have four bytes(4bytes)
            f. double = only have eight bytes(8bytes)
            g. boolean = only have on bit(1bit)
            h. char = only have two bytes(2bytes)

          2. non - primitive or reference data types  --> (define = non primitive data types those who are not already define.we have d to define them with our self)
            -> defination =  Non-primitive data types or reference data types refer to instances or objects. They cannot store the value of a variable directly in memory. They store a memory address of the variable. Unlike primitive data types, which are defined by Java, non-primitive data types are user-defined. They are created by programmers and can be assigned with null. All non-primitive data types are of equal size.
            -> example of non primitive data type are or we can use these types as non primitive data types:
            a. string
            b. array
            c. interfaces
            d. enum
            e. class


          */


          //examples of primitive data types:
        // 1. byte
        //byte u = 156; (we did not store the 150 in byte because byte have limitation of range -128 to +127)
        double d = 45.64545456d;
        System.out.println(d);
        char character = 'b';
        System.out.println(character);
        //System.out.println(u);
        // soon other types of primitive data types  are also working like byte.



    }
}