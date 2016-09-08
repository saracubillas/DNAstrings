
public class findGene {
    public String findProtein(String dna) {
        int start = dna.indexOf("atg");
        if (start == -1){
            return "";
        }
        int stop = dna.indexOf("tag", start + 3);
        if ((stop - start) % 3 == 0) {
            return dna.substring(start, stop + 3);
        } else {
            return "";
        }
    }
}
