package X;

/* renamed from: X.8qA  reason: invalid class name and case insensitive filesystem */
public class C170528qA extends C20126A8l {
    public final long A00;
    public final String A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C170528qA(X.C19999A2n r10, java.lang.String r11, java.lang.String r12, long r13, long r15, boolean r17) {
        /*
            r9 = this;
            X.2rJ r1 = X.C62382rJ.A03
            java.lang.String r4 = "regular_low"
            r5 = 7
            X.C18070vi.A0l(r1, r4)
            r0 = r9
            r2 = r10
            r3 = r11
            r6 = r13
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r9.A01 = r12
            r9.A00 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170528qA.<init>(X.A2n, java.lang.String, java.lang.String, long, long, boolean):void");
    }

    public C163398Uv A08() {
        C163398Uv A08 = super.A08();
        C17960vV.A07(A08);
        C23624Bmt A0N = AnonymousClass8YK.DEFAULT_INSTANCE.A0N();
        long j = this.A00;
        AnonymousClass8YK r1 = (AnonymousClass8YK) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.lastStickerSentTs_ = j;
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        AnonymousClass8YK r12 = (AnonymousClass8YK) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0O.removeRecentStickerAction_ = r12;
        A0O.bitField0_ |= 268435456;
        return A08;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RemoveRecentStickerMutation{fileHash=");
        A10.append(this.A01);
        A10.append("; ts=");
        A10.append(this.A00);
        return AnonymousClass000.A0y("}", A10);
    }
}
