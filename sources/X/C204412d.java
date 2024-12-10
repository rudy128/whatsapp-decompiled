package X;

/* renamed from: X.12d  reason: invalid class name and case insensitive filesystem */
public final class C204412d implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A02 = "waveform";
        obj.A00 = C25041Mq.BLOB;
        obj.A02 = "background_color";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "transcription_status";
        obj.A00 = r4;
        obj.A02 = "transcription_locale";
        obj.A00 = r4;
        obj.A02 = "transcription_confidence_threshold";
        obj.A00 = r4;
        obj.A02 = "transcription_request_locale";
        obj.A00 = r4;
        obj.A02 = "transcription_feedback_submitted";
        obj.A00 = r4;
        obj.A02 = "transcription_id";
        obj.A00 = C25041Mq.TEXT;
        r7.CE6("audio_data", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r3) {
        C18070vi.A0d(r3, 0);
        r3.CE9(C25061Ms.A00("audio_data"), "audio_data");
    }
}
