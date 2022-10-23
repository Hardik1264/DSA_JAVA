class Selection {
public static void main(String [] args){

int i,j,k;

int [] a = {1,5,4,2,3};
int swap = 0;
int comp = 0;
int max;
long start , end;

start = System.nanoTime();

for (i=0; i<a.length-1; i++){
  for (j=i,k=i; j<a.length; j++){
    comp++;
    max=i;
  if(a[j]<a[k]){
     k=j;
     max=j;
  }
}
swap++;
  int temp = a[i];
  a[i] = a[k];
  a[k] = temp;
}

end = System.nanoTime();

System.out.println(end - start );
System.out.println("swap : "+swap );
System.out.println("compare: "+comp);
for(i=0; i<a.length; i++){
System.out.print(a[i]+" " );
}
}

}




