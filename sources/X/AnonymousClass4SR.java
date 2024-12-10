package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4SR  reason: invalid class name */
public final class AnonymousClass4SR {
    public final float A00;
    public final AnonymousClass4ZN A01;
    public final AnonymousClass4ZN A02;
    public final C89444cT A03;
    public final Integer A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public int hashCode() {
        int length;
        ArrayList A0z = C17880vN.A0z(2);
        A0z.add(this);
        List list = this.A07;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 A0O = C17880vN.A0O(it);
            Object[] objArr = new Object[3];
            AnonymousClass3MX.A1S(objArr, 0, A0O.A0E);
            objArr[1] = A0O.A0Z;
            objArr[2] = A0O.A0K();
            C29401cD.A0J(AnonymousClass1ZU.A06(objArr), A13);
        }
        Object[] array = A13.toArray(new Object[0]);
        if (array != null && (length = array.length) > 0) {
            A0z.ensureCapacity(A0z.size() + length);
            Collections.addAll(A0z, array);
        }
        return Arrays.hashCode(A0z.toArray(new Object[A0z.size()]));
    }

    public AnonymousClass4SR(AnonymousClass4ZN r1, AnonymousClass4ZN r2, C89444cT r3, Integer num, String str, List list, List list2, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0B = z;
        this.A02 = r1;
        this.A01 = r2;
        this.A06 = list;
        this.A07 = list2;
        this.A08 = z2;
        this.A04 = num;
        this.A00 = f;
        this.A0A = z3;
        this.A03 = r3;
        this.A05 = str;
        this.A09 = z4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = super.equals(r9)
            if (r0 == 0) goto L_0x006d
            boolean r0 = r9 instanceof X.AnonymousClass4SR
            if (r0 == 0) goto L_0x006d
            java.util.List r3 = r8.A07
            X.4SR r9 = (X.AnonymousClass4SR) r9
            java.util.List r2 = r9.A07
            int r1 = r3.size()
            int r0 = r2.size()
            if (r1 != r0) goto L_0x006d
            r0 = 0
            java.util.List r1 = X.C98924rw.A00(r3, r0)
            r0 = 1
            java.util.List r0 = X.C98924rw.A00(r2, r0)
            java.util.ArrayList r1 = X.C29431cG.A0j(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0034
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0034
        L_0x0032:
            r0 = 1
            return r0
        L_0x0034:
            java.util.Iterator r7 = r1.iterator()
        L_0x0038:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r7.next()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r6 = r0.first
            X.1E7 r6 = (X.AnonymousClass1E7) r6
            java.lang.Object r5 = r0.second
            X.1E7 r5 = (X.AnonymousClass1E7) r5
            long r3 = r6.A0E
            long r1 = r5.A0E
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006d
            java.lang.String r1 = r6.A0Z
            java.lang.String r0 = r5.A0Z
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x006d
            java.lang.String r1 = r6.A0K()
            java.lang.String r0 = r5.A0K()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x006d
            goto L_0x0038
        L_0x006d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4SR.equals(java.lang.Object):boolean");
    }
}
