package X;

/* renamed from: X.39C  reason: invalid class name */
public final class AnonymousClass39C implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public void BL9(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        ((C447424p) this.A00.get()).BL9(r4);
        C25951Qg.A07((C25951Qg) this.A01.get(), (AnonymousClass21T) r4, "SELECT message_row_id, element_type, reply_values, reply_description FROM message_ui_elements_reply WHERE message_row_id=?", "GET_RESPONSE_BUTTONS_MESSAGE_SQL");
    }

    public void BdY(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        C447424p.A00(r2, this.A00);
        ((C25951Qg) this.A01.get()).A0C((AnonymousClass21T) r2);
    }

    public void CQL(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C447424p) this.A00.get()).CQL(r2);
        ((C25951Qg) this.A01.get()).A0C((AnonymousClass21T) r2);
    }

    public AnonymousClass39C(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
