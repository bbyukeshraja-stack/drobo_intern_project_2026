import java.util.HashMap;

class phone{
    public static void main(String[] args){
     HashMap<String, String>BrandOrigin= new HashMap<>();
     BrandOrigin.put("Apple","USA");
     BrandOrigin.put("Samsung","South Korea");
     BrandOrigin.put("Nokia","Finland");
     BrandOrigin.put("OnePlus","China");
     BrandOrigin.put("sony","Japan");
     BrandOrigin.put("Google pixel","USA");
      
     System.out.println(BrandOrigin);
     System.out.println(BrandOrigin.get("Samsung"));
    }
}

    

