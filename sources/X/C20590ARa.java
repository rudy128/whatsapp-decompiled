package X;

/* renamed from: X.ARa  reason: case insensitive filesystem */
public class C20590ARa implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("wa_biz_profiles_linked_accounts_table", "wa_biz_profiles_linked_accounts_index", " CREATE INDEX IF NOT EXISTS wa_biz_profiles_linked_accounts_index ON wa_biz_profiles_linked_accounts_table(wa_biz_profile_id);");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        C25031Mp[] r3 = new C25031Mp[7];
        obj.A02 = "_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        r3[0] = C25021Mo.A00(obj, r4);
        obj.A02 = "wa_biz_profile_id";
        obj.A00 = r4;
        C25021Mo.A07(obj, r3);
        obj.A02 = "account_id";
        C25041Mq r1 = C25041Mq.TEXT;
        C25021Mo.A04(obj, r1, r3);
        AnonymousClass8BR.A1F(obj, r4, "account_type");
        C25021Mo.A08(obj, r3);
        obj.A02 = "account_display_name";
        C25021Mo.A05(obj, r1, r3);
        AnonymousClass8BR.A1F(obj, r4, "account_fan_count");
        r3[5] = obj.A0B();
        AnonymousClass8BR.A1F(obj, r4, "account_has_media_post");
        obj.A0E(0);
        r3[6] = obj.A0B();
        r7.CE6("wa_biz_profiles_linked_accounts_table", r3);
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        r4.CE8("wa_biz_profiles_linked_accounts_table", "business_profiles_bd_for_linked_accounts_trigger", "CREATE TRIGGER business_profiles_bd_for_linked_accounts_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_linked_accounts_table WHERE wa_biz_profile_id = old._id; END");
    }
}
