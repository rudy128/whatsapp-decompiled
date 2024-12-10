package X;

/* renamed from: X.13C  reason: invalid class name */
public final class AnonymousClass13C implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("integrator_display_name", "integrator_opt_in_index", "CREATE INDEX IF NOT EXISTS integrator_opt_in_index ON integrator_display_name (opt_in_status)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r9) {
        C18070vi.A0d(r9, 0);
        ? obj = new Object();
        obj.A02 = "integrator_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A04 = true;
        obj.A02 = "display_name";
        C25041Mq r7 = C25041Mq.TEXT;
        obj.A00 = r7;
        obj.A04 = true;
        obj.A02 = "status";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "icon_path";
        obj.A00 = r7;
        obj.A04 = true;
        obj.A01 = "''";
        obj.A02 = "opt_in_status";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "identifier_type";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A0E(0);
        r9.CE6("integrator_display_name", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }
}
