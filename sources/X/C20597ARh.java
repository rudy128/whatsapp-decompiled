package X;

/* renamed from: X.ARh  reason: case insensitive filesystem */
public final class C20597ARh implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("non_admin_group_membership_approval_requests", "membership_request_creation_time_index", " CREATE INDEX IF NOT EXISTS membership_request_creation_time_index ON non_admin_group_membership_approval_requests(request_creation_time);");
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C25021Mo A06 = C18070vi.A06(r7);
        C25031Mp[] r3 = new C25031Mp[4];
        A06.A02 = "group_jid";
        C25041Mq r2 = C25041Mq.TEXT;
        A06.A00 = r2;
        C25021Mo.A09(A06, r3);
        A06.A02 = "requested_by_jid";
        A06.A00 = r2;
        C25021Mo.A07(A06, r3);
        A06.A02 = "requested_for_jid";
        C25021Mo.A04(A06, r2, r3);
        A06.A02 = "request_creation_time";
        A06.A00 = C25041Mq.INTEGER;
        C25021Mo.A08(A06, r3);
        r7.CE5("non_admin_group_membership_approval_requests", AnonymousClass1ZU.A06(r3), AnonymousClass8BR.A11("PRIMARY KEY (group_jid, requested_by_jid, requested_for_jid)", new String[1], 0));
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }
}
