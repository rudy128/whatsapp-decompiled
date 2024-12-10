package X;

/* renamed from: X.12a  reason: invalid class name and case insensitive filesystem */
public class C204112a implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("agent_devices", "agent_device_index", "CREATE INDEX IF NOT EXISTS agent_device_index ON agent_devices (device)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "agent_id";
        C25041Mq r6 = C25041Mq.TEXT;
        obj.A00 = r6;
        obj.A05 = true;
        obj.A04 = true;
        obj.A02 = "device";
        C25041Mq r2 = C25041Mq.INTEGER;
        obj.A00 = r2;
        obj.A02 = "last_modified_time";
        obj.A00 = r2;
        obj.A02 = "is_deleted";
        obj.A00 = C25041Mq.BOOLEAN;
        r8.CE6("agent_devices", obj.A0B(), new C25031Mp(r6, "agent_name", "UNIQUE NOT NULL"), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
