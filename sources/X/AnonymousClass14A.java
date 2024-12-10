package X;

/* renamed from: X.14A  reason: invalid class name */
public final class AnonymousClass14A implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        C18070vi.A0d(r4, 1);
        r5.CDx("message_sticker_pack_stickers", "sticker_pack_stickers_message_row_id_index", "CREATE INDEX IF NOT EXISTS sticker_pack_stickers_message_row_id_index ON message_sticker_pack_stickers (message_row_id)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
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
        obj.A02 = "file_name";
        C25041Mq r3 = C25041Mq.TEXT;
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "is_animated";
        obj.A00 = r6;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "emojis";
        obj.A00 = r3;
        obj.A02 = "accessibility_label";
        obj.A00 = r3;
        obj.A02 = "is_lottie";
        obj.A00 = r6;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "mimetype";
        obj.A00 = r3;
        r9.CE6("message_sticker_pack_stickers", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        C18070vi.A0d(r3, 0);
        r3.CE9(C25061Ms.A00("message_sticker_pack_stickers"), "message_sticker_pack_stickers");
    }
}
