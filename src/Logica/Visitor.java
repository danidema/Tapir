package Logica;

import java.awt.geom.Area;
import javax.swing.JLabel;

public abstract class Visitor
{
	public void visitarEnemigoAlpha(Alpha alpha){}
	
	public void visitarEnemigoBeta(Beta beta){}
	
	public void visitarPlayer(Player player){}
	
	public void visitarProyectilArmaSanitaria(ProyectilArmaSanitaria proyectil){}
	
	public void visitarPremioPocion(PocionEspecial premio){}
	
	public void visitarPremioCuarentena(EfectoCuarentena efecto){}
	
	public void visitarPremioSuperArma(EfectoSuperArmaSanitaria efecto) {}

	public boolean intersects(JLabel labelA, JLabel labelB){
	    Area areaA = new Area(labelA.getBounds());
	    Area areaB = new Area(labelB.getBounds());

	    return areaA.intersects(areaB.getBounds2D());
	}
}