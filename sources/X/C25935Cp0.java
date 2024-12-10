package X;

import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.Cp0  reason: case insensitive filesystem */
public final class C25935Cp0 {
    public static final C25935Cp0 A01;
    public final C25495Cgq A00;

    static {
        C25935Cp0 cp0;
        if (Util.A00 < 31) {
            cp0 = new C25935Cp0();
        } else {
            cp0 = new C25935Cp0(C25495Cgq.A01);
        }
        A01 = cp0;
    }

    public C25935Cp0(C25495Cgq cgq) {
        this.A00 = cgq;
    }

    public C25935Cp0() {
        this((C25495Cgq) null);
        C26056CrS.A03(AnonymousClass000.A1U(Util.A00, 31));
    }
}
