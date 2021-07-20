abstract class shape
{
abstract void color();
abstract void display();
void fun()
{
System.out.print("shape");
}
}
class rectangle extends shape
{
void color()
{
System.out.println("red");
}
void display()
{
System.out.print("blue");
}
}
class Abstract
{
public static void main(String a[])
{
shape obj=new rectangle();
obj.color();
obj.display();
obj.fun();
}
}
