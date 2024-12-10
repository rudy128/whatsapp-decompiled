package X;

/* renamed from: X.31L  reason: invalid class name */
public final class AnonymousClass31L implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        C25021Mo A06 = C18070vi.A06(r8);
        C25031Mp[] r2 = new C25031Mp[9];
        A06.A02 = "group_jid";
        C25041Mq r1 = C25041Mq.TEXT;
        A06.A00 = r1;
        C25021Mo.A09(A06, r2);
        A06.A02 = "parent_group_jid";
        A06.A00 = r1;
        C25021Mo.A07(A06, r2);
        A06.A02 = "subject";
        C25021Mo.A04(A06, r1, r2);
        A06.A02 = "description";
        A06.A00 = r1;
        C25021Mo.A08(A06, r2);
        A06.A02 = "creator_jid";
        C25021Mo.A05(A06, r1, r2);
        A06.A02 = "request_creation_time";
        C25041Mq r5 = C25041Mq.INTEGER;
        A06.A00 = r5;
        A06.A04 = true;
        r2[5] = A06.A0B();
        r2[6] = C25021Mo.A01(A06, r5, "participant_count");
        A06.A02 = "is_existing_group";
        A06.A00 = C25041Mq.BOOLEAN;
        A06.A04 = true;
        A06.A0E(0);
        r2[7] = A06.A0B();
        r2[8] = C25021Mo.A02(A06, r5, "is_hidden_subgroup");
        r8.CE5("member_suggested_groups_v2", AnonymousClass1ZU.A06(r2), AnonymousClass1ZU.A06("PRIMARY KEY (parent_group_jid,group_jid,creator_jid)"));
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }
}
