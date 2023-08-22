import java.security.MessageDigest;

import javax.lang.model.element.QualifiedNameable;

public class Horario
{
    private byte hora, minuto, segundo;
        
      

    public /*void*/ Horario (byte hora, byte minuto, byte segundo) throws Exception
    {
        
        if(hora< 0 || hora > 23){
            throw new Exception("invalido");
        }
        if(minuto< 0 || minuto> 60){
            throw new Exception("invalido");
            
        }
        if(segundo< 0 || segundo> 60){
            throw new Exception("invalido"); 
        }
        
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

    }
   
    

    public void avance (short qtdSegundos) throws Exception{
        if (qtdSegundos<= 0 ){
            throw new Exception("Defina segundos validos para avançar");
            }
        this.segundo = (byte) (qtdSegundos + this.segundo);

        if(this.segundo >= 60){
            this.segundo = (byte) (this.segundo % 60);
            this.minuto += this.segundo / 60;
        } 
        

        
    }

    public void retroceda (short qtdSegundos) throws Exception
    {
    if (qtdSegundos <= 0){
        throw new Exception("Defina segundos válidos");
    }
    
    this.segundo = (byte) (this.segundo - qtdSegundos);
    if (qtdSegundos > 60){
        this.segundo = (byte) (this.segundo % 60);
        this.minuto -= this.segundo / 60;
        
    }

    }
    
    public byte getHora (){
        return (byte) this.hora;

    }
    public byte getMinuto (){
        return (byte) this.minuto;
    }
    public byte getSegundo (){
        return (byte) this.segundo;
    }

}
