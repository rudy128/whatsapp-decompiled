package X;

import android.util.Pair;

/* renamed from: X.15V  reason: invalid class name */
public class AnonymousClass15V implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A02 = "customer_message_row_id";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "tokenized_customer_message";
        obj.A00 = C25041Mq.STRING;
        obj.A02 = "customer_message_embedding";
        obj.A00 = C25041Mq.BLOB;
        r7.CE6("suggested_replies", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        Pair A01 = C25071Mt.A01("message", "suggested_replies", (String) null, "message_row_id=old._id OR customer_message_row_id=old._id");
        r5.CE8("suggested_replies", (String) A01.first, (String) A01.second);
        r5.CE8("suggested_replies", "suggested_replies_delete_oldest_trigger", "CREATE TRIGGER IF NOT EXISTS suggested_replies_delete_oldest_trigger BEFORE INSERT ON suggested_replies FOR EACH ROW WHEN (SELECT COUNT(*) FROM suggested_replies ) > 2000 BEGIN DELETE FROM suggested_replies WHERE message_row_id = (SELECT MIN(message_row_id) FROM suggested_replies); END;");
    }
}
