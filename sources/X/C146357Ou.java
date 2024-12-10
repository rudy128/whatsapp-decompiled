package X;

import java.util.List;

/* renamed from: X.7Ou  reason: invalid class name and case insensitive filesystem */
public final class C146357Ou implements AnonymousClass8A1 {
    public final /* synthetic */ C134426qZ A00;
    public final /* synthetic */ C140116zy A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public C146357Ou(C134426qZ r1, C140116zy r2, String str, List list) {
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = list;
    }

    public void BrA() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostRequestSessionManager/eligibility retry delivery failure for session: ");
        String str = this.A02;
        C108995ce.A1O(A10, str);
        this.A00.A02(AnonymousClass00R.A00, str);
    }

    public void Bsv(C147347Su r8) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostRequestSessionManager/eligibility retry error for session: ");
        String str = this.A02;
        A10.append(str);
        A10.append(" with exception:");
        C108995ce.A1K(r8, A10);
        this.A00.A01(r8, AnonymousClass00R.A00, str, this.A03, 10);
    }

    public void C7P(C136316tc r3, C136456tq r4) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostRequestSessionManager/eligibility retry success for session: ");
        C108995ce.A1O(A10, this.A02);
        C140116zy.A00(this.A00, this.A01, r3, r4);
    }
}
