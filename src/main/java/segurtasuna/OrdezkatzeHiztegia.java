package segurtasuna;

public class OrdezkatzeHiztegia {

    private String gakoa = "ZXCVBNMASDFGHJKLQWERTYUIOP";
    private String hiztegia = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String zifratu(String mezua) {
        int it = 0;
        boolean aurkitua = false;
        StringBuilder gakosekretu= new StringBuilder();
        char hizkisekretua;
        for (int i = 0; i < mezua.length(); i++) {
            char hizkia = mezua.charAt(i);
            while (it < hiztegia.length() && !aurkitua) {
                char aux = hiztegia.charAt(it);
                if (aux == hizkia) {
                    aurkitua = true;
                } else {
                    it = it + 1;
                }
            }
            if (aurkitua){
                hizkisekretua = gakoa.charAt(it);
                aurkitua=false;
            }
            else {
                hizkisekretua = ' ';
            }
            gakosekretu.append(hizkisekretua);
            it=0;
        }
        return gakosekretu.toString();
    }

    public String deszifratu(String kripto){
        int it = 0;
        boolean aurkitua = false;
        StringBuilder gakosekretua= new StringBuilder();
        char hizkisekretua;
        for (int i = 0; i < kripto.length(); i++) {
            char hizkia = kripto.charAt(i);
            while (it < gakoa.length() && !aurkitua) {
                char aux = gakoa.charAt(it);
                if (aux == hizkia) {
                    aurkitua = true;
                } else {
                    it = it + 1;
                }
            }
            if (aurkitua){
                hizkisekretua = hiztegia.charAt(it);
                aurkitua=false;
            }
            else {
                hizkisekretua = ' ';
            }
            gakosekretua.append(hizkisekretua);
            it=0;
        }
        return gakosekretua.toString();
    }
}



