package X;

import android.util.Pair;

/* renamed from: X.156  reason: invalid class name */
public class AnonymousClass156 implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("quick_reply_attachments", "attachments_quick_reply_id_index", "CREATE INDEX IF NOT EXISTS attachments_quick_reply_id_index ON quick_reply_attachments (quick_reply_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "quick_reply_id";
        C25041Mq r2 = C25041Mq.TEXT;
        obj.A00 = r2;
        obj.A04 = true;
        obj.A02 = "uri";
        obj.A00 = r2;
        obj.A04 = true;
        obj.A02 = "caption";
        obj.A00 = r2;
        obj.A02 = "media_type";
        obj.A00 = r4;
        r8.CE6("quick_reply_attachments", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        Pair A01 = C25071Mt.A01("quick_replies", "quick_reply_attachments", (String) null, "quick_reply_id=old._id");
        r5.CE8("quick_reply_attachments", (String) A01.first, (String) A01.second);
    }
}
