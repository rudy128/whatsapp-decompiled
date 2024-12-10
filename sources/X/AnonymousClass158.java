package X;

import android.util.Pair;

/* renamed from: X.158  reason: invalid class name */
public class AnonymousClass158 implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "quick_reply_id";
        obj.A00 = C25041Mq.TEXT;
        obj.A04 = true;
        obj.A02 = "usage_date";
        obj.A00 = C25041Mq.DATE;
        obj.A02 = "usage_count";
        obj.A00 = r4;
        r7.CE6("quick_reply_usage", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        Pair A01 = C25071Mt.A01("quick_replies", "quick_reply_usage", (String) null, "quick_reply_id=old._id");
        r5.CE8("quick_reply_usage", (String) A01.first, (String) A01.second);
    }
}
