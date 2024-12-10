package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.14k  reason: invalid class name and case insensitive filesystem */
public final class C210314k implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("mms_metadata", "mms_metadata_message_and_type_index", "\n        CREATE INDEX IF NOT EXISTS mms_metadata_message_and_type_index\n        ON mms_metadata (message_row_id, type) \n        ");
        r5.CDx("mms_metadata", "mms_metadata_insert_timestamp_index", "\n        CREATE INDEX IF NOT EXISTS mms_metadata_insert_timestamp_index\n        ON mms_metadata (insert_timestamp, type)\n        ");
        r5.CDx("mms_metadata", "mms_metadata_transferred_and_message_row_id_and_type_index", "\n        CREATE INDEX IF NOT EXISTS mms_metadata_transferred_and_message_row_id_and_type_index\n        ON mms_metadata (transferred, message_row_id, type)\n        ");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        C18070vi.A0d(r8, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r3;
        obj.A02 = "direct_path";
        C25041Mq r5 = C25041Mq.TEXT;
        obj.A00 = r5;
        obj.A02 = "media_key";
        C25041Mq r6 = C25041Mq.BLOB;
        obj.A00 = r6;
        obj.A02 = "media_key_timestamp";
        obj.A00 = r3;
        obj.A02 = "enc_thumb_hash";
        obj.A00 = r5;
        obj.A02 = "thumb_hash";
        obj.A00 = r5;
        obj.A02 = "thumb_width";
        obj.A00 = r3;
        obj.A02 = "thumb_height";
        obj.A00 = r3;
        obj.A02 = "transferred";
        obj.A00 = r3;
        obj.A02 = "micro_thumbnail";
        obj.A00 = r6;
        obj.A02 = "insert_timestamp";
        obj.A00 = r3;
        obj.A02 = "handle";
        obj.A00 = r5;
        obj.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        obj.A00 = r3;
        r8.CE6("mms_metadata", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        C18070vi.A0d(r4, 0);
        Pair A00 = C25061Ms.A00("mms_metadata");
        r4.CE8("mms_metadata", (String) A00.first, (String) A00.second);
    }
}
