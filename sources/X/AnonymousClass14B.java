package X;

/* renamed from: X.14B  reason: invalid class name */
public final class AnonymousClass14B implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("message_sticker_pack", "message_sticker_pack_name_index", "CREATE INDEX IF NOT EXISTS message_sticker_pack_name_index ON message_sticker_pack (pack_name)");
        r5.CDx("message_sticker_pack", "message_sticker_pack_publisher_index", "CREATE INDEX IF NOT EXISTS message_sticker_pack_publisher_index ON message_sticker_pack (publisher)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        C18070vi.A0d(r8, 0);
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "sticker_pack_id";
        C25041Mq r5 = C25041Mq.TEXT;
        obj.A00 = r5;
        obj.A04 = true;
        obj.A02 = "tray_icon_file_name";
        obj.A00 = r5;
        obj.A04 = true;
        obj.A02 = "pack_name";
        obj.A00 = r5;
        obj.A04 = true;
        obj.A02 = "pack_description";
        obj.A00 = r5;
        obj.A02 = "publisher";
        obj.A00 = r5;
        obj.A02 = "image_data_hash";
        obj.A00 = r5;
        obj.A02 = "sticker_pack_size";
        obj.A00 = r3;
        obj.A02 = "sticker_pack_origin";
        obj.A00 = r3;
        r8.CE6("message_sticker_pack", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        C18070vi.A0d(r3, 0);
        r3.CE9(C25061Ms.A00("message_sticker_pack"), "message_sticker_pack");
    }
}
