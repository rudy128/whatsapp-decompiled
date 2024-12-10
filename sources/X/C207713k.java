package X;

/* renamed from: X.13k  reason: invalid class name and case insensitive filesystem */
public final class C207713k implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("media_processed_video", "media_processed_video_message_id_index", "CREATE INDEX IF NOT EXISTS media_processed_video_message_id_index ON media_processed_video (message_row_id)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r5 = C25041Mq.INTEGER;
        obj.A00 = r5;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r5;
        obj.A02 = "direct_path";
        C25041Mq r3 = C25041Mq.TEXT;
        obj.A00 = r3;
        obj.A02 = "height";
        obj.A00 = r5;
        obj.A02 = "width";
        obj.A00 = r5;
        obj.A02 = "file_size";
        obj.A00 = r5;
        obj.A02 = "bitrate";
        obj.A00 = r5;
        obj.A02 = "quality";
        obj.A00 = r5;
        obj.A02 = "capabilities";
        obj.A00 = r3;
        r7.CE6("media_processed_video", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        r5.CE9(C25071Mt.A01("message_media", "media_processed_video", (String) null, "message_row_id=old.message_row_id"), "media_processed_video");
    }
}
