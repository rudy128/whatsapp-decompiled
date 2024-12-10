package X;

import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.AGp  reason: case insensitive filesystem */
public class C20333AGp implements C22851Dl {
    public boolean A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C20333AGp(C15950rT r2, C22801Dg r3) {
        this.A01 = 1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = false;
    }

    public final void Bo9(Object obj) {
        switch (this.A01) {
            case 0:
                AnonymousClass99S r4 = (AnonymousClass99S) this.A02;
                boolean z = this.A00;
                C62562rb r1 = (C62562rb) this.A03;
                if (z) {
                    r4.startActivity(AnonymousClass1LU.A1Y(r4, r1.A07, r4.A0B.A01(), r4.A0A.A0E(), false));
                    return;
                }
                C17880vN.A0I(r4.A0Q).A0I(r4, r1.A07, r1.A05, (String) null, (String) null, (C18090vk) null, 12, false, false, false);
                return;
            case 1:
                if (this.A00 || AnonymousClass000.A1Y(((C15950rT) this.A02).apply(obj))) {
                    this.A00 = true;
                    ((AnonymousClass1DS) this.A03).A0F(obj);
                    return;
                }
                return;
            default:
                VoipActivityV2.A1P((CallInfo) this.A03, (VoipActivityV2) this.A02, this.A00);
                return;
        }
    }

    public C20333AGp(Object obj, Object obj2, int i, boolean z) {
        this.A01 = i;
        this.A02 = obj2;
        this.A00 = z;
        this.A03 = obj;
    }
}
