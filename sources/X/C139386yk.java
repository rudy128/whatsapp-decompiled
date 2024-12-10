package X;

import android.content.Context;

/* renamed from: X.6yk  reason: invalid class name and case insensitive filesystem */
public final class C139386yk {
    public AnonymousClass6MD A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11E A02;
    public final C678831f A03;
    public final C131906lr A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07 = C217517g.A00(16425);
    public final C36361nl A08;
    public final AnonymousClass11C A09;
    public final C18030ve A0A;
    public final AnonymousClass00H A0B;

    public final C114675rb A01(Context context, AnonymousClass206 r13, String str) {
        AnonymousClass206 r9 = r13;
        C18070vi.A0d(r13, 2);
        Context context2 = context;
        if (context == null) {
            return null;
        }
        if (!C18020vd.A05(C18040vf.A02, this.A0A, 1215)) {
            return null;
        }
        String str2 = str;
        if (!AnonymousClass1YE.A0A(str, "tel", false)) {
            return null;
        }
        return new C114675rb(context2, this.A01, this.A08, this, this.A09, r9, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r0.A04 != 1) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008b, code lost:
        if ((r1.A01 & 4) != 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c7, code lost:
        if (r17 != null) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r16, android.util.Pair r17, X.C139386yk r18, X.AnonymousClass1BI r19, java.lang.String r20, java.lang.String r21, boolean r22) {
        /*
            r9 = r20
            r5 = 1
            r4 = r17
            if (r17 == 0) goto L_0x00cd
            java.lang.Object r0 = r4.first
            X.2rf r0 = (X.C62602rf) r0
            if (r0 == 0) goto L_0x00cd
            boolean r0 = r0.A00()
            r12 = r0 ^ 1
        L_0x0013:
            r7 = 0
            if (r17 == 0) goto L_0x0021
            java.lang.Object r0 = r4.second
            X.9i3 r0 = (X.C188829i3) r0
            if (r0 == 0) goto L_0x0021
            int r0 = r0.A04
            r13 = 1
            if (r0 == r5) goto L_0x0022
        L_0x0021:
            r13 = 0
        L_0x0022:
            r2 = r18
            X.6lr r6 = r2.A04
            r14 = r22
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r14)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            r0 = 3
            r6.A00(r3, r1, r0)
            r3 = 0
            if (r17 == 0) goto L_0x00c6
            java.lang.Object r0 = r4.second
            X.9i3 r0 = (X.C188829i3) r0
            if (r0 == 0) goto L_0x00c6
            com.whatsapp.jid.UserJid r8 = r0.A0D
        L_0x003f:
            java.lang.Object r0 = r4.second
            X.9i3 r0 = (X.C188829i3) r0
            if (r0 == 0) goto L_0x00cb
            X.9ed r0 = r0.A09
            if (r0 == 0) goto L_0x00cb
            X.9dG r0 = r0.A00
            if (r0 == 0) goto L_0x00cb
            X.1ya r0 = r0.A01
            if (r0 == 0) goto L_0x00cb
            int r1 = r0.hostStorage
            r0 = 2
            if (r1 != r0) goto L_0x0057
            r7 = 1
        L_0x0057:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
        L_0x005b:
            boolean r0 = X.C18070vi.A19(r0, r5)
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r0 = r4.second
            X.9i3 r0 = (X.C188829i3) r0
            if (r0 == 0) goto L_0x008d
            X.9ed r4 = r0.A09
            if (r4 == 0) goto L_0x008d
            X.1ca r1 = r4.A03
            if (r1 == 0) goto L_0x008d
            java.lang.String r0 = "profile"
            X.1ca r1 = r1.A0K(r0)
            if (r1 == 0) goto L_0x008d
            com.whatsapp.jid.UserJid r0 = r4.A02
            X.C18070vi.A0W(r0)
            X.AEW r1 = X.A82.A01(r0, r1)
            if (r1 == 0) goto L_0x008d
            boolean r0 = r1.A0W
            if (r0 == 0) goto L_0x008d
            int r0 = r1.A01
            r0 = r0 & 4
            r15 = 1
            if (r0 == 0) goto L_0x008e
        L_0x008d:
            r15 = 0
        L_0x008e:
            java.lang.String r0 = X.AnonymousClass17K.A05(r8)
            if (r0 == 0) goto L_0x0095
            r9 = r0
        L_0x0095:
            X.C18070vi.A0b(r9)
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r1 = X.C36321nh.A00(r19)
            if (r1 == 0) goto L_0x00c2
            X.00H r0 = r2.A0B
            java.lang.Object r0 = r0.get()
            X.1MZ r0 = (X.AnonymousClass1MZ) r0
            X.1MW r0 = r0.A08
            int r11 = r0.A0A(r1)
        L_0x00ae:
            r10 = r21
            com.whatsapp.PhoneHyperLinkDialogFragment r2 = com.whatsapp.PhoneHyperLinkDialogFragment.A00(r8, r9, r10, r11, r12, r13, r14, r15)
            X.1FU r1 = X.C108985cd.A0L(r16)
            boolean r0 = r1.Bed()
            if (r0 != 0) goto L_0x00c1
            r1.CMk(r2, r3)
        L_0x00c1:
            return
        L_0x00c2:
            r11 = -1
            goto L_0x00ae
        L_0x00c4:
            r15 = 1
            goto L_0x008e
        L_0x00c6:
            r8 = r3
            if (r17 == 0) goto L_0x00cb
            goto L_0x003f
        L_0x00cb:
            r0 = r3
            goto L_0x005b
        L_0x00cd:
            r12 = 1
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139386yk.A00(android.content.Context, android.util.Pair, X.6yk, X.1BI, java.lang.String, java.lang.String, boolean):void");
    }

    public C139386yk(AnonymousClass1KB r2, C36361nl r3, AnonymousClass11E r4, C678831f r5, C131906lr r6, AnonymousClass11C r7, C18030ve r8, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        C18070vi.A0w(r8, r2, r7, r3, r9);
        C18070vi.A0x(r4, r10, r5, r6, r11);
        this.A0A = r8;
        this.A01 = r2;
        this.A09 = r7;
        this.A08 = r3;
        this.A05 = r9;
        this.A02 = r4;
        this.A06 = r10;
        this.A03 = r5;
        this.A04 = r6;
        this.A0B = r11;
    }
}
