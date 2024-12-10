package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.91q  reason: invalid class name */
public abstract class AnonymousClass91q extends AnonymousClass8k6 implements C23321Fo {
    public int A00 = 0;
    public C170648qR A01;
    public C186529eL A02;
    public C219217x A03;
    public AnonymousClass122 A04;
    public C25011Mn A05;
    public AnonymousClass9R3 A06;
    public AnonymousClass1QL A07;
    public C31051ew A08;
    public AnonymousClass1QD A09;
    public C31061ex A0A;
    public AnonymousClass1QJ A0B;
    public C33701jF A0C;
    public AnonymousClass1QS A0D;
    public C191529mk A0E;
    public A2C A0F;
    public C190699lN A0G;
    public A54 A0H;
    public A27 A0I;
    public C20031A4a A0J;
    public AnonymousClass1QE A0K = AnonymousClass1QE.A00("PayBloksActivity", "bloks", "COMMON");
    public C191389mW A0L;
    public C189549jQ A0M;
    public A5H A0N;
    public A4K A0O;
    public C195929uA A0P;
    public C30931ek A0Q;
    public AnonymousClass129 A0R;
    public A2V A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W = C221618v.A00(AnonymousClass17E.class);
    public AnonymousClass00H A0X;
    public boolean A0Y = false;
    public PaymentIncentiveViewModel A0Z;
    public A2X A0a;
    public AnonymousClass00H A0b = C221618v.A00(AnonymousClass17K.class);

    public static int[] A0s(String str) {
        String[] split = str.split("/");
        return new int[]{C20099A7c.A01(split[0], 0), C20099A7c.A01(split[1], -2000) + 2000};
    }

    public static String A0c(String str, Map map) {
        String replaceAll = str.replaceAll("\\s", "");
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            if (AnonymousClass8BU.A0z(replaceAll, AnonymousClass8BR.A10(A16)).find()) {
                return C17880vN.A0x(A16);
            }
        }
        return "";
    }

    public static void A0q(C194839sN r2, Map map, int i) {
        if (map == null) {
            map = C17880vN.A11();
        }
        map.put("error_code", String.valueOf(i));
        r2.A01("on_failure", map);
    }

    public static void A0r(AnonymousClass91q r4) {
        if (!(!r4.A0H)) {
            Bundle A092 = AnonymousClass3MY.A09(r4);
            C17960vV.A07(A092);
            String string = A092.getString("screen_name");
            HashMap hashMap = (HashMap) A092.getSerializable("screen_params");
            AnonymousClass1GP supportFragmentManager = r4.getSupportFragmentManager();
            r4.A04 = BloksDialogFragment.A00(string, hashMap);
            if (hashMap != null) {
                r4.A0A.A02(hashMap);
            }
            if (supportFragmentManager.A0K() == 0) {
                C34001jj r2 = new C34001jj(supportFragmentManager);
                r2.A09(r4.A04, 2131428247);
                r2.A0H(string);
                r2.A00(true);
                return;
            }
            r4.A4c();
            return;
        }
        r4.A0Y = true;
    }

    public void A4f(String str, String str2, HashMap hashMap) {
        String str3;
        if (str2 == null) {
            str3 = "PayBloksActivity/fdsPostProcessing invalid fdsManagerId";
        } else {
            C20130A8q A002 = this.A0M.A00(str2);
            if (A002 == null) {
                str3 = "PayBloksActivity/fdsPostProcessing invalid phoenixManager";
            } else {
                C20129A8p a8p = A002.A00;
                if (a8p == null) {
                    str3 = "PayBloksActivity/fdsPostProcessing statemachine is null";
                } else {
                    C22579BDz bDz = (C22579BDz) a8p.A0A(str);
                    if (bDz != null) {
                        bDz.BLG(hashMap);
                        return;
                    }
                    return;
                }
            }
        }
        Log.e(str3);
    }

    public boolean BcG(int i) {
        if (i != 404 && i != 440 && i != 449) {
            return false;
        }
        this.A0K.A06(AnonymousClass001.A1I("handleError/error=", AnonymousClass000.A10(), i));
        this.A0C.A01(true, false);
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0D(2131893867);
        A002.A0T(false);
        C20155A9r.A01(A002, this, 22, 2131899286);
        A002.A0C();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0298, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x029b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x039b, code lost:
        X.A4K.A00(r1, r4, r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x039e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03e3, code lost:
        r1.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03e6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CBV(X.C194839sN r24, java.lang.String r25, java.util.Map r26) {
        /*
            r23 = this;
            r5 = r25
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = r24
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = ""
            r1.A00(r0)
        L_0x000f:
            int r0 = r5.hashCode()
            r2 = 2
            r4 = 0
            r3 = 1
            r12 = -1
            switch(r0) {
                case -2131583866: goto L_0x0130;
                case -1828362259: goto L_0x0128;
                case -1432382994: goto L_0x011d;
                case -1371677349: goto L_0x0112;
                case -1032682289: goto L_0x0107;
                case -457979232: goto L_0x00fc;
                case -214858504: goto L_0x00f1;
                case 20864489: goto L_0x00e6;
                case 205988285: goto L_0x00da;
                case 254954716: goto L_0x00ce;
                case 391773106: goto L_0x00c2;
                case 641482247: goto L_0x00b6;
                case 711972942: goto L_0x00aa;
                case 761629426: goto L_0x009e;
                case 927713295: goto L_0x0092;
                case 928063522: goto L_0x0087;
                case 1032047561: goto L_0x007c;
                case 1369547730: goto L_0x0071;
                case 1853333482: goto L_0x0066;
                case 1877943783: goto L_0x005b;
                case 1985308587: goto L_0x0050;
                default: goto L_0x001a;
            }
        L_0x001a:
            java.lang.String r6 = "on_success"
            java.lang.String r11 = "is_merchant"
            java.lang.String r10 = "completed_step"
            java.lang.String r8 = "compliance_reason"
            java.lang.String r9 = "pin"
            java.lang.String r0 = "provider"
            java.lang.String r7 = "1"
            r13 = r23
            r5 = r26
            switch(r12) {
                case 0: goto L_0x03ba;
                case 1: goto L_0x0434;
                case 2: goto L_0x0427;
                case 3: goto L_0x039f;
                case 4: goto L_0x0386;
                case 5: goto L_0x0030;
                case 6: goto L_0x03e7;
                case 7: goto L_0x036b;
                case 8: goto L_0x033b;
                case 9: goto L_0x02f9;
                case 10: goto L_0x03dc;
                case 11: goto L_0x029c;
                case 12: goto L_0x0295;
                case 13: goto L_0x024d;
                case 14: goto L_0x01e8;
                case 15: goto L_0x01ca;
                case 16: goto L_0x01be;
                case 17: goto L_0x01a7;
                case 18: goto L_0x0197;
                case 19: goto L_0x014e;
                case 20: goto L_0x0138;
                default: goto L_0x002f;
            }
        L_0x002f:
            return
        L_0x0030:
            X.01n r1 = r13.getSupportActionBar()
            if (r1 == 0) goto L_0x002f
            com.whatsapp.bloks.ui.BloksDialogFragment r0 = r13.A04
            if (r0 == 0) goto L_0x002f
            java.lang.Boolean r0 = r0.A07
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "action_bar_title"
            java.lang.Object r0 = r5.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.A0S(r0)
            return
        L_0x0050:
            java.lang.String r0 = "set_bio"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 20
            goto L_0x001a
        L_0x005b:
            java.lang.String r0 = "set_navigation_icon"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 19
            goto L_0x001a
        L_0x0066:
            java.lang.String r0 = "set_sandbox"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 18
            goto L_0x001a
        L_0x0071:
            java.lang.String r0 = "create_pin"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 17
            goto L_0x001a
        L_0x007c:
            java.lang.String r0 = "get_methods"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 16
            goto L_0x001a
        L_0x0087:
            java.lang.String r0 = "sync_incentive_data"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 15
            goto L_0x001a
        L_0x0092:
            java.lang.String r0 = "forward_to_payment_screen"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 14
            goto L_0x001a
        L_0x009e:
            java.lang.String r0 = "remove_credential"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 13
            goto L_0x001a
        L_0x00aa:
            java.lang.String r0 = "fcs_navigate_back_and_finish"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 12
            goto L_0x001a
        L_0x00b6:
            java.lang.String r0 = "get_incentive_data"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 11
            goto L_0x001a
        L_0x00c2:
            java.lang.String r0 = "check_camera_permission"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 10
            goto L_0x001a
        L_0x00ce:
            java.lang.String r0 = "compliance_dob_check"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 9
            goto L_0x001a
        L_0x00da:
            java.lang.String r0 = "set_completed_step"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 8
            goto L_0x001a
        L_0x00e6:
            java.lang.String r0 = "reinitialize_payments"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 7
            goto L_0x001a
        L_0x00f1:
            java.lang.String r0 = "compliance_name_check"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 6
            goto L_0x001a
        L_0x00fc:
            java.lang.String r0 = "set_action_bar_title"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 5
            goto L_0x001a
        L_0x0107:
            java.lang.String r0 = "verify_pin"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 4
            goto L_0x001a
        L_0x0112:
            java.lang.String r0 = "remove_completed_step"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 3
            goto L_0x001a
        L_0x011d:
            java.lang.String r0 = "get_oldest_credential"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 2
            goto L_0x001a
        L_0x0128:
            java.lang.String r0 = "get_compliance_status"
            short r12 = X.AnonymousClass8BV.A10(r0, r5)
            goto L_0x001a
        L_0x0130:
            java.lang.String r0 = "change_pin"
            short r12 = X.AnonymousClass8BV.A0z(r0, r5)
            goto L_0x001a
        L_0x0138:
            X.A4K r7 = r13.A0O
            java.lang.String r6 = A0Q(r0, r5)
            java.lang.String r0 = A0Q(r9, r5)
            X.AZV r4 = new X.AZV
            r4.<init>(r1, r13, r3)
            X.AZS r1 = new X.AZS
            r1.<init>(r4, r7, r0, r3)
            goto L_0x039b
        L_0x014e:
            java.lang.String r0 = "navigation_icon"
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r0 = "close"
            boolean r2 = r0.equals(r1)
            java.lang.String r0 = "icon_color_filter"
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r0 = "white"
            boolean r4 = r0.equals(r1)
            X.0vb r1 = r13.A00
            r0 = 2131231675(0x7f0803bb, float:1.8079438E38)
            if (r2 == 0) goto L_0x0170
            r0 = 2131231814(0x7f080446, float:1.807972E38)
        L_0x0170:
            X.3cP r3 = X.AnonymousClass3NL.A00(r13, r1, r0)
            android.content.res.Resources r2 = r13.getResources()
            r1 = 2130969324(0x7f0402ec, float:1.7547327E38)
            r0 = 2131100309(0x7f060295, float:1.7812996E38)
            if (r4 == 0) goto L_0x0186
            r1 = 2130971957(0x7f040d35, float:1.7552667E38)
            r0 = 2131103410(0x7f060eb2, float:1.7819285E38)
        L_0x0186:
            int r1 = X.AnonymousClass3Ma.A01(r13, r2, r1, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r3.setColorFilter(r1, r0)
            androidx.appcompat.widget.Toolbar r0 = X.AnonymousClass3Ma.A0G(r13)
            r0.setNavigationIcon((android.graphics.drawable.Drawable) r3)
            return
        L_0x0197:
            java.lang.String r0 = "is_sandbox"
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r7.equals(r0)
            X.1QD r0 = r13.A09
            r0.A0P(r1)
            return
        L_0x01a7:
            X.A4K r7 = r13.A0O
            java.lang.String r6 = A0Q(r0, r5)
            java.lang.String r3 = A0Q(r9, r5)
            r0 = 0
            X.AZV r4 = new X.AZV
            r4.<init>(r1, r13, r0)
            X.AZS r1 = new X.AZS
            r1.<init>(r4, r7, r3, r2)
            goto L_0x039b
        L_0x01be:
            r0 = 4
            X.AXO r2 = new X.AXO
            r2.<init>(r13, r1, r0)
            X.1ex r0 = r13.A0A
            r0.A0A(r2)
            return
        L_0x01ca:
            java.lang.String r0 = "param_force_incentive_claim_info_sync"
            java.lang.Object r0 = r5.get(r0)
            boolean r0 = r7.equals(r0)
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r2 = r13.A0Z
            X.10I r1 = r2.A07
            if (r0 == 0) goto L_0x01df
            r0 = 3
            X.C21448AkF.A00(r1, r2, r0)
            return
        L_0x01df:
            X.3Cp r0 = new X.3Cp
            r0.<init>((com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel) r2, (boolean) r3)
            r1.CGF(r0)
            return
        L_0x01e8:
            android.content.Context r1 = r13.getApplicationContext()
            X.1QS r0 = r13.A0D
            X.BD1 r0 = r0.A06()
            java.lang.Class r0 = r0.BYz()
            android.content.Intent r3 = X.AnonymousClass8BR.A07(r1, r0)
            android.content.Intent r2 = r13.getIntent()
            java.lang.String r1 = "extra_conversation_message_type"
            int r0 = r2.getIntExtra(r1, r4)
            r3.putExtra(r1, r0)
            java.lang.String r0 = "extra_jid"
            X.AnonymousClass8BS.A13(r2, r3, r0)
            java.lang.String r0 = "extra_receiver_jid"
            X.AnonymousClass8BS.A13(r2, r3, r0)
            r0 = 0
            java.lang.String r5 = "extra_quoted_msg_row_id"
            long r0 = r2.getLongExtra(r5, r0)
            r3.putExtra(r5, r0)
            java.lang.String r0 = "extra_payment_preset_amount"
            X.AnonymousClass8BS.A13(r2, r3, r0)
            java.lang.String r0 = "extra_transaction_id"
            X.AnonymousClass8BS.A13(r2, r3, r0)
            java.lang.String r0 = "extra_payment_preset_min_amount"
            X.AnonymousClass8BS.A13(r2, r3, r0)
            java.lang.String r0 = "extra_request_message_key"
            X.AnonymousClass8BS.A13(r2, r3, r0)
            r0 = 1
            java.lang.String r1 = "extra_is_pay_money_only"
            boolean r0 = r2.getBooleanExtra(r1, r0)
            r3.putExtra(r1, r0)
            java.lang.String r0 = "extra_payment_note"
            X.AnonymousClass8BS.A13(r2, r3, r0)
            java.lang.String r0 = "extra_mentioned_jids"
            X.AnonymousClass8BS.A13(r2, r3, r0)
            java.lang.String r0 = "extra_inviter_jid"
            X.AnonymousClass8BS.A13(r2, r3, r0)
            r13.A3q(r3, r4)
            goto L_0x0298
        L_0x024d:
            r0 = 3
            X.AXO r6 = new X.AXO
            r6.<init>(r13, r1, r0)
            java.lang.String r0 = "remaining_cards"
            java.lang.String r0 = X.C17880vN.A0s(r0, r5)
            int r0 = X.C20099A7c.A01(r0, r4)
            if (r0 > r3) goto L_0x0288
            X.1KB r14 = r13.A05
            X.10I r5 = r13.A05
            X.1ek r4 = r13.A0Q
            X.1QS r3 = r13.A0D
            X.122 r15 = r13.A04
            X.1QD r2 = r13.A09
            X.1ex r1 = r13.A0A
            X.1jF r0 = r13.A0C
            X.1jG r16 = X.AnonymousClass8BU.A0P(r13)
            X.9p4 r12 = new X.9p4
            r18 = r1
            r19 = r0
            r20 = r3
            r21 = r4
            r22 = r5
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r12.A00(r6)
            return
        L_0x0288:
            X.1ex r2 = r13.A0A
            java.lang.String r0 = "credential_id"
            java.lang.String r1 = X.C17880vN.A0s(r0, r5)
            r0 = 0
            r2.A0E(r6, r0, r1, r0)
            return
        L_0x0295:
            r13.A0d()
        L_0x0298:
            r13.finish()
            return
        L_0x029c:
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r0 = r13.A0Z
            X.1DT r0 = r0.A01
            java.lang.Object r2 = r0.A06()
            X.9xu r2 = (X.C198179xu) r2
            if (r2 == 0) goto L_0x02f0
            int r0 = r2.A00
            if (r0 == r3) goto L_0x02f0
            java.lang.Object r5 = r2.A01
            X.A0v r5 = (X.C19962A0v) r5
            java.util.HashMap r4 = X.C17880vN.A11()
            if (r5 == 0) goto L_0x02ec
            X.9ys r0 = r5.A01
            if (r0 == 0) goto L_0x02c7
            X.2r1 r0 = r0.A08
            long r2 = r0.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "param_incentive_offer_id"
            r4.put(r0, r2)
        L_0x02c7:
            X.A03 r3 = r5.A02
            if (r3 == 0) goto L_0x02ec
            boolean r0 = r3.A04
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "param_incentive_claim_info_is_eligible"
            r4.put(r0, r2)
            int r0 = r3.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "param_incentive_claim_info_pending_count"
            r4.put(r0, r2)
            int r0 = r3.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "param_incentive_claim_info_redeemed_count"
            r4.put(r0, r2)
        L_0x02ec:
            r1.A02(r6, r4)
            return
        L_0x02f0:
            java.lang.String r0 = "PAY: PayBloksActivity/performAsyncRequest/get incentive data returned an error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r6 = "on_failure"
            goto L_0x03e3
        L_0x02f9:
            java.lang.String r0 = "dob"
            java.lang.String r0 = A0Q(r0, r5)
            int[] r0 = X.A3L.A02(r0)
            r11 = r0[r4]
            r10 = r0[r3]
            r9 = r0[r2]
            java.lang.String r7 = A0V(r8, r5)
            java.util.AbstractMap r2 = X.AnonymousClass8BW.A0p(r13)
            java.lang.String r0 = "fds_manager_id"
            java.lang.String r4 = X.C108945cZ.A1G(r0, r2)
            X.A1j r0 = r13.A0A
            java.lang.String r3 = "onboarding_context"
            java.util.Stack r2 = r0.A02
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0330
            r0 = 0
        L_0x0324:
            X.A2C r5 = r13.A0F
            X.AYt r6 = new X.AYt
            r6.<init>(r1, r13, r0, r4)
            r8 = 0
            r5.A02(r6, r7, r8, r9, r10, r11)
            return
        L_0x0330:
            java.lang.Object r0 = r2.peek()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.String r0 = X.C108945cZ.A1G(r3, r0)
            goto L_0x0324
        L_0x033b:
            java.lang.String r3 = X.C17880vN.A0s(r10, r5)
            java.lang.Object r0 = r5.get(r11)
            boolean r2 = r7.equals(r0)
            java.lang.String r0 = "payment_flow"
            java.lang.String r1 = X.C17880vN.A0s(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0357
            if (r2 == 0) goto L_0x0368
            java.lang.String r1 = "merchant_account_linking_context"
        L_0x0357:
            X.1QS r0 = r13.A0D
            X.1QK r1 = r0.A02(r1)
            X.C17960vV.A07(r1)
            X.1QM r0 = r1.A04(r3)
            r1.A0A(r0)
            return
        L_0x0368:
            java.lang.String r1 = "p2p_context"
            goto L_0x0357
        L_0x036b:
            java.lang.String r0 = "remove_tos"
            java.lang.Object r0 = r5.get(r0)
            boolean r2 = r7.equals(r0)
            X.9uA r0 = r13.A0P
            boolean r1 = r0.A03()
            X.1jF r0 = r13.A0C
            r0.A01(r2, r4)
            X.9uA r0 = r13.A0P
            r0.A02(r1)
            return
        L_0x0386:
            X.A4K r7 = r13.A0O
            java.lang.String r6 = A0Q(r0, r5)
            java.lang.String r3 = A0Q(r9, r5)
            X.AZV r4 = new X.AZV
            r4.<init>(r1, r13, r2)
            r0 = 0
            X.AZS r1 = new X.AZS
            r1.<init>(r4, r7, r3, r0)
        L_0x039b:
            X.A4K.A00(r1, r4, r7, r6)
            return
        L_0x039f:
            java.lang.String r2 = X.C17880vN.A0s(r10, r5)
            java.lang.Object r0 = r5.get(r11)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x03b7
            X.1ew r1 = r13.A08
        L_0x03af:
            X.1QM r0 = r1.A04(r2)
            r1.A09(r0)
            return
        L_0x03b7:
            X.1QL r1 = r13.A07
            goto L_0x03af
        L_0x03ba:
            X.A4K r6 = r13.A0O
            java.lang.String r2 = A0Q(r0, r5)
            java.lang.String r0 = "old_pin"
            java.lang.String r7 = A0Q(r0, r5)
            java.lang.String r0 = "new_pin"
            java.lang.String r8 = A0Q(r0, r5)
            r0 = 3
            X.AZV r5 = new X.AZV
            r5.<init>(r1, r13, r0)
            r9 = 0
            X.AZT r4 = new X.AZT
            r4.<init>(r5, r6, r7, r8, r9)
            X.A4K.A00(r4, r5, r6, r2)
            return
        L_0x03dc:
            X.17x r2 = r13.A03
            r0 = 30
            X.AnonymousClass74O.A0J(r13, r2, r0)
        L_0x03e3:
            r1.A00(r6)
            return
        L_0x03e7:
            int r0 = r13.A00
            int r7 = r0 + 1
            r13.A00 = r7
            if (r7 <= r3) goto L_0x0411
            X.190 r6 = r13.A03
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "retryCount= "
            java.lang.String r2 = X.AnonymousClass001.A1I(r0, r2, r7)
            java.lang.String r0 = "unexpected-duplicate-kyc-call"
            r6.A0G(r0, r2, r4)
            X.0ve r4 = r13.A0E
            r2 = 5701(0x1645, float:7.989E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r2)
            if (r0 == 0) goto L_0x0411
            int r0 = r13.A00
            if (r0 <= r3) goto L_0x0411
            return
        L_0x0411:
            java.lang.String r0 = "full_name"
            java.lang.String r6 = A0V(r0, r5)
            java.lang.String r4 = A0V(r8, r5)
            X.A2C r3 = r13.A0F
            r2 = 0
            X.AYw r0 = new X.AYw
            r0.<init>(r1, r13, r2)
            r3.A03(r0, r6, r4)
            return
        L_0x0427:
            X.10I r3 = r13.A05
            X.1QS r2 = r13.A0D
            X.9Aw r0 = new X.9Aw
            r0.<init>(r1, r2)
            X.AnonymousClass3MW.A1T(r0, r3, r4)
            return
        L_0x0434:
            X.A2C r2 = r13.A0F
            X.AYo r0 = new X.AYo
            r0.<init>(r1, r13)
            r2.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91q.CBV(X.9sN, java.lang.String, java.util.Map):void");
    }

    /* JADX WARNING: type inference failed for: r0v115, types: [X.9R3, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x031d, code lost:
        if (r0 == false) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x031f, code lost:
        return "1";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String CBa(java.lang.String r21, java.util.Map r22) {
        /*
            r20 = this;
            java.lang.String r0 = "case"
            r5 = r22
            java.lang.Object r3 = r5.remove(r0)
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r14 = ""
            if (r0 != 0) goto L_0x0030
            int r0 = r3.hashCode()
            r8 = 8
            r1 = 2
            r2 = 1
            r13 = -1
            switch(r0) {
                case -2090067461: goto L_0x0158;
                case -1486928264: goto L_0x0150;
                case -1347269146: goto L_0x0145;
                case -1344002586: goto L_0x013a;
                case -1145142119: goto L_0x012f;
                case -1060255204: goto L_0x0124;
                case -1003060006: goto L_0x0119;
                case -985374640: goto L_0x010e;
                case -975395056: goto L_0x0102;
                case -919584206: goto L_0x00f6;
                case -848949171: goto L_0x00ea;
                case -840371252: goto L_0x00de;
                case -594428356: goto L_0x00d2;
                case -314691285: goto L_0x00c6;
                case 1809539: goto L_0x00ba;
                case 329749850: goto L_0x00ae;
                case 425265908: goto L_0x00a2;
                case 540049915: goto L_0x0096;
                case 580608584: goto L_0x008b;
                case 674867313: goto L_0x0080;
                case 1518694893: goto L_0x0075;
                case 1785060649: goto L_0x006a;
                case 1976375430: goto L_0x005f;
                case 1999013019: goto L_0x0054;
                default: goto L_0x001e;
            }
        L_0x001e:
            java.lang.String r12 = "on_success"
            java.lang.String r11 = "is_hide"
            java.lang.String r10 = "on_failure"
            java.lang.String r9 = "0"
            r6 = 0
            java.lang.String r7 = "1"
            r4 = r20
            r3 = r21
            switch(r13) {
                case 0: goto L_0x017c;
                case 1: goto L_0x0321;
                case 2: goto L_0x0325;
                case 3: goto L_0x02d2;
                case 4: goto L_0x02a3;
                case 5: goto L_0x0308;
                case 6: goto L_0x0284;
                case 7: goto L_0x003c;
                case 8: goto L_0x0268;
                case 9: goto L_0x0031;
                case 10: goto L_0x024c;
                case 11: goto L_0x0234;
                case 12: goto L_0x0223;
                case 13: goto L_0x0160;
                case 14: goto L_0x021a;
                case 15: goto L_0x0204;
                case 16: goto L_0x01f9;
                case 17: goto L_0x01f2;
                case 18: goto L_0x01ed;
                case 19: goto L_0x019e;
                case 20: goto L_0x031c;
                case 21: goto L_0x01e2;
                case 22: goto L_0x01c7;
                case 23: goto L_0x0189;
                default: goto L_0x0030;
            }
        L_0x0030:
            return r14
        L_0x0031:
            java.lang.String r1 = X.C17880vN.A0s(r3, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x003c:
            androidx.appcompat.widget.Toolbar r1 = X.AnonymousClass3Ma.A0G(r4)
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.widget.PayToolbar
            if (r0 == 0) goto L_0x0030
            com.whatsapp.payments.ui.widget.PayToolbar r1 = (com.whatsapp.payments.ui.widget.PayToolbar) r1
            java.lang.Object r0 = r5.get(r11)
            boolean r0 = r7.equals(r0)
            r0 = r0 ^ 1
            r1.setLockIconVisibility(r0)
            return r14
        L_0x0054:
            java.lang.String r0 = "get_merchant_fees"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 23
            goto L_0x001e
        L_0x005f:
            java.lang.String r0 = "string_replace"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 22
            goto L_0x001e
        L_0x006a:
            java.lang.String r0 = "get_pin_retry_ts"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 21
            goto L_0x001e
        L_0x0075:
            java.lang.String r0 = "is_debug_build"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 20
            goto L_0x001e
        L_0x0080:
            java.lang.String r0 = "get_error_string"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 19
            goto L_0x001e
        L_0x008b:
            java.lang.String r0 = "get_card_network"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 18
            goto L_0x001e
        L_0x0096:
            java.lang.String r0 = "get_device_id"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 17
            goto L_0x001e
        L_0x00a2:
            java.lang.String r0 = "string_upper"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 16
            goto L_0x001e
        L_0x00ae:
            java.lang.String r0 = "get_formatted_date"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 15
            goto L_0x001e
        L_0x00ba:
            java.lang.String r0 = "current_server_time"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 14
            goto L_0x001e
        L_0x00c6:
            java.lang.String r0 = "get_screen_density_bucket"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 13
            goto L_0x001e
        L_0x00d2:
            java.lang.String r0 = "can_set_bio"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 12
            goto L_0x001e
        L_0x00de:
            java.lang.String r0 = "show_action_bar_icon"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 11
            goto L_0x001e
        L_0x00ea:
            java.lang.String r0 = "is_step_completed"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 10
            goto L_0x001e
        L_0x00f6:
            java.lang.String r0 = "get_button_info"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 9
            goto L_0x001e
        L_0x0102:
            java.lang.String r0 = "regex_check"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 8
            goto L_0x001e
        L_0x010e:
            java.lang.String r0 = "hide_lock_icon"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 7
            goto L_0x001e
        L_0x0119:
            java.lang.String r0 = "get_faq_uri"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 6
            goto L_0x001e
        L_0x0124:
            java.lang.String r0 = "get_tos_uri"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 5
            goto L_0x001e
        L_0x012f:
            java.lang.String r0 = "exp_date_check"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 4
            goto L_0x001e
        L_0x013a:
            java.lang.String r0 = "get_phone_last_n_digits"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 3
            goto L_0x001e
        L_0x0145:
            java.lang.String r0 = "hide_toolbar_bottom_divider"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            r13 = 2
            goto L_0x001e
        L_0x0150:
            java.lang.String r0 = "enable_secure_flag"
            short r13 = X.AnonymousClass8BV.A10(r0, r3)
            goto L_0x001e
        L_0x0158:
            java.lang.String r0 = "hide_toolbar_title_and_logo"
            short r13 = X.AnonymousClass8BV.A0z(r0, r3)
            goto L_0x001e
        L_0x0160:
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.WindowManager r0 = r4.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r1 = r1.densityDpi
            r0 = 240(0xf0, float:3.36E-43)
            if (r1 > r0) goto L_0x0179
            java.lang.String r6 = "hdpi_or_smaller"
            return r6
        L_0x0179:
            java.lang.String r6 = "larger_than_hdpi"
            return r6
        L_0x017c:
            androidx.appcompat.widget.Toolbar r0 = X.AnonymousClass3Ma.A0G(r4)
            if (r0 == 0) goto L_0x0312
            r0.setLogo((android.graphics.drawable.Drawable) r6)
            r0.setTitle((java.lang.CharSequence) r6)
            return r6
        L_0x0189:
            X.1QJ r0 = r4.A0B
            r0.A01()
            X.9R3 r0 = r4.A06
            if (r0 != 0) goto L_0x0199
            X.9R3 r0 = new X.9R3
            r0.<init>()
            r4.A06 = r0
        L_0x0199:
            java.lang.UnsupportedOperationException r0 = X.C17880vN.A0y()
            throw r0
        L_0x019e:
            X.0ve r2 = r4.A0E
            r1 = 698(0x2ba, float:9.78E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01b0
            X.A27 r0 = r4.A0I
            java.lang.String r6 = r0.A03(r3)
        L_0x01b0:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0312
            java.lang.String r6 = X.C17880vN.A0s(r3, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0312
            java.lang.String r0 = "100"
            java.lang.String r6 = X.C17880vN.A0s(r0, r5)
            return r6
        L_0x01c7:
            if (r21 == 0) goto L_0x0312
            java.lang.String r0 = "string_to_replace"
            java.lang.String r2 = X.C17880vN.A0s(r0, r5)
            java.lang.String r0 = "string_replacement"
            java.lang.String r1 = X.C17880vN.A0s(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x031b
            if (r1 == 0) goto L_0x031b
            java.lang.String r6 = r3.replaceAll(r2, r1)
            return r6
        L_0x01e2:
            X.9uA r0 = r4.A0P
            long r0 = r0.A00()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            return r6
        L_0x01ed:
            java.lang.String r6 = A0c(r3, r5)
            return r6
        L_0x01f2:
            X.1ek r0 = r4.A0Q
            java.lang.String r6 = r0.A01()
            return r6
        L_0x01f9:
            X.0vb r0 = r4.A00
            java.util.Locale r0 = r0.A0N()
            java.lang.String r6 = r3.toUpperCase(r0)
            return r6
        L_0x0204:
            java.lang.String r0 = "date"
            java.lang.String r0 = A0Q(r0, r5)
            java.util.Date r1 = X.A3L.A01(r0)
            if (r1 == 0) goto L_0x0219
            java.text.DateFormat r0 = java.text.DateFormat.getDateInstance(r2)
            java.lang.String r6 = r0.format(r1)
            return r6
        L_0x0219:
            return r14
        L_0x021a:
            long r0 = X.AnonymousClass8BS.A01(r4)
            java.lang.String r6 = java.lang.String.valueOf(r0)
            return r6
        L_0x0223:
            X.A5H r0 = r4.A0N
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0320
            X.A5H r0 = r4.A0N
            int r0 = r0.A02()
            if (r0 == r2) goto L_0x0320
            return r7
        L_0x0234:
            X.01n r1 = r4.getSupportActionBar()
            if (r1 == 0) goto L_0x0312
            com.whatsapp.bloks.ui.BloksDialogFragment r0 = r4.A04
            if (r0 == 0) goto L_0x0312
            java.lang.Boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0312
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0312
            r1.A0H()
            return r6
        L_0x024c:
            java.lang.String r0 = "completed_step"
            java.lang.String r2 = X.C17880vN.A0s(r0, r5)
            java.lang.String r0 = "is_merchant"
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r7.equals(r0)
            X.1QL r0 = r4.A07
            if (r1 == 0) goto L_0x0262
            X.1ew r0 = r4.A08
        L_0x0262:
            boolean r0 = r0.A0G(r2)
            goto L_0x031d
        L_0x0268:
            java.lang.String r0 = "regex"
            java.lang.String r0 = X.C17880vN.A0s(r0, r5)
            X.C17960vV.A07(r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)     // Catch:{ PatternSyntaxException -> 0x0281 }
            java.util.regex.Matcher r0 = r0.matcher(r3)     // Catch:{ PatternSyntaxException -> 0x0281 }
            boolean r0 = r0.find()     // Catch:{ PatternSyntaxException -> 0x0281 }
            if (r0 != 0) goto L_0x0280
            return r10
        L_0x0280:
            return r12
        L_0x0281:
            java.lang.String r0 = "on_exception"
            return r0
        L_0x0284:
            java.lang.String r0 = "platform"
            java.lang.String r2 = X.C17880vN.A0s(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0292
            java.lang.String r2 = "payments"
        L_0x0292:
            X.129 r1 = r4.A0R
            java.lang.String r0 = "article_id"
            java.lang.String r0 = X.C17880vN.A0s(r0, r5)
            android.net.Uri r0 = X.AnonymousClass129.A00(r6, r1, r2, r0, r6)
            java.lang.String r6 = r0.toString()
            return r6
        L_0x02a3:
            java.lang.String r0 = "MM/yy"
            java.text.SimpleDateFormat r0 = X.AnonymousClass8BS.A0q(r0)
            java.util.Calendar r13 = java.util.Calendar.getInstance()
            int r14 = r13.get(r2)
            int r15 = r13.get(r1)
            r18 = 59
            r16 = 0
            r17 = 23
            r19 = r18
            r13.set(r14, r15, r16, r17, r18, r19)
            java.util.Date r1 = r0.parse(r3)     // Catch:{ ParseException -> 0x02d1 }
            if (r1 == 0) goto L_0x02d1
            java.util.Date r0 = r13.getTime()     // Catch:{ ParseException -> 0x02d1 }
            boolean r0 = r1.before(r0)     // Catch:{ ParseException -> 0x02d1 }
            if (r0 != 0) goto L_0x02d1
            return r12
        L_0x02d1:
            return r10
        L_0x02d2:
            java.lang.String r0 = "num_of_digits"
            java.lang.String r1 = X.C17880vN.A0s(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x031b
            int r2 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0313 }
            X.11S r1 = r4.A02     // Catch:{ NumberFormatException -> 0x0313 }
            X.00H r0 = r4.A0b     // Catch:{ NumberFormatException -> 0x0313 }
            r0.get()     // Catch:{ NumberFormatException -> 0x0313 }
            r1.A0I()     // Catch:{ NumberFormatException -> 0x0313 }
            X.1E8 r0 = r1.A0D     // Catch:{ NumberFormatException -> 0x0313 }
            X.1BI r0 = X.AnonymousClass1E7.A00(r0)     // Catch:{ NumberFormatException -> 0x0313 }
            java.lang.String r6 = X.AnonymousClass17K.A03(r0)     // Catch:{ NumberFormatException -> 0x0313 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ NumberFormatException -> 0x0313 }
            if (r0 != 0) goto L_0x0312
            int r0 = r6.length()     // Catch:{ NumberFormatException -> 0x0313 }
            if (r0 <= r2) goto L_0x0312
            int r0 = r0 - r2
            java.lang.String r6 = r6.substring(r0)     // Catch:{ NumberFormatException -> 0x0313 }
            return r6
        L_0x0308:
            X.1LC r0 = r4.A03
            android.net.Uri r0 = r0.A00(r3)
            java.lang.String r6 = r0.toString()
        L_0x0312:
            return r6
        L_0x0313:
            r2 = move-exception
            X.1QE r1 = r4.A0K
            java.lang.String r0 = "performDataProcessingAction: REQUESTED_CASE_GET_PHONE_LAST_N_DIGITS: illegal num_of_digits"
            r1.A0A(r0, r2)
        L_0x031b:
            return r21
        L_0x031c:
            r0 = 0
        L_0x031d:
            if (r0 == 0) goto L_0x0320
            return r7
        L_0x0320:
            return r9
        L_0x0321:
            X.AnonymousClass8BV.A11(r4)
            return r14
        L_0x0325:
            r0 = 2131436271(0x7f0b22ef, float:1.8494408E38)
            android.view.View r1 = r4.findViewById(r0)
            java.lang.Object r0 = r5.get(r11)
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0337
            r8 = 0
        L_0x0337:
            r1.setVisibility(r8)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91q.CBa(java.lang.String, java.util.Map):java.lang.String");
    }

    public void onDestroy() {
        A2X a2x = this.A0a;
        if (a2x != null) {
            a2x.A04(this);
            this.A0a = null;
        }
        super.onDestroy();
    }

    public static String A0Q(Object obj, Map map) {
        Object obj2 = map.get(obj);
        C17960vV.A07(obj2);
        return (String) obj2;
    }

    public static String A0V(Object obj, Map map) {
        String str = (String) map.get(obj);
        C17960vV.A06(str);
        return str;
    }

    private void A0d() {
        String str;
        AbstractMap A0p = AnonymousClass8BW.A0p(this);
        if (A0p != null) {
            str = C108945cZ.A1G("fds_resource_id", A0p);
        } else {
            str = null;
        }
        AbstractMap A0p2 = AnonymousClass8BW.A0p(this);
        if (A0p2 != null) {
            String A1G = C108945cZ.A1G("fds_manager_id", A0p2);
            if (str != null && A1G != null) {
                HashMap A11 = C17880vN.A11();
                A11.put("action", "on_back_pressed");
                A4f(str, A1G, A11);
            }
        }
    }

    public C22415B6x A4d() {
        return super.A4b().BM4();
    }

    public void A4e(C194839sN r4) {
        String A1G;
        AbstractMap A0p = AnonymousClass8BW.A0p(this);
        if (A0p != null && (A1G = C108945cZ.A1G("fds_observer_id", A0p)) != null) {
            A2X A022 = this.A0S.A02(A1G);
            this.A0a = A022;
            A022.A01(new C21089AeJ(r4, this), AnonymousClass7NW.class, this);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 30) {
            return;
        }
        if (i2 == -1) {
            A4c();
        } else {
            finish();
        }
    }

    public void onBackPressed() {
        A0d();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0Z = AnonymousClass8BX.A0M(this);
        getWindow().setSoftInputMode(16);
    }

    public void onResume() {
        super.onResume();
        if (this.A0Y) {
            A0r(this);
            this.A0Y = false;
        }
    }

    public void C5k(int i, int i2) {
    }
}
