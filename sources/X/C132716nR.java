package X;

import java.util.Iterator;

/* renamed from: X.6nR  reason: invalid class name and case insensitive filesystem */
public final class C132716nR {
    public E8A A00;
    public AnonymousClass6RV A01;
    public String A02;
    public boolean A03;

    public final void A00(String str) {
        Object obj;
        if (str != null) {
            Iterator it = AnonymousClass6RV.A00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C18070vi.A18(((AnonymousClass6RV) obj).iconName, str)) {
                    break;
                }
            }
            this.A01 = (AnonymousClass6RV) obj;
        }
    }
}
