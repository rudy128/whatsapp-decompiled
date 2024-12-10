package X;

/* renamed from: X.31E  reason: invalid class name */
public final class AnonymousClass31E implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("dogfooder_diagnostics_events", "dogfooder_event_type_message_index", "CREATE INDEX IF NOT EXISTS dogfooder_event_type_message_index\nON dogfooder_diagnostics_events (event_type, event_message)");
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        C25021Mo A06 = C18070vi.A06(r6);
        C25031Mp[] r3 = new C25031Mp[4];
        A06.A02 = "_id";
        C25041Mq r2 = C25041Mq.INTEGER;
        r3[0] = C25021Mo.A00(A06, r2);
        A06.A02 = "event_type";
        C25041Mq r1 = C25041Mq.TEXT;
        A06.A00 = r1;
        C25021Mo.A07(A06, r3);
        A06.A02 = "event_message";
        C25021Mo.A06(A06, r1, r3);
        A06.A02 = "event_timestamp";
        A06.A00 = r2;
        C25021Mo.A08(A06, r3);
        r6.CE6("dogfooder_diagnostics_events", r3);
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }
}
