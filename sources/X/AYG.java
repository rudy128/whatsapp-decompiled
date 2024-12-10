package X;

public final class AYG implements BBC {
    public final /* synthetic */ A0J A00;
    public final /* synthetic */ AnonymousClass205 A01;

    public AYG(A0J a0j, AnonymousClass205 r2) {
        this.A00 = a0j;
        this.A01 = r2;
    }

    public void Bss(A7B a7b) {
        A0J a0j = this.A00;
        AnonymousClass1QE r3 = a0j.A03;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error fetching checkout session for ");
        AnonymousClass205 r2 = this.A01;
        r3.A05(C17890vO.A0V(r2, A10));
        ((AnonymousClass9AY) a0j.A07.get()).A0B(r2, "UPI");
        A0J.A00(a7b, a0j, r2, (AnonymousClass9FM) null);
    }

    public void C3k(AnonymousClass9FM r6) {
        A0J a0j = this.A00;
        AnonymousClass1QE r3 = a0j.A03;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Caching checkout session for ");
        AnonymousClass205 r2 = this.A01;
        r3.A07(C17890vO.A0V(r2, A10));
        ((AnonymousClass9AY) a0j.A07.get()).A0A(r2, r6, "UPI");
        A0J.A00((A7B) null, a0j, r2, r6);
    }
}
