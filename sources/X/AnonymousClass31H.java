package X;

/* renamed from: X.31H  reason: invalid class name */
public class AnonymousClass31H implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("group_relationship", "group_relationship_parent_raw_jid_index", "CREATE INDEX IF NOT EXISTS group_relationship_parent_raw_jid_index ON group_relationship (parent_raw_jid)");
        r5.CDx("group_relationship", "group_relationship_subgroup_raw_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_relationship_subgroup_raw_jid_index ON group_relationship (subgroup_raw_id)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        ? obj = new Object();
        C25031Mp[] r3 = new C25031Mp[2];
        obj.A02 = "parent_raw_jid";
        C25041Mq r2 = C25041Mq.TEXT;
        obj.A00 = r2;
        obj.A04 = true;
        r3[0] = obj.A0B();
        obj.A02 = "subgroup_raw_id";
        obj.A00 = r2;
        C25021Mo.A07(obj, r3);
        r6.CE6("group_relationship", r3);
    }
}
