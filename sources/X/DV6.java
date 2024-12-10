package X;

import java.util.Iterator;

public abstract class DV6 implements Iterator, C18450wR {
    public int A00;
    public Object A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.DcL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.DcL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.DcM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.DcL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X.DcL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: X.DcL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: X.DcL} */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c4, code lost:
        if (r4.length != 0) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d2, code lost:
        if (r5.A00 < r4.length) goto L_0x00d4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C27350DcM
            if (r0 == 0) goto L_0x0027
            r3 = r8
            X.DcM r3 = (X.C27350DcM) r3
        L_0x0007:
            java.util.Iterator r1 = r3.A01
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r2 = r1.next()
            X.1Di r0 = r3.A02
            java.lang.Object r1 = r0.invoke(r2)
            java.util.HashSet r0 = r3.A00
            boolean r0 = r0.add(r1)
            if (r0 == 0) goto L_0x0007
            r3.A01 = r2
        L_0x0023:
            r0 = 1
        L_0x0024:
            r3.A00 = r0
            return
        L_0x0027:
            r3 = r8
            X.DcL r3 = (X.C27349DcL) r3
        L_0x002a:
            java.util.ArrayDeque r2 = r3.A00
            java.lang.Object r7 = r2.peek()
            X.CMG r7 = (X.CMG) r7
            if (r7 == 0) goto L_0x00e2
            boolean r0 = r7 instanceof X.C27441DfS
            if (r0 == 0) goto L_0x0077
            r1 = r7
            X.DfS r1 = (X.C27441DfS) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x00c6
            r0 = 1
            r1.A00 = r0
            java.io.File r4 = r1.A00
        L_0x0044:
            if (r4 == 0) goto L_0x00c6
            java.io.File r0 = r7.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00de
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L_0x00de
            int r1 = r2.size()
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r0) goto L_0x00de
            X.DXj r0 = r3.A01
            java.lang.Integer r0 = r0.A01
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0071
            X.DfQ r0 = new X.DfQ
            r0.<init>(r4, r3)
        L_0x006d:
            r2.push(r0)
            goto L_0x002a
        L_0x0071:
            X.DfP r0 = new X.DfP
            r0.<init>(r4, r3)
            goto L_0x006d
        L_0x0077:
            boolean r0 = r7 instanceof X.C27438DfP
            if (r0 == 0) goto L_0x0088
            r5 = r7
            X.DfP r5 = (X.C27438DfP) r5
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x00cb
            r0 = 1
            r5.A01 = r0
            java.io.File r4 = r5.A00
            goto L_0x0044
        L_0x0088:
            r6 = r7
            X.DfQ r6 = (X.C27439DfQ) r6
            boolean r0 = r6.A01
            r5 = 1
            if (r0 != 0) goto L_0x00a0
            java.io.File[] r0 = r6.A03
            if (r0 != 0) goto L_0x00a0
            java.io.File r0 = r6.A00
            java.io.File[] r0 = r0.listFiles()
            r6.A03 = r0
            if (r0 != 0) goto L_0x00a0
            r6.A01 = r5
        L_0x00a0:
            java.io.File[] r4 = r6.A03
            if (r4 == 0) goto L_0x00b0
            int r1 = r6.A00
            int r0 = r4.length
            if (r1 >= r0) goto L_0x00b0
            int r0 = r1 + 1
            r6.A00 = r0
            r4 = r4[r1]
            goto L_0x0044
        L_0x00b0:
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x00c6
            r6.A02 = r5
            java.io.File r4 = r6.A00
            goto L_0x0044
        L_0x00b9:
            java.io.File r0 = r5.A00
            java.io.File[] r4 = r0.listFiles()
            r5.A02 = r4
            if (r4 == 0) goto L_0x00c6
            int r0 = r4.length
            if (r0 != 0) goto L_0x00d4
        L_0x00c6:
            r2.pop()
            goto L_0x002a
        L_0x00cb:
            java.io.File[] r4 = r5.A02
            if (r4 == 0) goto L_0x00b9
            int r1 = r5.A00
            int r0 = r4.length
            if (r1 >= r0) goto L_0x00c6
        L_0x00d4:
            int r1 = r5.A00
            int r0 = r1 + 1
            r5.A00 = r0
            r4 = r4[r1]
            goto L_0x0044
        L_0x00de:
            r3.A01 = r4
            goto L_0x0023
        L_0x00e2:
            r0 = 2
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DV6.A00():void");
    }

    public boolean hasNext() {
        int i = this.A00;
        if (i == 0) {
            this.A00 = 3;
            A00();
            if (this.A00 == 1) {
                return true;
            }
        } else if (i == 1) {
            return true;
        } else {
            if (i != 2) {
                throw AnonymousClass000.A0k("hasNext called when the iterator is in the FAILED state.");
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3.A00 == 1) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object next() {
        /*
            r3 = this;
            int r1 = r3.A00
            r0 = 1
            r2 = 0
            if (r1 == r0) goto L_0x0014
            r0 = 2
            if (r1 == r0) goto L_0x0019
            r0 = 3
            r3.A00 = r0
            r3.A00()
            int r1 = r3.A00
            r0 = 1
            if (r1 != r0) goto L_0x0019
        L_0x0014:
            r3.A00 = r2
            java.lang.Object r0 = r3.A01
            return r0
        L_0x0019:
            java.util.NoSuchElementException r0 = X.BE6.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DV6.next():java.lang.Object");
    }

    public void remove() {
        throw AnonymousClass000.A12();
    }
}
