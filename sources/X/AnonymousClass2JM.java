package X;

/* renamed from: X.2JM  reason: invalid class name */
public final class AnonymousClass2JM extends AUK {
    public final AnonymousClass1SI A00;
    public final C27091Ur A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2JM(AnonymousClass1SI r1, C27091Ur r2, AnonymousClass00H r3) {
        super(r3);
        C18070vi.A0o(r2, r3, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BDZ(C195629te r6, AnonymousClass8X1 r7, AnonymousClass206 r8) {
        C18070vi.A0n(r8, r7, r6);
        super.BDZ(r6, r7, r8);
        AnonymousClass219 r82 = (AnonymousClass219) r8;
        int i = r82.A00;
        C166388co A0X = C17880vN.A0X(r7);
        A0X.bitField0_ |= 65536;
        A0X.duration_ = i;
        C60072nL r4 = r82.A02;
        if (r4 != null) {
            long A04 = C17880vN.A04(r4.A05 - r82.A0I);
            AnonymousClass8TE r1 = (AnonymousClass8TE) C165968c8.DEFAULT_INSTANCE.A0N();
            C27091Ur.A00(r1, r4, Integer.valueOf((int) A04));
            C166388co r2 = (C166388co) C17880vN.A0G(r7);
            C165968c8 r0 = (C165968c8) r1.A0C();
            r0.getClass();
            r2.finalLiveLocation_ = r0;
            r2.bitField0_ |= 262144;
        }
    }
}
