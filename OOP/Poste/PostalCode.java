public abstract class PostalCode{

    protected String code;

    PostalCode(){

    }

    PostalCode(String code){
        this.code = code;
    }

    public abstract boolean isValid();

    public String getCode(){
        return this.code;
    }
}