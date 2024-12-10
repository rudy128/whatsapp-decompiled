package X;

/* renamed from: X.Ahh  reason: case insensitive filesystem */
public final class C21296Ahh implements C22528BBl {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: X.Ahy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: X.Ahy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: X.Ahy} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if ((r3.A00 - r7) <= ((long) r10)) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r1 >= r2) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
        if (r1 >= r2) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b5, code lost:
        if (r1 >= r2) goto L_0x0068;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C188299hC BCN(X.C188729ht r18, X.AnonymousClass5YR r19) {
        /*
            r17 = this;
            r9 = r19
            r3 = r18
            X.C18070vi.A0h(r9, r3)
            X.Ai4 r9 = (X.C21319Ai4) r9
            java.lang.String r5 = r9.A0F
            X.A6F r4 = r3.A08
            java.lang.Integer r1 = r3.A0A
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x00b8
            X.Ahy r11 = new X.Ahy
            r11.<init>()
        L_0x0018:
            int r2 = r9.A01
            if (r2 <= 0) goto L_0x004b
            X.9Ik r6 = X.C179549Ik.IMPRESSION
            int r1 = r4.A03(r6, r5)
            if (r11 == 0) goto L_0x002b
            X.9cG r0 = new X.9cG
            r0.<init>(r1, r2)
            r11.A01 = r0
        L_0x002b:
            if (r1 < r2) goto L_0x004b
            int r10 = r9.A00
            if (r10 <= 0) goto L_0x0068
            java.lang.String r0 = "eligibilityDurationAfterFirstImpression"
            java.lang.String r1 = X.A6F.A01(r5, r0)
            android.content.SharedPreferences r0 = r4.A00
            long r7 = X.C17890vO.A05(r0, r1)
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0068
            long r2 = r3.A00
            long r2 = r2 - r7
            long r0 = (long) r10
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 > 0) goto L_0x0068
        L_0x004b:
            X.9gz r3 = r9.A07
            if (r3 == 0) goto L_0x00bb
            X.9fz r0 = r3.A01
            if (r0 == 0) goto L_0x0084
            int r2 = r0.A00
            if (r2 <= 0) goto L_0x0084
            X.9Ik r6 = X.C179549Ik.PRIMARY_ACTION
            int r1 = r4.A03(r6, r5)
            if (r11 == 0) goto L_0x0066
            X.9cG r0 = new X.9cG
            r0.<init>(r1, r2)
            r11.A02 = r0
        L_0x0066:
            if (r1 < r2) goto L_0x0084
        L_0x0068:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Limit reached for counter: "
            r1.append(r0)
            java.lang.String r0 = r6.readableName
            java.lang.String r12 = X.AnonymousClass000.A0y(r0, r1)
            r9 = 0
            r14 = 0
            X.9hC r8 = new X.9hC
            r13 = r9
            r16 = r14
            r10 = r9
            r15 = r14
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
        L_0x0084:
            X.9fz r0 = r3.A02
            if (r0 == 0) goto L_0x009e
            int r2 = r0.A00
            if (r2 <= 0) goto L_0x009e
            X.9Ik r6 = X.C179549Ik.SECONDARY_ACTION
            int r1 = r4.A03(r6, r5)
            if (r11 == 0) goto L_0x009b
            X.9cG r0 = new X.9cG
            r0.<init>(r1, r2)
            r11.A03 = r0
        L_0x009b:
            if (r1 < r2) goto L_0x009e
            goto L_0x0068
        L_0x009e:
            X.9fz r0 = r3.A00
            if (r0 == 0) goto L_0x00bb
            int r2 = r0.A00
            if (r2 <= 0) goto L_0x00bb
            X.9Ik r6 = X.C179549Ik.DISMISS_ACTION
            int r1 = r4.A03(r6, r5)
            if (r11 == 0) goto L_0x00b5
            X.9cG r0 = new X.9cG
            r0.<init>(r1, r2)
            r11.A00 = r0
        L_0x00b5:
            if (r1 < r2) goto L_0x00bb
            goto L_0x0068
        L_0x00b8:
            r11 = 0
            goto L_0x0018
        L_0x00bb:
            X.9hC r8 = X.C196959vv.A01(r11)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21296Ahh.BCN(X.9ht, X.5YR):X.9hC");
    }

    public String CS6() {
        return "client_action_limit";
    }
}
