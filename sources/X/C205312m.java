package X;

/* renamed from: X.12m  reason: invalid class name and case insensitive filesystem */
public final class C205312m implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r5 = C25041Mq.INTEGER;
        obj.A00 = r5;
        obj.A05 = true;
        obj.A02 = "search_provider";
        obj.A00 = r5;
        obj.A02 = "plugin_type";
        obj.A00 = r5;
        obj.A02 = "thumbnail_cdn_url";
        C25041Mq r3 = C25041Mq.TEXT;
        obj.A00 = r3;
        obj.A02 = "profile_photo_cdn_url";
        obj.A00 = r3;
        obj.A02 = "search_provider_url";
        obj.A00 = r3;
        obj.A02 = "reference_index";
        obj.A00 = r5;
        obj.A02 = "profile_photo_thumbnail";
        obj.A00 = C25041Mq.BLOB;
        obj.A02 = "search_query";
        obj.A00 = r3;
        obj.A02 = "favicon_cdn_url";
        obj.A00 = r3;
        r7.CE6("bot_plugin_metadata", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        C18070vi.A0d(r3, 0);
        r3.CE9(C25061Ms.A00("bot_plugin_metadata"), "bot_plugin_metadata");
    }
}
