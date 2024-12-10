package X;

/* renamed from: X.14w  reason: invalid class name and case insensitive filesystem */
public class C211514w implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("parent_group_participants", "parent_group_participants_parent_jid_index", "CREATE INDEX IF NOT EXISTS parent_group_participants_parent_jid_index ON parent_group_participants (parent_group_jid_row_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "parent_group_jid_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "user_jid_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        r7.CE6("parent_group_participants", obj.A0B(), obj.A0B());
    }
}
