package ru.mirea.task9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MatchsTable extends JFrame{
    public int i = 0;
    JFrame frame = new JFrame();
    JButton button1 = new JButton("Real Madrid");
    JButton button2 = new JButton("AC Milan");
    JLabel l1 = new JLabel("Result: 0x0");
    JLabel l2 = new JLabel("LastScore: ");
    public MatchsTable(){
        super("Football Match");
        JPanel[] pnl = new JPanel[6];
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,2));
        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            pnl[i].setBackground(Color.orange);
            frame.add(pnl[i]);
        }
        pnl[4].setLayout(new BorderLayout());
        pnl[4].add(button1, BorderLayout.SOUTH);
        pnl[5].setLayout(new BorderLayout());
        pnl[5].add(button2, BorderLayout.SOUTH);
        pnl[1].add(l1);
        pnl[3].add(l2);
        Class ob = new Class(0,0);
        int k = (int) (Math.floor(Math.random() * (10 - 3)) + 3);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Do what you like here after button is clicked, for example:
                if(ob.i<k && ob.j < k)
                {
                    ob.i ++;
                    l1.setText("Result:"+ob.i+"x"+ob.j);
                }
                else
                {
                    l1.setText("LastScore: "+ob.i + "/" + ob.j);
                    if(ob.i>ob.j)
                        l2.setText("Winner: "+"Real Madrid");
                    else
                        l2.setText("Winner: "+"AC Milan");
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Do what you like here after button is clicked, for example:
                if(ob.j < k && ob.i<k)
                {
                    ob.j ++;
                    l1.setText("Result:"+ob.i+"x"+ob.j);
                }
                else
                {
                    l1.setText("LastScore: "+ob.i + "/" + ob.j);
                    if(ob.j>ob.i)
                        l2.setText("Winner: "+"AC Milan");
                    else
                        l2.setText("Winner: "+"Real Madrid");
                }

            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MatchsTable ob = new MatchsTable();
    }
}