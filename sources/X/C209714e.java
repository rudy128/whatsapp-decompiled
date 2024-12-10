package X;

/* renamed from: X.14e  reason: invalid class name and case insensitive filesystem */
public final class C209714e implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("message_translation_request", "message_translation_request_message_row_id_index", "\n          CREATE UNIQUE INDEX IF NOT EXISTS message_translation_request_message_row_id_index\n          ON message_translation_request (message_row_id, source_lang, target_lang)\n        ");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r4;
        obj.A02 = "source_lang";
        C25041Mq r2 = C25041Mq.TEXT;
        obj.A00 = r2;
        obj.A02 = "target_lang";
        obj.A00 = r2;
        obj.A02 = "status";
        obj.A00 = r4;
        r7.CE6("message_translation_request", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        C18070vi.A0d(r3, 0);
        r3.CE9(C25061Ms.A00("message_translation_request"), "message_translation_request");
    }
}
