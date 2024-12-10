package X;

/* renamed from: X.31B  reason: invalid class name */
public class AnonymousClass31B implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        ? obj = new Object();
        C25031Mp[] r3 = new C25031Mp[4];
        obj.A02 = "_id";
        C25041Mq r2 = C25041Mq.INTEGER;
        r3[0] = C25021Mo.A00(obj, r2);
        obj.A02 = "jid";
        obj.A00 = C25041Mq.TEXT;
        C25021Mo.A07(obj, r3);
        obj.A02 = "conversation_size";
        C25021Mo.A04(obj, r2, r3);
        obj.A02 = "conversation_message_count";
        obj.A00 = r2;
        obj.A04 = true;
        C25021Mo.A08(obj, r3);
        r6.CE6("wa_contact_storage_usage", r3);
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("wa_contact_storage_usage", "wa_contact_storage_usage_index", " CREATE INDEX IF NOT EXISTS wa_contact_storage_usage_index ON wa_contact_storage_usage (jid, conversation_size DESC)");
    }
}
