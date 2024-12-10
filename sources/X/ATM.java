package X;

public final class ATM implements AnonymousClass3L3 {
    public final AnonymousClass190 A00;

    public ATM(AnonymousClass190 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CRj(C20077A6d a6d, AnonymousClass206 r7) {
        boolean A17 = C18070vi.A17(r7, a6d);
        int i = a6d.A00;
        if (i != 0 && i != A17 && i != 3 && i != 2 && !(r7 instanceof AnonymousClass23N) && !(r7 instanceof AnonymousClass227) && !(r7 instanceof AnonymousClass22A) && !(r7 instanceof C444723o) && !(r7 instanceof C444923q)) {
            this.A00.A0G("MessageUtils/buildFMessage unexpected editedVersion", AnonymousClass001.A1I("edit=", AnonymousClass000.A10(), i), false);
            throw AnonymousClass8BR.A0p("invalid_edit_version", 76);
        }
    }
}
