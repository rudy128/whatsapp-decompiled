package X;

import java.util.List;

/* renamed from: X.1db  reason: invalid class name and case insensitive filesystem */
public final class C30231db extends C30221da implements C24401Ke {
    public void BlT() {
        if (!this.A00.getAndSet(true)) {
            List<C71993Kd> list = this.A01;
            C18070vi.A0W(list);
            synchronized (list) {
                for (C71993Kd BKR : list) {
                    BKR.BKR(true);
                }
            }
        }
    }

    public void onAppBackgrounded() {
        if (this.A00.getAndSet(false)) {
            List<C71993Kd> list = this.A01;
            C18070vi.A0W(list);
            synchronized (list) {
                for (C71993Kd BKR : list) {
                    BKR.BKR(false);
                }
            }
        }
    }

    public C30231db() {
        this.A00.set(false);
    }
}
