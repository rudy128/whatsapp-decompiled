package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.0OM  reason: invalid class name */
public final class AnonymousClass0OM {
    public C17080ti A00;
    public final Map A01 = new LinkedHashMap();
    public final LinkedHashSet A02 = new LinkedHashSet();
    public final List A03 = AnonymousClass000.A13();
    public final List A04 = AnonymousClass000.A13();
    public final List A05 = AnonymousClass000.A13();
    public final List A06 = AnonymousClass000.A13();

    public static /* synthetic */ void A00(AnonymousClass0OM r1, AnonymousClass0V0 r2) {
        AnonymousClass1D7.A06(r2.A08, r1.A01);
        throw AnonymousClass000.A0s("getAnimations");
    }

    private final void A01(AnonymousClass0V0 r3) {
        AnonymousClass1D7.A06(r3.A08, this.A01);
        throw AnonymousClass000.A0s("getAnimations");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (r25 == false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass0N7 r19, java.util.List r20, int r21, int r22, boolean r23, boolean r24, boolean r25) {
        /*
            r18 = this;
            r9 = r18
            X.0ti r8 = r9.A00
            r15 = r19
            X.0uK r0 = r15.A01
            X.0V1 r0 = (X.AnonymousClass0V1) r0
            X.0ti r7 = r0.A02
            r9.A00 = r7
            r12 = r20
            int r5 = r12.size()
            r4 = 0
        L_0x0015:
            if (r4 >= r5) goto L_0x0035
            java.lang.Object r0 = r12.get(r4)
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            java.util.List r3 = r0.A09
            int r2 = r3.size()
            r1 = 0
        L_0x0024:
            if (r1 >= r2) goto L_0x0032
            java.lang.Object r0 = r3.get(r1)
            X.0XJ r0 = (X.AnonymousClass0XJ) r0
            r0.BWC()
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0032:
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0035:
            java.util.Map r6 = r9.A01
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0045
            r6.clear()
            X.0V6 r0 = X.C17080ti.A00
            r9.A00 = r0
            return
        L_0x0045:
            X.C29431cG.A0c(r12)
            r11 = r21
            r17 = r11
            r10 = r22
            if (r23 == 0) goto L_0x0052
            r17 = r10
        L_0x0052:
            if (r24 != 0) goto L_0x0058
            r16 = 0
            if (r25 != 0) goto L_0x005a
        L_0x0058:
            r16 = 1
        L_0x005a:
            java.util.LinkedHashSet r14 = r9.A02
            java.util.Set r0 = r6.keySet()
            r14.addAll(r0)
            int r13 = r12.size()
            r5 = 0
        L_0x0068:
            if (r5 >= r13) goto L_0x0090
            java.lang.Object r0 = r12.get(r5)
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            java.lang.Object r4 = r0.A08
            r14.remove(r4)
            java.util.List r3 = r0.A09
            int r2 = r3.size()
            r1 = 0
        L_0x007c:
            if (r1 >= r2) goto L_0x008a
            java.lang.Object r0 = r3.get(r1)
            X.0XJ r0 = (X.AnonymousClass0XJ) r0
            r0.BWC()
            int r1 = r1 + 1
            goto L_0x007c
        L_0x008a:
            r6.remove(r4)
            int r5 = r5 + 1
            goto L_0x0068
        L_0x0090:
            if (r16 == 0) goto L_0x00d4
            if (r8 == 0) goto L_0x00d4
            java.util.List r4 = r9.A06
            int r0 = r4.size()
            r3 = 1
            if (r0 <= r3) goto L_0x00a6
            r1 = 2
            X.0Zd r0 = new X.0Zd
            r0.<init>(r8, r1)
            X.C29391cC.A0H(r4, r0)
        L_0x00a6:
            int r1 = r4.size()
            r0 = 0
            r2 = 0
            if (r0 >= r1) goto L_0x00b9
            java.lang.Object r1 = r4.get(r0)
        L_0x00b2:
            X.0V0 r1 = (X.AnonymousClass0V0) r1
            r0 = 0
            A00(r9, r1)
            throw r0
        L_0x00b9:
            java.util.List r1 = r9.A05
            int r0 = r1.size()
            if (r0 <= r3) goto L_0x00c9
            X.0Zd r0 = new X.0Zd
            r0.<init>(r8, r2)
            X.C29391cC.A0H(r1, r0)
        L_0x00c9:
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x00d4
            java.lang.Object r1 = r1.get(r2)
            goto L_0x00b2
        L_0x00d4:
            java.util.Iterator r3 = r14.iterator()
        L_0x00d8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r2 = r3.next()
            int r1 = r7.BSs(r2)
            r0 = -1
            if (r1 != r0) goto L_0x00ed
            r6.remove(r2)
            goto L_0x00d8
        L_0x00ed:
            r15.A00(r1)
            X.AnonymousClass1D7.A06(r2, r6)
            java.lang.String r0 = "getAnimations"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00fa:
            java.util.List r3 = r9.A04
            int r1 = r3.size()
            r0 = 1
            if (r1 <= r0) goto L_0x010c
            r1 = 3
            X.0Zd r0 = new X.0Zd
            r0.<init>(r7, r1)
            X.C29391cC.A0H(r3, r0)
        L_0x010c:
            int r5 = r3.size()
            r4 = 0
            r2 = 0
        L_0x0112:
            if (r2 >= r5) goto L_0x0137
            java.lang.Object r1 = r3.get(r2)
            X.0V0 r1 = (X.AnonymousClass0V0) r1
            int r0 = r1.A06
            int r4 = r4 + r0
            if (r24 == 0) goto L_0x0135
            java.lang.Object r0 = X.C29431cG.A0b(r12)
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r0 = r0.A00
            int r0 = r0 - r4
        L_0x0128:
            r1.A01(r0, r11, r10)
            if (r16 == 0) goto L_0x0132
            r9.A01(r1)
        L_0x0130:
            r0 = 0
            throw r0
        L_0x0132:
            int r2 = r2 + 1
            goto L_0x0112
        L_0x0135:
            int r0 = -r4
            goto L_0x0128
        L_0x0137:
            java.util.List r2 = r9.A03
            int r1 = r2.size()
            r0 = 1
            if (r1 <= r0) goto L_0x0149
            r1 = 1
            X.0Zd r0 = new X.0Zd
            r0.<init>(r7, r1)
            X.C29391cC.A0H(r2, r0)
        L_0x0149:
            int r7 = r2.size()
            r6 = 0
            r5 = 0
        L_0x014f:
            if (r5 >= r7) goto L_0x0177
            java.lang.Object r4 = r2.get(r5)
            X.0V0 r4 = (X.AnonymousClass0V0) r4
            if (r24 == 0) goto L_0x0174
            java.lang.Object r0 = X.C29431cG.A0d(r12)
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r1 = r0.A00
            int r0 = r0.A06
            int r1 = r1 + r0
            int r1 = r1 + r6
        L_0x0165:
            int r0 = r4.A06
            int r6 = r6 + r0
            r4.A01(r1, r11, r10)
            if (r16 == 0) goto L_0x0171
            r9.A01(r4)
            goto L_0x0130
        L_0x0171:
            int r5 = r5 + 1
            goto L_0x014f
        L_0x0174:
            int r1 = r17 + r6
            goto L_0x0165
        L_0x0177:
            X.C29421cF.A0S(r3)
            r0 = 0
            r12.addAll(r0, r3)
            r12.addAll(r2)
            java.util.List r0 = r9.A06
            r0.clear()
            java.util.List r0 = r9.A05
            r0.clear()
            r3.clear()
            r2.clear()
            r14.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0OM.A02(X.0N7, java.util.List, int, int, boolean, boolean, boolean):void");
    }
}
