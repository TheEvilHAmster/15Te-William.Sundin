import java.util.Scanner;

public class KryptoLite {

static int sizeX, sizeY;

public static void main(String[] args) {
// TODO Auto-generated method stub

System.out.println("Skriv in storleken p� ditt korsord!");
// L�s in antal rader i kryptot
System.out.print("Rader: ");
Scanner in = new Scanner(System.in);	
sizeY = in.nextInt();
System.out.print("Kolumner: ");
sizeX = in.nextInt();
// Skapa korsordet
int[][] korsord = new int[sizeX][sizeY];
// Stoppa in siffror i korsordet:
System.out.println("Skriv in en rad med siffror, avsluta med ENTER");
for (int y=0; y < sizeY; y++){
for (int x=0; x < sizeX; x++){
System.out.print("Skriv in siffra p� rad "+y+":"+"plats"+x+":");
korsord[x][y] = in.nextInt();
}
}
// Skriv ut korsordet
System.out.println("Korsordet ser ut s� h�r:");
for(int y=0; y < sizeY; y++){
for(int x=0; x < sizeX; x++){
System.out.print(korsord[x][y]+ " ");
}
System.out.println();
}
}
}