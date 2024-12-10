package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6ko  reason: invalid class name and case insensitive filesystem */
public final class C131266ko {
    public final ArrayList A00(AnonymousClass77S r5, C58612ky r6, List list) {
        C18070vi.A0j(r5, r6);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object A00 = C20017A3j.A00(new AnonymousClass7wG((AnonymousClass77S) it.next(), r5, r6), 2);
            if (A00 == null) {
                C17960vV.A0F(false, "XFamilyCrosspostRequestManager/Cannot find corresponding messageRowId for given uniqueId");
            } else {
                A13.add(A00);
            }
        }
        return A13;
    }
}
