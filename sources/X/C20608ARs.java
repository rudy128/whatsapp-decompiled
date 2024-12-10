package X;

/* renamed from: X.ARs  reason: case insensitive filesystem */
public final class C20608ARs implements BCV {
    public final /* synthetic */ C20119A8c A00;
    public final /* synthetic */ A2N A01;
    public final /* synthetic */ C195709tm A02;
    public final /* synthetic */ C22521BBe A03;

    public C20608ARs(C20119A8c a8c, A2N a2n, C195709tm r3, C22521BBe bBe) {
        this.A00 = a8c;
        this.A01 = a2n;
        this.A02 = r3;
        this.A03 = bBe;
    }

    public void Bki() {
        C20119A8c a8c = this.A00;
        C20081A6h A0V = AnonymousClass8BR.A0V(a8c.A0M);
        String str = this.A01.A05;
        A0V.A08(str.hashCode(), 105);
        C20119A8c.A05(a8c, this.A03, "Download aborted", str);
    }

    public /* bridge */ /* synthetic */ void Bsy(Integer num) {
        C20119A8c a8c = this.A00;
        C20081A6h A0V = AnonymousClass8BR.A0V(a8c.A0M);
        String str = this.A01.A05;
        A0V.A08(str.hashCode(), 3);
        C20119A8c.A05(a8c, this.A03, "Download failed", str);
    }

    public /* bridge */ /* synthetic */ void C8h(Integer num) {
        C20119A8c a8c = this.A00;
        C20081A6h A0V = AnonymousClass8BR.A0V(a8c.A0M);
        String str = this.A01.A05;
        A0V.A08(str.hashCode(), 3);
        C20119A8c.A05(a8c, this.A03, "Download timed out", str);
    }

    public void onSuccess() {
        C20119A8c a8c = this.A00;
        A2N a2n = this.A01;
        String str = a2n.A05;
        ((C192239o2) a8c.A0H.get()).A00(str, str.hashCode()).A09(new C21120Aeo(a2n, a8c, this.A02, this.A03, 4));
    }
}
