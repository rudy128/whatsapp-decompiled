package X;

/* renamed from: X.12u  reason: invalid class name and case insensitive filesystem */
public final class C206112u implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "chat_row_id";
        C25041Mq r5 = C25041Mq.INTEGER;
        obj.A00 = r5;
        obj.A05 = true;
        obj.A02 = "last_activity_ts";
        obj.A00 = r5;
        obj.A02 = "last_activity_seen_ts";
        obj.A00 = r5;
        obj.A02 = "join_ts";
        obj.A00 = r5;
        obj.A02 = "closed";
        obj.A00 = r5;
        obj.A04 = true;
        obj.A01 = "0";
        r7.CE6("community_chat", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("chat", "community_chat", (String) null, "chat_row_id=old._id"), "community_chat");
    }
}
