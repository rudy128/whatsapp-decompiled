package X;

/* renamed from: X.13z  reason: invalid class name and case insensitive filesystem */
public class C209213z implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r6 = C25041Mq.INTEGER;
        obj.A00 = r6;
        obj.A05 = true;
        obj.A02 = "media_job_uuid";
        C25041Mq r3 = C25041Mq.TEXT;
        obj.A00 = r3;
        obj.A02 = "transferred";
        obj.A00 = r6;
        obj.A02 = "file_path";
        obj.A00 = r3;
        obj.A02 = "file_size";
        obj.A00 = r6;
        obj.A02 = "media_key";
        C25041Mq r5 = C25041Mq.BLOB;
        obj.A00 = r5;
        obj.A02 = "media_key_timestamp";
        obj.A00 = r6;
        obj.A02 = "width";
        obj.A00 = r6;
        obj.A02 = "height";
        obj.A00 = r6;
        obj.A02 = "direct_path";
        obj.A00 = r3;
        obj.A02 = "message_url";
        obj.A00 = r3;
        obj.A02 = "mime_type";
        obj.A00 = r3;
        obj.A02 = "file_length";
        obj.A00 = r6;
        obj.A02 = "media_name";
        obj.A00 = r3;
        obj.A02 = "file_hash";
        obj.A00 = r3;
        obj.A02 = "media_duration";
        obj.A00 = r6;
        obj.A02 = "page_count";
        obj.A00 = r6;
        obj.A02 = "enc_file_hash";
        obj.A00 = r3;
        obj.A02 = "thumbnail";
        obj.A00 = r5;
        obj.A02 = "media_caption";
        obj.A00 = r3;
        r8.CE6("message_quoted_media", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("message_quoted", "message_quoted_media", (String) null, "message_row_id=old.message_row_id"), "message_quoted_media");
    }
}
