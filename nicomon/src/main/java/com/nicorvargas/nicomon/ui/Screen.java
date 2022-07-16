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
		setResizable(false);

		JButton attack = new JButton("Attack");
		attack.setBounds(550, 480, 100, 50);
		attack.setFont(new Font("Default", Font.PLAIN, 15));
		add(attack);

		JButton bag = new JButton("Bag");
		bag.setBounds(700, 480, 100, 50);
		bag.setFont(new Font("Default", Font.PLAIN, 15));
		add(bag);

		JButton nicomon = new JButton("Nicomon");
		nicomon.setBounds(550, 560, 100, 50);
		nicomon.setFont(new Font("Default", Font.PLAIN, 15));
		add(nicomon);

		JButton forfeit = new JButton("Forfeit");
		forfeit.setBounds(700, 560, 100, 50);
		forfeit.setFont(new Font("Default", Font.PLAIN, 15));
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






