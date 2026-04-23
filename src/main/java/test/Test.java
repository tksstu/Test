package test; 
 
//import文省略 
 
// http://サーバ名:ポート/プロジェクト名/Question2 のURLにアクセスされたときに呼び出される 
@Servlet(urlPatterns={"/Question2"}) 
public class Question2 extends __(2)__ { 
 
    //Getリクエストでアクセスされたときの処理 
    protected void __(3)__(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException { 
 
        //現在日時を取得 
        Calendar calendar = Calendar.getInstance(); 
        //時刻を取得 
        int hour = calendar.get(Calendar.HOUR_OF_DAY); 
 
        //挨拶文を決定する 
        String greeting = null; 
        if(hour >= 5 && hour <= 10){ 
            greeting = "Good morning!"; 
        }else if(hour <= 16){
        	greeting = "Hello!"; 
        }else{ 
        greeting = "Good evening!"; 
        } 
        //レスポンスの生成 
        response.setContentType("text/plain; charset=UTF-8"); 
        PrintWriter out=__(4)__; 
        out.println(greeting); 
        } 
        } 