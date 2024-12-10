package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.6MU  reason: invalid class name */
public class AnonymousClass6MU extends A34 {
    public static final List A08;
    public C1599986r A00;
    public final int A01;
    public final C32531hL A02;
    public final C26911Ty A03;
    public final C37551pj A04;
    public final AnonymousClass1M9 A05;
    public final C26051Qq A06;
    public final AnonymousClass1MZ A07;

    /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.Object, X.3Bh] */
    /* JADX WARNING: CFG modification limit reached, blocks count: 159 */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e0, code lost:
        if (r1.A0J((com.whatsapp.jid.GroupJid) r0) != false) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r13) {
        /*
            r12 = this;
            int r5 = r12.A01
            java.util.ArrayList r4 = X.C17880vN.A0z(r5)
            boolean r0 = X.C108945cZ.A1T(r12)
            if (r0 != 0) goto L_0x0109
            X.1Qq r10 = r12.A06
            boolean r0 = r10.A05()
            if (r0 == 0) goto L_0x0019
            X.1hL r0 = r12.A02
            r0.A03()
        L_0x0019:
            r7 = 0
            X.1Ez r8 = new X.1Ez
            r8.<init>((boolean) r7)
            r8.A04()
            java.util.Map r0 = r10.A02()
            java.util.HashMap r9 = X.C17880vN.A11()
            java.util.Iterator r11 = X.AnonymousClass000.A15(r0)
        L_0x002e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x006b
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r11)
            java.lang.Object r0 = r1.getKey()
            X.2SC r0 = (X.AnonymousClass2SC) r0
            X.1BI r6 = r0.A01
            r1.getKey()
            java.lang.Object r0 = r1.getValue()
            int r3 = X.AnonymousClass000.A0M(r0)
            if (r3 == 0) goto L_0x002e
            java.lang.Object r2 = r9.get(r6)
            X.3Bh r2 = (X.C70493Bh) r2
            if (r2 != 0) goto L_0x0062
            X.1CJ r0 = r10.A01
            long r0 = r0.A08(r6)
            X.3Bh r2 = new X.3Bh
            r2.<init>()
            r2.A01 = r0
        L_0x0062:
            int r0 = r2.A00
            int r0 = r0 + r3
            r2.A00 = r0
            r9.put(r6, r2)
            goto L_0x002e
        L_0x006b:
            java.util.Set r0 = r9.entrySet()
            java.util.ArrayList r1 = X.C17880vN.A10(r0)
            r0 = 9
            X.C147027Rn.A01(r0, r1)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r1.iterator()
        L_0x0080:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010f
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r2)
            java.lang.Object r0 = r1.getKey()
            r6.add(r0)
            r1.getKey()
            r1.getValue()
            r1.getValue()
            goto L_0x0080
        L_0x009b:
            X.1M9 r7 = r12.A05
            X.1E7 r2 = r7.A0E(r3)
            if (r2 == 0) goto L_0x0103
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x0103
            X.1pj r1 = r12.A04
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3MZ.A0x(r2)
            boolean r0 = r1.A0P(r0)
            if (r0 != 0) goto L_0x0103
            X.1BI r1 = r2.A0J
            boolean r0 = X.C22971Dz.A0Z(r1)
            if (r0 != 0) goto L_0x0103
            boolean r0 = X.C22971Dz.A0O(r1)
            if (r0 != 0) goto L_0x0103
            boolean r0 = X.C22971Dz.A0K(r1)
            if (r0 == 0) goto L_0x0103
            boolean r0 = r2.A0F()
            if (r0 == 0) goto L_0x00e2
            X.1MZ r1 = r12.A07
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r0 = r2.A06(r0)
            X.C17960vV.A07(r0)
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r1.A0J(r0)
            if (r0 == 0) goto L_0x0103
        L_0x00e2:
            X.1Ty r1 = r12.A03
            X.1BI r0 = r2.A0J
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.AEW r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0103
            java.util.List r1 = r0.A0P
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0137
            boolean r0 = r2.A0O()
            if (r0 == 0) goto L_0x0137
        L_0x00fc:
            X.1E7 r0 = r7.A0E(r3)
            r4.add(r0)
        L_0x0103:
            int r0 = r4.size()
            if (r0 < r5) goto L_0x0125
        L_0x0109:
            X.6bf r0 = new X.6bf
            r0.<init>(r4)
            return r0
        L_0x010f:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            long r0 = r8.A01()
            X.AnonymousClass3MX.A1S(r2, r7, r0)
            java.lang.String r0 = "frequentmsgstore/getfrequents took %d ms"
            X.C108955ca.A1X(r0, r3, r2)
            java.util.Iterator r6 = r6.iterator()
        L_0x0125:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0109
            X.1BI r3 = X.C17880vN.A0Q(r6)
            boolean r0 = X.C22971Dz.A0a(r3)
            if (r0 != 0) goto L_0x0125
            goto L_0x009b
        L_0x0137:
            java.util.Iterator r2 = r1.iterator()
        L_0x013b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r0 = r2.next()
            X.AEQ r0 = (X.AEQ) r0
            java.util.List r1 = A08
            java.lang.String r0 = r0.A00
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x013b
            goto L_0x0103
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MU.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C125776bf r2 = (C125776bf) obj;
        if (C108945cZ.A1T(this)) {
            this.A00 = null;
            return;
        }
        C1599986r r0 = this.A00;
        if (r0 != null) {
            r0.Bq2(r2);
        }
    }

    static {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "644728732639272";
        A1Z[1] = "369730359717478";
        A08 = Arrays.asList(A1Z);
    }

    public AnonymousClass6MU(C32531hL r1, C26911Ty r2, C37551pj r3, AnonymousClass1M9 r4, C1599986r r5, C26051Qq r6, AnonymousClass1MZ r7, int i) {
        this.A01 = i;
        this.A05 = r4;
        this.A04 = r3;
        this.A02 = r1;
        this.A06 = r6;
        this.A03 = r2;
        this.A07 = r7;
        this.A00 = r5;
    }
}
