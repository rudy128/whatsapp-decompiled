package X;

/* renamed from: X.31Y  reason: invalid class name */
public class AnonymousClass31Y implements AnonymousClass12T {
    public static final String[] A00 = {"_id", "jid", "serial", "issuer", "expires", "verified_name", "industry", "city", "country", "verified_level", "cert_blob", "identity_unconfirmed_since", "host_storage", "actual_actors", "privacy_mode_ts"};

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r9) {
        ? obj = new Object();
        C25031Mp[] r2 = new C25031Mp[15];
        obj.A02 = "_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        r2[0] = C25021Mo.A00(obj, r4);
        obj.A02 = "jid";
        C25041Mq r6 = C25041Mq.TEXT;
        obj.A00 = r6;
        C25021Mo.A07(obj, r2);
        obj.A02 = "serial";
        C25021Mo.A04(obj, r4, r2);
        obj.A02 = "issuer";
        obj.A00 = r6;
        obj.A04 = true;
        C25021Mo.A08(obj, r2);
        r2[4] = C25021Mo.A02(obj, r4, "expires");
        obj.A02 = "verified_name";
        obj.A00 = r6;
        obj.A04 = true;
        r2[5] = obj.A0B();
        r2[6] = C25021Mo.A02(obj, r6, "industry");
        r2[7] = C25021Mo.A02(obj, r6, "city");
        r2[8] = C25021Mo.A02(obj, r6, "country");
        r2[9] = C25021Mo.A02(obj, r4, "verified_level");
        r2[10] = C25021Mo.A02(obj, r4, "identity_unconfirmed_since");
        obj.A02 = "cert_blob";
        obj.A00 = C25041Mq.BLOB;
        r2[11] = obj.A0B();
        obj.A02 = "host_storage";
        obj.A00 = r4;
        obj.A0E(0);
        r2[12] = obj.A0B();
        obj.A02 = "actual_actors";
        obj.A00 = r4;
        obj.A0E(0);
        r2[13] = obj.A0B();
        obj.A02 = "privacy_mode_ts";
        obj.A00 = r4;
        obj.A0E(0);
        r2[14] = obj.A0B();
        r9.CE6("wa_vnames", r2);
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("wa_vnames", "vname_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS vname_jid_index ON wa_vnames (jid);");
    }
}
