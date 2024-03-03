package ArrayBalok;

public class arrayBalok {
    public static void main(String[] args) {
        balok[] arrbal= new balok[3];
        arrbal[0]=new balok(100, 30, 12);
    arrbal[1]=new balok(120, 40, 15);
    arrbal[2]=new balok(210, 50, 25);
    
    for (int i =0; i < 3; i++)
    {
       System.out.println("volume balok ke "+ i +": "+ arrbal[i].hitungVolume()); 
    }}
}
