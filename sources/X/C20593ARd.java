package X;

/* renamed from: X.ARd  reason: case insensitive filesystem */
public class C20593ARd implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("wa_biz_profiles", "biz_profile_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS biz_profile_jid_index ON wa_biz_profiles (jid);");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r9) {
        ? obj = new Object();
        C25031Mp[] r2 = new C25031Mp[39];
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        r2[0] = C25021Mo.A00(obj, r3);
        obj.A02 = "jid";
        C25041Mq r6 = C25041Mq.TEXT;
        obj.A00 = r6;
        C25021Mo.A07(obj, r2);
        obj.A02 = "email";
        C25021Mo.A06(obj, r6, r2);
        obj.A02 = "address";
        obj.A00 = r6;
        C25021Mo.A08(obj, r2);
        r2[4] = C25021Mo.A02(obj, r6, "business_description");
        obj.A02 = "latitude";
        C25041Mq r5 = C25041Mq.REAL;
        obj.A00 = r5;
        r2[5] = obj.A0B();
        r2[6] = C25021Mo.A02(obj, r5, "longitude");
        r2[7] = C25021Mo.A02(obj, r6, "tag");
        r2[8] = C25021Mo.A02(obj, r6, "vertical");
        r2[9] = C25021Mo.A02(obj, r6, "time_zone");
        r2[10] = C25021Mo.A02(obj, r6, "hours_note");
        obj.A02 = "has_catalog";
        C25041Mq r52 = C25041Mq.BOOLEAN;
        obj.A00 = r52;
        obj.A0E(0);
        r2[11] = obj.A0B();
        r2[12] = C25021Mo.A02(obj, r6, "address_postal_code");
        r2[13] = C25021Mo.A02(obj, r6, "address_city_id");
        r2[14] = C25021Mo.A02(obj, r6, "address_city_name");
        r2[15] = C25021Mo.A02(obj, r6, "commerce_experience");
        r2[16] = C25021Mo.A02(obj, r6, "shop_url");
        r2[17] = AnonymousClass8BW.A0H(obj, r52, "cart_enabled");
        r2[18] = C25021Mo.A02(obj, r6, "commerce_manager_url");
        r2[19] = AnonymousClass8BW.A0H(obj, r52, "direct_connection_enabled");
        r2[20] = AnonymousClass8BW.A0H(obj, r52, "is_shop_banned");
        r2[21] = C25021Mo.A02(obj, r6, "default_postcode");
        r2[22] = C25021Mo.A02(obj, r6, "location_name");
        r2[23] = AnonymousClass8BW.A0H(obj, r52, "galaxy_business_enabled");
        r2[24] = C25021Mo.A02(obj, r6, "cover_photo_url");
        r2[25] = C25021Mo.A02(obj, r6, "cover_photo_id");
        r2[26] = C25021Mo.A02(obj, r6, "custom_url");
        r2[27] = C25021Mo.A02(obj, r6, "member_since");
        r2[28] = AnonymousClass8BW.A0H(obj, r52, "capi_calling_enabled");
        r2[29] = AnonymousClass8BW.A0H(obj, r52, "is_responsive");
        r2[30] = C25021Mo.A02(obj, r6, "postcode_type");
        r2[31] = C25021Mo.A02(obj, r6, "price_tier_id");
        r2[32] = C25021Mo.A02(obj, r6, "business_blocked_status");
        r2[33] = C25021Mo.A02(obj, r3, "survey_sampling_rate");
        r2[34] = AnonymousClass8BW.A0H(obj, r52, "is_offerings_eligible");
        r2[35] = C25021Mo.A02(obj, r3, "automated_type");
        r2[36] = C25021Mo.A02(obj, r3, "is_typing_indicator_enabled");
        r2[37] = C25021Mo.A02(obj, r3, "calling_hidden_entry_points");
        r2[38] = C25021Mo.A02(obj, r3, "business_has_shopping_flow");
        r9.CE6("wa_biz_profiles", r2);
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        r4.CE8("wa_biz_profiles", "contact_bd_for_business_profiles", "CREATE TRIGGER contact_bd_for_business_profiles BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_biz_profiles WHERE jid = old.jid; END");
        r4.CE8("wa_biz_profiles", "contact_bu_for_business_profiles", "CREATE TRIGGER contact_bu_for_business_profiles BEFORE UPDATE ON wa_contacts BEGIN UPDATE wa_biz_profiles SET jid = new.jid WHERE jid = old.jid; END");
    }
}
