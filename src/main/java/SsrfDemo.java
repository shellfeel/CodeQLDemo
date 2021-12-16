import utils.CommonRequest;


public class SsrfDemo {

    private String request(String url){
        return CommonRequest.request(url);
    }

    public String get(String url){
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
        String url = "https://www.baidu.com";
        System.out.println( new SsrfDemo().get(url));
    }

}
