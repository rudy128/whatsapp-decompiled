package X;

/* renamed from: X.7PN  reason: invalid class name */
public final class AnonymousClass7PN implements AnonymousClass8A3 {
    public final /* synthetic */ C123366Ue A00;
    public final /* synthetic */ AnonymousClass73A A01;
    public final /* synthetic */ String A02;

    public AnonymousClass7PN(C123366Ue r1, AnonymousClass73A r2, String str) {
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BrA() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyCrosspostRequestSessionManager/eligibility retry delivery failure for session: ");
        String str = this.A02;
        C108995ce.A1O(A10, str);
        this.A00.A00((Integer) null, (Integer) null, str, true);
    }

    public void Bsm(int i, Integer num) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyCrosspostRequestSessionManager/eligibility retry error for session: ");
        String str = this.A02;
        A10.append(str);
        A10.append(" with errorCode: ");
        A10.append(i);
        A10.append(" and errorSubCode: ");
        C108995ce.A1K(num, A10);
        this.A00.A01(num, str, i, true);
    }

    public void C7Q(C135586sR r3, C136476ts r4) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyCrosspostRequestSessionManager/eligibility retry success for session: ");
        C108995ce.A1O(A10, this.A02);
        AnonymousClass73A.A01(this.A00, this.A01, r3, r4);
    }
}
