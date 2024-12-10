package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ds9  reason: case insensitive filesystem */
public final class C28149Ds9 extends AnonymousClass11G implements C22821Di {
    public static final C28149Ds9 A00 = new C28149Ds9();

    public C28149Ds9() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C18070vi.A0b(list);
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (next instanceof AnonymousClass7EH) {
                A13.add(next);
            }
        }
        ArrayList A0D = C29351c6.A0D(A13);
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            BE7.A1R(A0D, it);
        }
        return A0D;
    }
}
