import java.util.*;
class Node{
protected int regd_no;
protected float mark;
protected Node next;
}
public class Linkedlist{
static Node start=null;
public static void create(){
Scanner sc=new Scanner(System.in);
Node p;
Node q=null;
int ch;
do{
p=new Node();
System.out.println("Enter registration number: ");
p.regd_no=sc.nextInt();
System.out.println("Enter marks number: ");
p.mark=sc.nextInt();
p.next=null;
if(start == null){
start = p;
q = p;
}
else{
q.next=p;
q = p;
}
System.out.println("Do you want to create more number of nodes(y/n)");
ch=sc.next().charAt(0);
}while(ch=='y' || ch=='Y');
}
public static void display(){
Node p=start;
if(start == null){
System.out.println("empty linked list");
}
else{
System.out.println("*******Node details********* \nReg.no --- marks");
while(p!=null){
System.out.println(p.regd_no+"---------"+p.mark);
p=p.next;
}
}
}
public static void InsBeg(){
Scanner sc=new Scanner(System.in);
Node p=new Node();
System.out.println("Enter registration number: ");
p.regd_no=sc.nextInt();
System.out.println("Enter marks number: ");
p.mark=sc.nextInt();
p.next = start;
start = p;
}
public static void InsEnd(){
Scanner sc=new Scanner(System.in);
Node p=new Node();
System.out.println("Enter registration number: ");
p.regd_no=sc.nextInt();
System.out.println("Enter marks number: ");
p.mark=sc.nextInt();
p.next = null;
if(start == null){
start = p;
}
else{
Node q = start;
while(q.next!=null){
q = q.next;
}
q.next = p;
}
}
public static void DelBeg(){
if(start==null){
System.out.println("Empty linkedlist");
}
else{
Node p = start;
start = start.next;
System.out.println("Delete node information\nReg.no --- marks");
System.out.println(p.regd_no+"---------"+p.mark);
}
}
public static void DelEnd(){
if(start==null){
System.out.println("Empty linkedlist");
}
else{
Node p = start;
Node q = start;
while(p.next!=null){
q = p;
p = p.next;
}
q.next = null;
System.out.println("Delete node information\nReg.no --- marks");
System.out.println(p.regd_no+"---------"+p.mark);
}
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(true){
System.out.println("\n****MENU*****");
System.out.println("0:Exit");
System.out.println("1:Creation");
System.out.println("2:Display");
System.out.println("3:Insert new node at the beginning");
System.out.println("4:Insert new node at the end");
System.out.println("6:Delete a new node from first");
System.out.println("7:Delete a new node from last");
int choice=sc.nextInt();
switch(choice){
case 0:System.exit(0);
case 1:create();break;
case 2:display();break;
case 3:InsBeg();break;
case 4:InsEnd();break;
case 5:DelBeg();break;
case 6:DelEnd();break;
default: System.out.println("Wrong choice");
 }
}
}
}
