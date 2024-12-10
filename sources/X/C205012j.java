package X;

/* renamed from: X.12j  reason: invalid class name and case insensitive filesystem */
public final class C205012j implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("bot_memory_metadata", "bot_memory_metadata_message_row_id_index", "CREATE INDEX IF NOT EXISTS bot_memory_metadata_message_row_id_index ON bot_memory_metadata (message_row_id)");
        r5.CDx("bot_memory_metadata", "bot_memory_metadata_memory_annotated_user_message_key_id_index", "CREATE INDEX IF NOT EXISTS bot_memory_metadata_memory_annotated_user_message_key_id_index ON bot_memory_metadata (memory_annotated_user_message_key_id)");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r9) {
        C18070vi.A0d(r9, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r6 = C25041Mq.INTEGER;
        obj.A00 = r6;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r6;
        obj.A04 = true;
        obj.A02 = "memory_annotated_user_message_key_id";
        C25041Mq r2 = C25041Mq.TEXT;
        obj.A00 = r2;
        obj.A04 = true;
        obj.A02 = "memory";
        obj.A00 = r2;
        obj.A02 = "memory_id";
        obj.A00 = r2;
        obj.A04 = true;
        obj.A02 = "added";
        obj.A00 = r6;
        obj.A04 = true;
        r9.CE6("bot_memory_metadata", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        r5.CE9(C25071Mt.A01("message", "bot_memory_metadata", (String) null, "memory_annotated_user_message_key_id = old.key_id OR message_row_id = old._id"), "bot_memory_metadata");
    }
}
