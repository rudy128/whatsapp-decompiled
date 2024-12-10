package X;

/* renamed from: X.ARf  reason: case insensitive filesystem */
public final class C20595ARf implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("community_settings", "community_settings_raw_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS community_settings_raw_jid_index ON community_settings(community_raw_jid)");
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        C25021Mo A06 = C18070vi.A06(r6);
        C25031Mp[] r3 = new C25031Mp[3];
        A06.A02 = "community_raw_jid";
        A06.A00 = C25041Mq.TEXT;
        C25021Mo.A09(A06, r3);
        A06.A02 = "subgroup_member_count_poll_time";
        C25041Mq r1 = C25041Mq.INTEGER;
        A06.A00 = r1;
        r3[1] = A06.A0B();
        A06.A02 = "suggested_groups_view_time_seconds";
        C25021Mo.A06(A06, r1, r3);
        r6.CE6("community_settings", r3);
    }
}
