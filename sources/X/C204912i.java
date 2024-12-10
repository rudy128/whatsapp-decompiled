package X;

/* renamed from: X.12i  reason: invalid class name and case insensitive filesystem */
public final class C204912i implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        C18070vi.A0d(r6, 0);
        ? obj = new Object();
        obj.A02 = "chat_row_id";
        obj.A00 = C25041Mq.INTEGER;
        obj.A05 = true;
        obj.A02 = "welcome_request_message_sent";
        obj.A00 = C25041Mq.BOOLEAN;
        r6.CE6("bot_chat_info", obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        C18070vi.A0d(r4, 0);
        r4.CE8("bot_chat_info", "chat_bd_for_bot_chat_info_trigger", "CREATE TRIGGER chat_bd_for_bot_chat_info_trigger BEFORE DELETE ON chat BEGIN DELETE FROM bot_chat_info WHERE chat_row_id = old._id; END");
    }
}
