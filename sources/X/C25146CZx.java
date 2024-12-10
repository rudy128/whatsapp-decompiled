package X;

/* renamed from: X.CZx  reason: case insensitive filesystem */
public final class C25146CZx {
    public C25844Cn0 A00;
    public C26224CvE A01;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C26224CvE A01(java.util.List r14) {
        /*
            r13 = this;
            r3 = 0
            r11 = r14
            int r4 = r14.size()     // Catch:{ Exception -> 0x006a }
            r2 = 0
        L_0x0007:
            if (r2 >= r4) goto L_0x001b
            java.lang.Object r1 = r14.get(r2)     // Catch:{ Exception -> 0x006a }
            X.E3W r1 = (X.E3W) r1     // Catch:{ Exception -> 0x006a }
            X.Cn0 r0 = r13.A00     // Catch:{ Exception -> 0x0018 }
            r1.BCW(r0)     // Catch:{ Exception -> 0x0018 }
            int r2 = r2 + 1
            r3 = r1
            goto L_0x0007
        L_0x0018:
            r2 = move-exception
            r3 = r1
            goto L_0x006b
        L_0x001b:
            X.Cn0 r0 = r13.A00
            java.lang.String r2 = r0.toString()
            r1 = 6
            r0 = 0
            X.DRu r6 = new X.DRu
            r6.<init>(r0, r1, r2)
            X.Cn0 r7 = r13.A00
            int r1 = r7.A03
            int r0 = r7.A02
            long r2 = X.C25858CnM.A02(r1, r0)
            X.Cw5 r4 = new X.Cw5
            r4.<init>(r2)
            X.CvE r0 = r13.A01
            long r0 = r0.A00
            boolean r0 = X.C26260Cw5.A05(r0)
            if (r0 != 0) goto L_0x005d
            long r4 = r4.A00
        L_0x0043:
            int r1 = r7.A01
            r0 = -1
            if (r1 == r0) goto L_0x005b
            int r0 = r7.A00
            long r2 = X.C25858CnM.A02(r1, r0)
            X.Cw5 r1 = new X.Cw5
            r1.<init>(r2)
        L_0x0053:
            X.CvE r0 = new X.CvE
            r0.<init>((X.C27069DRu) r6, (X.C26260Cw5) r1, (long) r4)
            r13.A01 = r0
            return r0
        L_0x005b:
            r1 = 0
            goto L_0x0053
        L_0x005d:
            int r1 = X.C26260Cw5.A01(r2)
            int r0 = X.C26260Cw5.A02(r2)
            long r4 = X.C25858CnM.A02(r1, r0)
            goto L_0x0043
        L_0x006a:
            r2 = move-exception
        L_0x006b:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error while applying EditCommand batch to buffer (length="
            r6.append(r0)
            X.Cn0 r4 = r13.A00
            X.C6d r0 = r4.A04
            int r0 = r0.A00()
            r6.append(r0)
            java.lang.String r0 = ", composition="
            r6.append(r0)
            int r1 = r4.A01
            r0 = -1
            if (r1 == r0) goto L_0x00e5
            int r0 = r4.A00
            long r0 = X.C25858CnM.A02(r1, r0)
            X.Cw5 r4 = new X.Cw5
            r4.<init>(r0)
        L_0x0098:
            r6.append(r4)
            java.lang.String r0 = ", selection="
            r6.append(r0)
            X.Cn0 r0 = r13.A00
            int r1 = r0.A03
            int r0 = r0.A02
            long r4 = X.C25858CnM.A02(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "TextRange("
            r1.append(r0)
            int r0 = X.AnonymousClass000.A0G(r4)
            X.BE8.A1D(r1, r0)
            int r0 = X.AnonymousClass000.A0H(r4)
            java.lang.String r0 = X.AnonymousClass001.A1L(r1, r0)
            r6.append(r0)
            java.lang.String r0 = "):"
            X.C108985cd.A1L(r0, r6, r7)
            r0 = 10
            r7.append(r0)
            java.lang.String r8 = "\n"
            X.Dq8 r12 = new X.Dq8
            r12.<init>(r3, r13)
            java.lang.String r9 = ""
            r10 = r9
            X.C29431cG.A16(r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = X.C18070vi.A0H(r7)
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r2)
            throw r0
        L_0x00e5:
            r4 = 0
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25146CZx.A01(java.util.List):X.CvE");
    }

    public final C26224CvE A00() {
        return this.A01;
    }

    public final void A02(C26224CvE cvE, C25246Cbl cbl) {
        C26260Cw5 cw5;
        long j;
        C26260Cw5 cw52 = cvE.A02;
        C25844Cn0 cn0 = this.A00;
        int i = cn0.A01;
        if (i != -1) {
            cw5 = new C26260Cw5(C25858CnM.A02(i, cn0.A00));
        } else {
            cw5 = null;
        }
        boolean z = true;
        boolean z2 = !C18070vi.A18(cw52, cw5);
        C27069DRu dRu = this.A01.A01;
        C27069DRu dRu2 = cvE.A01;
        boolean z3 = false;
        if (!C18070vi.A18(dRu, dRu2)) {
            j = cvE.A00;
            this.A00 = new C25844Cn0(dRu2, j);
        } else {
            long j2 = this.A01.A00;
            j = cvE.A00;
            if (j2 == j) {
                z = false;
            } else {
                this.A00.A04(C26260Cw5.A02(j), C26260Cw5.A01(j));
                z = false;
                z3 = true;
            }
        }
        if (cw52 == null) {
            C25844Cn0 cn02 = this.A00;
            cn02.A01 = -1;
            cn02.A00 = -1;
        } else {
            long j3 = cw52.A00;
            if (!C26260Cw5.A04(j3)) {
                this.A00.A03(C26260Cw5.A02(j3), C26260Cw5.A01(j3));
            }
        }
        if (z || (!z3 && z2)) {
            C25844Cn0 cn03 = this.A00;
            cn03.A01 = -1;
            cn03.A00 = -1;
            cvE = new C26224CvE(dRu2, (C26260Cw5) null, j);
        }
        C26224CvE cvE2 = this.A01;
        this.A01 = cvE;
        if (cbl != null) {
            cbl.A03(cvE2, cvE);
        }
    }

    public C25146CZx() {
        C26224CvE cvE = new C26224CvE(C26069Crj.A00, (C26260Cw5) null, C26260Cw5.A01);
        this.A01 = cvE;
        this.A00 = new C25844Cn0(cvE.A01, cvE.A00);
    }
}
