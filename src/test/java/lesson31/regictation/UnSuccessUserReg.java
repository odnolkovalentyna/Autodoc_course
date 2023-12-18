package lesson31.regictation;

public class UnSuccessUserReg {

    private Integer id;
    private String error;
    public UnSuccessUserReg(){

    }

    public UnSuccessUserReg(Integer id, String token) {
        this.id = id;
        this.error = token;
    }

    public Integer getId() {
        return id;
    }

    public String getError() {
        return error;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setError(String token) {
        this.error = token;
    }
}
