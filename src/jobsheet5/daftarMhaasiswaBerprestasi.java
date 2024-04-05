package jobsheet5;

public class daftarMhaasiswaBerprestasi {
    namaMahasiswa listMhs[]= new namaMahasiswa[5];
    int idx;
    double ipk;
    void tambah (namaMahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx]=m;
            ipk=m.ipk;
            idx++;
        }else{
            System.out.println("data sudah penuh !!");
        }
    }
    void tampil(){
        for(namaMahasiswa m : listMhs){
            m.tampil();
            System.out.println("----------------------------");

        }}
        void bubleSort(){
            for (int i = 0; i < listMhs.length-1; i++) {
                for (int j = 0; j < listMhs.length-i-1; j++) {
                    if (listMhs[j].ipk<listMhs[j+1].ipk){
                        namaMahasiswa tmp = listMhs[j];
                        listMhs[j]=listMhs[j + 1];
                        listMhs[j + 1] = tmp;
                    }
                }
            }
        }
    }
