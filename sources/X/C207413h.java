package X;

/* renamed from: X.13h  reason: invalid class name and case insensitive filesystem */
public final class C207413h implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("message_media_interactive_annotation_embedded_music", "message_media_interactive_annotation_embedded_music_index", "CREATE INDEX IF NOT EXISTS message_media_interactive_annotation_embedded_music_index ON message_media_interactive_annotation_embedded_music (message_media_interactive_annotation_row_id)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        C18070vi.A0d(r8, 0);
        ? obj = new Object();
        obj.A02 = "message_media_interactive_annotation_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "music_content_media_id";
        C25041Mq r6 = C25041Mq.TEXT;
        obj.A00 = r6;
        obj.A02 = "song_id";
        obj.A00 = r6;
        obj.A02 = "author";
        obj.A00 = r6;
        obj.A02 = "title";
        obj.A00 = r6;
        obj.A02 = "artwork_direct_path";
        obj.A00 = r6;
        obj.A02 = "artwork_sha256";
        C25041Mq r5 = C25041Mq.BLOB;
        obj.A00 = r5;
        obj.A02 = "artwork_enc_sha256";
        obj.A00 = r5;
        obj.A02 = "artwork_media_key";
        obj.A00 = r5;
        obj.A02 = "artist_attribution";
        obj.A00 = r6;
        obj.A02 = "country_blocklist";
        obj.A00 = r5;
        obj.A02 = "is_explicit";
        obj.A00 = r3;
        r8.CE6("message_media_interactive_annotation_embedded_music", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        r5.CE9(C25071Mt.A01("message_media_interactive_annotation", "message_media_interactive_annotation_embedded_music", (String) null, "message_media_interactive_annotation_row_id=old._id"), "message_media_interactive_annotation_embedded_music");
    }
}
