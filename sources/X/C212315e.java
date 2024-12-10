package X;

/* renamed from: X.15e  reason: invalid class name and case insensitive filesystem */
public final class C212315e implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("transcription_segment", "transcription_segment_message_row_id_index", "\n          CREATE INDEX IF NOT EXISTS transcription_segment_message_row_id_index\n          ON transcription_segment (message_row_id)\n        ");
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
        obj.A04 = true;
        obj.A02 = "substring_start";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "substring_length";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "timestamp";
        obj.A00 = r3;
        obj.A02 = "duration";
        obj.A00 = r3;
        obj.A02 = "confidence";
        obj.A00 = r3;
        r7.CE6("transcription_segment", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        C18070vi.A0d(r3, 0);
        r3.CE9(C25061Ms.A00("transcription_segment"), "transcription_segment");
    }
}
