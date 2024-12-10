package X;

/* renamed from: X.31P  reason: invalid class name */
public final class AnonymousClass31P implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("wa_trusted_contacts_send", "sent_tc_token_timestamp_index", "CREATE INDEX IF NOT EXISTS sent_tc_token_timestamp_index ON wa_trusted_contacts_send (sent_tc_token_timestamp)");
        r5.CDx("wa_trusted_contacts_send", "sent_real_issue_timestamp_index", "CREATE INDEX IF NOT EXISTS sent_real_issue_timestamp_index ON wa_trusted_contacts_send (real_issue_timestamp)");
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r5) {
        C25021Mo A06 = C18070vi.A06(r5);
        C25031Mp[] r2 = new C25031Mp[3];
        A06.A02 = "jid";
        A06.A00 = C25041Mq.TEXT;
        A06.A05 = true;
        C25021Mo.A09(A06, r2);
        A06.A02 = "sent_tc_token_timestamp";
        C25041Mq r1 = C25041Mq.LONG;
        A06.A00 = r1;
        C25021Mo.A07(A06, r2);
        A06.A02 = "real_issue_timestamp";
        C25021Mo.A06(A06, r1, r2);
        r5.CE6("wa_trusted_contacts_send", r2);
    }
}
