package X;

import com.whatsapp.util.Log;

/* renamed from: X.7GZ  reason: invalid class name */
public class AnonymousClass7GZ implements C1606789m {
    public final C1606689l A00;
    public final C35021lW A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public final void BrA() {
        Log.e("FBUserEntityManagement : Network failed while sending the payload");
        this.A00.BrA();
    }

    public final void Bsw(Exception exc) {
        Log.e("FBUserEntityManagement : On error response while sending the payload", exc);
        this.A00.Bsw(exc);
    }

    public final void C7I(AnonymousClass732 r3) {
        boolean z;
        C33631j8 r1 = (C33631j8) this.A02.get();
        if (r3 != null) {
            z = r1.A08(r3);
        } else {
            r1.A07(this.A01);
            z = true;
        }
        C1606689l r12 = this.A00;
        if (z) {
            r12.C7I(r3);
        } else {
            r12.Bsw(AnonymousClass000.A0n("Unable to perform operation."));
        }
    }

    public AnonymousClass7GZ(C1606689l r1, C35021lW r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = r2;
        this.A00 = r1;
    }
}
