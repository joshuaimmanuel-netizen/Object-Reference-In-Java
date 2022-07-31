//                                                                  object reference java

class a{
    int b;
}
class Main{
    public static void main(String[] args){
        a w=new a();
        w.b=100;
        a z=new a();
        z.b=100;
        if(w==z)
        System.out.println("same");
        else
        System.out.println("not same");
        z=w;
        if(w==z)
        System.out.println("same");
        else
        System.out.println("not same");
    }
}