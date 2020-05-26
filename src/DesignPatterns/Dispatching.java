package DesignPatterns;

class Dispatching {

    private RequestHandler1 req1;
    private RequestHandler2 req2;

    public Dispatching(){
        req1 = new RequestHandler1();
        req2 = new RequestHandler2();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("1"))
        {
            req1.display();
        }
         else{
            req2.display();
        }
    }
}
