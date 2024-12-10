package X;

import android.util.Pair;

/* renamed from: X.146  reason: invalid class name */
public class AnonymousClass146 implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        obj.A00 = C25041Mq.INTEGER;
        obj.A05 = true;
        obj.A02 = "message_secret";
        obj.A00 = C25041Mq.BLOB;
        r6.CE6("message_secret", obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        Pair A00 = C25061Ms.A00("message_secret");
        r4.CE8("message_secret", (String) A00.first, (String) A00.second);
    }
}
