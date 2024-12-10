package X;

import android.util.Pair;

/* renamed from: X.15q  reason: invalid class name and case insensitive filesystem */
public final class C213515q implements AnonymousClass12T {
    public static final String[] A00 = {"edit_type", "message_edit_version"};

    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "message_add_on_row_id";
        C25041Mq r2 = C25041Mq.INTEGER;
        obj.A00 = r2;
        obj.A05 = true;
        obj.A02 = "edit_type";
        obj.A00 = r2;
        obj.A04 = true;
        obj.A01 = "0";
        obj.A02 = "message_edit_version";
        obj.A00 = r2;
        r7.CE6("message_add_on_scheduled_call_edit", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        Pair A01 = C25071Mt.A01("message_add_on", "message_add_on_scheduled_call_edit", (String) null, "message_add_on_row_id=old._id");
        C18070vi.A0b(A01);
        r5.CE8("message_add_on_scheduled_call_edit", (String) A01.first, (String) A01.second);
    }
}
