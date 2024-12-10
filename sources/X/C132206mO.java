package X;

/* renamed from: X.6mO  reason: invalid class name and case insensitive filesystem */
public final class C132206mO {
    public final /* synthetic */ C123366Ue A00;
    public final /* synthetic */ String A01;

    public C132206mO(C123366Ue r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public void A00(int i, Integer num) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyCrosspostRequestSessionManager/Crosspost failed for session: ");
        String str = this.A01;
        A10.append(str);
        A10.append(" with error: ");
        A10.append(i);
        C18070vi.A0d(AnonymousClass001.A1E(num, " and errorSubCode: ", A10), 0);
        this.A00.A01(num, str, i, false);
    }
}
