package X;

import android.util.Pair;

/* renamed from: X.13S  reason: invalid class name */
public final class AnonymousClass13S implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("message_association", "message_association_child_message_row_id_and_association_type_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_association_child_message_row_id_and_association_type_index ON message_association (child_message_row_id, association_type)");
        r5.CDx("message_association", "message_association_parent_message_row_id_and_association_type_index", "CREATE INDEX IF NOT EXISTS message_association_parent_message_row_id_and_association_type_index ON message_association (parent_message_row_id, association_type)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "child_message_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "parent_message_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "association_type";
        obj.A00 = r3;
        obj.A04 = true;
        r7.CE6("message_association", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        Pair A01 = C25071Mt.A01("message", "message_association", "child", "child_message_row_id=old._id");
        r5.CE8("message_association", (String) A01.first, (String) A01.second);
        Pair A012 = C25071Mt.A01("message", "message_association", "parent", "parent_message_row_id=old._id");
        r5.CE8("message_association", (String) A012.first, (String) A012.second);
    }
}
