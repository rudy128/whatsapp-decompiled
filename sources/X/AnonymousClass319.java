package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.319  reason: invalid class name */
public final class AnonymousClass319 implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("wa_biz_profiles_price_tiers", "biz_profile_id_price_tier_index", "CREATE INDEX IF NOT EXISTS biz_profile_id_price_tier_index ON wa_biz_profiles_price_tiers(_id);");
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C25021Mo A06 = C18070vi.A06(r7);
        C25031Mp[] r3 = new C25031Mp[3];
        A06.A02 = "_id";
        C25041Mq r2 = C25041Mq.TEXT;
        A06.A00 = r2;
        A06.A05 = true;
        r3[0] = A06.A0B();
        r3[1] = C25021Mo.A02(A06, r2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        A06.A02 = "symbol";
        C25021Mo.A06(A06, r2, r3);
        r7.CE6("wa_biz_profiles_price_tiers", r3);
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }
}
