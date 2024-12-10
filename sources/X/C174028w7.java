package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.8w7  reason: invalid class name and case insensitive filesystem */
public final class C174028w7 extends C174358we {
    public final AP6 A00;
    public final List A01 = AnonymousClass000.A13();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174028w7(AP6 ap6, List list) {
        super(39);
        C18070vi.A0d(list, 1);
        this.A00 = ap6;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A01.add(new C192199ny(ap6, (AnonymousClass8nD) it.next()));
        }
    }
}
