package X;

/* renamed from: X.9zI  reason: invalid class name and case insensitive filesystem */
public class C199019zI {
    public C165118ac A00;

    public static void A00(C163828Wm r4, int[] iArr, byte[][] bArr, int i) {
        C163948Wy r3 = (C163948Wy) C164608Zm.DEFAULT_INSTANCE.A0N();
        r3.A0G(iArr[i]);
        byte[] bArr2 = bArr[i];
        r3.A0H(DSQ.A01(bArr2, 0, bArr2.length));
        r4.A0G((C164608Zm) r3.A0C());
    }

    public void A01(A7F a7f) {
        byte[][] bArr = a7f.A01;
        int i = a7f.A00;
        int length = bArr.length;
        int[] A002 = C181969Sn.A00(i, length);
        C163828Wm r2 = (C163828Wm) this.A00.A0O();
        int i2 = C165118ac.SENDERCHAINKEYS_FIELD_NUMBER;
        ((C165118ac) C17880vN.A0G(r2)).senderChainKeys_ = C23579Bm9.A02;
        for (int i3 = 0; i3 < length; i3++) {
            A00(r2, A002, bArr, i3);
        }
        this.A00 = (C165118ac) r2.A0C();
    }

    public C199019zI(C21344AiX aiX, AnonymousClass3BW r7, byte[][] bArr, int i, int i2) {
        C23624Bmt A0N = C164628Zo.DEFAULT_INSTANCE.A0N();
        C23581BmB A03 = C17900vP.A03(A0N, aiX.A00());
        C164628Zo r1 = (C164628Zo) A0N.A00;
        r1.bitField0_ |= 1;
        r1.public_ = A03;
        if (r7 instanceof AnonymousClass3K3) {
            C23581BmB A032 = C17900vP.A03(A0N, ((AnonymousClass9ZN) r7.A00()).A00);
            C164628Zo r12 = (C164628Zo) A0N.A00;
            r12.bitField0_ |= 2;
            r12.private_ = A032;
        }
        C163828Wm r3 = (C163828Wm) C165118ac.DEFAULT_INSTANCE.A0N();
        C165118ac r13 = (C165118ac) C17880vN.A0G(r3);
        r13.bitField0_ |= 1;
        r13.senderKeyId_ = i;
        C165118ac r14 = (C165118ac) C17880vN.A0G(r3);
        C164628Zo r0 = (C164628Zo) A0N.A0C();
        r0.getClass();
        r14.senderSigningKey_ = r0;
        r14.bitField0_ |= 2;
        int length = bArr.length;
        int[] A002 = C181969Sn.A00(i2, length);
        for (int i3 = 0; i3 < length; i3++) {
            A00(r3, A002, bArr, i3);
        }
        this.A00 = (C165118ac) r3.A0C();
    }
}
