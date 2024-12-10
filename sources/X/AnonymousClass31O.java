package X;

/* renamed from: X.31O  reason: invalid class name */
public final class AnonymousClass31O implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("wa_trusted_contacts", "incoming_tc_token_timestamp_index", "CREATE INDEX IF NOT EXISTS incoming_tc_token_timestamp_index ON wa_trusted_contacts (incoming_tc_token_timestamp)");
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r4) {
        C25021Mo A06 = C18070vi.A06(r4);
        C25031Mp[] r1 = new C25031Mp[3];
        A06.A02 = "jid";
        A06.A00 = C25041Mq.TEXT;
        A06.A05 = true;
        C25021Mo.A09(A06, r1);
        A06.A02 = "incoming_tc_token";
        A06.A00 = C25041Mq.BLOB;
        C25021Mo.A07(A06, r1);
        A06.A02 = "incoming_tc_token_timestamp";
        C25021Mo.A04(A06, C25041Mq.LONG, r1);
        r4.CE6("wa_trusted_contacts", r1);
    }
}
