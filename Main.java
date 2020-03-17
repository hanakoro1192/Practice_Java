class Animal{
    //問題8-1-3
    //フィールドの設定
    public String Name = "くまさん軽自動車"; 
    public int Age = 100;

    //メソッド
    public void ShowProfile(){
        System.out.println("名前は" + Name + "," + Age + "歳です");
    }

    public void Speak(){
        System.out.println("......");
    }
}

//問題8-１-1
class Cat extends Animal{
    public String Name = "くまさんのねこ";
    public int Age = 20;

    //問題8-１-1
    //メソッドの呼び出し
    public void Sleep(){
        System.out.println("スースー");
    }

    @Override
    public void Speak(){
        System.out.println("ニャー");
    }
}

//問題8-２-1
class Dog extends Animal{

    //問題8-２-3
    public String Name = "くまさんの犬";
    public int Age = 15;

    //問題8-２-1
    public void Run(){
        System.out.println("トコトコ");
    }

    @Override
    public void Speak(){
        System.out.println("ワンワン");
    }
}

//ここを使って呼び出す
public class Main{
    public static void main(String[] args){ //メソッドの作成
        //問題8-1-2
        // Cat cat = new Cat();
        // cat.Sleep();

        //問題8-1-4
        // Animal animal = new Animal();
        // animal.ShowProfile();


        //問題8-２-2
        //継承しているのでCatとDogを用いる
        Cat kumasan_cat = new Cat();

        //問題8-２-4
        kumasan_cat.ShowProfile();

        //問題8-２-5
        kumasan_cat.Sleep();

        //問題8-3-1
        Cat kumasan_cat1 = new Cat();

        //問題8-3-4
        kumasan_cat1.Speak();

        //問題8-２-2
        Dog dog = new Dog();

        //問題8-２-4
        dog.ShowProfile();

        //問題8-２-6
        dog.Run();

        //問題8-3-1
        Dog kumasanDog = new Dog();

        //問題8-3-4
        kumasanDog.Speak();

        //問題8-4-1
        Animal[] animal = new Animal[4];
        //問題8-4-2
        animal[0] = new Cat();
        animal[2] = new Cat();

        //問題8-4-3
        animal[0].Speak();
        animal[2].Speak();

        //問題8-4-2
        animal[1] = new Dog();
        animal[3] = new Dog();

        //問題8-4-3
        animal[1].Speak();
        animal[3].Speak();







    }
}