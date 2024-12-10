package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1gt  reason: invalid class name and case insensitive filesystem */
public final class C32251gt {
    public final HashMap A00 = new HashMap();

    public final int A00(AnonymousClass1BI r3) {
        int i;
        C18070vi.A0d(r3, 0);
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            ArrayList arrayList = (ArrayList) hashMap.get(r3);
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
        }
        return i;
    }

    public final List A01(AnonymousClass1BI r5) {
        ArrayList arrayList;
        C18070vi.A0d(r5, 0);
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            ArrayList arrayList2 = (ArrayList) hashMap.get(r5);
            if (arrayList2 != null) {
                arrayList = new ArrayList(C29351c6.A0C(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C59252m0) it.next()).A02);
                }
            } else {
                arrayList = null;
            }
        }
        return arrayList;
    }
}
