package X;

import com.whatsapp.util.Log;

/* renamed from: X.2l5  reason: invalid class name and case insensitive filesystem */
public final class C58682l5 {
    public final AnonymousClass11S A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C18030ve A03;
    public final AnonymousClass00H A04;

    public final C693236t A00(AnonymousClass206 r5) {
        ((C25931Qe) this.A04.get()).A0A(C18070vi.A09(r5, C693236t.class));
        C693236t A002 = C60512o9.A00(r5);
        if (A002 != null) {
            return A002;
        }
        Log.e("ParentAssociationProtobufHelper/message parentAssociationInfo is null");
        throw new AnonymousClass1T8(0, "message messageAssociationInfo is null");
    }

    public C58682l5(AnonymousClass11S r1, C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r2, r1, r3, r4, r5);
        this.A03 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r4;
        this.A01 = r5;
    }

    public final boolean A01(C19998A2m a2m, AnonymousClass206 r6) {
        if (r6.A11(67108864)) {
            if (!C18020vd.A05(C18040vf.A02, this.A03, 8783) || ((a2m.A06 && !a2m.A07) || (r6 instanceof AnonymousClass23N))) {
                return false;
            }
            return true;
        }
        return false;
    }
}
