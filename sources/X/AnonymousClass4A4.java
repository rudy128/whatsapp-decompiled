package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4A4  reason: invalid class name */
public class AnonymousClass4A4 extends C178869Et {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass4A4(String str, int i) {
        C29621ca A002;
        String str2;
        String str3;
        int i2;
        String[] strArr;
        int i3;
        String str4;
        this.A00 = i;
        switch (i) {
            case 1:
                String[] strArr2 = new String[10];
                strArr2[0] = "accept_invite_conflict_recovery";
                strArr2[1] = "ack_group_mismatch";
                strArr2[2] = "description";
                strArr2[3] = "interactive";
                strArr2[4] = "lid_migration";
                strArr2[5] = "new_subject";
                strArr2[6] = "participant_change_recovery";
                strArr2[7] = "phash";
                strArr2[8] = "prefetch";
                List A0O = C18070vi.A0O("subgroup_conflict_recovery", strArr2, 9);
                this.A02 = A0O;
                C29591cX r0 = new C29591cX("smax:any");
                r0.A09(str, "request", A0O);
                A002 = r0.A03();
                break;
            case 2:
                str2 = "url";
                str3 = "query";
                i2 = 1;
                strArr = new String[2];
                i3 = 0;
                str4 = "blob";
                break;
            case 3:
                str2 = "preview";
                str3 = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
                i2 = 1;
                strArr = new String[2];
                i3 = 0;
                str4 = "image";
                break;
            case 5:
                String[] strArr3 = new String[60];
                strArr3[0] = "account_info";
                strArr3[1] = "account_info_block";
                strArr3[2] = "account_info_report";
                strArr3[3] = "album_media_menu_report";
                strArr3[4] = "biz_account_info_block";
                strArr3[5] = "biz_block_header_chat";
                strArr3[6] = "biz_block_list";
                strArr3[7] = "biz_call_log_block";
                strArr3[8] = "biz_overflow_menu_block";
                strArr3[9] = "biz_spam_banner_block";
                strArr3[10] = "block_dialog";
                strArr3[11] = "block_header_chat";
                strArr3[12] = "call_log";
                strArr3[13] = "call_log_block";
                strArr3[14] = "call_spam_dialog_block";
                strArr3[15] = "call_spam_dialog_report";
                strArr3[16] = "chat";
                strArr3[17] = "chat_fmx_card_block";
                strArr3[18] = "chat_fmx_card_block_suspicious";
                strArr3[19] = "chat_fmx_card_safety_tools_block";
                strArr3[20] = "chat_fmx_card_safety_tools_block_suspicious";
                strArr3[21] = "chat_fmx_card_safety_tools_report";
                strArr3[22] = "chat_fmx_card_safety_tools_report_suspicious";
                strArr3[23] = "chat_list_block";
                strArr3[24] = "chat_list_context_menu_block";
                strArr3[25] = "chat_list_noinsub_block";
                strArr3[26] = "comment_actions_bottom_sheet";
                strArr3[27] = "community_home";
                strArr3[28] = "ent_client";
                strArr3[29] = "extension_menu_report";
                strArr3[30] = "feedback_not_interested_block";
                strArr3[31] = "frx";
                strArr3[32] = "group_chatlist_leave_report_upsell";
                strArr3[33] = "group_fmx_card_leave";
                strArr3[34] = "group_fmx_card_leave_non_suspicious";
                strArr3[35] = "group_info";
                strArr3[36] = "group_info_leave_report_upsell";
                strArr3[37] = "group_info_report";
                strArr3[38] = "group_overflow_menu_leave_report_upsell";
                strArr3[39] = "group_safety_check_bottom_sheet";
                strArr3[40] = "group_spam_banner_exit";
                strArr3[41] = "group_spam_banner_report";
                strArr3[42] = "iab_menu_report";
                strArr3[43] = "left_group_spam_banner_report";
                strArr3[44] = "media_viewer";
                strArr3[45] = "message_menu";
                strArr3[46] = "missed_call_notification_block";
                strArr3[47] = "newsletter_info_report";
                strArr3[48] = "notification_block";
                strArr3[49] = "overflow_menu";
                strArr3[50] = "overflow_menu_block";
                strArr3[51] = "overflow_menu_community_report";
                strArr3[52] = "overflow_menu_report";
                strArr3[53] = "status_post_report";
                strArr3[54] = "triggered_block";
                strArr3[55] = "user_controls_stop_block";
                strArr3[56] = "view_once_viewer";
                strArr3[57] = "1_1_old_spam_banner_block";
                strArr3[58] = "1_1_spam_banner_block";
                List A0O2 = C18070vi.A0O("1_1_spam_banner_report", strArr3, 59);
                this.A02 = A0O2;
                C29591cX r3 = new C29591cX("iq");
                r3.A04(new AnonymousClass1MD((Jid) C173438v4.A00, "to"));
                C29591cX.A01(r3, "xmlns", "spam");
                C29591cX r1 = new C29591cX("spam_list");
                r1.A09(str, "spam_flow", A0O2);
                A002 = C29591cX.A00(r1, r3);
                break;
            case 7:
                List A0N = C18070vi.A0N("smb_mm", "smb_promo", new String[2], 0, 1);
                this.A01 = A0N;
                C29591cX r2 = new C29591cX("message");
                C29591cX r12 = new C29591cX("meta");
                r12.A09("smb_promo", "biz_source", A0N);
                this.A02 = C29591cX.A00(r12, r2);
                return;
            default:
                C18070vi.A0d(str, 1);
                String[] strArr4 = new String[3];
                strArr4[0] = "AFTER";
                strArr4[1] = "BEFORE";
                List A0O3 = C18070vi.A0O("ON", strArr4, 2);
                this.A02 = A0O3;
                C29591cX r13 = new C29591cX("smax:any");
                r13.A09(str, "recurrence-rule", A0O3);
                A002 = r13.A03();
                break;
        }
        List A0N2 = C18070vi.A0N(str4, str2, strArr, i3, i2);
        this.A02 = A0N2;
        C29591cX r02 = new C29591cX("picture");
        r02.A09(str2, str3, A0N2);
        A002 = r02.A03();
        this.A01 = A002;
    }

    public C29621ca BVP() {
        Object obj;
        if (7 - this.A00 != 0) {
            obj = this.A01;
        } else {
            obj = this.A02;
        }
        return (C29621ca) obj;
    }

    public AnonymousClass4A4(UserJid userJid, UserJid userJid2, String str, String str2) {
        this.A00 = 6;
        String[] strArr = new String[6];
        strArr[0] = "futureproof";
        strArr[1] = "invite";
        strArr[2] = "request";
        strArr[3] = "request-cancel";
        strArr[4] = "request-decline";
        List A0O = C18070vi.A0O("send", strArr, 5);
        this.A02 = A0O;
        C29591cX r2 = new C29591cX("pay");
        String str3 = str;
        if (str != null && C29601cY.A04(str3, 0, 100, true)) {
            C29591cX.A01(r2, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        if (userJid != null) {
            r2.A04(new AnonymousClass1MD((Jid) userJid, "sender"));
        }
        if (userJid2 != null) {
            r2.A04(new AnonymousClass1MD((Jid) userJid2, "receiver"));
        }
        r2.A09(str2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0O);
        this.A01 = r2.A03();
    }

    public AnonymousClass4A4(String str, Long l) {
        this.A00 = 0;
        String[] strArr = new String[4];
        strArr[0] = "account_sync";
        strArr[1] = "groups";
        strArr[2] = "native_contact_restore";
        List A0O = C18070vi.A0O("newsletter_metadata", strArr, 3);
        this.A02 = A0O;
        C29591cX r4 = new C29591cX("clean");
        Long l2 = l;
        if (l != null && C29601cY.A03(l2, 0, 9007199254740991L, true)) {
            r4.A04(new AnonymousClass1MD("timestamp", l.longValue()));
        }
        r4.A09(str, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0O);
        this.A01 = r4.A03();
    }

    public AnonymousClass4A4(C29681ch r6, String str) {
        this.A00 = 4;
        C18070vi.A0d(r6, 1);
        String[] strArr = new String[4];
        strArr[0] = "admin";
        strArr[1] = "guest";
        strArr[2] = "owner";
        List A0O = C18070vi.A0O("subscriber", strArr, 3);
        this.A02 = A0O;
        C29591cX r1 = new C29591cX("smax:any");
        C29591cX.A01(r1, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "jid");
        r1.A04(new AnonymousClass1MD((Jid) r6, "jid"));
        r1.A08(str, "view_role", A0O);
        this.A01 = r1.A03();
    }
}
