package Graphe;

public class Arrete {
    private final Sommet _1;
    private final Sommet _2;
    
    public Arrete(Sommet _1,Sommet _2){
        this._1=_1;
        this._2=_2;
    }
    public Sommet get_1(){
        return _1;
    }
    public Sommet get_2(){
        return _2;
    }
    @Override
    public int hashCode(){
        return _1.getNumero()*7+_2.getNumero()*5;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Arrete arrete = (Arrete) obj;
        return (this._1.equals(arrete._1) && this._2.equals(arrete._2)) ||
                (this._1.equals(arrete._2) && this._1.equals(arrete._2));
    }
}
