import javax.swing.*;

public class InvokeLaterExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InvokeLaterExample().run("xxx", 555);
            }
        });
    }

    public void run(final String arg, final int ai) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InvokeLaterExample.this.boo(arg, ai);
            }
        });
    }

    void boo(String arg, int ai) {
        zoo(3); // set a breakpoint here
    }

    private void zoo(int a) {
        System.out.println(a);
    }
}