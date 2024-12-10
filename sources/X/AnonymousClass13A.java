package X;

/* renamed from: X.13A  reason: invalid class name */
public class AnonymousClass13A implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("group_notification_version", "group_notification_version_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_notification_version_index ON group_notification_version (group_jid_row_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "group_jid_row_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A02 = "subject_timestamp";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "announcement_version";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "participant_version";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "group_join_request_timestamp";
        obj.A00 = r4;
        r7.CE6("group_notification_version", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
