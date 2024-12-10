package X;

import android.util.Pair;

/* renamed from: X.15t  reason: invalid class name and case insensitive filesystem */
public final class C213815t implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("message_comment", "message_comment_parent_message_row_id_unique_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_comment_parent_message_row_id_unique_index ON message_comment (parent_message_row_id, message_row_id)");
        r5.CDx("message_comment", "message_comment_message_row_id_index", "CREATE INDEX IF NOT EXISTS message_comment_message_row_id_index ON message_comment (message_row_id)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r2 = C25041Mq.INTEGER;
        obj.A00 = r2;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "parent_message_row_id";
        obj.A00 = r2;
        obj.A02 = "message_row_id";
        obj.A00 = r2;
        r7.CE6("message_comment", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        Pair A01 = C25071Mt.A01("message", "message_comment", (String) null, "message_row_id=old._id");
        r5.CE8("message_comment", (String) A01.first, (String) A01.second);
    }
}
