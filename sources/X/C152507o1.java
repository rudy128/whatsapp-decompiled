package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.7o1  reason: invalid class name and case insensitive filesystem */
public final class C152507o1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C1179361n this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152507o1(C1179361n r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Set A0S = C200410p.A0S(new C122676Rh[]{C122676Rh.TEXT, C122676Rh.PHOTO, C122676Rh.VIDEO, C122676Rh.URL, C122676Rh.GIF, C122676Rh.POLL_CREATE});
        List A0c = C108995ce.A0c(C108955ca.A0v(this.this$0.A00, 6443));
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A0c.iterator();
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
        return C29431cG.A13(A0S, C29431cG.A12(A132));
    }
}
