package com.whatsapp.settings;

import X.A87;
import X.A8I;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11X;
import X.AnonymousClass11Y;
import X.AnonymousClass181;
import X.AnonymousClass1EG;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4NL;
import X.AnonymousClass4a6;
import X.C000200d;
import X.C110885hR;
import X.C17880vN;
import X.C18000vb;
import X.C41361wE;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C87824Xf;
import X.C88584aA;
import X.C88814ar;
import X.C90094dW;
import X.C91034f2;
import X.C99794tT;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.Statistics$Data;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.util.Log;
import java.text.NumberFormat;
import java.util.Timer;
import java.util.TimerTask;

public class SettingsNetworkUsage extends AnonymousClass1FY {
    public Handler A00;
    public AnonymousClass181 A01;
    public C18000vb A02;
    public AnonymousClass00H A03;
    public TimerTask A04;
    public boolean A05;
    public final Timer A06;

    public SettingsNetworkUsage() {
        this(0);
        this.A06 = new Timer("refresh-network-usage");
    }

    public class ResetUsageConfirmationDialog extends Hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog {
        public Dialog A27(Bundle bundle) {
            C73203Rj A03 = AnonymousClass4a6.A03(this);
            A03.A0D(2131895943);
            return C73203Rj.A00(new C88814ar(this, 12), A03, 2131895300);
        }
    }

    public static void A0Q(SettingsNetworkUsage settingsNetworkUsage, boolean z) {
        String A0q;
        SettingsNetworkUsage settingsNetworkUsage2 = settingsNetworkUsage;
        if (z) {
            AnonymousClass181 r2 = settingsNetworkUsage2.A01;
            Log.i("statistics/reset");
            r2.A02();
            r2.A00.sendEmptyMessage(9);
        }
        Statistics$Data A012 = settingsNetworkUsage2.A01.A01();
        NumberFormat instance = NumberFormat.getInstance(settingsNetworkUsage2.A02.A0N());
        long j = A012.A0E + A012.A0G + A012.A0M + A012.A0D + A012.A0J;
        long j2 = A012.A01 + A012.A03 + A012.A0B + A012.A00 + A012.A08;
        long j3 = j + j2;
        AnonymousClass4NL A013 = C88584aA.A01(settingsNetworkUsage2.A02, j3);
        StringBuilder A10 = AnonymousClass000.A10();
        String str = A013.A01;
        A10.append(str);
        A10.append(A013.A02);
        String str2 = A013.A00;
        SpannableString spannableString = new SpannableString(AnonymousClass000.A0y(str2, A10));
        if (!str.isEmpty()) {
            spannableString.setSpan(new AbsoluteSizeSpan(16, true), 0, str.length(), 33);
        }
        if (!str2.isEmpty()) {
            spannableString.setSpan(new AbsoluteSizeSpan(16, true), spannableString.length() - str2.length(), spannableString.length(), 33);
        }
        AnonymousClass3MW.A0I(settingsNetworkUsage2, 2131436324).setText(spannableString);
        AnonymousClass3MW.A0I(settingsNetworkUsage2, 2131436326).setText(C88584aA.A04(settingsNetworkUsage2.A02, j));
        AnonymousClass3MW.A0I(settingsNetworkUsage2, 2131436325).setText(C88584aA.A04(settingsNetworkUsage2.A02, j2));
        long j4 = j3;
        SettingsNetworkUsage settingsNetworkUsage3 = settingsNetworkUsage2;
        settingsNetworkUsage3.A03(2131428663, 2131428662, 2131428763, A012.A0M, A012.A0B, j4);
        long j5 = A012.A0N;
        long j6 = A012.A0C;
        TextView A0I = AnonymousClass3MW.A0I(settingsNetworkUsage2, 2131428768);
        C18000vb r8 = settingsNetworkUsage2.A02;
        A0I.setText(AnonymousClass1EG.A04(r8, r8.A0K(new Object[]{instance.format(j5)}, 2131755392, j5), settingsNetworkUsage2.A02.A0K(new Object[]{instance.format(j6)}, 2131755391, j6)));
        settingsNetworkUsage3.A03(2131432394, 2131432393, 2131432392, A012.A0E, A012.A01, j4);
        long j7 = A012.A0D;
        long j8 = A012.A00;
        if (C41361wE.A09(settingsNetworkUsage2.getApplicationContext()) || j7 > 0 || j8 > 0) {
            settingsNetworkUsage3.A03(2131431087, 2131431086, 2131431085, j7, j8, j4);
        } else {
            C110885hR.A0A(settingsNetworkUsage2, 2131431099).setVisibility(8);
        }
        settingsNetworkUsage3.A03(2131432695, 2131432694, 2131432693, A012.A0G, A012.A03, j4);
        long j9 = A012.A0L + A012.A0F;
        long j10 = A012.A0A + A012.A02;
        TextView A0I2 = AnonymousClass3MW.A0I(settingsNetworkUsage2, 2131432697);
        C18000vb r12 = settingsNetworkUsage2.A02;
        A0I2.setText(AnonymousClass1EG.A04(r12, r12.A0K(new Object[]{instance.format(j9)}, 2131755394, j9), settingsNetworkUsage2.A02.A0K(new Object[]{instance.format(j10)}, 2131755393, j10)));
        settingsNetworkUsage3.A03(2131435628, 2131435627, 2131435626, A012.A0J, A012.A08, j4);
        long j11 = A012.A0K;
        long j12 = A012.A09;
        TextView A0I3 = AnonymousClass3MW.A0I(settingsNetworkUsage2, 2131435652);
        C18000vb r122 = settingsNetworkUsage2.A02;
        A0I3.setText(AnonymousClass1EG.A04(r122, r122.A0K(new Object[]{instance.format(j11)}, 2131755396, j11), settingsNetworkUsage2.A02.A0K(new Object[]{instance.format(j12)}, 2131755395, j12)));
        SettingsNetworkUsage settingsNetworkUsage4 = settingsNetworkUsage2;
        settingsNetworkUsage4.A03(2131434733, 2131434732, 2131434731, A012.A0I, A012.A07, j3);
        long j13 = A012.A0O;
        if (j13 != Long.MIN_VALUE) {
            C110885hR.A0A(settingsNetworkUsage2, 2131431953).setVisibility(0);
            C18000vb r6 = settingsNetworkUsage2.A02;
            AnonymousClass11Y r10 = AnonymousClass11X.A00;
            A0q = C17880vN.A0q(settingsNetworkUsage2, A87.A03(r6, r10.A0B(r6, j13), A8I.A00(r6, j13)), new Object[1], 0, 2131892442);
            AnonymousClass3MY.A0y(settingsNetworkUsage2, AnonymousClass3MW.A0I(settingsNetworkUsage2, 2131431953), new Object[]{r10.A0B(settingsNetworkUsage2.A02, j13)}, 2131895944);
        } else {
            A0q = C17880vN.A0q(settingsNetworkUsage2, settingsNetworkUsage2.getString(2131892444), new Object[1], 0, 2131892442);
            C110885hR.A0A(settingsNetworkUsage2, 2131431953).setVisibility(8);
        }
        AnonymousClass3MW.A0I(settingsNetworkUsage2, 2131431954).setText(A0q);
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A01 = (AnonymousClass181) r2.AA9.get();
            this.A02 = AnonymousClass10E.A6Q(r2);
            this.A03 = C000200d.A00(A0K.A5o);
        }
    }

    private void A03(int i, int i2, int i3, long j, long j2, long j3) {
        TextView A0I = AnonymousClass3MW.A0I(this, i);
        String A042 = C88584aA.A04(this.A02, j);
        A0I.setText(A042);
        String A0F = this.A02.A0F(A042);
        int i4 = 0;
        A0I.setContentDescription(C17880vN.A0q(this, A0F, new Object[1], 0, 2131895829));
        TextView A0I2 = AnonymousClass3MW.A0I(this, i2);
        String A043 = C88584aA.A04(this.A02, j2);
        A0I2.setText(A043);
        A0I2.setContentDescription(C17880vN.A0q(this, this.A02.A0F(A043), new Object[1], 0, 2131895828));
        if (j3 > 0) {
            i4 = (int) ((((float) (j + j2)) * 100.0f) / ((float) j3));
        }
        ((RoundCornerProgressBar) C110885hR.A0A(this, i3)).setProgress(i4);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131895942);
        setContentView(2131626568);
        C72473Md.A17(this);
        View A0A = C110885hR.A0A(this, 2131434629);
        C90094dW.A00(A0A, this, 9);
        AnonymousClass3MW.A1Q(A0A);
        this.A00 = new Handler(Looper.myLooper());
        ((C87824Xf) this.A03.get()).A02(this.A00, "network_usage", C72453Mb.A0w(this));
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.cancel();
    }

    public void onPause() {
        super.onPause();
        this.A04.cancel();
    }

    public void onResume() {
        super.onResume();
        C99794tT r1 = new C99794tT(this);
        this.A04 = r1;
        this.A06.scheduleAtFixedRate(r1, 0, 1000);
    }

    public SettingsNetworkUsage(int i) {
        this.A05 = false;
        C91034f2.A00(this, 17);
    }
}
