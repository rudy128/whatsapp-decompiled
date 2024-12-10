package X;

/* renamed from: X.ARb  reason: case insensitive filesystem */
public class C20591ARb implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("wa_biz_profiles_service_areas", "biz_profile_id_service_area_index", " CREATE INDEX IF NOT EXISTS biz_profile_id_service_area_index ON wa_biz_profiles_service_areas(wa_biz_profile_id);");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        ? obj = new Object();
        C25031Mp[] r3 = new C25031Mp[6];
        obj.A02 = "_id";
        C25041Mq r2 = C25041Mq.INTEGER;
        r3[0] = C25021Mo.A00(obj, r2);
        obj.A02 = "wa_biz_profile_id";
        obj.A00 = r2;
        C25021Mo.A07(obj, r3);
        obj.A02 = "area_description";
        C25021Mo.A06(obj, C25041Mq.TEXT, r3);
        AnonymousClass8BR.A1F(obj, r2, "radius");
        C25021Mo.A08(obj, r3);
        obj.A02 = "center_latitude";
        C25041Mq r1 = C25041Mq.REAL;
        C25021Mo.A05(obj, r1, r3);
        AnonymousClass8BR.A1F(obj, r1, "center_longitude");
        r3[5] = obj.A0B();
        r6.CE6("wa_biz_profiles_service_areas", r3);
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        r4.CE8("wa_biz_profiles_service_areas", "business_profiles_bd_for_service_areas_trigger", "CREATE TRIGGER business_profiles_bd_for_service_areas_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_service_areas WHERE wa_biz_profile_id = old._id; END");
    }
}
