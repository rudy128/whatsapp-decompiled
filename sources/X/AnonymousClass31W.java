package X;

/* renamed from: X.31W  reason: invalid class name */
public class AnonymousClass31W implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        ? obj = new Object();
        C25031Mp[] r3 = new C25031Mp[5];
        obj.A02 = "_id";
        r3[0] = C25021Mo.A00(obj, C25041Mq.INTEGER);
        obj.A02 = "jid";
        C25041Mq r2 = C25041Mq.TEXT;
        obj.A00 = r2;
        C25021Mo.A07(obj, r3);
        obj.A02 = "lg";
        C25021Mo.A04(obj, r2, r3);
        obj.A02 = "lc";
        obj.A00 = r2;
        obj.A04 = true;
        C25021Mo.A08(obj, r3);
        obj.A02 = "verified_name";
        C25021Mo.A05(obj, r2, r3);
        r6.CE6("wa_vnames_localized", r3);
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("wa_vnames_localized", "vname_localized_index", "CREATE UNIQUE INDEX IF NOT EXISTS vname_localized_index ON wa_vnames_localized (jid, lg, lc);");
    }
}
