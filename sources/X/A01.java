package X;

import java.util.List;

public final class A01 {
    public final int A00;
    public final AnonymousClass2R1 A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r6 == X.AnonymousClass2R1.A01) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.A01 A00(X.AnonymousClass2R1 r6, com.whatsapp.jid.UserJid r7, java.lang.String r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            X.2R1 r0 = X.AnonymousClass2R1.A0F
            r5 = 1
            r2 = r6
            if (r6 == r0) goto L_0x000b
            X.2R1 r1 = X.AnonymousClass2R1.A01
            r0 = 0
            if (r6 != r1) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            X.C17960vV.A0D(r0)
            X.A4m r0 = new X.A4m
            r0.<init>(r7, r8)
            r0.A0D = r5
            r0.A0N = r5
            r0.A0K = r5
            r0.A0F = r11
            r0.A0C = r5
            r0.A0G = r5
            r0.A0I = r5
            r0.A0P = r10
            r0.A0O = r12
            X.9iB r0 = r0.A00()
            java.util.List r3 = java.util.Collections.singletonList(r0)
            r6 = 0
            X.A01 r1 = new X.A01
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A01.A00(X.2R1, com.whatsapp.jid.UserJid, java.lang.String, int, boolean, boolean, boolean):X.A01");
    }

    public A01(AnonymousClass2R1 r1, List list, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A02 = list;
        this.A04 = z;
        this.A00 = i;
        this.A03 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[mode=");
        AnonymousClass2R1 r2 = this.A01;
        StringBuilder sb = new StringBuilder(AnonymousClass000.A0y(r2.mode.modeString, A10));
        sb.append(" context=");
        sb.append(r2.context.contextString);
        sb.append(" requests=");
        sb.append(this.A02.size());
        return AnonymousClass000.A0z(sb);
    }
}
