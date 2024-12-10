package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.8ps  reason: invalid class name and case insensitive filesystem */
public final class C170448ps extends C170598qH implements C22443B7z {
    public final boolean A00;
    public final String[] A01;
    public final boolean A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C170448ps(X.C19999A2n r15, X.AnonymousClass1BI r16, java.lang.String r17, long r18, boolean r20, boolean r21) {
        /*
            r14 = this;
            X.2rJ r5 = X.C62382rJ.A03
            java.lang.String r9 = "regular_low"
            r10 = 7
            r4 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r11 = r18
            r13 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13)
            r3 = r21
            r14.A00 = r3
            java.lang.String[] r2 = X.C17880vN.A1Z()
            r1 = 0
            java.lang.String r0 = "lock"
            r2[r1] = r0
            r0 = 1
            X.C17880vN.A1J(r7, r2, r0)
            r14.A01 = r2
            r0 = r21 ^ 1
            r14.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170448ps.<init>(X.A2n, X.1BI, java.lang.String, long, boolean, boolean):void");
    }

    public C163398Uv A08() {
        C163398Uv A08 = super.A08();
        C23624Bmt A0N = AnonymousClass8Y9.DEFAULT_INSTANCE.A0N();
        boolean z = this.A00;
        AnonymousClass8Y9 r1 = (AnonymousClass8Y9) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.locked_ = z;
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        AnonymousClass8Y9 r12 = (AnonymousClass8Y9) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0O.lockChatAction_ = r12;
        A0O.bitField1_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        return A08;
    }

    public boolean Bgp() {
        return this.A02;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C20126A8l.A05(this, "LockChatMutation {\n         rowId=", A10);
        C20126A8l.A00(this, ",\n         chatJid=", A10);
        A10.append(",\n         isLocked=");
        A10.append(this.A00);
        C20126A8l.A02(this, ",\n         timestamp=", A10);
        C20126A8l.A03(this, ",\n         areDependenciesMissing=", A10);
        C20126A8l.A04(this, ",\n         operation=", A10);
        C20126A8l.A01(this, ",\n         collectionName=", A10);
        C20126A8l.A06(this, ",\n         keyId=", A10);
        return AnonymousClass8BW.A0k(",\n         }", A10);
    }
}
