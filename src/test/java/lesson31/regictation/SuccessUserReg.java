package lesson31.regictation;

public class SuccessUserReg {

    private Integer id;
    private String token;
    public SuccessUserReg(){

    }

    public SuccessUserReg(Integer id, String token) {
        this.id = id;
        this.token = token;
    }

    public Integer getId() {
        return id;
    }

    public String getToken() {
        return token;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
