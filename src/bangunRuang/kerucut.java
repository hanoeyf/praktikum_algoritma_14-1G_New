package bangunRuang;

public class kerucut {
    public double jari2;
     public double sisiMiring;
     public kerucut(double j, double s)
     {
        jari2=j;
        sisiMiring=s;
     }
     public double hitungLuasAlas()
     {
        return Math.PI * jari2 *(jari2 + sisiMiring);
     }public double hitungVolume()
     {
        return (1/3)* Math.PI * jari2* jari2* sisiMiring;
     }
}

   