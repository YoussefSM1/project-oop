import java.util.Scanner;

public class Cart {
    private int customerId;
    private int nProducts;
    Product[] products;
    
    Scanner sc = new Scanner(System.in);
    
    Cart(){}
    
    Cart(int coustomerId, int nProducts){
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.products = new Product[nProducts];
    }
    
    public void setcustomerId(int custommerId){
        this.customerId = customerId;
    }
    public int getcustomerId(){
        return customerId;
    }
    
    public void setnProducts(int nProducts){
        this.nProducts = nProducts;
    }
    public int getnProducts(){
        return nProducts;
    }
    
    public void addProduct(int n){
                   ElectronicProduct E1 = new ElectronicProduct("Samsung",1,1,"Smartphone",599.99f);
                   ClothingProduct C1 = new ClothingProduct("Medium","Cotton",2,"T-Shirt",19.99f);
                   BookProduct B1 = new BookProduct("O'Reilly","X Publications",3,"OOP",39.99f);
        for(int i = 0; i < n; i++){
            System.out.println("Which product would you like to add? 1- Smartphone 2- T-Shirt 3- OOP");
            int P = sc.nextInt();
            switch(P){
                case 1:
                    products[i] = E1;
                    break;
                case 2:
                    products[i] = C1;
                    break;
                case 3:
                    products[i] = B1;
                    break;
                default :
                    System.out.println("Wrong choose");
                    break;
            }
        }

    }
    public void removeProduct(int m){
       products[m-1] = null;
       
    }
    public double calculatePrice(){
        float sum = 0f;
       for(int i = 0; i < nProducts;i++){
//           Product product = products[i];
//           if(product != null){
               sum += products[i].getprice();
    }
        //}
        return sum;
    }
    public boolean placeOrder(int flag){
        boolean f = true;
        if(flag == 1){
            f = true;
        }else if(flag == 2){
            f = false; 
        }
        return f;
    }
}
