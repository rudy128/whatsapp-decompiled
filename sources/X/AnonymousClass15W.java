package X;

/* renamed from: X.15W  reason: invalid class name */
public class AnonymousClass15W implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("group_participant_device", "group_participant_device_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_participant_device_index ON group_participant_device (group_participant_row_id, device_jid_row_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "group_participant_row_id";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "device_jid_row_id";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "sent_sender_key";
        obj.A00 = r4;
        obj.A02 = "sent_add_on_sender_key";
        obj.A00 = r4;
        r7.CE6("group_participant_device", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("group_participant_user", "group_participant_device", (String) null, "group_participant_row_id=old._id"), "group_participant_device");
    }
}
