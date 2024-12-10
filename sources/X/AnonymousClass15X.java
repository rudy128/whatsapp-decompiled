package X;

/* renamed from: X.15X  reason: invalid class name */
public class AnonymousClass15X implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("group_participant_user", "group_participant_user_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_participant_user_index ON group_participant_user (group_jid_row_id, user_jid_row_id)");
        r5.CDt("group_participant_user", "group_user_index", "CREATE INDEX IF NOT EXISTS group_user_index ON group_participant_user (user_jid_row_id)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "group_jid_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "user_jid_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "rank";
        obj.A00 = r3;
        obj.A02 = "pending";
        obj.A00 = r3;
        obj.A02 = "add_timestamp";
        obj.A00 = r3;
        r7.CE6("group_participant_user", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
