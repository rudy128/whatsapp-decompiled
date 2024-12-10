package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.InfoCard;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.BusinessProfileFieldView;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.biz.education.Hilt_VerifiedBusinessEducationBottomSheet;
import com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard;
import com.whatsapp.biz.profile.TrustSignalItem;
import com.whatsapp.biz.view.MetaVerifiedTextEmojiLabel;
import com.whatsapp.biz.viewmodel.BusinessDetailsViewModel;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.pnh.RequestPhoneNumberViewModel;

/* renamed from: X.4i3  reason: invalid class name and case insensitive filesystem */
public class C92874i3 implements C36211nW {
    public View A00;
    public View A01;
    public TextView A02;
    public InfoCard A03;
    public InfoCard A04;
    public WaTextView A05;
    public WaTextView A06;
    public C20042A4l A07;
    public BusinessProfileFieldView A08;
    public CatalogMediaCard A09;
    public LinkedAccountsMediaCard A0A;
    public LinkedAccountsMediaCard A0B;
    public TrustSignalItem A0C;
    public TrustSignalItem A0D;
    public AnonymousClass4P2 A0E;
    public C1417376t A0F;
    public AEW A0G;
    public AnonymousClass1MB A0H;
    public C92804hw A0I;
    public AnonymousClass1DC A0J;
    public C28931bI A0K;
    public boolean A0L;
    public boolean A0M = true;
    public boolean A0N = true;
    public View A0O;
    public C72043Kk A0P;
    public final View A0Q;
    public final View A0R;
    public final AnonymousClass1L9 A0S;
    public final C131276kp A0T;
    public final C446324e A0U;
    public final AnonymousClass1KB A0V;
    public final C36361nl A0W;
    public final AnonymousClass11S A0X;
    public final WaTextView A0Y;
    public final C196149uX A0Z;
    public final C26911Ty A0a;
    public final C195529tU A0b;
    public final A8Q A0c;
    public final AnonymousClass72R A0d;
    public final C19957A0o A0e;
    public final MetaVerifiedTextEmojiLabel A0f;
    public final MetaVerifiedTextEmojiLabel A0g;
    public final BusinessDetailsViewModel A0h;
    public final C193619qO A0i;
    public final AnonymousClass1VP A0j;
    public final C195199sx A0k;
    public final ContactInfoActivity A0l;
    public final C76783oH A0m;
    public final AnonymousClass1PM A0n;
    public final C24921Me A0o;
    public final C34811l7 A0p;
    public final AnonymousClass11C A0q;
    public final AnonymousClass118 A0r;
    public final C18000vb A0s;
    public final C18030ve A0t;
    public final AnonymousClass12L A0u;
    public final AnonymousClass18K A0v;
    public final AnonymousClass1XN A0w;
    public final AnonymousClass1QJ A0x;
    public final C191769n9 A0y;
    public final AnonymousClass1R2 A0z;
    public final AnonymousClass4VP A10;
    public final RequestPhoneNumberViewModel A11;
    public final C190289kg A12;
    public final AnonymousClass4PD A13;
    public final C25491Cgm A14;
    public final AnonymousClass4OG A15;
    public final AnonymousClass10I A16;
    public final C132176mK A17;
    public final C190369kp A18;
    public final AnonymousClass00H A19;
    public final AnonymousClass00H A1A;
    public final AnonymousClass00H A1B;
    public final AnonymousClass00H A1C;
    public final AnonymousClass00H A1D;
    public final Integer A1E;
    public final boolean A1F;
    public final C19880zA A1G;
    public final C19880zA A1H;
    public final C19880zA A1I;
    public final TextEmojiLabel A1J;
    public final C192179nw A1K;
    public final AnonymousClass1M2 A1L;
    public final C54202dl A1M;
    public final AnonymousClass11P A1N;
    public final C24521Kq A1O;
    public final AnonymousClass689 A1P;
    public final AnonymousClass1OZ A1Q;
    public final C32131gh A1R;
    public final AnonymousClass2V4 A1S;
    public final AnonymousClass00H A1T;
    public final AnonymousClass00H A1U;
    public final AnonymousClass00H A1V;
    public final AnonymousClass00H A1W;
    public final AnonymousClass00H A1X;

    public static boolean A08(View view) {
        if (view == null || !view.isShown()) {
            return false;
        }
        Rect A072 = AnonymousClass3MW.A07();
        view.getGlobalVisibleRect(A072);
        return A072.intersects(0, 0, Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels);
    }

    public static void A01(C92874i3 r4) {
        DialogFragment hilt_VerifiedBusinessEducationBottomSheet;
        boolean A052 = C18020vd.A05(C18040vf.A02, r4.A0t, 11858);
        UserJid A0T2 = r4.A0h.A0T();
        if (A052) {
            hilt_VerifiedBusinessEducationBottomSheet = AnonymousClass9PN.A00(A0T2, 9);
        } else {
            C18070vi.A0d(A0T2, 0);
            hilt_VerifiedBusinessEducationBottomSheet = new Hilt_VerifiedBusinessEducationBottomSheet();
            C72463Mc.A11(C17880vN.A0D(), hilt_VerifiedBusinessEducationBottomSheet, A0T2, "biz_owner_jid");
        }
        r4.A0l.CMk(hilt_VerifiedBusinessEducationBottomSheet, (String) null);
    }

    public static void A02(C92874i3 r8, int i) {
        BusinessDetailsViewModel businessDetailsViewModel = r8.A0h;
        if (businessDetailsViewModel.A00.A0C()) {
            r8.A0d.A07((Integer) null, r8.A1E, C22971Dz.A06(businessDetailsViewModel.A0T()), i, r8.A0E(), r8.A0D());
        }
    }

    public static void A03(C92874i3 r2, int i) {
        if (r2.A0h.A00.A0C()) {
            r2.A0d.A03(r2.A0F, i);
        }
    }

    public static void A05(C92874i3 r11, C107305Ze r12, Integer num) {
        AnonymousClass4DN r6;
        AnonymousClass8oR A002;
        AnonymousClass00H r3 = r11.A1U;
        BusinessDetailsViewModel businessDetailsViewModel = r11.A0h;
        C107305Ze r9 = r12;
        if (((C88504Zz) r3.get()).A04(businessDetailsViewModel.A0T())) {
            AnonymousClass4QV r4 = (AnonymousClass4QV) r11.A1T.get();
            AnonymousClass1GP supportFragmentManager = r11.A0l.getSupportFragmentManager();
            C88504Zz r1 = (C88504Zz) r3.get();
            UserJid A0T2 = businessDetailsViewModel.A0T();
            if (A0T2 == null || (A002 = C88504Zz.A00(r1, A0T2)) == null) {
                r6 = AnonymousClass4DN.DEFAULT;
            } else {
                r6 = A002.A02;
            }
            r4.A00(supportFragmentManager, r6, businessDetailsViewModel.A00, new C95544mP(r11, 0), r9, num, AnonymousClass00R.A0N, false);
            return;
        }
        r12.Bkp();
    }

    public static void A06(C92874i3 r3, String str) {
        if (str == null || str.isEmpty() || r3.A0g.A01.equals(str)) {
            TextEmojiLabel textEmojiLabel = r3.A1J;
            AnonymousClass3MW.A1S(textEmojiLabel);
            textEmojiLabel.setVisibility(8);
        } else if (str.charAt(0) == '@') {
            TextEmojiLabel textEmojiLabel2 = r3.A1J;
            textEmojiLabel2.setText(str);
            textEmojiLabel2.setVisibility(0);
        }
    }

    private void A07(AnonymousClass1E7 r7) {
        if (r7 != null) {
            AnonymousClass1BI r5 = r7.A0J;
            if (r5 instanceof AnonymousClass1E2) {
                RequestPhoneNumberViewModel requestPhoneNumberViewModel = this.A11;
                C18070vi.A0d(r5, 0);
                AnonymousClass1DT r3 = requestPhoneNumberViewModel.A01;
                requestPhoneNumberViewModel.A05.CGF(new C21433Ak0(requestPhoneNumberViewModel, r5, 18));
                r3.A0A(this.A0l, new C91574fu(this, 6));
                this.A0R.setOnClickListener(new AnonymousClass78Q((Object) this, (Object) r5, 26));
            }
        }
    }

    public static boolean A09(C92874i3 r2) {
        UserJid A0T2 = r2.A0h.A0T();
        if (!C42701yb.A01(A0T2) || !AnonymousClass3MW.A0W(r2.A1A).A0D(A0T2)) {
            return false;
        }
        return true;
    }

    public static boolean A0A(C92874i3 r1) {
        if (!r1.A0h.A00.A0E() || !C84104Hw.A00(r1.A0t)) {
            return false;
        }
        return true;
    }

    public void A0B() {
        String A032;
        AnonymousClass6Qj A033 = ((AnonymousClass72E) this.A1V.get()).A03();
        AnonymousClass6Qj r1 = AnonymousClass6Qj.PREMIUM;
        C25811Ps A0W2 = AnonymousClass3MW.A0W(this.A1A);
        if (A033 == r1) {
            A032 = A0W2.A04();
        } else {
            A032 = A0W2.A03();
        }
        MetaVerifiedTextEmojiLabel metaVerifiedTextEmojiLabel = this.A0f;
        Context context = this.A0r.A00;
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = A032;
        AnonymousClass3MY.A0y(context, metaVerifiedTextEmojiLabel, A1a, 2131888138);
        metaVerifiedTextEmojiLabel.setVisibility(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        if (r3.A03(r12.A0G) != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r12.A0t, 957) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(com.whatsapp.jid.UserJid r13, boolean r14) {
        /*
            r12 = this;
            X.AEW r0 = r12.A0G
            r2 = 8
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.A0f
            if (r0 == 0) goto L_0x0026
            X.0ve r3 = r12.A0t
            r1 = 957(0x3bd, float:1.341E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x0026
        L_0x0016:
            com.whatsapp.biz.catalog.view.CatalogMediaCard r0 = r12.A09
            r0.setVisibility(r2)
            android.view.View r6 = r12.A01
        L_0x001d:
            r6.setVisibility(r2)
            com.whatsapp.InfoCard r0 = r12.A04
            r0.setVisibility(r2)
        L_0x0025:
            return
        L_0x0026:
            com.whatsapp.biz.catalog.view.CatalogMediaCard r6 = r12.A09
            X.4i4 r0 = new X.4i4
            r0.<init>(r12)
            r6.A04 = r0
            X.9uX r3 = r12.A0Z
            X.AEW r5 = r12.A0G
            X.0ve r4 = r3.A01
            r0 = 355(0x163, float:4.97E-43)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r4, r0)
            if (r0 == 0) goto L_0x0082
            r0 = 636(0x27c, float:8.91E-43)
            boolean r0 = X.C18020vd.A05(r1, r4, r0)
            if (r0 == 0) goto L_0x0082
        L_0x0047:
            android.view.View r1 = r12.A01
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0052
            r1.setVisibility(r2)
        L_0x0052:
            X.AEW r0 = r12.A0G
            java.lang.String r1 = r3.A00(r0)
            java.lang.String r0 = "PERMANENT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001d
            X.AEW r0 = r12.A0G
            boolean r0 = r3.A02(r0)
            if (r0 != 0) goto L_0x0070
            X.AEW r0 = r12.A0G
            boolean r0 = r3.A03(r0)
            if (r0 == 0) goto L_0x001d
        L_0x0070:
            r11 = 0
            r6.setVisibility(r11)
            com.whatsapp.InfoCard r0 = r12.A04
            r0.setVisibility(r11)
            X.AEW r7 = r12.A0G
            r9 = 0
            r8 = r13
            r10 = r14
            r6.A02(r7, r8, r9, r10, r11)
            return
        L_0x0082:
            boolean r0 = r3.A01(r5)
            if (r0 == 0) goto L_0x0047
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L_0x0091
            r6.setVisibility(r2)
        L_0x0091:
            X.AEW r2 = r12.A0G
            android.view.View r0 = r12.A01
            r1 = 0
            r0.setVisibility(r1)
            com.whatsapp.InfoCard r0 = r12.A04
            r0.setVisibility(r1)
            com.whatsapp.chatinfo.ContactInfoActivity r0 = r12.A0l
            X.1GP r6 = r0.getSupportFragmentManager()
            java.lang.String r5 = "shops_product_frag"
            androidx.fragment.app.Fragment r0 = r6.A0Q(r5)
            if (r0 != 0) goto L_0x0025
            java.lang.String r4 = r2.A0K
            X.C17960vV.A07(r4)
            com.whatsapp.shops.ShopsProductPreviewFragment r3 = new com.whatsapp.shops.ShopsProductPreviewFragment
            r3.<init>()
            android.os.Bundle r2 = r3.A15()
            java.lang.String r1 = "screen_name"
            java.lang.String r0 = "com.bloks.www.minishops.whatsapp.products_preview_h_scroll"
            r2.putString(r1, r0)
            java.lang.String r0 = "shopUrl"
            r2.putString(r0, r4)
            X.1jj r1 = new X.1jj
            r1.<init>(r6)
            r0 = 2131435430(0x7f0b1fa6, float:1.8492702E38)
            r1.A0C(r3, r5, r0)
            r1.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92874i3.A0C(com.whatsapp.jid.UserJid, boolean):void");
    }

    public boolean A0D() {
        AEA aea;
        AEW aew = this.A0G;
        if (aew == null || (aea = aew.A05) == null || TextUtils.isEmpty(aea.A00)) {
            return false;
        }
        return true;
    }

    public boolean A0E() {
        C20248ADg aDg;
        AEW aew = this.A0G;
        if (aew == null || (aDg = aew.A06) == null) {
            return false;
        }
        if (aDg.A00 == null && aDg.A01 == null) {
            return false;
        }
        return true;
    }

    public void BvB() {
        ContactInfoActivity contactInfoActivity = this.A0l;
        contactInfoActivity.CEx();
        contactInfoActivity.A1I.A06("profile_view_tag", false);
    }

    public void BvC() {
        ContactInfoActivity contactInfoActivity = this.A0l;
        contactInfoActivity.CEx();
        contactInfoActivity.A1I.A06("profile_view_tag", true);
    }

    public static void A00(View view, C92874i3 r2, int i) {
        if (A09(r2) || A0A(r2)) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public C92874i3(View view, C19880zA r20, C19880zA r21, C19880zA r22, AnonymousClass1L9 r23, C131276kp r24, C446324e r25, AnonymousClass1KB r26, C36361nl r27, AnonymousClass11S r28, C72043Kk r29, C196149uX r30, C26911Ty r31, C192179nw r32, C195529tU r33, A8Q a8q, AnonymousClass72R r35, C19957A0o a0o, C1417376t r37, BusinessDetailsViewModel businessDetailsViewModel, C193619qO r39, AnonymousClass1VP r40, C195199sx r41, ContactInfoActivity contactInfoActivity, C76783oH r43, AnonymousClass1M2 r44, AnonymousClass1PM r45, C24921Me r46, C57472j8 r47, C54202dl r48, C34811l7 r49, AnonymousClass11C r50, AnonymousClass11P r51, AnonymousClass118 r52, C24521Kq r53, C18000vb r54, AnonymousClass1E7 r55, C18030ve r56, AnonymousClass12L r57, AnonymousClass18K r58, AnonymousClass1MB r59, AnonymousClass689 r60, AnonymousClass1OZ r61, AnonymousClass1XN r62, AnonymousClass1QJ r63, C191769n9 r64, AnonymousClass1R2 r65, AnonymousClass4VP r66, RequestPhoneNumberViewModel requestPhoneNumberViewModel, C190289kg r68, AnonymousClass4PD r69, C25491Cgm cgm, AnonymousClass4OG r71, AnonymousClass1DC r72, AnonymousClass10I r73, C132176mK r74, C32131gh r75, C190369kp r76, AnonymousClass2V4 r77, AnonymousClass00H r78, AnonymousClass00H r79, AnonymousClass00H r80, AnonymousClass00H r81, AnonymousClass00H r82, AnonymousClass00H r83, AnonymousClass00H r84, AnonymousClass00H r85, AnonymousClass00H r86, AnonymousClass00H r87, Integer num) {
        this.A1N = r51;
        this.A0t = r56;
        this.A1S = r77;
        this.A0V = r26;
        this.A1H = r20;
        this.A0X = r28;
        this.A0r = r52;
        this.A16 = r73;
        C19880zA r5 = r21;
        this.A1G = r5;
        this.A1I = r22;
        this.A0v = r58;
        this.A1R = r75;
        this.A17 = r74;
        this.A0j = r40;
        this.A0u = r57;
        this.A0W = r27;
        this.A0S = r23;
        this.A1P = r60;
        this.A1C = r78;
        this.A1Q = r61;
        this.A0z = r65;
        this.A1B = r79;
        this.A0o = r46;
        this.A0J = r72;
        this.A0q = r50;
        this.A0s = r54;
        this.A1D = r87;
        this.A0m = r43;
        this.A18 = r76;
        this.A1A = r80;
        this.A1V = r81;
        this.A19 = r82;
        this.A13 = r69;
        this.A0b = r33;
        this.A1W = r83;
        this.A0n = r45;
        this.A1K = r32;
        this.A0Z = r30;
        this.A0a = r31;
        this.A0c = a8q;
        this.A1L = r44;
        this.A0x = r63;
        this.A0w = r62;
        this.A15 = r71;
        this.A10 = r66;
        this.A1M = r48;
        BusinessDetailsViewModel businessDetailsViewModel2 = businessDetailsViewModel;
        this.A0h = businessDetailsViewModel2;
        this.A11 = requestPhoneNumberViewModel;
        this.A14 = cgm;
        this.A1O = r53;
        this.A0d = r35;
        this.A0y = r64;
        this.A0i = r39;
        this.A0P = r29;
        this.A0F = r37;
        this.A0e = a0o;
        this.A0H = r59;
        this.A0p = r49;
        this.A0T = r24;
        this.A0k = r41;
        this.A1U = r84;
        this.A1T = r85;
        this.A1X = r86;
        View view2 = view;
        this.A08 = (BusinessProfileFieldView) AnonymousClass1HF.A06(view2, 2131428517);
        this.A09 = (CatalogMediaCard) AnonymousClass1HF.A06(view2, 2131428500);
        this.A0A = (LinkedAccountsMediaCard) AnonymousClass1HF.A06(view2, 2131428525);
        this.A0B = (LinkedAccountsMediaCard) AnonymousClass1HF.A06(view2, 2131428546);
        this.A04 = (InfoCard) AnonymousClass1HF.A06(view2, 2131428501);
        this.A01 = AnonymousClass1HF.A06(view2, 2131435431);
        this.A02 = AnonymousClass3MW.A0J(view2, 2131428195);
        this.A00 = AnonymousClass1HF.A06(view2, 2131427581);
        this.A03 = (InfoCard) AnonymousClass1HF.A06(view2, 2131428503);
        this.A0R = AnonymousClass1HF.A06(view2, 2131427517);
        ContactInfoActivity contactInfoActivity2 = contactInfoActivity;
        C74793cj.A01(contactInfoActivity2, (C74793cj) AnonymousClass1HF.A06(view2, 2131428504), 2131887069);
        this.A0g = (MetaVerifiedTextEmojiLabel) AnonymousClass1HF.A06(view2, 2131428574);
        this.A0f = (MetaVerifiedTextEmojiLabel) AnonymousClass1HF.A06(view2, 2131428572);
        this.A1J = AnonymousClass3MX.A0V(view2, 2131428577);
        this.A0Y = AnonymousClass3MW.A0T(view2, 2131428502);
        this.A05 = AnonymousClass3MW.A0T(view2, 2131429762);
        this.A06 = AnonymousClass3MW.A0T(view2, 2131434642);
        this.A0K = C28931bI.A00(view2, 2131432747);
        this.A1E = num;
        this.A0l = contactInfoActivity2;
        this.A0Q = view2;
        AnonymousClass1E7 r3 = r55;
        businessDetailsViewModel2.A00 = r3;
        this.A0U = r25;
        this.A12 = r68;
        this.A1F = r47.A00(r3);
        C18030ve r1 = this.A0t;
        C18040vf r10 = C18040vf.A02;
        if (C18020vd.A05(r10, r1, 2582) || (!C18020vd.A05(r10, r1, 1483) && !C18020vd.A05(r10, r1, 1849))) {
            this.A05.setVisibility(8);
        } else {
            UserJid A0T2 = this.A0h.A0T();
            C17960vV.A07(A0T2);
            WaTextView waTextView = this.A05;
            waTextView.setVisibility(0);
            waTextView.setText(2131891797);
            C189879k0 r8 = new C189879k0(this, A0T2);
            C85414Nh r9 = (C85414Nh) this.A1D.get();
            C18070vi.A0d(A0T2, 0);
            if (C18020vd.A05(r10, C17880vN.A0P(r9.A00), 10523)) {
                C185619cs r102 = (C185619cs) r9.A01.get();
                String rawString = A0T2.getRawString();
                C18070vi.A0d(rawString, 0);
                r102.A02.CGF(new C21459AkQ(r102, r8, rawString, 30));
            } else {
                C20973AcR acR = new C20973AcR(r8, (C24521Kq) C18070vi.A0E(r9.A03), (AnonymousClass1OZ) C18070vi.A0E(r9.A02));
                C24521Kq r0 = C24521Kq.$redex_init_class;
                AnonymousClass1OZ r11 = acR.A01;
                String A0B2 = r11.A0B();
                C29591cX r88 = new C29591cX(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                r88.A04(new AnonymousClass1MD((Jid) A0T2, "jid"));
                C29621ca A032 = r88.A03();
                AnonymousClass1MD[] r89 = new AnonymousClass1MD[5];
                r89[0] = new AnonymousClass1MD((Jid) C173438v4.A00, "to");
                r89[1] = new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2);
                C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r89);
                r89[3] = new AnonymousClass1MD("xmlns", "fb:thrift_iq");
                r89[4] = new AnonymousClass1MD("smax_id", "78");
                r11.A0J(acR, new C29621ca(A032, "iq", r89), A0B2, 316, 32000);
                C17900vP.A0Y(A0T2, "GetCustomUrlsByJidProtocol/sendRequest/jid=", AnonymousClass000.A10());
            }
        }
        A07(r3);
        C17960vV.A05(view2);
        if (view2.findViewById(2131429431) != null && r5.A07()) {
            r5.A03();
            throw AnonymousClass000.A0s("getSmbContactNoteCardLayoutId");
        } else if (!businessDetailsViewModel2.A01.A00(businessDetailsViewModel2.A0T()) && !C42701yb.A01(this.A0h.A0T())) {
            View A022 = C28931bI.A00(view2, 2131428521).A02();
            AnonymousClass1E7 r02 = businessDetailsViewModel2.A00;
            if (r02 != null) {
                A022.setOnClickListener(new AnonymousClass48Y(this, r02.A0K(), r02.A0A));
                return;
            }
            C18070vi.A11("contact");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03bb, code lost:
        if (r0.A0H.A03(r10.A0T()) != false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04ea, code lost:
        if (r0.A0D.getVisibility() != 0) goto L_0x04ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e2, code lost:
        if (r0.A0n.A04(r8) == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0121, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r0.A0t, 957) != false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a5, code lost:
        if (X.C18020vd.A05(r3, r9, 3464) == false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if (r0.A0X.A0O(r10.A0T()) != false) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04e3  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x059d  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0600  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0617  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x078f  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x07aa  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x07cd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0860  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0869  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x087f  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0984  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0988  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0999  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x025f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C92874i3 r38, X.C1417376t r39, X.AnonymousClass1E7 r40, X.C38471rL r41, boolean r42, boolean r43) {
        /*
            r0 = r38
            com.whatsapp.biz.viewmodel.BusinessDetailsViewModel r10 = r0.A0h
            r6 = r40
            r10.A00 = r6
            r0.A07(r6)
            android.view.View r5 = r0.A0Q
            X.C17960vV.A05(r5)
            r2 = 0
            r5.setVisibility(r2)
            X.4QR r1 = r10.A01
            r38 = r1
            com.whatsapp.jid.UserJid r3 = r10.A0T()
            boolean r1 = r1.A00(r3)
            if (r1 != 0) goto L_0x098e
            X.1E7 r3 = r10.A00
            X.2lf r1 = r3.A0H
            if (r1 != 0) goto L_0x0039
            X.1E7 r1 = r3.A0I
            if (r1 != 0) goto L_0x0039
            X.11S r3 = r0.A0X
            com.whatsapp.jid.UserJid r1 = r10.A0T()
            boolean r1 = r3.A0O(r1)
            r3 = 0
            if (r1 == 0) goto L_0x003a
        L_0x0039:
            r3 = 1
        L_0x003a:
            android.view.View r1 = r0.A00
            r37 = r1
            X.C17960vV.A05(r37)
            r4 = r41
            r1.setOnClickListener(r4)
            if (r3 != 0) goto L_0x098e
            X.11S r1 = r0.A0X
            boolean r1 = r1.A0N()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x098e
            r1 = r37
            A00(r1, r0, r2)
        L_0x0057:
            X.AEW r1 = r0.A0G
            if (r1 != 0) goto L_0x0988
            r16 = 0
        L_0x005d:
            r1 = 2131428558(0x7f0b04ce, float:1.8478764E38)
            android.view.View r7 = X.AnonymousClass1HF.A06(r5, r1)
            X.AEW r3 = r0.A0G
            if (r3 == 0) goto L_0x007a
            boolean r1 = r3.A00()
            if (r1 == 0) goto L_0x0757
            java.lang.String r1 = r3.A0N
            if (r1 != 0) goto L_0x0757
            java.util.List r1 = r3.A0P
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0757
        L_0x007a:
            r4 = 8
            r7.setVisibility(r4)
        L_0x007f:
            com.whatsapp.jid.UserJid r2 = r10.A0T()
            X.C17960vV.A07(r2)
            r1 = 0
            r0.A0C(r2, r1)
            r2 = 2131427509(0x7f0b00b5, float:1.8476636E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r5, r2)
            r2 = 2131427486(0x7f0b009e, float:1.847659E38)
            android.view.View r14 = X.AnonymousClass1HF.A06(r5, r2)
            r2 = 2131427527(0x7f0b00c7, float:1.8476673E38)
            android.view.View r9 = X.AnonymousClass1HF.A06(r5, r2)
            r2 = 2131427513(0x7f0b00b9, float:1.8476644E38)
            android.view.View r13 = X.AnonymousClass1HF.A06(r5, r2)
            r2 = 2131427496(0x7f0b00a8, float:1.847661E38)
            android.view.View r12 = X.AnonymousClass1HF.A06(r5, r2)
            r2 = 2131427520(0x7f0b00c0, float:1.8476659E38)
            android.view.View r11 = X.AnonymousClass1HF.A06(r5, r2)
            com.whatsapp.jid.UserJid r8 = r10.A0T()
            X.C17960vV.A07(r8)
            X.12L r7 = r0.A0u
            com.whatsapp.jid.UserJid r2 = r10.A0T()
            boolean r19 = X.C42761yh.A01(r7, r2)
            int r2 = X.C72453Mb.A07(r43)
            r3.setVisibility(r2)
            r2 = 7
            X.C825248h.A00(r3, r0, r8, r2)
            X.1E7 r2 = r10.A00
            boolean r2 = r2.A0C()
            r18 = 1
            if (r2 == 0) goto L_0x00e4
            X.1PM r2 = r0.A0n
            boolean r2 = r2.A04(r8)
            r17 = 1
            if (r2 != 0) goto L_0x00e6
        L_0x00e4:
            r17 = 0
        L_0x00e6:
            if (r19 != 0) goto L_0x0109
            r2 = 20
            X.AnonymousClass3Ma.A1C(r14, r0, r2)
            X.0ve r15 = r0.A0t
            r3 = 4067(0xfe3, float:5.699E-42)
            X.0vf r2 = X.C18040vf.A02
            int r3 = X.C18020vd.A00(r2, r15, r3)
            if (r17 == 0) goto L_0x0737
            r2 = r18
            if (r3 < r2) goto L_0x0109
            X.10I r15 = r0.A16
            r3 = 43
            X.AkK r2 = new X.AkK
            r2.<init>(r0, r14, r3)
            r15.CGF(r2)
        L_0x0109:
            boolean r2 = A09(r0)
            if (r2 != 0) goto L_0x0123
            X.AEW r2 = r0.A0G
            if (r2 == 0) goto L_0x06ef
            boolean r2 = r2.A0f
            if (r2 == 0) goto L_0x06ef
            X.0ve r14 = r0.A0t
            r3 = 957(0x3bd, float:1.341E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r14, r3)
            if (r2 == 0) goto L_0x06ef
        L_0x0123:
            r9.setVisibility(r4)
        L_0x0126:
            r13.setVisibility(r4)
            X.0ve r9 = r0.A0t
            r2 = 5415(0x1527, float:7.588E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r3, r9, r2)
            if (r2 == 0) goto L_0x0150
            X.2tK r8 = X.C63572tK.A0F
            X.1QJ r2 = r0.A0x
            X.2tK r2 = r2.A02()
            if (r8 != r2) goto L_0x0150
            r2 = 15
            X.AnonymousClass3Ma.A1C(r13, r0, r2)
            X.10I r14 = r0.A16
            r8 = 44
            X.AkK r2 = new X.AkK
            r2.<init>(r0, r13, r8)
            r14.CGF(r2)
        L_0x0150:
            X.1DC r2 = r0.A0J
            X.1DD r2 = (X.AnonymousClass1DD) r2
            X.11S r2 = r2.A00
            boolean r2 = r2.A0N()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x06ea
            com.whatsapp.jid.UserJid r8 = r10.A0T()
            r2 = r38
            boolean r2 = r2.A00(r8)
            if (r2 != 0) goto L_0x06ea
            r2 = 16
            X.AnonymousClass3Ma.A1C(r12, r0, r2)
        L_0x016f:
            if (r19 != 0) goto L_0x0187
            com.whatsapp.jid.UserJid r8 = r10.A0T()
            boolean r2 = X.C42701yb.A01(r8)
            if (r2 == 0) goto L_0x06df
            X.00H r2 = r0.A1A
            X.1Ps r2 = X.AnonymousClass3MW.A0W(r2)
            boolean r2 = r2.A0D(r8)
            if (r2 == 0) goto L_0x06df
        L_0x0187:
            r8 = 36
            X.AFU r2 = new X.AFU
            r2.<init>((java.lang.Object) r0, (int) r8)
            r11.setOnClickListener(r2)
            r11.setVisibility(r1)
        L_0x0194:
            com.whatsapp.WaTextView r11 = r0.A06
            X.AEW r2 = r0.A0G
            if (r2 == 0) goto L_0x01a7
            boolean r2 = r2.A0d
            if (r2 == 0) goto L_0x01a7
            r2 = 3464(0xd88, float:4.854E-42)
            boolean r8 = X.C18020vd.A05(r3, r9, r2)
            r2 = 0
            if (r8 != 0) goto L_0x01a9
        L_0x01a7:
            r2 = 8
        L_0x01a9:
            r11.setVisibility(r2)
            X.1Me r12 = r0.A0o
            X.1yg r2 = r12.A0H(r6, r1)
            java.lang.String r13 = r2.A01
            com.whatsapp.biz.view.MetaVerifiedTextEmojiLabel r11 = r0.A0g
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0l
            r31 = r2
            if (r13 != 0) goto L_0x01c0
            java.lang.String r13 = r6.A0L()
        L_0x01c0:
            java.util.HashMap r2 = X.C26302CxJ.A01
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r13)
            X.BGo r2 = new X.BGo
            r2.<init>()
            int r13 = r13.length()
            r8.setSpan(r2, r1, r13, r1)
            android.widget.TextView$BufferType r2 = android.widget.TextView.BufferType.SPANNABLE
            r11.setText(r8, r2)
            boolean r2 = r6.A0O()
            if (r2 != 0) goto L_0x0686
            boolean r2 = r6.A0P()
            if (r2 != 0) goto L_0x0686
            r11.A00 = r1
            java.lang.CharSequence r2 = r11.A01
            r11.setText(r2)
            com.whatsapp.biz.view.MetaVerifiedTextEmojiLabel r2 = r0.A0f
            r2.A00 = r1
            java.lang.CharSequence r8 = r2.A01
            r2.setText(r8)
            r8 = 0
        L_0x01f5:
            r11.setOnClickListener(r8)
            r2.setOnClickListener(r8)
        L_0x01fb:
            boolean r8 = A0A(r0)
            if (r8 == 0) goto L_0x0617
            r2.setVisibility(r1)
            r13 = 2131887348(0x7f1204f4, float:1.94093E38)
            java.lang.String r12 = r6.A0L()
            r7 = 5276(0x149c, float:7.393E-42)
            boolean r7 = X.C18020vd.A05(r3, r9, r7)
            r8 = 2131232391(0x7f080687, float:1.808089E38)
            if (r7 == 0) goto L_0x0219
            r8 = 2131232390(0x7f080686, float:1.8080888E38)
        L_0x0219:
            boolean r7 = r6.A0B()
            if (r7 == 0) goto L_0x0606
            java.lang.String r7 = r6.A0K()
            if (r7 == 0) goto L_0x0606
            java.lang.String r7 = r6.A0K()
            r11.setText(r7)
            if (r12 == 0) goto L_0x023e
            r2.setText(r13)
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()
            java.lang.String r7 = " · "
            java.lang.String r7 = X.AnonymousClass001.A1H(r7, r12, r11)
            r2.append(r7)
        L_0x023e:
            boolean r7 = r6.A0O()
            if (r7 == 0) goto L_0x0247
            r2.setInlineDrawableAfterText(r8)
        L_0x0247:
            X.1E7 r7 = r10.A00
            boolean r7 = r7.A0O()
            if (r7 != 0) goto L_0x0257
            X.1E7 r7 = r10.A00
            boolean r7 = r7.A0P()
            if (r7 == 0) goto L_0x0600
        L_0x0257:
            r7 = 8438(0x20f6, float:1.1824E-41)
            boolean r7 = X.C18020vd.A05(r3, r9, r7)
            if (r7 == 0) goto L_0x0600
            X.72R r8 = r0.A0d
            r7 = 31
            r8.A02(r7)
            X.1bI r11 = r0.A0K
            android.view.View r7 = r11.A00
            if (r7 != 0) goto L_0x027f
            android.view.View r8 = r11.A02()
            r7 = 19
            X.AnonymousClass3Ma.A1C(r8, r0, r7)
            android.widget.TextView r8 = X.AnonymousClass3MX.A0M(r11)
            r7 = 2131892236(0x7f12180c, float:1.9419215E38)
            r8.setText(r7)
        L_0x027f:
            r7 = 0
        L_0x0280:
            r11.A04(r7)
            android.widget.TextView r7 = r0.A02
            r7.setVisibility(r4)
            if (r42 == 0) goto L_0x0294
            X.24e r7 = r0.A0U
            if (r7 == 0) goto L_0x058b
            com.whatsapp.jid.UserJid r7 = r7.A04
            boolean r7 = r7 instanceof X.C42711yc
            if (r7 == 0) goto L_0x058b
        L_0x0294:
            X.3oH r7 = r0.A0m
            r30 = r7
            android.view.ViewTreeObserver r7 = r30.getViewTreeObserver()
            r13 = 3
            X.C90584eJ.A00(r7, r0, r13)
            r7 = 2582(0xa16, float:3.618E-42)
            boolean r7 = X.C18020vd.A05(r3, r9, r7)
            if (r7 == 0) goto L_0x02e0
            X.AEW r7 = r0.A0G
            if (r7 == 0) goto L_0x0584
            java.lang.String r11 = r7.A0G
            boolean r7 = X.AnonymousClass1EG.A0H(r11)
            if (r7 != 0) goto L_0x0584
            java.lang.Object[] r8 = X.AnonymousClass3MW.A1b()
            java.lang.String r7 = "wa.me"
            r8[r1] = r7
            r7 = 1
            r8[r7] = r11
            java.lang.String r7 = "%s/%s"
            java.lang.String r12 = java.lang.String.format(r7, r8)
            com.whatsapp.jid.UserJid r11 = r10.A0T()
            X.C17960vV.A07(r11)
            com.whatsapp.WaTextView r8 = r0.A05
            r8.setText(r12)
            r8.setVisibility(r1)
            r7 = 6
            X.C825248h.A00(r8, r0, r11, r7)
            X.4dl r7 = new X.4dl
            r7.<init>(r1, r12, r0)
            r8.setOnLongClickListener(r7)
        L_0x02e0:
            X.AEW r7 = r0.A0G
            r18 = r7
            if (r7 == 0) goto L_0x0388
            X.ADg r11 = r7.A06
            if (r11 == 0) goto L_0x0388
            r7 = 2131429361(0x7f0b07f1, float:1.8480393E38)
            android.view.View r17 = X.AnonymousClass1HF.A06(r5, r7)
            r16 = 8
            X.AEB r7 = r11.A00
            if (r7 != 0) goto L_0x0478
            X.AEB r8 = r11.A01
            if (r8 != 0) goto L_0x0478
        L_0x02fb:
            r12 = r17
            r11 = r16
            r12.setVisibility(r11)
            com.whatsapp.jid.UserJid r16 = r10.A0T()
            if (r7 == 0) goto L_0x0471
            X.1XN r11 = r0.A0w
            boolean r7 = r7.A03
            if (r7 == 0) goto L_0x0471
            X.0ve r13 = r11.A03
            r7 = 3487(0xd9f, float:4.886E-42)
            boolean r7 = X.C18020vd.A05(r3, r13, r7)
            if (r7 != 0) goto L_0x0320
            r7 = 2781(0xadd, float:3.897E-42)
            boolean r7 = X.C18020vd.A05(r3, r13, r7)
            if (r7 == 0) goto L_0x0471
        L_0x0320:
            com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r12 = r0.A0A
            r12.setVisibility(r1)
            java.lang.Integer r14 = r0.A1E
            X.76t r11 = r0.A0F
            boolean r22 = r0.A0D()
            r7 = 3487(0xd9f, float:4.886E-42)
            boolean r7 = X.C18020vd.A05(r3, r13, r7)
            boolean r23 = X.AnonymousClass000.A1O(r7)
            X.72R r7 = r0.A0d
            r19 = r1
            r15 = r12
            r17 = r1
            r20 = r14
            r21 = r11
            r24 = r7
            r15.setup(r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x0347:
            if (r8 == 0) goto L_0x046a
            X.1XN r11 = r0.A0w
            boolean r7 = r8.A03
            if (r7 == 0) goto L_0x046a
            X.0ve r13 = r11.A03
            r7 = 3486(0xd9e, float:4.885E-42)
            boolean r7 = X.C18020vd.A05(r3, r13, r7)
            if (r7 != 0) goto L_0x0361
            r7 = 2780(0xadc, float:3.896E-42)
            boolean r7 = X.C18020vd.A05(r3, r13, r7)
            if (r7 == 0) goto L_0x046a
        L_0x0361:
            com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r11 = r0.A0B
            r11.setVisibility(r1)
            java.lang.Integer r12 = r0.A1E
            X.76t r8 = r0.A0F
            boolean r22 = r0.A0D()
            r7 = 3486(0xd9e, float:4.885E-42)
            boolean r7 = X.C18020vd.A05(r3, r13, r7)
            boolean r23 = X.AnonymousClass000.A1O(r7)
            X.72R r7 = r0.A0d
            r19 = 1
            r15 = r11
            r17 = r1
            r20 = r12
            r21 = r8
            r24 = r7
            r15.setup(r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x0388:
            X.AEW r7 = r0.A0G
            if (r7 == 0) goto L_0x0464
            X.ADg r8 = r7.A06
            if (r8 == 0) goto L_0x0464
            X.AEB r7 = r8.A00
            if (r7 != 0) goto L_0x0396
            r0.A0M = r1
        L_0x0396:
            X.AEB r7 = r8.A01
            if (r7 != 0) goto L_0x039c
            r0.A0N = r1
        L_0x039c:
            X.4jT r8 = new X.4jT
            r8.<init>(r0, r1)
            r7 = r30
            r7.A0O = r8
        L_0x03a5:
            X.9qO r8 = r0.A0i
            X.1E7 r7 = r10.A00
            boolean r7 = r8.A02(r7)
            r12 = 0
            if (r7 == 0) goto L_0x03bd
            X.1MB r8 = r0.A0H
            com.whatsapp.jid.UserJid r7 = r10.A0T()
            boolean r7 = r8.A03(r7)
            r11 = 1
            if (r7 == 0) goto L_0x03be
        L_0x03bd:
            r11 = 0
        L_0x03be:
            com.whatsapp.InfoCard r8 = r0.A03
            if (r11 != 0) goto L_0x03c4
            r12 = 8
        L_0x03c4:
            A00(r8, r0, r12)
            r0.A0L = r11
            r7 = 18
            X.AnonymousClass3Ma.A1C(r8, r0, r7)
            if (r11 == 0) goto L_0x03da
            r7 = 1
            X.4jT r11 = new X.4jT
            r11.<init>(r0, r7)
            r7 = r30
            r7.A0O = r11
        L_0x03da:
            X.AEW r7 = r0.A0G
            if (r7 == 0) goto L_0x041c
            java.lang.String r7 = r7.A0J
            boolean r7 = X.AnonymousClass1EG.A0H(r7)
            if (r7 != 0) goto L_0x041c
            r7 = 2852(0xb24, float:3.997E-42)
            boolean r7 = X.C18020vd.A05(r3, r9, r7)
            if (r7 == 0) goto L_0x041c
            com.whatsapp.jid.UserJid r11 = r10.A0T()
            r7 = r38
            boolean r7 = r7.A00(r11)
            if (r7 != 0) goto L_0x041c
            com.whatsapp.jid.UserJid r7 = r10.A0T()
            boolean r7 = X.C42701yb.A01(r7)
            if (r7 != 0) goto L_0x041c
            r7 = 2131432460(0x7f0b140c, float:1.8486678E38)
            android.view.View r11 = X.AnonymousClass1HF.A06(r5, r7)
            r11.setVisibility(r1)
            r7 = 2131432461(0x7f0b140d, float:1.848668E38)
            android.widget.TextView r11 = X.AnonymousClass3MW.A0J(r11, r7)
            X.AEW r7 = r0.A0G
            java.lang.String r7 = r7.A0J
            r11.setText(r7)
        L_0x041c:
            X.AEW r7 = r0.A0G
            if (r7 == 0) goto L_0x0a10
            java.util.List r7 = r7.A0O
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0a10
            r7 = 3286(0xcd6, float:4.605E-42)
            boolean r3 = X.C18020vd.A05(r3, r9, r7)
            if (r3 == 0) goto L_0x0a10
            r3 = 2131435214(0x7f0b1ece, float:1.8492264E38)
            android.view.View r12 = X.AnonymousClass1HF.A06(r5, r3)
            r12.setVisibility(r1)
            X.4P2 r7 = r0.A0E
            if (r7 != 0) goto L_0x0455
            X.1KB r11 = r0.A0V
            X.0vb r3 = r0.A0s
            android.content.Context r14 = r12.getContext()
            X.4P2 r7 = new X.4P2
            r13 = r7
            r15 = r12
            r16 = r11
            r17 = r3
            r18 = r9
            r13.<init>(r14, r15, r16, r17, r18)
            r0.A0E = r7
        L_0x0455:
            X.AEW r3 = r0.A0G
            java.util.List r3 = r3.A0O
            X.3WU r9 = r7.A00
            if (r9 != 0) goto L_0x0999
            java.lang.String r0 = "serviceOfferingsGridAdapter"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0464:
            r0.A0M = r1
            r0.A0N = r1
            goto L_0x03a5
        L_0x046a:
            com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r7 = r0.A0B
            r7.setVisibility(r4)
            goto L_0x0388
        L_0x0471:
            com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r7 = r0.A0A
            r7.setVisibility(r4)
            goto L_0x0347
        L_0x0478:
            r8 = 2131436448(0x7f0b23a0, float:1.8494767E38)
            android.view.View r8 = X.AnonymousClass1HF.A06(r5, r8)
            com.whatsapp.biz.profile.TrustSignalItem r8 = (com.whatsapp.biz.profile.TrustSignalItem) r8
            r0.A0C = r8
            r8 = 2131436449(0x7f0b23a1, float:1.8494769E38)
            android.view.View r8 = X.AnonymousClass1HF.A06(r5, r8)
            com.whatsapp.biz.profile.TrustSignalItem r8 = (com.whatsapp.biz.profile.TrustSignalItem) r8
            r0.A0D = r8
            com.whatsapp.jid.UserJid r8 = r10.A0T()
            java.lang.String r27 = X.C22971Dz.A06(r8)
            X.1XN r14 = r0.A0w
            if (r7 == 0) goto L_0x0543
            boolean r8 = r7.A03
            if (r8 == 0) goto L_0x0543
            X.0ve r12 = r14.A03
            r8 = 3487(0xd9f, float:4.886E-42)
            boolean r8 = X.C18020vd.A05(r3, r12, r8)
            if (r8 != 0) goto L_0x04b0
            r8 = 2781(0xadd, float:3.897E-42)
            boolean r8 = X.C18020vd.A05(r3, r12, r8)
            if (r8 == 0) goto L_0x0543
        L_0x04b0:
            com.whatsapp.biz.profile.TrustSignalItem r8 = r0.A0C
            r8.setVisibility(r4)
        L_0x04b5:
            X.AEB r8 = r11.A01
            if (r8 == 0) goto L_0x0505
            boolean r11 = r8.A03
            if (r11 == 0) goto L_0x0505
            X.0ve r12 = r14.A03
            r11 = 3486(0xd9e, float:4.885E-42)
            boolean r11 = X.C18020vd.A05(r3, r12, r11)
            if (r11 != 0) goto L_0x04cf
            r11 = 2780(0xadc, float:3.896E-42)
            boolean r11 = X.C18020vd.A05(r3, r12, r11)
            if (r11 == 0) goto L_0x0505
        L_0x04cf:
            com.whatsapp.biz.profile.TrustSignalItem r11 = r0.A0D
            r11.setVisibility(r4)
        L_0x04d4:
            r11 = 2131436451(0x7f0b23a3, float:1.8494773E38)
            android.view.View r13 = X.AnonymousClass1HF.A06(r5, r11)
            com.whatsapp.biz.profile.TrustSignalItem r11 = r0.A0C
            int r11 = r11.getVisibility()
            if (r11 != 0) goto L_0x04ec
            com.whatsapp.biz.profile.TrustSignalItem r11 = r0.A0D
            int r12 = r11.getVisibility()
            r11 = 0
            if (r12 == 0) goto L_0x04ee
        L_0x04ec:
            r11 = 8
        L_0x04ee:
            r13.setVisibility(r11)
            com.whatsapp.biz.profile.TrustSignalItem r11 = r0.A0C
            int r11 = r11.getVisibility()
            if (r11 == 0) goto L_0x0501
            com.whatsapp.biz.profile.TrustSignalItem r11 = r0.A0D
            int r11 = r11.getVisibility()
            if (r11 != 0) goto L_0x02fb
        L_0x0501:
            r16 = 0
            goto L_0x02fb
        L_0x0505:
            X.1L9 r15 = r0.A0S
            com.whatsapp.biz.profile.TrustSignalItem r11 = r0.A0D
            X.72R r14 = r0.A0d
            java.lang.Integer r12 = r0.A1E
            r26 = r12
            X.1E7 r12 = r10.A00
            boolean r29 = r12.A0C()
            X.76t r12 = r0.A0F
            r19 = r12
            boolean r28 = r0.A0D()
            X.AnonymousClass3Ma.A1N(r15, r1, r11)
            X.C18070vi.A0d(r14, r13)
            r11.setUpFromAccount(r8)
            if (r8 == 0) goto L_0x04d4
            int r12 = r11.A00
            android.net.Uri r20 = X.AnonymousClass4ZB.A00(r8, r12)
            X.4d6 r12 = new X.4d6
            r21 = r15
            r22 = r11
            r23 = r14
            r24 = r19
            r25 = r8
            r19 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r11.setOnClickListener(r12)
            goto L_0x04d4
        L_0x0543:
            X.1L9 r8 = r0.A0S
            r21 = r8
            com.whatsapp.biz.profile.TrustSignalItem r8 = r0.A0C
            X.72R r15 = r0.A0d
            java.lang.Integer r12 = r0.A1E
            r26 = r12
            X.1E7 r12 = r10.A00
            boolean r29 = r12.A0C()
            X.76t r12 = r0.A0F
            r19 = r12
            boolean r28 = r0.A0D()
            r12 = r21
            X.AnonymousClass3Ma.A1N(r12, r1, r8)
            X.C18070vi.A0d(r15, r13)
            r8.setUpFromAccount(r7)
            if (r7 == 0) goto L_0x04b5
            int r12 = r8.A00
            android.net.Uri r20 = X.AnonymousClass4ZB.A00(r7, r12)
            X.4d6 r12 = new X.4d6
            r22 = r8
            r23 = r15
            r24 = r19
            r25 = r7
            r19 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r8.setOnClickListener(r12)
            goto L_0x04b5
        L_0x0584:
            com.whatsapp.WaTextView r7 = r0.A05
            r7.setVisibility(r4)
            goto L_0x02e0
        L_0x058b:
            X.AEW r7 = r0.A0G
            if (r7 != 0) goto L_0x0597
            r8 = 2131887544(0x7f1205b8, float:1.9409698E38)
            r7 = r31
            r7.CNA(r8)
        L_0x0597:
            com.whatsapp.jid.UserJid r11 = r10.A0T()
            if (r11 == 0) goto L_0x05a4
            X.1Ty r8 = r0.A0a
            r7 = r16
            r8.A0F(r0, r11, r7)
        L_0x05a4:
            boolean r7 = r6.A0C()
            if (r7 == 0) goto L_0x0294
            X.72R r11 = r0.A0d
            com.whatsapp.jid.UserJid r7 = r10.A0T()
            java.lang.String r21 = X.C22971Dz.A06(r7)
            java.lang.Integer r13 = r0.A1E
            boolean r24 = r0.A0E()
            boolean r25 = r0.A0D()
            com.whatsapp.jid.UserJid r12 = r10.A0T()
            r8 = 0
            if (r12 == 0) goto L_0x05d5
            X.00H r7 = r10.A02
            java.lang.Object r7 = r7.get()
            X.96v r7 = (X.C1770196v) r7
            X.9rY r7 = r7.A08(r12)
            if (r7 == 0) goto L_0x05d5
            java.lang.String r8 = r7.A02
        L_0x05d5:
            r16 = 0
            r23 = 1
            X.10I r7 = r11.A03
            r18 = r16
            r19 = r16
            X.7Qa r14 = new X.7Qa
            r15 = r11
            r17 = r16
            r20 = r13
            r22 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r7.CGF(r14)
            X.AEW r7 = r0.A0G
            if (r7 == 0) goto L_0x05fb
            X.AEA r7 = r7.A05
            if (r7 == 0) goto L_0x05fb
            r7 = 19
            A02(r0, r7)
        L_0x05fb:
            A03(r0, r1)
            goto L_0x0294
        L_0x0600:
            X.1bI r11 = r0.A0K
            r7 = 8
            goto L_0x0280
        L_0x0606:
            r11.setText(r12)
            r2.setText(r13)
            boolean r7 = r6.A0O()
            if (r7 == 0) goto L_0x0247
            r11.setInlineDrawableAfterText(r8)
            goto L_0x0247
        L_0x0617:
            X.1MB r11 = r0.A0H
            X.1BI r8 = r6.A0J
            boolean r8 = r11.A03(r8)
            if (r8 == 0) goto L_0x062c
            r7 = 2131898573(0x7f1230cd, float:1.9432068E38)
            r2.setText(r7)
        L_0x0627:
            r2.setVisibility(r1)
            goto L_0x0247
        L_0x062c:
            boolean r7 = X.C42761yh.A00(r6, r7)
            if (r7 != 0) goto L_0x065a
            X.1BI r7 = r6.A0J
            boolean r7 = X.C43381zi.A01(r9, r7)
            if (r7 != 0) goto L_0x065a
            boolean r7 = r0.A1F
            if (r7 != 0) goto L_0x0681
            X.1BI r7 = r6.A0J
            boolean r7 = X.C22971Dz.A0T(r7)
            if (r7 != 0) goto L_0x0666
            boolean r7 = r6.A0B()
            if (r7 != 0) goto L_0x0666
            X.0vb r8 = r0.A0s
            java.lang.String r7 = X.AnonymousClass17K.A02(r6)
            java.lang.String r7 = r8.A0G(r7)
        L_0x0656:
            r2.setText(r7)
            goto L_0x0627
        L_0x065a:
            X.118 r7 = r0.A0r
            android.content.Context r8 = r7.A00
            r7 = 2131898332(0x7f122fdc, float:1.9431579E38)
            java.lang.String r7 = X.C80613xU.A04(r8, r7)
            goto L_0x0656
        L_0x0666:
            boolean r7 = r12.A0i(r6)
            if (r7 != 0) goto L_0x0681
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r7 = "~"
            r8.append(r7)
            java.lang.String r7 = r6.A0L()
            java.lang.String r7 = X.AnonymousClass000.A0y(r7, r8)
            r2.A0R(r7)
            goto L_0x0627
        L_0x0681:
            r2.setVisibility(r4)
            goto L_0x0247
        L_0x0686:
            X.72R r8 = r0.A0d
            r2 = 50
            r8.A02(r2)
            r2 = 5276(0x149c, float:7.393E-42)
            boolean r2 = X.C18020vd.A05(r3, r9, r2)
            r8 = 2131232391(0x7f080687, float:1.808089E38)
            if (r2 == 0) goto L_0x069b
            r8 = 2131232390(0x7f080686, float:1.8080888E38)
        L_0x069b:
            X.2lf r2 = r6.A0H
            if (r2 == 0) goto L_0x06d2
            boolean r2 = r12.A0i(r6)
            if (r2 != 0) goto L_0x06d2
            r11.A00 = r1
            java.lang.CharSequence r2 = r11.A01
            r11.setText(r2)
            com.whatsapp.biz.view.MetaVerifiedTextEmojiLabel r2 = r0.A0f
            r2.setInlineDrawableAfterText(r8)
        L_0x06b1:
            X.1BI r8 = r6.A0J
            boolean r8 = X.C22971Dz.A0Z(r8)
            if (r8 != 0) goto L_0x01fb
            r8 = 5295(0x14af, float:7.42E-42)
            boolean r8 = X.C18020vd.A05(r3, r9, r8)
            if (r8 != 0) goto L_0x06c9
            r8 = 11858(0x2e52, float:1.6617E-41)
            boolean r8 = X.C18020vd.A05(r3, r9, r8)
            if (r8 == 0) goto L_0x01fb
        L_0x06c9:
            r13 = 27
            X.78Q r8 = new X.78Q
            r8.<init>((java.lang.Object) r0, (java.lang.Object) r6, (int) r13)
            goto L_0x01f5
        L_0x06d2:
            com.whatsapp.biz.view.MetaVerifiedTextEmojiLabel r2 = r0.A0f
            r2.A00 = r1
            java.lang.CharSequence r13 = r2.A01
            r2.setText(r13)
            r11.setInlineDrawableAfterText(r8)
            goto L_0x06b1
        L_0x06df:
            boolean r2 = A0A(r0)
            if (r2 != 0) goto L_0x0187
            r11.setVisibility(r4)
            goto L_0x0194
        L_0x06ea:
            r12.setVisibility(r4)
            goto L_0x016f
        L_0x06ef:
            X.AEW r2 = r0.A0G
            if (r2 == 0) goto L_0x0716
            X.9uX r3 = r0.A0Z
            boolean r2 = r3.A02(r2)
            if (r2 == 0) goto L_0x0716
            X.AEW r2 = r0.A0G
            java.lang.String r3 = r3.A00(r2)
            java.lang.String r2 = "PERMANENT"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0716
            X.48h r3 = new X.48h
            r3.<init>(r0, r8, r4)
        L_0x070e:
            r9.setOnClickListener(r3)
            r9.setVisibility(r1)
            goto L_0x0126
        L_0x0716:
            X.9uX r3 = r0.A0Z
            X.AEW r2 = r0.A0G
            boolean r2 = r3.A01(r2)
            if (r2 == 0) goto L_0x0123
            r8 = r9
            com.whatsapp.wds.components.actiontile.WDSActionTile r8 = (com.whatsapp.wds.components.actiontile.WDSActionTile) r8
            r3 = 2131231647(0x7f08039f, float:1.807938E38)
            r2 = 2131888753(0x7f120a71, float:1.941215E38)
            r8.setIcon((int) r3)
            r8.setText((int) r2)
            r2 = 21
            X.9Aa r3 = new X.9Aa
            r3.<init>(r0, r2)
            goto L_0x070e
        L_0x0737:
            X.11S r3 = r0.A0X
            X.1E7 r2 = r10.A00
            boolean r2 = X.AnonymousClass3Ma.A1V(r3, r2)
            if (r2 != 0) goto L_0x0752
            boolean r2 = A09(r0)
            if (r2 != 0) goto L_0x0752
            boolean r2 = A0A(r0)
            if (r2 != 0) goto L_0x0752
            r14.setVisibility(r1)
            goto L_0x0109
        L_0x0752:
            r14.setVisibility(r4)
            goto L_0x0109
        L_0x0757:
            X.AEW r1 = r0.A0G
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x076b
            X.1MB r3 = r0.A0H
            com.whatsapp.jid.UserJid r1 = r10.A0T()
            boolean r1 = r3.A03(r1)
            if (r1 == 0) goto L_0x007a
        L_0x076b:
            X.0ve r8 = r0.A0t
            X.AnonymousClass3Ma.A1N(r8, r2, r6)
            boolean r1 = r6.A0E()
            if (r1 == 0) goto L_0x077e
            boolean r1 = X.C84104Hw.A00(r8)
            if (r1 == 0) goto L_0x077e
            goto L_0x007a
        L_0x077e:
            r7.setVisibility(r2)
            X.AEW r4 = r0.A0G
            X.1MB r3 = r0.A0H
            com.whatsapp.jid.UserJid r1 = r10.A0T()
            boolean r1 = r3.A03(r1)
            if (r1 == 0) goto L_0x0984
            com.whatsapp.chatinfo.ContactInfoActivity r3 = r0.A0l
            r1 = 2131898574(0x7f1230ce, float:1.943207E38)
            java.lang.String r4 = r3.getString(r1)
        L_0x0798:
            com.whatsapp.biz.BusinessProfileFieldView r7 = r0.A08
            r3 = 35
            X.AFU r1 = new X.AFU
            r1.<init>((java.lang.Object) r0, (int) r3)
            r7.setText(r4, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x07c3
            r3 = 37
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r8, r3)
            if (r1 == 0) goto L_0x097c
            com.whatsapp.chatinfo.ContactInfoActivity r4 = r0.A0l
            r3 = 2130970338(0x7f0406e2, float:1.7549383E38)
            r1 = 2131101307(0x7f06067b, float:1.781502E38)
            int r1 = X.AnonymousClass3Ma.A00(r4, r3, r1)
            r7.setTextColor(r1)
        L_0x07c3:
            r1 = 37
            X.0vf r7 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r7, r8, r1)
            if (r1 != 0) goto L_0x087f
            X.A4l r4 = r0.A07
            if (r4 != 0) goto L_0x0833
            r1 = 2131428559(0x7f0b04cf, float:1.8478766E38)
            android.view.ViewStub r2 = X.AnonymousClass3MW.A0E(r5, r1)
            r1 = 2131626968(0x7f0e0bd8, float:1.8881187E38)
            android.view.View r18 = X.AnonymousClass3MY.A0G(r2, r1)
            X.11S r1 = r0.A0X
            r21 = r1
            X.1L9 r1 = r0.A0S
            r19 = r1
            X.689 r15 = r0.A1P
            X.1Me r14 = r0.A0o
            X.0vb r13 = r0.A0s
            X.9nw r12 = r0.A1K
            X.1XN r11 = r0.A0w
            X.72R r9 = r0.A0d
            java.lang.Integer r3 = r0.A1E
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0l
            boolean r35 = r0.A0E()
            com.whatsapp.jid.UserJid r4 = r10.A0T()
            r1 = r38
            boolean r36 = r1.A00(r4)
            X.00H r1 = r0.A1X
            java.lang.Object r1 = r1.get()
            X.1LU r1 = (X.AnonymousClass1LU) r1
            r34 = 0
            r33 = 8388613(0x800005, float:1.175495E-38)
            X.A4l r4 = new X.A4l
            r24 = r39
            r17 = r4
            r20 = r2
            r22 = r12
            r23 = r9
            r25 = r14
            r26 = r13
            r27 = r6
            r28 = r8
            r29 = r1
            r30 = r15
            r31 = r11
            r32 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r0.A07 = r4
        L_0x0833:
            X.AEW r1 = r0.A0G
            r4.A02(r1)
        L_0x0838:
            com.whatsapp.chatinfo.ContactInfoActivity r3 = r0.A0l
            r3.populatePhoneNumber(r5)
            X.9uX r2 = r0.A0Z
            X.AEW r1 = r0.A0G
            boolean r1 = r2.A01(r1)
            if (r1 == 0) goto L_0x0865
            r1 = 2131436113(0x7f0b2251, float:1.8494087E38)
            android.widget.ImageView r2 = X.AnonymousClass3MX.A0I(r3, r1)
            if (r2 == 0) goto L_0x0865
            X.AEW r1 = r0.A0G
            if (r1 == 0) goto L_0x0869
            boolean r1 = r1.A0f
            if (r1 == 0) goto L_0x0869
            r1 = 957(0x3bd, float:1.341E-42)
            boolean r1 = X.C18020vd.A05(r7, r8, r1)
            if (r1 == 0) goto L_0x0869
            r1 = 8
            r2.setVisibility(r1)
        L_0x0865:
            r4 = 8
            goto L_0x007f
        L_0x0869:
            r1 = 0
            r2.setVisibility(r1)
            r1 = 2131231647(0x7f08039f, float:1.807938E38)
            r2.setImageResource(r1)
            r1 = 2131888753(0x7f120a71, float:1.941215E38)
            X.AnonymousClass3MY.A0w(r3, r2, r1)
            r1 = 17
            X.AnonymousClass3Ma.A1C(r2, r0, r1)
            goto L_0x0865
        L_0x087f:
            X.AEW r4 = r0.A0G
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            X.ADs r1 = r4.A04
            if (r1 == 0) goto L_0x0895
            com.whatsapp.chatinfo.ContactInfoActivity r3 = r0.A0l
            r1 = 2131887540(0x7f1205b4, float:1.940969E38)
            java.lang.String r1 = r3.getString(r1)
            r9.add(r1)
        L_0x0895:
            X.AEH r3 = r4.A08
            X.AEH r1 = X.AEH.A04
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x08ab
            com.whatsapp.chatinfo.ContactInfoActivity r3 = r0.A0l
            r1 = 2131887537(0x7f1205b1, float:1.9409684E38)
            java.lang.String r1 = r3.getString(r1)
            r9.add(r1)
        L_0x08ab:
            java.lang.String r1 = r4.A0N
            if (r1 == 0) goto L_0x08bb
            com.whatsapp.chatinfo.ContactInfoActivity r3 = r0.A0l
            r1 = 2131887538(0x7f1205b2, float:1.9409686E38)
            java.lang.String r1 = r3.getString(r1)
            r9.add(r1)
        L_0x08bb:
            java.lang.String r1 = r4.A0I
            if (r1 == 0) goto L_0x08cb
            com.whatsapp.chatinfo.ContactInfoActivity r3 = r0.A0l
            r1 = 2131887539(0x7f1205b3, float:1.9409688E38)
            java.lang.String r1 = r3.getString(r1)
            r9.add(r1)
        L_0x08cb:
            java.util.List r3 = r4.A0V
            boolean r1 = r3.isEmpty()
            r4 = 1
            if (r1 != 0) goto L_0x0948
            java.util.Iterator r14 = r3.iterator()
            r11 = 0
            r13 = 0
        L_0x08da:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0927
            java.lang.String r3 = X.C17880vN.A0v(r14)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x08da
            java.lang.String r1 = X.C87364Vh.A01(r3)
            android.net.Uri r12 = android.net.Uri.parse(r1)
            java.lang.String r3 = r12.getHost()
            java.lang.String r1 = "www.instagram.com"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0925
            java.lang.String r3 = r12.getHost()
            java.lang.String r1 = "instagram.com"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0925
            java.lang.String r3 = r12.getHost()
            java.lang.String r1 = "instagr.am"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0925
            java.lang.String r3 = r12.getHost()
            java.lang.String r1 = "www.instagr.am"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0925
            int r11 = r11 + 1
            goto L_0x08da
        L_0x0925:
            r13 = 1
            goto L_0x08da
        L_0x0927:
            if (r11 <= 0) goto L_0x093a
            com.whatsapp.chatinfo.ContactInfoActivity r3 = r0.A0l
            r1 = 2131887542(0x7f1205b6, float:1.9409694E38)
            if (r11 <= r4) goto L_0x0933
            r1 = 2131887543(0x7f1205b7, float:1.9409696E38)
        L_0x0933:
            java.lang.String r1 = r3.getString(r1)
            r9.add(r1)
        L_0x093a:
            if (r13 == 0) goto L_0x0948
            com.whatsapp.chatinfo.ContactInfoActivity r3 = r0.A0l
            r1 = 2131887541(0x7f1205b5, float:1.9409692E38)
            java.lang.String r1 = r3.getString(r1)
            r9.add(r1)
        L_0x0948:
            X.0vb r1 = r0.A0s
            java.lang.String r4 = X.C60592oI.A00(r1, r9, r4)
            android.view.View r1 = r0.A0O
            if (r1 != 0) goto L_0x0838
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x0838
            r1 = 2131433338(0x7f0b177a, float:1.8488459E38)
            android.view.ViewStub r3 = X.AnonymousClass3MW.A0E(r5, r1)
            r1 = 2131626973(0x7f0e0bdd, float:1.8881197E38)
            android.view.View r3 = X.AnonymousClass3MY.A0G(r3, r1)
            r0.A0O = r3
            r1 = 2131433336(0x7f0b1778, float:1.8488455E38)
            X.C72453Mb.A1F(r3, r4, r1)
            r1 = 2131433337(0x7f0b1779, float:1.8488457E38)
            X.AnonymousClass3MY.A1B(r5, r1, r2)
            android.view.View r2 = r0.A0O
            r1 = 5
            X.C825248h.A00(r2, r0, r6, r1)
            goto L_0x0838
        L_0x097c:
            r1 = 2131232334(0x7f08064e, float:1.8080774E38)
            r7.setIcon((int) r1)
            goto L_0x07c3
        L_0x0984:
            java.lang.String r4 = r4.A0H
            goto L_0x0798
        L_0x0988:
            java.lang.String r1 = r1.A0M
            r16 = r1
            goto L_0x005d
        L_0x098e:
            android.view.View r1 = r0.A00
            r37 = r1
            r3 = 8
            A00(r1, r0, r3)
            goto L_0x0057
        L_0x0999:
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.LinkedHashMap r13 = X.C17880vN.A13()
            java.util.Iterator r14 = r3.iterator()
        L_0x09a5:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x09be
            java.lang.Object r12 = r14.next()
            r3 = r12
            X.AEL r3 = (X.AEL) r3
            java.lang.String r3 = r3.A02
            java.lang.Object r3 = X.C72473Md.A0h(r3, r13)
            java.util.List r3 = (java.util.List) r3
            r3.add(r12)
            goto L_0x09a5
        L_0x09be:
            java.util.Iterator r15 = X.AnonymousClass000.A15(r13)
        L_0x09c2:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x09f1
            java.lang.Object r13 = X.C17890vO.A0P(r15)
            java.util.List r13 = (java.util.List) r13
            java.util.Iterator r14 = r13.iterator()
        L_0x09d2:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x09e9
            java.lang.Object r12 = r14.next()
            r3 = r12
            X.AEL r3 = (X.AEL) r3
            boolean r3 = r3.A04
            if (r3 == 0) goto L_0x09d2
            if (r12 == 0) goto L_0x09e9
            r11.add(r12)
            goto L_0x09c2
        L_0x09e9:
            java.lang.Object r3 = r13.get(r1)
            r11.add(r3)
            goto L_0x09c2
        L_0x09f1:
            X.0vb r3 = r7.A04
            java.util.Locale r3 = r3.A0N()
            java.text.Collator r3 = java.text.Collator.getInstance(r3)
            r3.setStrength(r1)
            X.5W5 r7 = new X.5W5
            r7.<init>(r3)
            r3 = 1
            java.util.List r7 = X.C98974s1.A00(r11, r7, r3)
            X.C18070vi.A0d(r7, r1)
            java.util.List r3 = r9.A01
            X.C72453Mb.A1J(r9, r7, r3)
        L_0x0a10:
            X.00H r7 = r0.A1A
            X.1Ps r11 = X.AnonymousClass3MW.A0W(r7)
            com.whatsapp.jid.UserJid r3 = r10.A0T()
            if (r3 == 0) goto L_0x0a54
            boolean r3 = r11.A0D(r3)
            if (r3 == 0) goto L_0x0a54
            com.whatsapp.jid.UserJid r9 = r10.A0T()
            X.24e r3 = r0.A0U
            if (r3 == 0) goto L_0x0ba5
            boolean r13 = r3.A0I
            if (r13 == 0) goto L_0x0b46
            X.1Ps r7 = X.AnonymousClass3MW.A0W(r7)
            boolean r7 = r7.A0D(r9)
            if (r7 == 0) goto L_0x0b46
            X.00H r7 = r0.A1C
            X.1UD r7 = X.AnonymousClass3MW.A0X(r7)
            boolean r7 = r7.A06()
            if (r7 == 0) goto L_0x0b46
            r0.A0B()
        L_0x0a47:
            com.whatsapp.WaTextView r2 = r0.A0Y
            A00(r2, r0, r4)
            r2 = r37
            A00(r2, r0, r4)
            A00(r8, r0, r4)
        L_0x0a54:
            java.lang.String r7 = r6.A0K()
            if (r7 == 0) goto L_0x0b24
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L_0x0b24
            char r3 = r7.charAt(r1)
            r2 = 64
            if (r3 != r2) goto L_0x0b24
            A06(r0, r7)
        L_0x0a6b:
            boolean r2 = r0.A1F
            if (r2 == 0) goto L_0x0a74
            r2 = r37
            A00(r2, r0, r4)
        L_0x0a74:
            boolean r2 = A0A(r0)
            if (r2 == 0) goto L_0x0ab5
            r2 = 2131428492(0x7f0b048c, float:1.847863E38)
            android.view.ViewStub r2 = X.AnonymousClass3MW.A0F(r5, r2)
            if (r2 == 0) goto L_0x0a91
            android.view.View r4 = r2.inflate()
            r3 = 37
            X.AFU r2 = new X.AFU
            r2.<init>((java.lang.Object) r0, (int) r3)
            r4.setOnClickListener(r2)
        L_0x0a91:
            X.AEW r2 = r0.A0G
            if (r2 == 0) goto L_0x0ab5
            java.lang.String r4 = r2.A0H
            boolean r2 = X.AnonymousClass1EG.A0H(r4)
            if (r2 != 0) goto L_0x0ab5
            r2 = 2131428573(0x7f0b04dd, float:1.8478794E38)
            android.view.ViewStub r2 = X.AnonymousClass3MW.A0F(r5, r2)
            if (r2 != 0) goto L_0x0b18
            r2 = 2131428496(0x7f0b0490, float:1.8478638E38)
            android.view.View r2 = r5.findViewById(r2)
        L_0x0aad:
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r4)
            r2.setVisibility(r1)
        L_0x0ab5:
            X.AEW r2 = r0.A0G
            if (r2 == 0) goto L_0x0baa
            java.util.List r4 = r2.A0Q
            boolean r2 = X.C137476vW.A00(r4)
            if (r2 != 0) goto L_0x0baa
            r2 = 2131428494(0x7f0b048e, float:1.8478634E38)
            android.view.ViewStub r2 = X.AnonymousClass3MW.A0F(r5, r2)
            if (r2 == 0) goto L_0x0baa
            android.view.View r3 = r2.inflate()
            r2 = 2131428493(0x7f0b048d, float:1.8478632E38)
            android.view.ViewGroup r8 = X.AnonymousClass3MW.A0D(r3, r2)
            if (r8 == 0) goto L_0x0baa
            java.util.Iterator r9 = r4.iterator()
        L_0x0adb:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0baa
            java.lang.Object r7 = r9.next()
            X.24c r7 = (X.C446124c) r7
            android.view.LayoutInflater r3 = X.AnonymousClass3MZ.A0D(r5)
            r2 = 2131627193(0x7f0e0cb9, float:1.8881644E38)
            android.view.View r6 = r3.inflate(r2, r8, r1)
            boolean r2 = r6 instanceof com.google.android.material.chip.Chip
            if (r2 == 0) goto L_0x0b14
            r4 = r6
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object[] r3 = X.AnonymousClass3MW.A1a()
            java.lang.String r2 = r7.A02
            r3[r1] = r2
            java.lang.String r2 = "/%s"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r4.setText(r2)
            r3 = 25
            X.78Q r2 = new X.78Q
            r2.<init>((java.lang.Object) r0, (java.lang.Object) r7, (int) r3)
            r6.setOnClickListener(r2)
        L_0x0b14:
            r8.addView(r6)
            goto L_0x0adb
        L_0x0b18:
            android.view.View r3 = r2.inflate()
            r2 = 2131428496(0x7f0b0490, float:1.8478638E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r3, r2)
            goto L_0x0aad
        L_0x0b24:
            X.1BI r9 = r6.A0J
            if (r9 == 0) goto L_0x0a6b
            X.4OG r8 = r0.A15
            X.1DT r7 = X.AnonymousClass3MW.A0L()
            X.1OX r6 = r8.A03
            r3 = 0
            com.whatsapp.usernames.ContactUsernameProvider$getUsernameForJid$1$1 r2 = new com.whatsapp.usernames.ContactUsernameProvider$getUsernameForJid$1$1
            r2.<init>(r7, r9, r8, r3)
            X.AnonymousClass3MX.A1Q(r2, r6)
            r2 = 7
            X.4fu r3 = new X.4fu
            r3.<init>(r0, r2)
            r2 = r31
            r7.A0A(r2, r3)
            goto L_0x0a6b
        L_0x0b46:
            java.lang.String r12 = r3.A0B
            boolean r7 = X.C24605CBj.A00(r12)
            if (r7 != 0) goto L_0x0b8e
            X.00H r7 = r0.A1C
            X.1UD r7 = X.AnonymousClass3MW.A0X(r7)
            boolean r7 = r7.A00()
            if (r7 == 0) goto L_0x0b8e
            r2.setVisibility(r1)
            X.00H r7 = r0.A19
            java.lang.Object r11 = r7.get()
            X.2jP r11 = (X.C57642jP) r11
            X.118 r7 = r0.A0r
            android.content.Context r10 = r7.A00
            r7 = 13
            java.lang.Integer r17 = java.lang.Integer.valueOf(r7)
            java.lang.String r9 = r3.A0C
            int r7 = r3.A00
            boolean r3 = r3.A0J
            r21 = 1
            r23 = r21
            r14 = r11
            r15 = r10
            r16 = r2
            r18 = r12
            r19 = r9
            r20 = r7
            r22 = r21
            r24 = r3
            r25 = r13
            r14.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0a47
        L_0x0b8e:
            r3 = 2131887302(0x7f1204c6, float:1.9409207E38)
            r2.setText(r3)
            r9 = 2130969200(0x7f040270, float:1.7547075E38)
            r7 = 2131100216(0x7f060238, float:1.7812807E38)
            r3 = r31
            int r3 = X.AnonymousClass1YL.A00(r3, r9, r7)
            r11.A06(r2, r3, r1)
            goto L_0x0a47
        L_0x0ba5:
            r2.setVisibility(r4)
            goto L_0x0a47
        L_0x0baa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92874i3.A04(X.4i3, X.76t, X.1E7, X.1rL, boolean, boolean):void");
    }
}
