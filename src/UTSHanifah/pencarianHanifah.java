package UTSHanifah;

public class pencarianHanifah {
    siswaHanifah arrHanifah[] = new siswaHanifah[6];
    public int findSeqSearchHanifah(int cari) {
        int posisi = -1;
        for (int i = 0; i < arrHanifah.length; i++) {
            if (arrHanifah[i].nisnHanifah.equals(cari) ) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    void bubleSortHanifah(int jmlSiswa, int posisi){
        for (int i = 0; i < arrHanifah.length-1; i++) {
            for (int j = 0; j < arrHanifah.length-1; j++) {
                if (arrHanifah[j].nilaiHanifah > arrHanifah[j+1].nilaiHanifah){
                    siswaHanifah tmp = arrHanifah[j];
                    arrHanifah[j]=arrHanifah[j + 1];
                    arrHanifah[j + 1] = tmp;
                }
            }
        }
    }
}
