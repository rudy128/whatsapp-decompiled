package X;

/* renamed from: X.13m  reason: invalid class name and case insensitive filesystem */
public class C207913m implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("message_media_vcard_count", "message_media_vcard_count_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_media_vcard_count_index ON message_media_vcard_count(message_row_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r3;
        obj.A02 = "count";
        obj.A00 = r3;
        r7.CE6("message_media_vcard_count", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("message_media", "message_media_vcard_count", (String) null, "message_row_id=old.message_row_id"), "message_media_vcard_count");
    }
}
