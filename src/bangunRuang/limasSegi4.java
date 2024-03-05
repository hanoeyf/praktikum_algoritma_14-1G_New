package bangunRuang;

public class limasSegi4 {
    public double sisiAlas;
    public double tinggiLimas;
    public limasSegi4(double s, double t)
    {
       sisiAlas=s;
       tinggiLimas=t;
    }
    public double hitungLuasAlas()
    {
       return (sisiAlas * sisiAlas ) + (4 * (sisiAlas* tinggiLimas)/2);
    }
    public double hitungVolume()
    {
       return (1/3)* (sisiAlas*sisiAlas)*tinggiLimas;
    }
}

