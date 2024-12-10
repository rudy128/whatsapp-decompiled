package X;

/* renamed from: X.148  reason: invalid class name */
public final class AnonymousClass148 implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("message_span_indices", "message_span_indices_message_and_span_index", "CREATE INDEX IF NOT EXISTS \n                 message_span_indices_message_and_span_index ON \n                 message_span_indices (message_row_id, span_type)");
        r5.CDx("message_span_indices", "message_span_indices_message_and_start_index", "CREATE INDEX IF NOT EXISTS \n                message_span_indices_message_and_start_index ON \n                message_span_indices (message_row_id, start_index)");
        r5.CDx("message_span_indices", "message_span_indices_message_and_start_and_span_type_index", "CREATE INDEX IF NOT EXISTS \n                message_span_indices_message_and_start_and_span_type_index ON \n                message_span_indices (message_row_id, start_index, span_type)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r3;
        obj.A02 = "start_index";
        obj.A00 = r3;
        obj.A02 = "end_index";
        obj.A00 = r3;
        obj.A02 = "span_type";
        obj.A00 = r3;
        r7.CE6("message_span_indices", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        C18070vi.A0d(r3, 0);
        r3.CE9(C25061Ms.A00("message_span_indices"), "message_span_indices");
    }
}
