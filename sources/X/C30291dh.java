package X;

import android.os.SystemClock;

/* renamed from: X.1dh  reason: invalid class name and case insensitive filesystem */
public final class C30291dh implements C24401Ke {
    public final C18030ve A00;
    public final C18100vl A01 = new C18110vm(new C71013Dl(this, 19));
    public final C27501Wi A02;
    public final AnonymousClass00H A03;

    public C30291dh(C18030ve r3, C27501Wi r4, AnonymousClass00H r5) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r5, 3);
        this.A00 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    public void BlT() {
        if (((Boolean) this.A01.getValue()).booleanValue()) {
            C30361do r3 = (C30361do) this.A03.get();
            if (((1 << 8) & ((Number) r3.A07.getValue()).intValue()) != 0) {
                r3.A01();
            } else {
                r3.A02((AnonymousClass1BI) null, 8);
            }
        }
    }

    public void onAppBackgrounded() {
        if (((Boolean) this.A01.getValue()).booleanValue()) {
            C30361do r3 = (C30361do) this.A03.get();
            if (((1 << 8) & ((Number) r3.A07.getValue()).intValue()) != 0) {
                r3.A01();
            } else {
                r3.A02((AnonymousClass1BI) null, 8);
            }
        }
        C27501Wi r4 = this.A02;
        if (r4.A04) {
            r4.A02(((SystemClock.elapsedRealtime() / 1000) - r4.A01) + 1);
            Runnable runnable = r4.A02;
            if (runnable != null) {
                r4.A0A.CEz(runnable);
            }
        }
    }
}
