package X;

/* renamed from: X.31T  reason: invalid class name */
public final class AnonymousClass31T implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("status_ranking", "date_and_jid_index", "CREATE INDEX IF NOT EXISTS date_and_jid_index\nON status_ranking(jid, date_time)");
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        C25021Mo A06 = C18070vi.A06(r6);
        C25031Mp[] r3 = new C25031Mp[5];
        A06.A02 = "_id";
        C25041Mq r2 = C25041Mq.INTEGER;
        r3[0] = C25021Mo.A00(A06, r2);
        A06.A02 = "total_impressions_per_day";
        A06.A04 = true;
        A06.A00 = r2;
        r3[1] = A06.A0B();
        A06.A02 = "total_clicks_per_day";
        A06.A04 = true;
        C25021Mo.A06(A06, r2, r3);
        A06.A02 = "jid";
        A06.A04 = true;
        A06.A00 = C25041Mq.TEXT;
        C25021Mo.A08(A06, r3);
        A06.A02 = "date_time";
        A06.A04 = true;
        A06.A00 = C25041Mq.DATETIME;
        r3[4] = A06.A0B();
        r6.CE6("status_ranking", r3);
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }
}
