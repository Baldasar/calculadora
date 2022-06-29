package principal;

import java.awt.AWTException;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class Menu {

	public Menu() {
		SystemTray sTray = SystemTray.getSystemTray();
		if (SystemTray.isSupported()) {
			PopupMenu menu = new PopupMenu();
			
			MenuItem miCalculo = new MenuItem("Cálculo");
			miCalculo.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new CalculoWindow();
				}
			});
			MenuItem miSair = new MenuItem("Sair");
			miSair.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			
			menu.add(miCalculo);
			menu.addSeparator();
			menu.add(miSair);
			
			TrayIcon tray = new TrayIcon(new ImageIcon("icone.png").getImage());
			
			tray.displayMessage("Avaliação 3", "Lucas Baldasar", MessageType.INFO);
			tray.setToolTip("Avaliação 3 - Lucas Baldasar");
			tray.setPopupMenu(menu);
			
			try {
				sTray.add(tray);
			} catch (AWTException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new Menu();
	}

}
