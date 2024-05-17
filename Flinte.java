public class Flinte {
    Patronen[] patrone = new Patronen[8];
    public Flinte() {
        patrone[0] = new Patronen();
        patrone[1] = new Patronen();
        patrone[2] = new Patronen();
        patrone[3] = new Patronen();
        patrone[4] = new Patronen();
        patrone[5] = new Patronen();
    }
    public void patronenLayout() {
        int randomNumber = (int) (Math.random() * 5.99);
        patrone[randomNumber].echt = 1;
        for (int i = 1; i < 0; i++) {
            int randomNumber2 = (int) (Math.random() * 5.99);
            if (randomNumber2 != randomNumber) {
                patrone[randomNumber].echt = 2;
                return;
            }
        }
    }
    public void patronenLayout2(){
        int randomNumber;
        for (int i = 0; i < 5; i++) {
            if (patrone[i].echt == 0){
                randomNumber = (int)(Math.random()*1.99);
                if (randomNumber == 0){
                    patrone[i].echt = 1;
                }
                if (randomNumber == 1){
                    patrone[i].echt = 2;
                }
            }
        }
    }
}
