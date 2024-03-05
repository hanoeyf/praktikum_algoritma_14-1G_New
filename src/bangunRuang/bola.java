package bangunRuang;

public class bola {
    public double jari2;
    public double sisiMiring;
    public bola(double j)
    {
       jari2=j;
    }
    public double hitungLuasAlas()
    {
       return 4* Math.PI * jari2 *jari2;
    }
    public double hitungVolume()
    {
       return (4/3)* Math.PI * jari2* jari2* jari2;
    }

}
