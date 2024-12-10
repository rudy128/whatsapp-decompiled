package X;

/* renamed from: X.14g  reason: invalid class name and case insensitive filesystem */
public class C209914g implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("message_view_once_media", "message_view_once_media_state_index", "CREATE INDEX IF NOT EXISTS message_view_once_media_state_index ON message_view_once_media (state)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "state";
        obj.A00 = r3;
        obj.A04 = true;
        r7.CE6("message_view_once_media", obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        r3.CE9(C25061Ms.A00("message_view_once_media"), "message_view_once_media");
    }
}
