package X;

/* renamed from: X.8h3  reason: invalid class name */
public final class AnonymousClass8h3 extends C192169nv {
    public final C165178ai A00;
    public final byte[] A01;
    public final byte[] A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8h3(C166288ce r6, byte[] bArr, byte[] bArr2) {
        super(bArr2, bArr);
        C18070vi.A0d(bArr2, 2);
        this.A02 = bArr;
        this.A01 = bArr2;
        C23624Bmt A0N = C165178ai.DEFAULT_INSTANCE.A0N();
        AnonymousClass9JX r0 = AnonymousClass9JX.HSM_CONTROLLED;
        C165178ai r1 = (C165178ai) C17880vN.A0G(A0N);
        r1.keyType_ = r0.value;
        r1.bitField0_ |= 1;
        byte[] bArr3 = this.A01;
        C23624Bmt A0N2 = AnonymousClass8XS.DEFAULT_INSTANCE.A0N();
        C23581BmB A03 = C17900vP.A03(A0N2, bArr3);
        AnonymousClass8XS r12 = (AnonymousClass8XS) A0N2.A00;
        r12.bitField0_ |= 1;
        r12.encryptionIv_ = A03;
        AnonymousClass8XS r02 = (AnonymousClass8XS) A0N2.A0C();
        C165178ai r13 = (C165178ai) C17880vN.A0G(A0N);
        r02.getClass();
        r13.hsmControlledKeyData_ = r02;
        r13.bitField0_ |= 4;
        if (r6 != null) {
            C165178ai r14 = (C165178ai) C17880vN.A0G(A0N);
            r14.backupMetadata_ = r6;
            r14.bitField0_ |= 8;
        }
        this.A00 = (C165178ai) A0N.A0C();
    }
}
