package X;

import android.os.Message;

/* renamed from: X.1gR  reason: invalid class name and case insensitive filesystem */
public class C31981gR implements AnonymousClass1RJ {
    public final C220418j A00;
    public final AnonymousClass10I A01;

    public int[] BSG() {
        return new int[]{101};
    }

    public boolean BcT(Message message, int i) {
        if (i != 101) {
            return false;
        }
        this.A01.CGF(new C146817Qs(32, (String) message.obj, this));
        return true;
    }

    public C31981gR(C220418j r1, AnonymousClass10I r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
