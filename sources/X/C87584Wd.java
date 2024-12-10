package X;

import java.util.Timer;

/* renamed from: X.4Wd  reason: invalid class name and case insensitive filesystem */
public abstract class C87584Wd {
    public static Timer A02 = new Timer();
    public boolean A00;
    public final C99754tP A01;

    public C87584Wd() {
        C99754tP r1 = new C99754tP(this);
        this.A01 = r1;
        A02.schedule(r1, 20000);
    }
}
