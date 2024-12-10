package X;

/* renamed from: X.8y8  reason: invalid class name and case insensitive filesystem */
public final class C175148y8 extends AMB {
    public C22515BAy A00;
    public String A01;
    public String A02;
    public byte[] A03;
    public final AnonymousClass9IW A04;
    public final C29681ch A05;
    public final A6V A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175148y8(AnonymousClass9IW r1, AnonymousClass1PY r2, C29681ch r3, A6V a6v, C22515BAy bAy, AnonymousClass5Y9 r6, AnonymousClass10I r7, String str, String str2, byte[] bArr) {
        super(r2, r6, r7);
        C18070vi.A0s(r7, r2, r6, a6v);
        this.A06 = a6v;
        this.A05 = r3;
        this.A04 = r1;
        this.A00 = bAy;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = bArr;
    }

    public void cancel() {
        super.cancel();
        this.A00 = null;
    }
}
