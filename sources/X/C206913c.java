package X;

/* renamed from: X.13c  reason: invalid class name and case insensitive filesystem */
public class C206913c implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r5 = C25041Mq.INTEGER;
        obj.A00 = r5;
        obj.A05 = true;
        obj.A02 = "version";
        obj.A00 = r5;
        obj.A02 = "data";
        C25041Mq r3 = C25041Mq.BLOB;
        obj.A00 = r3;
        obj.A02 = "future_message_type";
        obj.A00 = r5;
        obj.A02 = "future_proof_stanza";
        obj.A00 = r3;
        obj.A02 = "edit_version";
        obj.A00 = r5;
        obj.A02 = "message_stanza_data";
        obj.A00 = r3;
        r7.CE6("message_future", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        r3.CE9(C25061Ms.A00("message_future"), "message_future");
    }
}
