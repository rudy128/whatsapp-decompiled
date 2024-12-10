package X;

/* renamed from: X.8y7  reason: invalid class name and case insensitive filesystem */
public final class C175138y7 extends AMB {
    public C22515BAy A00;
    public final C32991i5 A01;
    public final C20131A8r A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175138y7(C32991i5 r1, AnonymousClass1PY r2, C22515BAy bAy, AnonymousClass5Y9 r4, C20131A8r a8r, AnonymousClass10I r6, String str, String str2, byte[] bArr) {
        super(r2, r4, r6);
        C18070vi.A0w(r6, r2, r4, r1, a8r);
        this.A01 = r1;
        this.A02 = a8r;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = bArr;
        this.A00 = bAy;
    }

    public void cancel() {
        super.cancel();
        this.A00 = null;
    }
}
