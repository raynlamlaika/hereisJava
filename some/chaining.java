

// about the chaining in java
/*
    chaining is -> is method to invoking methods class in OOP
    condesing ode into less lines

    there is severa type of chainig 
    1. Chained assignment
    2. Method (function) chaining
    3. Operator chaining
        -Stream operator chaining
        -Arithmetic operator chaining
    4. Subscript chaining
    5. Pointer-like chaining
    6. Extraction chaining
    7. Logical chaining
    8. Comparison chaining (limited in C++)
    9. Proxy-object chaining
    10. Fluent interface chaining



    java not give access like c++ so lot of this chaining consepte we can not perform  by our hand
    instead we user the all ready implemented ones
*/
class Main
{





    public static void main(String arg[])
    {
        // System.out.println("test");
        String  name = "ray";
        // name = name.concat("ray");
        // name = name.toUpperCase();
        // here where we can perform chaining  we have multiple methods calls

        name =  name.concat("rayy").toUpperCase(); // in java this is the method chining
        System.out.println(name);



        // chaining assignment is all ready impplemented
        String n, i , o;
        i = n = o = name ;
        // System.out.println(i[1]); cant perfrm this

        // also the same thing about the operator chaining  a+b+c or i stream a << c << b but in java therey in no 
        // acess to overload operators is likt int a[][] = new  int [9][8],  we can acess the a[1][2]



    }

}