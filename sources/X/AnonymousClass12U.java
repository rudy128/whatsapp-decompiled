package X;

/* renamed from: X.12U  reason: invalid class name */
public class AnonymousClass12U implements AnonymousClass12T {
    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "wa_biz_profile_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "country_code";
        obj.A00 = C25041Mq.TEXT;
        r7.CE6("wa_biz_profiles_direct_connection_allowed_country_codes", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("wa_biz_profiles_direct_connection_allowed_country_codes", "biz_profile_id_index", " CREATE INDEX IF NOT EXISTS biz_profile_id_index ON wa_biz_profiles_direct_connection_allowed_country_codes(wa_biz_profile_id);");
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        r4.CE8("wa_biz_profiles_direct_connection_allowed_country_codes", "wa_biz_profiles_bd_direct_connection_allowed_country_codes_trigger", "CREATE TRIGGER wa_biz_profiles_bd_direct_connection_allowed_country_codes_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_direct_connection_allowed_country_codes WHERE wa_biz_profile_id = old._id; END");
    }
}
