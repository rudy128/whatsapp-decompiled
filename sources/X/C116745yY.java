package X;

import java.util.Set;

/* renamed from: X.5yY  reason: invalid class name and case insensitive filesystem */
public final class C116745yY extends C42601yR {
    public final AnonymousClass1TG A00;
    public final C24661Le A01;
    public final C24641Lc A02;
    public final C123476Up A03;
    public final Set A04 = C17880vN.A14();
    public final Set A05 = C17880vN.A14();
    public final Set A06 = C17880vN.A14();
    public final Set A07 = C17880vN.A14();

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r1.A0f == false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A02() {
        /*
            r7 = this;
            X.1TG r4 = r7.A00
            X.1E5 r1 = X.AnonymousClass1E5.A00
            r0 = -1
            java.util.ArrayList r5 = r4.A04(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetMyStatusStateTask/getStatusMessages "
            X.C17900vP.A0Y(r5, r0, r1)
            java.util.Iterator r3 = r5.iterator()
        L_0x0016:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005b
            X.206 r2 = X.C17880vN.A0Y(r3)
            int r1 = r2.A0D()
            r0 = 20
            if (r1 == r0) goto L_0x0055
            boolean r0 = X.AnonymousClass25A.A0p(r2)
            if (r0 == 0) goto L_0x0039
            java.util.Set r1 = r7.A04
        L_0x0030:
            X.205 r0 = r2.A0v
            X.C18070vi.A0W(r0)
            r1.add(r0)
            goto L_0x0016
        L_0x0039:
            r0 = 4
            boolean r0 = X.C446824j.A02(r1, r0)
            if (r0 == 0) goto L_0x0043
            java.util.Set r1 = r7.A07
            goto L_0x0030
        L_0x0043:
            boolean r0 = r2 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0058
            X.21V r2 = (X.AnonymousClass21V) r2
            X.2rc r1 = r2.A02
            if (r1 == 0) goto L_0x0058
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x0058
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x0058
        L_0x0055:
            java.util.Set r1 = r7.A05
            goto L_0x0030
        L_0x0058:
            java.util.Set r1 = r7.A06
            goto L_0x0030
        L_0x005b:
            X.1Le r6 = r7.A01
            X.2sx r3 = r6.A07()
            if (r3 == 0) goto L_0x00a0
            int r1 = r3.A00()
            int r0 = r5.size()
            if (r1 == r0) goto L_0x00a0
            X.1Lc r0 = r7.A02
            X.0ve r2 = r0.A01
            r1 = 9706(0x25ea, float:1.3601E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00a0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetMyStatusStateTask/data inconsistency/calling regenerateStatusInfoWithMessagesAndUpdate/totalCount: "
            r1.append(r0)
            int r0 = r3.A00()
            r1.append(r0)
            java.lang.String r0 = ", messagesSize: "
            X.C17890vO.A14(r0, r1, r5)
            X.C17890vO.A0w(r1)
            X.2sx r2 = X.AnonymousClass1TG.A00(r3, r4, r5)
            if (r2 == 0) goto L_0x00a0
            X.1Le r1 = r4.A0F
            com.whatsapp.jid.UserJid r0 = r3.A0A
            r1.A0D(r2, r0)
        L_0x00a0:
            java.util.Set r4 = r7.A05
            java.util.Set r2 = r7.A06
            java.util.Set r1 = r7.A04
            java.util.Set r0 = r7.A07
            X.6nP r3 = new X.6nP
            r3.<init>(r4, r2, r1, r0)
            X.2sx r0 = r6.A07()
            if (r0 == 0) goto L_0x00bf
            X.2sx r2 = r0.A06()
        L_0x00b7:
            X.6Up r1 = r7.A03
            X.6nQ r0 = new X.6nQ
            r0.<init>(r2, r1, r3, r5)
            return r0
        L_0x00bf:
            r2 = 0
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116745yY.A02():java.lang.Object");
    }

    public C116745yY(AnonymousClass1TG r2, C24661Le r3, C24641Lc r4, C123476Up r5) {
        C18070vi.A0o(r3, r2, r4);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
    }
}
