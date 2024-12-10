package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.AYd  reason: case insensitive filesystem */
public class C20774AYd implements BBF {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20774AYd(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void C26(A7B a7b) {
        if (this.A00 != 0) {
            ((AZP) this.A01).A01.A03();
        } else {
            ((C190769lU) this.A02).A00(a7b);
        }
    }

    public void C27(AZ2 az2) {
        if (this.A00 != 0) {
            C29621ca A012 = new C198959zC(az2).A01((byte[]) this.A02);
            AZP azp = (AZP) this.A01;
            azp.A00.A29();
            azp.A01.A06((PinBottomSheetDialogFragment) null, A012);
            return;
        }
        C198959zC r3 = new C198959zC(az2);
        C198739yp r2 = (C198739yp) this.A01;
        C198739yp.A00(r2, r3, (C190769lU) this.A02, r2.A0B);
    }
}
