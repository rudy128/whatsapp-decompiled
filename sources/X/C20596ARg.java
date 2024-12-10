package X;

/* renamed from: X.ARg  reason: case insensitive filesystem */
public final class C20596ARg implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("group_membership_approval_requests", "request_creation_time_index", " CREATE INDEX IF NOT EXISTS request_creation_time_index ON group_membership_approval_requests(request_creation_time);");
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        C25021Mo A06 = C18070vi.A06(r8);
        C25031Mp[] r5 = new C25031Mp[6];
        A06.A02 = "group_jid";
        C25041Mq r2 = C25041Mq.TEXT;
        A06.A00 = r2;
        C25021Mo.A09(A06, r5);
        A06.A02 = "requester_jid";
        A06.A00 = r2;
        C25021Mo.A07(A06, r5);
        A06.A02 = "request_method";
        C25021Mo.A04(A06, r2, r5);
        A06.A02 = "request_creation_time";
        A06.A00 = C25041Mq.INTEGER;
        C25021Mo.A08(A06, r5);
        r5[4] = C25021Mo.A02(A06, r2, "parent_group_jid");
        r8.CE5("group_membership_approval_requests", AnonymousClass8BR.A11(C25021Mo.A02(A06, r2, "requested_by_jid"), r5, 5), AnonymousClass8BR.A11("PRIMARY KEY (group_jid,requester_jid)", new String[1], 0));
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }
}
