package com.whatsapp.deeplink;

import X.A8Q;
import X.A98;
import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass18K;
import X.AnonymousClass1E7;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MB;
import X.AnonymousClass1PM;
import X.AnonymousClass1QO;
import X.AnonymousClass1QS;
import X.AnonymousClass1VP;
import X.AnonymousClass1VQ;
import X.AnonymousClass1XN;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4FY;
import X.AnonymousClass4TX;
import X.AnonymousClass4YQ;
import X.AnonymousClass4a6;
import X.AnonymousClass6RX;
import X.AnonymousClass6h0;
import X.AnonymousClass733;
import X.AnonymousClass757;
import X.AnonymousClass759;
import X.AnonymousClass77K;
import X.AnonymousClass871;
import X.C010105w;
import X.C108955ca;
import X.C108965cb;
import X.C114945sf;
import X.C128436fz;
import X.C132216mP;
import X.C133366od;
import X.C135686sb;
import X.C140036zq;
import X.C1407072q;
import X.C1411974r;
import X.C1412274u;
import X.C146587Pv;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C188069gp;
import X.C189759jn;
import X.C195529tU;
import X.C19880zA;
import X.C20035A4e;
import X.C203411t;
import X.C219217x;
import X.C24661Le;
import X.C27301Vn;
import X.C30191dX;
import X.C30801eX;
import X.C31071ey;
import X.C32981i4;
import X.C36391no;
import X.C36921og;
import X.C40751vD;
import X.C58692l6;
import X.C678831f;
import X.C72453Mb;
import X.C73203Rj;
import X.C86344Rg;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class DeepLinkActivity extends C114945sf implements AnonymousClass871 {
    public static final HashSet A1F;
    public static final List A1G;
    public Handler A00;
    public C19880zA A01;
    public C19880zA A02;
    public C19880zA A03;
    public C19880zA A04;
    public C19880zA A05;
    public C19880zA A06;
    public C19880zA A07;
    public C19880zA A08;
    public C19880zA A09;
    public C19880zA A0A;
    public C19880zA A0B;
    public C19880zA A0C;
    public C19880zA A0D;
    public C19880zA A0E;
    public C132216mP A0F;
    public C40751vD A0G;
    public C195529tU A0H;
    public A8Q A0I;
    public AnonymousClass6h0 A0J;
    public AnonymousClass1VP A0K;
    public C203411t A0L;
    public C30191dX A0M;
    public AnonymousClass1M9 A0N;
    public AnonymousClass1PM A0O;
    public C678831f A0P;
    public C27301Vn A0Q;
    public C219217x A0R;
    public C30801eX A0S;
    public C58692l6 A0T;
    public C36391no A0U;
    public C24661Le A0V;
    public AnonymousClass1E7 A0W;
    public C32981i4 A0X;
    public C86344Rg A0Y;
    public AnonymousClass18K A0Z;
    public AnonymousClass1MB A0a;
    public AnonymousClass1LU A0b;
    public AnonymousClass1XN A0c;
    public C36921og A0d;
    public AnonymousClass4YQ A0e;
    public AnonymousClass1QO A0f;
    public AnonymousClass1QS A0g;
    public C188069gp A0h;
    public C31071ey A0i;
    public A98 A0j;
    public C189759jn A0k;
    public AnonymousClass00H A0l;
    public AnonymousClass00H A0m;
    public AnonymousClass00H A0n;
    public AnonymousClass00H A0o;
    public AnonymousClass00H A0p;
    public AnonymousClass00H A0q;
    public AnonymousClass00H A0r;
    public AnonymousClass00H A0s;
    public AnonymousClass00H A0t;
    public AnonymousClass00H A0u;
    public AnonymousClass00H A0v;
    public AnonymousClass00H A0w;
    public AnonymousClass00H A0x;
    public AnonymousClass00H A0y;
    public AnonymousClass00H A0z;
    public AnonymousClass00H A10;
    public AnonymousClass00H A11;
    public AnonymousClass00H A12;
    public AnonymousClass00H A13;
    public AnonymousClass00H A14;
    public AnonymousClass00H A15;
    public AnonymousClass00H A16;
    public AnonymousClass00H A17;
    public AnonymousClass00H A18;
    public AnonymousClass00H A19;
    public AnonymousClass00H A1A;
    public AnonymousClass00H A1B;
    public AnonymousClass00H A1C;
    public String A1D;
    public String A1E;

    public static void A0x(DeepLinkActivity deepLinkActivity, UserJid userJid, String str, boolean z) {
        DeepLinkActivity deepLinkActivity2 = deepLinkActivity;
        C18030ve r2 = deepLinkActivity.A0E;
        C18070vi.A0d(r2, 0);
        if (C18020vd.A05(C18040vf.A02, r2, 508)) {
            deepLinkActivity.A05.CGF(new C146587Pv(deepLinkActivity2, userJid, str, 3, z));
        }
    }

    static {
        Integer[] numArr = new Integer[28];
        char A1b = C72453Mb.A1b(numArr, 1);
        C17880vN.A1T(numArr, 2, 1);
        C17880vN.A1T(numArr, 3, 2);
        C17880vN.A1T(numArr, 5, 3);
        numArr[4] = 6;
        C17880vN.A1T(numArr, 8, 5);
        C17880vN.A1T(numArr, 9, 6);
        C17890vO.A1I(numArr, 10);
        C17880vN.A1T(numArr, 11, 8);
        C17880vN.A1T(numArr, 12, 9);
        C17880vN.A1T(numArr, 13, 10);
        C17880vN.A1T(numArr, 41, 11);
        C17880vN.A1T(numArr, 23, 12);
        C17880vN.A1T(numArr, 24, 13);
        numArr[14] = 25;
        numArr[15] = 30;
        numArr[16] = C108955ca.A0j();
        numArr[17] = 33;
        numArr[18] = 36;
        numArr[19] = 56;
        numArr[20] = 67;
        numArr[21] = 75;
        numArr[22] = 58;
        C17880vN.A1T(numArr, 64, 23);
        C17880vN.A1T(numArr, 81, 24);
        C17880vN.A1T(numArr, 129, 25);
        numArr[26] = 146;
        A1F = C17900vP.A0I(153, numArr, 27);
        String[] strArr = new String[5];
        strArr[A1b] = "com.bloks.www.survey_platform.survey_screen";
        strArr[1] = "com.bloks.www.survey_platform.xmds_survey_invitation_screen";
        strArr[2] = "com.bloks.www.survey_platform.survey_invitation_screen";
        strArr[3] = "com.bloks.www.survey_platform.start_survey.action";
        strArr[4] = "com.bloks.www.survey_platform_cds_survey_page_screen";
        A1G = Arrays.asList(strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        if (r4.equals("banner") == false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        if (r0 != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r7 != 5) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A0q(android.net.Uri r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "wa_campaign_type"
            java.lang.String r4 = r6.getQueryParameter(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            r2 = 12
            r1 = 5
            r0 = 4
            if (r3 != 0) goto L_0x0073
            int r0 = r4.hashCode()
            switch(r0) {
                case -1919832081: goto L_0x0068;
                case -1396342996: goto L_0x005f;
                case -892481550: goto L_0x0056;
                case 595233003: goto L_0x004f;
                case 611512779: goto L_0x0046;
                case 1232933127: goto L_0x003d;
                case 1627905202: goto L_0x0034;
                default: goto L_0x0017;
            }
        L_0x0017:
            r2 = 14
        L_0x0019:
            java.lang.String r0 = "wa_campaign_id"
            r6.getQueryParameter(r0)
            r0 = 60
            if (r2 == r0) goto L_0x007b
            X.0zA r1 = r5.A08
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x007b
            X.C19880zA.A02(r1)
            java.lang.String r0 = "logEntryPointClicked"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0034:
            java.lang.String r0 = "ads_hub_overview"
            boolean r0 = r4.equals(r0)
            r2 = 60
            goto L_0x0070
        L_0x003d:
            java.lang.String r0 = "banner_from_biz_tab"
            boolean r0 = r4.equals(r0)
            r2 = 39
            goto L_0x0070
        L_0x0046:
            java.lang.String r0 = "grow_biz_active_ad_card"
            boolean r0 = r4.equals(r0)
            r2 = 42
            goto L_0x0070
        L_0x004f:
            java.lang.String r0 = "notification"
            boolean r0 = r4.equals(r0)
            goto L_0x0070
        L_0x0056:
            java.lang.String r0 = "status"
            boolean r0 = r4.equals(r0)
            r2 = 18
            goto L_0x0070
        L_0x005f:
            java.lang.String r0 = "banner"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0078
            goto L_0x0017
        L_0x0068:
            java.lang.String r0 = "business_home_qp_card"
            boolean r0 = r4.equals(r0)
            r2 = 55
        L_0x0070:
            if (r0 != 0) goto L_0x0019
            goto L_0x0017
        L_0x0073:
            if (r7 == r0) goto L_0x0078
            if (r7 == r1) goto L_0x0019
            goto L_0x0017
        L_0x0078:
            r2 = 13
            goto L_0x0019
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.deeplink.DeepLinkActivity.A0q(android.net.Uri, int):int");
    }

    public static Intent A0r(DeepLinkActivity deepLinkActivity, String str) {
        DeepLinkActivity deepLinkActivity2 = deepLinkActivity;
        boolean A052 = C18020vd.A05(C18040vf.A02, deepLinkActivity2.A0E, 7558);
        Integer A0i2 = C108955ca.A0i();
        int A053 = deepLinkActivity2.A0V.A05();
        ArrayList A0A2 = deepLinkActivity2.A0V.A0A();
        ArrayList A0B2 = deepLinkActivity2.A0V.A0B();
        String str2 = str;
        if (A052) {
            return AnonymousClass1LU.A0S(deepLinkActivity2, new AnonymousClass77K(A0A2, A0B2, A053, false, false, false, false), (Integer) null, (Integer) null, A0i2, (String) null, str2, 2, 16, 52);
        }
        return AnonymousClass1LU.A0T(deepLinkActivity2, new AnonymousClass77K(A0A2, A0B2, A053, false, false, false, false), A0i2, str2);
    }

    private C140036zq A0s(Uri uri, boolean z) {
        C18030ve r6 = this.A0E;
        return ((C1407072q) this.A10.get()).A02(uri, (AnonymousClass4TX) this.A12.get(), this.A0U, (C128436fz) this.A0z.get(), r6, z);
    }

    private String A0t() {
        Uri uri;
        C18030ve r2 = this.A0E;
        C18070vi.A0d(r2, 0);
        if (C18020vd.A00(C18040vf.A02, r2, 12822) != 1) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            uri = getReferrer();
        } else {
            uri = (Uri) getIntent().getParcelableExtra("android.intent.extra.REFERRER");
        }
        if (uri != null) {
            this.A15.get();
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.clearQuery();
            Iterator<String> it = uri.getQueryParameterNames().iterator();
            while (it.hasNext()) {
                String A0v2 = C17880vN.A0v(it);
                if (!C18070vi.A18(A0v2, "text")) {
                    buildUpon.appendQueryParameter(A0v2, uri.getQueryParameter(A0v2));
                }
            }
            return C18070vi.A0H(buildUpon.build());
        } else if (Build.VERSION.SDK_INT >= 22) {
            return getIntent().getStringExtra("android.intent.extra.REFERRER_NAME");
        } else {
            return null;
        }
    }

    private void A0u(Uri uri, AnonymousClass6RX r11) {
        PhoneUserJid A032;
        String A002;
        C18030ve r2 = this.A0E;
        C18070vi.A0d(r2, 0);
        if (C18020vd.A05(C18040vf.A02, r2, 11655)) {
            int intExtra = getIntent().getIntExtra("source", 1);
            C133366od r22 = (C133366od) this.A15.get();
            String A072 = C32981i4.A07(uri);
            if (A072 == null) {
                A032 = null;
            } else {
                A032 = PhoneUserJid.Companion.A03(A072);
                if (A032 != null) {
                    A002 = r22.A00(uri);
                    AnonymousClass6RX r3 = r11;
                    ((C20035A4e) this.A16.get()).A02(r3, A032, Integer.valueOf(intExtra), A002, A0t(), r22.A01(uri));
                }
            }
            A002 = null;
            AnonymousClass6RX r32 = r11;
            ((C20035A4e) this.A16.get()).A02(r32, A032, Integer.valueOf(intExtra), A002, A0t(), r22.A01(uri));
        }
    }

    private void A0v(Uri uri, AnonymousClass6RX r9, UserJid userJid) {
        C18030ve r2 = this.A0E;
        C18070vi.A0d(r2, 0);
        if (C18020vd.A05(C18040vf.A02, r2, 11655)) {
            int intExtra = getIntent().getIntExtra("source", 1);
            C133366od r0 = (C133366od) this.A15.get();
            AnonymousClass6RX r1 = r9;
            UserJid userJid2 = userJid;
            ((C20035A4e) this.A16.get()).A02(r1, userJid2, Integer.valueOf(intExtra), r0.A00(uri), A0t(), r0.A01(uri));
        }
    }

    private boolean A0z() {
        AnonymousClass11S r0 = this.A02;
        r0.A0I();
        if (r0.A00 != null && this.A07.A04()) {
            return false;
        }
        startActivity(AnonymousClass1LU.A0A(this));
        finish();
        return true;
    }

    public void CBt(String str) {
        if (str.equals("call_phone_number_deep_link_start_call_dialog_tag")) {
            ((AnonymousClass1VQ) this.A0K).CNw(this, this.A0W, 58, false);
            this.A0W = null;
        } else if (str.equals("call_phone_number_deep_link_not_on_wa_dialog_tag")) {
            ((AnonymousClass733) this.A18.get()).A03(this, (C135686sb) null, 43, this.A1D, "sms:");
            this.A1D = null;
        }
        finish();
    }

    public static void A0w(DeepLinkActivity deepLinkActivity) {
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass3MY.A1H(AnonymousClass4FY.A00(new C1411974r(21), (DialogInterface.OnClickListener) null, C17880vN.A0q(deepLinkActivity, deepLinkActivity.getString(2131888733), A1a, 0, 2131894998), (Object[]) null, new Object[0], -1, 0, 2131899286, 0, 2131892932), deepLinkActivity, (String) null);
    }

    private void A0y(String str) {
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0E(2131891441);
        A002.A0D(2131891442);
        A002.A0X(AnonymousClass757.A00(this, 38), 2131898766);
        A002.A0Z(new C1412274u(1, str, this), 2131893160);
        C010105w create = A002.create();
        create.setOnDismissListener(new AnonymousClass759(this, 1));
        create.show();
    }

    public void BtF() {
        CEx();
        BhQ(2131891441);
        this.A00.removeMessages(1);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A00.removeMessages(1);
    }

    public void A3h(int i) {
        C108965cb.A0y(this);
    }

    public void Bjo(String str) {
        finish();
    }

    /* JADX WARNING: type inference failed for: r0v325, types: [X.1TI] */
    /* JADX WARNING: type inference failed for: r6v42, types: [X.7Ng] */
    /* JADX WARNING: type inference failed for: r8v45, types: [X.7Nk] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02a1, code lost:
        r1 = X.AnonymousClass1LU.A1T(r15, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0059, code lost:
        if (r6 != 1) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0301, code lost:
        startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03ac, code lost:
        r1 = new X.C98564rM(r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03f6, code lost:
        r3 = X.C17880vN.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03fa, code lost:
        if (r0 == null) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03fc, code lost:
        r3.putExtra("bonsaiOnboardingEntryPoint", r0.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0405, code lost:
        r3.putExtra("metaAiOnboardingTargetKey", r2);
        r3.setClassName(getPackageName(), "com.whatsapp.bot.onboarding.BonsaiOnboardingActivity");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x060a, code lost:
        com.whatsapp.util.Log.i(r0);
        A0w(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0839, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x092e, code lost:
        BhQ(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0963, code lost:
        if (r0 == false) goto L_0x0942;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ef, code lost:
        X.AnonymousClass3MY.A1H(X.AnonymousClass4FY.A00(X.AnonymousClass757.A00(r15, 41), (android.content.DialogInterface.OnClickListener) null, (java.lang.CharSequence) null, new java.lang.Object[0], new java.lang.Object[0], -1, r10, 2131889227, 0, 2131889229), r15, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0a7c, code lost:
        r2.CGF(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0abd, code lost:
        if (r4 != 25) goto L_0x0ac7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0122, code lost:
        if (r3.Bfq(r0) != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0126, code lost:
        r6 = new X.AnonymousClass7LJ(r15, X.C17880vN.A0U(r15.A19));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0ba9, code lost:
        r1.A09(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0bac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r2 = new java.net.URI(r0.getScheme(), r0.getHost(), r0.getPath(), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0145, code lost:
        r5 = r6.A00;
        r4 = r5.A0B();
        r12 = new X.AnonymousClass1MD[1];
        X.C17880vN.A1Q(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "verify_link", r12, 0);
        r8 = new X.C29621ca("request", r12, new X.C29621ca[]{new X.C29621ca("url", r2.toString(), (X.AnonymousClass1MD[]) null)});
        r7 = new X.AnonymousClass1MD[3];
        X.C17880vN.A1Q(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID, r4, r7, 0);
        X.C17880vN.A1Q("xmlns", "fb:thrift_iq", r7, 1);
        X.C17890vO.A12(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r7);
        r2 = r5.A0N(r6, new X.C29621ca(r8, "iq", r7), r4, 229, 32000);
        r1 = X.AnonymousClass000.A11("sendVerifyLinkRequest url=");
        r1.append(r0);
        X.C17900vP.A0n(" success:", r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0c43, code lost:
        r7 = r1.getIntExtra("qr_code_camera_source", 5);
        r3 = X.C17880vN.A0A();
        r3.setClassName(getPackageName(), "com.whatsapp.contact.picker.ContactPicker");
        r3.putExtra("uri", r0);
        r3.putExtra("source_surface", 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0c6e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r15.A0X.A01, 9568) == false) goto L_0x0c98;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0c70, code lost:
        r8 = r0.getQueryParameter("source");
        r2 = r0.getQueryParameter("medium");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x019c, code lost:
        if (r2 == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0c7e, code lost:
        if (r8 == null) goto L_0x0ca0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0c88, code lost:
        if (r15.A0X.A0M(r8, 9708) != false) goto L_0x0c8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0c8a, code lost:
        r8 = "unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0c8b, code lost:
        if (r2 != null) goto L_0x0ca3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0c8d, code lost:
        r2 = "unavailable";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0c8e, code lost:
        r3.putExtra("entry_point_conversion_external_source", r8);
        r3.putExtra("entry_point_conversion_external_medium", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0c98, code lost:
        r3.putExtra("source", r6);
        r3.putExtra("qr_code_camera_source", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0ca0, code lost:
        if (r2 == null) goto L_0x0c98;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0ca2, code lost:
        r8 = "unavailable";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x019e, code lost:
        X.C108985cd.A0y(android.os.Message.obtain(r15.A00, 1), r15, 2131893165);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0cab, code lost:
        if (r15.A0X.A0M(r2, 9707) != false) goto L_0x0c8e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0cad, code lost:
        r2 = "unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01ab, code lost:
        r1 = X.AnonymousClass000.A11("sendVerifyLinkRequest url=");
        r1.append(r0);
        X.C17890vO.A1B(r1, " failed because the url is invalid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0e67, code lost:
        if (r15.A0X.A03.A03() != false) goto L_0x0e69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0e69, code lost:
        r4 = r15.A0g.A06().BWu();
        r1 = new android.content.Intent(r15, r4);
        X.C17900vP.A0Y(r4, "PAY: DeepLinkActivity: ", X.AnonymousClass000.A10());
        r1.putExtra("actual_deep_link", r0.toString());
        r1.putExtra("referral_screen", "deeplink");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0ec4, code lost:
        if (r1 != false) goto L_0x0ec6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x1006, code lost:
        X.AnonymousClass4aU.A05(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x117a, code lost:
        if (r1.equals("1") != false) goto L_0x117c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:0x127b, code lost:
        if (r1 < 1) goto L_0x127d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x127f, code lost:
        BtF();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x133a, code lost:
        if (r15.A0f.A0A() == false) goto L_0x133c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:670:0x133c, code lost:
        X.C108965cb.A0y(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:671:0x133f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x1346, code lost:
        if (X.C24211Jh.A02(r15, "com.whatsapp.w4b") == null) goto L_0x135b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x1348, code lost:
        r1 = X.AnonymousClass3MY.A07(r0);
        r1.addFlags(268435456);
        r1.setPackage("com.whatsapp.w4b");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x1354, code lost:
        r15.A01.A08(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:676:0x135b, code lost:
        r15.A01.A08(r15, r15.A0k.A00("smb_linking_back2wa"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:677:0x1368, code lost:
        X.C108965cb.A0y(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x138f, code lost:
        r1.putExtra(r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:711:0x1412, code lost:
        BhU(new java.lang.Object[r5], r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:760:0x15b9, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:761:0x15bc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:773:0x15fb, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A00, 11696) != false) goto L_0x1622;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:779:0x1620, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A00, 12160) != false) goto L_0x1622;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x021f, code lost:
        r0 = "DeepLinkActivity/handleAiMediaInputLink: invalid deeplink";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:839:?, code lost:
        r3 = r15.A0X;
        getIntent();
        r2 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:840:0x18d8, code lost:
        if (r2.A07() == false) goto L_0x1903;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:841:0x18da, code lost:
        r0 = r0.getQueryParameter("destination_url");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:842:0x18e0, code lost:
        if (r0 == null) goto L_0x18fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:844:0x18eb, code lost:
        if (r3.A0E(android.net.Uri.parse(r0)) == 1) goto L_0x18f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:845:0x18ed, code lost:
        r2.A03();
        r0 = X.AnonymousClass000.A0s("handleInterAppIdentitySwitchDeeplink");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:846:0x18f6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:847:0x18f7, code lost:
        r0 = new X.AnonymousClass6OQ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:848:0x18fd, code lost:
        r0 = new X.AnonymousClass6OQ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:849:0x1903, code lost:
        r0 = new X.AnonymousClass6OQ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:850:0x1909, code lost:
        r0 = r15.A0X;
        r2 = getApplicationContext();
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:852:0x1915, code lost:
        if (r1.A07() == false) goto L_0x1917;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:853:0x1917, code lost:
        BhR(r2.getString(2131891441));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:854:0x1921, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:855:0x1922, code lost:
        r1.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:856:0x192b, code lost:
        throw X.AnonymousClass000.A0s("getErrorMessage");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:945:0x1af6, code lost:
        if (X.AnonymousClass6YV.A00.contains(r1) != false) goto L_0x1af8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:954:0x1b17, code lost:
        r12 = "whatsapp-smb://premium";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:956:0x1b1c, code lost:
        A0y(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:957:0x1b1f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:964:0x1b2d, code lost:
        com.whatsapp.util.Log.i(r0);
        A0w(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:965:0x1b33, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x028b, code lost:
        r2 = r0.getQueryParameter("appId");
        r1 = r0.getQueryParameter("params");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:973:0x1b66, code lost:
        if (r15.A07.A04() == false) goto L_0x1b68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0297, code lost:
        if (r2 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:980:0x1bbc, code lost:
        BhU(new java.lang.Object[0], 2131889454, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:981:0x1bc5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x029f, code lost:
        if (A1G.contains(r2) == false) goto L_0x002b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0a52  */
    /* JADX WARNING: Removed duplicated region for block: B:710:0x140f  */
    /* JADX WARNING: Removed duplicated region for block: B:715:0x1423  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r31) {
        /*
            r30 = this;
            r15 = r30
            r0 = r31
            super.onCreate(r0)
            X.2l6 r0 = r15.A0T
            r0.A00()
            android.os.Looper r1 = r15.getMainLooper()
            r14 = 0
            X.5df r0 = new X.5df
            r0.<init>(r1, r15)
            r15.A00 = r0
            android.content.Intent r1 = r15.getIntent()
            android.net.Uri r0 = r1.getData()
            r2 = 0
            if (r0 != 0) goto L_0x002f
            r1 = 2131891441(0x7f1214f1, float:1.9417602E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r15.BhU(r0, r1, r2)
        L_0x002b:
            r15.finish()
        L_0x002e:
            return
        L_0x002f:
            java.lang.String r2 = X.C17890vO.A0Q()
            r15.A1E = r2
            X.1QS r2 = r15.A0g
            X.BD1 r2 = r2.A06()
            r2.BiD(r0)
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 22
            if (r3 < r2) goto L_0x0047
            r15.getReferrer()
        L_0x0047:
            X.1i4 r2 = r15.A0X
            int r11 = r2.A0E(r0)
            java.lang.String r4 = "source"
            r5 = 1
            int r6 = r1.getIntExtra(r4, r5)
            r2 = 2
            r7 = 1
            if (r6 == r2) goto L_0x005b
            r7 = 0
            if (r6 == r5) goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            if (r11 == r2) goto L_0x0077
            r2 = 153(0x99, float:2.14E-43)
            if (r11 == r2) goto L_0x0077
            X.4Rg r3 = r15.A0Y
            java.lang.String r2 = r15.A1E
            r18 = r14
            r19 = r14
            r16 = r3
            r17 = r14
            r20 = r2
            r21 = r11
            r22 = r6
            r16.A00(r17, r18, r19, r20, r21, r22)
        L_0x0077:
            X.11S r2 = r15.A02
            boolean r2 = r2.A0N()
            if (r2 == 0) goto L_0x008b
            java.util.HashSet r2 = A1F
            boolean r2 = X.C108965cb.A1Z(r2, r11)
            if (r2 != 0) goto L_0x008b
        L_0x0087:
            r15.BtF()
            return
        L_0x008b:
            java.lang.String r12 = "whatsapp-smb://biztools/accounts"
            java.lang.String r13 = "google"
            java.lang.String r9 = "deeplink"
            java.lang.String r2 = "wa_pages"
            java.lang.String r10 = "extra_entry_point"
            java.lang.String r8 = "action"
            r3 = 4
            switch(r11) {
                case 1: goto L_0x0126;
                case 2: goto L_0x0bb9;
                case 3: goto L_0x13c5;
                case 4: goto L_0x0e69;
                case 5: goto L_0x0b3e;
                case 6: goto L_0x0ae7;
                case 7: goto L_0x009b;
                case 8: goto L_0x009b;
                case 9: goto L_0x009b;
                case 10: goto L_0x13c5;
                case 11: goto L_0x009b;
                case 12: goto L_0x009b;
                case 13: goto L_0x1394;
                case 14: goto L_0x1389;
                case 15: goto L_0x1382;
                case 16: goto L_0x137b;
                case 17: goto L_0x1374;
                case 18: goto L_0x136d;
                case 19: goto L_0x00e2;
                case 20: goto L_0x1b02;
                case 21: goto L_0x12df;
                case 22: goto L_0x12d0;
                case 23: goto L_0x12c1;
                case 24: goto L_0x12b2;
                case 25: goto L_0x129a;
                case 26: goto L_0x1284;
                case 27: goto L_0x1248;
                case 28: goto L_0x122f;
                case 29: goto L_0x0e36;
                case 30: goto L_0x1b23;
                case 31: goto L_0x1ab2;
                case 32: goto L_0x11f8;
                case 33: goto L_0x0aa6;
                case 34: goto L_0x009b;
                case 35: goto L_0x0966;
                case 36: goto L_0x009c;
                case 37: goto L_0x091f;
                case 38: goto L_0x08eb;
                case 39: goto L_0x08d4;
                case 40: goto L_0x08a8;
                case 41: goto L_0x153f;
                case 42: goto L_0x087c;
                case 43: goto L_0x11e9;
                case 44: goto L_0x085d;
                case 45: goto L_0x009b;
                case 46: goto L_0x1a9d;
                case 47: goto L_0x11c8;
                case 48: goto L_0x1a79;
                case 49: goto L_0x1a63;
                case 50: goto L_0x1a4d;
                case 51: goto L_0x1a37;
                case 52: goto L_0x083e;
                case 53: goto L_0x1a21;
                case 54: goto L_0x009b;
                case 55: goto L_0x06b0;
                case 56: goto L_0x0659;
                case 57: goto L_0x1a0b;
                case 58: goto L_0x11b8;
                case 59: goto L_0x0623;
                case 60: goto L_0x009b;
                case 61: goto L_0x111e;
                case 62: goto L_0x0600;
                case 63: goto L_0x19f5;
                case 64: goto L_0x05c9;
                case 65: goto L_0x00d5;
                case 66: goto L_0x10f4;
                case 67: goto L_0x10ed;
                case 68: goto L_0x05aa;
                case 69: goto L_0x0598;
                case 70: goto L_0x0586;
                case 71: goto L_0x0574;
                case 72: goto L_0x0553;
                case 73: goto L_0x19bf;
                case 74: goto L_0x08a8;
                case 75: goto L_0x10e5;
                case 76: goto L_0x053b;
                case 77: goto L_0x04d8;
                case 78: goto L_0x04c0;
                case 79: goto L_0x009b;
                case 80: goto L_0x10d5;
                case 81: goto L_0x10cb;
                case 82: goto L_0x04a4;
                case 83: goto L_0x0488;
                case 84: goto L_0x0440;
                case 85: goto L_0x009b;
                case 86: goto L_0x009b;
                case 87: goto L_0x0415;
                case 88: goto L_0x10ad;
                case 89: goto L_0x1340;
                case 90: goto L_0x009b;
                case 91: goto L_0x109d;
                case 92: goto L_0x108d;
                case 93: goto L_0x03ca;
                case 94: goto L_0x009b;
                case 95: goto L_0x009b;
                case 96: goto L_0x1072;
                case 97: goto L_0x009b;
                case 98: goto L_0x1b1a;
                case 99: goto L_0x1063;
                case 100: goto L_0x1334;
                case 101: goto L_0x009b;
                case 102: goto L_0x009b;
                case 103: goto L_0x03b3;
                case 104: goto L_0x009b;
                case 105: goto L_0x009b;
                case 106: goto L_0x009b;
                case 107: goto L_0x1334;
                case 108: goto L_0x1969;
                case 109: goto L_0x03a8;
                case 110: goto L_0x1051;
                case 111: goto L_0x009b;
                case 112: goto L_0x1034;
                case 113: goto L_0x0659;
                case 114: goto L_0x0f8a;
                case 115: goto L_0x0306;
                case 116: goto L_0x009b;
                case 117: goto L_0x009b;
                case 118: goto L_0x1340;
                case 119: goto L_0x02e0;
                case 120: goto L_0x02e0;
                case 121: goto L_0x02e0;
                case 122: goto L_0x02e0;
                case 123: goto L_0x02e0;
                case 124: goto L_0x02e0;
                case 125: goto L_0x02e0;
                case 126: goto L_0x02e0;
                case 127: goto L_0x02e0;
                case 128: goto L_0x0f76;
                case 129: goto L_0x0f70;
                case 130: goto L_0x02cd;
                case 131: goto L_0x1957;
                case 132: goto L_0x02e0;
                case 133: goto L_0x02e0;
                case 134: goto L_0x02e0;
                case 135: goto L_0x02e0;
                case 136: goto L_0x02e0;
                case 137: goto L_0x192c;
                case 138: goto L_0x18cd;
                case 139: goto L_0x18bb;
                case 140: goto L_0x009b;
                case 141: goto L_0x009b;
                case 142: goto L_0x02bb;
                case 143: goto L_0x02a7;
                case 144: goto L_0x028b;
                case 145: goto L_0x0f61;
                case 146: goto L_0x0f15;
                case 147: goto L_0x024e;
                case 148: goto L_0x0278;
                case 149: goto L_0x009b;
                case 150: goto L_0x009b;
                case 151: goto L_0x0223;
                case 152: goto L_0x1893;
                case 153: goto L_0x01b9;
                case 154: goto L_0x009b;
                case 155: goto L_0x0ef7;
                case 156: goto L_0x0ef1;
                case 157: goto L_0x01ee;
                case 158: goto L_0x01c3;
                case 159: goto L_0x0edc;
                default: goto L_0x009b;
            }
        L_0x009b:
            goto L_0x002b
        L_0x009c:
            java.lang.String r4 = "page"
            java.lang.String r3 = r0.getQueryParameter(r4)
            if (r3 != 0) goto L_0x00b3
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsChat"
            r1.setClassName(r2, r0)
            goto L_0x1806
        L_0x00b3:
            java.lang.String r0 = "language"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0e4d
            X.11S r0 = r15.A02
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x0087
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsTabActivity"
            r1.setClassName(r2, r0)
            r1.putExtra(r4, r3)
            goto L_0x1806
        L_0x00d5:
            X.11S r1 = r15.A02
            r1.A0I()
            com.whatsapp.Me r1 = r1.A00
            if (r1 != 0) goto L_0x0e5f
            r10 = 2131889230(0x7f120c4e, float:1.9413118E38)
            goto L_0x00ef
        L_0x00e2:
            r4 = 0
            X.11S r1 = r15.A02
            r1.A0I()
            com.whatsapp.Me r1 = r1.A00
            if (r1 != 0) goto L_0x010e
            r10 = 2131889228(0x7f120c4c, float:1.9413114E38)
        L_0x00ef:
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r13 = 2131889229(0x7f120c4d, float:1.9413116E38)
            r11 = 2131889227(0x7f120c4b, float:1.9413112E38)
            r0 = 41
            X.757 r4 = X.AnonymousClass757.A00(r15, r0)
            r9 = -1
            r6 = r14
            r5 = r14
            r7 = r2
            r8 = r1
            r12 = r3
            com.whatsapp.LegacyMessageDialogFragment r0 = X.AnonymousClass4FY.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.AnonymousClass3MY.A1H(r0, r15, r14)
            return
        L_0x010e:
            X.1i4 r1 = r15.A0X
            X.1QN r1 = r1.A03
            boolean r2 = r1.A03()
            X.1QS r1 = r15.A0g
            X.BD1 r3 = r1.A06()
            if (r2 != 0) goto L_0x0e91
            boolean r1 = r3.Bfq(r0)
            if (r1 == 0) goto L_0x0126
            goto L_0x0087
        L_0x0126:
            X.00H r1 = r15.A19
            X.1OZ r1 = X.C17880vN.A0U(r1)
            X.7LJ r6 = new X.7LJ
            r6.<init>(r15, r1)
            java.lang.String r13 = "sendVerifyLinkRequest url="
            r10 = 0
            java.lang.String r4 = r0.getScheme()     // Catch:{ URISyntaxException -> 0x01ab }
            java.lang.String r3 = r0.getHost()     // Catch:{ URISyntaxException -> 0x01ab }
            java.lang.String r1 = r0.getPath()     // Catch:{ URISyntaxException -> 0x01ab }
            java.net.URI r2 = new java.net.URI     // Catch:{ URISyntaxException -> 0x01ab }
            r2.<init>(r4, r3, r1, r14)     // Catch:{ URISyntaxException -> 0x01ab }
            X.1OZ r5 = r6.A00
            java.lang.String r4 = r5.A0B()
            r3 = 1
            X.1MD[] r12 = new X.AnonymousClass1MD[r3]
            java.lang.String r1 = "verify_link"
            java.lang.String r9 = "type"
            X.C17880vN.A1Q(r9, r1, r12, r10)
            X.1ca[] r11 = new X.C29621ca[r3]
            java.lang.String r7 = r2.toString()
            java.lang.String r2 = "url"
            X.1ca r1 = new X.1ca
            r1.<init>((java.lang.String) r2, (java.lang.String) r7, (X.AnonymousClass1MD[]) r14)
            r11[r10] = r1
            java.lang.String r1 = "request"
            X.1ca r8 = new X.1ca
            r8.<init>((java.lang.String) r1, (X.AnonymousClass1MD[]) r12, (X.C29621ca[]) r11)
            r1 = 3
            X.1MD[] r7 = new X.AnonymousClass1MD[r1]
            java.lang.String r1 = "id"
            X.C17880vN.A1Q(r1, r4, r7, r10)
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "fb:thrift_iq"
            X.C17880vN.A1Q(r2, r1, r7, r3)
            java.lang.String r1 = "get"
            X.C17890vO.A12(r9, r1, r7)
            java.lang.String r2 = "iq"
            X.1ca r1 = new X.1ca
            r1.<init>((X.C29621ca) r8, (java.lang.String) r2, (X.AnonymousClass1MD[]) r7)
            r10 = 32000(0x7d00, double:1.581E-319)
            r9 = 229(0xe5, float:3.21E-43)
            r7 = r1
            r8 = r4
            boolean r2 = r5.A0N(r6, r7, r8, r9, r10)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r13)
            r1.append(r0)
            java.lang.String r0 = " success:"
            X.C17900vP.A0n(r0, r1, r2)
            if (r2 == 0) goto L_0x0087
            android.os.Handler r0 = r15.A00
            android.os.Message r1 = android.os.Message.obtain(r0, r3)
            r0 = 2131893165(0x7f121bad, float:1.9421099E38)
            X.C108985cd.A0y(r1, r15, r0)
            return
        L_0x01ab:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r13)
            r1.append(r0)
            java.lang.String r0 = " failed because the url is invalid"
            X.C17890vO.A1B(r1, r0)
            goto L_0x0087
        L_0x01b9:
            boolean r1 = r15.A0z()
            if (r1 == 0) goto L_0x1852
            java.lang.String r0 = "DeepLinkActivity/onCreate/ User is not registered"
            goto L_0x15b9
        L_0x01c3:
            java.lang.String r2 = "aivoice"
            java.lang.String r1 = r0.getLastPathSegment()
            boolean r1 = android.text.TextUtils.equals(r2, r1)
            if (r1 == 0) goto L_0x021f
            X.00H r1 = r15.A0o
            X.1UD r1 = X.AnonymousClass3MW.A0X(r1)
            boolean r1 = r1.A08()
            if (r1 != 0) goto L_0x01df
            java.lang.String r0 = "DeepLinkActivity/handleAiVoiceLink: entry point disabled"
            goto L_0x0839
        L_0x01df:
            java.lang.String r1 = "s"
            java.lang.String r0 = r0.getQueryParameter(r1)     // Catch:{ Exception -> 0x01ea }
            java.lang.Integer r0 = X.C108955ca.A0l(r0)     // Catch:{ Exception -> 0x01ea }
            goto L_0x01eb
        L_0x01ea:
            r0 = 0
        L_0x01eb:
            r2 = 2
            goto L_0x03f6
        L_0x01ee:
            java.lang.String r2 = "aimediainput"
            java.lang.String r1 = r0.getLastPathSegment()
            boolean r1 = android.text.TextUtils.equals(r2, r1)
            if (r1 == 0) goto L_0x021f
            X.00H r1 = r15.A0o
            X.1UD r1 = X.AnonymousClass3MW.A0X(r1)
            boolean r1 = r1.A08()
            if (r1 != 0) goto L_0x020a
            java.lang.String r0 = "DeepLinkActivity/handleAiMediaInputLink: entry point disabled"
            goto L_0x0839
        L_0x020a:
            java.lang.String r1 = "s"
            java.lang.String r0 = r0.getQueryParameter(r1)     // Catch:{ Exception -> 0x0215 }
            java.lang.Integer r0 = X.C108955ca.A0l(r0)     // Catch:{ Exception -> 0x0215 }
            goto L_0x021c
        L_0x0215:
            r1 = move-exception
            java.lang.String r0 = "DeepLinkActivity/handleAiMediaInputLink: error passing source"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
        L_0x021c:
            r2 = 1
            goto L_0x03f6
        L_0x021f:
            java.lang.String r0 = "DeepLinkActivity/handleAiMediaInputLink: invalid deeplink"
            goto L_0x0839
        L_0x0223:
            X.0zA r0 = r15.A06
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0247
            X.0zA r0 = r15.A0C
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0247
            X.0zA r0 = r15.A0D
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0247
            r0 = 2131891797(0x7f121655, float:1.9418324E38)
            r15.CNA(r0)
            X.10I r2 = r15.A05
            r0 = 16
            goto L_0x03ac
        L_0x0247:
            java.lang.String r0 = "biz-agents-onboarding"
            r15.A0y(r0)
            goto L_0x002b
        L_0x024e:
            X.0ve r3 = r15.A0E
            r2 = 10128(0x2790, float:1.4192E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            if (r1 == 0) goto L_0x002b
            X.11E r1 = r15.A07
            boolean r1 = r1.A09()
            if (r1 != 0) goto L_0x0266
            java.lang.String r0 = "DeepLinkActivity/help-bottomsheet/no-connectivity"
            goto L_0x060a
        L_0x0266:
            java.lang.String r2 = r0.getLastPathSegment()
            if (r2 == 0) goto L_0x002b
            X.00H r0 = r15.A0w
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
            r0 = 1
            r1.A02(r15, r2, r0)
            goto L_0x002b
        L_0x0278:
            android.content.Intent r3 = X.AnonymousClass1LU.A02(r15)
            java.lang.String r2 = "deeplink_favorites_filter"
            r1 = 1
            r3.putExtra(r2, r1)
            java.lang.String r1 = X.C28901bF.A02
            android.content.Intent r1 = r3.setAction(r1)
            r15.startActivity(r1)
        L_0x028b:
            java.lang.String r1 = "appId"
            java.lang.String r2 = r0.getQueryParameter(r1)
            java.lang.String r1 = "params"
            java.lang.String r1 = r0.getQueryParameter(r1)
            if (r2 == 0) goto L_0x002b
            java.util.List r0 = A1G
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x002b
            android.content.Intent r1 = X.AnonymousClass1LU.A1T(r15, r2, r1)
            goto L_0x1354
        L_0x02a7:
            X.1QS r1 = r15.A0g
            X.BD1 r2 = r1.A06()
            r1 = 9
            android.content.Intent r2 = r2.BWr(r15, r9, r1)
            if (r2 == 0) goto L_0x002b
            java.lang.String r1 = "actual_deep_link"
            r2.putExtra(r1, r0)
            goto L_0x0301
        L_0x02bb:
            X.0zA r1 = r15.A0E
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x002b
            r1.A03()
            java.lang.String r0 = "handleDeeplink"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x02cd:
            X.00H r1 = r15.A0m
            java.lang.Object r2 = r1.get()
            X.73V r2 = (X.AnonymousClass73V) r2
            java.lang.String r1 = "avatar_editor_deeplink"
            java.lang.String r0 = r0.toString()
            r2.A04(r15, r1, r0)
            goto L_0x002b
        L_0x02e0:
            X.1QS r1 = r15.A0g
            X.BD1 r3 = r1.A06()
            android.content.Context r2 = r15.getApplicationContext()
            r1 = 0
            android.content.Intent r2 = r3.BQO(r2, r0, r1)
            if (r2 == 0) goto L_0x002b
            java.lang.String r1 = "actual_deep_link"
            java.lang.String r0 = r0.toString()
            r2.putExtra(r1, r0)
            java.lang.String r1 = "deepLink"
            X.11P r0 = r15.A05
            X.C60442o2.A00(r2, r0, r1)
        L_0x0301:
            r15.startActivity(r2)
            goto L_0x1368
        L_0x0306:
            X.0ve r1 = r15.A0E
            r0 = 7911(0x1ee7, float:1.1086E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x002b
            X.0z4 r5 = r15.A0A
            X.1Vn r4 = r15.A0Q
            X.1LU r2 = r15.A0b
            X.0ve r1 = r15.A0E
            r0 = 8998(0x2326, float:1.2609E-41)
            boolean r1 = X.C18020vd.A05(r3, r1, r0)
            r3 = 1
            X.C18070vi.A0d(r5, r3)
            X.C18070vi.A0k(r4, r2)
            X.1Vo r4 = (X.AnonymousClass1Vo) r4
            X.1Vp r0 = r4.A00
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x002b
            boolean r0 = X.AnonymousClass112.A09()
            if (r0 == 0) goto L_0x0344
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = r5.A2a(r0)
            if (r0 != 0) goto L_0x0344
            X.AnonymousClass6X7.A00(r15, r5)
            goto L_0x002b
        L_0x0344:
            if (r1 == 0) goto L_0x0351
            boolean r0 = X.AnonymousClass112.A03()
            if (r0 == 0) goto L_0x1006
            X.AnonymousClass4aU.A06(r15)
            goto L_0x002b
        L_0x0351:
            boolean r0 = X.AnonymousClass112.A09()
            r5 = r0 ^ 1
            r6 = 2131889754(0x7f120e5a, float:1.941418E38)
            r7 = 2131894379(0x7f12206b, float:1.9423561E38)
            r4 = 2131232813(0x7f08082d, float:1.8081746E38)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.permissions.RequestNotificationPermissionActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "drawable_id"
            android.content.Intent r4 = r1.putExtra(r0, r4)
            java.lang.String[] r2 = new java.lang.String[r3]
            r1 = 0
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            r2[r1] = r0
            java.lang.String r0 = "permissions"
            android.content.Intent r1 = r4.putExtra(r0, r2)
            java.lang.String r0 = "message_id"
            android.content.Intent r1 = r1.putExtra(r0, r7)
            java.lang.String r0 = "perm_denial_message_id"
            android.content.Intent r1 = r1.putExtra(r0, r7)
            java.lang.String r0 = "title_id"
            android.content.Intent r1 = r1.putExtra(r0, r6)
            java.lang.String r0 = "force_ui"
            android.content.Intent r1 = r1.putExtra(r0, r5)
            java.lang.String r0 = "entry_point"
            android.content.Intent r2 = r1.putExtra(r0, r3)
            java.lang.String r1 = "permission_value_for_logging"
            r0 = 2
            android.content.Intent r3 = r2.putExtra(r1, r0)
            goto L_0x0e48
        L_0x03a8:
            X.10I r2 = r15.A05
            r0 = 17
        L_0x03ac:
            X.4rM r1 = new X.4rM
            r1.<init>(r15, r0)
            goto L_0x0a7c
        L_0x03b3:
            X.0zA r1 = r15.A07
            boolean r1 = r1.A07()
            if (r1 == 0) goto L_0x002b
            r15.A0q(r0, r6)
            X.0zA r0 = r15.A07
            X.C19880zA.A02(r0)
            java.lang.String r0 = "launchRecentlyMedia"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x03ca:
            android.net.Uri r2 = X.C32981i4.A05(r0)
            if (r2 == 0) goto L_0x03d1
            r0 = r2
        L_0x03d1:
            java.lang.String r3 = "ais"
            java.lang.String r2 = r0.getLastPathSegment()
            boolean r2 = android.text.TextUtils.equals(r3, r2)
            if (r2 == 0) goto L_0x0c43
            X.00H r1 = r15.A0o
            X.1UD r1 = X.AnonymousClass3MW.A0X(r1)
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = "s"
            java.lang.String r0 = r0.getQueryParameter(r1)     // Catch:{ Exception -> 0x03f4 }
            java.lang.Integer r0 = X.C108955ca.A0l(r0)     // Catch:{ Exception -> 0x03f4 }
            goto L_0x03f5
        L_0x03f4:
            r0 = 0
        L_0x03f5:
            r2 = 0
        L_0x03f6:
            android.content.Intent r3 = X.C17880vN.A0A()
            if (r0 == 0) goto L_0x0405
            java.lang.String r1 = "bonsaiOnboardingEntryPoint"
            int r0 = r0.intValue()
            r3.putExtra(r1, r0)
        L_0x0405:
            java.lang.String r0 = "metaAiOnboardingTargetKey"
            r3.putExtra(r0, r2)
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.bot.onboarding.BonsaiOnboardingActivity"
            r3.setClassName(r1, r0)
            goto L_0x0e48
        L_0x0415:
            X.0zA r1 = r15.A06
            boolean r1 = r1.A07()
            if (r1 == 0) goto L_0x002b
            X.0zA r1 = r15.A02
            boolean r1 = r1.A07()
            if (r1 == 0) goto L_0x002b
            X.0zA r1 = r15.A03
            boolean r1 = r1.A07()
            if (r1 == 0) goto L_0x002b
            java.lang.String r0 = r0.getQueryParameter(r4)
            java.lang.String.valueOf(r0)
            X.0zA r0 = r15.A02
            X.C19880zA.A02(r0)
            java.lang.String r0 = "startNewOnboardingSession"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0440:
            X.0zA r1 = r15.A07
            boolean r1 = r1.A07()
            if (r1 == 0) goto L_0x002b
            r15.A0q(r0, r6)
            java.lang.String r10 = "screen_type"
            java.lang.String r9 = r0.getQueryParameter(r10)
            java.lang.String r8 = "amount"
            java.lang.String r7 = r0.getQueryParameter(r8)
            java.lang.String r6 = "country_code"
            java.lang.String r5 = r0.getQueryParameter(r6)
            java.lang.String r4 = "account_id"
            java.lang.String r3 = r0.getQueryParameter(r4)
            java.lang.String r2 = "pending_ad_id"
            java.lang.String r1 = r0.getQueryParameter(r2)
            android.os.Bundle r0 = X.C17880vN.A0D()
            r0.putString(r10, r9)
            r0.putString(r4, r3)
            r0.putString(r6, r5)
            r0.putString(r8, r7)
            r0.putString(r2, r1)
            X.0zA r0 = r15.A07
            X.C19880zA.A02(r0)
            java.lang.String r0 = "launchAdPaymentCompletionScreen"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0488:
            X.0zA r1 = r15.A07
            boolean r1 = r1.A07()
            if (r1 == 0) goto L_0x002b
            r15.A0q(r0, r6)
            X.0zA r1 = r15.A07
            X.C19880zA.A02(r1)
            java.lang.String r1 = "content_type"
            r0.getQueryParameter(r1)
            java.lang.String r0 = "launchMessagingGuide"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x04a4:
            X.0zA r1 = r15.A07
            boolean r1 = r1.A07()
            if (r1 == 0) goto L_0x002b
            r15.A0q(r0, r6)
            X.0zA r1 = r15.A07
            X.C19880zA.A02(r1)
            X.1i4 r1 = r15.A0X
            r1.A0H(r0)
            java.lang.String r0 = "launchAdDetailsScreen"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x04c0:
            boolean r0 = r15.A0z()
            if (r0 != 0) goto L_0x002e
            X.0zA r1 = r15.A04
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x1b14
            X.C19880zA.A02(r1)
            java.lang.String r0 = "handleDeepLink"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x04d8:
            java.lang.String r1 = "auth"
            java.lang.String r4 = r0.getQueryParameter(r1)
            X.0ve r2 = r15.A0E
            r1 = 4560(0x11d0, float:6.39E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x052e
            X.0z4 r3 = r15.A0A
            r1 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r0 = "adl_deep_link_nonce_gen_timestamp"
            boolean r0 = r3.A2b(r0, r1)
            if (r0 != 0) goto L_0x052e
            android.content.SharedPreferences r0 = X.C72453Mb.A0M(r15)
            java.lang.String r2 = "adl_deep_link_nonce"
            java.lang.String r1 = r0.getString(r2, r14)
            X.0z4 r0 = r15.A0A
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r0)
            r0.remove(r2)
            if (r4 == 0) goto L_0x002b
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x002b
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x002b
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.companiondevice.CompanionHelloConfirmationActivity"
            r3.setClassName(r1, r0)
            java.lang.String r1 = "companion_platform_display"
            java.lang.String r0 = "Wear OS"
            r3.putExtra(r1, r0)
            goto L_0x0e48
        L_0x052e:
            X.0z4 r0 = r15.A0A
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "adl_deep_link_nonce"
            r1.remove(r0)
            goto L_0x002b
        L_0x053b:
            java.lang.String r1 = "otpCode"
            java.lang.String r1 = r0.getQueryParameter(r1)
            r2 = 1
            if (r1 == 0) goto L_0x0545
            r2 = 2
        L_0x0545:
            java.lang.String r1 = r0.toString()
            r0 = 1
            android.content.Intent r0 = X.AnonymousClass1LU.A1b(r15, r1, r14, r2, r0)
            r15.startActivity(r0)
            goto L_0x002b
        L_0x0553:
            X.0zA r1 = r15.A07
            boolean r1 = r1.A07()
            if (r1 == 0) goto L_0x002b
            int r3 = r15.A0q(r0, r6)
            X.0zA r0 = r15.A07
            X.C19880zA.A02(r0)
            java.lang.Integer r2 = X.AnonymousClass00R.A0q
            java.lang.String r1 = "-1"
            X.5tX r0 = new X.5tX
            r0.<init>(r2, r1, r14, r3)
            java.lang.String r0 = "launchAdsCreationExperience"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0574:
            X.0zA r1 = r15.A06
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x002b
            r1.A03()
            java.lang.String r0 = "getAwaySettingsActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0586:
            X.0zA r1 = r15.A06
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x002b
            r1.A03()
            java.lang.String r0 = "getGreetingMessageSettingsActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0598:
            X.0zA r1 = r15.A06
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x002b
            r1.A03()
            java.lang.String r0 = "getLabelsActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x05aa:
            X.0zA r1 = r15.A07
            boolean r1 = r1.A07()
            if (r1 == 0) goto L_0x002b
            int r2 = r15.A0q(r0, r6)
            X.0zA r0 = r15.A07
            X.C19880zA.A02(r0)
            java.lang.Integer r1 = X.AnonymousClass00R.A0I
            X.5tU r0 = new X.5tU
            r0.<init>(r1, r14, r2)
            java.lang.String r0 = "launchAdsCreationExperience"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x05c9:
            r0 = 2
            android.content.Intent[] r3 = new android.content.Intent[r0]
            X.00H r0 = r15.A0l
            java.lang.Object r0 = r0.get()
            X.6oZ r0 = (X.C133326oZ) r0
            X.00H r0 = r0.A00
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsPrivacy"
            r2.setClassName(r1, r0)
            r0 = 0
            r3[r0] = r2
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsCallingPrivacyActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "target_setting"
            r2.putExtra(r0, r14)
            r0 = 1
            r3[r0] = r2
            r15.startActivities(r3)
            goto L_0x002b
        L_0x0600:
            X.11E r1 = r15.A07
            boolean r1 = r1.A09()
            if (r1 != 0) goto L_0x0612
            java.lang.String r0 = "DeepLinkActivity/help/no-connectivity"
        L_0x060a:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            A0w(r15)
            goto L_0x002b
        L_0x0612:
            java.lang.String r1 = r0.getLastPathSegment()
            if (r1 == 0) goto L_0x002b
            X.00H r0 = r15.A0w
            X.1o3 r0 = X.AnonymousClass3MW.A0a(r0)
            r0.A01(r15, r1)
            goto L_0x002b
        L_0x0623:
            X.11S r0 = r15.A02
            com.whatsapp.jid.PhoneUserJid r4 = X.AnonymousClass11S.A00(r0)
            if (r4 != 0) goto L_0x0630
            r0 = 2131887982(0x7f12076e, float:1.9410586E38)
            goto L_0x092e
        L_0x0630:
            r3 = 6
            X.A8Q r1 = r15.A0I
            if (r7 == 0) goto L_0x0657
            java.lang.String r0 = "whatsapp"
        L_0x0637:
            r1.A08(r3, r2, r0)
            X.00H r0 = r15.A0t
            java.lang.Object r0 = r0.get()
            X.9kg r0 = (X.C190289kg) r0
            r0.A00()
            X.9tU r0 = r15.A0H
            X.1L9 r1 = r0.A00
            r0 = 11
            android.content.Intent r0 = X.AnonymousClass1LU.A0z(r15, r4, r14, r0)
            r1.A08(r15, r0)
            A0x(r15, r4, r2, r7)
            goto L_0x002b
        L_0x0657:
            r0 = 0
            goto L_0x0637
        L_0x0659:
            X.4YQ r4 = r15.A0e
            r7 = 1
            X.00H r6 = r4.A00
            java.lang.Object r1 = X.C18070vi.A0E(r6)
            X.1c4 r1 = (X.AnonymousClass1c4) r1
            X.0ve r3 = r1.A02
            r2 = 3877(0xf25, float:5.433E-42)
            X.0vf r1 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r1, r3, r2)
            if (r1 != r7) goto L_0x0677
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r4.A02(r15, r0)
            goto L_0x002b
        L_0x0677:
            java.lang.Object r1 = X.C18070vi.A0E(r6)
            X.1c4 r1 = (X.AnonymousClass1c4) r1
            boolean r1 = r1.A08()
            if (r1 != 0) goto L_0x068a
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            r4.A01(r15, r0, r1, r5)
            goto L_0x002b
        L_0x068a:
            X.2tm r2 = X.AnonymousClass4YQ.A03
            boolean r1 = r2.A07(r0)
            if (r1 != 0) goto L_0x0698
            boolean r1 = r2.A08(r0)
            if (r1 == 0) goto L_0x002b
        L_0x0698:
            X.00H r1 = r4.A02
            X.C108955ca.A1S(r1)
            android.content.Intent r3 = X.AnonymousClass1LU.A02(r15)
            java.lang.String r1 = X.C28901bF.A03
            r3.setAction(r1)
            java.lang.String r1 = "android.intent.action.VIEW"
            r3.setAction(r1)
            r3.setData(r0)
            goto L_0x0e48
        L_0x06b0:
            X.00H r1 = r15.A1A
            java.lang.Object r4 = r1.get()
            X.1pH r4 = (X.C37291pH) r4
            r5 = 0
            r3 = 1
            java.util.List r1 = r0.getPathSegments()
            int r2 = r1.size()
            r1 = 2
            if (r2 != r1) goto L_0x0837
            java.util.List r1 = r0.getPathSegments()
            java.lang.Object r2 = r1.get(r5)
            java.lang.String r1 = "privacy"
            boolean r1 = X.C18070vi.A18(r2, r1)
            if (r1 == 0) goto L_0x0837
            java.util.List r1 = r0.getPathSegments()
            java.lang.Object r2 = r1.get(r3)
            java.lang.String r1 = "disclosure"
            boolean r1 = X.C18070vi.A18(r2, r1)
            if (r1 == 0) goto L_0x0837
            java.lang.String r2 = r0.getHost()
            java.lang.String r1 = "whatsapp.com"
            if (r2 == 0) goto L_0x07fc
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x07fc
            X.00H r1 = r4.A03
            java.lang.Object r1 = r1.get()
            X.2b2 r1 = (X.C52512b2) r1
            X.0ve r3 = r1.A00
            r2 = 4100(0x1004, float:5.745E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            if (r1 == 0) goto L_0x07d2
            java.lang.String r1 = "d"
            java.lang.String r2 = r0.getQueryParameter(r1)     // Catch:{ UnsupportedOperationException -> 0x07b9 }
            if (r2 == 0) goto L_0x07cb
            r1 = 11
            byte[] r5 = android.util.Base64.decode(r2, r1)     // Catch:{ IllegalArgumentException -> 0x07ae }
            if (r5 == 0) goto L_0x07cb
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII     // Catch:{ NumberFormatException -> 0x07c1 }
            X.C18070vi.A0Z(r2)     // Catch:{ NumberFormatException -> 0x07c1 }
            java.lang.String r1 = new java.lang.String     // Catch:{ NumberFormatException -> 0x07c1 }
            r1.<init>(r5, r2)     // Catch:{ NumberFormatException -> 0x07c1 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x07c1 }
            if (r9 == 0) goto L_0x07cb
            java.lang.String r1 = "v"
            java.lang.String r6 = "DisclosureUtils/getUriQueryParameterAsInt fail to get URL param as integer "
            r3 = 0
            java.lang.String r1 = r0.getQueryParameter(r1)     // Catch:{ NumberFormatException | UnsupportedOperationException -> 0x0735 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException | UnsupportedOperationException -> 0x0735 }
            goto L_0x073d
        L_0x0735:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.C17900vP.A0X(r2, r6, r1)
        L_0x073d:
            r8 = 1
            if (r3 == 0) goto L_0x0747
            int r7 = r3.intValue()
        L_0x0744:
            java.lang.String r1 = "a"
            goto L_0x0749
        L_0x0747:
            r7 = 1
            goto L_0x0744
        L_0x0749:
            java.lang.String r6 = r0.getQueryParameter(r1)     // Catch:{ UnsupportedOperationException -> 0x074e }
            goto L_0x0759
        L_0x074e:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "DisclosureUtils/getUriQueryParameter failed to get URL param "
            X.C17900vP.A0X(r3, r1, r2)
            r6 = 0
        L_0x0759:
            if (r7 == r8) goto L_0x07e3
            if (r6 == 0) goto L_0x07e3
            X.11S r1 = r4.A00
            X.1E2 r1 = r1.A09()
            if (r1 == 0) goto L_0x07a8
            java.lang.String r2 = r1.user
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            X.C18070vi.A0Z(r1)
            byte[] r2 = X.C18070vi.A1A(r2, r1)
            java.security.MessageDigest r1 = X.C108945cZ.A1I()     // Catch:{ NoSuchAlgorithmException -> 0x07d9 }
            r1.update(r2)     // Catch:{ NoSuchAlgorithmException -> 0x07d9 }
            r1.update(r5)     // Catch:{ NoSuchAlgorithmException -> 0x07d9 }
            byte[] r2 = r1.digest()     // Catch:{ NoSuchAlgorithmException -> 0x07d9 }
            if (r2 == 0) goto L_0x07e3
            r5 = 0
            r1 = 11
            java.lang.String r5 = android.util.Base64.encodeToString(r2, r1)     // Catch:{ IllegalArgumentException -> 0x0788 }
            goto L_0x0792
        L_0x0788:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "DisclosureUtils/base64Encode fail to encode to base64 string "
            X.C17900vP.A0X(r3, r1, r2)
        L_0x0792:
            boolean r1 = r6.equals(r5)
            if (r1 == 0) goto L_0x07e3
            X.7Ky r0 = new X.7Ky
            r0.<init>(r15)
            X.6wZ r7 = X.C138126wZ.A04
            r5 = r4
            r6 = r15
            r8 = r0
            r10 = r14
            r5.A02(r6, r7, r8, r9, r10)
            goto L_0x002b
        L_0x07a8:
            java.lang.String r1 = "PrivacyDisclosureLauncher/isAuthenticatedDeepLink my LID is null"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x07e3
        L_0x07ae:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ UnsupportedOperationException -> 0x07b9 }
            java.lang.String r1 = "DisclosureUtils/base64Decode fail to decode base64 string "
            X.C17900vP.A0X(r3, r1, r2)     // Catch:{ UnsupportedOperationException -> 0x07b9 }
            goto L_0x07cb
        L_0x07b9:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "DisclosureUtils/getUriQueryParameterAsByteArray fail to get URL param as byte array "
            goto L_0x07c8
        L_0x07c1:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "DisclosureUtils/convertByteArrayToInt fail to convert byte array to integer "
        L_0x07c8:
            X.C17900vP.A0X(r3, r1, r2)
        L_0x07cb:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "PrivacyDisclosureLauncher/handleExternalDeepLink: invalid disclosure id "
            goto L_0x07e9
        L_0x07d2:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "PrivacyDisclosureLauncher/handleDeepLink: external,deep link is not allowed "
            goto L_0x07e9
        L_0x07d9:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "DisclosureUtils/computeHashSHA256 fail to compute SHA256 hash "
            X.C17900vP.A0X(r3, r1, r2)
        L_0x07e3:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "PrivacyDisclosureLauncher/handleExternalDeepLink: invalid authCode "
        L_0x07e9:
            X.C17900vP.A0Z(r0, r1, r2)
            X.00H r0 = r4.A04
            X.C108955ca.A1S(r0)
            android.content.Intent r3 = X.AnonymousClass1LU.A02(r15)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r3.setFlags(r0)
            goto L_0x0e48
        L_0x07fc:
            java.lang.String r1 = "surf"
            java.lang.String r7 = r0.getQueryParameter(r1)
            if (r7 == 0) goto L_0x002b
            java.lang.String r1 = "trigger"
            java.lang.String r3 = r0.getQueryParameter(r1)
            java.util.List r0 = X.C138126wZ.A07
            java.util.Iterator r2 = r0.iterator()
        L_0x0810:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0835
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6wZ r0 = (X.C138126wZ) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.C18070vi.A18(r0, r3)
            if (r0 == 0) goto L_0x0810
        L_0x0825:
            X.6wZ r1 = (X.C138126wZ) r1
            if (r1 != 0) goto L_0x082b
            X.6wZ r1 = X.C138126wZ.A06
        L_0x082b:
            r6 = r14
            r2 = r4
            r3 = r15
            r4 = r1
            r5 = r14
            r2.A02(r3, r4, r5, r6, r7)
            goto L_0x002b
        L_0x0835:
            r1 = 0
            goto L_0x0825
        L_0x0837:
            java.lang.String r0 = "PrivacyDisclosureLauncher: handleDeepLink(): invalid disclosure deeplink"
        L_0x0839:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x002b
        L_0x083e:
            X.00H r0 = r15.A0l
            java.lang.Object r0 = r0.get()
            X.6oZ r0 = (X.C133326oZ) r0
            X.00H r0 = r0.A00
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsPrivacy"
            r2.setClassName(r1, r0)
            r15.startActivity(r2)
            r15.finish()
            goto L_0x002b
        L_0x085d:
            X.0zA r1 = r15.A07
            boolean r1 = r1.A07()
            if (r1 == 0) goto L_0x002b
            int r2 = r15.A0q(r0, r6)
            X.0zA r0 = r15.A07
            X.C19880zA.A02(r0)
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            X.5tW r0 = new X.5tW
            r0.<init>(r14, r1, r14, r2)
            java.lang.String r0 = "launchAdsCreationExperience"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x087c:
            X.0zA r0 = r15.A09
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x1b17
            X.0zA r0 = r15.A0B
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x1b17
            X.Af0 r3 = new X.Af0
            r3.<init>()
            X.10I r2 = r15.A05
            r1 = 32
            X.3Ch r0 = new X.3Ch
            r0.<init>(r15, r3, r1)
            r2.CGF(r0)
            r1 = 2
            X.7Ne r0 = new X.7Ne
            r0.<init>(r3, r15, r1)
            r3.A09(r0)
            goto L_0x002b
        L_0x08a8:
            X.0zA r1 = r15.A07
            boolean r1 = r1.A07()
            if (r1 == 0) goto L_0x002b
            r15.A0q(r0, r6)
            java.lang.String r1 = "promote_again"
            java.lang.String r2 = r0.getQueryParameter(r1)
            if (r2 != 0) goto L_0x08cd
            r2 = 0
        L_0x08bc:
            X.0zA r1 = r15.A07
            X.C19880zA.A02(r1)
            X.1i4 r1 = r15.A0X
            r1.A0H(r0)
            java.lang.String r0 = "launchAdDetailsScreen"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x08cd:
            java.lang.String r1 = "true"
            boolean r2 = r1.equalsIgnoreCase(r2)
            goto L_0x08bc
        L_0x08d4:
            X.0zA r1 = r15.A07
            boolean r1 = r1.A07()
            if (r1 == 0) goto L_0x002b
            r15.A0q(r0, r6)
            X.0zA r0 = r15.A07
            X.C19880zA.A02(r0)
            java.lang.String r0 = "launchManageAdsContentSelection"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x08eb:
            X.0zA r1 = r15.A07
            boolean r1 = r1.A07()
            if (r1 == 0) goto L_0x002b
            int r3 = r15.A0q(r0, r6)
            java.lang.Integer r2 = X.AnonymousClass00R.A0m
            X.5tS r1 = new X.5tS
            r1.<init>(r2, r14, r3)
            java.lang.String r1 = "entrypoint"
            java.lang.String r1 = r0.getQueryParameter(r1)
            if (r1 == 0) goto L_0x0913
            java.lang.String r0 = "video_promotion"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0913
            X.5tT r0 = new X.5tT
            r0.<init>(r2, r14, r3)
        L_0x0913:
            X.0zA r0 = r15.A07
            X.C19880zA.A02(r0)
            java.lang.String r0 = "launchAdsCreationExperience"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x091f:
            X.0ve r3 = r15.A0E
            r2 = 5543(0x15a7, float:7.767E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            if (r1 == 0) goto L_0x0933
            r0 = 2131891441(0x7f1214f1, float:1.9417602E38)
        L_0x092e:
            r15.BhQ(r0)
            goto L_0x002b
        L_0x0933:
            java.lang.String r1 = "entrypoint"
            java.lang.String r1 = r0.getQueryParameter(r1)
            if (r1 == 0) goto L_0x0942
            int r0 = r1.hashCode()
            switch(r0) {
                case 111294: goto L_0x095c;
                case 3052376: goto L_0x0954;
                case 738950403: goto L_0x094b;
                default: goto L_0x0942;
            }
        L_0x0942:
            r2 = 5
        L_0x0943:
            X.11t r1 = r15.A0L
            r0 = 6
            r1.CNu(r15, r0, r2)
            goto L_0x002b
        L_0x094b:
            java.lang.String r0 = "channel"
            boolean r0 = r1.equals(r0)
            r2 = 8
            goto L_0x0963
        L_0x0954:
            java.lang.String r0 = "chat"
            boolean r0 = r1.equals(r0)
            r2 = 7
            goto L_0x0963
        L_0x095c:
            java.lang.String r0 = "psa"
            boolean r0 = r1.equals(r0)
            r2 = 6
        L_0x0963:
            if (r0 != 0) goto L_0x0943
            goto L_0x0942
        L_0x0966:
            X.1QO r1 = r15.A0f
            X.0ve r4 = r1.A02
            r2 = 10894(0x2a8e, float:1.5266E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r4, r2)
            if (r1 != 0) goto L_0x133c
            X.9gp r5 = r15.A0h
            android.content.Context r2 = r15.getApplicationContext()
            r6 = 0
            if (r2 == 0) goto L_0x0992
            android.content.Intent r1 = X.AnonymousClass3MY.A07(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r0)
            java.lang.String r0 = "com.whatsapp.w4b"
            r1.setPackage(r0)
            X.1L9 r0 = r5.A00
            r0.A08(r2, r1)
            goto L_0x002b
        L_0x0992:
            java.util.List r7 = r0.getPathSegments()
            int r2 = r7.size()
            r1 = 5
            r10 = 1
            if (r2 >= r1) goto L_0x09cb
            java.lang.String r2 = r0.getScheme()
            java.lang.String r1 = "whatsapp"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x09bd
            java.lang.String r1 = "whatsapp-smb"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x09bd
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "Invalid phoenix deeplink URI: "
            X.C17900vP.A0Z(r0, r1, r2)
            goto L_0x002b
        L_0x09bd:
            java.lang.String[] r2 = new java.lang.String[r10]
            java.lang.String r1 = "ph"
            r2[r6] = r1
            java.util.ArrayList r1 = X.AnonymousClass1ZU.A05(r2)
            java.util.ArrayList r7 = X.C29431cG.A0k(r7, r1)
        L_0x09cb:
            java.lang.Object r1 = r7.get(r10)
            X.C18070vi.A0X(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r2 = java.lang.Integer.parseInt(r1)
            r1 = 2
            java.lang.String r9 = X.C17880vN.A0w(r7, r1)
            if (r2 > r10) goto L_0x002b
            java.lang.String r1 = "pay"
            boolean r1 = X.C18070vi.A18(r9, r1)
            if (r1 == 0) goto L_0x002b
            r1 = 3
            java.lang.String r4 = X.C17880vN.A0w(r7, r1)
            java.lang.String r7 = X.C17880vN.A0w(r7, r3)
            X.C18070vi.A0b(r9)
            X.C18070vi.A0b(r4)
            X.C18070vi.A0b(r7)
            java.lang.String r3 = "domain"
            X.C18070vi.A0d(r9, r6)
            java.lang.String r2 = "config"
            X.C18070vi.A0d(r4, r10)
            r1 = 2
            X.C18070vi.A0d(r7, r1)
            org.json.JSONObject r1 = X.C17880vN.A15()
            r1.put(r8, r7)
            r1.put(r2, r4)
            r1.put(r3, r9)
            java.lang.String r9 = X.C18070vi.A0H(r1)
            X.00H r1 = r5.A05
            java.lang.Object r2 = r1.get()
            X.9jQ r2 = (X.C189549jQ) r2
            monitor-enter(r2)
            java.util.Map r1 = r2.A00     // Catch:{ all -> 0x1b20 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x1b20 }
            monitor-exit(r2)
            java.util.Iterator r10 = r1.iterator()
        L_0x0a2c:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0a48
            java.lang.Object r2 = r10.next()
            X.A8q r2 = (X.C20130A8q) r2
            java.lang.String r1 = "br_merchant_onboarding"
            boolean r1 = r1.equalsIgnoreCase(r4)
            if (r1 == 0) goto L_0x0a81
            java.lang.String r1 = "account_set_up"
            boolean r1 = r1.equalsIgnoreCase(r7)
            if (r1 == 0) goto L_0x0a81
        L_0x0a48:
            java.util.LinkedHashMap r3 = X.C17880vN.A13()
            java.util.LinkedHashMap r0 = X.AnonymousClass6X4.A00(r0)
            if (r0 == 0) goto L_0x0a55
            r3.putAll(r0)
        L_0x0a55:
            X.1KB r1 = r5.A01
            r0 = 2131891797(0x7f121655, float:1.9418324E38)
            r1.A07(r6, r0)
            r3.put(r8, r7)
            X.1ek r0 = r5.A03
            java.lang.String r1 = r0.A01()
            if (r1 == 0) goto L_0x0a73
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0a73
            java.lang.String r0 = "device_id"
            r3.put(r0, r1)
        L_0x0a73:
            X.10I r2 = r5.A04
            r0 = 48
            X.AkY r1 = new X.AkY
            r1.<init>(r5, r3, r4, r0)
        L_0x0a7c:
            r2.CGF(r1)
            goto L_0x002b
        L_0x0a81:
            X.A8p r3 = r2.A00
            if (r3 == 0) goto L_0x0a2c
            X.9ba r2 = r3.A04
            boolean r1 = r2 instanceof X.AnonymousClass90N
            if (r1 == 0) goto L_0x0a2c
            X.90N r2 = (X.AnonymousClass90N) r2
            java.lang.String r1 = r2.A03
            X.B5m r2 = r3.A0A(r1)
            X.8BF r2 = (X.AnonymousClass8BF) r2
            if (r2 == 0) goto L_0x0a2c
            boolean r1 = r2.BAd(r9)
            if (r1 == 0) goto L_0x0a2c
            java.lang.String r0 = X.C18070vi.A0H(r0)
            r2.Bc9(r9, r0)
            goto L_0x002b
        L_0x0aa6:
            java.lang.String r4 = "extra_call_lobby_entry_point"
            r2 = -1
            int r4 = r1.getIntExtra(r4, r2)
            if (r4 == r2) goto L_0x0ad5
            r1 = 18
            if (r4 == r1) goto L_0x0abf
            r1 = 17
            if (r4 == r1) goto L_0x0abf
            r1 = 24
            if (r4 == r1) goto L_0x0abf
            r1 = 25
            if (r4 != r1) goto L_0x0ac7
        L_0x0abf:
            X.1VP r3 = r15.A0K
            r2 = 9
            r1 = 1
            r3.BiX(r14, r14, r2, r1)
        L_0x0ac7:
            X.1VP r2 = r15.A0K
            X.1vD r1 = r15.A0G
            r1.A03()
            X.1KB r1 = r15.A05
            X.C63982u1.A06(r0, r15, r1, r2, r4)
            goto L_0x002b
        L_0x0ad5:
            int r2 = r1.getIntExtra(r10, r3)
            r1 = 2
            if (r2 != r1) goto L_0x0adf
            r4 = 17
            goto L_0x0abf
        L_0x0adf:
            r1 = 3
            r4 = 14
            if (r2 != r1) goto L_0x0ac7
            r4 = 18
            goto L_0x0abf
        L_0x0ae7:
            r5 = 0
            X.11E r4 = r15.A07
            boolean r4 = r4.A09()
            if (r4 != 0) goto L_0x0af4
            java.lang.String r0 = "deep_link_catalog/no-connectivity"
            goto L_0x1b2d
        L_0x0af4:
            com.whatsapp.jid.PhoneUserJid r4 = X.C32981i4.A06(r0)
            if (r4 != 0) goto L_0x0aff
            r1 = 2131891438(0x7f1214ee, float:1.9417596E38)
            goto L_0x1412
        L_0x0aff:
            X.6RX r5 = X.AnonymousClass6RX.CATALOG
            r15.A0v(r0, r5, r4)
            java.lang.String r5 = "entry_point"
            java.lang.String r0 = r0.getQueryParameter(r5)
            boolean r13 = r2.equals(r0)
            if (r13 == 0) goto L_0x0b2f
            r3 = 18
            X.A8Q r1 = r15.A0I
            if (r7 == 0) goto L_0x0b2d
            java.lang.String r0 = "whatsapp"
        L_0x0b18:
            r1.A08(r3, r2, r0)
        L_0x0b1b:
            X.9tU r0 = r15.A0H
            X.Af0 r1 = r0.A02(r4)
            r12 = 1
            X.7Nk r0 = new X.7Nk
            r8 = r0
            r9 = r15
            r10 = r4
            r11 = r6
            r14 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)
            goto L_0x0ba9
        L_0x0b2d:
            r0 = 0
            goto L_0x0b18
        L_0x0b2f:
            int r2 = r1.getIntExtra(r10, r3)
            X.A8Q r1 = r15.A0I
            r0 = 6
            if (r2 != r3) goto L_0x0b3a
            r0 = 15
        L_0x0b3a:
            r1.A08(r0, r14, r14)
            goto L_0x0b1b
        L_0x0b3e:
            r5 = 0
            X.11E r1 = r15.A07
            boolean r1 = r1.A09()
            if (r1 != 0) goto L_0x0b4b
            java.lang.String r0 = "deep_link_product/no-connectivity"
            goto L_0x1b2d
        L_0x0b4b:
            java.lang.String r2 = "phoneNumber"
            java.lang.String r1 = "productID"
            java.lang.String r6 = r0.getQueryParameter(r2)
            java.lang.String r4 = r0.getQueryParameter(r1)
            java.util.List r3 = r0.getPathSegments()
            int r2 = r3.size()
            r1 = 3
            if (r2 != r1) goto L_0x0b74
            java.lang.String r1 = "wa.me"
            boolean r1 = X.C17890vO.A1U(r0, r1)
            if (r1 == 0) goto L_0x0b74
            r1 = 2
            java.lang.String r6 = X.C17880vN.A0w(r3, r1)
            r1 = 1
            java.lang.Object r4 = r3.get(r1)
        L_0x0b74:
            if (r6 != 0) goto L_0x0bad
            r1 = 0
        L_0x0b77:
            android.util.Pair r4 = X.C108945cZ.A0N(r4, r1)
            java.lang.Object r2 = r4.second
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            java.lang.Object r1 = r4.first
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0bb4
            if (r2 == 0) goto L_0x0bb4
            X.6RX r1 = X.AnonymousClass6RX.PRODUCT
            r15.A0v(r0, r1, r2)
            java.lang.Object r3 = r4.second
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.Object r2 = r4.first
            java.lang.String r2 = (java.lang.String) r2
            X.9tU r0 = r15.A0H
            X.Af0 r1 = r0.A02(r3)
            X.7Ng r0 = new X.7Ng
            r11 = r7
            r6 = r0
            r7 = r15
            r8 = r3
            r9 = r2
            r10 = r5
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x0ba9:
            r1.A09(r0)
            return
        L_0x0bad:
            X.1Dx r1 = com.whatsapp.jid.PhoneUserJid.Companion
            com.whatsapp.jid.PhoneUserJid r1 = r1.A03(r6)
            goto L_0x0b77
        L_0x0bb4:
            r1 = 2131891445(0x7f1214f5, float:1.941761E38)
            goto L_0x1412
        L_0x0bb9:
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 22
            if (r3 <= r2) goto L_0x0c20
            X.11S r2 = r15.A02
            r2.A0I()
            com.whatsapp.Me r2 = r2.A00
            if (r2 == 0) goto L_0x0bd0
            X.1CM r2 = r15.A07
            boolean r2 = r2.A04()
            if (r2 != 0) goto L_0x0c20
        L_0x0bd0:
            java.lang.String r5 = "forwarded_chat_link"
            java.lang.String r2 = r0.getQueryParameter(r5)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0c20
            android.content.Context r2 = r15.getApplicationContext()
            android.accounts.AccountManager r3 = android.accounts.AccountManager.get(r2)
            java.lang.String r2 = "com.whatsapp.w4b"
            android.accounts.Account[] r2 = r3.getAccountsByType(r2)
            int r2 = r2.length
            if (r2 <= 0) goto L_0x0c20
            r18 = 2131890518(0x7f121156, float:1.941573E38)
            r19 = 2131890517(0x7f121155, float:1.9415728E38)
            r20 = 2131890516(0x7f121154, float:1.9415726E38)
            java.lang.String r1 = "android.intent.action.VIEW"
            android.content.Intent r3 = X.C108945cZ.A0G(r1)
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = "1"
            android.net.Uri r0 = X.C17890vO.A0C(r1, r5, r0)
            r3.setData(r0)
            r21 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 0
            X.7Bk r2 = new X.7Bk
            r2.<init>(r3, r15, r0)
            r1 = 1
            X.7Bk r0 = new X.7Bk
            r0.<init>(r3, r15, r1)
            r17 = r0
            r16 = r2
            r15.A3x(r16, r17, r18, r19, r20, r21)
            return
        L_0x0c20:
            boolean r2 = r15.A0z()
            if (r2 == 0) goto L_0x0c2a
            java.lang.String r0 = "CTWA: DeepLinkActivity/onCreate/ User is not registered"
            goto L_0x15b9
        L_0x0c2a:
            X.6zq r3 = r15.A0s(r0, r7)
            X.4Xd r5 = r3.A00
            X.4Xd r2 = X.C87814Xd.A0e
            boolean r7 = r5.equals(r2)
            r2 = 0
            if (r7 == 0) goto L_0x0caf
            java.lang.String r2 = "CTWA: DeepLinkActivity/parseCtwaChatDeepLinkAndLaunchCtwaChatActivityIfPossible Not a CTWA deep link"
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x0c3e:
            X.6RX r2 = X.AnonymousClass6RX.CHAT
            r15.A0u(r0, r2)
        L_0x0c43:
            java.lang.String r5 = "qr_code_camera_source"
            r2 = 5
            int r7 = r1.getIntExtra(r5, r2)
            r8 = 1
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r1 = "com.whatsapp.contact.picker.ContactPicker"
            r3.setClassName(r2, r1)
            java.lang.String r1 = "uri"
            r3.putExtra(r1, r0)
            java.lang.String r1 = "source_surface"
            r3.putExtra(r1, r8)
            X.1i4 r1 = r15.A0X
            X.0ve r8 = r1.A01
            r2 = 9568(0x2560, float:1.3408E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r8, r2)
            if (r1 == 0) goto L_0x0c98
            java.lang.String r8 = r0.getQueryParameter(r4)
            java.lang.String r1 = "medium"
            java.lang.String r2 = r0.getQueryParameter(r1)
            java.lang.String r10 = "unknown"
            java.lang.String r9 = "unavailable"
            if (r8 == 0) goto L_0x0ca0
            X.1i4 r1 = r15.A0X
            r0 = 9708(0x25ec, float:1.3604E-41)
            boolean r0 = r1.A0M(r8, r0)
            if (r0 != 0) goto L_0x0c8b
            r8 = r10
        L_0x0c8b:
            if (r2 != 0) goto L_0x0ca3
            r2 = r9
        L_0x0c8e:
            java.lang.String r0 = "entry_point_conversion_external_source"
            r3.putExtra(r0, r8)
            java.lang.String r0 = "entry_point_conversion_external_medium"
            r3.putExtra(r0, r2)
        L_0x0c98:
            r3.putExtra(r4, r6)
            r3.putExtra(r5, r7)
            goto L_0x0e48
        L_0x0ca0:
            if (r2 == 0) goto L_0x0c98
            r8 = r9
        L_0x0ca3:
            X.1i4 r1 = r15.A0X
            r0 = 9707(0x25eb, float:1.3602E-41)
            boolean r0 = r1.A0M(r2, r0)
            if (r0 != 0) goto L_0x0c8e
            r2 = r10
            goto L_0x0c8e
        L_0x0caf:
            com.whatsapp.jid.UserJid r9 = r5.A04
            if (r9 == 0) goto L_0x0e25
            java.lang.String r8 = r3.A03
            if (r8 == 0) goto L_0x0e2a
            int r7 = r8.length()
            if (r7 == 0) goto L_0x0e2a
            java.lang.String r7 = r8.trim()
            java.lang.String r12 = android.telephony.PhoneNumberUtils.stripSeparators(r7)
            int r7 = r12.length()
            if (r7 <= 0) goto L_0x0cda
            char r7 = r12.charAt(r2)
            boolean r7 = java.lang.Character.isDigit(r7)
            if (r7 != 0) goto L_0x0cda
            r7 = 1
            java.lang.String r12 = r12.substring(r7)
        L_0x0cda:
            X.C18070vi.A0X(r12)
            java.lang.String r13 = r9.getRawString()
            X.C18070vi.A0d(r13, r2)
            r7 = 64
            int r11 = X.AnonymousClass1YF.A0C(r13, r7, r2, r2)
            r7 = 46
            int r10 = X.AnonymousClass1YF.A0C(r13, r7, r2, r2)
            r7 = 58
            int r9 = X.AnonymousClass1YF.A0C(r13, r7, r2, r2)
            r7 = -1
            if (r10 == r7) goto L_0x0cfd
            int r11 = java.lang.Math.min(r10, r11)
        L_0x0cfd:
            if (r9 == r7) goto L_0x0d03
            int r11 = java.lang.Math.min(r9, r11)
        L_0x0d03:
            java.lang.String r7 = X.C108955ca.A0q(r2, r11, r13)
            boolean r7 = r12.equals(r7)
            if (r7 == 0) goto L_0x0e2a
            X.00H r7 = r15.A0y
            java.lang.Object r7 = r7.get()
            X.6oQ r7 = (X.C133256oQ) r7
            X.6T2 r9 = r7.A00(r5)
            boolean r7 = r9 instanceof X.C116795yd
            if (r7 == 0) goto L_0x0e22
            X.5yd r9 = (X.C116795yd) r9
            com.whatsapp.jid.UserJid r1 = r9.A00
            boolean r7 = r9.A01
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r22 = r0 ^ 1
            X.4Rg r11 = r15.A0Y
            java.lang.String r0 = r3.A04
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            r6 = 1
            r10 = r9 ^ 1
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            r9 = r8 ^ 1
            java.lang.String r8 = r15.A1E
            r11.A01(r8, r10, r9)
            X.4Rg r9 = r15.A0Y
            X.1M9 r8 = r15.A0N
            boolean r8 = r8.A0z(r1)
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r8)
            java.lang.String r8 = r15.A1E
            android.content.Intent r10 = r15.getIntent()
            int r29 = r10.getIntExtra(r4, r6)
            X.1PM r4 = r15.A0O
            X.1yf r4 = r4.A02(r1)
            java.lang.Integer r25 = X.C1408473h.A02(r4)
            r28 = 2
            r23 = r9
            r26 = r14
            r27 = r8
            r23.A00(r24, r25, r26, r27, r28, r29)
            X.10I r9 = r15.A05
            r8 = 33
            X.3Ch r4 = new X.3Ch
            r4.<init>(r15, r1, r8)
            r9.CGF(r4)
            X.00H r4 = r15.A11
            java.lang.Object r4 = r4.get()
            X.6w5 r4 = (X.C137826w5) r4
            r20 = 1
            X.00H r4 = r4.A00
            X.1LU r14 = X.C108945cZ.A0h(r4)
            if (r0 != 0) goto L_0x0d89
            r6 = 0
        L_0x0d89:
            java.lang.String r4 = r5.A0D
            android.os.Bundle r16 = r5.A00()
            r19 = r2
            r21 = r6
            r17 = r1
            r18 = r4
            android.content.Intent r4 = r14.A1s(r15, r16, r17, r18, r19, r20, r21, r22)
            if (r0 == 0) goto L_0x0da2
            java.lang.String r5 = "share_msg"
            r4.putExtra(r5, r0)
        L_0x0da2:
            boolean r0 = X.C42701yb.A01(r1)
            if (r0 == 0) goto L_0x0dcc
            if (r1 == 0) goto L_0x0dcc
            X.00H r0 = r15.A0p
            java.lang.Object r0 = r0.get()
            X.1Pl r0 = (X.C25741Pl) r0
            X.24e r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0dcc
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x0dcc
            java.lang.String r5 = "DEEPLINK"
            java.lang.String r0 = "bot_metrics_entrypoint"
            r4.putExtra(r0, r5)
            java.lang.String r5 = X.C17890vO.A0Q()
            java.lang.String r0 = "bot_metrics_destination_id"
            r4.putExtra(r0, r5)
        L_0x0dcc:
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r15)
            X.7Ea r8 = new X.7Ea
            r8.<init>(r15, r0)
            X.00H r0 = r15.A19
            X.1OZ r6 = X.C17880vN.A0U(r0)
            X.31f r0 = r15.A0P
            X.9BS r5 = new X.9BS
            r5.<init>(r0, r8, r1, r6)
            X.10I r0 = r15.A05
            X.AnonymousClass3MW.A1T(r5, r0, r2)
            X.00H r0 = r15.A11
            r0.get()
            java.lang.String r5 = r3.A02
            java.lang.String r2 = r3.A01
            X.0ve r0 = r15.A0E
            X.C137826w5.A00(r4, r0, r5, r2)
            java.lang.String r2 = "extra_deep_link_session_id"
            java.lang.String r0 = r15.A1E
            r4.putExtra(r2, r0)
            java.lang.String r2 = "DeepLinkActivity"
            X.11P r0 = r15.A05
            X.C60442o2.A00(r4, r0, r2)
            if (r7 == 0) goto L_0x0e31
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureActivity"
            r3.setClassName(r2, r0)
            java.lang.String r0 = "extra_next_intent"
            r3.putExtra(r0, r4)
            java.lang.String r0 = "jid"
            X.AnonymousClass3MY.A12(r3, r1, r0)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r3.addFlags(r0)
            goto L_0x0e48
        L_0x0e22:
            java.lang.String r2 = "CTWA: DeepLinkActivity/parseCtwaChatDeepLinkAndLaunchCtwaChatActivityIfPossible getCtwaActivityParametersAndPersistData failed"
            goto L_0x0e2c
        L_0x0e25:
            java.lang.String r2 = "CTWA: DeepLinkActivity/doesCtwaJidMatchPhoneNumber/ JID parameter for DEEP_LINK_CHAT has invalid format"
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x0e2a:
            java.lang.String r2 = "CTWA: DeepLinkActivity/parseCtwaChatDeepLinkAndLaunchCtwaChatActivityIfPossible JID parameter for DEEP_LINK_CHAT does not match phone number"
        L_0x0e2c:
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x0c3e
        L_0x0e31:
            r15.startActivity(r4)
            goto L_0x002b
        L_0x0e36:
            java.lang.String r1 = r0.getLastPathSegment()
            android.content.Intent r3 = X.C114945sf.A03(r15)
            java.lang.String r0 = "tpp_account_link"
            r3.putExtra(r8, r0)
            java.lang.String r0 = "access_code"
            r3.putExtra(r0, r1)
        L_0x0e48:
            r15.startActivity(r3)
            goto L_0x002b
        L_0x0e4d:
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsChat"
            r1.setClassName(r2, r0)
            r1.putExtra(r4, r3)
            goto L_0x1806
        L_0x0e5f:
            X.1i4 r1 = r15.A0X
            X.1QN r1 = r1.A03
            boolean r1 = r1.A03()
            if (r1 == 0) goto L_0x127f
        L_0x0e69:
            X.1QS r1 = r15.A0g
            X.BD1 r1 = r1.A06()
            java.lang.Class r4 = r1.BWu()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r15, r4)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "PAY: DeepLinkActivity: "
            X.C17900vP.A0Y(r4, r2, r3)
            java.lang.String r2 = "actual_deep_link"
            java.lang.String r0 = r0.toString()
            r1.putExtra(r2, r0)
            java.lang.String r0 = "referral_screen"
            r1.putExtra(r0, r9)
            goto L_0x1806
        L_0x0e91:
            X.1i4 r1 = r15.A0X
            java.lang.String r2 = r1.A0F(r0)
            X.BDQ r1 = r3.BWY()
            if (r1 == 0) goto L_0x1b92
            boolean r1 = r1.BJA(r2)
            if (r1 == 0) goto L_0x1b92
            X.1i4 r1 = r15.A0X
            X.1QN r3 = r1.A03
            X.1QJ r1 = r3.A04
            boolean r1 = r1.A03()
            if (r1 == 0) goto L_0x0eb9
            X.18O r2 = r3.A00
            X.18R r1 = X.AnonymousClass18O.A0U
            boolean r1 = r2.A09(r1)
            if (r1 != 0) goto L_0x0ec6
        L_0x0eb9:
            X.0ve r3 = r3.A02
            r2 = 1439(0x59f, float:2.016E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            r3 = 0
            if (r1 == 0) goto L_0x0ec7
        L_0x0ec6:
            r3 = 1
        L_0x0ec7:
            X.1QS r1 = r15.A0g
            X.BD1 r2 = r1.A06()
            if (r3 != 0) goto L_0x0ed6
            r1 = 1
            android.content.Intent r1 = r2.BQO(r15, r0, r1)
            goto L_0x1806
        L_0x0ed6:
            android.content.Intent r1 = r2.BQP(r15, r0)
            goto L_0x1806
        L_0x0edc:
            r3 = 1
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.lists.home.ListsHomeActivity"
            r1.setClassName(r2, r0)
            java.lang.String r0 = "LAUNCH_FROM_DEEPLINK"
            r1.putExtra(r0, r3)
            goto L_0x1806
        L_0x0ef1:
            android.content.Intent r1 = X.AnonymousClass1LU.A0a(r15, r14)
            goto L_0x1806
        L_0x0ef7:
            java.lang.String r1 = "phone"
            java.lang.String r1 = r0.getQueryParameter(r1)
            if (r1 == 0) goto L_0x002b
            X.1Dx r0 = com.whatsapp.jid.PhoneUserJid.Companion
            com.whatsapp.jid.PhoneUserJid r3 = r0.A03(r1)
            if (r3 == 0) goto L_0x002b
            r0 = 19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r0 = 1
            android.content.Intent r1 = X.AnonymousClass1LU.A1D(r15, r3, r2, r0, r1)
            goto L_0x1806
        L_0x0f15:
            X.0ve r3 = r15.A0E
            android.content.Context r2 = r15.getApplicationContext()
            X.1DC r1 = r15.A04
            boolean r1 = X.C124216Xm.A00(r2, r3, r1)
            if (r1 == 0) goto L_0x002b
            android.content.Context r2 = r15.getApplicationContext()
            r6 = 1
            r5 = 0
            r4 = 2
            android.content.Intent r1 = X.AnonymousClass3MZ.A07(r2, r5)
            java.lang.String r3 = r2.getPackageName()
            java.lang.String r2 = "com.whatsapp.thunderstorm.ThunderstormQrCodeActivity"
            r1.setClassName(r3, r2)
            java.lang.String r2 = "is_donor"
            r1.putExtra(r2, r6)
            java.lang.String r2 = "transfer_data_type"
            r1.putExtra(r2, r6)
            java.lang.String r2 = "platform_type"
            r1.putExtra(r2, r5)
            java.lang.String r2 = "entrypoint"
            r1.putExtra(r2, r4)
            java.lang.String r3 = "uri"
            java.lang.String r2 = r0.toString()
            r1.putExtra(r3, r2)
            java.lang.String r2 = "platform"
            java.lang.String r2 = r0.getQueryParameter(r2)
            java.lang.String r0 = "scanned_platform"
            r1.putExtra(r0, r2)
            goto L_0x1806
        L_0x0f61:
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.securitycheckup.SettingsSecurityCheckupActivity"
            r1.setClassName(r2, r0)
            goto L_0x1806
        L_0x0f70:
            android.content.Intent r1 = X.AnonymousClass1LU.A0A(r15)
            goto L_0x1806
        L_0x0f76:
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsPasskeys"
            r1.setClassName(r2, r0)
            java.lang.String r0 = "passkey_creation_source"
            r1.putExtra(r0, r3)
            goto L_0x1806
        L_0x0f8a:
            X.0ve r1 = r15.A0E
            r0 = 7633(0x1dd1, float:1.0696E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x002b
            X.1dX r0 = r15.A0M
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0fb3
            java.lang.String r0 = "com.whatsapp.contact.picker.ContactPicker"
            r2 = 1
            android.content.Intent r1 = X.C72483Me.A0B(r15, r0, r2)
            java.lang.String r0 = "start_chat"
            android.content.Intent r1 = r1.putExtra(r0, r2)
            java.lang.String r0 = "show_new_chat_and_community"
            android.content.Intent r1 = r1.putExtra(r0, r2)
            goto L_0x1806
        L_0x0fb3:
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = "android.permission.GET_ACCOUNTS"
            r2[r1] = r0
            r1 = 1
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            r2[r1] = r0
            r1 = 2
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            r2[r1] = r0
            X.0ve r1 = r15.A0E
            r0 = 8990(0x231e, float:1.2598E-41)
            boolean r4 = X.C18020vd.A05(r3, r1, r0)
            X.0z4 r0 = r15.A0A
            boolean r0 = X.AnonymousClass74O.A0S(r0, r2)
            if (r0 != 0) goto L_0x100b
            boolean r0 = X.AnonymousClass74O.A0N(r15, r2)
            if (r0 != 0) goto L_0x100b
            if (r4 != 0) goto L_0x1006
            r4 = 0
            r3 = 2131891925(0x7f1216d5, float:1.9418584E38)
            r0 = 2131894327(0x7f122037, float:1.9423456E38)
            r2 = 1
            android.content.Intent r1 = X.AnonymousClass74O.A02(r15, r0, r0, r4)
            java.lang.String r0 = "title_id"
            android.content.Intent r1 = r1.putExtra(r0, r3)
            java.lang.String r0 = "hide_permissions_rationale"
            android.content.Intent r1 = r1.putExtra(r0, r4)
            java.lang.String r0 = "entry_point"
            android.content.Intent r1 = r1.putExtra(r0, r2)
            java.lang.String r0 = "permission_value_for_logging"
            android.content.Intent r1 = r1.putExtra(r0, r2)
            X.C18070vi.A0X(r1)
            goto L_0x1806
        L_0x1006:
            X.AnonymousClass4aU.A05(r15)
            goto L_0x002b
        L_0x100b:
            r3 = 2131891925(0x7f1216d5, float:1.9418584E38)
            r1 = 2131894327(0x7f122037, float:1.9423456E38)
            r2 = 1
            r0 = 0
            android.content.Intent r1 = X.AnonymousClass74O.A02(r15, r1, r1, r0)
            java.lang.String r0 = "title_id"
            android.content.Intent r1 = r1.putExtra(r0, r3)
            java.lang.String r0 = "hide_permissions_rationale"
            android.content.Intent r1 = r1.putExtra(r0, r4)
            java.lang.String r0 = "entry_point"
            android.content.Intent r1 = r1.putExtra(r0, r2)
            java.lang.String r0 = "permission_value_for_logging"
            android.content.Intent r1 = r1.putExtra(r0, r2)
            X.C18070vi.A0X(r1)
            goto L_0x1806
        L_0x1034:
            r4 = 31
            r3 = 1
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "invite_source"
            r1.putExtra(r0, r4)
            java.lang.String r0 = "hide_share_link"
            r1.putExtra(r0, r3)
            goto L_0x1806
        L_0x1051:
            java.lang.String r0 = r0.getQueryParameter(r4)
            boolean r1 = r13.equals(r0)
            r0 = 3
            if (r1 == 0) goto L_0x105d
            r0 = 4
        L_0x105d:
            android.content.Intent r1 = X.AnonymousClass1LU.A1V(r15, r14, r14, r0)
            goto L_0x1806
        L_0x1063:
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.psa.view.GroupCallPsaActivity"
            r1.setClassName(r2, r0)
            goto L_0x1806
        L_0x1072:
            java.lang.String r17 = X.C32981i4.A08(r0)
            X.0z4 r0 = r15.A0A
            java.lang.String r16 = r0.A0o()
            X.C17960vV.A07(r16)
            java.lang.String r18 = X.C17890vO.A0Q()
            r19 = 2
            r20 = r3
            android.content.Intent r1 = X.AnonymousClass1LU.A1d(r15, r16, r17, r18, r19, r20)
            goto L_0x1806
        L_0x108d:
            X.00H r0 = r15.A0l
            java.lang.Object r1 = r0.get()
            X.6oZ r1 = (X.C133326oZ) r1
            java.lang.String r0 = "privacy_profile_photo"
            android.content.Intent r1 = r1.A01(r15, r0)
            goto L_0x1806
        L_0x109d:
            X.00H r0 = r15.A0l
            java.lang.Object r1 = r0.get()
            X.6oZ r1 = (X.C133326oZ) r1
            java.lang.String r0 = "privacy_groupadd"
            android.content.Intent r1 = r1.A01(r15, r0)
            goto L_0x1806
        L_0x10ad:
            java.lang.String r0 = r0.getQueryParameter(r4)
            boolean r0 = r13.equals(r0)
            r2 = 9
            if (r0 == 0) goto L_0x10bb
            r2 = 10
        L_0x10bb:
            X.18K r1 = r15.A0Z
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            java.lang.String r0 = X.C83974Hj.A00(r1, r2)
            android.content.Intent r1 = X.AnonymousClass1LU.A1U(r15, r0, r14, r2)
            goto L_0x1806
        L_0x10cb:
            java.lang.String r0 = X.C17890vO.A0Q()
            android.content.Intent r1 = X.AnonymousClass1LU.A1O(r15, r0, r3)
            goto L_0x1806
        L_0x10d5:
            X.11S r0 = r15.A02
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass11S.A00(r0)
            if (r1 == 0) goto L_0x002b
            X.1LU r0 = r15.A0b
            android.content.Intent r1 = X.AnonymousClass3MY.A06(r15, r0, r1)
            goto L_0x1806
        L_0x10e5:
            r1 = 7
            r0 = 0
            android.content.Intent r1 = X.AnonymousClass1LU.A0I(r15, r1, r0)
            goto L_0x1806
        L_0x10ed:
            r0 = 0
            android.content.Intent r1 = X.AnonymousClass1LU.A1m(r15, r0)
            goto L_0x1806
        L_0x10f4:
            java.lang.String r8 = "event_id"
            java.lang.String r7 = r0.getQueryParameter(r8)
            java.lang.String r6 = "event_name"
            java.lang.String r5 = r0.getQueryParameter(r6)
            java.lang.String r4 = "source_surface"
            java.lang.String r3 = r0.getQueryParameter(r4)
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity"
            r1.setClassName(r2, r0)
            r1.putExtra(r8, r7)
            r1.putExtra(r6, r5)
            r1.putExtra(r4, r3)
            goto L_0x1806
        L_0x111e:
            X.0ve r3 = r15.A0E
            X.0vf r2 = X.C18040vf.A01
            r1 = 3641(0xe39, float:5.102E-42)
            boolean r1 = X.C18020vd.A05(r2, r3, r1)
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = "host"
            java.lang.String r7 = r0.getQueryParameter(r1)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "PROXY: DeepLinkActivity Hostname: "
            X.C17900vP.A0f(r1, r7, r2)
            java.lang.String r1 = "chatPort"
            java.lang.String r3 = r0.getQueryParameter(r1)
            java.lang.String r1 = "mediaPort"
            java.lang.String r2 = r0.getQueryParameter(r1)
            r1 = 443(0x1bb, float:6.21E-43)
            int r5 = X.C20099A7c.A01(r3, r1)
            r1 = 587(0x24b, float:8.23E-43)
            int r3 = X.C20099A7c.A01(r2, r1)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "PROXY: DeepLinkActivity Chat port: "
            X.C17900vP.A0j(r1, r2, r5)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "PROXY: DeepLinkActivity Media port: "
            X.C17900vP.A0j(r1, r2, r3)
            java.lang.String r1 = "chatTLS"
            java.lang.String r1 = r0.getQueryParameter(r1)
            if (r1 == 0) goto L_0x117c
            java.lang.String r0 = "true"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x117c
            java.lang.String r0 = "1"
            boolean r0 = r1.equals(r0)
            r2 = 0
            if (r0 == 0) goto L_0x117d
        L_0x117c:
            r2 = 1
        L_0x117d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PROXY: DeepLinkActivity Chat use TLS: "
            X.C17900vP.A0n(r0, r1, r2)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsSetupUserProxyActivity"
            r1.setClassName(r2, r0)
            java.lang.String r0 = "intent_host_name"
            r1.putExtra(r0, r7)
            java.lang.String r0 = "intent_chat_port"
            r1.putExtra(r0, r6)
            java.lang.String r0 = "intent_media_port"
            r1.putExtra(r0, r5)
            java.lang.String r0 = "intent_use_tls"
            r1.putExtra(r0, r3)
            r1.putExtra(r4, r9)
            goto L_0x1806
        L_0x11b8:
            X.00H r0 = r15.A0l
            java.lang.Object r1 = r0.get()
            X.6oZ r1 = (X.C133326oZ) r1
            java.lang.String r0 = "privacy_checkup"
            android.content.Intent r1 = r1.A01(r15, r0)
            goto L_0x1806
        L_0x11c8:
            X.0ve r2 = r15.A0E
            r1 = 7634(0x1dd2, float:1.0698E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x002b
            r3 = 1
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.ProfileInfoActivity"
            r1.setClassName(r2, r0)
            java.lang.String r0 = "is_deep_link"
            r1.putExtra(r0, r3)
            goto L_0x1806
        L_0x11e9:
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.companiondevice.LinkedDevicesActivity"
            r1.setClassName(r2, r0)
            goto L_0x1806
        L_0x11f8:
            X.1XN r0 = r15.A0c
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x1bbc
            X.1og r0 = r15.A0d
            X.00H r0 = r0.A00
            java.util.Iterator r3 = X.C17890vO.A0h(r0)
        L_0x1208:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1224
            java.lang.Object r2 = r3.next()
            X.AM5 r2 = (X.AM5) r2
            X.8sH r1 = new X.8sH
            r1.<init>()
            r0 = 2
            X.AM5.A01(r2, r0)
            X.AM5.A00(r2)
            X.AM5.A02(r2, r1)
            goto L_0x1208
        L_0x1224:
            X.00H r0 = r15.A0l
            r0.get()
            android.content.Intent r1 = X.C108995ce.A0C(r15)
            goto L_0x1806
        L_0x122f:
            X.1QS r0 = r15.A0g
            X.BD1 r0 = r0.A06()
            java.lang.String r2 = r0.BQ9()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x002b
            r0 = 0
            android.content.Intent r1 = X.AnonymousClass1LU.A0C(r15, r0)
            java.lang.String r8 = "jid"
            goto L_0x138f
        L_0x1248:
            java.lang.String r2 = r0.getLastPathSegment()
            if (r2 == 0) goto L_0x127f
            java.lang.String r1 = "20210210"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x127f
            java.lang.String r4 = "page"
            java.lang.String r0 = r0.getQueryParameter(r4)
            if (r0 != 0) goto L_0x1271
            r3 = 0
        L_0x125f:
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.greenalert.GreenAlertActivity"
            r1.setClassName(r2, r0)
            r1.putExtra(r4, r3)
            goto L_0x1806
        L_0x1271:
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x127d }
            r0 = 2
            if (r1 > r0) goto L_0x127d
            r0 = 1
            int r3 = r1 - r0
            if (r1 >= r0) goto L_0x125f
        L_0x127d:
            r3 = 0
            goto L_0x125f
        L_0x127f:
            r15.BtF()
            goto L_0x002b
        L_0x1284:
            java.lang.String r3 = "archived_chats"
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsChat"
            r1.setClassName(r2, r0)
            java.lang.String r0 = "scroll_to_setting"
            r1.putExtra(r0, r3)
            goto L_0x1806
        L_0x129a:
            X.00H r0 = r15.A13
            java.lang.Object r0 = r0.get()
            X.2ij r0 = (X.C57222ij) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x002b
            r0 = 5
            android.content.Intent r1 = X.C17880vN.A0A()
            X.AnonymousClass1LU.A1q(r15, r1, r0)
            goto L_0x1806
        L_0x12b2:
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsChatHistory"
            r1.setClassName(r2, r0)
            goto L_0x1806
        L_0x12c1:
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.report.ReportActivity"
            r1.setClassName(r2, r0)
            goto L_0x1806
        L_0x12d0:
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.account.delete.DeleteAccountActivity"
            r1.setClassName(r2, r0)
            goto L_0x1806
        L_0x12df:
            r4 = 0
            X.1QO r1 = r15.A0f
            X.0ve r2 = r1.A02
            r1 = 10896(0x2a90, float:1.5269E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r3, r2, r1)
            if (r1 != 0) goto L_0x133c
            X.1QO r1 = r15.A0f
            X.0ve r2 = r1.A02
            r1 = 10894(0x2a8e, float:1.5266E-41)
            boolean r1 = X.C18020vd.A05(r3, r2, r1)
            if (r1 != 0) goto L_0x133c
            X.1QS r1 = r15.A0g
            X.BD1 r1 = r1.A06()
            java.lang.Class r3 = r1.BWy()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "PAY: DeepLinkActivity handle DEEP_LINK_PAYMENT_VIRALITY "
            X.C17900vP.A0Y(r3, r1, r2)
            if (r3 == 0) goto L_0x1322
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r15, r3)
            r1.setData(r0)
            r15.startActivity(r1)
            r0 = 2130771987(0x7f010013, float:1.714708E38)
            r15.overridePendingTransition(r0, r4)
            goto L_0x002b
        L_0x1322:
            android.content.Intent r1 = X.C17880vN.A0A()
            r1.setData(r0)
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.payments.ui.ViralityLinkVerifierActivity"
            r1.setClassName(r2, r0)
            goto L_0x1806
        L_0x1334:
            X.1QO r1 = r15.A0f
            boolean r1 = r1.A0A()
            if (r1 != 0) goto L_0x1340
        L_0x133c:
            X.C108965cb.A0y(r15)
            return
        L_0x1340:
            java.lang.String r2 = "com.whatsapp.w4b"
            android.content.pm.PackageInfo r1 = X.C24211Jh.A02(r15, r2)
            if (r1 == 0) goto L_0x135b
            android.content.Intent r1 = X.AnonymousClass3MY.A07(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r0)
            r1.setPackage(r2)
        L_0x1354:
            X.1L9 r0 = r15.A01
            r0.A08(r15, r1)
            goto L_0x002b
        L_0x135b:
            X.9jn r1 = r15.A0k
            java.lang.String r0 = "smb_linking_back2wa"
            android.content.Intent r1 = r1.A00(r0)
            X.1L9 r0 = r15.A01
            r0.A08(r15, r1)
        L_0x1368:
            X.C108965cb.A0y(r15)
            goto L_0x002b
        L_0x136d:
            android.content.Intent r1 = X.C114945sf.A03(r15)
            java.lang.String r2 = "reset_password"
            goto L_0x138f
        L_0x1374:
            android.content.Intent r1 = X.C114945sf.A03(r15)
            java.lang.String r2 = "withdraw"
            goto L_0x138f
        L_0x137b:
            android.content.Intent r1 = X.C114945sf.A03(r15)
            java.lang.String r2 = "add_new_bank_account"
            goto L_0x138f
        L_0x1382:
            android.content.Intent r1 = X.C114945sf.A03(r15)
            java.lang.String r2 = "add_new_debit_card"
            goto L_0x138f
        L_0x1389:
            android.content.Intent r1 = X.C114945sf.A03(r15)
            java.lang.String r2 = "hub"
        L_0x138f:
            r1.putExtra(r8, r2)
            goto L_0x1806
        L_0x1394:
            boolean r1 = r15.A0z()
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = "id"
            java.lang.String r3 = r0.getQueryParameter(r1)
            if (r3 != 0) goto L_0x13b9
            java.lang.String r1 = "wa.me"
            boolean r1 = X.C17890vO.A1U(r0, r1)
            if (r1 == 0) goto L_0x13b9
            java.util.List r1 = r0.getPathSegments()
            int r2 = r1.size()
            r1 = 2
            if (r2 != r1) goto L_0x13b9
            java.lang.String r3 = r0.getLastPathSegment()
        L_0x13b9:
            X.6RG r1 = X.AnonymousClass6RG.DEEPLINK
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            android.content.Intent r1 = X.AnonymousClass1LU.A0W(r15, r1, r3, r14)
            goto L_0x1806
        L_0x13c5:
            r5 = 0
            java.lang.String r6 = r0.getScheme()
            java.lang.String r2 = "wa.me"
            boolean r2 = X.C17890vO.A1U(r0, r2)
            if (r2 != 0) goto L_0x141e
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L_0x141c
            java.lang.String r2 = "whatsapp"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x13e8
            java.lang.String r2 = "whatsapp-consumer"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x141c
        L_0x13e8:
            java.lang.String r2 = "send"
            boolean r2 = X.C17890vO.A1U(r0, r2)
            if (r2 != 0) goto L_0x141e
            java.lang.String r2 = "message"
            boolean r2 = X.C17890vO.A1U(r0, r2)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            if (r2 == 0) goto L_0x1419
            java.lang.String r2 = "https://wa.me/message/"
        L_0x13fe:
            r6.append(r2)
            java.lang.String r2 = r0.getLastPathSegment()
            java.lang.String r6 = X.AnonymousClass000.A0y(r2, r6)
        L_0x1409:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L_0x1423
            r1 = 2131891439(0x7f1214ef, float:1.9417598E38)
        L_0x1412:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r15.BhU(r0, r1, r5)
            goto L_0x002b
        L_0x1419:
            java.lang.String r2 = "https://wa.me/qr/"
            goto L_0x13fe
        L_0x141c:
            r6 = 0
            goto L_0x1409
        L_0x141e:
            java.lang.String r6 = r0.toString()
            goto L_0x1409
        L_0x1423:
            r2 = 10
            if (r11 != r2) goto L_0x1429
            java.lang.String r14 = r15.A1E
        L_0x1429:
            int r3 = r1.getIntExtra(r10, r3)
            android.content.Intent r8 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r1 = "com.whatsapp.qrcode.contactqr.QrSheetDeepLinkActivity"
            android.content.Intent r1 = r8.setClassName(r2, r1)
            java.lang.String r2 = "qrcode"
            r1.putExtra(r2, r6)
            java.lang.String r2 = "from_internal_deep_link_click"
            r1.putExtra(r2, r7)
            java.lang.String r9 = "extra_deep_link_session_id"
            r1.putExtra(r9, r14)
            r1.putExtra(r10, r3)
            X.0ve r3 = r15.A0E
            r2 = 8884(0x22b4, float:1.2449E-41)
            X.0vf r6 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r6, r3, r2)
            if (r2 == 0) goto L_0x146c
            X.6zq r10 = r15.A0s(r0, r7)
            X.4Xd r3 = r10.A00
            X.4Xd r2 = X.C87814Xd.A0e
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x14e9
            java.lang.String r2 = "DeepLinkActivity/parseCtwaDeepLinkIfPresentAndAddToState no CTWA state in deeplink"
        L_0x1469:
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x146c:
            r2 = 3
            if (r11 != r2) goto L_0x14e6
            X.6RX r7 = X.AnonymousClass6RX.CONTACT_QR_CODE
        L_0x1471:
            X.0ve r3 = r15.A0E
            X.C18070vi.A0d(r3, r5)
            r2 = 11655(0x2d87, float:1.6332E-41)
            boolean r2 = X.C18020vd.A05(r6, r3, r2)
            if (r2 == 0) goto L_0x1806
            X.00H r2 = r15.A15
            java.lang.Object r2 = r2.get()
            X.6od r2 = (X.C133366od) r2
            java.lang.String r9 = r2.A00(r0)
            X.00H r2 = r15.A15
            java.lang.Object r2 = r2.get()
            X.6od r2 = (X.C133366od) r2
            java.lang.String r11 = r2.A01(r0)
            android.content.Intent r2 = r15.getIntent()
            r0 = 1
            int r0 = r2.getIntExtra(r4, r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.String r10 = r15.A0t()
            X.6t4 r6 = new X.6t4
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.String r3 = "external_entry_point_data"
            org.json.JSONObject r5 = X.C17880vN.A15()
            X.6RX r0 = r6.A00
            if (r0 == 0) goto L_0x14e4
            int r0 = r0.value
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x14bc:
            java.lang.String r0 = "type"
            r5.put(r0, r2)
            java.lang.String r2 = "token"
            java.lang.String r0 = r6.A04
            r5.put(r2, r0)
            java.lang.Integer r0 = r6.A01
            r5.put(r4, r0)
            java.lang.String r2 = "referer"
            java.lang.String r0 = r6.A02
            r5.put(r2, r0)
            java.lang.String r2 = "text_hash"
            java.lang.String r0 = r6.A03
            r5.put(r2, r0)
            java.lang.String r0 = X.C18070vi.A0H(r5)
            r1.putExtra(r3, r0)
            goto L_0x1806
        L_0x14e4:
            r2 = 0
            goto L_0x14bc
        L_0x14e6:
            X.6RX r7 = X.AnonymousClass6RX.MESSAGE_QR_CODE
            goto L_0x1471
        L_0x14e9:
            X.00H r2 = r15.A0y
            java.lang.Object r2 = r2.get()
            X.6oQ r2 = (X.C133256oQ) r2
            X.6T2 r8 = r2.A00(r3)
            boolean r2 = r8 instanceof X.C116795yd
            if (r2 == 0) goto L_0x1538
            X.5yd r8 = (X.C116795yd) r8
            android.os.Bundle r3 = r3.A00()
            java.lang.String r2 = "ctwa_deeplink_content"
            r1.putExtra(r2, r3)
            X.00H r2 = r15.A11
            r2.get()
            java.lang.String r7 = r10.A02
            java.lang.String r3 = r10.A01
            X.0ve r2 = r15.A0E
            X.C137826w5.A00(r1, r2, r7, r3)
            java.lang.String r2 = r15.A1E
            r1.putExtra(r9, r2)
            java.lang.String r3 = "DeepLinkActivity"
            X.11P r2 = r15.A05
            X.C60442o2.A00(r1, r2, r3)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "CTWA: DeepLinkActivity/parseCtwaDeepLinkIfPresentAndAddToState show blocking disclosure: "
            r3.append(r2)
            boolean r2 = r8.A01
            X.C17900vP.A0r(r3, r2)
            if (r2 == 0) goto L_0x1534
            java.lang.String r3 = "ctwa_show_blocking_disclosure"
            r2 = 1
            r1.putExtra(r3, r2)
        L_0x1534:
            java.lang.String r2 = "CTWA: DeepLinkActivity/parseCtwaDeepLinkIfPresentAndAddToState getCtwaActivityParametersAndPersistData succeeded"
            goto L_0x1469
        L_0x1538:
            java.lang.String r2 = "CTWA: DeepLinkActivity/parseCtwaDeepLinkIfPresentAndAddToState getCtwaActivityParametersAndPersistData failed"
            com.whatsapp.util.Log.w((java.lang.String) r2)
            goto L_0x146c
        L_0x153f:
            java.lang.String r2 = "text"
            java.lang.String r3 = r0.getQueryParameter(r2)
            java.lang.String r2 = "ar"
            java.lang.String r6 = r0.getQueryParameter(r2)
            java.lang.String r2 = "photo"
            java.lang.String r2 = r0.getQueryParameter(r2)
            boolean r9 = X.AnonymousClass000.A1W(r2)
            java.lang.String r4 = "android.intent.extra.STREAM"
            android.os.Parcelable r2 = r1.getParcelableExtra(r4)
            android.net.Uri r2 = (android.net.Uri) r2
            if (r6 == 0) goto L_0x159a
            java.lang.String r5 = ","
            java.lang.String[] r5 = r6.split(r5)
            if (r5 == 0) goto L_0x159a
            int r7 = r5.length
            if (r7 <= 0) goto L_0x159a
            r5 = 7
            if (r7 >= r5) goto L_0x159a
            X.0ve r8 = r15.A0E
            r7 = 12098(0x2f42, float:1.6953E-41)
            X.0vf r5 = X.C18040vf.A02
            boolean r5 = X.C18020vd.A05(r5, r8, r7)
            if (r5 == 0) goto L_0x159a
            X.1cg r0 = X.C29671cg.A00
            java.lang.String r5 = r0.getRawString()
            r9 = 68
            r7 = 8
            r10 = 0
            r8 = 16
            r3 = r15
            r4 = r14
            android.content.Intent r3 = X.AnonymousClass1LU.A1I(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x158c:
            X.1KB r2 = r15.A05
            r1 = 31
            X.3Ch r0 = new X.3Ch
            r0.<init>(r15, r3, r1)
            r2.A0J(r0)
            goto L_0x002b
        L_0x159a:
            X.00H r5 = r15.A1B
            r5.get()
            java.lang.String r6 = "SHARE_STORY_TO_STATUS"
            java.util.Set r5 = X.A72.A02
            java.lang.String r7 = "share_type"
            java.lang.String r5 = r1.getStringExtra(r7)
            boolean r5 = X.C18070vi.A18(r5, r6)
            if (r5 == 0) goto L_0x15bd
            if (r3 == 0) goto L_0x15bd
            boolean r0 = r15.A0z()
            if (r0 == 0) goto L_0x15d9
            java.lang.String r0 = "CTWA: DeepLinkActivity/onCreate/SHARE_STORY_TO_STATUS User is not registered"
        L_0x15b9:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x15bd:
            X.00H r5 = r15.A1B
            r5.get()
            java.lang.String r6 = "SHARE_TO_STATUS"
            java.lang.String r5 = r1.getStringExtra(r7)
            boolean r5 = X.C18070vi.A18(r5, r6)
            if (r5 == 0) goto L_0x1744
            if (r3 == 0) goto L_0x1744
            boolean r0 = r15.A0z()
            if (r0 == 0) goto L_0x15fe
            java.lang.String r0 = "CTWA: DeepLinkActivity/onCreate/SHARE_TO_STATUS User is not registered"
            goto L_0x15b9
        L_0x15d9:
            X.00H r0 = r15.A1B
            java.lang.Object r5 = r0.get()
            X.A72 r5 = (X.A72) r5
            boolean r0 = X.A72.A02(r15, r1, r5)
            if (r0 == 0) goto L_0x173e
            java.lang.String r0 = r1.getStringExtra(r7)
            boolean r0 = X.C18070vi.A18(r0, r6)
            if (r0 == 0) goto L_0x173e
            X.0ve r6 = r5.A00
            r5 = 11696(0x2db0, float:1.639E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r5)
            if (r0 == 0) goto L_0x173e
            goto L_0x1622
        L_0x15fe:
            X.00H r0 = r15.A1B
            java.lang.Object r5 = r0.get()
            X.A72 r5 = (X.A72) r5
            boolean r0 = X.A72.A02(r15, r1, r5)
            if (r0 == 0) goto L_0x173e
            java.lang.String r0 = r1.getStringExtra(r7)
            boolean r0 = X.C18070vi.A18(r0, r6)
            if (r0 == 0) goto L_0x173e
            X.0ve r6 = r5.A00
            r5 = 12160(0x2f80, float:1.704E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r5)
            if (r0 == 0) goto L_0x173e
        L_0x1622:
            X.00H r0 = r15.A1B
            java.lang.Object r5 = r0.get()
            X.A72 r5 = (X.A72) r5
            r6 = 1
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            X.72S r3 = new X.72S
            r3.<init>(r2)
            X.1ka r0 = r5.A01
            int r0 = r0.A00(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0O(r0)
            X.73D r5 = new X.73D
            r5.<init>(r3)
            java.util.ArrayList r3 = X.C108965cb.A0s(r2)
            java.lang.String r0 = "media_attribution_url"
            java.lang.String r2 = r1.getStringExtra(r0)
            java.util.ArrayList r9 = X.A72.A01(r1)
            java.lang.String r0 = "source_app_package_name"
            java.lang.String r21 = r1.getStringExtra(r0)
            java.lang.String r8 = r1.getStringExtra(r7)
            java.lang.String r0 = "SHARE_TO_STATUS"
            boolean r0 = X.C18070vi.A18(r8, r0)
            java.lang.String r8 = "background_color"
            java.lang.String r8 = r1.getStringExtra(r8)
            if (r8 == 0) goto L_0x173a
            java.lang.Integer r17 = X.A72.A00(r8)
        L_0x1670:
            java.lang.String r8 = "color_gradient_top"
            java.lang.String r8 = r1.getStringExtra(r8)
            if (r8 == 0) goto L_0x1736
            java.lang.Integer r18 = X.A72.A00(r8)
        L_0x167c:
            java.lang.String r8 = "color_gradient_bottom"
            java.lang.String r8 = r1.getStringExtra(r8)
            if (r8 == 0) goto L_0x1732
            java.lang.Integer r19 = X.A72.A00(r8)
        L_0x1688:
            java.lang.String r22 = r1.getStringExtra(r7)
            if (r9 == 0) goto L_0x172e
            int r24 = r9.size()
        L_0x1692:
            java.util.ArrayList r23 = X.A72.A01(r1)
            X.77N r1 = new X.77N
            r20 = r2
            r25 = r0
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.1cg r7 = X.C29671cg.A00
            java.lang.String r11 = r7.getRawString()
            android.os.Bundle r10 = X.C17880vN.A0D()
            X.AnonymousClass73D.A01(r10, r5)
            X.A5E r5 = X.A5E.A00()
            X.8Qb r7 = r5.A02()
            android.content.Intent r5 = X.C17880vN.A0A()
            java.lang.String r9 = r15.getPackageName()
            java.lang.String r8 = "com.whatsapp.mediacomposer.MediaComposerActivity"
            r5.setClassName(r9, r8)
            r5.putExtra(r4, r3)
            java.lang.String r3 = "android.intent.extra.TEXT"
            r5.putExtra(r3, r14)
            X.C114945sf.A0V(r5, r11)
            boolean r4 = X.C114945sf.A0d(r5, r10)
            java.lang.String r3 = "smb_quick_reply"
            r5.putExtra(r3, r4)
            java.lang.String r3 = "should_send_media"
            r5.putExtra(r3, r6)
            java.lang.String r3 = "should_hide_caption_view"
            r5.putExtra(r3, r4)
            java.lang.String r3 = "start_home"
            r5.putExtra(r3, r4)
            java.lang.String r3 = "auto_play_video"
            r5.putExtra(r3, r0)
            X.C114945sf.A0c(r5, r4)
            java.lang.String r3 = "is_editing_allowed"
            r5.putExtra(r3, r0)
            java.lang.String r0 = "should_finish_task_on_send_or_close"
            r5.putExtra(r0, r6)
            java.lang.String r0 = "show_delete_thumbnail_for_single_media"
            r3 = 0
            r5.putExtra(r0, r3)
            java.lang.String r0 = "set_result_when_last_media_deleted"
            r5.putExtra(r0, r3)
            java.lang.String r0 = "disable_converting_video_to_gif_option"
            r5.putExtra(r0, r3)
            java.lang.String r3 = "media_sharing_user_journey_origin"
            r0 = 16
            r5.putExtra(r3, r0)
            java.lang.String r0 = "parent_handles_redirect"
            r5.putExtra(r0, r6)
            X.C114945sf.A0Q(r5)
            java.lang.String r0 = "extra_status_api_metadata"
            r5.putExtra(r0, r1)
            java.lang.String r0 = "extra_status_source_attribution_url"
            r5.putExtra(r0, r2)
            java.lang.String r0 = "navigateToHomeScreenOnDismiss"
            r5.putExtra(r0, r6)
            r7.A05(r15, r5)
            r15.finishAffinity()
            goto L_0x002b
        L_0x172e:
            r24 = 0
            goto L_0x1692
        L_0x1732:
            r19 = r14
            goto L_0x1688
        L_0x1736:
            r18 = r14
            goto L_0x167c
        L_0x173a:
            r17 = r14
            goto L_0x1670
        L_0x173e:
            android.content.Intent r3 = A0r(r15, r3)
            goto L_0x158c
        L_0x1744:
            if (r2 == 0) goto L_0x1841
            X.72S r5 = new X.72S
            r5.<init>(r0)
            if (r3 == 0) goto L_0x1750
            r5.A0P(r3)
        L_0x1750:
            X.11C r0 = r15.A08
            X.11B r0 = X.C108955ca.A0d(r0)
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            android.content.ContentResolver r0 = X.AnonymousClass11B.A00(r0)
            java.lang.String r0 = r0.getType(r2)
            java.lang.String r6 = r1.getExtensionFromMimeType(r0)
            java.util.List r0 = X.AnonymousClass1SP.A07
            java.util.Iterator r1 = r0.iterator()
        L_0x176c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x180b
            java.lang.String r0 = X.C17880vN.A0v(r1)
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x176c
            r0 = 1
        L_0x177d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x1786
            r5.A0O(r0)
        L_0x1786:
            X.73D r1 = new X.73D
            r1.<init>(r5)
            java.util.ArrayList r7 = X.C108965cb.A0s(r2)
            X.1cg r0 = X.C29671cg.A00
            java.lang.String r6 = r0.getRawString()
            android.os.Bundle r5 = X.C17880vN.A0D()
            X.AnonymousClass73D.A01(r5, r1)
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r2 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.mediacomposer.MediaComposerActivity"
            r1.setClassName(r2, r0)
            r1.putExtra(r4, r7)
            java.lang.String r0 = "android.intent.extra.TEXT"
            r1.putExtra(r0, r3)
            X.C114945sf.A0V(r1, r6)
            boolean r2 = X.C114945sf.A0d(r1, r5)
            java.lang.String r0 = "smb_quick_reply"
            r1.putExtra(r0, r2)
            java.lang.String r2 = "should_send_media"
            r0 = 1
            r1.putExtra(r2, r0)
            java.lang.String r0 = "should_hide_caption_view"
            r2 = 0
            r1.putExtra(r0, r2)
            java.lang.String r0 = "start_home"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "auto_play_video"
            r1.putExtra(r0, r2)
            X.C114945sf.A0c(r1, r2)
            java.lang.String r2 = "is_editing_allowed"
            r0 = 1
            r1.putExtra(r2, r0)
            java.lang.String r0 = "should_finish_task_on_send_or_close"
            r2 = 0
            r1.putExtra(r0, r2)
            java.lang.String r0 = "show_delete_thumbnail_for_single_media"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "set_result_when_last_media_deleted"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "disable_converting_video_to_gif_option"
            r1.putExtra(r0, r2)
            java.lang.String r2 = "media_sharing_user_journey_origin"
            r0 = 16
            r1.putExtra(r2, r0)
            java.lang.String r2 = "parent_handles_redirect"
            r0 = 0
            r1.putExtra(r2, r0)
            X.C114945sf.A0Q(r1)
            java.lang.String r0 = "extra_status_source_attribution_url"
            r1.putExtra(r0, r14)
        L_0x1806:
            r15.startActivity(r1)
            goto L_0x002b
        L_0x180b:
            java.util.List r0 = X.AnonymousClass1SP.A06
            java.util.Iterator r1 = r0.iterator()
        L_0x1811:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1825
            java.lang.String r0 = X.C17880vN.A0v(r1)
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x1811
            r0 = 13
            goto L_0x177d
        L_0x1825:
            java.util.List r0 = X.AnonymousClass1SP.A08
            java.util.Iterator r1 = r0.iterator()
        L_0x182b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x183e
            java.lang.String r0 = X.C17880vN.A0v(r1)
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x182b
            r0 = 3
            goto L_0x177d
        L_0x183e:
            r0 = 0
            goto L_0x177d
        L_0x1841:
            X.10I r2 = r15.A05
            r8 = 2
            X.7Pv r1 = new X.7Pv
            r4 = r1
            r5 = r15
            r6 = r0
            r7 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r2.CGF(r1)
            goto L_0x002b
        L_0x1852:
            X.6RX r1 = X.AnonymousClass6RX.CALL_PHONE_NUMBER
            r15.A0u(r0, r1)
            X.1VP r3 = r15.A0K
            r1 = 41
            r2 = 1
            r3.BiX(r14, r14, r1, r2)
            java.lang.ref.WeakReference r9 = X.AnonymousClass3MW.A0z(r15)
            android.os.Handler r1 = r15.A00
            android.os.Message r2 = android.os.Message.obtain(r1, r2)
            r1 = 2131893165(0x7f121bad, float:1.9421099E38)
            X.C108985cd.A0y(r2, r15, r1)
            X.00H r1 = r15.A0r
            java.lang.Object r4 = r1.get()
            X.6i8 r4 = (X.C129646i8) r4
            X.00H r1 = r15.A19
            java.lang.Object r3 = r1.get()
            r1 = 2
            X.C18070vi.A0d(r3, r1)
            X.10I r2 = r4.A04
            r11 = 11
            X.7Q7 r1 = new X.7Q7
            r10 = r6
            r5 = r1
            r6 = r4
            r7 = r0
            r8 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.CGF(r1)
            return
        L_0x1893:
            X.0zA r1 = r15.A06
            boolean r1 = r1.A07()
            if (r1 == 0) goto L_0x18b7
            X.A8Q r2 = r15.A0I
            r1 = 6
            r2.A08(r1, r14, r14)
            java.lang.String r1 = "wa_campaign_id"
            r0.getQueryParameter(r1)
            X.0zA r0 = r15.A06
            r0.A03()
            X.11S r0 = r15.A02
            r0.A0I()
            java.lang.String r0 = "getCatalogListActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x18b7:
            java.lang.String r12 = "biz-add-product"
            goto L_0x1b1c
        L_0x18bb:
            X.0zA r2 = r15.A06
            boolean r1 = r2.A07()
            if (r1 == 0) goto L_0x18cd
            r2.A03()
            java.lang.String r0 = "getLabelsActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x18cd:
            X.1i4 r3 = r15.A0X     // Catch:{ 6OP | 6OQ | 6OR | 6OT -> 0x1909 }
            r15.getIntent()     // Catch:{ 6OP | 6OQ | 6OR | 6OT -> 0x1909 }
            X.0zA r2 = r3.A00     // Catch:{ 6OP | 6OQ | 6OR | 6OT -> 0x1909 }
            boolean r1 = r2.A07()     // Catch:{ 6OP | 6OQ | 6OR | 6OT -> 0x1909 }
            if (r1 == 0) goto L_0x1903
            java.lang.String r1 = "destination_url"
            java.lang.String r0 = r0.getQueryParameter(r1)     // Catch:{ 6OP | 6OQ | 6OR | 6OT -> 0x1909 }
            if (r0 == 0) goto L_0x18fd
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ 6OP | 6OQ | 6OR | 6OT -> 0x1909 }
            int r1 = r3.A0E(r0)     // Catch:{ 6OP | 6OQ | 6OR | 6OT -> 0x1909 }
            r0 = 1
            if (r1 == r0) goto L_0x18f7
            r2.A03()     // Catch:{ 6OP | 6OQ | 6OR | 6OT -> 0x1909 }
            java.lang.String r0 = "handleInterAppIdentitySwitchDeeplink"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)     // Catch:{ 6OP | 6OQ | 6OR | 6OT -> 0x1909 }
        L_0x18f6:
            throw r0     // Catch:{ 6OP | 6OQ | 6OR | 6OT -> 0x1909 }
        L_0x18f7:
            X.6OQ r0 = new X.6OQ     // Catch:{ 6OP | 6OQ | 6OR | 6OT -> 0x1909 }
            r0.<init>()     // Catch:{ 6OP | 6OQ | 6OR | 6OT -> 0x1909 }
            goto L_0x18f6
        L_0x18fd:
            X.6OQ r0 = new X.6OQ     // Catch:{ 6OP | 6OQ | 6OR | 6OT -> 0x1909 }
            r0.<init>()     // Catch:{ 6OP | 6OQ | 6OR | 6OT -> 0x1909 }
            goto L_0x18f6
        L_0x1903:
            X.6OQ r0 = new X.6OQ     // Catch:{ 6OP | 6OQ | 6OR | 6OT -> 0x1909 }
            r0.<init>()     // Catch:{ 6OP | 6OQ | 6OR | 6OT -> 0x1909 }
            goto L_0x18f6
        L_0x1909:
            X.1i4 r0 = r15.A0X
            android.content.Context r2 = r15.getApplicationContext()
            X.0zA r1 = r0.A00
            boolean r0 = r1.A07()
            if (r0 != 0) goto L_0x1922
            r0 = 2131891441(0x7f1214f1, float:1.9417602E38)
            java.lang.String r0 = r2.getString(r0)
            r15.BhR(r0)
            return
        L_0x1922:
            r1.A03()
            java.lang.String r0 = "getErrorMessage"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x192c:
            X.6RX r1 = X.AnonymousClass6RX.CLICK_TO_CALL
            r15.A0u(r0, r1)
            java.lang.ref.WeakReference r5 = X.AnonymousClass3MW.A0z(r15)
            android.os.Handler r2 = r15.A00
            r1 = 1
            android.os.Message r2 = android.os.Message.obtain(r2, r1)
            r1 = 2131893165(0x7f121bad, float:1.9421099E38)
            X.C108985cd.A0y(r2, r15, r1)
            X.00H r1 = r15.A0v
            java.lang.Object r4 = r1.get()
            X.2gK r4 = (X.C55762gK) r4
            X.10I r3 = r4.A06
            r2 = 28
            X.3C4 r1 = new X.3C4
            r1.<init>(r0, r4, r5, r2)
            r3.CGF(r1)
            return
        L_0x1957:
            X.0zA r1 = r15.A06
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x1b1c
            r1.A03()
            java.lang.String r0 = "getConnectFacebookPageActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x1969:
            X.0zA r1 = r15.A09
            boolean r1 = r1.A07()
            if (r1 == 0) goto L_0x1b17
            X.0zA r1 = r15.A0B
            boolean r1 = r1.A07()
            if (r1 == 0) goto L_0x1b17
            java.lang.String r1 = "entrypoint"
            r0.getQueryParameter(r1)
            java.lang.String r1 = "deeplink_params"
            java.lang.String r5 = r0.getQueryParameter(r1)
            java.util.HashMap r4 = X.C17880vN.A11()
            if (r5 == 0) goto L_0x19b3
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x19b3
            org.json.JSONObject r3 = X.C17880vN.A16(r5)     // Catch:{ JSONException -> 0x19aa }
            java.util.Iterator r2 = r3.keys()     // Catch:{ JSONException -> 0x19aa }
        L_0x1998:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x19aa }
            if (r0 == 0) goto L_0x19b3
            java.lang.String r1 = X.C17880vN.A0v(r2)     // Catch:{ JSONException -> 0x19aa }
            java.lang.String r0 = r3.getString(r1)     // Catch:{ JSONException -> 0x19aa }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x19aa }
            goto L_0x1998
        L_0x19aa:
            X.190 r2 = r15.A03
            java.lang.String r1 = "MetaVerified/Deeplink"
            r0 = 1
            r2.A0G(r1, r5, r0)
            return
        L_0x19b3:
            X.0zA r0 = r15.A0B
            r0.A03()
            java.lang.String r0 = "navigateToMetaVerifiedBloksBottomSheet"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x19bf:
            X.0zA r0 = r15.A06
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x19f1
            X.0ve r2 = r15.A0E
            r1 = 6143(0x17ff, float:8.608E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x1bbc
            X.0zA r1 = r15.A05
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x19e5
            r1.A03()
            java.lang.String r0 = "restartSession"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x19e5:
            X.0zA r0 = r15.A06
            r0.A03()
            java.lang.String r0 = "getBizProfileCompletenessActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x19f1:
            java.lang.String r12 = "whatsapp-smb://biz-profile-completeness"
            goto L_0x1b1c
        L_0x19f5:
            X.0zA r1 = r15.A06
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x1a07
            r1.A03()
            java.lang.String r0 = "getEditBusinessProfilePriceTierActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x1a07:
            java.lang.String r12 = "whatsapp-smb://biz-price-tier"
            goto L_0x1b1c
        L_0x1a0b:
            X.0zA r1 = r15.A06
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x1a1d
            r1.A03()
            java.lang.String r0 = "getEditBusinessProfileWebsiteActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x1a1d:
            java.lang.String r12 = "whatsapp-smb://biz-website"
            goto L_0x1b1c
        L_0x1a21:
            X.0zA r1 = r15.A06
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x1a33
            r1.A03()
            java.lang.String r0 = "getEditBusinessProfileDescriptionActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x1a33:
            java.lang.String r12 = "whatsapp-smb://biz-edit-description"
            goto L_0x1b1c
        L_0x1a37:
            X.0zA r1 = r15.A06
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x1a49
            r1.A03()
            java.lang.String r0 = "getLinkedAccountsActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x1a49:
            java.lang.String r12 = "whatsapp-smb://biz-linked-accounts"
            goto L_0x1b1c
        L_0x1a4d:
            X.0zA r1 = r15.A06
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x1a5f
            r1.A03()
            java.lang.String r0 = "getEditBusinessProfileLocationActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x1a5f:
            java.lang.String r12 = "whatsapp-smb://biz-location"
            goto L_0x1b1c
        L_0x1a63:
            X.0zA r1 = r15.A06
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x1a75
            r1.A03()
            java.lang.String r0 = "getEditBusinessProfileHoursActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x1a75:
            java.lang.String r12 = "whatsapp-smb://biz-hours"
            goto L_0x1b1c
        L_0x1a79:
            X.0zA r0 = r15.A06
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x1a99
            X.A8Q r1 = r15.A0I
            r0 = 19
            r1.A08(r0, r14, r14)
            X.0zA r0 = r15.A06
            r0.A03()
            X.11S r0 = r15.A02
            r0.A0I()
            java.lang.String r0 = "getCatalogListActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x1a99:
            java.lang.String r12 = "whatsapp-smb://biz-edit-catalog"
            goto L_0x1b1c
        L_0x1a9d:
            X.0zA r1 = r15.A06
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x1aaf
            r1.A03()
            java.lang.String r0 = "getEditBusinessProfileActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x1aaf:
            java.lang.String r12 = "whatsapp-smb://biz-edit-profile"
            goto L_0x1b1c
        L_0x1ab2:
            java.lang.String r2 = r0.getQueryParameter(r8)
            java.lang.String r1 = "deeper-category-selection"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x1ac4
            java.lang.String r0 = "whatsapp-smb://biztools/directory?action=deeper-category-selection"
        L_0x1ac0:
            r15.A0y(r0)
            return
        L_0x1ac4:
            java.util.Set r1 = r0.getQueryParameterNames()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x1af8
            java.lang.String r2 = r0.getQueryParameter(r4)
            java.lang.String r1 = "version"
            java.lang.String r3 = r0.getQueryParameter(r1)
            if (r2 == 0) goto L_0x1afb
            if (r3 == 0) goto L_0x1afb
            java.lang.String r1 = "\""
            java.lang.String r0 = ""
            java.lang.String r2 = r2.replaceAll(r1, r0)
            java.lang.String r1 = r3.replaceAll(r1, r0)
            java.lang.String r0 = "directory_bot"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x1afb
            java.util.Set r0 = X.AnonymousClass6YV.A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x1afb
        L_0x1af8:
            java.lang.String r0 = "whatsapp-smb://biztools/directory"
            goto L_0x1ac0
        L_0x1afb:
            r0 = 2131891441(0x7f1214f1, float:1.9417602E38)
            r15.BhQ(r0)
            return
        L_0x1b02:
            X.0zA r1 = r15.A06
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x1b1c
            r1.A03()
            java.lang.String r0 = "getConnectedAccountsActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x1b14:
            java.lang.String r12 = "whatsapp-smb://marketingmessages"
            goto L_0x1b1c
        L_0x1b17:
            java.lang.String r12 = "whatsapp-smb://premium"
            goto L_0x1b1c
        L_0x1b1a:
            java.lang.String r12 = "whatsapp-smb://bizsearchonboarding-sheet"
        L_0x1b1c:
            r15.A0y(r12)
            return
        L_0x1b20:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x1b23:
            X.11E r1 = r15.A07
            boolean r1 = r1.A09()
            if (r1 != 0) goto L_0x1b34
            java.lang.String r0 = "about/no-connectivity"
        L_0x1b2d:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            A0w(r15)
            return
        L_0x1b34:
            java.lang.String r1 = "ep"
            java.lang.String r2 = r0.getQueryParameter(r1)
            java.lang.String r1 = "articles"
            java.lang.String r0 = r0.getQueryParameter(r1)
            if (r2 != 0) goto L_0x1b8c
            if (r0 != 0) goto L_0x1b8c
            r9 = r14
        L_0x1b45:
            X.10I r8 = r15.A05
            X.1LU r7 = r15.A0b
            X.6mP r6 = r15.A0F
            X.11C r5 = r15.A08
            X.1MB r4 = r15.A0a
            X.17x r3 = r15.A0R
            X.A98 r2 = r15.A0j
            X.11E r1 = r15.A07
            X.11S r0 = r15.A02
            r0.A0I()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x1b68
            X.1CM r0 = r15.A07
            boolean r0 = r0.A04()
            r26 = 1
            if (r0 != 0) goto L_0x1b6a
        L_0x1b68:
            r26 = 0
        L_0x1b6a:
            java.lang.String r24 = "deeplink/support"
            r0 = 0
            r27 = 1
            X.9BP r13 = new X.9BP
            r19 = r3
            r20 = r9
            r21 = r4
            r22 = r7
            r23 = r2
            r25 = r0
            r17 = r1
            r18 = r5
            r16 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.String[] r0 = new java.lang.String[r0]
            r8.CGD(r13, r0)
            return
        L_0x1b8c:
            X.770 r9 = new X.770
            r9.<init>(r2, r0)
            goto L_0x1b45
        L_0x1b92:
            r22 = 2131898587(0x7f1230db, float:1.9432096E38)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r25 = 2131898588(0x7f1230dc, float:1.9432098E38)
            r23 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 20
            X.74r r0 = new X.74r
            r0.<init>(r1)
            r21 = -1
            r18 = r14
            r16 = r0
            r17 = r14
            r19 = r3
            r20 = r2
            r24 = r4
            com.whatsapp.LegacyMessageDialogFragment r0 = X.AnonymousClass4FY.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.AnonymousClass3MY.A1H(r0, r15, r14)
            return
        L_0x1bbc:
            r2 = 2131889454(0x7f120d2e, float:1.9413572E38)
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r15.BhU(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.deeplink.DeepLinkActivity.onCreate(android.os.Bundle):void");
    }
}
