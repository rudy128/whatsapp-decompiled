package X;

/* renamed from: X.15Y  reason: invalid class name */
public class AnonymousClass15Y implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("group_past_participant_user", "group_past_participant_user_timestamp_index", "CREATE INDEX IF NOT EXISTS group_past_participant_user_timestamp_index ON group_past_participant_user (timestamp)");
        r5.CDx("group_past_participant_user", "group_past_participant_user_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_past_participant_user_index ON group_past_participant_user (group_jid_row_id, user_jid_row_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "group_jid_row_id";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "user_jid_row_id";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "is_leave";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "timestamp";
        obj.A00 = r4;
        r7.CE6("group_past_participant_user", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
