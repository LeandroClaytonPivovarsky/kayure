package testes.models.repositories;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestUnityRepository {
    
    String regexEmail ="^[\\\\w!#$%&'*+/=?`{|}~^-]+
    (?:\\\\.[\\\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[
    a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}";


    public boolean criaUnidade(String nome, String email, String senha, float temperatura) {
        Pattern patternEmail = Pattern.compile(regex);
        Matcher matcherEmail = patternEmail.matcher(email);
        if (!matcherEmail.matches()) {
            return matcherEmail.matches();
        }

        if (senha < 6) {
            boolean foundNumber = false;
            boolean foundCapitalLetter = false;
            boolean foundSpecialCharacter = false
            for(int i = 0; i < nome.length(); i++){
                if (Character.isDigit(nome.charAt(i))) {
                    foundNumber = true;
                }
                if (Character.isUpperCase(nome.charAt(i))) {
                    foundCapitalLetter = true;
                }
                if (!Character.isDigit(nome.charAt(i)) && 
                !Character.isLetter(nome.charAt(i))
                !Character.isWhitespace(nome.charAt(i))) {
                    foundSpecialCharacter = true;
                }
            }

            if (!foundSpecialCharacter ||
                !foundNumber ||
                !foundSpecialCharacter) {
                return false;
            }
        } else {
            return false;
        }


        
        

    }
}
