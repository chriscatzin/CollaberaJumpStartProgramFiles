package com.logicbig.example;

import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;

public class treeView {
    public static void main(String[] args) {
        Hashtable<?, ?> projectHierarchyMap =
                createTree.instance.getProjectHierarchy();
        JTree tree = new JTree(projectHierarchyMap);
        JFrame frame = createFrame();
        frame.add(new JScrollPane(tree));
        frame.add(createTopPanel(tree), BorderLayout.NORTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static JComponent createTopPanel(JTree tree) {
        JPanel panel = new JPanel();
        JButton expandBtn = new JButton("Expand All");
        expandBtn.addActionListener(ae-> {
            JTreeUtil.setTreeExpandedState(tree, true);
        });
        panel.add(expandBtn);
        JButton collapseBtn = new JButton("Collapse All");
        collapseBtn.addActionListener(ae-> {JTreeUtil.setTreeExpandedState(tree, false);});
        panel.add(collapseBtn);
        return panel;
    }

    private static JFrame createFrame() {
        JFrame frame = new JFrame("TreeView using Swing!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 400));
        return frame;
    }
}