package X;

import android.util.Pair;

/* renamed from: X.12h  reason: invalid class name and case insensitive filesystem */
public class C204812h implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        obj.A00 = C25041Mq.INTEGER;
        obj.A05 = true;
        obj.A02 = "parent_group_jid";
        C25041Mq r1 = C25041Mq.TEXT;
        obj.A00 = r1;
        obj.A02 = "group_subject";
        obj.A00 = r1;
        r6.CE6("message_quoted_blank_reply", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        Pair A01 = C25071Mt.A01("message_quoted", "message_quoted_blank_reply", (String) null, "message_row_id=old.message_row_id");
        r5.CE8("message_quoted_blank_reply", (String) A01.first, (String) A01.second);
    }
}
