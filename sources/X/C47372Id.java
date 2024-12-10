package X;

/* renamed from: X.2Id  reason: invalid class name and case insensitive filesystem */
public final class C47372Id extends AnonymousClass39J {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public void BL9(AnonymousClass206 r6) {
        C18070vi.A0d(r6, 0);
        super.BL9(r6);
        ((C25951Qg) this.A00.get()).A0E((AnonymousClass21K) r6, r6.A0x);
        AnonymousClass22Q r62 = (AnonymousClass22Q) r6;
        C18070vi.A0d(r62, 0);
        C63162sc.A01((C63162sc) this.A01.get(), r62, "SELECT message_row_id, business_owner_jid, product_id, title, description, currency_code, amount_1000, retailer_id, url, signed_url, product_image_count, sale_amount_1000, body, footer FROM message_product WHERE message_row_id= ?", "GET_PRODUCT_MESSAGE_SQL");
    }

    public void BdY(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        AnonymousClass39J.A00(this, r2);
        C25951Qg.A0A(r2, this.A00);
        ((C63162sc) this.A01.get()).A02((AnonymousClass22Q) r2);
    }

    public void CQL(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        AnonymousClass39J.A00(this, r2);
        C25951Qg.A0A(r2, this.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47372Id(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        super(r1, r2, r3);
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A01 = r4;
        this.A00 = r5;
    }
}
