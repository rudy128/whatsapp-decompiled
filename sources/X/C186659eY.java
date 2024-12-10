package X;

/* renamed from: X.9eY  reason: invalid class name and case insensitive filesystem */
public class C186659eY {
    public final long A00;
    public final long A01;
    public final AnonymousClass205 A02;
    public final boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0052, code lost:
        if (r3 > 0) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C186659eY(android.database.Cursor r7, X.AnonymousClass1BI r8) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "key_id"
            java.lang.String r1 = X.C17890vO.A0S(r7, r0)
            java.lang.String r0 = "from_me"
            int r0 = X.C17890vO.A01(r7, r0)
            r4 = 0
            r3 = 1
            boolean r2 = X.AnonymousClass000.A1T(r0, r3)
            X.205 r0 = X.AnonymousClass205.A01(r8, r1, r2)
            r6.A02 = r0
            java.lang.String r0 = "_id"
            int r0 = r7.getColumnIndexOrThrow(r0)
            r7.getLong(r0)
            java.lang.String r0 = "sort_id"
            long r0 = X.C17890vO.A06(r7, r0)
            r6.A00 = r0
            java.lang.String r0 = "starred"
            int r0 = X.C17890vO.A01(r7, r0)
            if (r0 != r3) goto L_0x0035
            r4 = 1
        L_0x0035:
            r6.A03 = r4
            java.lang.String r5 = "timestamp"
            if (r2 == 0) goto L_0x0055
            java.lang.String r0 = "status"
            int r0 = X.C17890vO.A01(r7, r0)
            r1 = 0
            if (r0 != 0) goto L_0x004a
            r3 = 0
        L_0x0047:
            r6.A01 = r3
            return
        L_0x004a:
            java.lang.String r0 = "receipt_server_timestamp"
            long r3 = X.C17890vO.A06(r7, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0055
            goto L_0x0047
        L_0x0055:
            long r3 = X.C17890vO.A06(r7, r5)
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C186659eY.<init>(android.database.Cursor, X.1BI):void");
    }
}
