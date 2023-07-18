package smk.practiceProject.functions;

public class Orders {
//    Items bollu;
   private SmkConsole bollu;
    public Orders(SmkConsole bollu) {
        this.bollu=bollu;
    }


    public void run(){
        System.out.println("Running the Application : .........." + bollu);
        bollu.ItemList();
        bollu.annamGanjulu();
        bollu.Garitelu();
        bollu.ginnelu();
        bollu.Hasthaalu();
        bollu.otherItems();
        bollu.bye();

    }
}
