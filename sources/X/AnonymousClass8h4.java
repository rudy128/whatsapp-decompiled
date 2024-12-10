package X;

/* renamed from: X.8h4  reason: invalid class name */
public final class AnonymousClass8h4 extends AnonymousClass8h5 {
    public final C165178ai A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8h4(C191279mJ r6, C166288ce r7, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(r6, bArr, bArr2, bArr3);
        C18070vi.A0d(bArr3, 4);
        C23624Bmt A0N = C165178ai.DEFAULT_INSTANCE.A0N();
        AnonymousClass9JX r0 = AnonymousClass9JX.WA_PROVIDED;
        C165178ai r1 = (C165178ai) C17880vN.A0G(A0N);
        r1.keyType_ = r0.value;
        r1.bitField0_ |= 1;
        C23624Bmt A0N2 = C165468bC.DEFAULT_INSTANCE.A0N();
        C23581BmB A03 = C17900vP.A03(A0N2, r6.A03);
        C165468bC r12 = (C165468bC) A0N2.A00;
        r12.bitField0_ |= 1;
        r12.backupCipherHeader_ = A03;
        String str = r6.A00;
        C165468bC r13 = (C165468bC) C17880vN.A0G(A0N2);
        str.getClass();
        r13.bitField0_ |= 2;
        r13.keyVersion_ = str;
        C23581BmB A032 = C17900vP.A03(A0N2, r6.A04);
        C165468bC r14 = (C165468bC) A0N2.A00;
        r14.bitField0_ |= 4;
        r14.serverSalt_ = A032;
        C23581BmB A033 = C17900vP.A03(A0N2, r6.A02);
        C165468bC r15 = (C165468bC) A0N2.A00;
        r15.bitField0_ |= 8;
        r15.googleIdSalt_ = A033;
        C23581BmB A034 = C17900vP.A03(A0N2, r6.A01);
        C165468bC r16 = (C165468bC) A0N2.A00;
        r16.bitField0_ |= 16;
        r16.encryptionIv_ = A034;
        C165468bC r02 = (C165468bC) A0N2.A0C();
        C165178ai r17 = (C165178ai) C17880vN.A0G(A0N);
        r02.getClass();
        r17.waProvidedKeyData_ = r02;
        r17.bitField0_ |= 2;
        if (r7 != null) {
            C165178ai r18 = (C165178ai) C17880vN.A0G(A0N);
            r18.backupMetadata_ = r7;
            r18.bitField0_ |= 8;
        }
        this.A00 = (C165178ai) A0N.A0C();
    }
}
