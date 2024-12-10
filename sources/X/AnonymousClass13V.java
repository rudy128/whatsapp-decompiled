package X;

import android.util.Pair;

/* renamed from: X.13V  reason: invalid class name */
public final class AnonymousClass13V implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        obj.A00 = C25041Mq.INTEGER;
        obj.A05 = true;
        obj.A02 = "shared_secret";
        obj.A00 = C25041Mq.BLOB;
        obj.A04 = true;
        r6.CE6("message_broadcast_ephemeral", obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        Pair A00 = C25061Ms.A00("message_broadcast_ephemeral");
        r4.CE8("message_broadcast_ephemeral", (String) A00.first, (String) A00.second);
    }
}
