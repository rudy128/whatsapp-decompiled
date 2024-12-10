package X;

import java.util.TimerTask;

/* renamed from: X.7T8  reason: invalid class name */
public class AnonymousClass7T8 extends TimerTask {
    public final /* synthetic */ AnonymousClass73O A00;

    public AnonymousClass7T8(AnonymousClass73O r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass73O r3 = this.A00;
        if (!r3.A00) {
            AnonymousClass73O.A0O.remove(r3.A0J.toString());
            if (!r3.A01) {
                r3.A05.A0J(new C146757Qm((Object) this, 34));
            }
            AnonymousClass73O.A01(r3, 2);
        }
    }
}
