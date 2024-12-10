package X;

public class ATP implements AnonymousClass3L3 {
    public final AnonymousClass190 A00;

    public void CRj(C20077A6d a6d, AnonymousClass206 r6) {
        int i = a6d.A00;
        if ((r6 instanceof AnonymousClass23N) && i != 8 && i != 7) {
            this.A00.A0G("MessageUtils/buildFMessage unexpected editedVersion for revoke message", AnonymousClass001.A1I("edit=", AnonymousClass000.A10(), i), false);
            throw AnonymousClass8BR.A0o(76);
        }
    }

    public ATP(AnonymousClass190 r1) {
        this.A00 = r1;
    }
}
