package com.whatsapp.messaging;

import X.A9c;
import X.AGB;
import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass1FP;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.C137116uw;
import X.C17890vO;
import X.C17900vP;
import X.C20151A9n;
import X.C20153A9p;
import X.C62332rE;
import X.C73203Rj;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import com.whatsapp.util.Log;

public class CaptivePortalActivity extends AnonymousClass1FP {
    public AnonymousClass11C A00;
    public C62332rE A01;
    public boolean A02;

    public void onCreate(Bundle bundle) {
        WifiInfo connectionInfo;
        int length;
        requestWindowFeature(1);
        super.onCreate(bundle);
        WifiManager A0F = this.A00.A0F();
        if (A0F == null) {
            Log.w("captiveportalactivity/create wm=null");
            connectionInfo = null;
        } else {
            connectionInfo = A0F.getConnectionInfo();
        }
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0T(false);
        A002.A0E(2131892932);
        A002.A0Y(new C20151A9n(this, 36), 2131899286);
        A002.A0X(new C20153A9p(A0F, this, 12), 2131889462);
        if (connectionInfo != null) {
            int networkId = connectionInfo.getNetworkId();
            String ssid = connectionInfo.getSSID();
            if (ssid != null && (length = ssid.length()) >= 2 && ((ssid.startsWith("\"") || ssid.startsWith("'")) && (ssid.endsWith("\"") || ssid.endsWith("'")))) {
                ssid = ssid.substring(1, length - 1);
            }
            C17900vP.A0f("wifi network name is ", ssid, AnonymousClass000.A10());
            A002.A0S(C17890vO.A0R(this, ssid, 1, 0, 2131898577));
            A002.A0L(new A9c(A0F, this, ssid, networkId), C17890vO.A0R(this, ssid, 1, 0, 2131890511));
        } else {
            A002.A0D(2131898576);
        }
        Log.i("captive portal dialog created");
        A002.A0C();
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E r1 = C137116uw.A00(this).AAQ;
            this.A05 = AnonymousClass10E.AL1(r1);
            this.A00 = AnonymousClass3Ma.A0a(r1);
            this.A01 = (C62332rE) r1.A70.get();
        }
    }

    public CaptivePortalActivity(int i) {
        this.A02 = false;
        AGB.A00(this, 43);
    }

    public void onPause() {
        super.onPause();
        this.A01.A00.removeMessages(1);
        this.A01.A02();
    }

    public void onResume() {
        super.onResume();
        this.A01.A00.sendEmptyMessageDelayed(1, 3000);
    }

    public CaptivePortalActivity() {
        this(0);
    }
}
