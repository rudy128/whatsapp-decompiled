package com.whatsapp.companiondevice;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass129;
import X.AnonymousClass1EG;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1RK;
import X.AnonymousClass37C;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4MB;
import X.AnonymousClass4PW;
import X.AnonymousClass4Q4;
import X.AnonymousClass4VX;
import X.AnonymousClass4WT;
import X.AnonymousClass4a6;
import X.AnonymousClass4bE;
import X.BCS;
import X.C000200d;
import X.C107635aL;
import X.C108555bt;
import X.C110885hR;
import X.C17880vN;
import X.C17960vV;
import X.C195219sz;
import X.C19880zA;
import X.C19890zB;
import X.C21452AkJ;
import X.C26701Td;
import X.C35861mv;
import X.C35871mw;
import X.C36361nl;
import X.C54742ed;
import X.C57572jI;
import X.C62292rA;
import X.C63292sp;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C74703cE;
import X.C91004ez;
import X.C91624fz;
import X.C95524mN;
import X.C97664pq;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.qrcode.AgentDeviceLoginViewModel;

public class LinkedDevicesEnterCodeActivity extends AnonymousClass1FY implements C107635aL {
    public int A00;
    public C19880zA A01;
    public AnonymousClass4PW A02;
    public C36361nl A03;
    public AnonymousClass4MB A04;
    public C35861mv A05;
    public C35871mw A06;
    public AnonymousClass4Q4 A07;
    public AnonymousClass1RK A08;
    public AgentDeviceLoginViewModel A09;
    public AnonymousClass4VX A0A;
    public AnonymousClass129 A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public Runnable A0H;
    public boolean A0I;
    public final AnonymousClass4WT A0J;
    public final C26701Td A0K;
    public final C108555bt A0L;

    public LinkedDevicesEnterCodeActivity() {
        this(0);
        this.A0L = new C97664pq(this, 0);
        this.A0K = new C95524mN(this, 0);
        this.A0J = new AnonymousClass4WT(this);
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [X.4Hb, java.lang.Object] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass4Q4 r2 = this.A07;
        C108555bt r1 = this.A0L;
        C17960vV.A02();
        r2.A01 = r2.A00.A00(r1);
        this.A08.registerObserver(this.A0K);
        this.A06.registerObserver(this.A0J);
        setTitle(2131891658);
        setContentView(2131625830);
        int A1T = C72473Md.A1T(this);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C110885hR.A0A(this, 2131430479);
        AnonymousClass3Ma.A1L(this.A0E, textEmojiLabel);
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(Html.fromHtml(C17880vN.A0q(this, this.A0B.A03("1324084875126592").toString(), new Object[A1T], 0, 2131891656)));
        URLSpan[] uRLSpanArr = (URLSpan[]) A092.getSpans(0, A092.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                C72473Md.A0x(A092, uRLSpan, new C74703cE(this, this.A03, this.A05, this.A08, uRLSpan.getURL()));
            }
        }
        AnonymousClass3Ma.A1K(textEmojiLabel, this.A08);
        textEmojiLabel.setText(A092, TextView.BufferType.SPANNABLE);
        LinearLayout A0K2 = AnonymousClass3MX.A0K(this.A00, 2131430478);
        this.A0A = this.A02.A00(new Object());
        String stringExtra = getIntent().getStringExtra("prefilled_link_code");
        this.A0A.A03(A0K2, this, 8, false);
        if (!AnonymousClass1EG.A0H(stringExtra)) {
            BpB(stringExtra);
        }
        this.A00 = getIntent().getIntExtra("entry_point", A1T);
        getIntent().getStringExtra("agent_id");
        AgentDeviceLoginViewModel agentDeviceLoginViewModel = (AgentDeviceLoginViewModel) AnonymousClass3MW.A0N(this).A00(AgentDeviceLoginViewModel.class);
        this.A09 = agentDeviceLoginViewModel;
        C91624fz.A00(this, agentDeviceLoginViewModel.A00, 8);
        C91624fz.A00(this, this.A09.A01, 9);
        this.A09.A02.get();
        ((C195219sz) this.A0C.get()).A00(2);
    }

    public static BCS A03(LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity) {
        C63292sp A002;
        AnonymousClass4Q4 r0 = linkedDevicesEnterCodeActivity.A07;
        C17960vV.A02();
        C57572jI r02 = r0.A01;
        if (r02 == null) {
            return null;
        }
        r02.A00();
        AnonymousClass4Q4 r03 = linkedDevicesEnterCodeActivity.A07;
        C17960vV.A02();
        C57572jI r04 = r03.A01;
        if (r04 == null) {
            A002 = null;
        } else {
            A002 = r04.A00();
        }
        return A002.A05.A04;
    }

    public static void A0d(LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity, String str) {
        new AnonymousClass37C(C17880vN.A0U(linkedDevicesEnterCodeActivity.A0F)).A00(str, (String) null);
    }

    public void A2y() {
        if (!this.A0I) {
            this.A0I = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r1 = A0K2.AAQ;
            C72483Me.A0q(r1, this);
            AnonymousClass10G r2 = r1.A00;
            AnonymousClass1FB.A0K(r1, r2, this, r2.A45);
            AnonymousClass1FB.A0L(r1, r2, this, r2.A5A);
            this.A03 = AnonymousClass3Ma.A0L(r1);
            this.A0F = C000200d.A00(r1.A6N);
            this.A0B = AnonymousClass3Ma.A0t(r1);
            this.A0G = C000200d.A00(r1.AA1);
            this.A08 = AnonymousClass3MZ.A0r(r1);
            this.A0E = C000200d.A00(r1.A51);
            this.A01 = C19890zB.A00;
            this.A05 = (C35861mv) r1.AHr.get();
            this.A02 = (AnonymousClass4PW) A0K2.A24.get();
            this.A0C = C000200d.A00(r1.AD1);
            this.A04 = (AnonymousClass4MB) r2.AHM.get();
            this.A07 = (AnonymousClass4Q4) r2.A82.get();
            this.A06 = (C35871mw) r1.AHw.get();
            this.A0D = C000200d.A00(r1.AHx);
        }
    }

    public void BpB(String str) {
        C62292rA A002 = this.A05.A00();
        if (AnonymousClass3MW.A1Y(this)) {
            A3k(new AnonymousClass4bE(A002, this), 0, 2131891825);
            this.A05.CGN(new C21452AkJ(48, str, this));
        } else if (!Bed()) {
            A0c(this, 2);
        }
    }

    public void onDestroy() {
        AnonymousClass4Q4 r1 = this.A07;
        C17960vV.A02();
        r1.A01 = null;
        this.A08.unregisterObserver(this.A0K);
        this.A06.unregisterObserver(this.A0J);
        this.A09.A02.get();
        super.onDestroy();
    }

    public void onStop() {
        ((C54742ed) this.A0D.get()).A00 = false;
        super.onStop();
    }

    public static void A0Q(LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity) {
        linkedDevicesEnterCodeActivity.CEx();
        C17960vV.A02();
        Runnable runnable = linkedDevicesEnterCodeActivity.A0H;
        if (runnable != null) {
            linkedDevicesEnterCodeActivity.A00.removeCallbacks(runnable);
        }
    }

    public static void A0V(LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity) {
        A0Q(linkedDevicesEnterCodeActivity);
        Vibrator A0H2 = linkedDevicesEnterCodeActivity.A08.A0H();
        C17960vV.A07(A0H2);
        A0H2.vibrate(75);
        linkedDevicesEnterCodeActivity.finish();
    }

    public static void A0c(LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity, int i) {
        C73203Rj A002 = AnonymousClass4a6.A00(linkedDevicesEnterCodeActivity);
        C73203Rj.A03(linkedDevicesEnterCodeActivity, A002);
        A002.A0d(linkedDevicesEnterCodeActivity, new C91624fz(linkedDevicesEnterCodeActivity, 10));
        int i2 = 2131886545;
        if (i != 1) {
            i2 = 2131886544;
        }
        A002.A0E(i2);
        int i3 = 2131886543;
        if (i != 1) {
            i3 = 2131886541;
            if (i != 2) {
                i3 = 2131886542;
                if (i != 3) {
                    i3 = 2131886540;
                }
            }
        }
        A002.A0D(i3);
        A002.A0C();
    }

    public void onStart() {
        super.onStart();
        C54742ed r1 = (C54742ed) this.A0D.get();
        r1.A00 = true;
        r1.A02.BEJ(54, "CompanionRegWithLinkCodeNotificationManager/onEnterCodeActivityStart");
    }

    public LinkedDevicesEnterCodeActivity(int i) {
        this.A0I = false;
        C91004ez.A00(this, 16);
    }
}
