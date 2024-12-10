package X;

import android.util.Pair;

/* renamed from: X.12s  reason: invalid class name and case insensitive filesystem */
public final class C205912s implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "chat_row_id";
        C25041Mq r2 = C25041Mq.INTEGER;
        obj.A00 = r2;
        obj.A05 = true;
        obj.A02 = "ephemeral_trigger";
        obj.A00 = r2;
        obj.A02 = "ephemeral_initiated_by_me";
        obj.A00 = C25041Mq.BOOLEAN;
        r7.CE6("chat_ephemeral", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        Pair A01 = C25071Mt.A01("chat", "chat_ephemeral", (String) null, "chat_row_id=old._id");
        C18070vi.A0b(A01);
        r5.CE8("chat_ephemeral", (String) A01.first, (String) A01.second);
    }
}
