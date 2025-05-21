package jobs;

import java.util.Date;

import models.Postagem;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Inicializador extends Job{
        
	@Override
	public void doJob() throws Exception {
         if(Postagem.count() == 0){
        	 Postagem p1 = new Postagem();
        	 p1.titulo = "ABCD";
        	 p1.autor = "Vítor";
        	 p1.conteudo = "Letras";
        	 p1.data = new Date();
        	 p1.save();
         }
	}
}
