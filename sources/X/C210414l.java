package X;

import android.util.Pair;

/* renamed from: X.14l  reason: invalid class name and case insensitive filesystem */
public class C210414l implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("mms_thumbnail_metadata", "mms_thumbnail_metadata_transferred_index", " CREATE INDEX IF NOT EXISTS mms_thumbnail_metadata_transferred_index ON mms_thumbnail_metadata(transferred)");
        if (((AnonymousClass1F2) r4).A01) {
            r5.CDt("mms_thumbnail_metadata", "mms_thumbnail_metadata_insert_timestamp_index", " CREATE INDEX IF NOT EXISTS mms_thumbnail_metadata_insert_timestamp_index ON mms_thumbnail_metadata(insert_timestamp)");
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r5 = C25041Mq.INTEGER;
        obj.A00 = r5;
        obj.A05 = true;
        obj.A02 = "direct_path";
        C25041Mq r3 = C25041Mq.TEXT;
        obj.A00 = r3;
        obj.A02 = "media_key";
        C25041Mq r6 = C25041Mq.BLOB;
        obj.A00 = r6;
        obj.A02 = "media_key_timestamp";
        obj.A00 = r5;
        obj.A02 = "enc_thumb_hash";
        obj.A00 = r3;
        obj.A02 = "thumb_hash";
        obj.A00 = r3;
        obj.A02 = "thumb_width";
        obj.A00 = r5;
        obj.A02 = "thumb_height";
        obj.A00 = r5;
        obj.A02 = "transferred";
        obj.A00 = r5;
        obj.A02 = "micro_thumbnail";
        obj.A00 = r6;
        obj.A02 = "insert_timestamp";
        obj.A00 = r5;
        obj.A02 = "handle";
        obj.A00 = r3;
        r8.CE6("mms_thumbnail_metadata", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        Pair A00 = C25061Ms.A00("mms_thumbnail_metadata");
        r4.CE8("mms_thumbnail_metadata", (String) A00.first, (String) A00.second);
    }
}
