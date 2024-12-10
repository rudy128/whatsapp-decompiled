package X;

import android.view.View;

/* renamed from: X.0ZF  reason: invalid class name */
public class AnonymousClass0ZF implements Runnable {
    public AnonymousClass06D A00;
    public final /* synthetic */ AnonymousClass03I A01;

    public AnonymousClass0ZF(AnonymousClass06D r1, AnonymousClass03I r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass03I r2 = this.A01;
        if (r2.A05 != null) {
            r2.A05.A0E();
        }
        View view = (View) r2.A07;
        if (!(view == null || view.getWindowToken() == null)) {
            AnonymousClass06D r1 = this.A00;
            if (r1.A04()) {
                r2.A0C = r1;
            }
        }
        r2.A0A = null;
    }
}
