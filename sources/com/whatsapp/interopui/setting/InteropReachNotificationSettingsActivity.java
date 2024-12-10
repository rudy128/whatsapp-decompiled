package com.whatsapp.interopui.setting;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1OR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass42E;
import X.AnonymousClass4SJ;
import X.C000200d;
import X.C003401n;
import X.C137506vZ;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C30451dy;
import X.C33971jg;
import X.C37581pm;
import X.C41561wd;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C825148g;
import X.C91014f0;
import X.C99154sM;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.interopui.notification.InteropNotifOptInViewModel;
import com.whatsapp.interopui.notification.InteropNotifOptInViewModel$loadSetting$1;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import com.whatsapp.wds.components.toggle.WDSSwitch;

public final class InteropReachNotificationSettingsActivity extends AnonymousClass1FY {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public boolean A02;
    public final C18100vl A03;
    public final View.OnClickListener A04;

    public InteropReachNotificationSettingsActivity() {
        this(0);
        this.A03 = C99154sM.A01(this, 32);
        this.A04 = new C825148g(this, 39);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131624065);
        Toolbar A0T = C72463Mc.A0T(this);
        super.setSupportActionBar(A0T);
        C003401n supportActionBar = getSupportActionBar();
        C72473Md.A16(supportActionBar);
        String A0F = C18070vi.A0F(this, 2131899343);
        supportActionBar.A0S(A0F);
        C137506vZ.A01(A0T, this.A00, A0F);
        TextView A0L = AnonymousClass3MX.A0L(this, 2131435084);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131431752);
        C18070vi.A0b(A0L);
        A0L.setText(2131894897);
        WDSListItem wDSListItem = (WDSListItem) AnonymousClass3MY.A0H(this, 2131431775);
        WDSSwitch wDSSwitch = wDSListItem.A0D;
        if (wDSSwitch != null) {
            AnonymousClass00H r0 = this.A01;
            if (r0 != null) {
                wDSSwitch.setChecked(C17880vN.A1W(C33971jg.A00(AnonymousClass3MX.A0k(r0)), "interop_reach_enabled"));
                wDSSwitch.setOnClickListener(this.A04);
            } else {
                str = "uiCache";
                C18070vi.A11(str);
                throw null;
            }
        }
        wDSListItem.setOnClickListener(this.A04);
        AnonymousClass00H r02 = this.A00;
        if (r02 != null) {
            C18100vl r5 = this.A03;
            AnonymousClass42E r2 = new AnonymousClass42E((AnonymousClass4SJ) C18070vi.A0E(r02), (InteropNotifOptInViewModel) r5.getValue());
            C18070vi.A0b(recyclerView);
            C72483Me.A0f(this, recyclerView);
            recyclerView.setAdapter(r2);
            C37581pm A0H = AnonymousClass3MZ.A0H(this);
            InteropReachNotificationSettingsActivity$registerEnabledUpdates$1 interopReachNotificationSettingsActivity$registerEnabledUpdates$1 = new InteropReachNotificationSettingsActivity$registerEnabledUpdates$1(A0L, recyclerView, this, wDSListItem, wDSSwitch, (C30391dr) null);
            AnonymousClass1OR r4 = AnonymousClass1OR.A00;
            Integer A0w = AnonymousClass3MW.A0w(r4, interopReachNotificationSettingsActivity$registerEnabledUpdates$1, A0H);
            C30451dy.A02(A0w, r4, new InteropReachNotificationSettingsActivity$registerIntegratorsUpdates$1(r2, this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
            C30451dy.A02(A0w, r4, new InteropReachNotificationSettingsActivity$registerSaveResultStatus$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
            InteropNotifOptInViewModel interopNotifOptInViewModel = (InteropNotifOptInViewModel) r5.getValue();
            C30451dy.A02(A0w, r4, new InteropNotifOptInViewModel$loadSetting$1(interopNotifOptInViewModel, (C30391dr) null), C41561wd.A00(interopNotifOptInViewModel));
            return;
        }
        str = "imageLoader";
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.whatsapp.interopui.setting.InteropReachNotificationSettingsActivity r6, X.C30391dr r7) {
        /*
            boolean r0 = r7 instanceof X.C100424uU
            if (r0 == 0) goto L_0x0047
            r5 = r7
            X.4uU r5 = (X.C100424uU) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0047
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 != r1) goto L_0x004d
            java.lang.Object r6 = r5.L$0
            X.1FU r6 = (X.AnonymousClass1FU) r6
            X.C30691eM.A01(r2)
        L_0x0024:
            r6.CEx()
        L_0x0027:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002a:
            X.C30691eM.A01(r2)
            boolean r0 = X.C23451Gc.A02
            if (r0 == 0) goto L_0x0027
            X.11P r0 = r6.A05
            long r2 = java.lang.System.currentTimeMillis()
            X.C18070vi.A0W(r0)
            r5.L$0 = r6
            r5.label = r1
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.AnonymousClass4ZQ.A00(r5, r2, r0)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x0047:
            X.4uU r5 = new X.4uU
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x004d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interopui.setting.InteropReachNotificationSettingsActivity.A03(com.whatsapp.interopui.setting.InteropReachNotificationSettingsActivity, X.1dr):java.lang.Object");
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = C000200d.A00(r1.A2q);
            this.A01 = C000200d.A00(A0L.A5V);
        }
    }

    public InteropReachNotificationSettingsActivity(int i) {
        this.A02 = false;
        C91014f0.A00(this, 33);
    }
}
