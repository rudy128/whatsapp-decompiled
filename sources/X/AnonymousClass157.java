package X;

import android.util.Pair;

/* renamed from: X.157  reason: invalid class name */
public class AnonymousClass157 implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        ? obj = new Object();
        obj.A02 = "_id";
        obj.A00 = C25041Mq.INTEGER;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "quick_reply_id";
        C25041Mq r1 = C25041Mq.TEXT;
        obj.A00 = r1;
        obj.A04 = true;
        obj.A02 = "keyword_id";
        obj.A00 = r1;
        obj.A04 = true;
        r6.CE6("quick_reply_keywords", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        Pair A01 = C25071Mt.A01("quick_replies", "quick_reply_keywords", (String) null, "quick_reply_id=old._id");
        r5.CE8("quick_reply_keywords", (String) A01.first, (String) A01.second);
    }
}
