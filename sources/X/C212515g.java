package X;

/* renamed from: X.15g  reason: invalid class name and case insensitive filesystem */
public final class C212515g implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("user_device", "user_device_index", "\n            CREATE UNIQUE INDEX IF NOT EXISTS \n            user_device_index ON user_device \n                (\n                    user_jid_row_id,\n                    device_jid_row_id\n                )\n        ");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        C18070vi.A0d(r8, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "user_jid_row_id";
        obj.A00 = r3;
        obj.A02 = "device_jid_row_id";
        obj.A00 = r3;
        obj.A02 = "key_index";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A0E(0);
        r8.CE6("user_device", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }
}
