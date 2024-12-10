package com.whatsapp.dmsetting;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass129;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1L8;
import X.AnonymousClass1MD;
import X.AnonymousClass1OZ;
import X.AnonymousClass1PS;
import X.AnonymousClass371;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass4DZ;
import X.AnonymousClass4S2;
import X.AnonymousClass4Z9;
import X.C000200d;
import X.C110885hR;
import X.C173438v4;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C19620yd;
import X.C26281Rn;
import X.C29621ca;
import X.C36401np;
import X.C39441t5;
import X.C43391zj;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C83694Gh;
import X.C89924dF;
import X.C90894eo;
import X.C91004ez;
import X.C91644g1;
import X.C98564rM;
import X.C99224sT;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.list.footer.WDSSectionFooter;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;
import java.util.ArrayList;

public final class ChangeDMSettingActivity extends AnonymousClass1FY {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public View A04;
    public AnonymousClass1L8 A05;
    public C26281Rn A06;
    public AnonymousClass1PS A07;
    public AnonymousClass129 A08;
    public C36401np A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public boolean A0F;
    public final C18100vl A0G;

    public ChangeDMSettingActivity() {
        this(0);
        this.A0G = C83694Gh.A00(this, "entry_point", 1);
    }

    private final void A0Q(int i) {
        String str;
        int i2 = i;
        if (i2 == -1) {
            AnonymousClass00H r0 = this.A0B;
            if (r0 != null) {
                ((AnonymousClass4S2) r0.get()).A00(3, C72453Mb.A0I(this.A0G));
                return;
            }
            str = "ephemeralSettingLogger";
        } else {
            AnonymousClass1PS r02 = this.A07;
            if (r02 == null) {
                str = "disappearingModeSettingsManager";
            } else if (i2 != r02.A00()) {
                Intent A0A2 = C17880vN.A0A();
                A0A2.putExtra("duration", i2);
                setResult(-1, A0A2);
                C26281Rn r4 = this.A06;
                if (r4 != null) {
                    int A0I = C72453Mb.A0I(this.A0G);
                    if (!r4.A02.A09()) {
                        r4.A01.A08(2131888361, 0);
                        AnonymousClass3MX.A1J(r4.A00, r4.A04.A00());
                        return;
                    }
                    AnonymousClass00H r03 = r4.A06;
                    String A0T = C17890vO.A0T(r03);
                    AnonymousClass1OZ A0U = C17880vN.A0U(r03);
                    C29621ca r6 = new C29621ca("disappearing_mode", new AnonymousClass1MD[]{new AnonymousClass1MD("duration", (long) i2)});
                    AnonymousClass1MD[] r2 = new AnonymousClass1MD[4];
                    C17880vN.A1I(C173438v4.A00, "to", r2, 0);
                    C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T, r2, 1);
                    C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r2);
                    A0U.A0N(new AnonymousClass371(r4, i2, A0I), C29621ca.A01(r6, "xmlns", "disappearing_mode", r2), A0T, 277, 20000);
                    return;
                }
                str = "disappearingModeManager";
            } else {
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final int A03(ChangeDMSettingActivity changeDMSettingActivity) {
        return C72453Mb.A0I(changeDMSettingActivity.A0G);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r5.A00() == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0V(com.whatsapp.dmsetting.ChangeDMSettingActivity r15, int r16) {
        /*
            android.view.View r0 = r15.A03
            r6 = 0
            if (r0 == 0) goto L_0x0008
            r0.setVisibility(r6)
        L_0x0008:
            r8 = 0
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.wds.components.list.footer.WDSSectionFooter"
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel"
            X.00H r1 = r15.A0D
            r7 = r16
            if (r16 != 0) goto L_0x0090
            if (r1 == 0) goto L_0x012b
            java.lang.Object r5 = r1.get()
            X.1wR r5 = (X.C41461wR) r5
            X.0ve r4 = r15.A0E
            X.C18070vi.A0W(r4)
            r3 = 7495(0x1d47, float:1.0503E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r4, r3)
            if (r1 == 0) goto L_0x0033
            boolean r3 = r5.A00()
            r1 = 2131889519(0x7f120d6f, float:1.9413704E38)
            if (r3 != 0) goto L_0x0036
        L_0x0033:
            r1 = 2131889518(0x7f120d6e, float:1.9413702E38)
        L_0x0036:
            java.lang.String r10 = r15.getString(r1)
            r1 = 25
            X.4rM r9 = new X.4rM
            r9.<init>(r15, r1)
            android.view.View r4 = r15.A03
            boolean r1 = r4 instanceof com.whatsapp.TextEmojiLabel
            if (r1 == 0) goto L_0x0077
            X.C18070vi.A0z(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            X.1np r7 = r15.A09
            if (r7 == 0) goto L_0x0128
            android.view.View r1 = r15.A03
            if (r1 == 0) goto L_0x0058
            android.content.Context r8 = r1.getContext()
        L_0x0058:
            int r12 = X.C72463Mc.A02(r15)
            java.lang.String r11 = "learn-more"
            android.text.SpannableStringBuilder r1 = r7.A06(r8, r9, r10, r11, r12)
            r4.setText(r1)
            android.view.View r1 = r15.A03
            X.C18070vi.A0z(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.0ve r0 = r15.A0E
            X.AnonymousClass3Ma.A1I(r1, r0)
        L_0x0071:
            android.view.View r0 = r15.A04
            X.C72453Mb.A1B(r0)
            return
        L_0x0077:
            boolean r0 = r4 instanceof com.whatsapp.wds.components.list.footer.WDSSectionFooter
            if (r0 == 0) goto L_0x0071
            X.C18070vi.A0z(r4, r2)
            com.whatsapp.wds.components.list.footer.WDSSectionFooter r4 = (com.whatsapp.wds.components.list.footer.WDSSectionFooter) r4
            X.4DZ r7 = X.AnonymousClass4DZ.A02
            X.0ve r0 = r15.A0E
            X.1t5 r8 = new X.1t5
            r8.<init>(r0)
            java.lang.String r6 = "learn-more"
            r5 = r10
            r4.setFooterTextWithLink(r5, r6, r7, r8, r9)
            goto L_0x0071
        L_0x0090:
            if (r1 == 0) goto L_0x012b
            java.lang.Object r5 = r1.get()
            X.1wR r5 = (X.C41461wR) r5
            X.0ve r4 = r15.A0E
            X.C18070vi.A0W(r4)
            r3 = 7495(0x1d47, float:1.0503E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r4, r3)
            if (r1 == 0) goto L_0x011f
            boolean r4 = r5.A00()
        L_0x00ab:
            r3 = 1
            java.lang.String r11 = "by-selecting-them"
            r1 = 2131889520(0x7f120d70, float:1.9413706E38)
            if (r4 == 0) goto L_0x00b6
            r1 = 2131889521(0x7f120d71, float:1.9413708E38)
        L_0x00b6:
            java.lang.String r10 = X.C17890vO.A0R(r15, r11, r3, r6, r1)
            r1 = 4
            X.7RM r14 = new X.7RM
            r14.<init>((java.lang.Object) r15, (int) r7, (int) r1)
            android.view.View r9 = r15.A03
            boolean r1 = r9 instanceof com.whatsapp.TextEmojiLabel
            if (r1 == 0) goto L_0x0109
            X.C18070vi.A0z(r9, r0)
            android.widget.TextView r9 = (android.widget.TextView) r9
            X.1np r2 = r15.A09
            if (r2 == 0) goto L_0x0128
            android.view.View r1 = r15.A03
            if (r1 == 0) goto L_0x00d7
            android.content.Context r8 = r1.getContext()
        L_0x00d7:
            android.text.SpannableStringBuilder r1 = r2.A05(r8, r14, r10, r11)
            r9.setText(r1)
            android.view.View r1 = r15.A03
            X.C18070vi.A0z(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.0ve r0 = r15.A0E
            X.AnonymousClass3Ma.A1I(r1, r0)
        L_0x00ea:
            android.view.View r0 = r15.A04
            if (r0 == 0) goto L_0x00f1
            r0.setVisibility(r6)
        L_0x00f1:
            X.00H r0 = r15.A0B
            if (r0 == 0) goto L_0x0121
            java.lang.Object r4 = r0.get()
            X.4S2 r4 = (X.AnonymousClass4S2) r4
            int r9 = r15.A00
            X.0vl r0 = r15.A0G
            int r10 = X.C72453Mb.A0I(r0)
            r5 = 0
            r8 = r6
            r4.A01(r5, r6, r7, r8, r9, r10)
            return
        L_0x0109:
            boolean r0 = r9 instanceof com.whatsapp.wds.components.list.footer.WDSSectionFooter
            if (r0 == 0) goto L_0x00ea
            X.C18070vi.A0z(r9, r2)
            com.whatsapp.wds.components.list.footer.WDSSectionFooter r9 = (com.whatsapp.wds.components.list.footer.WDSSectionFooter) r9
            X.4DZ r12 = X.AnonymousClass4DZ.A03
            X.0ve r0 = r15.A0E
            X.1t5 r13 = new X.1t5
            r13.<init>(r0)
            r9.setFooterTextWithLink(r10, r11, r12, r13, r14)
            goto L_0x00ea
        L_0x011f:
            r4 = 0
            goto L_0x00ab
        L_0x0121:
            java.lang.String r0 = "ephemeralSettingLogger"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0128:
            java.lang.String r0 = "linkifier"
            goto L_0x012d
        L_0x012b:
            java.lang.String r0 = "interopUtility"
        L_0x012d:
            X.C18070vi.A11(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dmsetting.ChangeDMSettingActivity.A0V(com.whatsapp.dmsetting.ChangeDMSettingActivity, int):void");
    }

    public void A2y() {
        if (!this.A0F) {
            this.A0F = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r1 = A0K.AAQ;
            C72483Me.A0q(r1, this);
            AnonymousClass10G r2 = r1.A00;
            AnonymousClass1FB.A0K(r1, r2, this, r2.A45);
            AnonymousClass1FB.A0L(r1, r2, this, r2.A5A);
            this.A05 = (AnonymousClass1L8) r1.A5h.get();
            this.A0A = AnonymousClass3MX.A10(r1);
            this.A06 = (C26281Rn) r1.A3S.get();
            this.A07 = (AnonymousClass1PS) r1.A3T.get();
            this.A0B = C000200d.A00(A0K.A14);
            this.A0C = C000200d.A00(A0K.A15);
            this.A08 = AnonymousClass3Ma.A0t(r1);
            this.A0D = C000200d.A00(r2.A2r);
            this.A09 = AnonymousClass3MY.A0e(r2);
            this.A0E = C000200d.A00(r1.ABc);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r20, int r21, android.content.Intent r22) {
        /*
            r19 = this;
            r2 = r19
            r6 = r20
            r1 = r21
            r5 = r22
            super.onActivityResult(r6, r1, r5)
            if (r22 == 0) goto L_0x00ae
            java.lang.String r4 = "all_contacts_count"
            java.lang.String r0 = "jids"
            r8 = 1
            r3 = -1
            r12 = 0
            if (r6 != r8) goto L_0x00b2
            if (r1 != r3) goto L_0x00b2
            java.lang.Class<X.1BI> r1 = X.AnonymousClass1BI.class
            java.util.ArrayList r0 = r5.getStringArrayListExtra(r0)
            java.util.ArrayList r14 = X.C22971Dz.A0A(r1, r0)
            int r0 = r5.getIntExtra(r4, r12)
            r2.A00 = r0
            X.1PS r0 = r2.A07
            if (r0 == 0) goto L_0x00e5
            X.1PR r0 = r0.A03
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r1 = X.C18070vi.A03(r0)
            java.lang.String r0 = "disappearing_mode_duration_for_chat_picker_int"
            int r15 = r1.getInt(r0, r12)
            X.00H r0 = r2.A0C
            if (r0 == 0) goto L_0x00af
            java.lang.Object r13 = r0.get()
            X.4RT r13 = (X.AnonymousClass4RT) r13
            int r4 = r2.A01
            int r1 = r2.A00
            X.0vl r0 = r2.A0G
            int r18 = X.C72453Mb.A0I(r0)
            r16 = r4
            r17 = r1
            r13.A00(r14, r15, r16, r17, r18)
            int r0 = r14.size()
            if (r0 <= 0) goto L_0x00ae
            android.view.View r9 = r2.A00
            X.0vb r10 = r2.A00
            r7 = 2131755093(0x7f100055, float:1.9141056E38)
            int r0 = r14.size()
            long r0 = (long) r0
            java.lang.Object[] r6 = X.AnonymousClass3MW.A1b()
            java.lang.String r11 = ""
            r4 = 86400(0x15180, float:1.21072E-40)
            r5 = 2131889915(0x7f120efb, float:1.9414507E38)
            if (r15 == r4) goto L_0x0085
            r4 = 604800(0x93a80, float:8.47505E-40)
            r5 = 2131889942(0x7f120f16, float:1.9414562E38)
            if (r15 == r4) goto L_0x0085
            r4 = 7776000(0x76a700, float:1.0896497E-38)
            if (r15 != r4) goto L_0x0089
            r5 = 2131889918(0x7f120efe, float:1.9414513E38)
        L_0x0085:
            java.lang.String r11 = X.AnonymousClass3MX.A15(r2, r5)
        L_0x0089:
            r6[r12] = r11
            int r2 = r14.size()
            X.C17880vN.A1T(r6, r2, r8)
            java.lang.String r0 = r10.A0K(r6, r7, r0)
            X.Bik r2 = X.C23520Bik.A02(r9, r0, r3)
            X.BIE r1 = r2.A0J
            X.C18070vi.A0X(r1)
            r0 = 2131435508(0x7f0b1ff4, float:1.849286E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r1, r0)
            if (r0 == 0) goto L_0x00ab
            r0.setSingleLine(r12)
        L_0x00ab:
            r2.A08()
        L_0x00ae:
            return
        L_0x00af:
            java.lang.String r0 = "ephemeralSettingManager"
            goto L_0x00ea
        L_0x00b2:
            java.lang.Class<X.1BI> r1 = X.AnonymousClass1BI.class
            java.util.ArrayList r0 = r5.getStringArrayListExtra(r0)
            java.util.ArrayList r9 = X.C22971Dz.A0A(r1, r0)
            int r0 = r5.getIntExtra(r4, r12)
            r2.A00 = r0
            int r11 = r2.A02
            if (r11 != r3) goto L_0x00ce
            X.1PS r0 = r2.A07
            if (r0 == 0) goto L_0x00e5
            int r11 = r0.A00()
        L_0x00ce:
            X.00H r0 = r2.A0B
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r8 = r0.get()
            X.4S2 r8 = (X.AnonymousClass4S2) r8
            int r13 = r2.A00
            X.0vl r0 = r2.A0G
            int r14 = X.C72453Mb.A0I(r0)
            r10 = 2
            r8.A01(r9, r10, r11, r12, r13, r14)
            return
        L_0x00e5:
            java.lang.String r0 = "disappearingModeSettingsManager"
            goto L_0x00ea
        L_0x00e8:
            java.lang.String r0 = "ephemeralSettingLogger"
        L_0x00ea:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dmsetting.ChangeDMSettingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        A0Q(this.A02);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        String str;
        int[] iArr;
        Context context;
        super.onCreate(bundle);
        setContentView(2131626557);
        View A0C2 = AnonymousClass3MY.A0C(this, 2131430098);
        if (A0C2 instanceof ViewStub) {
            ViewStub viewStub = (ViewStub) A0C2;
            int i = 2131626560;
            if (AnonymousClass3MX.A1U(this)) {
                i = 2131627597;
            }
            A0C2 = AnonymousClass3MY.A0G(viewStub, i);
        }
        if (A0C2 instanceof WDSSectionHeader) {
            ((WDSSectionHeader) A0C2).setHeaderText(2131889524);
        }
        Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0C(this, 2131436270);
        AnonymousClass3NL.A02(this, toolbar, this.A00, 2131231675);
        toolbar.setTitle((CharSequence) getString(2131889530));
        toolbar.setBackgroundResource(AnonymousClass4Z9.A01(this, false));
        toolbar.setNavigationOnClickListener(new C89924dF(this, 47));
        toolbar.A0Q(this, 2132083960);
        setSupportActionBar(toolbar);
        View A0A2 = C110885hR.A0A(this, 2131430086);
        this.A03 = A0A2;
        if (A0A2 instanceof ViewStub) {
            C18070vi.A0z(A0A2, "null cannot be cast to non-null type android.view.ViewStub");
            ViewStub viewStub2 = (ViewStub) A0A2;
            int i2 = 2131626558;
            if (AnonymousClass3MX.A1U(this)) {
                i2 = 2131627594;
            }
            viewStub2.setLayoutResource(i2);
            View view = this.A03;
            C18070vi.A0z(view, "null cannot be cast to non-null type android.view.ViewStub");
            this.A03 = ((ViewStub) view).inflate();
        }
        View A0A3 = C110885hR.A0A(this, 2131430087);
        this.A04 = A0A3;
        if (A0A3 instanceof ViewStub) {
            C18070vi.A0z(A0A3, "null cannot be cast to non-null type android.view.ViewStub");
            ViewStub viewStub3 = (ViewStub) A0A3;
            int i3 = 2131626559;
            if (AnonymousClass3MX.A1U(this)) {
                i3 = 2131627594;
            }
            viewStub3.setLayoutResource(i3);
            View view2 = this.A04;
            C18070vi.A0z(view2, "null cannot be cast to non-null type android.view.ViewStub");
            A0A3 = ((ViewStub) view2).inflate();
            this.A04 = A0A3;
        }
        C98564rM r5 = new C98564rM(this, 26);
        if (A0A3 instanceof TextEmojiLabel) {
            C18070vi.A0z(A0A3, "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel");
            TextView textView = (TextView) A0A3;
            C36401np r3 = this.A09;
            if (r3 != null) {
                View view3 = this.A04;
                Context context2 = null;
                if (view3 != null) {
                    context = view3.getContext();
                } else {
                    context = null;
                }
                String string = getString(2131889511);
                View view4 = this.A04;
                if (view4 != null) {
                    context2 = view4.getContext();
                }
                textView.setText(r3.A06(context, r5, string, "learn-more", C72463Mc.A02(context2)));
                View view5 = this.A04;
                C18070vi.A0z(view5, "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel");
                AnonymousClass3Ma.A1I((TextView) view5, this.A0E);
            } else {
                str = "linkifier";
                C18070vi.A11(str);
                throw null;
            }
        } else if (A0A3 instanceof WDSSectionFooter) {
            C18070vi.A0z(A0A3, "null cannot be cast to non-null type com.whatsapp.wds.components.list.footer.WDSSectionFooter");
            ((WDSSectionFooter) A0A3).setFooterTextWithLink(C18070vi.A0F(this, 2131889511), "learn-more", AnonymousClass4DZ.A02, new C39441t5(this.A0E), r5);
        }
        this.A02 = -1;
        RadioGroup radioGroup = (RadioGroup) AnonymousClass3MY.A0C(this, 2131430094);
        AnonymousClass1PS r0 = this.A07;
        if (r0 != null) {
            int A002 = r0.A00();
            this.A01 = A002;
            C18030ve r6 = this.A0E;
            C18070vi.A0W(r6);
            AnonymousClass00H r02 = this.A0E;
            if (r02 != null) {
                AnonymousClass3Ma.A1O(radioGroup, 0, C18070vi.A0E(r02));
                C43391zj.A03(radioGroup, C43391zj.A00, r6, A002, true, false);
                A0V(this, A002);
                C18030ve r2 = this.A0E;
                C18070vi.A0W(r2);
                AnonymousClass00H r03 = this.A0E;
                if (r03 != null) {
                    C18070vi.A0X(r03.get());
                    if (C18020vd.A05(C18040vf.A02, r2, 1397)) {
                        iArr = C19620yd.A0J;
                    } else {
                        iArr = C19620yd.A0K;
                    }
                    ArrayList A13 = AnonymousClass000.A13();
                    int childCount = radioGroup.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = radioGroup.getChildAt(i4);
                        if (childAt instanceof RadioButton) {
                            A13.add(childAt);
                        }
                    }
                    C90894eo r32 = new C90894eo(this, 1);
                    radioGroup.setOnCheckedChangeListener(r32);
                    C26281Rn r04 = this.A06;
                    if (r04 != null) {
                        C91644g1.A00(this, r04.A04.A00, new C99224sT(r32, radioGroup, A13, iArr, 1), 27);
                        AnonymousClass00H r05 = this.A0B;
                        if (r05 != null) {
                            ((AnonymousClass4S2) r05.get()).A00(1, C72453Mb.A0I(this.A0G));
                            return;
                        }
                        str = "ephemeralSettingLogger";
                    } else {
                        str = "disappearingModeManager";
                    }
                }
            }
            str = "waDebugBuildSharedPreferences";
        } else {
            str = "disappearingModeSettingsManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 16908332) {
            A0Q(this.A02);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public ChangeDMSettingActivity(int i) {
        this.A0F = false;
        C91004ez.A00(this, 45);
    }
}
