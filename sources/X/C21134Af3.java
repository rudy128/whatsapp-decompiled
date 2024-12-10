package X;

import com.whatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.Af3  reason: case insensitive filesystem */
public class C21134Af3 implements AnonymousClass1IV {
    public final int A00;
    public final Object A01;

    public C21134Af3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* synthetic */ void Bn7(C178119Bw r2) {
        if (this.A00 != 0) {
            A5G.A01((QuickContactActivity) this.A01);
        }
    }

    public /* synthetic */ void BnJ(C178119Bw r2) {
        if (this.A00 != 0) {
            A5G.A01((QuickContactActivity) this.A01);
        }
    }

    public void BnK(AnonymousClass1BI r3, CallState callState, String str) {
        C89444cT r0;
        if (this.A00 == 0) {
            C18070vi.A0n(str, r3, callState);
            C78453sp r1 = (C78453sp) this.A01;
            C178119Bw r02 = (C178119Bw) r1.getFMessage().A00.A02;
            if (r02 != null && (r0 = r02.A04) != null && str.equals(C40811vJ.A09(r0.A02))) {
                C78453sp.A03(r1);
            }
        }
    }

    public /* synthetic */ void Bmn() {
    }

    public /* synthetic */ void C5e() {
    }

    public /* synthetic */ void BnG(C178119Bw r1, boolean z) {
    }

    public /* synthetic */ void BnH(long j, boolean z, boolean z2, boolean z3, boolean z4) {
    }
}
