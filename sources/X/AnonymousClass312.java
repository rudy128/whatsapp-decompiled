package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.312  reason: invalid class name */
public final class AnonymousClass312 implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        C25021Mo A06 = C18070vi.A06(r8);
        C25031Mp[] r3 = new C25031Mp[20];
        A06.A02 = "jid";
        C25041Mq r2 = C25041Mq.TEXT;
        A06.A00 = r2;
        A06.A04 = true;
        A06.A05 = true;
        r3[0] = A06.A0B();
        A06.A02 = "tag";
        C25041Mq r4 = C25041Mq.INTEGER;
        A06.A00 = r4;
        A06.A0E(0);
        r3[1] = A06.A0B();
        A06.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        C25021Mo.A06(A06, r2, r3);
        A06.A02 = "is_default";
        A06.A00 = C25041Mq.BOOLEAN;
        C25021Mo.A08(A06, r3);
        r3[4] = C25021Mo.A02(A06, r2, "attributes");
        r3[5] = C25021Mo.A02(A06, r2, "description");
        r3[6] = C25021Mo.A02(A06, r2, "category");
        r3[7] = C25021Mo.A02(A06, r2, "prompts");
        r3[8] = C25021Mo.A02(A06, r2, "persona_id");
        r3[9] = C25021Mo.A02(A06, r2, "commands_description");
        r3[10] = C25021Mo.A02(A06, r2, "commands");
        r3[11] = C25021Mo.A02(A06, r2, "avatar_url");
        r3[12] = C25021Mo.A02(A06, r4, "is_meta_created");
        r3[13] = C25021Mo.A02(A06, r2, "creator_name");
        r3[14] = C25021Mo.A02(A06, r2, "creator_profile_url");
        r3[15] = C25021Mo.A02(A06, r2, "card_title");
        r3[16] = C25021Mo.A02(A06, r4, "count");
        A06.A02 = "capabilities";
        C25041Mq r22 = C25041Mq.LONG;
        A06.A00 = r22;
        r3[17] = A06.A0B();
        r3[18] = C25021Mo.A02(A06, r22, "last_updated_time_ms");
        r3[19] = C25021Mo.A02(A06, r4, "created_by_me");
        r8.CE6("wa_bot_profiles", r3);
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }
}
