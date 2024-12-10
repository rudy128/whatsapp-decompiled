package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Ne  reason: invalid class name and case insensitive filesystem */
public class C25171Ne implements Iterable {
    public boolean A00 = false;
    public final ArrayList A01 = new ArrayList();
    public final HashMap A02 = new HashMap();

    public static int A00(C25171Ne r3, AnonymousClass1BI r4) {
        int i = 0;
        while (true) {
            ArrayList arrayList = r3.A01;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((C36311ng) arrayList.get(i)).A01.equals(r4)) {
                return i;
            }
            i++;
        }
    }

    public C36311ng A01(AnonymousClass1BI r3) {
        if (this.A00) {
            this.A02.remove(r3);
        }
        int A002 = A00(this, r3);
        if (A002 >= 0) {
            return (C36311ng) this.A01.remove(A002);
        }
        return null;
    }

    public void A02(List list) {
        if (this.A00) {
            HashMap hashMap = this.A02;
            hashMap.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C36311ng r0 = (C36311ng) it.next();
                hashMap.put(r0.A01, Long.valueOf(r0.A00));
            }
        }
        ArrayList arrayList = this.A01;
        arrayList.clear();
        arrayList.addAll(list);
        Collections.sort(arrayList);
    }

    public Iterator iterator() {
        return this.A01.iterator();
    }

    public boolean A03(AnonymousClass1BI r9, AnonymousClass1BI r10, long j) {
        C36311ng r4;
        int A002 = A00(this, r9);
        if (A002 >= 0) {
            r4 = (C36311ng) this.A01.remove(A002);
        } else {
            r4 = null;
        }
        if (this.A00) {
            HashMap hashMap = this.A02;
            hashMap.remove(r9);
            Long valueOf = Long.valueOf(j);
            hashMap.put(r10, valueOf);
            if (r4 != null) {
                long longValue = valueOf.longValue();
                long j2 = r4.A00;
                if (longValue <= j2) {
                    if (r10 != r4.A01) {
                        r4 = new C36311ng(r10, j2);
                    }
                }
            }
            r4 = new C36311ng(r10, valueOf.longValue());
        } else {
            r4 = new C36311ng(r10, j);
        }
        ArrayList arrayList = this.A01;
        int binarySearch = Collections.binarySearch(arrayList, r4);
        boolean z = false;
        if (binarySearch < 0) {
            z = true;
        }
        C17960vV.A0C(z);
        int i = (-binarySearch) - 1;
        arrayList.add(i, r4);
        if (A002 != i) {
            return true;
        }
        return false;
    }
}
