package X;

/* renamed from: X.13y  reason: invalid class name and case insensitive filesystem */
public final class C209113y implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r2 = C25041Mq.INTEGER;
        obj.A00 = r2;
        obj.A05 = true;
        obj.A02 = "video_call";
        obj.A00 = C25041Mq.BOOLEAN;
        obj.A02 = "call_result";
        obj.A00 = r2;
        r7.CE6("message_quoted_call_log", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        r5.CE9(C25071Mt.A01("message_quoted", "message_quoted_call_log", (String) null, "message_row_id=old.message_row_id"), "message_quoted_call_log");
    }
}
