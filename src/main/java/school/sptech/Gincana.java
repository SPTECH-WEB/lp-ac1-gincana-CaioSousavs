package school.sptech;

public class Gincana {
    private String nome;
    private Double premio;
    private Integer qtdInscrito;
    private Boolean ativa;

    public Gincana(String nome, Double premio){
        this.nome = nome;
        this.premio = premio;
        qtdInscrito = 0;
        ativa = true;
    }
    public void inscrever(Integer qtd){
        if(qtd != null && qtd > 0 && ativa != null && ativa){
            qtdInscrito +=qtd;
        }
    }
    public Integer remover(Integer qtd){
        if(qtd != null && qtd > 0 && qtd < qtdInscrito && ativa != null && ativa){
            qtdInscrito -= qtd;
            return qtd;
        }else{
            return null;
        }
    }
    public Integer desativar(){
        if(ativa != null && !ativa){
            return null;
        }else{
            ativa = false;
            Integer qtdAnteiror = qtdInscrito;
            qtdInscrito = 0;
            return  qtdAnteiror;
        }
    }
    public void transferir(Gincana destino, Integer qtdATransferir){

        if(destino.ativa != null && destino.ativa && ativa != null && ativa && qtdATransferir != null && qtdATransferir > 0     && qtdATransferir <= destino.qtdInscrito){

            qtdInscrito -= qtdATransferir;
            destino.qtdInscrito += qtdATransferir;

        }
    }
    public Boolean reajustarPremio(Double reajuste){
        if(reajuste != null && reajuste > 0){
            premio *= (1.0 + reajuste);
            return true;
        }else {
            return false;
        }
    }

    public String getNome() {
        return nome;
    }
    public Double getPremio(){
        return premio;
    }
    public Integer getQtdInscrito(){
        return qtdInscrito;
    }
    public Boolean getAtiva(){
        return ativa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
