package X;

/* renamed from: X.12z  reason: invalid class name and case insensitive filesystem */
public class C206612z implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("deleted_chat_job", "deleted_chat_job_index", "CREATE INDEX IF NOT EXISTS deleted_chat_job_index ON deleted_chat_job (chat_row_id, _id)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r6 = C25041Mq.INTEGER;
        obj.A00 = r6;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "chat_row_id";
        obj.A00 = r6;
        obj.A04 = true;
        obj.A02 = "block_size";
        obj.A00 = r6;
        obj.A02 = "singular_message_delete_rows_id";
        C25041Mq r5 = C25041Mq.TEXT;
        obj.A00 = r5;
        obj.A02 = "deleted_message_row_id";
        obj.A00 = r6;
        obj.A02 = "deleted_starred_message_row_id";
        obj.A00 = r6;
        obj.A02 = "deleted_messages_remove_files";
        C25041Mq r3 = C25041Mq.BOOLEAN;
        obj.A00 = r3;
        obj.A02 = "deleted_categories_message_row_id";
        obj.A00 = r6;
        obj.A02 = "deleted_categories_starred_message_row_id";
        obj.A00 = r6;
        obj.A02 = "deleted_categories_remove_files";
        obj.A00 = r3;
        obj.A02 = "deleted_message_categories";
        obj.A00 = r5;
        obj.A02 = "delete_files_singular_delete";
        obj.A00 = r3;
        r8.CE6("deleted_chat_job", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
