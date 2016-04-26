package Graphe;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class  Graphe{
    protected List<Sommet> sommets;
    protected List<Arrete> arrets;
    private int size=0;
        public int size(){
        return size;
    }
    public Graphe(Graphe g){
        this.sommets.addAll(g.sommets);
        this.arrets.addAll(g.arrets);
    }
    public Graphe(){
        sommets=new LinkedList<>();
        arrets=new LinkedList<>();
    }
    public void ajouterSommet(Sommet s){
        size++;
        sommets.add(s);
        
    }
    public boolean ajouterArret(Arrete a){
        return arrets.add(a);
    }
    public Collection<Sommet> getSommetsEnRelation(Sommet s){
        Collection<Sommet> col=new LinkedList<>();
        Iterator<Arrete> it=arrets.iterator();
        while(it.hasNext()){
            Arrete a=it.next();
            if(s.equals(a.get_1())) col.add(a.get_2());
            else if(s.equals(a.get_2())) col.add(a.get_1());
        }
        return col;
    }
    public Collection<Sommet> getSommets(){
        return sommets;
    }
    public Collection<Arrete> getArrets(){
        return arrets;
    }
    public int degree(Sommet s){
        return this.getSommetsEnRelation(s).size();
    }
    @Override
    public String toString(){
        String tmp="";
        for(int i=0;i<sommets.size();i++){
            tmp+=sommets.get(i);
        }
        return tmp;

    }
}