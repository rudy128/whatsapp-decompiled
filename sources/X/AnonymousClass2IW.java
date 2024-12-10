package X;

/* renamed from: X.2IW  reason: invalid class name */
public final class AnonymousClass2IW extends AnonymousClass39J {
    public final AnonymousClass00H A00;

    public void BL9(AnonymousClass206 r5) {
        C18070vi.A0d(r5, 0);
        super.BL9(r5);
        AnonymousClass1QX.A01((AnonymousClass1QX) this.A00.get(), (AnonymousClass22U) r5, "SELECT message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code, total_amount_1000, message_version, catalog_type FROM message_order WHERE message_row_id=?", "GET_ORDER_MESSAGE_SQL", false);
    }

    public void BdY(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        AnonymousClass39J.A00(this, r2);
        ((AnonymousClass1QX) this.A00.get()).A02((AnonymousClass22U) r2);
    }

    public void CQL(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        AnonymousClass39J.A00(this, r2);
        ((AnonymousClass1QX) this.A00.get()).A02((AnonymousClass22U) r2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2IW(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        super(r1, r2, r3);
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r4;
    }
}
