package segurtasuna;

public class OrdezkatzeHiztegia {

    private String gakoa = "ZXCVBNMASDFGHJKLQWERTYUIOP";
    private String hiztegia = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String zifratu(String mezua) {
        mezua.toUpperCase();
        int it = 0;
        boolean aurkitua = false;
        String gakosekretua=null;
        char hizkisekretua;
        for (int i = 0; i < mezua.length(); i++) {
            char hizkia = mezua.charAt(i);
            while (it < hiztegia.length() && !aurkitua) {
                char aux = hiztegia.charAt(i);
                if (aux == hizkia) {
                    aurkitua = true;
                } else {
                    it = it + 1;
                }
            }
            if (aurkitua){
                hizkisekretua = gakoa.charAt(it);
            }
            hizkisekretua= ' ';
            gakosekretua = gakosekretua + "" + hizkisekretua;
        }
        return gakosekretua;
    }

    public String deszifratu(String kripto){
        kripto.toUpperCase();
        int it = 0;
        boolean aurkitua = false;
        String gakosekretua=null;
        char hizkisekretua;
        for (int i = 0; i < kripto.length(); i++) {
            char hizkia = kripto.charAt(i);
            while (it < gakoa.length() && !aurkitua) {
                char aux = gakoa.charAt(i);
                if (aux == hizkia) {
                    aurkitua = true;
                } else {
                    it = it + 1;
                }
            }
            if (aurkitua){
                hizkisekretua = hiztegia.charAt(it);
            }
            hizkisekretua= ' ';
            gakosekretua = gakosekretua + "" + hizkisekretua;
        }
        return gakosekretua;
    }
}



