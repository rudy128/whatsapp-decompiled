package X;

/* renamed from: X.2qc  reason: invalid class name and case insensitive filesystem */
public final class C61992qc {
    public final AnonymousClass11S A00;
    public final C61302pS A01;
    public final C52772bS A02;

    public static final void A00(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw AnonymousClass000.A0k("expected media key of length 32 bytes.");
        } else if (bArr2.length != 12) {
            throw AnonymousClass000.A0k("expected iv of length 12 bytes.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass1BI r12, com.whatsapp.jid.Jid r13, com.whatsapp.jid.UserJid r14, X.AnonymousClass21V r15, java.lang.String r16, java.lang.String r17, int r18, boolean r19) {
        /*
            r11 = this;
            r5 = r16
            X.C18070vi.A0k(r13, r5)
            r4 = 1
            r8 = r18
            if (r8 == r4) goto L_0x0017
            X.11S r1 = r11.A00
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass1E0.A00(r13)
            boolean r0 = r1.A0P(r0)
            if (r0 != 0) goto L_0x0017
            return
        L_0x0017:
            r1 = 0
            if (r15 == 0) goto L_0x00e5
            r0 = 12
            byte[] r9 = X.C17970vW.A0I(r0)
            X.2rc r0 = X.AnonymousClass206.A00(r15)
            byte[] r3 = r0.A0a
            X.C17960vV.A07(r3)
            X.C18070vi.A0X(r3)
            X.205 r0 = r15.A0v
            java.lang.String r2 = r0.A01
            if (r8 != r4) goto L_0x0034
            r1 = r17
        L_0x0034:
            X.2pL r0 = new X.2pL
            r0.<init>(r2, r1, r8)
            X.C18070vi.A0X(r2)
            A00(r3, r9)
            r1 = 2
            com.facebook.simplejni.NativeHolder r0 = r0.A00
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOOO(r1, r2, r0, r3, r9)
            byte[] r1 = (byte[]) r1
        L_0x0048:
            X.2pS r4 = r11.A01
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.lang.String r0 = "id"
            X.C17890vO.A11(r0, r5, r3)
            java.lang.String r0 = "to"
            X.C17890vO.A0n(r13, r0, r3)
            java.lang.String r2 = "type"
            java.lang.String r0 = "mediaretry"
            X.C17890vO.A11(r2, r0, r3)
            java.lang.String r7 = "participant"
            if (r14 == 0) goto L_0x0068
            X.C17890vO.A0n(r14, r7, r3)
        L_0x0068:
            r0 = 2
            java.util.ArrayList r6 = X.C17880vN.A0z(r0)
            r5 = 0
            r10 = 1
            if (r1 == 0) goto L_0x00d0
            if (r9 == 0) goto L_0x00d0
            X.1ca[] r8 = new X.C29621ca[r0]
            java.lang.String r0 = "enc_p"
            r2 = 0
            X.C29621ca.A06(r0, r1, r8, r5)
            java.lang.String r0 = "enc_iv"
            X.C29621ca.A06(r0, r9, r8, r10)
            java.lang.String r0 = "encrypt"
            X.1ca r1 = new X.1ca
            r1.<init>((java.lang.String) r0, (X.AnonymousClass1MD[]) r2, (X.C29621ca[]) r8)
        L_0x0087:
            r6.add(r1)
        L_0x008a:
            if (r12 == 0) goto L_0x00b1
            r0 = 3
            java.util.ArrayList r2 = X.C17880vN.A0z(r0)
            java.lang.String r0 = "jid"
            X.C17890vO.A0n(r12, r0, r2)
            java.lang.String r1 = "from_me"
            java.lang.String r0 = java.lang.String.valueOf(r19)
            X.C17890vO.A11(r1, r0, r2)
            if (r14 == 0) goto L_0x00a4
            X.C17890vO.A0n(r14, r7, r2)
        L_0x00a4:
            X.1MD[] r0 = X.C61302pS.A01
            java.lang.Object[] r1 = r2.toArray(r0)
            X.1MD[] r1 = (X.AnonymousClass1MD[]) r1
            java.lang.String r0 = "rmr"
            X.C29621ca.A05(r0, r6, r1)
        L_0x00b1:
            X.1MD[] r0 = X.C61302pS.A01
            java.lang.Object[] r3 = r3.toArray(r0)
            X.1MD[] r3 = (X.AnonymousClass1MD[]) r3
            X.1ca[] r1 = X.C17890vO.A1Y(r6, r5)
            java.lang.String r0 = "notification"
            X.1ca r2 = new X.1ca
            r2.<init>((java.lang.String) r0, (X.AnonymousClass1MD[]) r3, (X.C29621ca[]) r1)
            X.00H r0 = r4.A00
            X.1OZ r1 = X.C17880vN.A0U(r0)
            r0 = 34
            r1.A0O(r2, r0)
            return
        L_0x00d0:
            if (r8 == r10) goto L_0x008a
            X.1MD[] r2 = new X.AnonymousClass1MD[r10]
            java.lang.String r1 = "code"
            X.1MD r0 = new X.1MD
            r0.<init>((java.lang.String) r1, (int) r8)
            r2[r5] = r0
            java.lang.String r0 = "error"
            X.1ca r1 = new X.1ca
            r1.<init>(r0, r2)
            goto L_0x0087
        L_0x00e5:
            r9 = r1
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61992qc.A01(X.1BI, com.whatsapp.jid.Jid, com.whatsapp.jid.UserJid, X.21V, java.lang.String, java.lang.String, int, boolean):void");
    }

    public C61992qc(AnonymousClass11S r1, C61302pS r2, C52772bS r3) {
        C18070vi.A0j(r1, r3);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
