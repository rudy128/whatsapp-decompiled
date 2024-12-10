package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DUP implements Comparator {
    public final int A00;
    public final Object A01;

    public DUP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Object obj, List list, int i) {
        Collections.sort(list, new DUP(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x01d2;
                case 1: goto L_0x01c7;
                case 2: goto L_0x01b9;
                case 3: goto L_0x0128;
                case 4: goto L_0x01a8;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0197;
                case 8: goto L_0x00e2;
                case 9: goto L_0x0189;
                case 10: goto L_0x017f;
                case 11: goto L_0x0110;
                case 12: goto L_0x0099;
                case 13: goto L_0x0140;
                case 14: goto L_0x0058;
                case 15: goto L_0x0030;
                case 16: goto L_0x0013;
                case 17: goto L_0x00e9;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.Csv r7 = (X.C26132Csv) r7
            X.Csv r8 = (X.C26132Csv) r8
            int r1 = X.C26132Csv.A00(r7)
            int r0 = X.C26132Csv.A00(r8)
            int r1 = r1 - r0
        L_0x0012:
            return r1
        L_0x0013:
            java.lang.Object r0 = r6.A01
            java.util.Comparator r0 = (java.util.Comparator) r0
            int r1 = r0.compare(r7, r8)
            if (r1 != 0) goto L_0x0012
            X.C5I r7 = (X.C5I) r7
            int r0 = r7.A00
            int r0 = -r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.C5I r8 = (X.C5I) r8
            int r0 = r8.A00
            int r0 = -r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0088
        L_0x0030:
            java.lang.Object r0 = r6.A01
            java.util.Comparator r0 = (java.util.Comparator) r0
            int r1 = r0.compare(r7, r8)
            if (r1 != 0) goto L_0x0012
            X.C5I r7 = (X.C5I) r7
            X.C6h r0 = r7.A01
            boolean r0 = r0.A03()
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0053
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
        L_0x004a:
            X.C5I r8 = (X.C5I) r8
            X.C6h r0 = r8.A01
            boolean r0 = r0.A03()
            goto L_0x0082
        L_0x0053:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L_0x004a
        L_0x0058:
            java.lang.Object r0 = r6.A01
            java.util.Comparator r0 = (java.util.Comparator) r0
            int r1 = r0.compare(r7, r8)
            if (r1 != 0) goto L_0x0012
            X.C5I r7 = (X.C5I) r7
            X.C6h r1 = r7.A01
            boolean r0 = r1 instanceof X.C24027BuE
            if (r0 == 0) goto L_0x0097
            X.BuE r1 = (X.C24027BuE) r1
            boolean r0 = r1.A02
        L_0x006e:
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0092
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
        L_0x0076:
            X.C5I r8 = (X.C5I) r8
            X.C6h r1 = r8.A01
            boolean r0 = r1 instanceof X.C24027BuE
            if (r0 == 0) goto L_0x008d
            X.BuE r1 = (X.C24027BuE) r1
            boolean r0 = r1.A02
        L_0x0082:
            if (r0 == 0) goto L_0x008d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
        L_0x0088:
            int r1 = X.C40151uF.A00(r2, r0)
            return r1
        L_0x008d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x0088
        L_0x0092:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L_0x0076
        L_0x0097:
            r0 = 0
            goto L_0x006e
        L_0x0099:
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            boolean r0 = r7.isChecked()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r8.isChecked()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            int r1 = r1.compareTo(r0)
            if (r1 != 0) goto L_0x0012
            boolean r0 = r7.isPressed()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r8.isPressed()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            int r1 = r1.compareTo(r0)
            if (r1 != 0) goto L_0x0012
            java.lang.Object r2 = r6.A01
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r0 = r2.indexOfChild(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.indexOfChild(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r1.compareTo(r0)
            return r1
        L_0x00e2:
            java.lang.String r0 = "Two plugins with the same ordering provided"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00e9:
            java.lang.Object r2 = r6.A01
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.util.HashMap r0 = X.C26302CxJ.A01
            int r1 = r2.getSpanStart(r7)
            int r0 = r2.getSpanStart(r8)
            if (r1 < r0) goto L_0x0126
            int r1 = r2.getSpanStart(r7)
            int r0 = r2.getSpanStart(r8)
            if (r1 > r0) goto L_0x013e
            int r1 = r2.getSpanEnd(r8)
            int r0 = r2.getSpanEnd(r7)
            int r1 = X.AnonymousClass1XO.A00(r1, r0)
            return r1
        L_0x0110:
            android.util.Pair r7 = (android.util.Pair) r7
            android.util.Pair r8 = (android.util.Pair) r8
            java.lang.Object r1 = r7.second
            java.lang.Object r0 = r8.second
            if (r1 == r0) goto L_0x013c
            long r3 = X.C17880vN.A05(r1)
            long r1 = X.C17880vN.A05(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x013e
        L_0x0126:
            r1 = -1
            return r1
        L_0x0128:
            X.CWT r7 = (X.CWT) r7
            X.CWT r8 = (X.CWT) r8
            long r3 = r7.A00()
            long r1 = r8.A00()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0126
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x013e
        L_0x013c:
            r1 = 0
            return r1
        L_0x013e:
            r1 = 1
            return r1
        L_0x0140:
            X.C5I r7 = (X.C5I) r7
            java.lang.Object r0 = r6.A01
            X.CaT r0 = (X.C25177CaT) r0
            java.util.Map r5 = r0.A01
            X.C6h r0 = r7.A01
            X.6Rq r0 = r0.A01()
            java.lang.Object r1 = r5.get(r0)
            r0 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C18070vi.A18(r1, r3)
            java.lang.Integer r2 = X.AnonymousClass3MY.A0f()
            r1 = r2
            if (r0 == 0) goto L_0x0167
            r1 = r4
        L_0x0167:
            X.C5I r8 = (X.C5I) r8
            X.C6h r0 = r8.A01
            X.6Rq r0 = r0.A01()
            java.lang.Object r0 = r5.get(r0)
            boolean r0 = X.C18070vi.A18(r0, r3)
            if (r0 != 0) goto L_0x017a
            r4 = r2
        L_0x017a:
            int r1 = X.C40151uF.A00(r1, r4)
            return r1
        L_0x017f:
            X.Csn r7 = (X.C26125Csn) r7
            X.Csn r8 = (X.C26125Csn) r8
            boolean r1 = r7.A08
            boolean r0 = r8.A08
            int r1 = r1 - r0
            return r1
        L_0x0189:
            X.Csn r7 = (X.C26125Csn) r7
            X.Csn r8 = (X.C26125Csn) r8
            boolean r0 = r7.A08
            r1 = r0 ^ 1
            boolean r0 = r8.A08
            r0 = r0 ^ 1
            int r1 = r1 - r0
            return r1
        L_0x0197:
            java.io.File r7 = (java.io.File) r7
            java.io.File r8 = (java.io.File) r8
            java.lang.String r1 = r7.getName()
            java.lang.String r0 = r8.getName()
            int r1 = r1.compareTo(r0)
            return r1
        L_0x01a8:
            java.lang.Object r1 = r6.A01
            X.1OS r1 = (X.AnonymousClass1OS) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.Object r0 = r1.invoke(r7, r8)
            int r1 = X.AnonymousClass000.A0M(r0)
            return r1
        L_0x01b9:
            java.lang.Object r0 = r6.A01
            X.CUb r0 = (X.C25025CUb) r0
            int r1 = r0.A00(r8)
            int r0 = r0.A00(r7)
            int r1 = r1 - r0
            return r1
        L_0x01c7:
            int[] r7 = (int[]) r7
            int[] r8 = (int[]) r8
            r0 = 0
            r1 = r7[r0]
            r0 = r8[r0]
            int r1 = r1 - r0
            return r1
        L_0x01d2:
            X.1sH r7 = (X.C38971sH) r7
            X.1sH r8 = (X.C38971sH) r8
            int r1 = r7.A02
            int r0 = r8.A02
            int r1 = r1 - r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DUP.compare(java.lang.Object, java.lang.Object):int");
    }
}
