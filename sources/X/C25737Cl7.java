package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: X.Cl7  reason: case insensitive filesystem */
public class C25737Cl7 {
    public static final Comparator A06 = new DUR(5);
    public static final Comparator A07 = new DUR(6);
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public final ArrayList A04 = AnonymousClass000.A13();
    public final CPG[] A05 = new CPG[5];

    public float A00() {
        if (this.A00 != 0) {
            Collections.sort(this.A04, A07);
            this.A00 = 0;
        }
        float f = 0.5f * ((float) this.A03);
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A04;
            if (i < arrayList.size()) {
                CPG cpg = (CPG) arrayList.get(i);
                i2 += cpg.A02;
                if (((float) i2) >= f) {
                    return cpg.A00;
                }
                i++;
            } else if (arrayList.isEmpty()) {
                return Float.NaN;
            } else {
                return ((CPG) arrayList.get(AnonymousClass000.A0Q(arrayList))).A00;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.CPG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.CPG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.CPG} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(int r8, float r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            r2 = 1
            if (r0 == r2) goto L_0x000e
            java.util.ArrayList r1 = r7.A04
            java.util.Comparator r0 = A06
            java.util.Collections.sort(r1, r0)
            r7.A00 = r2
        L_0x000e:
            int r6 = r7.A02
            if (r6 <= 0) goto L_0x005f
            X.CPG[] r0 = r7.A05
            int r6 = r6 + -1
            r7.A02 = r6
            r2 = r0[r6]
        L_0x001a:
            int r1 = r7.A01
            int r0 = r1 + 1
            r7.A01 = r0
            r2.A01 = r1
            r2.A02 = r8
            r2.A00 = r9
            java.util.ArrayList r5 = r7.A04
            r5.add(r2)
            int r4 = r7.A03
            int r4 = r4 + r8
        L_0x002e:
            r7.A03 = r4
        L_0x0030:
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r4 <= r1) goto L_0x0065
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0065
            int r3 = r4 - r1
            r1 = 0
            java.lang.Object r2 = r5.get(r1)
            X.CPG r2 = (X.CPG) r2
            int r0 = r2.A02
            if (r0 > r3) goto L_0x005a
            int r4 = r4 - r0
            r7.A03 = r4
            r5.remove(r1)
            r1 = r6
            r0 = 5
            if (r6 >= r0) goto L_0x0030
            X.CPG[] r0 = r7.A05
            int r6 = r6 + 1
            r7.A02 = r6
            r0[r1] = r2
            goto L_0x0030
        L_0x005a:
            int r0 = r0 - r3
            r2.A02 = r0
            int r4 = r4 - r3
            goto L_0x002e
        L_0x005f:
            X.CPG r2 = new X.CPG
            r2.<init>()
            goto L_0x001a
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25737Cl7.A01(int, float):void");
    }
}
