package X;

/* renamed from: X.396  reason: invalid class name */
public final class AnonymousClass396 implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;

    public AnonymousClass396(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BL9(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        C25971Qi.A00((C25971Qi) this.A00.get(), (AnonymousClass21D) r4, "SELECT message_row_id, service, expiration_timestamp FROM message_payment_invite WHERE message_row_id = ?", "GET_PAYMENT_INVITE");
    }

    public void BdY(AnonymousClass206 r9) {
        C18070vi.A0d(r9, 0);
        AnonymousClass21D r92 = (AnonymousClass21D) r9;
        C25971Qi.A01((C25971Qi) this.A00.get(), "message_payment_invite", "INSERT_PAYMENT_INVITE", r92.A00, r92.A0x, r92.A01);
    }

    public void CQL(AnonymousClass206 r1) {
    }
}
