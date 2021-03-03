package SingerProject;

import java.util.ArrayList;

public class Singers {

    private ArrayList<String> singerList = new ArrayList<>();

    public void PrintSingers(){
        System.out.println("Şarkıcı Listesinde "+singerList.size()+" kadar şarkıcı var.");

        for(int i=0; i<singerList.size(); i++){
            System.out.println((i+1)+" .şarkıcı : "+singerList.get(i));
        }
    }

    public void AddSinger(String name){
        singerList.add(name);
        System.out.println("Şarkıcı listesi güncellendi."); }

    public void UpdateSinger(String newName, int index){
        singerList.set(index,newName);
        System.out.println("Şarkıcı listesi güncellendi."); }

    public void DeleteSinger(int index){
        String name = singerList.get(index);
        singerList.remove(index);
        System.out.println(name+" isimli şarkıcı listeden silindi.");
    }

    public void SearchSinger(String singerName){
        int index = singerList.indexOf(singerName);

        if (index>=0){
            System.out.println("Şarkıcı bulundu. "+singerName+" isimli şarkıcı "+(index+1)+" .sırada.");
        }else {
            System.out.println("Şarkıcı bulunamadı.");
        }
    }
}
