package X;

/* renamed from: X.15G  reason: invalid class name */
public class AnonymousClass15G implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("message_quoted_vcard", "message_quoted_vcard_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_quoted_vcard_index ON message_quoted_vcard (message_row_id, vcard)");
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
        obj.A02 = "vcard";
        obj.A00 = C25041Mq.TEXT;
        r7.CE6("message_quoted_vcard", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("message_quoted", "message_quoted_vcard", (String) null, "message_row_id=old.message_row_id"), "message_quoted_vcard");
    }
}
