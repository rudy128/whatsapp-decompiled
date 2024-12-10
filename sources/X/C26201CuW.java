package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.CuW  reason: case insensitive filesystem */
public final class C26201CuW {
    public static final C26201CuW A03 = new C26201CuW(true);
    public boolean A00;
    public boolean A01;
    public final C27298DbT A02 = new C23662BnV(16);

    public C26201CuW(boolean z) {
        A02();
        A02();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r0 >= 0) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r0 = (long) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        r2.A0H((X.DSQ) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008a, code lost:
        r4.CSU(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        r2.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b5, code lost:
        r2.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c6, code lost:
        r2.A0G(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.google.protobuf.CodedOutputStream r2, X.C24362Bzx r3, java.lang.Object r4, int r5) {
        /*
            X.Bzx r0 = X.C24362Bzx.A08
            if (r3 != r0) goto L_0x0016
            X.EDk r4 = (X.C28668EDk) r4
            int r1 = r5 << 3
            r0 = r1 | 3
            r2.A08(r0)
            r4.CSU(r2)
            r0 = r1 | 4
        L_0x0012:
            r2.A08(r0)
            return
        L_0x0016:
            int r1 = r3.wireType
            int r0 = r5 << 3
            r0 = r0 | r1
            r2.A08(r0)
            int[] r0 = X.CFo.A00
            int r0 = X.BE6.A0E(r3, r0)
            switch(r0) {
                case 1: goto L_0x00ad;
                case 2: goto L_0x00a1;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00c2;
                case 5: goto L_0x0037;
                case 6: goto L_0x009c;
                case 7: goto L_0x0097;
                case 8: goto L_0x008e;
                case 9: goto L_0x0088;
                case 10: goto L_0x007a;
                case 11: goto L_0x006a;
                case 12: goto L_0x004b;
                case 13: goto L_0x0046;
                case 14: goto L_0x0097;
                case 15: goto L_0x009c;
                case 16: goto L_0x003c;
                case 17: goto L_0x00b9;
                case 18: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            return
        L_0x0028:
            boolean r0 = r4 instanceof X.E68
            if (r0 == 0) goto L_0x0037
            X.E68 r4 = (X.E68) r4
            int r0 = r4.BVW()
        L_0x0032:
            if (r0 >= 0) goto L_0x0012
            long r0 = (long) r0
            goto L_0x00c6
        L_0x0037:
            int r0 = X.AnonymousClass000.A0M(r4)
            goto L_0x0032
        L_0x003c:
            int r0 = X.AnonymousClass000.A0M(r4)
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            goto L_0x0012
        L_0x0046:
            int r0 = X.AnonymousClass000.A0M(r4)
            goto L_0x0012
        L_0x004b:
            boolean r0 = r4 instanceof X.DSQ
            if (r0 != 0) goto L_0x0074
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            boolean r0 = r2 instanceof X.C23587BmH
            if (r0 == 0) goto L_0x0060
            X.BmH r2 = (X.C23587BmH) r2
            r0 = 0
            r2.A08(r1)
            r2.A0P(r4, r0, r1)
            return
        L_0x0060:
            X.BmG r2 = (X.C23586BmG) r2
            r0 = 0
            r2.A08(r1)
            r2.A0M(r4, r0, r1)
            return
        L_0x006a:
            boolean r0 = r4 instanceof X.DSQ
            if (r0 != 0) goto L_0x0074
            java.lang.String r4 = (java.lang.String) r4
            r2.A0K(r4)
            return
        L_0x0074:
            X.DSQ r4 = (X.DSQ) r4
            r2.A0H(r4)
            return
        L_0x007a:
            X.EDk r4 = (X.C28668EDk) r4
            r1 = r4
            X.DNC r1 = (X.DNC) r1
            r0 = 0
            int r0 = r1.A0J(r0)
            r2.A08(r0)
            goto L_0x008a
        L_0x0088:
            X.EDk r4 = (X.C28668EDk) r4
        L_0x008a:
            r4.CSU(r2)
            return
        L_0x008e:
            boolean r0 = X.AnonymousClass000.A1Y(r4)
            byte r0 = (byte) r0
            r2.A06(r0)
            return
        L_0x0097:
            int r0 = X.AnonymousClass000.A0M(r4)
            goto L_0x00a9
        L_0x009c:
            long r0 = X.C17880vN.A05(r4)
            goto L_0x00b5
        L_0x00a1:
            float r0 = X.AnonymousClass000.A04(r4)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
        L_0x00a9:
            r2.A07(r0)
            return
        L_0x00ad:
            double r0 = X.AnonymousClass8BR.A00(r4)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
        L_0x00b5:
            r2.A0F(r0)
            return
        L_0x00b9:
            long r0 = X.C17880vN.A05(r4)
            long r0 = X.BE9.A0L(r0)
            goto L_0x00c6
        L_0x00c2:
            long r0 = X.C17880vN.A05(r4)
        L_0x00c6:
            r2.A0G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26201CuW.A01(com.google.protobuf.CodedOutputStream, X.Bzx, java.lang.Object, int):void");
    }

    public void A02() {
        if (!this.A01) {
            int i = 0;
            while (true) {
                C27298DbT dbT = this.A02;
                if (i < dbT.A00.size()) {
                    Map.Entry entry = (Map.Entry) dbT.A00.get(i);
                    if (entry.getValue() instanceof C23577Bm6) {
                        ((C23577Bm6) entry.getValue()).A0Q();
                    }
                    i++;
                } else {
                    dbT.A05();
                    this.A01 = true;
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        Iterable entrySet;
        Object next;
        C26201CuW cuW = new C26201CuW();
        C27298DbT dbT = this.A02;
        if (0 < dbT.A00.size()) {
            next = dbT.A00.get(0);
        } else {
            if (dbT.A01.isEmpty()) {
                entrySet = CHS.A00;
            } else {
                entrySet = dbT.A01.entrySet();
            }
            Iterator it = entrySet.iterator();
            if (it.hasNext()) {
                next = it.next();
            } else {
                cuW.A00 = this.A00;
                return cuW;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        entry.getKey();
        entry.getValue();
        throw AnonymousClass000.A0s("isRepeated");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26201CuW)) {
            return false;
        }
        return this.A02.equals(((C26201CuW) obj).A02);
    }

    public int hashCode() {
        return this.A02.hashCode();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        r1 = ((X.DSQ) r4).A02();
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r0 = X.BEB.A02(r1) + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C24362Bzx r3, java.lang.Object r4, int r5) {
        /*
            int r2 = X.C25878Cnp.A05(r5)
            X.Bzx r0 = X.C24362Bzx.A08
            if (r3 != r0) goto L_0x000a
            int r2 = r2 * 2
        L_0x000a:
            int[] r0 = X.CFo.A00
            int r0 = X.BE6.A0E(r3, r0)
            switch(r0) {
                case 1: goto L_0x002b;
                case 2: goto L_0x002e;
                case 3: goto L_0x0030;
                case 4: goto L_0x0030;
                case 5: goto L_0x00a5;
                case 6: goto L_0x002b;
                case 7: goto L_0x002e;
                case 8: goto L_0x0039;
                case 9: goto L_0x003b;
                case 10: goto L_0x001a;
                case 11: goto L_0x0045;
                case 12: goto L_0x0050;
                case 13: goto L_0x006d;
                case 14: goto L_0x002e;
                case 15: goto L_0x002b;
                case 16: goto L_0x0078;
                case 17: goto L_0x0081;
                case 18: goto L_0x008e;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.String r0 = "There is no way to get here, but the compiler thinks otherwise."
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x001a:
            X.EDk r4 = (X.C28668EDk) r4
            X.DNC r4 = (X.DNC) r4
            r0 = 0
            int r1 = r4.A0J(r0)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            goto L_0x00a0
        L_0x002b:
            r0 = 8
            goto L_0x00a0
        L_0x002e:
            r0 = 4
            goto L_0x00a0
        L_0x0030:
            long r0 = X.C17880vN.A05(r4)
            int r0 = com.google.protobuf.CodedOutputStream.A03(r0)
            goto L_0x00a0
        L_0x0039:
            r0 = 1
            goto L_0x00a0
        L_0x003b:
            X.EDk r4 = (X.C28668EDk) r4
            X.DNC r4 = (X.DNC) r4
            r0 = 0
            int r0 = r4.A0J(r0)
            goto L_0x00a0
        L_0x0045:
            boolean r0 = r4 instanceof X.DSQ
            if (r0 != 0) goto L_0x005f
            java.lang.String r4 = (java.lang.String) r4
            int r0 = com.google.protobuf.CodedOutputStream.A04(r4)
            goto L_0x00a0
        L_0x0050:
            boolean r0 = r4 instanceof X.DSQ
            if (r0 != 0) goto L_0x005f
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            goto L_0x00a0
        L_0x005f:
            X.DSQ r4 = (X.DSQ) r4
            int r1 = r4.A02()
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            goto L_0x00a0
        L_0x006d:
            int r1 = X.AnonymousClass000.A0M(r4)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.BEB.A02(r1)
            goto L_0x00a0
        L_0x0078:
            int r0 = X.AnonymousClass000.A0M(r4)
            int r0 = X.C25878Cnp.A06(r0)
            goto L_0x00a0
        L_0x0081:
            long r0 = X.C17880vN.A05(r4)
            long r0 = X.BE9.A0L(r0)
            int r0 = com.google.protobuf.CodedOutputStream.A03(r0)
            goto L_0x00a0
        L_0x008e:
            boolean r0 = r4 instanceof X.E68
            if (r0 == 0) goto L_0x00a5
            X.E68 r4 = (X.E68) r4
            int r1 = r4.BVW()
        L_0x0098:
            if (r1 < 0) goto L_0x00a2
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.BEB.A02(r1)
        L_0x00a0:
            int r2 = r2 + r0
            return r2
        L_0x00a2:
            r0 = 10
            goto L_0x00a0
        L_0x00a5:
            int r1 = X.AnonymousClass000.A0M(r4)
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26201CuW.A00(X.Bzx, java.lang.Object, int):int");
    }

    public C26201CuW() {
    }
}
