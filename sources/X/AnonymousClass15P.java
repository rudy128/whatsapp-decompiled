package X;

/* renamed from: X.15P  reason: invalid class name */
public class AnonymousClass15P implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "sidecar";
        C25041Mq r1 = C25041Mq.BLOB;
        obj.A00 = r1;
        obj.A02 = "chunk_lengths";
        obj.A00 = r1;
        obj.A02 = "timestamp";
        obj.A00 = r3;
        r7.CE6("message_streaming_sidecar", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        r3.CE9(C25061Ms.A00("message_streaming_sidecar"), "message_streaming_sidecar");
    }
}
