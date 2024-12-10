package X;

import java.util.List;

/* renamed from: X.7GU  reason: invalid class name */
public class AnonymousClass7GU implements C1606689l {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass7GU(Object obj, int i, int i2, Object obj2) {
        this.A00 = i2;
        this.A03 = obj;
        this.A01 = i;
        this.A02 = obj2;
    }

    public void BrA() {
        if (this.A00 != 0) {
            ((AnonymousClass3LQ) this.A02).onError(this.A01);
            return;
        }
        C31081ez.A01("NtaCreateAndLinkUserIqHelper/createAndLinkUser createUser onDeliveryFailure");
        ((C130496jW) this.A03).A00.A0z();
    }

    public void Bsw(Exception exc) {
        if (this.A00 != 0) {
            ((AnonymousClass3LQ) this.A02).onError(this.A01);
            return;
        }
        C31081ez.A01("NtaCreateAndLinkUserIqHelper/createAndLinkUser createUser onError");
        ((C130496jW) this.A03).A00.A0z();
    }

    public void C7I(AnonymousClass732 r12) {
        if (this.A00 != 0) {
            C108945cZ.A1P(this.A03);
            return;
        }
        C31081ez.A02("NtaCreateAndLinkUserIqHelper/createAndLinkUser createUser success");
        C17960vV.A07(r12);
        C130496jW r1 = (C130496jW) this.A03;
        C122196Oc r3 = (C122196Oc) r1.A04.get();
        int i = this.A01;
        String str = ((C31391fU) r1.A05.get()).BX3().A01;
        C18070vi.A0W(str);
        C129876iW r5 = new C129876iW("wa_nta", str, (String) null, (List) this.A02, i);
        C146407Oz r4 = new C146407Oz(r1, 0);
        if (!C18020vd.A05(C18040vf.A02, r3.A03, 12156)) {
            r4.BrA();
            return;
        }
        r3.A01(new AnonymousClass7P0(r3, r4), r3.A02.A00("waffle_100"), r5, 47);
    }
}
