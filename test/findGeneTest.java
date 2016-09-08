import org.junit.Test;

import static org.junit.Assert.*;



public class findGeneTest {
    @Test
    public void findProtein() throws Exception {
        findGene findGene = new findGene();
        String a = "cccatggggtttaaataataataggagagagagagagagagagattt";
        String ap = "atggggtttaaataataatag";
        String result = findGene.findProtein(a);
        if (ap.equals(result)){
            System.out.println("success for " +ap);
        } else {
            System.out.println("mistake for input: " +a);
            System.out.println("got: " + result);
            System.out.println("not:" + ap);
        }
    }

}