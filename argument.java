public class argument{
	public static void main(String[] args){
		int count,i=0;
String str;
count=args.length;
System.out.println("length of args="+count);
while (i<count){
str=args[i];
System.out.println(str+",");
}
}
}