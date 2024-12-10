package X;

/* renamed from: X.315  reason: invalid class name */
public final class AnonymousClass315 implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("wa_address_book", "address_book_is_wa_index", "CREATE INDEX IF NOT EXISTS address_book_is_wa_index ON wa_address_book (is_whatsapp_user)");
        r5.CDx("wa_address_book", "address_book_jid_index", "CREATE INDEX IF NOT EXISTS address_book_jid_index ON wa_address_book (jid)");
        r5.CDx("wa_address_book", "address_book_raw_contact_id_index", "CREATE INDEX IF NOT EXISTS address_book_raw_contact_id_index ON wa_address_book (raw_contact_id)");
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        C25021Mo A06 = C18070vi.A06(r8);
        C25031Mp[] r2 = new C25031Mp[17];
        A06.A02 = "_id";
        C25041Mq r5 = C25041Mq.INTEGER;
        r2[0] = C25021Mo.A00(A06, r5);
        A06.A02 = "jid";
        C25041Mq r3 = C25041Mq.TEXT;
        A06.A00 = r3;
        r2[1] = A06.A0B();
        A06.A02 = "is_whatsapp_user";
        C25041Mq r6 = C25041Mq.BOOLEAN;
        C25021Mo.A06(A06, r6, r2);
        A06.A02 = "company";
        A06.A00 = r3;
        C25021Mo.A08(A06, r2);
        r2[4] = C25021Mo.A02(A06, r3, "display_name");
        r2[5] = C25021Mo.A02(A06, r3, "family_name");
        r2[6] = C25021Mo.A02(A06, r3, "given_name");
        r2[7] = C25021Mo.A02(A06, r5, "is_contact_synced");
        r2[8] = C25021Mo.A02(A06, r6, "is_starred");
        r2[9] = C25021Mo.A02(A06, r3, "nickname");
        r2[10] = C25021Mo.A02(A06, r3, "number");
        r2[11] = C25021Mo.A02(A06, r3, "phone_label");
        r2[12] = C25021Mo.A02(A06, r5, "phone_type");
        r2[13] = C25021Mo.A02(A06, r5, "raw_contact_id");
        r2[14] = C25021Mo.A02(A06, r3, "sort_name");
        r2[15] = C25021Mo.A02(A06, r5, "sync_policy");
        r2[16] = C25021Mo.A02(A06, r3, "title");
        r8.CE6("wa_address_book", r2);
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }
}
