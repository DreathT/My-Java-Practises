import java.util.*;

interface Enstruman {
    void cal (List<Integer> notalar);
}
abstract class TusluEnstruman implements Enstruman{
    protected int tusSayisi;
}
public class Piano extends TusluEnstruman {
    String[] notalar;
    Dictionary<Integer, String> notaIndex;

    public Piano(int tusSayisi) {
        this.tusSayisi = tusSayisi;
        notalar = new String[]{"C", "C#", "D", "D#", "E", "F", "F#", "G", "Ab", "A", "Ab", "B"};
        notaIndex = new Hashtable<>();
        for (int i = 27; i < 35; i++) notaIndex.put(i, notalar[i - 27]);
    }

    @Override
    public void cal(List<Integer> notalar) {
        for (var nota : notalar){
            tusBas(nota);
        }
    }
    private void tusBas(Integer nota){
        System.out.print(notaIndex.get(nota)+"  ");
        }
}
public class Main{
    public static void main(String[] args){
        var notaListesi=new ArrayList<Integer>(Arrays.asList(27,27,29,27,32,31));
        var piano=new Piano(88);
        piano.cal(notaListesi);
    }
}