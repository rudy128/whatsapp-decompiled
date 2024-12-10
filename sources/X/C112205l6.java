package X;

import java.util.List;

/* renamed from: X.5l6  reason: invalid class name and case insensitive filesystem */
public abstract class C112205l6 extends C38391rD {
    public final List A00;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0U(X.C22821Di r7) {
        /*
            r6 = this;
            r5 = 0
            java.util.List r4 = r6.A00
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0046
            java.util.ListIterator r2 = X.C108955ca.A18(r4)
        L_0x000d:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r2.previous()
            java.lang.Object r0 = r7.invoke(r0)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x000d
            r2.next()
            int r1 = r4.size()
            int r0 = r2.nextIndex()
            int r1 = r1 - r0
            if (r1 == 0) goto L_0x0046
            java.util.ArrayList r3 = X.C17880vN.A0z(r1)
        L_0x0033:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r2.next()
            r3.add(r0)
            goto L_0x0033
        L_0x0041:
            java.util.List r3 = X.C29431cG.A0t(r4)
            goto L_0x0048
        L_0x0046:
            X.0wS r3 = X.C18460wS.A00
        L_0x0048:
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0050
            return r5
        L_0x0050:
            int r0 = r3.size()
        L_0x0054:
            if (r1 >= r0) goto L_0x005c
            X.C50582Uz.A00(r4)
            int r1 = r1 + 1
            goto L_0x0054
        L_0x005c:
            int r0 = r3.size()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112205l6.A0U(X.1Di):int");
    }

    public final void A0W(List list) {
        C18070vi.A0d(list, 0);
        int A0U = A0U(C108945cZ.A1K(this, 1));
        if (A0U > 0) {
            List list2 = this.A00;
            int size = list2.size();
            C38411rF r2 = this.A01;
            r2.A03(size, A0U);
            list2.addAll(list);
            r2.A02(list2.size() - list.size(), list.size());
        }
    }

    public int A0Q() {
        return this.A00.size();
    }

    public final void A0V(List list) {
        List list2 = this.A00;
        if (list2.size() <= 0 || !A0Y(C29431cG.A0d(list2))) {
            int size = list2.size();
            list2.addAll(list);
            this.A01.A02(size, list.size());
        }
    }

    public final void A0X(List list) {
        List list2 = this.A00;
        if (AnonymousClass000.A1a(list2)) {
            int size = list2.size();
            list2.clear();
            this.A01.A03(0, size);
        }
        if (list != null && !list.isEmpty()) {
            list2.addAll(list);
            this.A01.A02(0, list2.size());
        }
    }

    public boolean A0Y(Object obj) {
        C143257Cr r3;
        if (this instanceof C115105tP) {
            C1594084k r32 = (C1594084k) obj;
            C18070vi.A0d(r32, 0);
            if ((r32 instanceof AnonymousClass8B6) || ((r32 instanceof C143257Cr) && (r3 = (C143257Cr) r32) != null && r3.A04)) {
                return true;
            }
            return false;
        }
        C18070vi.A0d(obj, 0);
        return obj instanceof AnonymousClass8B6;
    }

    public C112205l6(List list) {
        this.A00 = list;
    }
}
