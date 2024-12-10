package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.8q1  reason: invalid class name */
public final class AnonymousClass8q1 extends AnonymousClass8q2 implements C22443B7z {
    public final boolean A00;
    public final String[] A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C18070vi.A18(getClass(), C108975cc.A0R(obj)) || !super.equals(obj)) {
            return false;
        }
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.data.sync.ArchiveChatMutation");
        return this.A00 == ((AnonymousClass8q1) obj).A00;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8q1(X.C19999A2n r16, X.A7L r17, X.AnonymousClass1BI r18, java.lang.String r19, long r20, boolean r22, boolean r23) {
        /*
            r15 = this;
            X.2rJ r5 = X.C62382rJ.A03
            java.lang.String r10 = "regular_low"
            r11 = 3
            r4 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r12 = r20
            r14 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14)
            r3 = r22
            r15.A00 = r3
            java.lang.String[] r2 = X.C17880vN.A1Z()
            r1 = 0
            java.lang.String r0 = "archive"
            r2[r1] = r0
            r0 = 1
            X.C17880vN.A1J(r8, r2, r0)
            r15.A01 = r2
            r0 = r22 ^ 1
            r15.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8q1.<init>(X.A2n, X.A7L, X.1BI, java.lang.String, long, boolean, boolean):void");
    }

    public C163398Uv A08() {
        C23624Bmt A0N = AnonymousClass8ZV.DEFAULT_INSTANCE.A0N();
        boolean z = this.A00;
        AnonymousClass8ZV r1 = (AnonymousClass8ZV) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.archived_ = z;
        C165018aS A04 = this.A00.A04();
        AnonymousClass8ZV r12 = (AnonymousClass8ZV) C17880vN.A0G(A0N);
        A04.getClass();
        r12.messageRange_ = A04;
        r12.bitField0_ |= 2;
        C163398Uv A08 = super.A08();
        C17960vV.A07(A08);
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        AnonymousClass8ZV r13 = (AnonymousClass8ZV) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r13.getClass();
        A0O.archiveChatAction_ = r13;
        A0O.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        return A08;
    }

    public boolean Bgp() {
        return this.A02;
    }

    public int hashCode() {
        return C17880vN.A01(super.hashCode() * 31, this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C20126A8l.A05(this, "ArchiveChatMutation {\n        rowId=", A10);
        C20126A8l.A00(this, ",\n        chatJid=", A10);
        A10.append(",\n        isArchived=");
        A10.append(this.A00);
        A10.append(",\n        messageRange=");
        A10.append(this.A00);
        C20126A8l.A02(this, ",\n        timestamp=", A10);
        C20126A8l.A03(this, ",\n        areDependenciesMissing=", A10);
        C20126A8l.A04(this, ",\n        operation=", A10);
        C20126A8l.A01(this, ",\n        collectionName=", A10);
        C20126A8l.A06(this, ",\n        keyId=", A10);
        return AnonymousClass8BW.A0k(",\n       }", A10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass8q1(A7L a7l, AnonymousClass1BI r11, long j, boolean z) {
        this((C19999A2n) null, a7l, r11, (String) null, j, z, true);
        C18070vi.A0d(r11, 1);
    }
}
