package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Postagens extends Controller {

	public void form() {
		render();
	}
    public static void listar() {
    	List<Postagem> lista = Postagem.findAll();
        render(lista);
    }
    public static void salvar(Postagem p) {
	   p.save();
	   listar();
   }
   public static void remover(long id) {
	  Postagem rp = Postagem.findById(id);
	  rp.delete();
	  
	  listar();
   }
}