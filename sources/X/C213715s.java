package X;

/* renamed from: X.15s  reason: invalid class name and case insensitive filesystem */
public final class C213715s implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("message_comment_parent", "message_parent_last_comment_index", "\n          CREATE INDEX IF NOT EXISTS \n          message_parent_last_comment_index \n          ON message_comment_parent (chat_row_id, last_comment_message_row_id)\n        ");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "chat_row_id";
        obj.A00 = r3;
        obj.A02 = "number_of_comments";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "last_comment_ts";
        obj.A00 = r3;
        obj.A02 = "last_comment_message_row_id";
        obj.A00 = r3;
        r7.CE6("message_comment_parent", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        C18070vi.A0d(r3, 0);
        r3.CE9(C25061Ms.A00("message_comment_parent"), "message_comment_parent");
    }
}
