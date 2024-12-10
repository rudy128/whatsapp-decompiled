package X;

/* renamed from: X.12Y  reason: invalid class name */
public class AnonymousClass12Y implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("addon_message_media", "addon_message_media_message_row_id_index", "CREATE INDEX IF NOT EXISTS addon_message_media_message_row_id_index ON addon_message_media (message_row_id)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A04 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "addon_message_index";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "chat_row_id";
        obj.A00 = r3;
        obj.A02 = "file_path";
        C25041Mq r6 = C25041Mq.TEXT;
        obj.A00 = r6;
        obj.A02 = "file_size";
        obj.A00 = r3;
        obj.A02 = "media_key";
        C25041Mq r5 = C25041Mq.BLOB;
        obj.A00 = r5;
        obj.A02 = "media_key_timestamp";
        obj.A00 = r3;
        obj.A02 = "width";
        obj.A00 = r3;
        obj.A02 = "height";
        obj.A00 = r3;
        obj.A02 = "direct_path";
        obj.A00 = r6;
        obj.A02 = "message_url";
        obj.A00 = r6;
        obj.A02 = "mime_type";
        obj.A00 = r6;
        obj.A02 = "file_length";
        obj.A00 = r3;
        obj.A02 = "file_hash";
        obj.A00 = r6;
        obj.A02 = "enc_file_hash";
        obj.A00 = r6;
        obj.A02 = "partial_media_hash";
        obj.A00 = r6;
        obj.A02 = "partial_media_enc_hash";
        obj.A00 = r6;
        obj.A02 = "original_file_hash";
        obj.A00 = r6;
        obj.A02 = "thumbnail";
        obj.A00 = r6;
        obj.A02 = "thumbnail_direct_path";
        obj.A00 = r6;
        obj.A02 = "thumbnail_hash";
        obj.A00 = r6;
        obj.A02 = "enc_thumbnail_hash";
        obj.A00 = r6;
        obj.A02 = "scans_sidecar";
        obj.A00 = r5;
        obj.A02 = "transferred";
        obj.A00 = r3;
        r8.CE6("addon_message_media", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        r3.CE9(C25061Ms.A00("addon_message_media"), "addon_message_media");
    }
}
