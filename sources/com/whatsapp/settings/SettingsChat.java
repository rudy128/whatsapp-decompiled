package com.whatsapp.settings;

import X.A1Q;
import X.A3f;
import X.AQZ;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11O;
import X.AnonymousClass18K;
import X.AnonymousClass1DC;
import X.AnonymousClass1DS;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1NM;
import X.AnonymousClass1NW;
import X.AnonymousClass1Nb;
import X.AnonymousClass1Q0;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass46t;
import X.AnonymousClass4YR;
import X.AnonymousClass4aW;
import X.C000200d;
import X.C000500i;
import X.C1600586y;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18020vd;
import X.C18040vf;
import X.C19830z4;
import X.C20099A7c;
import X.C23321Fo;
import X.C23501Gn;
import X.C23681Hf;
import X.C25351CeA;
import X.C27341Vs;
import X.C41361wE;
import X.C47822Kc;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C91034f2;
import X.C95274ly;
import android.app.Dialog;
import android.content.res.Configuration;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import java.util.Locale;
import java.util.Set;

public class SettingsChat extends AnonymousClass46t implements C23321Fo {
    public SwitchCompat A00;
    public SwitchCompat A01;
    public SwitchCompat A02;
    public AnonymousClass1DS A03;
    public AnonymousClass1NW A04;
    public C27341Vs A05;
    public C47822Kc A06;
    public AnonymousClass1Q0 A07;
    public AnonymousClass1NM A08;
    public A1Q A09;
    public C23681Hf A0A;
    public AnonymousClass18K A0B;
    public AnonymousClass1LU A0C;
    public AnonymousClass4YR A0D;
    public AnonymousClass1Nb A0E;
    public AnonymousClass4aW A0F;
    public AnonymousClass1DC A0G;
    public WDSListItem A0H;
    public WDSListItem A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public String A0R;
    public String[] A0S;
    public TextView A0T;
    public SettingsChatViewModel A0U;
    public boolean A0V;
    public boolean A0W;
    public String[] A0X;
    public final C23501Gn A0Y;
    public final C1600586y A0Z;
    public final Set A0a;

    public SettingsChat() {
        this(0);
        this.A0Z = new AQZ(this, 1);
        this.A0R = null;
        this.A03 = null;
        this.A0a = C17880vN.A12();
        this.A0Y = new C95274ly(this, 2);
    }

    public void C5k(int i, int i2) {
        if (i == 1) {
            C17880vN.A1E(C19830z4.A00(this.A0A), "interface_font_size", String.valueOf(Integer.valueOf(this.A0S[i2]).intValue()));
            this.A0T.setText(this.A0X[i2]);
            C17890vO.A0q(this.A06, 10);
        } else if (i == 2 && this.A0D.A02(i2)) {
            this.A0I.setSubText((CharSequence) this.A0D.A00());
            finish();
            overridePendingTransition(0, 2130772022);
            this.A0W = true;
            startActivity(getIntent());
        }
    }

    public static void A0V(View view, SettingsChat settingsChat, boolean z) {
        if (C18020vd.A05(C18040vf.A02, AnonymousClass3MX.A0y(settingsChat.A0O).A01, 9215)) {
            String str = (String) AnonymousClass3MX.A0y(settingsChat.A0O).A05.getValue();
            if (z && str != null) {
                C17880vN.A0E(view, 2131434021).setText(C25351CeA.A01(Locale.forLanguageTag(str)));
                view.setVisibility(0);
                return;
            }
        }
        view.setVisibility(8);
    }

    public static void A0c(SettingsChat settingsChat) {
        WDSListItem wDSListItem;
        String string;
        if (settingsChat.A0H != null) {
            if (C41361wE.A09(settingsChat.getApplicationContext())) {
                wDSListItem = settingsChat.A0H;
                string = null;
            } else if (settingsChat.A04.A03()) {
                SettingsChatViewModel settingsChatViewModel = settingsChat.A0U;
                AnonymousClass3MZ.A1U(settingsChatViewModel.A02, settingsChatViewModel, 44);
                return;
            } else {
                wDSListItem = settingsChat.A0H;
                string = settingsChat.getString(2131895938);
            }
            wDSListItem.setSubText((CharSequence) string);
        }
    }

    public void A2y() {
        if (!this.A0V) {
            this.A0V = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r3 = A0K2.AAQ;
            C72483Me.A0q(r3, this);
            AnonymousClass10G r2 = r3.A00;
            AnonymousClass1FB.A0K(r3, r2, this, r2.A45);
            AnonymousClass1FB.A0L(r3, r2, this, r2.A5A);
            this.A0C = AnonymousClass3MY.A0Z(r3);
            this.A0B = AnonymousClass3Ma.A0g(r3);
            this.A07 = (AnonymousClass1Q0) r3.A0M.get();
            this.A0G = AnonymousClass3MZ.A13(r3);
            this.A0L = C000200d.A00(r3.A14);
            this.A0F = (AnonymousClass4aW) r2.A5C.get();
            this.A05 = (C27341Vs) r3.A0i.get();
            this.A0E = AnonymousClass3MZ.A11(r3);
            this.A08 = (AnonymousClass1NM) r3.A6D.get();
            this.A09 = (A1Q) r3.AXQ.get();
            this.A0A = (C23681Hf) r3.AKG.get();
            this.A0P = C000200d.A00(A0K2.A5o);
            this.A0Q = C000200d.A00(r2.A4a);
            this.A0D = new AnonymousClass4YR(C000500i.A00(r3.Ao9), (AnonymousClass11O) r3.ABn.get(), (C18000vb) r3.ABz.get());
            this.A04 = (AnonymousClass1NW) r3.A0h.get();
            this.A06 = (C47822Kc) r2.AGx.get();
            this.A0K = C000200d.A00(r3.AFt);
            this.A0O = C000200d.A00(r3.A9G);
            this.A0N = C000200d.A00(r3.AXd);
            this.A0J = C000200d.A00(r3.A0j);
            this.A0M = C000200d.A00(r2.A3z);
        }
    }

    public void A3s(Configuration configuration) {
        if (!this.A0W) {
            super.A3s(configuration);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d A[LOOP:0: B:12:0x004d->B:15:0x005d, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            if (r5 != 0) goto L_0x0044
            if (r6 == 0) goto L_0x0044
            java.lang.String r0 = "oom"
            r2 = 0
            boolean r0 = r6.getBooleanExtra(r0, r2)
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = "conversation/activityres/oom-error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1KB r1 = r3.A05
            r0 = 2131889999(0x7f120f4f, float:1.9414677E38)
            r1.A0E(r3, r0)
        L_0x001a:
            java.lang.String r0 = "no-space"
            boolean r0 = r6.getBooleanExtra(r0, r2)
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "conversation/activityres/no-space"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1KB r1 = r3.A05
            r0 = 2131889993(0x7f120f49, float:1.9414665E38)
            r1.A0E(r3, r0)
        L_0x002f:
            java.lang.String r0 = "io-error"
            boolean r0 = r6.getBooleanExtra(r0, r2)
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "conversation/activityres/fail/load-image"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1KB r1 = r3.A05
            r0 = 2131889981(0x7f120f3d, float:1.941464E38)
            r1.A0E(r3, r0)
        L_0x0044:
            super.onActivityResult(r4, r5, r6)
            java.util.Set r0 = r3.A0a
            java.util.Iterator r1 = r0.iterator()
        L_0x004d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r1.next()
            X.5Ye r0 = (X.C107045Ye) r0
            boolean r0 = r0.Bky(r6, r4, r5)
            if (r0 == 0) goto L_0x004d
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsChat.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.A0W) {
            super.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [X.4GR, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v76, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x03e5, code lost:
        if (r2 == 2) goto L_0x03e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0475  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r10 = r20
            r0 = r21
            super.onCreate(r0)
            X.1It r1 = X.AnonymousClass3MW.A0N(r10)
            java.lang.Class<com.whatsapp.settings.SettingsChatViewModel> r0 = com.whatsapp.settings.SettingsChatViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.settings.SettingsChatViewModel r0 = (com.whatsapp.settings.SettingsChatViewModel) r0
            r10.A0U = r0
            r0 = 2131895812(0x7f122604, float:1.9426468E38)
            r10.setTitle(r0)
            r0 = 2131626544(0x7f0e0a30, float:1.8880327E38)
            r10.setContentView((int) r0)
            X.C72473Md.A17(r10)
            r0 = 2131430065(0x7f0b0ab1, float:1.848182E38)
            android.view.ViewStub r2 = X.AnonymousClass3MX.A0H(r10, r0)
            boolean r1 = X.AnonymousClass3MX.A1U(r10)
            r0 = 2131626548(0x7f0e0a34, float:1.8880335E38)
            if (r1 == 0) goto L_0x0037
            r0 = 2131627597(0x7f0e0e4d, float:1.8882463E38)
        L_0x0037:
            android.view.View r1 = X.AnonymousClass3MY.A0G(r2, r0)
            boolean r0 = r1 instanceof com.whatsapp.wds.components.list.header.WDSSectionHeader
            if (r0 == 0) goto L_0x0047
            com.whatsapp.wds.components.list.header.WDSSectionHeader r1 = (com.whatsapp.wds.components.list.header.WDSSectionHeader) r1
            r0 = 2131889505(0x7f120d61, float:1.9413675E38)
            r1.setHeaderText((int) r0)
        L_0x0047:
            r0 = 2131429054(0x7f0b06be, float:1.847977E38)
            android.view.ViewStub r2 = X.AnonymousClass3MX.A0H(r10, r0)
            boolean r1 = X.AnonymousClass3MX.A1U(r10)
            r0 = 2131626547(0x7f0e0a33, float:1.8880333E38)
            if (r1 == 0) goto L_0x005a
            r0 = 2131627597(0x7f0e0e4d, float:1.8882463E38)
        L_0x005a:
            android.view.View r1 = X.AnonymousClass3MY.A0G(r2, r0)
            boolean r0 = r1 instanceof com.whatsapp.wds.components.list.header.WDSSectionHeader
            if (r0 == 0) goto L_0x006a
            com.whatsapp.wds.components.list.header.WDSSectionHeader r1 = (com.whatsapp.wds.components.list.header.WDSSectionHeader) r1
            r0 = 2131888194(0x7f120842, float:1.9411016E38)
            r1.setHeaderText((int) r0)
        L_0x006a:
            android.view.View r1 = r10.A00
            r0 = 2131430487(0x7f0b0c57, float:1.8482676E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r10.A00 = r0
            android.view.View r1 = r10.A00
            r0 = 2131432455(0x7f0b1407, float:1.8486668E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r10.A01 = r0
            android.view.View r1 = r10.A00
            r0 = 2131430948(0x7f0b0e24, float:1.8483611E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r1, r0)
            r10.A0T = r0
            android.view.View r1 = r10.A00
            r0 = 2131435554(0x7f0b2022, float:1.8492953E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r10.A02 = r0
            android.view.View r1 = r10.A00
            r0 = 2131429055(0x7f0b06bf, float:1.8479772E38)
            X.1bI r19 = X.C28931bI.A00(r1, r0)
            android.view.View r1 = r10.A00
            r0 = 2131435328(0x7f0b1f40, float:1.8492495E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = (com.whatsapp.wds.components.list.listitem.WDSListItem) r0
            r10.A0I = r0
            android.view.View r1 = r10.A00
            r0 = 2131436979(0x7f0b25b3, float:1.8495844E38)
            android.view.View r11 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r11 = (com.whatsapp.wds.components.list.listitem.WDSListItem) r11
            android.view.View r1 = r10.A00
            r0 = 2131430486(0x7f0b0c56, float:1.8482674E38)
            android.view.View r12 = X.AnonymousClass1HF.A06(r1, r0)
            android.view.View r1 = r10.A00
            r0 = 2131430947(0x7f0b0e23, float:1.848361E38)
            android.view.View r9 = X.AnonymousClass1HF.A06(r1, r0)
            android.view.View r1 = r10.A00
            r0 = 2131432454(0x7f0b1406, float:1.8486666E38)
            android.view.View r8 = X.AnonymousClass1HF.A06(r1, r0)
            android.view.View r1 = r10.A00
            r0 = 2131431712(0x7f0b1120, float:1.848516E38)
            android.view.ViewStub r2 = X.AnonymousClass3MW.A0E(r1, r0)
            android.view.View r1 = r10.A00
            r0 = 2131435553(0x7f0b2021, float:1.8492951E38)
            android.view.View r7 = X.AnonymousClass1HF.A06(r1, r0)
            android.view.View r1 = r10.A00
            r0 = 2131428276(0x7f0b03b4, float:1.8478192E38)
            android.view.ViewStub r15 = X.AnonymousClass3MW.A0E(r1, r0)
            android.view.View r1 = r10.A00
            r0 = 2131434020(0x7f0b1a24, float:1.8489842E38)
            android.view.ViewStub r17 = X.AnonymousClass3MW.A0E(r1, r0)
            android.view.View r1 = r10.A00
            r0 = 2131429024(0x7f0b06a0, float:1.847971E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = (com.whatsapp.wds.components.list.listitem.WDSListItem) r0
            r10.A0H = r0
            android.view.View r1 = r10.A00
            r0 = 2131429032(0x7f0b06a8, float:1.8479725E38)
            android.view.View r6 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r6 = (com.whatsapp.wds.components.list.listitem.WDSListItem) r6
            android.view.View r1 = r10.A00
            r0 = 2131429060(0x7f0b06c4, float:1.8479782E38)
            X.1bI r18 = X.C28931bI.A00(r1, r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r1 = r10.A0I
            r0 = 36
            X.C90064dT.A00(r1, r10, r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r1 = r10.A0I
            X.4YR r0 = r10.A0D
            java.lang.String r0 = r0.A00()
            r1.setSubText((java.lang.CharSequence) r0)
            X.0ve r0 = r10.A0E
            boolean r0 = X.C87414Vm.A01(r0)
            if (r0 == 0) goto L_0x053b
            android.view.View r2 = r2.inflate()
            r0 = 2131431713(0x7f0b1121, float:1.8485163E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r2, r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            X.1Nb r0 = r10.A0E
            boolean r0 = r0.A0v()
            r1.setChecked(r0)
            r0 = 12
            X.AnonymousClass3MZ.A1P(r2, r10, r1, r0)
        L_0x0152:
            X.00H r0 = r10.A0M
            java.lang.Object r0 = r0.get()
            X.5by r0 = (X.C108605by) r0
            boolean r0 = r0.Bgg()
            if (r0 == 0) goto L_0x0178
            r0 = 2131429056(0x7f0b06c0, float:1.8479774E38)
            android.view.ViewStub r0 = X.AnonymousClass3MX.A0H(r10, r0)
            android.view.View r1 = r0.inflate()
            r0 = 35
            X.C90064dT.A00(r1, r10, r0)
            android.view.View r1 = r10.A00
            r0 = 2131436979(0x7f0b25b3, float:1.8495844E38)
            X.C72463Mc.A13(r1, r0)
        L_0x0178:
            X.0ve r1 = r10.A0E
            r0 = 3575(0xdf7, float:5.01E-42)
            boolean r0 = X.C36301nf.A01(r1, r0)
            if (r0 == 0) goto L_0x01a4
            android.view.View r1 = r10.A00
            r0 = 2131427942(0x7f0b0266, float:1.8477514E38)
            android.view.View r3 = X.C72453Mb.A0S(r1, r0)
            r0 = 2131427943(0x7f0b0267, float:1.8477517E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r3, r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            X.1Nb r0 = r10.A0E
            X.0z4 r0 = r0.A0B
            boolean r0 = r0.A2H()
            r1.setChecked(r0)
            r0 = 11
            X.AnonymousClass3MZ.A1P(r3, r10, r1, r0)
        L_0x01a4:
            X.00H r0 = r10.A0O
            X.4a3 r0 = X.AnonymousClass3MX.A0y(r0)
            X.0ve r1 = r0.A01
            r0 = 2890(0xb4a, float:4.05E-42)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r1, r0)
            if (r0 == 0) goto L_0x022f
            android.view.View r1 = r10.A00
            r0 = 2131434025(0x7f0b1a29, float:1.8489852E38)
            android.view.View r13 = X.C72453Mb.A0S(r1, r0)
            r0 = 2131434026(0x7f0b1a2a, float:1.8489854E38)
            com.whatsapp.WaTextView r14 = X.AnonymousClass3MW.A0U(r13, r0)
            X.00H r0 = r10.A0N
            java.lang.Object r1 = r0.get()
            X.73b r1 = (X.C1407873b) r1
            X.6Rq r0 = X.C122716Rq.TRANSCRIPTION
            X.1Fz r1 = r1.A05(r0)
            X.1OR r0 = X.AnonymousClass1OR.A00
            androidx.lifecycle.CoroutineLiveData r0 = X.C87324Vd.A00(r0, r1)
            r10.A03 = r0
            X.10I r3 = r10.A05
            r1 = 19
            X.7Pl r0 = new X.7Pl
            r0.<init>(r10, r14, r1)
            r3.CGF(r0)
            android.view.View r1 = r10.A00
            r0 = 2131434023(0x7f0b1a27, float:1.8489848E38)
            android.view.View r3 = X.C72453Mb.A0S(r1, r0)
            r0 = 2131436879(0x7f0b254f, float:1.849564E38)
            android.view.View r4 = X.AnonymousClass1HF.A06(r13, r0)
            androidx.appcompat.widget.SwitchCompat r4 = (androidx.appcompat.widget.SwitchCompat) r4
            X.00H r0 = r10.A0O
            X.4a3 r0 = X.AnonymousClass3MX.A0y(r0)
            boolean r0 = r0.A09()
            r4.setChecked(r0)
            X.02i r1 = new X.02i
            r1.<init>()
            X.AGJ r0 = new X.AGJ
            r0.<init>(r3, r4, r14, r10)
            X.02n r1 = r10.CDw(r0, r1)
            r0 = 41
            X.AnonymousClass3Ma.A1F(r13, r10, r4, r1, r0)
            r0 = 13
            X.AnonymousClass3MZ.A1P(r3, r10, r1, r0)
            r1 = 4
            X.4ej r0 = new X.4ej
            r0.<init>(r3, r10, r1)
            r4.setOnCheckedChangeListener(r0)
            boolean r0 = r4.isChecked()
            A0V(r3, r10, r0)
        L_0x022f:
            X.00H r0 = r10.A0K
            java.lang.Object r0 = r0.get()
            X.1rr r0 = (X.C38771rr) r0
            android.content.SharedPreferences r1 = X.C38771rr.A00(r0)
            java.lang.String r0 = "bonsai_meta_ai_button_setting_enabled"
            r4 = 1
            boolean r13 = r1.getBoolean(r0, r4)
            if (r13 != 0) goto L_0x0538
            X.00H r0 = r10.A0L
            X.1UD r0 = X.AnonymousClass3MW.A0X(r0)
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0538
            android.view.View r1 = r15.inflate()
            r0 = 2131428277(0x7f0b03b5, float:1.8478194E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r1, r0)
            android.widget.CompoundButton r3 = (android.widget.CompoundButton) r3
            r3.setChecked(r13)
            r0 = 14
            X.AnonymousClass3MZ.A1P(r1, r10, r3, r0)
        L_0x0265:
            X.0ve r3 = r10.A0E
            r0 = 4023(0xfb7, float:5.637E-42)
            boolean r16 = X.C18020vd.A05(r5, r3, r0)
            if (r16 == 0) goto L_0x02dc
            com.whatsapp.wds.components.list.listitem.WDSListItem r3 = r10.A0I
            r0 = 2131231727(0x7f0803ef, float:1.8079543E38)
            r3.setIcon((int) r0)
            r0 = 2131232435(0x7f0806b3, float:1.808098E38)
            r11.setIcon((int) r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r3 = r10.A0H
            r0 = 2131231716(0x7f0803e4, float:1.807952E38)
            r3.setIcon((int) r0)
            r0 = 2131231974(0x7f0804e6, float:1.8080044E38)
            r6.setIcon((int) r0)
            r0 = 6
            android.view.View[] r14 = new android.view.View[r0]
            r15 = 0
            r14[r15] = r12
            r14[r4] = r8
            r0 = 2
            r14[r0] = r2
            r0 = 3
            r14[r0] = r9
            X.C72453Mb.A1T(r7, r1, r14)
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131168663(0x7f070d97, float:1.7951634E38)
            int r13 = X.AnonymousClass3MW.A01(r1, r0)
            r3 = 6
            r2 = 0
        L_0x02a9:
            r1 = r14[r2]
            if (r1 == 0) goto L_0x02b4
            int r0 = r1.getPaddingTop()
            X.C72463Mc.A14(r1, r13, r0)
        L_0x02b4:
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x02a9
            int r0 = r19.A01()
            if (r0 != 0) goto L_0x02dc
            android.view.View[] r3 = new android.view.View[r4]
            android.view.View r0 = r19.A02()
            r3[r15] = r0
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131168663(0x7f070d97, float:1.7951634E38)
            int r2 = X.AnonymousClass3MW.A01(r1, r0)
            r1 = r3[r15]
            if (r1 == 0) goto L_0x02dc
            int r0 = r1.getPaddingTop()
            X.C72463Mc.A14(r1, r2, r0)
        L_0x02dc:
            boolean r0 = X.AnonymousClass3MX.A1V(r10)
            r3 = 8
            if (r0 == 0) goto L_0x0522
            r12.setVisibility(r3)
        L_0x02e7:
            X.0ve r1 = r10.A0E
            r0 = 12289(0x3001, float:1.722E-41)
            boolean r2 = X.C18020vd.A05(r5, r1, r0)
            X.00H r0 = r10.A0Q
            X.1Il r0 = X.AnonymousClass3MX.A0j(r0)
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x0514
            X.1Hf r0 = r10.A0A
            java.lang.Integer r1 = r0.A00()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x0514
        L_0x0305:
            r4 = 0
        L_0x0306:
            X.1Hf r0 = r10.A0A
            java.lang.Integer r1 = r0.A00()
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x04fc
            X.11O r0 = r10.A0B
            android.content.SharedPreferences r0 = r0.A00
            java.lang.String r1 = "otp_split_mode_user_choice"
            boolean r0 = X.AnonymousClass3MX.A1T(r0, r1)
            if (r0 != 0) goto L_0x0327
            X.11O r0 = r10.A0B
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C17880vN.A1B(r0, r1)
        L_0x0327:
            r7.setVisibility(r3)
        L_0x032a:
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2130903056(0x7f030010, float:1.741292E38)
            java.lang.String[] r0 = r1.getStringArray(r0)
            r10.A0X = r0
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2130903057(0x7f030011, float:1.7412921E38)
            java.lang.String[] r0 = r1.getStringArray(r0)
            r10.A0S = r0
            int r2 = A0Q(r10, r0)
            if (r2 < 0) goto L_0x0353
            android.widget.TextView r1 = r10.A0T
            java.lang.String[] r0 = r10.A0X
            r0 = r0[r2]
            r1.setText(r0)
        L_0x0353:
            r0 = 32
            X.C90064dT.A00(r9, r10, r0)
            android.view.View r1 = r10.A00
            r0 = 2131434376(0x7f0b1b88, float:1.8490564E38)
            android.view.ViewStub r4 = X.AnonymousClass3MW.A0E(r1, r0)
            android.view.View r1 = r10.A00
            r0 = 2131427851(0x7f0b020b, float:1.847733E38)
            android.view.ViewStub r2 = X.AnonymousClass3MW.A0E(r1, r0)
            boolean r1 = X.AnonymousClass3MX.A1U(r10)
            r0 = 2131626545(0x7f0e0a31, float:1.888033E38)
            if (r1 == 0) goto L_0x0376
            r0 = 2131627597(0x7f0e0e4d, float:1.8882463E38)
        L_0x0376:
            android.view.View r1 = X.AnonymousClass3MY.A0G(r2, r0)
            boolean r0 = r1 instanceof com.whatsapp.wds.components.list.header.WDSSectionHeader
            if (r0 == 0) goto L_0x0386
            com.whatsapp.wds.components.list.header.WDSSectionHeader r1 = (com.whatsapp.wds.components.list.header.WDSSectionHeader) r1
            r0 = 2131886730(0x7f12028a, float:1.9408047E38)
            r1.setHeaderText((int) r0)
        L_0x0386:
            X.0z4 r0 = r10.A0A
            boolean r0 = r0.A2Q()
            if (r0 == 0) goto L_0x03d7
            boolean r0 = X.AnonymousClass3MX.A1V(r10)
            if (r0 != 0) goto L_0x03d7
            android.view.View r2 = r19.A02()
            com.whatsapp.components.WaSwitchView r2 = (com.whatsapp.components.WaSwitchView) r2
            X.0z4 r0 = r10.A0A
            boolean r0 = r0.A2R()
            r0 = r0 ^ 1
            r2.setChecked(r0)
            r1 = 20
            X.4em r0 = new X.4em
            r0.<init>(r10, r1)
            r2.setOnCheckedChangeListener(r0)
            r1 = 34
            X.4dT r0 = new X.4dT
            r0.<init>((java.lang.Object) r2, (int) r1)
            r2.setOnClickListener(r0)
            r4.inflate()
            android.content.Intent r1 = r10.getIntent()
            if (r1 == 0) goto L_0x03d7
            java.lang.String r0 = "scroll_to_setting"
            java.lang.String r1 = r1.getStringExtra(r0)
            java.lang.String r0 = "archived_chats"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03d7
            android.view.ViewParent r0 = r2.getParent()
            r0.requestChildFocus(r2, r2)
        L_0x03d7:
            androidx.appcompat.widget.SwitchCompat r4 = r10.A01
            X.1Nb r0 = r10.A0E
            X.1yM r0 = r0.A0W()
            int r2 = r0.A01
            if (r2 == 0) goto L_0x03e7
            r0 = 2
            r1 = 0
            if (r2 != r0) goto L_0x03e8
        L_0x03e7:
            r1 = 1
        L_0x03e8:
            r4.setChecked(r1)
            r0 = 33
            X.C90064dT.A00(r8, r10, r0)
            r0 = 37
            X.C90064dT.A00(r11, r10, r0)
            boolean r0 = X.AnonymousClass3MX.A1V(r10)
            if (r0 == 0) goto L_0x04e7
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = r10.A0H
            r0.setVisibility(r3)
        L_0x0400:
            r0 = 40
            X.C90064dT.A00(r6, r10, r0)
            boolean r0 = X.AnonymousClass112.A01()
            if (r0 == 0) goto L_0x0432
            X.0ve r1 = r10.A0E
            r0 = 2870(0xb36, float:4.022E-42)
            boolean r0 = X.C18020vd.A05(r5, r1, r0)
            if (r0 == 0) goto L_0x0432
            boolean r0 = X.AnonymousClass3MX.A1V(r10)
            if (r0 != 0) goto L_0x0432
            if (r16 == 0) goto L_0x0429
            android.view.View r1 = r18.A02()
            com.whatsapp.wds.components.list.listitem.WDSListItem r1 = (com.whatsapp.wds.components.list.listitem.WDSListItem) r1
            r0 = 2131232277(0x7f080615, float:1.8080659E38)
            r1.setIcon((int) r0)
        L_0x0429:
            android.view.View r1 = r18.A02()
            r0 = 41
            X.C90064dT.A00(r1, r10, r0)
        L_0x0432:
            X.1KB r7 = r10.A05
            X.4lt r4 = new X.4lt
            r4.<init>(r7)
            X.4GR r13 = new X.4GR
            r13.<init>()
            X.0ve r3 = r10.A0E
            X.11C r2 = r10.A08
            X.4aW r0 = r10.A0F
            X.4h3 r1 = new X.4h3
            r8 = r1
            r9 = r10
            r11 = r7
            r12 = r4
            r14 = r2
            r15 = r3
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            java.util.Set r0 = r10.A0a
            r0.add(r1)
            com.whatsapp.settings.SettingsChatViewModel r0 = r10.A0U
            X.1DT r1 = r0.A00
            r0 = 19
            X.C91614fy.A00(r10, r1, r0)
            android.content.Intent r7 = r10.getIntent()
            if (r7 == 0) goto L_0x0489
            java.lang.String r4 = "page"
            java.lang.String r2 = r7.getStringExtra(r4)
            if (r2 == 0) goto L_0x0489
            java.lang.String r0 = "font"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x04c5
            java.lang.String r0 = "theme"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x04bf
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SettingChat/Deeplink entry point: Entrypoint unsupported: "
            X.C17900vP.A0e(r0, r2, r1)
        L_0x0486:
            r7.removeExtra(r4)
        L_0x0489:
            java.lang.String r0 = X.C72453Mb.A0w(r10)
            r10.A0R = r0
            X.00H r0 = r10.A0P
            java.lang.Object r3 = r0.get()
            X.4Xf r3 = (X.C87824Xf) r3
            android.view.View r2 = r10.A00
            java.lang.String r1 = "chat"
            java.lang.String r0 = r10.A0R
            r3.A02(r2, r1, r0)
            r0 = 0
            r10.A0R = r0
            X.0ve r1 = r10.A0E
            r0 = 3403(0xd4b, float:4.769E-42)
            boolean r0 = X.C18020vd.A05(r5, r1, r0)
            if (r0 == 0) goto L_0x04be
            android.view.View r1 = r17.inflate()
            r0 = 2131429531(0x7f0b089b, float:1.8480737E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r1, r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 1
            r1.setChecked(r0)
        L_0x04be:
            return
        L_0x04bf:
            X.4YR r0 = r10.A0D
            r0.A01(r10)
            goto L_0x0486
        L_0x04c5:
            java.lang.String[] r0 = r10.A0S
            int r3 = A0Q(r10, r0)
            r1 = 1
            r0 = 2131895847(0x7f122627, float:1.9426539E38)
            r2 = 2130903056(0x7f030010, float:1.741292E38)
            android.os.Bundle r1 = X.C72483Me.A0I(r1, r3, r0)
            java.lang.String r0 = "itemsArrayResId"
            r1.putInt(r0, r2)
            com.whatsapp.SingleSelectionDialogFragment r0 = new com.whatsapp.SingleSelectionDialogFragment
            r0.<init>()
            r0.A1R(r1)
            r10.CMl(r0)
            goto L_0x0486
        L_0x04e7:
            android.content.Context r0 = r10.getApplicationContext()
            boolean r2 = X.C41361wE.A09(r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r1 = r10.A0H
            r0 = 39
            if (r2 != 0) goto L_0x04f7
            r0 = 38
        L_0x04f7:
            X.C90064dT.A00(r1, r10, r0)
            goto L_0x0400
        L_0x04fc:
            if (r4 != 0) goto L_0x0327
            r0 = 11
            X.C89984dL.A00(r7, r10, r0, r2)
            androidx.appcompat.widget.SwitchCompat r2 = r10.A02
            X.11O r0 = r10.A0B
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = "otp_split_mode_user_choice"
            boolean r0 = X.AnonymousClass3MX.A1T(r1, r0)
            r2.setChecked(r0)
            goto L_0x032a
        L_0x0514:
            X.00H r0 = r10.A0Q
            X.1Il r0 = X.AnonymousClass3MX.A0j(r0)
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0305
            goto L_0x0306
        L_0x0522:
            r0 = 31
            X.C90064dT.A00(r12, r10, r0)
            androidx.appcompat.widget.SwitchCompat r2 = r10.A00
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r10)
            java.lang.String r0 = "input_enter_send"
            boolean r0 = r1.getBoolean(r0, r4)
            r2.setChecked(r0)
            goto L_0x02e7
        L_0x0538:
            r1 = 0
            goto L_0x0265
        L_0x053b:
            r2 = 0
            goto L_0x0152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsChat.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        if (i == 600) {
            return A3f.A01(this);
        }
        if (i != 602) {
            return super.onCreateDialog(i);
        }
        this.A0C.get();
        return A3f.A00(this);
    }

    public void onPause() {
        AnonymousClass1NM r0 = this.A08;
        C1600586y r1 = this.A0Z;
        if (r1 != null) {
            r0.A02.remove(r1);
        }
        super.onPause();
    }

    public static int A0Q(SettingsChat settingsChat, String[] strArr) {
        int A012 = C20099A7c.A01(C72453Mb.A0M(settingsChat).getString("interface_font_size", "0"), 0);
        for (int i = 0; i < strArr.length; i++) {
            if (A012 == Integer.valueOf(strArr[i]).intValue()) {
                return i;
            }
        }
        return -1;
    }

    public void onResume() {
        super.onResume();
        AnonymousClass1NM r0 = this.A08;
        C1600586y r1 = this.A0Z;
        if (r1 != null) {
            r0.A02.add(r1);
        }
        A0c(this);
    }

    public SettingsChat(int i) {
        this.A0V = false;
        C91034f2.A00(this, 13);
    }
}
