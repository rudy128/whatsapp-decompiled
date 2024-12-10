package X;

/* renamed from: X.6mM  reason: invalid class name and case insensitive filesystem */
public final class C132196mM {
    public final /* synthetic */ C134426qZ A00;
    public final /* synthetic */ C136316tc A01;

    public C132196mM(C134426qZ r1, C136316tc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(C147347Su r9) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostRequestSessionManager/Crosspost failed for session: ");
        C136316tc r1 = this.A01;
        String str = r1.A04;
        A10.append(str);
        A10.append(" with exception: ");
        C108995ce.A1K(r9, A10);
        this.A00.A01(r9, AnonymousClass00R.A0C, str, r1.A02, r1.A00);
    }
}
