package X;

/* renamed from: X.13l  reason: invalid class name and case insensitive filesystem */
public class C207813l implements AnonymousClass12T {
    public static final C207813l $redex_init_class = null;

    static {
        AnonymousClass1H2.A01("message_media", new String[]{"media_name", "file_path", "width", "height"});
    }

    public static String A00(long j, boolean z, boolean z2) {
        StringBuilder sb;
        String str = " ORDER BY sort_id ASC";
        String str2 = "";
        if (j > 0) {
            sb.append(C51012Wq.A00);
            if (z) {
                str2 = " AND message.chat_row_id = ?";
            }
            sb.append(str2);
            sb.append(" AND file_size > ?");
        } else {
            sb = new StringBuilder();
            sb.append(C51012Wq.A02);
            if (z) {
                str2 = " AND chat_row_id = ?";
            }
            sb.append(str2);
        }
        if (!z2) {
            str = " ORDER BY sort_id DESC";
        }
        sb.append(str);
        return sb.toString();
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("message_media", "message_media_hash_index", "CREATE INDEX IF NOT EXISTS message_media_hash_index ON message_media(file_hash)");
        r5.CDx("message_media", "message_media_chat_index", "CREATE INDEX IF NOT EXISTS message_media_chat_index ON message_media(chat_row_id)");
        r5.CDx("message_media", "message_media_original_file_hash_index", "CREATE INDEX IF NOT EXISTS message_media_original_file_hash_index ON message_media(original_file_hash)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r9) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "chat_row_id";
        obj.A00 = r3;
        obj.A02 = "autotransfer_retry_enabled";
        obj.A00 = r3;
        obj.A02 = "multicast_id";
        C25041Mq r5 = C25041Mq.TEXT;
        obj.A00 = r5;
        obj.A02 = "media_job_uuid";
        obj.A00 = r5;
        obj.A02 = "transferred";
        obj.A00 = r3;
        obj.A02 = "transcoded";
        obj.A00 = r3;
        obj.A02 = "file_path";
        obj.A00 = r5;
        obj.A02 = "file_size";
        obj.A00 = r3;
        obj.A02 = "suspicious_content";
        obj.A00 = r3;
        obj.A02 = "trim_from";
        obj.A00 = r3;
        obj.A02 = "trim_to";
        obj.A00 = r3;
        obj.A02 = "face_x";
        obj.A00 = r3;
        obj.A02 = "face_y";
        obj.A00 = r3;
        obj.A02 = "media_key";
        C25041Mq r7 = C25041Mq.BLOB;
        obj.A00 = r7;
        obj.A02 = "media_key_timestamp";
        obj.A00 = r3;
        obj.A02 = "width";
        obj.A00 = r3;
        obj.A02 = "height";
        obj.A00 = r3;
        obj.A02 = "has_streaming_sidecar";
        obj.A00 = r3;
        obj.A02 = "gif_attribution";
        obj.A00 = r3;
        obj.A02 = "thumbnail_height_width_ratio";
        obj.A00 = C25041Mq.REAL;
        obj.A02 = "direct_path";
        obj.A00 = r5;
        obj.A02 = "first_scan_sidecar";
        obj.A00 = r7;
        obj.A02 = "first_scan_length";
        obj.A00 = r3;
        obj.A02 = "message_url";
        obj.A00 = r5;
        obj.A02 = "mime_type";
        obj.A00 = r5;
        obj.A02 = "file_length";
        obj.A00 = r3;
        obj.A02 = "media_name";
        obj.A00 = r5;
        obj.A02 = "file_hash";
        obj.A00 = r5;
        obj.A02 = "media_duration";
        obj.A00 = r3;
        obj.A02 = "page_count";
        obj.A00 = r3;
        obj.A02 = "enc_file_hash";
        obj.A00 = r5;
        obj.A02 = "partial_media_hash";
        obj.A00 = r5;
        obj.A02 = "partial_media_enc_hash";
        obj.A00 = r5;
        obj.A02 = "is_animated_sticker";
        obj.A00 = r3;
        obj.A02 = "original_file_hash";
        obj.A00 = r5;
        obj.A02 = "mute_video";
        obj.A00 = r3;
        obj.A0E(0);
        obj.A02 = "media_caption";
        obj.A00 = r5;
        obj.A02 = "media_upload_handle";
        obj.A00 = r5;
        obj.A02 = "sticker_flags";
        obj.A00 = r3;
        obj.A02 = "raw_transcription_text";
        obj.A00 = r5;
        obj.A02 = "first_viewed_timestamp";
        obj.A00 = r3;
        r9.CE6("message_media", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        r3.CE9(C25061Ms.A00("message_media"), "message_media");
    }
}
