package X;

/* renamed from: X.317  reason: invalid class name */
public final class AnonymousClass317 implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("wa_biz_profiles_dc_enabled_features", "dc_enabled_features_biz_profile_id_index", "CREATE INDEX IF NOT EXISTS dc_enabled_features_biz_profile_id_index ON wa_biz_profiles_dc_enabled_features(wa_biz_profile_id);");
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        C25021Mo A06 = C18070vi.A06(r6);
        C25031Mp[] r2 = new C25031Mp[3];
        A06.A02 = "_id";
        C25041Mq r1 = C25041Mq.INTEGER;
        r2[0] = C25021Mo.A00(A06, r1);
        A06.A02 = "wa_biz_profile_id";
        A06.A00 = r1;
        C25021Mo.A07(A06, r2);
        A06.A02 = "catalog_feature_type";
        C25021Mo.A06(A06, C25041Mq.TEXT, r2);
        r6.CE6("wa_biz_profiles_dc_enabled_features", r2);
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        C18070vi.A0d(r4, 0);
        r4.CE8("wa_biz_profiles_dc_enabled_features", "before_delete_dc_enabled_features_trigger", "CREATE TRIGGER before_delete_dc_enabled_features_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_dc_enabled_features WHERE wa_biz_profile_id = old._id; END");
    }
}
