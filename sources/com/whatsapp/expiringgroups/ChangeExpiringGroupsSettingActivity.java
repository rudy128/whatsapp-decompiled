package com.whatsapp.expiringgroups;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1OZ;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass4Z9;
import X.AnonymousClass78O;
import X.C000200d;
import X.C18070vi;
import X.C22971Dz;
import X.C29691ci;
import X.C43391zj;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C83684Gg;
import X.C90894eo;
import X.C91014f0;
import X.C97544pe;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.Toolbar;
import com.airbnb.lottie.LottieAnimationView;

public final class ChangeExpiringGroupsSettingActivity extends AnonymousClass1FY {
    public static final int[][] A08 = {new int[]{-1, 2131890216}, new int[]{0, 2131890215}, new int[]{1, 2131890213}, new int[]{7, 2131890217}, new int[]{30, 2131890214}};
    public int A00;
    public int A01;
    public long A02;
    public C29691ci A03;
    public AnonymousClass1CJ A04;
    public C97544pe A05;
    public AnonymousClass00H A06;
    public boolean A07;

    public ChangeExpiringGroupsSettingActivity() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r20) {
        /*
            r19 = this;
            r9 = 0
            r5 = r20
            int r1 = X.AnonymousClass3MY.A01(r5, r9)
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            r4 = r19
            if (r1 != r0) goto L_0x00b8
            long r6 = r4.A02
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00b8
            int r0 = r4.A00
            int r3 = r4.A01
            if (r0 == r3) goto L_0x00b8
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = X.C17880vN.A04(r0)
            r2 = -1
            if (r3 == r2) goto L_0x004a
            if (r3 == 0) goto L_0x0037
            r2 = 1
            if (r3 == r2) goto L_0x0046
            r2 = 7
            if (r3 == r2) goto L_0x0042
            r2 = 30
            if (r3 != r2) goto L_0x004a
            r2 = 2592000(0x278d00, double:1.280618E-317)
        L_0x0036:
            long r0 = r0 + r2
        L_0x0037:
            X.4pe r13 = r4.A05
            if (r13 != 0) goto L_0x004d
            java.lang.String r0 = "expireGroupIQProtocolHelper"
            X.C18070vi.A11(r0)
        L_0x0040:
            r0 = 0
            throw r0
        L_0x0042:
            r2 = 604800(0x93a80, double:2.98811E-318)
            goto L_0x0036
        L_0x0046:
            r2 = 86400(0x15180, double:4.26873E-319)
            goto L_0x0036
        L_0x004a:
            r0 = -10
            goto L_0x0037
        L_0x004d:
            X.1ci r2 = r4.A03
            java.lang.String r11 = "groupInfo"
            if (r2 == 0) goto L_0x00cd
            X.1BI r8 = r2.A08()
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.C18070vi.A0z(r8, r2)
            X.C18070vi.A0d(r8, r9)
            X.1OZ r12 = r13.A00
            java.lang.String r15 = r12.A0B()
            r6 = 0
            r10 = 1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x00cb
            X.1MD[] r6 = new X.AnonymousClass1MD[r10]
            java.lang.String r3 = "timestamp"
            X.1MD r2 = new X.1MD
            r2.<init>((java.lang.String) r3, (long) r0)
            r6[r9] = r2
        L_0x0077:
            java.lang.String r2 = "expire"
            X.1ca r7 = new X.1ca
            r7.<init>(r2, r6)
            r2 = 4
            X.1MD[] r6 = new X.AnonymousClass1MD[r2]
            java.lang.String r3 = "xmlns"
            java.lang.String r2 = "w:g2"
            X.C17880vN.A1Q(r3, r2, r6, r9)
            java.lang.String r2 = "id"
            X.C17880vN.A1Q(r2, r15, r6, r10)
            java.lang.String r3 = "type"
            java.lang.String r2 = "set"
            X.C17890vO.A12(r3, r2, r6)
            java.lang.String r3 = "to"
            java.lang.String r2 = r8.getRawString()
            X.1ca r14 = X.C29621ca.A01(r7, r3, r2, r6)
            r17 = 20000(0x4e20, double:9.8813E-320)
            r16 = 380(0x17c, float:5.32E-43)
            r12.A0N(r13, r14, r15, r16, r17)
            r6 = -10
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x00bd
            X.0z4 r1 = r4.A0A
            X.1ci r0 = r4.A03
            if (r0 == 0) goto L_0x00cd
            X.1BI r0 = r0.A08()
            r1.A1Q(r0)
        L_0x00b8:
            boolean r0 = super.onOptionsItemSelected(r5)
            return r0
        L_0x00bd:
            X.0z4 r3 = r4.A0A
            X.1ci r2 = r4.A03
            if (r2 == 0) goto L_0x00cd
            X.1BI r2 = r2.A08()
            r3.A1R(r2, r0)
            goto L_0x00b8
        L_0x00cb:
            r6 = 0
            goto L_0x0077
        L_0x00cd:
            X.C18070vi.A11(r11)
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expiringgroups.ChangeExpiringGroupsSettingActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_setting", this.A01);
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A04 = AnonymousClass3Ma.A0d(A0L);
            this.A06 = C000200d.A00(A0L.A6N);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131626562);
        C72463Mc.A18(this, 2131430497);
        C43391zj.A02(AnonymousClass3MY.A0H(this, 2131430498), (LottieAnimationView) AnonymousClass3MY.A0H(this, 2131430499));
        RadioGroup radioGroup = (RadioGroup) AnonymousClass3MY.A0H(this, 2131434314);
        AnonymousClass3MY.A0t(this, 2131890209);
        Toolbar A0T = C72463Mc.A0T(this);
        AnonymousClass3NL.A02(this, A0T, this.A00, 2131231675);
        A0T.setTitle((CharSequence) getString(2131890209));
        A0T.setBackgroundResource(AnonymousClass4Z9.A01(this, false));
        A0T.A0Q(this, 2132083960);
        A0T.setNavigationOnClickListener(new AnonymousClass78O((Object) this, 5));
        setSupportActionBar(A0T);
        AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(C72453Mb.A0u(this));
        AnonymousClass1CJ r0 = this.A04;
        if (r0 != null) {
            C29691ci A0A = r0.A0A(A022);
            if (A0A == null || !C22971Dz.A0e(A022)) {
                finish();
                return;
            }
            this.A03 = A0A;
            long A0S = this.A0A.A0S(A022);
            this.A02 = A0S;
            if (A0S == -1) {
                AnonymousClass3MX.A0L(this, 2131430719).setText(2131890212);
                radioGroup.setVisibility(8);
                return;
            }
            this.A00 = -2;
            this.A01 = -2;
            if (bundle != null) {
                this.A01 = bundle.getInt("selected_setting", -2);
            }
            radioGroup.setOnCheckedChangeListener(new C90894eo(this, 4));
            int[][] iArr = A08;
            int i = 0;
            do {
                int[] iArr2 = iArr[i];
                AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(new ContextThemeWrapper(this, 2132083664));
                appCompatRadioButton.setId(View.generateViewId());
                AnonymousClass3MY.A19(appCompatRadioButton, iArr2[0]);
                appCompatRadioButton.setText(iArr2[1]);
                appCompatRadioButton.setLayoutParams(new RadioGroup.LayoutParams(-1, -2));
                radioGroup.addView(appCompatRadioButton);
                i++;
            } while (i < 5);
            AnonymousClass00H r02 = this.A06;
            if (r02 != null) {
                this.A05 = new C97544pe(new C83684Gg(), (AnonymousClass1OZ) C18070vi.A0E(r02));
                return;
            }
            str = "messageClient";
        } else {
            str = "chatsCache";
        }
        C18070vi.A11(str);
        throw null;
    }

    public ChangeExpiringGroupsSettingActivity(int i) {
        this.A07 = false;
        C91014f0.A00(this, 6);
    }
}
