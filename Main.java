class Animal{
    //問題8-1-3
    //フィールドの設定
    public String Name;
    public int Age;

    //コンストラクタの設定
    public Animal(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }


    //メソッド
    public void ShowProfile(){
        System.out.println("名前は" + Name + "," + Age + "歳です");
    }

    public void Speak(String name, int age){
        System.out.println(name + age);
    }
}

//問題8-１-1
class Cat extends Animal{

    //フィールドは前に引用しているため省略

    //コンストラクタの設定
    public Cat(String Name, int Age){
        //NameとAgeはAnimalで引用している
        super(Name, Age);
    }

    //問題8-１-1
    //メソッドの呼び出し
    public void Sleep(){
        System.out.println("スースー");
    }

    @Override
    public void Speak(String name, int age){
        System.out.println(name + age);
    }
}

//問題8-２-1
class Dog extends Animal{

    //フィールドは前に引用しているため省略

    //コンストラクタの設定
    public Dog(String Name, int Age){
        super(Name, Age);
    }

    // //問題8-２-3
    // public String Name = "くまさんの犬";
    // public int Age = 15;

    //問題8-２-1
    public void Run(String name){
        System.out.println("トコトコ" + name);
    }

    @Override
    public void Speak(String name, int age){
        System.out.println(name + age);
    }
}

//ここを使って呼び出す
public class Main{
    public static void main(String[] args){ //メソッドの作成

        //コマンドライン引数から入力した文字列をAnimalクラスのNameに設定してください


        // 問題8-1-2
        Cat cat = new Cat("くまさんのくまさん", 10);
        cat.Sleep();

        // 問題8-1-4
        Animal animal = new Animal("くまさん軽自動車", 15);
        animal.ShowProfile();


        //問題8-２-2
        //継承しているのでCatとDogを用いる
        Cat kumasan_cat = new Cat("くまさんのねこ", 10);

        //問題8-２-4
        kumasan_cat.ShowProfile();

        //問題8-２-5
        kumasan_cat.Sleep();

        //問題8-3-1
        Cat kumasan_cat1 = new Cat("くまさんの昼食", 10);
        kumasan_cat1.Name = "うんこ";
        kumasan_cat1.Age = 900;

        //問題8-3-4
        //ここの中身は変更なし
        kumasan_cat1.Speak(kumasan_cat1.Name, kumasan_cat1.Age);

        //問題8-２-2
        Dog dog = new Dog("くまさんの犬", 100);

        //問題8-２-4
        dog.ShowProfile();

        //問題8-２-6
        dog.Run("くまさん");

        //問題8-3-1
        Dog kumasanDog = new Dog("くまさんの犬", 100);

        //問題8-3-4
        kumasanDog.Speak(kumasan_cat1.Name, kumasan_cat1.Age);

        //問題8-4-1
        Animal[] animals = new Animal[4];
        //問題8-4-2
        animals[0] = new Cat("くまさんのねこ", 10);
        animals[2] = new Cat("くまさんのねこ", 10);

        //問題8-4-3
        animals[0].Speak(kumasan_cat1.Name, kumasan_cat1.Age);
        animals[2].Speak(kumasan_cat1.Name, kumasan_cat1.Age);

        //問題8-4-2
        animals[1] = new Dog("くまさんの犬", 100);
        animals[3] = new Dog("くまさんの犬", 100);

        //問題8-4-3
        animals[1].Speak(kumasan_cat1.Name, kumasan_cat1.Age);
        animals[3].Speak(kumasan_cat1.Name, kumasan_cat1.Age);
    }
}