package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

public class DW3 implements ThreadFactory {
    public final int A00;
    public final String A01;

    public DW3(String str, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = str;
                return;
            default:
                this.A01 = str;
                return;
        }
    }

    public Thread newThread(Runnable runnable) {
        int i = this.A00;
        String str = this.A01;
        switch (i) {
            case 0:
                return new Thread(runnable, str);
            case 1:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(3);
                return thread;
            default:
                Executor executor = AnonymousClass10J.A07;
                return new C201010v(runnable, str);
        }
    }
}
