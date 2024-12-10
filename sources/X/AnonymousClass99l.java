package X;

import java.util.Set;

/* renamed from: X.99l  reason: invalid class name */
public final class AnonymousClass99l extends AUL {
    public final C32451hD A00;
    public final AnonymousClass00H A01;

    public void BDZ(C195629te r4, AnonymousClass8X1 r5, AnonymousClass206 r6) {
        AnonymousClass23N r1;
        C18070vi.A0d(r6, 0);
        C18070vi.A0j(r5, r4);
        if (!(r6 instanceof AnonymousClass23Q) || (r1 = (AnonymousClass23N) r6) == null) {
            throw AnonymousClass8BW.A0S(0);
        }
        super.BDZ(r4, r5, r6);
        r5.A0I(C179859Ke.A2u);
        String str = r1.A01;
        if (str == null) {
            str = "";
        }
        r5.A0J(str);
    }

    public /* bridge */ /* synthetic */ AnonymousClass206 CBA(C166388co r8) {
        String str;
        C179859Ke A0R = r8.A0R();
        if (A0R == C179859Ke.A2u) {
            AnonymousClass205 A02 = C20106A7k.A02(r8, this.A01);
            long A002 = C20106A7k.A00(r8);
            AnonymousClass23Q r5 = new AnonymousClass23Q(A02, A002);
            r5.A0a(5);
            r5.A0H = r5.A0I;
            r5.A00 = r8.revokeMessageTimestamp_;
            if (AnonymousClass8BR.A03(r8) > 0) {
                str = C17880vN.A0w(r8.messageStubParameters_, 0);
            } else {
                str = this.A00.A00(r5, A002).A0v.A01;
            }
            r5.A01 = str;
            return r5;
        }
        throw AnonymousClass8BR.A0p(AnonymousClass001.A1E(A0R, "Unexpected stub type: ", AnonymousClass000.A10()), 0);
    }

    public Set BSF() {
        return C18070vi.A0P(C179859Ke.A2u);
    }

    public AnonymousClass99l(C32451hD r1, AnonymousClass00H r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
