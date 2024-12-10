package X;

/* renamed from: X.13e  reason: invalid class name and case insensitive filesystem */
public class C207113e implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("message_link", "message_link_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_link_index ON message_link (message_row_id, link_index)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "chat_row_id";
        obj.A00 = r3;
        obj.A02 = "message_row_id";
        obj.A00 = r3;
        obj.A02 = "link_index";
        obj.A00 = r3;
        r7.CE6("message_link", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25061Ms.A00("message_link"), "message_link");
        r5.CE9(C25071Mt.A01("chat", "message_link", (String) null, "chat_row_id=old._id"), "message_link");
    }
}
