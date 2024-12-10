package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7ny  reason: invalid class name and case insensitive filesystem */
public final class C152477ny extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C133836pa this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152477ny(C133836pa r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List A0c = C108995ce.A0c(C108955ca.A0v(this.this$0.A00, 7734));
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A0c.iterator();
        while (it.hasNext()) {
            C109005cf.A0q(A13, it);
        }
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it2 = A13.iterator();
        while (it2.hasNext()) {
            int A0H = C72453Mb.A0H(it2) - 1;
            Iterator it3 = C179619Ir.A00.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (((C179619Ir) next).ordinal() == A0H) {
                    if (next != null) {
                        A132.add(next);
                    }
                }
            }
        }
        return A132;
    }
}
