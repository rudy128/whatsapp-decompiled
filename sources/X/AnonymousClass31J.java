package X;

/* renamed from: X.31J  reason: invalid class name */
public class AnonymousClass31J implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        ? obj = new Object();
        C25031Mp[] r3 = new C25031Mp[4];
        obj.A02 = "jid";
        C25041Mq r2 = C25041Mq.TEXT;
        obj.A00 = r2;
        obj.A04 = true;
        r3[0] = obj.A0B();
        obj.A02 = "entry_point_type";
        obj.A00 = r2;
        C25021Mo.A07(obj, r3);
        obj.A02 = "entry_point_id";
        C25021Mo.A06(obj, r2, r3);
        obj.A02 = "entry_point_time";
        obj.A00 = C25041Mq.INTEGER;
        C25021Mo.A08(obj, r3);
        r6.CE6("wa_last_entry_point", r3);
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("wa_last_entry_point", "entry_point_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS entry_point_jid_index ON wa_last_entry_point (jid)");
    }
}
