package X;

/* renamed from: X.31I  reason: invalid class name */
public final class AnonymousClass31I implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("wa_group_admin_settings", "group_admin_settings_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_admin_settings_jid_index ON wa_group_admin_settings (jid)");
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r9) {
        C25021Mo A06 = C18070vi.A06(r9);
        C25031Mp[] r2 = new C25031Mp[21];
        A06.A02 = "jid";
        C25041Mq r7 = C25041Mq.TEXT;
        A06.A00 = r7;
        C25021Mo.A09(A06, r2);
        A06.A02 = "restrict_mode";
        C25041Mq r5 = C25041Mq.BOOLEAN;
        A06.A00 = r5;
        C25021Mo.A07(A06, r2);
        r2[2] = C25021Mo.A01(A06, r5, "announcement_group");
        A06.A02 = "no_frequently_forwarded";
        A06.A00 = r5;
        A06.A04 = true;
        A06.A0E(0);
        C25021Mo.A08(A06, r2);
        A06.A02 = "ephemeral_duration";
        C25041Mq r3 = C25041Mq.INTEGER;
        A06.A00 = r3;
        A06.A01 = "NULL";
        r2[4] = A06.A0B();
        r2[5] = C25021Mo.A02(A06, r7, "creator_jid");
        r2[6] = C25021Mo.A01(A06, r5, "in_app_support");
        r2[7] = C25021Mo.A02(A06, r5, "is_suspended");
        r2[8] = C25021Mo.A01(A06, r3, "group_state");
        r2[9] = C25021Mo.A01(A06, r5, "require_membership_approval");
        r2[10] = C25021Mo.A01(A06, r3, "member_add_mode");
        r2[11] = C25021Mo.A02(A06, r5, "incognito");
        r2[12] = C25021Mo.A01(A06, r5, "is_pending_requests_banner_acknowledged");
        r2[13] = C25021Mo.A02(A06, r5, "is_report_to_admin_enabled");
        A06.A02 = "addressing_mode";
        A06.A00 = r7;
        A06.A04 = true;
        A06.A01 = "'pn'";
        r2[14] = A06.A0B();
        r2[15] = C25021Mo.A02(A06, r5, "allow_non_admin_subgroup_creation");
        r2[16] = C25021Mo.A01(A06, r5, "is_pending_suggestions_banner_acknowledged");
        r2[17] = C25021Mo.A02(A06, r5, "history_enabled");
        r2[18] = C25021Mo.A02(A06, r5, "auto_add_disabled");
        r2[19] = C25021Mo.A02(A06, r3, "is_hidden_subgroup");
        r2[20] = C25021Mo.A02(A06, r3, "e2ee_state");
        r9.CE6("wa_group_admin_settings", r2);
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        C18070vi.A0d(r4, 0);
        r4.CE8("wa_group_admin_settings", "group_admin_settings_deletion_trigger", "CREATE TRIGGER group_admin_settings_deletion_trigger BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_group_admin_settings WHERE jid = old.jid; END");
    }
}
