package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.499  reason: invalid class name */
public class AnonymousClass499 extends A34 {
    public final C24921Me A00;
    public final WeakReference A01;
    public final ArrayList A02;
    public final List A03;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        List list = (List) obj;
        AnonymousClass3gf r0 = (AnonymousClass3gf) this.A01.get();
        if (r0 != null) {
            r0.A57(list);
        }
    }

    public AnonymousClass499(C24921Me r2, AnonymousClass3gf r3, List list, List list2) {
        ArrayList arrayList;
        this.A00 = r2;
        if (list != null) {
            arrayList = C17880vN.A10(list);
        } else {
            arrayList = null;
        }
        this.A02 = arrayList;
        this.A03 = list2;
        this.A01 = AnonymousClass3MW.A0z(r3);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 A0O = C17880vN.A0O(it);
            if (this.A00.A0l(A0O, this.A02)) {
                A13.add(A0O);
            }
        }
        return A13;
    }
}
