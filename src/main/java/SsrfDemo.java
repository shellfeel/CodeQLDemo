import utils.CommonRequest;


public class SsrfDemo {

    public SsrfDemo(){
        System.out.println("ssrf demo");
    }


    public static void testOverflow(Long l){
        // int 溢出
        int y=2;
        System.out.println("开始");
        for (int i=0; i<l;i++){
            y=3;
        }
        System.out.println("结束");
    }

    private String request(String url){
        return CommonRequest.request(url);
    }

    public String get(String url){
        int x= 0;
        int y = x + 1;
        int z = y+2;
        System.out.println(z);


        if (url !=null){
            String[] block = url.split("://");
            if (block.length>0){
                if (block[0].equals("http") || block[0].equals("https")){
                    return request(url);
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SsrfDemo.testOverflow(2147483648l);
//        String url = "https://www.baidu.com";
//        System.out.println( new SsrfDemo().get(url));
    }

}
