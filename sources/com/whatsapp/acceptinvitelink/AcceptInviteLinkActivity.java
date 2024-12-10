package com.whatsapp.acceptinvitelink;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11P;
import X.AnonymousClass126;
import X.AnonymousClass12M;
import X.AnonymousClass18K;
import X.AnonymousClass190;
import X.AnonymousClass1CJ;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1M9;
import X.AnonymousClass1MR;
import X.AnonymousClass1MZ;
import X.AnonymousClass1NN;
import X.AnonymousClass1PU;
import X.AnonymousClass1VU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass49R;
import X.AnonymousClass4RI;
import X.AnonymousClass4SZ;
import X.C000200d;
import X.C17880vN;
import X.C17900vP;
import X.C18000vb;
import X.C18030ve;
import X.C24921Me;
import X.C25231Nk;
import X.C27201Vd;
import X.C37451pZ;
import X.C42941yz;
import X.C54832em;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C85104Mc;
import X.C90444e5;
import X.C90994ey;
import X.C95444mF;
import X.C96464nt;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicReference;

public class AcceptInviteLinkActivity extends AnonymousClass1FY {
    public AnonymousClass1M9 A00;
    public C24921Me A01;
    public C27201Vd A02;
    public C18000vb A03;
    public AnonymousClass1CJ A04;
    public AnonymousClass1NN A05;
    public AnonymousClass1MZ A06;
    public C54832em A07;
    public AnonymousClass1MR A08;
    public AnonymousClass1VU A09;
    public AnonymousClass18K A0A;
    public AnonymousClass126 A0B;
    public AnonymousClass12M A0C;
    public AnonymousClass4SZ A0D;
    public AnonymousClass1PU A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public Runnable A0K;
    public int A0L;
    public C37451pZ A0M;
    public boolean A0N;
    public final AtomicReference A0O;
    public final C25231Nk A0P;

    public AcceptInviteLinkActivity() {
        this(0);
        this.A0O = new AtomicReference((Object) null);
        this.A0P = new C95444mF(this, 0);
    }

    public void A2y() {
        if (!this.A0N) {
            this.A0N = true;
            AnonymousClass10E A0L2 = C72473Md.A0L(this);
            C72483Me.A0q(A0L2, this);
            AnonymousClass10G r2 = A0L2.A00;
            AnonymousClass1FB.A0K(A0L2, r2, this, r2.A45);
            AnonymousClass1FB.A0L(A0L2, r2, this, r2.A5A);
            this.A04 = AnonymousClass3Ma.A0d(A0L2);
            this.A0A = AnonymousClass3Ma.A0g(A0L2);
            this.A02 = AnonymousClass3MZ.A0i(A0L2);
            this.A0I = C000200d.A00(A0L2.AUt);
            this.A0J = C000200d.A00(A0L2.A6N);
            this.A00 = AnonymousClass10E.A4z(A0L2);
            this.A01 = AnonymousClass3MZ.A0g(A0L2);
            this.A03 = AnonymousClass10E.A6Q(A0L2);
            this.A0E = AnonymousClass3MZ.A12(A0L2);
            this.A0B = AnonymousClass3MY.A0X(A0L2);
            this.A0C = AnonymousClass3Ma.A0h(A0L2);
            this.A08 = (AnonymousClass1MR) A0L2.ABD.get();
            this.A09 = AnonymousClass3MZ.A0s(A0L2);
            this.A07 = (C54832em) A0L2.AkC.get();
            this.A0F = C000200d.A00(A0L2.A2L);
            this.A0G = AnonymousClass3MX.A10(A0L2);
            this.A05 = AnonymousClass3Ma.A0e(A0L2);
            this.A06 = AnonymousClass3MY.A0V(A0L2);
            this.A0H = C000200d.A00(A0L2.A4Y);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131898700);
        setContentView(2131627363);
        View findViewById = findViewById(2131431799);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C90444e5(this, findViewById, findViewById(2131428018), 0));
        this.A0M = this.A02.A06(this, "accept-invite-link-activity");
        AnonymousClass3MZ.A1N(findViewById(2131430849), this, 36);
        this.A0L = getIntent().getIntExtra("display_type", 0);
        TextView A0I2 = AnonymousClass3MW.A0I(this, 2131434197);
        int i = this.A0L;
        if (i == 0) {
            A0I2.setText(2131897827);
            String stringExtra = getIntent().getStringExtra("code");
            if (TextUtils.isEmpty(stringExtra)) {
                this.A05.A08(2131890291, 1);
                finish();
            } else {
                C17900vP.A0f("acceptlink/processcode/", stringExtra, AnonymousClass000.A10());
                AnonymousClass3MW.A1T(new AnonymousClass49R(this, this.A05, this.A0B, this.A0C, C17880vN.A0U(this.A0J), stringExtra), this.A05, 0);
            }
        } else if (i == 1) {
            A0I2.setText(2131891798);
            String stringExtra2 = getIntent().getStringExtra("subgroup_jid");
            String stringExtra3 = getIntent().getStringExtra("parent_group_jid");
            C42941yz r1 = AnonymousClass1EC.A01;
            AnonymousClass1EC A022 = r1.A02(stringExtra2);
            AnonymousClass1EC A023 = r1.A02(stringExtra3);
            if (A022 == null || A023 == null) {
                AnonymousClass190 r6 = this.A03;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("subgroup jid is null = ");
                boolean z = true;
                A10.append(AnonymousClass000.A1X(A022));
                A10.append("parent group jid is null = ");
                if (A023 != null) {
                    z = false;
                }
                r6.A0G("parent-group-error", AnonymousClass3MY.A0r(A10, z), false);
            } else {
                this.A0O.set(A022);
                C18030ve r11 = this.A0E;
                new AnonymousClass4RI(this.A03, AnonymousClass3MW.A0Z(this.A0F), r11, (C85104Mc) this.A0H.get(), new C96464nt(this, A023), A023, C17880vN.A0U(this.A0J)).A00(A022);
            }
        }
        AnonymousClass11P r12 = this.A05;
        C18030ve r15 = this.A0E;
        AnonymousClass1CJ r14 = this.A04;
        AnonymousClass1M9 r9 = this.A00;
        C24921Me r10 = this.A01;
        C18000vb r13 = this.A03;
        AnonymousClass1PU r2 = this.A0E;
        AnonymousClass4SZ r62 = new AnonymousClass4SZ(this, AnonymousClass3MX.A0F(this, 2131431809), r9, r10, this.A0M, r12, r13, r14, r15, r2);
        this.A0D = r62;
        r62.A00 = true;
        this.A05.registerObserver(this.A0P);
        C72483Me.A0b(this);
    }

    public static void A03(AcceptInviteLinkActivity acceptInviteLinkActivity) {
        AnonymousClass3MZ.A1N(acceptInviteLinkActivity.findViewById(2131431804), acceptInviteLinkActivity, 35);
        C72463Mc.A19(acceptInviteLinkActivity, 2131434180);
        C72463Mc.A18(acceptInviteLinkActivity, 2131431263);
    }

    public static void A0Q(AcceptInviteLinkActivity acceptInviteLinkActivity, int i) {
        acceptInviteLinkActivity.findViewById(2131434180).setVisibility(4);
        AnonymousClass3MX.A1H(acceptInviteLinkActivity, 2131431263, 4);
        C72463Mc.A18(acceptInviteLinkActivity, 2131430516);
        AnonymousClass3MX.A1H(acceptInviteLinkActivity, 2131431961, 4);
        AnonymousClass3MX.A0L(acceptInviteLinkActivity, 2131430532).setText(i);
        AnonymousClass3Ma.A1C(acceptInviteLinkActivity.findViewById(2131433257), acceptInviteLinkActivity, 3);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A05.unregisterObserver(this.A0P);
        Runnable runnable = this.A0K;
        if (runnable != null) {
            this.A05.A0I(runnable);
        }
        this.A0M.A02();
    }

    public AcceptInviteLinkActivity(int i) {
        this.A0N = false;
        C90994ey.A00(this, 2);
    }
}
