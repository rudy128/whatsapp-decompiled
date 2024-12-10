package X;

/* renamed from: X.2TR  reason: invalid class name */
public abstract class AnonymousClass2TR {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085 A[Catch:{ 1UI -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e A[Catch:{ 1UI -> 0x009d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C64532uv A00(X.C29621ca r10) {
        /*
            java.lang.String r6 = "kyc-rejection-code"
            r5 = 0
            r3 = 0
            java.lang.String r0 = "kyc-state"
            java.lang.String r4 = r10.A0Q(r0, r3)     // Catch:{ 1UI -> 0x009d }
            java.lang.String r0 = "kyc-actions-requested"
            X.1ca r2 = r10.A0K(r0)     // Catch:{ 1UI -> 0x009d }
            if (r2 == 0) goto L_0x005d
            java.util.ArrayList r7 = X.AnonymousClass000.A13()     // Catch:{ 1UI -> 0x009d }
            java.lang.String r0 = "obligation"
            java.lang.String r1 = r2.A0P(r0)     // Catch:{ 1UI -> 0x009d }
            java.lang.String r0 = "upload-document"
            java.util.List r0 = r2.A0R(r0)     // Catch:{ 1UI -> 0x009d }
            X.C18070vi.A0X(r0)     // Catch:{ 1UI -> 0x009d }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ 1UI -> 0x009d }
        L_0x002a:
            boolean r0 = r9.hasNext()     // Catch:{ 1UI -> 0x009d }
            if (r0 == 0) goto L_0x005f
            X.1ca r8 = X.C17880vN.A0a(r9)     // Catch:{ 1UI -> 0x009d }
            java.lang.String r0 = "type"
            java.lang.String r8 = r8.A0P(r0)     // Catch:{ 1UI -> 0x009d }
            java.lang.String r0 = "PROOF_OF_IDENTITY"
            boolean r0 = r0.equals(r8)     // Catch:{ 1UI -> 0x009d }
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "UPLOAD_DOC_IDENTITY"
        L_0x0045:
            r7.add(r0)     // Catch:{ 1UI -> 0x009d }
            goto L_0x002a
        L_0x0049:
            java.lang.String r0 = "PROOF_OF_ADDRESS"
            boolean r0 = r0.equals(r8)     // Catch:{ 1UI -> 0x009d }
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "UPLOAD_DOC_ADDRESS"
            goto L_0x0045
        L_0x0054:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x009d }
            java.lang.String r0 = "PAY: KycActionsRequested/fromProtocolTreeNode non-supported action type: "
            X.C17900vP.A0e(r0, r8, r1)     // Catch:{ 1UI -> 0x009d }
        L_0x005d:
            r2 = r3
            goto L_0x007f
        L_0x005f:
            java.lang.String r0 = "verify-card"
            X.1ca r0 = r2.A0K(r0)     // Catch:{ 1UI -> 0x009d }
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "VERIFY_CARD"
            r7.add(r0)     // Catch:{ 1UI -> 0x009d }
        L_0x006d:
            java.lang.String r0 = "provide-ssn-last4"
            X.1ca r0 = r2.A0K(r0)     // Catch:{ 1UI -> 0x009d }
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = "PROVIDE_SSN_LAST4"
            r7.add(r0)     // Catch:{ 1UI -> 0x009d }
        L_0x007a:
            X.2uy r2 = new X.2uy     // Catch:{ 1UI -> 0x009d }
            r2.<init>(r1, r7)     // Catch:{ 1UI -> 0x009d }
        L_0x007f:
            java.lang.String r0 = r10.A0Q(r6, r3)     // Catch:{ 1UI -> 0x009d }
            if (r0 == 0) goto L_0x008e
            int r0 = r10.A0A(r6, r5)     // Catch:{ 1UI -> 0x009d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ 1UI -> 0x009d }
            goto L_0x008f
        L_0x008e:
            r1 = r3
        L_0x008f:
            if (r4 == 0) goto L_0x00a3
            boolean r0 = X.AnonymousClass1YF.A0T(r4)     // Catch:{ 1UI -> 0x009d }
            if (r0 != 0) goto L_0x00a3
            X.2uv r0 = new X.2uv     // Catch:{ 1UI -> 0x009d }
            r0.<init>(r2, r1, r4)     // Catch:{ 1UI -> 0x009d }
            return r0
        L_0x009d:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentKycInfo/fromProtocolTreeNode "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00a3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2TR.A00(X.1ca):X.2uv");
    }
}
