package X;

/* renamed from: X.13Y  reason: invalid class name */
public class AnonymousClass13Y implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("message_edit_info", "message_edit_info_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_edit_info_index ON message_edit_info (original_key_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "original_key_id";
        obj.A00 = C25041Mq.TEXT;
        obj.A04 = true;
        obj.A02 = "edited_timestamp";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "sender_timestamp";
        obj.A00 = r3;
        obj.A04 = true;
        r7.CE6("message_edit_info", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        r3.CE9(C25061Ms.A00("message_edit_info"), "message_edit_info");
    }
}
