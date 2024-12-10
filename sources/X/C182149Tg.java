package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9Tg  reason: invalid class name and case insensitive filesystem */
public abstract class C182149Tg {
    public static final String A00;

    static {
        StringBuilder A0e = C17890vO.A0e();
        String[] A1b = AnonymousClass8BR.A1b();
        A1b[0] = "_id";
        A1b[1] = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        A1b[2] = "symbol";
        AnonymousClass1H2.A02("wa_biz_profiles_price_tiers", A0e, A1b);
        A00 = AnonymousClass000.A0y(" FROM wa_biz_profiles_price_tiers INNER JOIN wa_biz_profiles ON wa_biz_profiles._id = ? AND wa_biz_profiles.price_tier_id = wa_biz_profiles_price_tiers._id", A0e);
    }
}
