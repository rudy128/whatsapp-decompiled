package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.4jH  reason: invalid class name and case insensitive filesystem */
public final class C93624jH implements C72203La {
    public A99 A00;
    public CallState A01 = CallState.NONE;
    public final AnonymousClass1V7 A02;

    public C93624jH(AnonymousClass1V7 r2) {
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
    }

    public void C5F(A99 a99) {
        C18070vi.A0d(a99, 0);
        this.A00 = a99;
    }

    public void C5G() {
        this.A00 = null;
    }

    public final void A00(CallState callState) {
        CallState callState2 = this.A01;
        CallState callState3 = CallState.NONE;
        if (callState2 == callState3) {
            if (callState != callState3 && this.A00 == null) {
                this.A02.A01(this);
            }
        } else if (callState == callState3) {
            this.A02.A02(this);
            this.A00 = null;
        }
        this.A01 = callState;
    }
}
