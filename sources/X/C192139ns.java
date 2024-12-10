package X;

/* renamed from: X.9ns  reason: invalid class name and case insensitive filesystem */
public class C192139ns {
    public AnonymousClass8b3 A00;

    public C19953A0k A00() {
        C164608Zm r1 = this.A00.senderChainKey_;
        C164608Zm r0 = r1;
        if (r1 == null) {
            r1 = C164608Zm.DEFAULT_INSTANCE;
        }
        int i = r1.iteration_;
        if (r0 == null) {
            r0 = C164608Zm.DEFAULT_INSTANCE;
        }
        return new C19953A0k(i, r0.seed_.A06());
    }

    public void A01(C19953A0k a0k) {
        C163948Wy r2 = (C163948Wy) C164608Zm.DEFAULT_INSTANCE.A0N();
        r2.A0G(a0k.A00);
        r2.A0H(AnonymousClass8BR.A0F(a0k.A01, 0));
        C164608Zm r3 = (C164608Zm) r2.A0C();
        C23624Bmt A07 = AnonymousClass8BS.A07(this.A00);
        AnonymousClass8b3 r1 = (AnonymousClass8b3) A07.A00;
        int i = AnonymousClass8b3.SENDERCHAINKEY_FIELD_NUMBER;
        r3.getClass();
        r1.senderChainKey_ = r3;
        r1.bitField0_ |= 2;
        this.A00 = (AnonymousClass8b3) A07.A0C();
    }

    public C192139ns(C21344AiX aiX, AnonymousClass3BW r7, byte[] bArr, int i, int i2) {
        C163948Wy r2 = (C163948Wy) C164608Zm.DEFAULT_INSTANCE.A0N();
        r2.A0G(i2);
        r2.A0H(AnonymousClass8BR.A0F(bArr, 0));
        C164608Zm r4 = (C164608Zm) r2.A0C();
        C23624Bmt A0N = C164628Zo.DEFAULT_INSTANCE.A0N();
        C23581BmB A0A = AnonymousClass8BU.A0A(A0N, aiX.A00(), 0);
        C164628Zo r1 = (C164628Zo) A0N.A00;
        r1.bitField0_ |= 1;
        r1.public_ = A0A;
        if (r7 instanceof AnonymousClass3K3) {
            C23581BmB A03 = C17900vP.A03(A0N, ((AnonymousClass9ZN) r7.A00()).A00);
            C164628Zo r12 = (C164628Zo) A0N.A00;
            r12.bitField0_ |= 2;
            r12.private_ = A03;
        }
        C23624Bmt A08 = AnonymousClass8BS.A08(AnonymousClass8b3.DEFAULT_INSTANCE);
        AnonymousClass8b3 r13 = (AnonymousClass8b3) A08.A00;
        r13.bitField0_ |= 1;
        r13.senderKeyId_ = i;
        AnonymousClass8b3 r14 = (AnonymousClass8b3) C17880vN.A0G(A08);
        r4.getClass();
        r14.senderChainKey_ = r4;
        r14.bitField0_ |= 2;
        AnonymousClass8b3 r15 = (AnonymousClass8b3) C17880vN.A0G(A08);
        C164628Zo r0 = (C164628Zo) A0N.A0C();
        r0.getClass();
        r15.senderSigningKey_ = r0;
        r15.bitField0_ |= 4;
        this.A00 = (AnonymousClass8b3) A08.A0C();
    }
}
