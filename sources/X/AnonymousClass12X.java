package X;

/* renamed from: X.12X  reason: invalid class name */
public class AnonymousClass12X implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "subgroup_raw_jid";
        C25041Mq r3 = C25041Mq.TEXT;
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "subject";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "subject_ts";
        C25041Mq r32 = C25041Mq.INTEGER;
        obj.A00 = r32;
        obj.A02 = "group_type";
        obj.A00 = r32;
        obj.A04 = true;
        obj.A0E(2);
        obj.A02 = "group_membership_approval_state";
        obj.A00 = r32;
        obj.A02 = "linking_timestamp";
        obj.A00 = r32;
        obj.A02 = "last_known_member_count";
        obj.A00 = r32;
        r7.CE6("subgroup_info", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("subgroup_info", "subgroup_raw_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS subgroup_raw_jid_index ON subgroup_info (subgroup_raw_jid)");
    }
}
