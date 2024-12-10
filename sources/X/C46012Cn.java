package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Cn  reason: invalid class name and case insensitive filesystem */
public class C46012Cn extends C60192nY {
    public final AnonymousClass11S A00;
    public final AnonymousClass11Q A01;
    public final AnonymousClass11P A02;
    public final C19830z4 A03;
    public final AnonymousClass1LW A04;
    public final C18030ve A05;
    public final C30191dX A06;
    public final AnonymousClass00H A07;

    public List A0L() {
        C166378cn A09;
        C17960vV.A0D(!this.A00.A0N());
        ArrayList A0K = A0K();
        C26331Rs r3 = this.A00;
        ArrayList A032 = C26331Rs.A03(r3, "primary_feature", true);
        if (A032.isEmpty()) {
            A032 = C26331Rs.A03(r3, "primary_feature", false);
        }
        if (!A032.isEmpty() && (A09 = ((C20126A8l) A032.get(0)).A09()) != null) {
            AnonymousClass8XN r0 = A09.primaryFeature_;
            if (r0 == null) {
                r0 = AnonymousClass8XN.DEFAULT_INSTANCE;
            }
            if (!(!A0K.equals(r0.flags_))) {
                return Collections.emptyList();
            }
        }
        return Collections.singletonList(new C46242Du((C19999A2n) null, (String) null, A0K, AnonymousClass11P.A01(this.A02)));
    }

    public C46012Cn(AnonymousClass11S r1, C30191dX r2, AnonymousClass11Q r3, AnonymousClass11P r4, C19830z4 r5, AnonymousClass1LW r6, C26331Rs r7, C18030ve r8, AnonymousClass00H r9) {
        super(r7);
        this.A02 = r4;
        this.A05 = r8;
        this.A04 = r6;
        this.A00 = r1;
        this.A07 = r9;
        this.A06 = r2;
        this.A03 = r5;
        this.A01 = r3;
    }

    public ArrayList A0K() {
        ArrayList A13 = AnonymousClass000.A13();
        C18030ve r6 = this.A05;
        C18040vf r5 = C18040vf.A02;
        if (C18020vd.A05(r5, r6, 1312)) {
            A13.add("ddm_settings");
        }
        if (C18020vd.A05(r5, r6, 2775)) {
            A13.add("favorite_sticker");
        }
        if (C18020vd.A05(r5, r6, 2156)) {
            A13.add("link_preview");
        }
        if (C18020vd.A05(r5, r6, 1394)) {
            A13.add("poll_creation_group");
        }
        if (C18020vd.A05(r5, r6, 2194)) {
            A13.add("poll_creation_on_one_one");
        }
        if (C18020vd.A05(r5, r6, 2738)) {
            A13.add("poll_creation_cag");
        }
        if (((AnonymousClass1c4) this.A07.get()).A08()) {
            A13.add("newsletter");
        }
        if (C18020vd.A05(r5, r6, 3530)) {
            A13.add("external_web_beta_opt_in");
        }
        if (C18020vd.A05(r5, r6, 3665)) {
            A13.add("link_preview_hq_thumbnail");
        }
        if (C18020vd.A05(r5, r6, 4135) || C18020vd.A05(r5, r6, 3337)) {
            A13.add("history_sync_on_demand");
        }
        if (C18020vd.A05(r5, r6, 4905)) {
            A13.add("post_status_in_companion");
        }
        if (C18020vd.A05(C18040vf.A01, r6, 8929)) {
            A13.add("primary_favorites_sync_support");
        }
        if (C18020vd.A05(r5, r6, 4596)) {
            A13.add("primary_campaign_id_in_history_sync_support");
        }
        C19830z4 r4 = this.A03;
        if (r4.A2P() || this.A00.A0C().length() > 0) {
            A13.add("username_is_set");
            C17880vN.A1F(C19830z4.A00(r4), "username_ever_set", true);
        }
        if (!C17880vN.A1W(C17890vO.A0B(r4), "username_chats_ever_existed")) {
            Iterator A0j = C17890vO.A0j(this.A04.A0D());
            while (true) {
                if (A0j.hasNext()) {
                    if (C49502Qs.USERNAME.equals(((C29691ci) A0j.next()).A0b)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            A13.add("username_chats_exist");
            C17880vN.A1F(C19830z4.A00(r4), "username_chats_ever_existed", true);
        }
        if (C18020vd.A05(r5, r6, 4745)) {
            A13.add("username_supported");
        }
        if (C18020vd.A06(r6)) {
            A13.add("text_status_creation_support");
        }
        if (C18020vd.A05(r5, r6, 5839)) {
            A13.add("text_status_receive_support");
        }
        if (C18020vd.A05(r5, r6, 11032) && C18020vd.A05(r5, r6, 5868)) {
            A13.add("companion_contact_change_enabled");
            if (this.A06.A00()) {
                A13.add("primary_has_addressbook_permission");
            }
            if (r4.A2J()) {
                A13.add("is_contacts_backup_on");
            }
            if (r4.A2K()) {
                A13.add("primary_has_agreed_to_native_contacts_nux");
            }
            if (C18020vd.A05(r5, r6, 8543) && C18020vd.A05(r5, r6, 5868)) {
                int A0D = r4.A0D();
                long A0O = r4.A0O();
                long A0P = r4.A0P();
                if (A0D == 2 || (A0D == 1 && A0O <= 0 && A0P >= AnonymousClass11P.A01(this.A02) - 172800000)) {
                    A13.add("is_account_integrity_state_pending");
                }
            }
            if (r4.A0D() == 3) {
                A13.add("is_account_integrity_state_timelock");
            }
            if (C18020vd.A05(r5, r6, 11660)) {
                A13.add("ai_fbid_migration_receiving_enabled");
            }
        }
        A13.add("reactions_send");
        A13.add("vo_sp_receiver");
        A13.add("disable_link_previews");
        return A13;
    }
}
