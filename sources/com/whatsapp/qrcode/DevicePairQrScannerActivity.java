package com.whatsapp.qrcode;

import X.AFD;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11P;
import X.AnonymousClass1FB;
import X.AnonymousClass1RK;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass46N;
import X.AnonymousClass4MB;
import X.AnonymousClass4Qn;
import X.AnonymousClass7RB;
import X.C000200d;
import X.C108555bt;
import X.C17880vN;
import X.C17960vV;
import X.C19880zA;
import X.C19890zB;
import X.C26701Td;
import X.C28931bI;
import X.C40751vD;
import X.C54182dj;
import X.C56632hm;
import X.C57572jI;
import X.C58392kc;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C91024f1;
import X.C91614fy;
import X.C95524mN;
import X.C97664pq;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Html;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;

public class DevicePairQrScannerActivity extends AnonymousClass46N {
    public static final long A0K = (TimeUnit.SECONDS.toMillis(6) + 32000);
    public static final long A0L = TimeUnit.SECONDS.toMillis(4);
    public int A00;
    public C19880zA A01;
    public C56632hm A02;
    public C40751vD A03;
    public AnonymousClass4MB A04;
    public C54182dj A05;
    public AnonymousClass1RK A06;
    public AgentDeviceLoginViewModel A07;
    public C57572jI A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public Runnable A0E;
    public String A0F;
    public boolean A0G;
    public final C108555bt A0H;
    public final Runnable A0I;
    public final C26701Td A0J;

    public DevicePairQrScannerActivity() {
        this(0);
        this.A0I = new AnonymousClass7RB((Object) this, 21);
        this.A0H = new C97664pq(this, 1);
        this.A0J = new C95524mN(this, 3);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            AnonymousClass4Qn r2 = (AnonymousClass4Qn) this.A0B.get();
            if (i2 == 0) {
                r2.A00(4);
            } else {
                r2.A00 = AnonymousClass11P.A01(r2.A02);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public static void A03(DevicePairQrScannerActivity devicePairQrScannerActivity) {
        Runnable runnable = devicePairQrScannerActivity.A0E;
        if (runnable != null) {
            devicePairQrScannerActivity.A00.removeCallbacks(runnable);
        }
        devicePairQrScannerActivity.CEx();
    }

    public void A2y() {
        if (!this.A0G) {
            this.A0G = true;
            AnonymousClass10E A0L2 = C72473Md.A0L(this);
            C72483Me.A0q(A0L2, this);
            AnonymousClass10G r2 = A0L2.A00;
            AnonymousClass1FB.A0K(A0L2, r2, this, r2.A45);
            AnonymousClass1FB.A0L(A0L2, r2, this, r2.A5A);
            this.A03 = AnonymousClass3MZ.A0Z(A0L2);
            this.A04 = AnonymousClass3Ma.A0b(A0L2);
            this.A03 = C72453Mb.A0d(A0L2);
            this.A0D = C000200d.A00(A0L2.AA1);
            this.A06 = AnonymousClass3MZ.A0r(A0L2);
            this.A0B = C000200d.A00(r2.A94);
            this.A09 = C000200d.A00(A0L2.AD1);
            this.A01 = C19890zB.A00;
            this.A04 = (AnonymousClass4MB) r2.AHM.get();
            this.A0C = C000200d.A00(A0L2.A51);
            this.A05 = (C54182dj) r2.ADj.get();
            this.A02 = (C56632hm) r2.A23.get();
            this.A0A = C000200d.A00(A0L2.AHv);
        }
    }

    public void onDestroy() {
        this.A06.unregisterObserver(this.A0J);
        synchronized (this.A05.A00) {
        }
        this.A07.A02.get();
        ((AnonymousClass4Qn) this.A0B.get()).A00(2);
        super.onDestroy();
    }

    public static void A0Q(DevicePairQrScannerActivity devicePairQrScannerActivity) {
        A03(devicePairQrScannerActivity);
        Vibrator A0H2 = devicePairQrScannerActivity.A08.A0H();
        C17960vV.A07(A0H2);
        A0H2.vibrate(75);
        devicePairQrScannerActivity.finish();
    }

    public void A3h(int i) {
        if (i == 2131892440 || i == 2131892439 || i == 2131889984) {
            this.A05.CFY();
        } else if (i == 1000) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05.setShouldUseGoogleVisionScanner(true);
        this.A08 = this.A02.A00(this.A0H);
        this.A02.setText(Html.fromHtml(C17880vN.A0q(this, "web.whatsapp.com", new Object[1], 0, 2131894854)));
        this.A02.setVisibility(0);
        if (((C58392kc) this.A0A.get()).A01()) {
            String string = getString(2131894856);
            AFD afd = new AFD(this, 20);
            C28931bI A0x = AnonymousClass3Ma.A0x(this, 2131428317);
            ((TextView) C72463Mc.A0N(A0x)).setText(string);
            A0x.A05(afd);
        }
        this.A06.registerObserver(this.A0J);
        synchronized (this.A05.A00) {
        }
        this.A00 = getIntent().getIntExtra("entry_point", 1);
        this.A0F = getIntent().getStringExtra("agent_id");
        AgentDeviceLoginViewModel agentDeviceLoginViewModel = (AgentDeviceLoginViewModel) AnonymousClass3MW.A0N(this).A00(AgentDeviceLoginViewModel.class);
        this.A07 = agentDeviceLoginViewModel;
        C91614fy.A00(this, agentDeviceLoginViewModel.A00, 6);
        C91614fy.A00(this, this.A07.A01, 7);
        this.A07.A02.get();
        if (this.A04.A02("android.permission.CAMERA") == 0) {
            AnonymousClass4Qn r2 = (AnonymousClass4Qn) this.A0B.get();
            r2.A00 = AnonymousClass11P.A01(r2.A02);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public DevicePairQrScannerActivity(int i) {
        this.A0G = false;
        C91024f1.A00(this, 42);
    }
}
