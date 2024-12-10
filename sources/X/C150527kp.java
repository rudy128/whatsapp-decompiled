package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7kp  reason: invalid class name and case insensitive filesystem */
public final class C150527kp extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C111835kV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C150527kp(C111835kV r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C18030ve r5 = this.this$0.A09;
        C18070vi.A0d(r5, 0);
        boolean z = true;
        List A0s = C108985cd.A0s(C108955ca.A0v(r5, 3919), 1);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            C109005cf.A0q(A13, it);
        }
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it2 = A13.iterator();
        while (it2.hasNext()) {
            C122676Rh A00 = AnonymousClass6X1.A00(C72453Mb.A0H(it2));
            if (A00 != null) {
                A132.add(A00);
            }
        }
        if (!C29431cG.A12(A132).contains(C122676Rh.STICKER_PACK) || !C18020vd.A05(C18040vf.A02, r5, 11952)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
