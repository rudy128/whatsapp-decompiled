package X;

public final class ATO implements AnonymousClass3L3 {
    public final AnonymousClass190 A00;

    public ATO(AnonymousClass190 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CRj(C20077A6d a6d, AnonymousClass206 r7) {
        boolean A15 = C18070vi.A15(r7, a6d);
        String str = a6d.A0H;
        if ("reaction".equals(str) && !(r7 instanceof AnonymousClass227)) {
            AnonymousClass190 r2 = this.A00;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("type=");
            A10.append(str);
            AnonymousClass206.A07(r7, " media_wa_type=", A10);
            r2.A0G("MessageUtils/buildFMessage message type does not correspond to an encoded message", A10.toString(), A15);
            throw AnonymousClass8BR.A0o(76);
        }
    }
}
