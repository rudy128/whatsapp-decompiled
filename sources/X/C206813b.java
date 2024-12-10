package X;

import android.util.Pair;

/* renamed from: X.13b  reason: invalid class name and case insensitive filesystem */
public class C206813b implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("message_ephemeral", "message_ephemeral_expire_timestamp_index", "CREATE INDEX IF NOT EXISTS message_ephemeral_expire_timestamp_index ON message_ephemeral(expire_timestamp)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "duration";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "expire_timestamp";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "keep_in_chat";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A01 = "0";
        obj.A02 = "ephemeral_trigger";
        obj.A00 = r3;
        obj.A02 = "ephemeral_initiated_by_me";
        obj.A00 = r3;
        r7.CE6("message_ephemeral", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        Pair A00 = C25061Ms.A00("message_ephemeral");
        r4.CE8("message_ephemeral", (String) A00.first, (String) A00.second);
    }
}
