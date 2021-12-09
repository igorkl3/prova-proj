public class menu {

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class menu {

    @FXML
    private Button campoCancelar;

    @FXML
    private TextField campoNome;

    @FXML
    private Button campoSalvar;

    @FXML
    private TextField campoSobrenome;

    @FXML
    void salvar(ActionEvent event) {
        String nome = campoNome.getText();
        String sobrenome = campoSobrenome.getText();

    if (nome.equals(campoSalvar)&&(sobrenome.equals(campoSalvar)){
        System.out.println("nome salvo!!");
    }else if(nome.equals(campoCancelar){
        System.out.println("cancelou");
        Runtime.getRuntime().exit(campoCancelar);
    }

}

}
