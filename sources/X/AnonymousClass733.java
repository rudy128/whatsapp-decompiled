package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.Telephony;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.invite.CreateInviteCodeResponseImpl;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.733  reason: invalid class name */
public final class AnonymousClass733 {
    public final AnonymousClass1LA A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11E A02;
    public final C18000vb A03;
    public final AnonymousClass1CJ A04;
    public final AnonymousClass1K3 A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final C36261nb A08;
    public final C18030ve A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;

    public final void A03(Context context, C135686sb r25, Integer num, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        boolean A17 = C18070vi.A17(context2, str3);
        String replaceAll = str3.replaceAll("\\D", "");
        C18070vi.A0X(replaceAll);
        Integer num2 = num;
        String str4 = str2;
        if (this.A02.A09()) {
            AnonymousClass1K3 r3 = this.A05;
            if (!r3.A04() && !r3.A05("BR") && !r3.A05("JP")) {
                try {
                    AnonymousClass00H r4 = this.A07;
                    C42811ym A0H = ((C42771yi) r4.get()).A0H(str3, (String) null);
                    String valueOf = String.valueOf(A0H.countryCode_);
                    r4.get();
                    String A012 = AnonymousClass1K3.A01(valueOf, C42771yi.A03(A0H));
                    C18070vi.A0X(A012);
                    if (!A012.equals("BR") && !A012.equals("JP") && !"eu".equals(this.A00.A04(String.valueOf(A0H.countryCode_)))) {
                        ProgressDialog progressDialog = new ProgressDialog(context2);
                        progressDialog.setMessage(context2.getString(2131891797));
                        progressDialog.setIndeterminate(A17);
                        progressDialog.setCancelable(A17);
                        C108965cb.A19(this.A01, progressDialog, 20);
                        Context context3 = context2;
                        Integer num3 = num2;
                        String str5 = str3;
                        String str6 = str4;
                        ProgressDialog progressDialog2 = progressDialog;
                        AnonymousClass84D r16 = new AnonymousClass84D(progressDialog2, context3, this, num3, str5, str6);
                        C157227wa r162 = new C157227wa(progressDialog2, context3, this, num3, str5, str6);
                        if (C18020vd.A00(C18040vf.A02, this.A09, 8400) == A17) {
                            A7K a7k = new A7K();
                            C189819ju r6 = GraphQlCallInput.A02;
                            String A002 = A00(num2);
                            C18070vi.A0d(A002, 0);
                            C162478Kx A003 = r6.A00();
                            C162478Kx.A01(A003, A002, "entry_point");
                            C162478Kx.A01(A003, replaceAll, "receiver");
                            C108975cc.A0z(A003, a7k, "input");
                            C108975cc.A0J(new AIj(a7k, CreateInviteCodeResponseImpl.class, "CreateInviteCode"), this.A0B).A04(new C1589182n(r25, r162, r16));
                            return;
                        }
                        AnonymousClass7LI r8 = new AnonymousClass7LI((AnonymousClass1OZ) C18070vi.A0E(this.A0A));
                        String A004 = A00(num2);
                        C127106do r1 = new C127106do(r162, r16);
                        C18070vi.A0d(A004, A17 ? 1 : 0);
                        r8.A00 = r1;
                        AnonymousClass1OZ r7 = r8.A01;
                        String A0B2 = r7.A0B();
                        C29591cX A0Y = C108955ca.A0Y();
                        C108995ce.A1E(A0Y);
                        C29591cX.A01(A0Y, "xmlns", "w:growth");
                        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
                        if (C29601cY.A04(A0B2, 0, 9007199254740991L, false)) {
                            C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2);
                        }
                        C29591cX A0t = C108945cZ.A0t("invite");
                        if (C29601cY.A04(replaceAll, 0, 1024, false)) {
                            C29591cX.A01(A0t, PublicKeyCredentialControllerUtility.JSON_KEY_USER, replaceAll);
                        }
                        if (C29601cY.A04(A004, 0, 1024, true)) {
                            C29591cX.A01(A0t, "entry_point", A004);
                        }
                        r7.A0I(r8, C29591cX.A00(A0t, A0Y), A0B2, 374, 0);
                        return;
                    }
                } catch (C24931Mf unused) {
                }
            }
        }
        A02(context2, this, (C135686sb) null, num2, str3, "https://whatsapp.com/dl/", str4);
    }

    public final void A04(Context context, Integer num, String str, String str2) {
        C18070vi.A0h(context, str);
        A03(context, (C135686sb) null, num, str, str2);
    }

    public static final String A00(Integer num) {
        if (num == null) {
            return "unknown";
        }
        switch (num.intValue()) {
            case 1:
                return "calls_no_contacts";
            case 2:
                return "contact_picker_last_item";
            case 3:
                return "contact_picker_no_contacts";
            case 4:
                return "contact_picker_menu";
            case 5:
                return "call_contact_picker_last_item";
            case 6:
                return "call_contact_picker_no_contacts";
            case 7:
                return "call_contact_picker_menu";
            case 8:
                return "conversations_no_contacts";
            case 9:
                return "multiple_contact_picker_no_contacts";
            case 10:
                return "phone_contacts_selector_no_contacts";
            case 11:
                return "settings";
            case 12:
                return "status";
            case 13:
                return "add_contact_result";
            case 14:
                return "contact_picker_search";
            case 15:
                return "call_contact_picker_search";
            case 16:
                return "quick_contact";
            case 17:
                return "sms_default_app_warning";
            case 18:
                return "conversations_row_contact";
            case 19:
                return "from_messenger_deep_link";
            case 20:
                return "phone_number_exist_check";
            case 21:
                return "groups_create_participant_selector";
            case 22:
                return "groups_add_participant_selector";
            case 23:
                return "cag_add_participant_selector";
            case 24:
                return "wa_sharesheet_contact_search";
            case 25:
                return "chatlist_search";
            case 26:
                return "call_multi_contact_picker";
            case 27:
                return "call_multi_contact_picker_search";
            case 28:
                return "add_contact_form";
            case 29:
                return "add_contact_saved_snackbar";
            case 30:
                return "contact_picker_list";
            case 31:
                return "invite_qp_banner";
            case 32:
                return "call_list_contact_search";
            case 33:
                return "inactive_user_chat_banner";
            case 34:
                return "dialer";
            case 35:
                return "new_broadcast";
            case 36:
                return "favorites";
            case 37:
                return "channels_sharesheet_search";
            case 38:
                return "new_broadcast_search";
            case 39:
                return "favorites_search";
            case 40:
                return "channels_msg_sharesheet_search";
            case 41:
                return "message_thread_phone_number_click";
            default:
                return num.toString();
        }
    }

    public static final void A01(Context context, Uri uri, AnonymousClass733 r8, Integer num, String str, long j) {
        String str2;
        if (C18020vd.A05(C18040vf.A02, r8.A09, 12332)) {
            str2 = "android.intent.action.VIEW";
        } else {
            str2 = "android.intent.action.SENDTO";
        }
        Intent A0G = C108945cZ.A0G(str2);
        A0G.setData(uri);
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(A0G, 0);
        C18070vi.A0X(queryIntentActivities);
        if (AnonymousClass000.A1a(queryIntentActivities)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("app/sms ");
            C17900vP.A0o(A10, queryIntentActivities.size());
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
            if (defaultSmsPackage == null || defaultSmsPackage.length() == 0) {
                ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                A0G.setClassName(activityInfo.packageName, activityInfo.name);
                defaultSmsPackage = activityInfo.packageName;
            } else {
                A0G.setPackage(defaultSmsPackage);
            }
            if (!(str == null || str.length() == 0)) {
                A0G.putExtra("sms_body", str);
            }
            context.startActivity(A0G);
            Integer num2 = num;
            if (num != null) {
                r8.A08.A01(num2, defaultSmsPackage, 3, j);
                return;
            }
            return;
        }
        Log.e("app/sms/no activities");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r14.length() != 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r12.A05.A05("US") != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        r0 = 2131891491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b1, code lost:
        if (r1 == 31) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.content.Context r12, X.AnonymousClass733 r13, X.C135686sb r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r1 = r16
            r0 = r18
            java.lang.String r0 = X.C17900vP.A0A(r0, r1)
            android.net.Uri r11 = android.net.Uri.parse(r0)
            X.C18070vi.A0X(r11)
            r8 = 2
            r6 = 1
            r5 = 0
            r2 = 0
            r10 = r12
            r12 = r13
            r13 = r15
            r7 = r17
            if (r15 == 0) goto L_0x004d
            int r1 = r15.intValue()
            r0 = 37
            if (r1 != r0) goto L_0x006c
            if (r14 == 0) goto L_0x004d
            X.1ch r1 = r14.A00
            if (r1 == 0) goto L_0x004d
            X.1CJ r0 = r12.A04
            X.1ci r1 = X.AnonymousClass1CJ.A00(r0, r1)
            boolean r0 = r1 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x004d
            X.2Dk r1 = (X.C46162Dk) r1
            if (r1 == 0) goto L_0x004d
            java.lang.String r2 = r1.A0T
            if (r2 == 0) goto L_0x004d
            r1 = 2131888106(0x7f1207ea, float:1.9410838E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r5] = r2
            java.lang.String r14 = X.C17880vN.A0q(r10, r7, r0, r6, r1)
        L_0x0045:
            if (r14 == 0) goto L_0x004d
            int r0 = r14.length()
            if (r0 != 0) goto L_0x0061
        L_0x004d:
            X.1K3 r1 = r12.A05
            java.lang.String r0 = "US"
            boolean r1 = r1.A05(r0)
            r0 = 2131896797(0x7f1229dd, float:1.9428465E38)
            if (r1 == 0) goto L_0x005d
        L_0x005a:
            r0 = 2131891491(0x7f121523, float:1.9417704E38)
        L_0x005d:
            java.lang.String r14 = X.C17890vO.A0R(r10, r7, r6, r5, r0)
        L_0x0061:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r14, r0)
            r15 = 1
            A01(r10, r11, r12, r13, r14, r15)
            return
        L_0x006c:
            r0 = 40
            if (r1 != r0) goto L_0x00a7
            if (r14 == 0) goto L_0x004d
            java.util.List r0 = r14.A02
            int r9 = X.AnonymousClass001.A0m(r0)
            X.1ch r1 = r14.A00
            if (r1 == 0) goto L_0x00a5
            X.1CJ r0 = r12.A04
            X.1ci r1 = X.AnonymousClass1CJ.A00(r0, r1)
            boolean r0 = r1 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x00a5
            X.2Dk r1 = (X.C46162Dk) r1
        L_0x0088:
            if (r9 <= 0) goto L_0x004d
            if (r1 == 0) goto L_0x004d
            java.lang.String r2 = r1.A0T
            if (r2 == 0) goto L_0x004d
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x004d
            X.0vb r4 = r12.A03
            r3 = 2131755044(0x7f100024, float:1.9140956E38)
            long r0 = (long) r9
            java.lang.Object[] r2 = X.C108945cZ.A1a(r2, r7, r8, r6)
            java.lang.String r14 = r4.A0K(r2, r3, r0)
            goto L_0x0045
        L_0x00a5:
            r1 = r2
            goto L_0x0088
        L_0x00a7:
            r0 = 24
            if (r1 != r0) goto L_0x00af
            r0 = 2131891490(0x7f121522, float:1.9417702E38)
            goto L_0x005d
        L_0x00af:
            r0 = 31
            if (r1 != r0) goto L_0x004d
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass733.A02(android.content.Context, X.733, X.6sb, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public AnonymousClass733(AnonymousClass1LA r1, AnonymousClass1KB r2, AnonymousClass11E r3, C36261nb r4, C18000vb r5, AnonymousClass1CJ r6, C18030ve r7, AnonymousClass1K3 r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        C18070vi.A0w(r7, r2, r6, r8, r5);
        C18070vi.A0x(r9, r10, r1, r4, r11);
        C72473Md.A1L(r3, r12);
        this.A09 = r7;
        this.A01 = r2;
        this.A04 = r6;
        this.A05 = r8;
        this.A03 = r5;
        this.A0A = r9;
        this.A07 = r10;
        this.A00 = r1;
        this.A08 = r4;
        this.A0B = r11;
        this.A02 = r3;
        this.A06 = r12;
    }
}
