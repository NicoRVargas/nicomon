package com.nicorvargas.nicomon.ui;

import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {
	public Screen() {
		setSize(1115, 890);
		setTitle("NICOMON");
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);

		ImageIcon buttonfight = new ImageIcon("D:\\development\\java-progams\\nicomon\\src\\main\\resources\\fightbutton.png");
		ImageIcon buttonforfeit = new ImageIcon("D:\\development\\java-progams\\nicomon\\src\\main\\resources\\forfeitbutton.png");
		ImageIcon buttonbag = new ImageIcon("D:\\development\\java-progams\\nicomon\\src\\main\\resources\\bagbutton.png");
		ImageIcon buttonnicomon = new ImageIcon("D:\\development\\java-progams\\nicomon\\src\\main\\resources\\nicomonbutton.png");

		JButton attack = new JButton();
		attack.setBounds(645, 617, 203, 96);
		attack.setBackground(Color.white);

		JButton bag = new JButton();
		bag.setBounds(645, 717, 203, 96);
		bag.setBackground(Color.white);

		JButton nicomon = new JButton();
		nicomon.setBounds(855, 617, 203, 96);
		nicomon.setBackground(Color.white);

		JButton forfeit = new JButton();
		forfeit.setBounds(855, 717, 203, 96);
		forfeit.setBackground(Color.white);

		attack.setIcon(buttonfight);
		add(attack);

		bag.setIcon(buttonbag);
		add(bag);

		nicomon.setIcon(buttonnicomon);
		add(nicomon);

		forfeit.setIcon(buttonforfeit);
		add(forfeit);


		ImageIcon icon = new ImageIcon("D:\\development\\java-progams\\nicomon\\src\\main\\resources\\icon.png");
		setIconImage(icon.getImage());


		ImageIcon background = new ImageIcon("D:\\development\\java-progams\\nicomon\\src\\main\\resources\\nicomonbackbattleaction.png");
		JLabel label = new JLabel();
		label.setIcon(background);
		label.setBounds(0, 0, 1104, 850);

		add(label);

		revalidate();
		repaint();


	}
}






