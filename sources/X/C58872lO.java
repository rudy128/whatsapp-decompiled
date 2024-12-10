package X;

import android.util.Pair;
import java.util.List;

/* renamed from: X.2lO  reason: invalid class name and case insensitive filesystem */
public class C58872lO {
    public final List A00;

    public final Pair A00() {
        List<Object> list = this.A00;
        double A002 = C50272Tu.A00(list);
        C18070vi.A0d(list, 0);
        double A003 = C50272Tu.A00(list);
        double d = 0.0d;
        for (Object A0M : list) {
            double A0M2 = ((double) AnonymousClass000.A0M(A0M)) - A003;
            d += A0M2 * A0M2;
        }
        double sqrt = Math.sqrt(d / ((double) list.size()));
        return C17890vO.A0E(Integer.valueOf((int) (A002 - (2.0d * sqrt))), (int) (A002 + (1.0d * sqrt)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(int r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass2KF
            if (r0 == 0) goto L_0x0049
            r6 = r7
            X.2KF r6 = (X.AnonymousClass2KF) r6
            java.util.List r5 = r6.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r5.add(r0)
            boolean r0 = r6.A02()
            if (r0 == 0) goto L_0x00ce
            android.util.Pair r4 = r6.A00()
            int r3 = r5.size()
            r2 = 0
        L_0x001f:
            if (r2 >= r3) goto L_0x00ce
            int r1 = X.AnonymousClass001.A0n(r5, r2)
            java.lang.Object r0 = r4.first
            X.C18070vi.A0W(r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            if (r1 >= r0) goto L_0x003b
            java.lang.Object r0 = r4.first
        L_0x0032:
            X.C18070vi.A0W(r0)
            r5.set(r2, r0)
        L_0x0038:
            int r2 = r2 + 1
            goto L_0x001f
        L_0x003b:
            java.lang.Object r0 = r4.second
            X.C18070vi.A0W(r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            if (r1 <= r0) goto L_0x0038
            java.lang.Object r0 = r4.second
            goto L_0x0032
        L_0x0049:
            boolean r0 = r7.A02()
            if (r0 == 0) goto L_0x008a
            android.util.Pair r1 = r7.A00()
            java.lang.Object r0 = r1.first
            X.C18070vi.A0W(r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            if (r8 >= r0) goto L_0x0075
            java.util.List r2 = r7.A00
            java.lang.Object r0 = r1.first
        L_0x0062:
            X.C18070vi.A0W(r0)
        L_0x0065:
            r2.add(r0)
            int r1 = r2.size()
            r0 = 20
            if (r1 <= r0) goto L_0x00da
            r0 = 0
            r2.remove(r0)
            return
        L_0x0075:
            java.lang.Object r0 = r1.second
            X.C18070vi.A0W(r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            java.util.List r2 = r7.A00
            if (r8 <= r0) goto L_0x0085
            java.lang.Object r0 = r1.second
            goto L_0x0062
        L_0x0085:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x0065
        L_0x008a:
            java.util.List r5 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r5.add(r0)
            int r1 = r5.size()
            r0 = 10
            if (r1 < r0) goto L_0x00da
            android.util.Pair r4 = r7.A00()
            int r3 = r5.size()
            r2 = 0
        L_0x00a4:
            if (r2 >= r3) goto L_0x00da
            int r1 = X.AnonymousClass001.A0n(r5, r2)
            java.lang.Object r0 = r4.first
            X.C18070vi.A0W(r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            if (r1 >= r0) goto L_0x00c0
            java.lang.Object r0 = r4.first
        L_0x00b7:
            X.C18070vi.A0W(r0)
            r5.set(r2, r0)
        L_0x00bd:
            int r2 = r2 + 1
            goto L_0x00a4
        L_0x00c0:
            java.lang.Object r0 = r4.second
            X.C18070vi.A0W(r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            if (r1 <= r0) goto L_0x00bd
            java.lang.Object r0 = r4.second
            goto L_0x00b7
        L_0x00ce:
            int r1 = r5.size()
            int r0 = r6.A00
            if (r1 <= r0) goto L_0x00da
            r0 = 0
            r5.remove(r0)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58872lO.A01(int):void");
    }

    public final boolean A02() {
        if (this.A00.size() >= 10) {
            return true;
        }
        return false;
    }

    public C58872lO(List list) {
        this.A00 = list;
    }
}
