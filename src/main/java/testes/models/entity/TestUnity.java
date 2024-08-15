package testes.models.entity;

public class TestUnity {
    private String name;
    private String email;
    private String senha;
    private float temperatura;


    TestUnity(String name, String email, String senha, float temperatura){
        this.temperatura = temperatura;
        this.email = email;
        this.senha = senha;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public float getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    

}
