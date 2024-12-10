package X;

/* renamed from: X.ATp  reason: case insensitive filesystem */
public final class C20657ATp implements AnonymousClass87E {
    public final String A00;
    public final C184089aO A01;
    public final String A02;
    public final String A03;

    public C20657ATp(C184089aO r2, String str, String str2) {
        C18070vi.A0d(str, 2);
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = str;
    }

    public AnonymousClass8AB BGW(String str) {
        C18070vi.A0d(str, 0);
        C184089aO r0 = this.A01;
        C183099Wx r1 = r0.A00;
        long j = r0.A01.A00;
        String str2 = this.A02;
        String str3 = this.A03;
        C172578te BHl = r1.A00.BHl(str, str2, str3, j);
        C18070vi.A0z(BHl, "null cannot be cast to non-null type T of com.whatsapp.bloks.networking.GraphqlBloksRequestProvider");
        return BHl;
    }
}
