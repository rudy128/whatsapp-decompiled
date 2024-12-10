package X;

public final class ATN implements AnonymousClass3L3 {
    public final AnonymousClass190 A00;

    public ATN(AnonymousClass190 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CRj(C20077A6d a6d, AnonymousClass206 r7) {
        boolean A15 = C18070vi.A15(r7, a6d);
        int i = a6d.A00;
        if (2 == i && !(r7 instanceof AnonymousClass22C)) {
            if (!(r7 instanceof AnonymousClass23U) || ((AnonymousClass23U) r7).A00 != 79) {
                AnonymousClass190 r2 = this.A00;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("edit=");
                A10.append(i);
                A10.append(" media_wa_type=");
                A10.append(r7);
                r2.A0G("MessageUtils/buildFMessage message type does not correspond to an encoded message", AnonymousClass000.A0y(".messageType", A10), A15);
                throw AnonymousClass8BR.A0p("pin_in_chat_message_stanza_invalid", 76);
            }
        }
    }
}
