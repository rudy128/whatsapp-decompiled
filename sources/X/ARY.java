package X;

public final class ARY implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        C18070vi.A0d(r4, 0);
        r4.CE8("wa_biz_profiles_bot_attributes", "business_profiles_bd_for_bot_attributes_trigger", "CREATE TRIGGER business_profiles_bd_for_bot_attributes_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_bot_attributes WHERE wa_biz_profile_id = old._id; END");
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        C25021Mo A06 = C18070vi.A06(r6);
        C25031Mp[] r3 = new C25031Mp[6];
        A06.A02 = "wa_biz_profile_id";
        A06.A00 = C25041Mq.INTEGER;
        A06.A0D();
        C25021Mo.A09(A06, r3);
        A06.A02 = "sub_description";
        C25041Mq r2 = C25041Mq.TEXT;
        A06.A00 = r2;
        r3[1] = A06.A0B();
        A06.A02 = "commands";
        C25021Mo.A06(A06, r2, r3);
        A06.A02 = "prompts";
        A06.A00 = r2;
        C25021Mo.A08(A06, r3);
        r3[4] = C25021Mo.A02(A06, r2, "commands_description");
        r3[5] = C25021Mo.A02(A06, r2, "bot_description");
        r6.CE6("wa_biz_profiles_bot_attributes", r3);
    }
}
