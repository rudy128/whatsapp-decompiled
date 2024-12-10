package X;

/* renamed from: X.2IV  reason: invalid class name */
public final class AnonymousClass2IV extends AnonymousClass39J {
    public final AnonymousClass00H A00;

    public void BL9(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        super.BL9(r4);
        AnonymousClass22Q r42 = (AnonymousClass22Q) r4;
        C18070vi.A0d(r42, 0);
        C63162sc.A01((C63162sc) this.A00.get(), r42, "SELECT message_row_id, business_owner_jid, product_id, title, description, currency_code, amount_1000, retailer_id, url, signed_url, product_image_count, sale_amount_1000, body, footer FROM message_product WHERE message_row_id= ?", "GET_PRODUCT_MESSAGE_SQL");
    }

    public void BdY(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        AnonymousClass39J.A00(this, r2);
        ((C63162sc) this.A00.get()).A02((AnonymousClass22Q) r2);
    }

    public void CQL(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        AnonymousClass39J.A00(this, r2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2IV(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        super(r1, r2, r3);
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r4;
    }
}
