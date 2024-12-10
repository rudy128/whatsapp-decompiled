package com.whatsapp.companiondevice;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1RK;
import X.AnonymousClass1TH;
import X.AnonymousClass1TI;
import X.AnonymousClass1VD;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass4RW;
import X.AnonymousClass5Z3;
import X.C000200d;
import X.C102115Ff;
import X.C102125Fg;
import X.C102135Fh;
import X.C105255Rh;
import X.C105265Ri;
import X.C18070vi;
import X.C18100vl;
import X.C19880zA;
import X.C19890zB;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C88344Zh;
import X.C91004ez;
import X.C91644g1;
import X.C98804rk;
import android.os.Bundle;
import com.whatsapp.jid.DeviceJid;
import java.util.Map;

public final class LinkedDeviceEditDeviceActivity extends AnonymousClass1FY implements AnonymousClass5Z3 {
    public C19880zA A00;
    public C19880zA A01;
    public C19880zA A02;
    public C88344Zh A03;
    public AnonymousClass1RK A04;
    public DeviceJid A05;
    public AnonymousClass1VD A06;
    public AnonymousClass00H A07;
    public boolean A08;
    public boolean A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;

    public LinkedDeviceEditDeviceActivity() {
        this(0);
        this.A0C = AnonymousClass1DF.A01(new C102135Fh(this));
        this.A0A = AnonymousClass1DF.A01(new C102115Ff(this));
        this.A0B = AnonymousClass1DF.A01(new C102125Fg(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity r8) {
        /*
            X.4Zh r7 = r8.A03
            if (r7 != 0) goto L_0x0008
            r8.finish()
            return
        L_0x0008:
            android.view.View r1 = r8.A00
            r0 = 2131429962(0x7f0b0a4a, float:1.8481612E38)
            android.widget.ImageView r1 = X.AnonymousClass3Ma.A0C(r1, r0)
            int r0 = X.C87404Vl.A00(r7)
            r1.setImageResource(r0)
            android.view.View r1 = r8.A00
            r0 = 2131429963(0x7f0b0a4b, float:1.8481614E38)
            android.widget.TextView r1 = X.AnonymousClass3Ma.A0E(r1, r0)
            X.0ve r0 = r8.A0E
            java.lang.String r2 = X.C88344Zh.A01(r8, r7, r0)
            X.C18070vi.A0X(r2)
            r1.setText(r2)
            android.view.View r1 = r8.A00
            r0 = 2131429964(0x7f0b0a4c, float:1.8481616E38)
            android.view.View r1 = X.C18070vi.A05(r1, r0)
            r5 = 1
            X.78R r0 = new X.78R
            r0.<init>(r8, r7, r2, r5)
            r1.setOnClickListener(r0)
            android.view.View r1 = r8.A00
            r0 = 2131435709(0x7f0b20bd, float:1.8493268E38)
            android.widget.TextView r6 = X.AnonymousClass3Ma.A0E(r1, r0)
            long r1 = r7.A01
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1R(r0)
            if (r0 == 0) goto L_0x00ad
            r0 = 2131891663(0x7f1215cf, float:1.9418052E38)
        L_0x0057:
            java.lang.String r0 = r8.getString(r0)
        L_0x005b:
            r6.setText(r0)
            android.view.View r1 = r8.A00
            r0 = 2131433881(0x7f0b1999, float:1.848956E38)
            android.widget.TextView r1 = X.AnonymousClass3Ma.A0E(r1, r0)
            java.lang.String r0 = X.C88344Zh.A00(r8, r7)
            r1.setText(r0)
            android.view.View r1 = r8.A00
            r0 = 2131432179(0x7f0b12f3, float:1.8486108E38)
            android.view.View r6 = X.C18070vi.A05(r1, r0)
            android.view.View r1 = r8.A00
            r0 = 2131432195(0x7f0b1303, float:1.848614E38)
            android.widget.TextView r4 = X.AnonymousClass3Ma.A0E(r1, r0)
            java.lang.String r3 = r7.A04
            if (r3 == 0) goto L_0x00a7
            boolean r0 = X.AnonymousClass1YF.A0T(r3)
            if (r0 != 0) goto L_0x00a7
            r2 = 0
            r6.setVisibility(r2)
            r1 = 2131891661(0x7f1215cd, float:1.9418048E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r2] = r3
            X.AnonymousClass3MY.A0y(r8, r4, r0, r1)
        L_0x0098:
            android.view.View r1 = r8.A00
            r0 = 2131432206(0x7f0b130e, float:1.8486163E38)
            android.view.View r1 = X.C18070vi.A05(r1, r0)
            r0 = 47
            X.C89894dC.A00(r1, r8, r0)
            return
        L_0x00a7:
            r0 = 8
            r6.setVisibility(r0)
            goto L_0x0098
        L_0x00ad:
            boolean r0 = r8.A09
            if (r0 == 0) goto L_0x00b5
            r0 = 2131891683(0x7f1215e3, float:1.9418093E38)
            goto L_0x0057
        L_0x00b5:
            X.0vb r4 = r8.A00
            long r2 = r7.A00
            X.1RK r0 = r8.A04
            if (r0 == 0) goto L_0x00c8
            com.whatsapp.jid.DeviceJid r1 = r8.A05
            if (r1 != 0) goto L_0x00cb
            java.lang.String r0 = "deviceJid"
        L_0x00c3:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x00c8:
            java.lang.String r0 = "companionDeviceManager"
            goto L_0x00c3
        L_0x00cb:
            java.util.Set r0 = r0.A0N
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00db
            r0 = 2131891651(0x7f1215c3, float:1.9418028E38)
            java.lang.String r0 = r4.A09(r0)
            goto L_0x005b
        L_0x00db:
            java.lang.String r0 = X.C64052u8.A05(r4, r2)
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity.A03(com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity):void");
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A04 = AnonymousClass3MZ.A0r(A0L);
            this.A06 = (AnonymousClass1VD) A0L.A9J.get();
            this.A07 = C000200d.A00(A0L.AA1);
            C19890zB r0 = C19890zB.A00;
            this.A00 = r0;
            this.A01 = r0;
            this.A02 = (C19880zA) A0L.A7k.get();
        }
    }

    public void CQe(Map map) {
        C88344Zh r5 = this.A03;
        if (r5 != null && !AnonymousClass000.A1R((r5.A01 > 0 ? 1 : (r5.A01 == 0 ? 0 : -1)))) {
            this.A09 = C72453Mb.A1Y((Boolean) map.get(r5.A08));
            A03(this);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05 = DeviceJid.Companion.A05(getIntent().getStringExtra("device_jid_raw_string"));
        setTitle(2131891655);
        setContentView(2131625825);
        C72473Md.A18(this);
        C91644g1.A00(this, ((LinkedDeviceEditDeviceViewModel) this.A0C.getValue()).A00, AnonymousClass3MW.A16(this, 36), 3);
        C18100vl r2 = this.A0A;
        C91644g1.A00(this, ((LinkedDevicesSharedViewModel) r2.getValue()).A0K, new C105255Rh(this), 3);
        C91644g1.A00(this, ((LinkedDevicesSharedViewModel) r2.getValue()).A0R, new C105265Ri(this), 3);
        ((LinkedDevicesSharedViewModel) r2.getValue()).A0T();
        ((AnonymousClass4RW) this.A0B.getValue()).A00();
    }

    public void onDestroy() {
        super.onDestroy();
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = (LinkedDevicesSharedViewModel) this.A0A.getValue();
        linkedDevicesSharedViewModel.A0C.unregisterObserver(linkedDevicesSharedViewModel.A0B);
        AnonymousClass1TH r2 = linkedDevicesSharedViewModel.A0G;
        AnonymousClass1TI r1 = linkedDevicesSharedViewModel.A0U;
        C18070vi.A0d(r1, 0);
        r2.A00.A02(r1);
        linkedDevicesSharedViewModel.A0F.unregisterObserver(linkedDevicesSharedViewModel.A0E);
    }

    public void onStart() {
        super.onStart();
        LinkedDeviceEditDeviceViewModel linkedDeviceEditDeviceViewModel = (LinkedDeviceEditDeviceViewModel) this.A0C.getValue();
        DeviceJid deviceJid = this.A05;
        if (deviceJid == null) {
            C18070vi.A11("deviceJid");
            throw null;
        } else {
            C98804rk.A01(linkedDeviceEditDeviceViewModel.A02, linkedDeviceEditDeviceViewModel, deviceJid, 42);
        }
    }

    public LinkedDeviceEditDeviceActivity(int i) {
        this.A08 = false;
        C91004ez.A00(this, 14);
    }
}
