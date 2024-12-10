package X;

public final class ARX implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("wa_biz_integrity_signals", "biz_integrity_signals_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS biz_integrity_signals_jid_index ON wa_biz_integrity_signals (jid);");
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        C25021Mo A06 = C18070vi.A06(r8);
        C25031Mp[] r2 = new C25031Mp[10];
        A06.A02 = "_id";
        C25041Mq r6 = C25041Mq.INTEGER;
        r2[0] = C25021Mo.A00(A06, r6);
        A06.A02 = "jid";
        C25041Mq r3 = C25041Mq.TEXT;
        A06.A00 = r3;
        C25021Mo.A07(A06, r2);
        A06.A02 = "dhash";
        C25021Mo.A06(A06, r3, r2);
        A06.A02 = "fb_linked_page_number_of_likes";
        C25041Mq r5 = C25041Mq.REAL;
        A06.A00 = r5;
        C25021Mo.A08(A06, r2);
        r2[4] = C25021Mo.A02(A06, r5, "ig_linked_page_number_of_followers");
        r2[5] = AnonymousClass8BW.A0H(A06, r6, "is_suspicious");
        r2[6] = C25021Mo.A02(A06, r5, "join_date_ms");
        r2[7] = AnonymousClass8BW.A0H(A06, r6, "is_banned");
        r2[8] = C25021Mo.A02(A06, r3, "phone_country_code");
        r2[9] = C25021Mo.A02(A06, r3, "trust_tier");
        r8.CE6("wa_biz_integrity_signals", r2);
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        C18070vi.A0d(r4, 0);
        r4.CE8("wa_biz_integrity_signals", "contact_bd_for_business_integrity_signals", "CREATE TRIGGER contact_bd_for_business_integrity_signals BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_biz_integrity_signals WHERE jid = old.jid; END");
        r4.CE8("wa_biz_integrity_signals", "contact_bu_for_business_integrity_signals", "CREATE TRIGGER contact_bu_for_business_integrity_signals BEFORE UPDATE ON wa_contacts BEGIN UPDATE wa_biz_integrity_signals SET jid = new.jid WHERE jid = old.jid; END");
    }
}
