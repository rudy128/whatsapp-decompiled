package com.whatsapp.registration;

import X.A98;
import X.A9B;
import X.AGE;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass10U;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11E;
import X.AnonymousClass11O;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass126;
import X.AnonymousClass12E;
import X.AnonymousClass188;
import X.AnonymousClass18K;
import X.AnonymousClass194;
import X.AnonymousClass19D;
import X.AnonymousClass19F;
import X.AnonymousClass1Cd;
import X.AnonymousClass1E7;
import X.AnonymousClass1K1;
import X.AnonymousClass1K2;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MB;
import X.AnonymousClass1PY;
import X.AnonymousClass1Q0;
import X.AnonymousClass1UN;
import X.AnonymousClass1UW;
import X.AnonymousClass1VW;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4IP;
import X.AnonymousClass4UI;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass996;
import X.AnonymousClass9AL;
import X.AnonymousClass9BJ;
import X.AnonymousClass9VD;
import X.AnonymousClass9XQ;
import X.B8V;
import X.B9N;
import X.C000200d;
import X.C107845ai;
import X.C108975cc;
import X.C108985cd;
import X.C110885hR;
import X.C114465qs;
import X.C1193267r;
import X.C132216mP;
import X.C134036pu;
import X.C137116uw;
import X.C161268Cm;
import X.C166648dI;
import X.C166658dJ;
import X.C170678qU;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18000vb;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C183549Yr;
import X.C183599Yw;
import X.C196039uM;
import X.C197959xY;
import X.C19830z4;
import X.C19880zA;
import X.C19890zB;
import X.C20152A9o;
import X.C203911y;
import X.C20448ALl;
import X.C21011Ad3;
import X.C21449AkG;
import X.C219017v;
import X.C219217x;
import X.C21974Avc;
import X.C21975Avd;
import X.C21976Ave;
import X.C21977Avf;
import X.C22021AwN;
import X.C22022AwO;
import X.C22611Cn;
import X.C22621Co;
import X.C23581Gv;
import X.C24661Le;
import X.C24671Lf;
import X.C24791Lr;
import X.C24921Me;
import X.C25001Mm;
import X.C25181Nf;
import X.C25871Py;
import X.C26191Re;
import X.C26221Rh;
import X.C26261Rl;
import X.C26281Rn;
import X.C26291Ro;
import X.C26861Tt;
import X.C26911Ty;
import X.C27001Ui;
import X.C27071Up;
import X.C27191Vc;
import X.C27361Vu;
import X.C27371Vv;
import X.C27401Vy;
import X.C27431Wb;
import X.C30261de;
import X.C30391dr;
import X.C32291gx;
import X.C33641j9;
import X.C33701jF;
import X.C33721jH;
import X.C33841jT;
import X.C36801oU;
import X.C39241sk;
import X.C39251sl;
import X.C39291sp;
import X.C49332Qb;
import X.C50152Ti;
import X.C52582b9;
import X.C54172di;
import X.C54562eL;
import X.C57052iS;
import X.C57352iw;
import X.C58712l8;
import X.C59872n1;
import X.C63662tU;
import X.C63932tv;
import X.C70703Ce;
import X.C72453Mb;
import X.C72463Mc;
import X.C73203Rj;
import X.C74873d3;
import X.C77553qY;
import X.C89564cf;
import X.C99274sY;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;
import com.whatsapp.WaEditText;
import com.whatsapp.infra.graphql.generated.registration.enums.GraphQLXWA2RegUpsell;
import com.whatsapp.registration.viewmodel.ProfileCreationViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public final class RegisterName extends AnonymousClass996 implements B9N {
    public static C70703Ce A1n;
    public long A00;
    public View A01;
    public C19880zA A02;
    public C19880zA A03;
    public C19880zA A04;
    public C19880zA A05;
    public C19880zA A06;
    public C19880zA A07;
    public C19880zA A08;
    public C19880zA A09;
    public C19880zA A0A;
    public C19880zA A0B;
    public C19880zA A0C;
    public C19880zA A0D;
    public C19880zA A0E;
    public AnonymousClass9VD A0F;
    public AnonymousClass194 A0G;
    public C132216mP A0H;
    public WaEditText A0I;
    public C36801oU A0J;
    public C26911Ty A0K;
    public AnonymousClass1VW A0L;
    public C24671Lf A0M;
    public C24791Lr A0N;
    public C27191Vc A0O;
    public AnonymousClass12E A0P;
    public AnonymousClass1UW A0Q;
    public AnonymousClass118 A0R;
    public C219217x A0S;
    public C22621Co A0T;
    public C27431Wb A0U;
    public C22611Cn A0V;
    public AnonymousClass1Cd A0W;
    public AnonymousClass9XQ A0X;
    public AnonymousClass1E7 A0Y;
    public C1193267r A0Z;
    public AnonymousClass4UI A0a;
    public AnonymousClass1UN A0b;
    public C134036pu A0c;
    public AnonymousClass19D A0d;
    public AnonymousClass19F A0e;
    public AnonymousClass10U A0f;
    public AnonymousClass188 A0g;
    public AnonymousClass18K A0h;
    public AnonymousClass126 A0i;
    public AnonymousClass1MB A0j;
    public AnonymousClass1PY A0k;
    public AnonymousClass1LU A0l;
    public C219017v A0m;
    public C32291gx A0n;
    public C30261de A0o;
    public B8V A0p;
    public C18010vc A0q;
    public C27001Ui A0r;
    public C27071Up A0s;
    public C166648dI A0t;
    public C166658dJ A0u;
    public A98 A0v;
    public C33841jT A0w;
    public C33641j9 A0x;
    public C33721jH A0y;
    public C27371Vv A0z;
    public C27361Vu A10;
    public C27401Vy A11;
    public C57352iw A12;
    public C183599Yw A13;
    public C197959xY A14;
    public WDSProfilePhoto A15;
    public AnonymousClass00H A16;
    public AnonymousClass00H A17;
    public AnonymousClass00H A18;
    public AnonymousClass00H A19;
    public AnonymousClass00H A1A;
    public AnonymousClass00H A1B;
    public AnonymousClass00H A1C;
    public AnonymousClass00H A1D;
    public AnonymousClass00H A1E;
    public AnonymousClass00H A1F;
    public AnonymousClass00H A1G;
    public AnonymousClass00H A1H;
    public AnonymousClass00H A1I;
    public AnonymousClass00H A1J;
    public AnonymousClass00H A1K;
    public AnonymousClass00H A1L;
    public AnonymousClass00H A1M;
    public Integer A1N;
    public Integer A1O;
    public Integer A1P;
    public Integer A1Q;
    public String A1R;
    public boolean A1S;
    public boolean A1T = false;
    public boolean A1U;
    public boolean A1V;
    public boolean A1W;
    public Bitmap A1X;
    public View A1Y;
    public Button A1Z;
    public C23581Gv A1a;
    public C74873d3 A1b;
    public AnonymousClass9BJ A1c;
    public RegistrationScrollView A1d;
    public final Handler A1e;
    public final C114465qs A1f;
    public final C107845ai A1g;
    public final C25871Py A1h;
    public final Handler A1i;
    public final C183549Yr A1j;
    public final C89564cf A1k;
    public final C18100vl A1l;
    public final C18100vl A1m;

    private final void A03() {
        String str;
        AnonymousClass1KB r2 = this.A05;
        C18070vi.A0W(r2);
        AnonymousClass19D A4h = A4h();
        C19830z4 r3 = this.A0A;
        C18070vi.A0W(r3);
        C183599Yw r8 = this.A13;
        if (r8 != null) {
            C27361Vu r7 = this.A10;
            if (r7 != null) {
                C22611Cn r4 = this.A0V;
                if (r4 != null) {
                    AnonymousClass9BJ r1 = new AnonymousClass9BJ(r2, r3, r4, A4h, this, r7, r8);
                    this.A1c = r1;
                    C17890vO.A0u(r1, this.A05);
                    return;
                }
                str = "messageStoreLifecycleManager";
            } else {
                str = "interAppCommunicationManager";
            }
        } else {
            str = "googleMigrateBridgeUtil";
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r2 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (r14.A1U == false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0r(com.whatsapp.registration.RegisterName r14) {
        /*
            r4 = r14
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131168470(0x7f070cd6, float:1.7951243E38)
            int r8 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131168468(0x7f070cd4, float:1.7951239E38)
            float r7 = r1.getDimension(r0)
            r9 = 0
            r14.A1U = r9
            r14.A0u(r9)
            X.1E7 r0 = r14.A0Y
            if (r0 == 0) goto L_0x00a9
            X.11S r0 = r14.A02
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            boolean r0 = X.AnonymousClass73O.A02(r0)
            if (r0 != 0) goto L_0x00a9
            r1 = 1
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r14.A15
            if (r0 == 0) goto L_0x0035
            r0.setEnabled(r1)
        L_0x0035:
            android.view.View r0 = r14.A1Y
            X.C72453Mb.A1D(r0)
            X.1E7 r5 = r14.A0Y
            r2 = 0
            if (r5 == 0) goto L_0x0065
            X.1Lr r0 = r14.A0N
            if (r0 == 0) goto L_0x00d3
            java.io.File r0 = r0.A01(r5)
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0065
            X.1Vc r3 = r14.A0O
            if (r3 == 0) goto L_0x00cb
            java.lang.String r6 = "RegisterName.updatePhoto"
            android.graphics.Bitmap r2 = r3.A04(r4, r5, r6, r7, r8, r9)
            if (r2 == 0) goto L_0x005c
            r9 = 1
        L_0x005c:
            r14.A1U = r9
            if (r9 == 0) goto L_0x0063
            r14.A0u(r1)
        L_0x0063:
            if (r2 != 0) goto L_0x009a
        L_0x0065:
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r14)
            java.lang.String r0 = "pref_nta_profile_pic"
            java.lang.String r0 = X.C17880vN.A0r(r1, r0)
            if (r0 == 0) goto L_0x007c
            X.10I r1 = r14.A05
            r0 = 13
            X.C21449AkG.A00(r1, r14, r0)
            boolean r0 = r14.A1U
            if (r0 != 0) goto L_0x009a
        L_0x007c:
            X.19D r2 = r14.A4h()
            r1 = 12202(0x2faa, float:1.7099E-41)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r2, r1)
            r0 = 1
            X.1VW r9 = r14.A0L
            if (r1 != r0) goto L_0x00a2
            if (r9 == 0) goto L_0x00c4
            r11 = 0
            r13 = 2131231047(0x7f080147, float:1.8078164E38)
        L_0x0093:
            r10 = r14
            r12 = r7
            r14 = r8
            android.graphics.Bitmap r2 = r9.A04(r10, r11, r12, r13, r14)
        L_0x009a:
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r4.A15
            if (r0 == 0) goto L_0x00a1
            r0.setImageBitmap(r2)
        L_0x00a1:
            return
        L_0x00a2:
            if (r9 == 0) goto L_0x00c4
            r11 = 0
            r13 = 2131232242(0x7f0805f2, float:1.8080588E38)
            goto L_0x0093
        L_0x00a9:
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r14.A15
            if (r0 == 0) goto L_0x00b0
            r0.setEnabled(r9)
        L_0x00b0:
            android.view.View r0 = r14.A1Y
            if (r0 == 0) goto L_0x00b7
            r0.setVisibility(r9)
        L_0x00b7:
            android.graphics.Bitmap r2 = r14.A1X
            if (r2 != 0) goto L_0x009a
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r8, r8, r0)
            r14.A1X = r2
            goto L_0x009a
        L_0x00c4:
            java.lang.String r0 = "contactAvatars"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x00cb:
            java.lang.String r0 = "contactPhotosBitmapManager"
            goto L_0x00d5
        L_0x00ce:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x00d3:
            java.lang.String r0 = "contactPhotoHelper"
        L_0x00d5:
            X.C18070vi.A11(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.RegisterName.A0r(com.whatsapp.registration.RegisterName):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        C166648dI r2 = this.A0t;
        if (r2 != null) {
            r2.onCreate(r2.onSaveInstanceState());
            r2.A01.A01 = r2.findViewById(2131433470);
            A0d(this);
        }
        C166658dJ r1 = this.A0u;
        if (r1 != null) {
            r1.onCreate(r1.onSaveInstanceState());
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        menu.add(0, 0, 0, 2131895081);
        return super.onCreateOptionsMenu(menu);
    }

    public void onNewIntent(Intent intent) {
        C18070vi.A0d(intent, 0);
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("is_from_backup_otp_screen", false)) {
            intent.removeExtra("is_from_backup_otp_screen");
            A4e(true);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("started_gdrive_new_user_activity", this.A1W);
    }

    private final void A0Q() {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 8045)) {
            AnonymousClass4Yv.A01(this, 22);
            AnonymousClass00H r0 = this.A1L;
            if (r0 != null) {
                RegistrationUpsellProtocolHelper registrationUpsellProtocolHelper = (RegistrationUpsellProtocolHelper) r0.get();
                C21011Ad3 ad3 = new C21011Ad3(this);
                AnonymousClass3MW.A1X(registrationUpsellProtocolHelper.A01, new RegistrationUpsellProtocolHelper$getRegistrationUpsell$1(ad3, registrationUpsellProtocolHelper, (C30391dr) null), registrationUpsellProtocolHelper.A03);
                return;
            }
            C18070vi.A11("registrationUpsellProtocolHelper");
            throw null;
        }
        A0q(this);
    }

    public static final void A0q(RegisterName registerName) {
        String str;
        C70703Ce r3 = A1n;
        if (r3 == null || r3.A03) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("RegisterName/check-initializer, null?");
            C17900vP.A0r(A102, AnonymousClass000.A1X(r3));
            RegisterName registerName2 = registerName;
            AnonymousClass9VD r32 = registerName2.A0F;
            if (r32 != null) {
                C183549Yr r31 = registerName2.A1j;
                Handler handler = registerName2.A1i;
                C19890zB r24 = C19890zB.A00;
                AnonymousClass1K2 r4 = r32.A00;
                AnonymousClass10E r2 = r4.A01;
                AnonymousClass11S A172 = AnonymousClass10E.A17(r2);
                AnonymousClass18K A0g2 = AnonymousClass3Ma.A0g(r2);
                AnonymousClass1Q0 r23 = (AnonymousClass1Q0) r2.A0M.get();
                C24661Le r22 = (C24661Le) r2.AAJ.get();
                C25001Mm r21 = (C25001Mm) r2.ABf.get();
                AnonymousClass1M9 A4z = AnonymousClass10E.A4z(r2);
                C24921Me A0g3 = AnonymousClass3MZ.A0g(r2);
                C18000vb A6Q = AnonymousClass10E.A6Q(r2);
                C54562eL r20 = (C54562eL) r2.A3o.get();
                AnonymousClass126 r19 = (AnonymousClass126) r2.A4h.get();
                C26191Re r18 = (C26191Re) r2.A3O.get();
                AnonymousClass12E A0E2 = AnonymousClass8BU.A0E(r2);
                C203911y r17 = (C203911y) r2.A9n.get();
                C27001Ui r16 = (C27001Ui) r2.A8p.get();
                C33841jT A0c2 = AnonymousClass8BU.A0c(r2);
                C19830z4 A0c3 = AnonymousClass3Ma.A0c(r2);
                AnonymousClass00H A002 = C000200d.A00(r2.A9U);
                C25181Nf A0m2 = AnonymousClass3MZ.A0m(r2);
                AnonymousClass00H A003 = C000200d.A00(r2.ABN);
                AnonymousClass10G r33 = r2.A00;
                C52582b9 A1e2 = AnonymousClass1K1.A1e(r4.A00);
                C19890zB r25 = r24;
                Handler handler2 = handler;
                C19880zA r26 = (C19880zA) r2.A7i.get();
                C70703Ce r222 = new C70703Ce(handler2, r24, r25, r26, r24, r24, AnonymousClass3MY.A0N(r2), A172, (C26261Rl) r2.A8j.get(), r21, (C57052iS) r33.A5E.get(), (C54172di) r33.A3G.get(), A4z, A0g3, A0E2, (C26861Tt) r2.A2m.get(), r18, r23, A0c3, (AnonymousClass11O) r2.ABn.get(), A6Q, A0m2, (C26291Ro) r2.A6g.get(), r22, (C26281Rn) r2.A3S.get(), (C196039uM) r2.A3c.get(), (AnonymousClass19F) r2.A03.get(), A0g2, r19, r17, (C26221Rh) r2.A1E.get(), (C33701jF) r2.A8I.get(), r16, r31, A0c2, A1e2, r20, A002, A003);
                A1n = r222;
                r222.A01 = registerName2.A00;
                registerName2.A0A.A25(true);
                C17880vN.A1F(C72453Mb.A0M(registerName2).edit(), "native_contacts_backup_contacts_updated", false);
                C21449AkG.A00(registerName2.A05, registerName2, 16);
                if (registerName2.A07.A00(false) != 37) {
                    AnonymousClass4Yv.A01(registerName2, 0);
                }
                if (((CompoundButton) C110885hR.A0A(registerName2, 2131428938)).isChecked()) {
                    C50152Ti.A00(registerName2, registerName2.getString(2131899099));
                }
                View view = registerName2.A01;
                if (view != null) {
                    view.setVisibility(4);
                }
                C17880vN.A1D(AnonymousClass8BR.A08(registerName2), "com.whatsapp.registername.initializer_start_time", System.currentTimeMillis());
                C17880vN.A1E(C19830z4.A00(registerName2.A0A), "account_switching_logged_out_phone_number", (String) null);
                C17880vN.A1E(AnonymousClass8BR.A08(registerName2), "account_switching_banned_account_lid", (String) null);
                C17880vN.A1E(AnonymousClass8BR.A08(registerName2), "account_switching_banned_account_phone_user_jid", (String) null);
                C17880vN.A1B(AnonymousClass8BR.A08(registerName2), "pref_multi_account_priming_token");
                C17880vN.A1B(AnonymousClass8BR.A08(registerName2), "pref_reg_methods_order");
                AnonymousClass1UW r27 = registerName2.A0Q;
                if (r27 != null) {
                    r27.A02();
                    C17880vN.A1E(AnonymousClass8BR.A08(registerName2), "pcr_active_pn", (String) null);
                    C17880vN.A1E(AnonymousClass8BR.A08(registerName2), "pcr_active_cc", (String) null);
                    AnonymousClass00H r28 = registerName2.A1K;
                    if (r28 != null) {
                        ((C59872n1) r28.get()).A00(C49332Qb.A03);
                        registerName2.A1e.sendEmptyMessageDelayed(0, 600000);
                        AnonymousClass8BW.A0U(registerName2).A0C("home");
                        if (C18020vd.A05(C18040vf.A02, registerName2.A0E, 10791)) {
                            C19880zA r1 = registerName2.A07;
                            if (r1 == null) {
                                str = "smbOnboardingAnalyticsManager";
                            } else if (r1.A07()) {
                                r1.A03();
                                throw AnonymousClass000.A0s("logOnboardingViewEvent");
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        C18070vi.A11("registrationNotificationManager");
                        throw null;
                    }
                } else {
                    C18070vi.A11("clientContactMetadataEncryptionKeyStorage");
                    throw null;
                }
            } else {
                str = "registrationInitializerFactory";
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public static final void A0s(RegisterName registerName, int i) {
        Integer num;
        C219217x r0 = registerName.A0S;
        if (r0 == null) {
            C18070vi.A11("waPermissionsHelper");
            throw null;
        } else if (r0.A0G() && (num = registerName.A1Q) != null && num.intValue() == 1) {
            registerName.A1Q = Integer.valueOf(i);
        }
    }

    public static final void A0t(RegisterName registerName, String str) {
        WaEditText waEditText;
        if (str != null && str.length() != 0 && !registerName.isFinishing() && (waEditText = registerName.A0I) != null) {
            waEditText.setText(str);
            waEditText.setSelection(waEditText.length());
        }
    }

    public void A2y() {
        if (!this.A1T) {
            this.A1T = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r1 = A002.AAQ;
            C63932tv.A02(r1, this);
            AnonymousClass10G r4 = r1.A00;
            C63932tv.A01(r1, r4, this);
            C63662tU.A00(r1, r4, this, r4.A5A);
            this.A01 = AnonymousClass3MY.A0Z(r1);
            this.A00 = AnonymousClass10G.A51(r4);
            this.A00 = AnonymousClass1K1.A1f(A002);
            this.A0d = C72463Mc.A0e(r1);
            this.A0e = (AnonymousClass19F) r1.A03.get();
            this.A0f = (AnonymousClass10U) r1.ACH.get();
            this.A16 = AnonymousClass8BT.A0g(r1);
            this.A17 = C000200d.A00(r1.A0I);
            this.A0y = r1.AJC();
            this.A0o = r1.AFc();
            this.A0K = AnonymousClass8BT.A0D(r1);
            this.A0T = (C22621Co) r1.A27.get();
            this.A0Q = (AnonymousClass1UW) r1.AHN.get();
            this.A18 = C000200d.A00(r1.A2b);
            this.A0L = AnonymousClass3MZ.A0e(r1);
            this.A0M = AnonymousClass3Ma.A0S(r1);
            this.A0N = (C24791Lr) r1.A2h.get();
            this.A0O = (C27191Vc) r1.A2i.get();
            this.A0P = AnonymousClass8BU.A0E(r1);
            this.A19 = C000200d.A00(r1.AIs);
            this.A1A = C000200d.A00(A002.A0s);
            this.A0z = (C27371Vv) r1.A3Q.get();
            this.A1B = C000200d.A00(r1.A3c);
            this.A1C = C000200d.A00(r4.A1c);
            this.A1D = C000200d.A00(r4.A1h);
            this.A0c = (C134036pu) r4.AB8.get();
            this.A1E = C000200d.A00(r1.A4U);
            this.A0J = (C36801oU) r1.A4c.get();
            this.A13 = AnonymousClass1K1.A1g(A002);
            this.A14 = (C197959xY) r4.ABn.get();
            this.A0k = AnonymousClass3Ma.A0l(r1);
            this.A0i = (AnonymousClass126) r1.A4h.get();
            this.A10 = (C27361Vu) r1.A5Q.get();
            this.A12 = C72463Mc.A0i(r4);
            this.A1F = C000200d.A00(r1.A5t);
            this.A11 = (C27401Vy) r1.AYG.get();
            this.A0m = (C219017v) r1.A6S.get();
            this.A0n = (C32291gx) r1.A6X.get();
            this.A0U = (C27431Wb) r1.A6f.get();
            this.A0V = (C22611Cn) r1.A6h.get();
            this.A0W = (AnonymousClass1Cd) r1.A6i.get();
            this.A0b = (AnonymousClass1UN) r1.A72.get();
            this.A1G = C000200d.A00(A002.A4y);
            this.A0p = (B8V) A002.A5N.get();
            this.A0r = (C27001Ui) r1.A8p.get();
            this.A0s = (C27071Up) r1.Ae9.get();
            this.A1H = C000200d.A00(r4.AFu);
            this.A0Z = (C1193267r) r1.A9P.get();
            this.A1I = C000200d.A00(A002.A5f);
            this.A1J = C000200d.A00(A002.A5g);
            this.A0v = (A98) r1.Ag7.get();
            this.A0F = (AnonymousClass9VD) A002.A3S.get();
            this.A0w = AnonymousClass8BU.A0c(r1);
            this.A1K = C000200d.A00(r4.A4I);
            this.A1L = C000200d.A00(A002.A5h);
            this.A0G = (AnonymousClass194) r1.A9Z.get();
            this.A0H = AnonymousClass8BT.A0A(r4);
            this.A0q = AnonymousClass3Ma.A0r(r1);
            C19890zB r2 = C19890zB.A00;
            this.A02 = r2;
            this.A03 = r2;
            this.A04 = r2;
            this.A05 = r2;
            this.A06 = r2;
            this.A07 = r2;
            this.A08 = r2;
            this.A09 = r2;
            this.A0A = r2;
            this.A0B = (C19880zA) r1.A7j.get();
            this.A0C = r2;
            this.A0D = r2;
            this.A0E = (C19880zA) r1.A7k.get();
            this.A0j = AnonymousClass3Ma.A0k(r1);
            this.A0X = r4.A4l();
            this.A0x = AnonymousClass8BW.A0T(r1);
            this.A0R = AnonymousClass3MZ.A0l(r1);
            this.A0l = AnonymousClass3MY.A0Z(r1);
            this.A0S = AnonymousClass3Ma.A0b(r1);
            this.A0g = (AnonymousClass188) r1.AfD.get();
            this.A1M = C000200d.A00(A002.A65);
            this.A0h = AnonymousClass3Ma.A0g(r1);
        }
    }

    public final C19880zA A4g() {
        C19880zA r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("smbRegistrationAnalyticManager");
        throw null;
    }

    public final AnonymousClass19D A4h() {
        AnonymousClass19D r0 = this.A0d;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("abPreChatdProps");
        throw null;
    }

    public final C27071Up A4i() {
        C27071Up r0 = this.A0s;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("profilePhotoUpdater");
        throw null;
    }

    public final C33841jT A4j() {
        C33841jT r0 = this.A0w;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("registrationManager");
        throw null;
    }

    public String A4k() {
        Editable text;
        WaEditText waEditText = this.A0I;
        if (waEditText == null || (text = waEditText.getText()) == null) {
            throw C17880vN.A0g();
        }
        String obj = text.toString();
        int length = obj.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A1A2 = C108975cc.A1A(C18070vi.A00(obj.charAt(i2), 32));
            if (z) {
                if (!A1A2) {
                    break;
                }
                length--;
            } else if (!A1A2) {
                z = true;
            } else {
                i++;
            }
        }
        return C108985cd.A0g(length, i, obj);
    }

    public void A4l() {
        Log.i("RegisterName/start");
        String A4k = A4k();
        String[] strArr = AnonymousClass4IP.A01;
        int i = 0;
        while (!A4k.contains(strArr[i])) {
            i++;
            if (i >= 3) {
                if (A4k.length() == 0) {
                    Log.w("RegisterName/no-pushname");
                    this.A05.A08(2131894988, 0);
                    return;
                }
                Log.i("RegisterName/showNextScreen");
                A0Q();
                return;
            }
        }
        Log.w("RegisterName/checkmarks in pushname");
        CMl(PushnameEmojiBlacklistDialogFragment.A00(A4k));
    }

    public final void A4m() {
        String str;
        C22621Co r1 = this.A0T;
        if (r1 != null) {
            C22621Co.A02(r1, false);
            C22611Cn r0 = this.A0V;
            if (r0 != null) {
                r0.A01();
                AnonymousClass12E r02 = this.A0P;
                if (r02 != null) {
                    r02.A05();
                    A4c();
                    return;
                }
                str = "contactSyncMethods";
            } else {
                str = "messageStoreLifecycleManager";
            }
        } else {
            str = "chatManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onBackPressed() {
        C74873d3 r0 = this.A1b;
        if (r0 == null || !r0.isShowing()) {
            AnonymousClass00H r02 = this.A16;
            if (r02 == null) {
                C18070vi.A11("accountSwitcher");
                throw null;
            } else if (C17880vN.A0I(r02).A0J(false)) {
                Log.i("RegisterName/onBackPressed/is adding new account");
                A9B.A0J(this, this.A0A, this.A0B);
            } else {
                AnonymousClass1L9.A02(this);
                super.onBackPressed();
            }
        } else {
            C74873d3 r03 = this.A1b;
            if (r03 != null) {
                r03.dismiss();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03ce, code lost:
        if (r10.A0G() != false) goto L_0x03d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0417, code lost:
        if (X.AnonymousClass74O.A0M(r4, r9, "connect_with_friends", r8, 17, r15, r16, 2131894307, r18, r19) != false) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (r1.getBoolean("started_gdrive_new_user_activity", false) != true) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0274  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r34) {
        /*
            r33 = this;
            r4 = r33
            r1 = r34
            super.onCreate(r1)
            X.2iw r0 = r4.A12
            if (r0 == 0) goto L_0x0517
            r0.A00(r4)
            r0 = 2131894996(0x7f1222d4, float:1.9424813E38)
            r10 = 2131894996(0x7f1222d4, float:1.9424813E38)
            r4.setTitle(r0)
            r3 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r2 = 0
            if (r34 == 0) goto L_0x0028
            java.lang.String r0 = "started_gdrive_new_user_activity"
            boolean r1 = r1.getBoolean(r0, r2)
            r0 = 1
            if (r1 == r3) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r4.A1W = r0
            X.0zA r0 = r4.A0C
            if (r0 == 0) goto L_0x0510
            boolean r0 = r0.A07()
            r1 = 0
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "RegisterName/create/setting up new reg flow/build is smb"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0zA r0 = r4.A0C
            if (r0 == 0) goto L_0x0049
            r0.A03()
            java.lang.String r0 = "getSmbRegistrationLayoutId"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0049:
            java.lang.String r0 = "smbRegistrationResources"
            X.C18070vi.A11(r0)
            throw r1
        L_0x004f:
            java.lang.String r0 = "RegisterName/create/setting up old reg flow"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131626706(0x7f0e0ad2, float:1.8880656E38)
            r4.setContentView((int) r0)
            r0 = 2131434452(0x7f0b1bd4, float:1.8490718E38)
            r8 = 2131434452(0x7f0b1bd4, float:1.8490718E38)
            android.view.View r0 = X.C110885hR.A0A(r4, r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r4.A1Z = r0
            if (r0 == 0) goto L_0x0182
            android.view.ViewGroup$LayoutParams r6 = r0.getLayoutParams()
        L_0x006e:
            X.19D r5 = r4.A4h()
            r0 = 8780(0x224c, float:1.2303E-41)
            X.0vf r9 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r9, r5, r0)
            if (r0 == 0) goto L_0x017b
            if (r6 == 0) goto L_0x0081
            r0 = -1
            r6.width = r0
        L_0x0081:
            android.view.View r5 = r4.A00
            r14 = 2131436246(0x7f0b22d6, float:1.8494357E38)
            X.00H r0 = r4.A16
            if (r0 == 0) goto L_0x050a
            X.1cN r0 = X.C17880vN.A0I(r0)
            boolean r17 = r0.A0J(r2)
            r16 = r2
            r12 = r5
            r13 = r4
            r15 = r2
            X.A9B.A0Q(r12, r13, r14, r15, r16, r17)
            X.1CM r0 = r4.A07
            int r6 = r0.A00(r2)
            r7 = 37
            r5 = 2
            if (r6 == r5) goto L_0x00c0
            if (r6 == r7) goto L_0x00c0
            r0 = 3
            if (r6 != r0) goto L_0x00ba
            java.lang.String r0 = "RegisterName/create/registration already verified bounce to main"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00af:
            android.content.Intent r0 = X.AnonymousClass1LU.A0A(r4)
        L_0x00b3:
            r4.startActivity(r0)
            r4.finish()
            return
        L_0x00ba:
            java.lang.String r0 = "RegisterName/create/bad-state bounce to main"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00af
        L_0x00c0:
            X.0z4 r0 = r4.A0A
            java.lang.String r13 = r0.A0m()
            X.C72463Mc.A0t(r4)
            X.0zA r0 = r4.A0C
            if (r0 == 0) goto L_0x0504
            boolean r0 = r0.A07()
            if (r0 != 0) goto L_0x0170
            X.0z4 r0 = r4.A0A
            boolean r12 = r0.A2L()
            r0 = 2131436240(0x7f0b22d0, float:1.8494345E38)
            if (r12 == 0) goto L_0x0165
            r0 = 2131436253(0x7f0b22dd, float:1.8494371E38)
            android.view.View r0 = X.C110885hR.A0A(r4, r0)
            X.C18070vi.A0b(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
        L_0x00ea:
            android.view.View r0 = r0.inflate()
            java.lang.String r12 = "null cannot be cast to non-null type com.whatsapp.WaTextView"
            X.C18070vi.A0z(r0, r12)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
        L_0x00f5:
            r12 = 2131434460(0x7f0b1bdc, float:1.8490735E38)
            android.view.View r12 = r4.findViewById(r12)
            com.whatsapp.WaEditText r12 = (com.whatsapp.WaEditText) r12
            r4.A0I = r12
            android.view.View r8 = X.C110885hR.A0A(r4, r8)
            android.widget.Button r8 = (android.widget.Button) r8
            r4.A1Z = r8
            r8 = 2131428998(0x7f0b0686, float:1.8479656E38)
            android.view.View r8 = r4.findViewById(r8)
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r8 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r8
            r4.A15 = r8
            r0.setText(r10)
            r8 = 2131428126(0x7f0b031e, float:1.8477888E38)
            android.view.View r10 = X.AnonymousClass3MY.A0C(r4, r8)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r8 = 2131894995(0x7f1222d3, float:1.942481E38)
            r10.setText(r8)
            X.0zA r8 = r4.A0C
            if (r8 == 0) goto L_0x04fe
            boolean r8 = r8.A07()
            if (r8 != 0) goto L_0x0161
            X.0z4 r8 = r4.A0A
            boolean r8 = r8.A2L()
            r10 = 2131436280(0x7f0b22f8, float:1.8494426E38)
            if (r8 == 0) goto L_0x013d
            r10 = 2131436281(0x7f0b22f9, float:1.8494428E38)
        L_0x013d:
            X.19D r8 = r4.A4h()
            X.A9B.A0T(r4, r8, r10)
            android.widget.Button r10 = r4.A1Z
            if (r10 == 0) goto L_0x014d
            r8 = 42
            X.AnonymousClass3Ma.A1A(r10, r4, r8)
        L_0x014d:
            if (r13 != 0) goto L_0x0185
            java.lang.String r0 = "RegisterName/create/missing-params bounce to regphone"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1jT r0 = r4.A4j()
            X.C33841jT.A03(r0, r3, r3)
            android.content.Intent r0 = X.AnonymousClass1LU.A04(r4)
            goto L_0x00b3
        L_0x0161:
            r10 = 2131436208(0x7f0b22b0, float:1.849428E38)
            goto L_0x013d
        L_0x0165:
            android.view.View r0 = X.C110885hR.A0A(r4, r0)
            X.C18070vi.A0b(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            goto L_0x00ea
        L_0x0170:
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            android.view.View r0 = X.C110885hR.A0A(r4, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            goto L_0x00f5
        L_0x017b:
            if (r6 == 0) goto L_0x0081
            r0 = -2
            r6.width = r0
            goto L_0x0081
        L_0x0182:
            r6 = r1
            goto L_0x006e
        L_0x0185:
            r8 = 2131428938(0x7f0b064a, float:1.8479535E38)
            android.view.View r8 = X.C110885hR.A0A(r4, r8)
            android.widget.CompoundButton r8 = (android.widget.CompoundButton) r8
            r8.setChecked(r3)
            r8 = 2131435434(0x7f0b1faa, float:1.849271E38)
            android.view.View r10 = X.C110885hR.A0A(r4, r8)
            r8 = 43
            X.AnonymousClass3Ma.A1A(r10, r4, r8)
            r8 = 2131430310(0x7f0b0ba6, float:1.8482317E38)
            android.view.View r16 = r4.findViewById(r8)
            if (r16 == 0) goto L_0x0228
            X.0ve r8 = r4.A0E
            r27 = r8
            X.1L4 r8 = r4.A09
            r29 = r8
            X.190 r8 = r4.A03
            r32 = r8
            X.1KW r8 = r4.A0D
            r25 = r8
            X.67r r15 = r4.A0Z
            if (r15 == 0) goto L_0x04f8
            X.11C r8 = r4.A08
            r20 = r8
            X.0vb r8 = r4.A00
            r18 = r8
            X.00H r8 = r4.A1C
            if (r8 == 0) goto L_0x04f2
            java.lang.Object r13 = r8.get()
            com.whatsapp.emoji.search.EmojiSearchProvider r13 = (com.whatsapp.emoji.search.EmojiSearchProvider) r13
            X.0z4 r8 = r4.A0A
            r17 = r8
            X.0vc r14 = r4.A0q
            if (r14 == 0) goto L_0x04ec
            r8 = 2131432239(0x7f0b132f, float:1.848623E38)
            android.view.View r12 = r4.findViewById(r8)
            X.5YX r12 = (X.AnonymousClass5YX) r12
            com.whatsapp.WaEditText r8 = r4.A0I
            r19 = r8
            r8 = 30
            java.lang.Integer r30 = java.lang.Integer.valueOf(r8)
            X.00H r8 = r4.A1D
            if (r8 == 0) goto L_0x04e6
            java.lang.Object r10 = r8.get()
            X.A59 r10 = (X.A59) r10
            X.3d3 r8 = new X.3d3
            r21 = r17
            r22 = r18
            r23 = r10
            r24 = r15
            r26 = r13
            r28 = r14
            r31 = r1
            r14 = r8
            r15 = r4
            r17 = r32
            r18 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r4.A1b = r8
            X.5ai r10 = r4.A1g
            r8.A0J(r10)
            r10 = 2131430335(0x7f0b0bbf, float:1.8482368E38)
            android.view.View r10 = r4.findViewById(r10)
            com.whatsapp.emoji.search.EmojiSearchContainer r10 = (com.whatsapp.emoji.search.EmojiSearchContainer) r10
            X.4UI r12 = new X.4UI
            r12.<init>(r4, r8, r10)
            r4.A0a = r12
            X.7GE r10 = new X.7GE
            r10.<init>(r4, r8, r3)
            r12.A00 = r10
        L_0x0228:
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r10 = r4.A15
            if (r10 == 0) goto L_0x0232
            r8 = 2131899332(0x7f1233c4, float:1.9433607E38)
            X.AnonymousClass3MY.A0w(r4, r10, r8)
        L_0x0232:
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r10 = r4.A15
            if (r10 == 0) goto L_0x023b
            r8 = 44
            X.AnonymousClass3Ma.A1A(r10, r4, r8)
        L_0x023b:
            r8 = 2131429002(0x7f0b068a, float:1.8479664E38)
            android.view.View r8 = r4.findViewById(r8)
            r4.A1Y = r8
            X.17x r8 = r4.A0S
            if (r8 == 0) goto L_0x04e0
            boolean r8 = r8.A0G()
            if (r8 == 0) goto L_0x0461
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
        L_0x0252:
            r4.A1Q = r8
            X.00H r8 = r4.A18
            if (r8 == 0) goto L_0x04da
            boolean r8 = X.C72463Mc.A1W(r8)
            if (r8 == 0) goto L_0x0262
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
        L_0x0262:
            r4.A1P = r11
            if (r6 != r7) goto L_0x0359
            X.3Ce r8 = A1n
            if (r8 != 0) goto L_0x0359
            X.AnonymousClass4Yv.A01(r4, r2)
        L_0x026d:
            r4.A03()
        L_0x0270:
            com.whatsapp.WaEditText r12 = r4.A0I
            if (r12 == 0) goto L_0x02ba
            X.0vb r8 = r4.A00
            X.C27641Ww.A09(r12, r8)
            r8 = 2131432906(0x7f0b15ca, float:1.8487583E38)
            android.view.View r13 = X.AnonymousClass3MY.A0C(r4, r8)
            android.widget.TextView r13 = (android.widget.TextView) r13
            X.0ve r8 = r4.A0E
            r20 = r8
            X.1KW r8 = r4.A0D
            r16 = r8
            X.11C r15 = r4.A08
            X.0vb r14 = r4.A00
            X.0vc r11 = r4.A0q
            if (r11 == 0) goto L_0x04c5
            X.1L2 r10 = r4.A0C
            r9 = 25
            X.48A r8 = new X.48A
            r24 = r2
            r25 = r2
            r26 = r2
            r17 = r14
            r18 = r10
            r19 = r16
            r21 = r11
            r22 = r9
            r23 = r2
            r16 = r15
            r14 = r12
            r15 = r13
            r13 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r12.addTextChangedListener(r8)
            android.text.InputFilter[] r8 = new android.text.InputFilter[r3]
            X.C72453Mb.A1H(r12, r8, r9, r2)
        L_0x02ba:
            r2 = 2131427365(0x7f0b0025, float:1.8476344E38)
            android.view.View r8 = r4.findViewById(r2)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x02d5
            r2 = 2131434446(0x7f0b1bce, float:1.8490706E38)
            android.view.View r2 = r4.findViewById(r2)
            com.whatsapp.registration.RegistrationScrollView r2 = (com.whatsapp.registration.RegistrationScrollView) r2
            r4.A1d = r2
            if (r2 == 0) goto L_0x02d5
            r2.setTopAndBottomScrollingElevation(r8, r0)
        L_0x02d5:
            X.10I r2 = r4.A05
            r0 = 15
            X.C21449AkG.A00(r2, r4, r0)
            X.0zA r0 = r4.A4g()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x02ef
            com.whatsapp.WaEditText r2 = r4.A0I
            if (r2 == 0) goto L_0x02ef
            r0 = 12
            X.AFX.A00(r2, r4, r0)
        L_0x02ef:
            X.194 r0 = r4.A0G
            if (r0 == 0) goto L_0x04bf
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x033e
            java.lang.String r0 = "RegisterName/clock-wrong"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.17v r2 = r4.A0m
            if (r2 == 0) goto L_0x04a7
            X.1gx r0 = r4.A0n
            if (r0 == 0) goto L_0x04a1
            X.C88364Zk.A02(r4, r2, r0)
        L_0x0309:
            if (r6 == r7) goto L_0x0312
            X.1jT r0 = r4.A4j()
            X.C33841jT.A03(r0, r5, r3)
        L_0x0312:
            r0 = 7
            X.AQ9 r2 = new X.AQ9
            r2.<init>(r4, r0)
            r4.A1a = r2
            X.1Lf r0 = r4.A0M
            if (r0 == 0) goto L_0x049b
            r0.registerObserver(r2)
            X.10I r2 = r4.A05
            r0 = 12
            X.C21449AkG.A00(r2, r4, r0)
            X.00H r0 = r4.A1K
            if (r0 == 0) goto L_0x0495
            java.lang.Object r2 = r0.get()
            X.2n1 r2 = (X.C59872n1) r2
            X.2Qb r0 = X.C49332Qb.A03
            r2.A01(r0, r3)
            X.1Vu r2 = r4.A10
            if (r2 == 0) goto L_0x048f
            monitor-enter(r2)
            goto L_0x0464
        L_0x033e:
            X.194 r0 = r4.A0G
            if (r0 == 0) goto L_0x04b9
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0309
            java.lang.String r0 = "RegisterName/sw-expired"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.17v r2 = r4.A0m
            if (r2 == 0) goto L_0x04b3
            X.1gx r0 = r4.A0n
            if (r0 == 0) goto L_0x04ad
            X.C88364Zk.A03(r4, r2, r0)
            goto L_0x0309
        L_0x0359:
            X.3Ce r8 = A1n
            if (r8 == 0) goto L_0x036b
            X.1E8 r8 = X.AnonymousClass3MY.A0P(r4)
            r4.A0Y = r8
            A0r(r4)
            X.AnonymousClass4Yv.A01(r4, r2)
            goto L_0x0270
        L_0x036b:
            android.content.Intent r10 = r4.getIntent()
            if (r10 == 0) goto L_0x037d
            java.lang.String r8 = "google_migrate_import_canceled"
            boolean r8 = r10.getBooleanExtra(r8, r2)
            if (r8 != r3) goto L_0x037d
            r4.A4e(r2)
            return
        L_0x037d:
            android.content.Intent r10 = r4.getIntent()
            if (r10 == 0) goto L_0x038f
            java.lang.String r8 = "google_migrate_import_success"
            boolean r8 = r10.getBooleanExtra(r8, r2)
            if (r8 != r3) goto L_0x038f
            r4.A4m()
            return
        L_0x038f:
            X.19D r10 = r4.A4h()
            r8 = 10527(0x291f, float:1.4751E-41)
            boolean r8 = X.C18020vd.A05(r9, r10, r8)
            if (r8 == 0) goto L_0x03be
            X.19D r10 = r4.A4h()
            r8 = 2989(0xbad, float:4.188E-42)
            boolean r8 = X.C18020vd.A05(r9, r10, r8)
            if (r8 == 0) goto L_0x03be
            android.content.SharedPreferences r10 = X.C72453Mb.A0M(r4)
            java.lang.String r8 = "first_party_migration_initiated"
            boolean r8 = r10.getBoolean(r8, r2)
            if (r8 == 0) goto L_0x03be
            android.content.Intent r9 = X.AnonymousClass1LU.A1b(r4, r1, r1, r2, r2)
            r8 = 19
            r4.startActivityForResult(r9, r8)
            goto L_0x0270
        L_0x03be:
            X.17x r10 = r4.A0S
            if (r10 == 0) goto L_0x04d4
            boolean r8 = r10.A08()
            if (r8 != 0) goto L_0x03d0
            boolean r8 = r10.A0G()
            r18 = 1
            if (r8 == 0) goto L_0x03d2
        L_0x03d0:
            r18 = 0
        L_0x03d2:
            X.00H r8 = r4.A18
            if (r8 == 0) goto L_0x04d1
            boolean r8 = X.C72463Mc.A1W(r8)
            r19 = r8 ^ 1
            android.content.SharedPreferences r10 = X.C72453Mb.A0M(r4)
            java.lang.String r8 = "pref_has_seen_contact_primer_during_email_reg"
            boolean r8 = r10.getBoolean(r8, r2)
            if (r8 == 0) goto L_0x041b
            if (r18 == 0) goto L_0x041b
            X.19D r10 = r4.A4h()
            r8 = 11092(0x2b54, float:1.5543E-41)
            boolean r8 = X.C18020vd.A05(r9, r10, r8)
            if (r8 == 0) goto L_0x041b
            int[] r8 = new int[r3]
            r9 = 2131231920(0x7f0804b0, float:1.8079935E38)
            r8[r2] = r9
            r15 = 2131891926(0x7f1216d6, float:1.9418586E38)
            r16 = 2131894501(0x7f1220e5, float:1.9423809E38)
            r19 = 0
        L_0x0405:
            r17 = 2131894307(0x7f122023, float:1.9423415E38)
            X.00H r9 = r4.A1E
            if (r9 == 0) goto L_0x04cb
            r14 = 17
            java.lang.String r12 = "connect_with_friends"
            r10 = r4
            r11 = r9
            r13 = r8
            boolean r8 = X.AnonymousClass74O.A0M(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r8 == 0) goto L_0x0270
            goto L_0x026d
        L_0x041b:
            X.17x r8 = r4.A0S
            if (r8 == 0) goto L_0x04d4
            boolean r8 = r8.A08()
            if (r8 == 0) goto L_0x0448
            X.17x r8 = r4.A0S
            if (r8 == 0) goto L_0x04d4
            X.0z4 r8 = r8.A01
            android.content.SharedPreferences r9 = X.C17890vO.A0B(r8)
            java.lang.String r8 = "reg_skip_storage_perm"
            int r8 = r9.getInt(r8, r2)
            r15 = 2131888885(0x7f120af5, float:1.9412418E38)
            if (r8 != r5) goto L_0x043d
            r15 = 2131894330(0x7f12203a, float:1.9423462E38)
        L_0x043d:
            int[] r8 = new int[r3]
            r9 = 2131231834(0x7f08045a, float:1.807976E38)
            r8[r2] = r9
            r16 = 2131894329(0x7f122039, float:1.942346E38)
            goto L_0x0405
        L_0x0448:
            r8 = 3
            int[] r8 = new int[r8]
            r9 = 2131231834(0x7f08045a, float:1.807976E38)
            r8[r2] = r9
            r9 = 2131231658(0x7f0803aa, float:1.8079403E38)
            r8[r3] = r9
            r9 = 2131231920(0x7f0804b0, float:1.8079935E38)
            r8[r5] = r9
            r16 = 2131894331(0x7f12203b, float:1.9423464E38)
            r15 = 2131894332(0x7f12203c, float:1.9423466E38)
            goto L_0x0405
        L_0x0461:
            r8 = r11
            goto L_0x0252
        L_0x0464:
            android.os.Handler r0 = r2.A00     // Catch:{ all -> 0x048c }
            if (r0 == 0) goto L_0x0471
            android.os.Looper r0 = r0.getLooper()     // Catch:{ all -> 0x048c }
            r0.quit()     // Catch:{ all -> 0x048c }
            r2.A00 = r1     // Catch:{ all -> 0x048c }
        L_0x0471:
            monitor-exit(r2)
            android.content.Intent r2 = r4.getIntent()
            if (r2 == 0) goto L_0x0487
            r0 = 0
            java.lang.String r1 = "is_from_backup_otp_screen"
            boolean r0 = r2.getBooleanExtra(r1, r0)
            if (r0 != r3) goto L_0x0487
            r2.removeExtra(r1)
            r4.A4e(r3)
        L_0x0487:
            java.lang.String r0 = "profile"
            r4.A1R = r0
            return
        L_0x048c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x048f:
            java.lang.String r0 = "interAppCommunicationManager"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0495:
            java.lang.String r0 = "registrationNotificationManager"
            X.C18070vi.A11(r0)
            throw r1
        L_0x049b:
            java.lang.String r0 = "contactObservers"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04a1:
            java.lang.String r0 = "messageNotification"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04a7:
            java.lang.String r0 = "messageHandler"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04ad:
            java.lang.String r0 = "messageNotification"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04b3:
            java.lang.String r0 = "messageHandler"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04b9:
            java.lang.String r0 = "roadblocks"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04bf:
            java.lang.String r0 = "roadblocks"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04c5:
            java.lang.String r0 = "sharedPreferencesFactory"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04cb:
            java.lang.String r0 = "funnelLogger"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04d1:
            java.lang.String r0 = "contactAccessHelper"
            goto L_0x04d6
        L_0x04d4:
            java.lang.String r0 = "waPermissionsHelper"
        L_0x04d6:
            X.C18070vi.A11(r0)
            throw r1
        L_0x04da:
            java.lang.String r0 = "contactAccessHelper"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04e0:
            java.lang.String r0 = "waPermissionsHelper"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04e6:
            java.lang.String r0 = "expressionUserJourneyLogger"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04ec:
            java.lang.String r0 = "sharedPreferencesFactory"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04f2:
            java.lang.String r0 = "emojiSearchProvider"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04f8:
            java.lang.String r0 = "recentEmojis"
            X.C18070vi.A11(r0)
            throw r1
        L_0x04fe:
            java.lang.String r0 = "smbRegistrationResources"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0504:
            java.lang.String r0 = "smbRegistrationResources"
            X.C18070vi.A11(r0)
            throw r1
        L_0x050a:
            java.lang.String r0 = "accountSwitcher"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0510:
            java.lang.String r0 = "smbRegistrationResources"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0517:
            java.lang.String r0 = "landscapeModeBacktest"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.RegisterName.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        Dialog dialog;
        ProgressDialog progressDialog;
        String str;
        int i2 = i;
        if (i != 0) {
            if (i2 == 1) {
                Log.w("RegisterName/dialog/failed-net");
                C73203Rj A002 = AnonymousClass4a6.A00(this);
                A002.A0E(2131891357);
                A002.A0S(C108975cc.A0b(this, getString(2131888733), new Object[1], 2131891355));
                C20152A9o.A00(A002, this, 0, 2131891356);
                progressDialog = A002.create();
            } else if (i2 != 22) {
                if (i2 == 103) {
                    Log.i("RegisterName/dialog/restore");
                    AnonymousClass11P r3 = this.A05;
                    AnonymousClass11C r2 = this.A08;
                    C18000vb r4 = this.A00;
                    C18030ve r7 = this.A0E;
                    C27431Wb r5 = this.A0U;
                    if (r5 != null) {
                        AnonymousClass1Cd r6 = this.A0W;
                        if (r6 != null) {
                            C166658dJ r1 = new C166658dJ(r2, r3, r4, r5, r6, r7, this.A0l, this, A4j());
                            this.A0u = r1;
                            r1.setCancelable(false);
                            C21449AkG.A00(this.A05, this, 18);
                            Dialog dialog2 = this.A0u;
                            dialog = dialog2;
                            if (dialog2 == null) {
                                throw C17880vN.A0g();
                            }
                        } else {
                            str = "messageStoreManager";
                        }
                    } else {
                        str = "messageStoreBackup";
                    }
                } else if (i2 != 109) {
                    progressDialog = super.onCreateDialog(i2);
                } else {
                    Log.w("RegisterName/dialog/cant-connect");
                    AnonymousClass1LU r15 = this.A0l;
                    AnonymousClass10I r12 = this.A05;
                    C132216mP r10 = this.A0H;
                    if (r10 != null) {
                        AnonymousClass11C r122 = this.A08;
                        AnonymousClass1MB r14 = this.A0j;
                        if (r14 != null) {
                            AnonymousClass11E r11 = this.A07;
                            C219217x r13 = this.A0S;
                            if (r13 != null) {
                                A98 a98 = this.A0v;
                                if (a98 != null) {
                                    progressDialog = A9B.A07(this, r10, r11, r122, r13, r14, r15, a98, r12);
                                } else {
                                    str = "registrationHttpManager";
                                }
                            } else {
                                str = "waPermissionsHelper";
                            }
                        } else {
                            str = "supportGatingUtils";
                        }
                    } else {
                        str = "sendFeedback";
                    }
                }
                C18070vi.A11(str);
                throw null;
            } else {
                String string = getString(2131894984);
                ProgressDialog progressDialog2 = new ProgressDialog(this);
                AnonymousClass8BX.A0x(progressDialog2, string);
                progressDialog = progressDialog2;
            }
            C18070vi.A0X(progressDialog);
            dialog = progressDialog;
        } else {
            Log.i("RegisterName/dialog/initprogress");
            if (A1n == null && AnonymousClass8BU.A02(this) != 37) {
                Log.w("RegisterName/dialog/initprogress/init-null/remove");
                C17890vO.A0D().postDelayed(new C21449AkG((Object) this, 17), 3);
            }
            AnonymousClass11P r62 = this.A05;
            C18070vi.A0W(r62);
            AnonymousClass11C r52 = this.A08;
            C18070vi.A0W(r52);
            C18000vb r72 = this.A00;
            C18070vi.A0W(r72);
            C18030ve r8 = this.A0E;
            C18070vi.A0W(r8);
            C166648dI r42 = new C166648dI(r52, r62, r72, r8, this);
            this.A0t = r42;
            r42.setCancelable(false);
            Dialog dialog3 = this.A0t;
            dialog = dialog3;
            if (dialog3 == null) {
                throw C17880vN.A0g();
            }
        }
        return dialog;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.5qs] */
    public RegisterName() {
        AGE.A00(this, 24);
        this.A1f = new Object();
        this.A1h = new C170678qU(this);
        this.A1k = new AnonymousClass9AL(this, 12);
        this.A1i = new C161268Cm(Looper.getMainLooper(), this, 4);
        this.A1e = new C161268Cm(Looper.getMainLooper(), this, 5);
        this.A1g = new C20448ALl(this, 2);
        this.A1j = new C183549Yr(this);
        this.A1m = new C99274sY(new C21975Avd(this), new C21974Avc(this), new C22021AwN(this), AnonymousClass3MW.A15(C77553qY.class));
        this.A1l = new C99274sY(new C21977Avf(this), new C21976Ave(this), new C22022AwO(this), AnonymousClass3MW.A15(ProfileCreationViewModel.class));
    }

    private final void A0V(int i, int i2) {
        Integer num;
        A0s(this, i);
        AnonymousClass00H r0 = this.A18;
        if (r0 == null) {
            C18070vi.A11("contactAccessHelper");
            throw null;
        } else if (C72463Mc.A1W(r0) && (num = this.A1P) != null && num.intValue() == 1) {
            this.A1P = Integer.valueOf(i2);
        }
    }

    public static final void A0c(GraphQLXWA2RegUpsell graphQLXWA2RegUpsell, RegisterName registerName) {
        Intent intent;
        int i;
        String A0Q2;
        int i2;
        String packageName;
        String str;
        int ordinal = graphQLXWA2RegUpsell.ordinal();
        if (ordinal == 2) {
            Log.i("RegisterName/showRegistrationUpsell/maybeShowPasskeyCreateEducationScreen");
            Log.i("RegisterName//showPasskeyCreateEducationScreen");
            intent = C17880vN.A0A();
            intent.setClassName(registerName.getPackageName(), "com.whatsapp.passkeys.PasskeyCreateEducationScreen");
            i = 21;
        } else if (ordinal == 1) {
            AnonymousClass00H r0 = registerName.A1B;
            if (r0 != null) {
                C19830z4 r1 = ((C196039uM) r0.get()).A01;
                String A0o2 = r1.A0o();
                if (A0o2 == null || A0o2.length() == 0 || r1.A2N()) {
                    AnonymousClass00H r02 = registerName.A1B;
                    if (r02 != null) {
                        if (((C196039uM) r02.get()).A01()) {
                            Log.i("RegisterName//showConfirmEmailSetupScreen");
                            A0Q2 = C17890vO.A0Q();
                            i2 = 1;
                            intent = C17880vN.A0A();
                            packageName = registerName.getPackageName();
                            str = "com.whatsapp.registration.email.ConfirmEmailSetupRegUpsellActivity";
                        } else {
                            Log.i("RegisterName//showRegistrationEmailCaptureScreen");
                            A0Q2 = C17890vO.A0Q();
                            i2 = 1;
                            intent = C17880vN.A0A();
                            packageName = registerName.getPackageName();
                            str = "com.whatsapp.registration.email.EmailEducationScreen";
                        }
                    }
                } else {
                    Log.i("RegisterName//showUnverifiedEmailSetupScreen");
                    A0Q2 = C17890vO.A0Q();
                    i2 = 1;
                    intent = C17880vN.A0A();
                    packageName = registerName.getPackageName();
                    str = "com.whatsapp.registration.email.UnverifiedEmailSetupRegUpsellActivity";
                }
                intent.setClassName(packageName, str);
                intent.putExtra("entrypoint", i2);
                intent.putExtra("session_id", A0Q2);
                i = 22;
            }
            C18070vi.A11("emailVerificationManager");
            throw null;
        } else if (ordinal == 3) {
            A0q(registerName);
            return;
        } else {
            return;
        }
        registerName.startActivityForResult(intent, i);
    }

    public static final void A0d(RegisterName registerName) {
        View view;
        long A042 = C17890vO.A04(C72453Mb.A0M(registerName), "com.whatsapp.registername.initializer_start_time");
        if (A042 > 0 && AnonymousClass8BR.A04(A042) > 600000 && (view = registerName.A01) != null) {
            view.setVisibility(0);
        }
    }

    private final void A0u(boolean z) {
        WDSProfilePhoto wDSProfilePhoto;
        C39241sk r0;
        AnonymousClass19D A4h = A4h();
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A00(r2, A4h, 12202) == 1) {
            wDSProfilePhoto = this.A15;
            if (wDSProfilePhoto != null) {
                if (!z) {
                    r0 = new C39251sl();
                }
                r0 = new C39291sp();
            } else {
                return;
            }
        } else if (C18020vd.A05(r2, A4h(), 11419) && (wDSProfilePhoto = this.A15) != null) {
            if (!z) {
                r0 = null;
            }
            r0 = new C39291sp();
        } else {
            return;
        }
        wDSProfilePhoto.setProfileBadge(r0);
    }

    public void A4e(boolean z) {
        super.A4e(z);
        C166658dJ r1 = this.A0u;
        if (r1 != null && z) {
            r1.A00(1);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0334, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0338, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0101, code lost:
        A4m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        invalidateOptionsMenu();
        A4f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RegisterName/activity-result request:"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " result:"
            X.C17900vP.A0j(r0, r1, r11)
            java.lang.String r0 = "profile"
            r9.A1R = r0
            java.lang.String r3 = "RegisterName/"
            r0 = 5
            r7 = -1
            r2 = 4
            r6 = 3
            r1 = 0
            r5 = 2
            r4 = 1
            switch(r10) {
                case 12: goto L_0x027f;
                case 13: goto L_0x0223;
                case 14: goto L_0x017c;
                case 15: goto L_0x0175;
                case 16: goto L_0x011f;
                case 17: goto L_0x0106;
                case 18: goto L_0x0055;
                case 19: goto L_0x003f;
                case 20: goto L_0x0021;
                case 21: goto L_0x002f;
                case 22: goto L_0x003b;
                case 23: goto L_0x0021;
                case 24: goto L_0x002b;
                default: goto L_0x0021;
            }
        L_0x0021:
            super.onActivityResult(r10, r11, r12)
        L_0x0024:
            r9.invalidateOptionsMenu()
            r9.A4f()
            return
        L_0x002b:
            r9.A0Q()
            goto L_0x0024
        L_0x002f:
            if (r11 != 0) goto L_0x003b
            boolean r0 = r9.A1V
            if (r0 == 0) goto L_0x003b
            com.whatsapp.infra.graphql.generated.registration.enums.GraphQLXWA2RegUpsell r0 = com.whatsapp.infra.graphql.generated.registration.enums.GraphQLXWA2RegUpsell.EMAIL
            A0c(r0, r9)
            goto L_0x0024
        L_0x003b:
            A0q(r9)
            goto L_0x0024
        L_0x003f:
            X.0z4 r0 = r9.A0A
            r0.A2B(r1)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BR.A08(r9)
            java.lang.String r0 = "chat_transfer_finished"
            X.C17880vN.A1F(r1, r0, r4)
            if (r11 == r7) goto L_0x00fc
            if (r11 != 0) goto L_0x0024
            r9.A03()
            goto L_0x0024
        L_0x0055:
            long r7 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r2 = X.C72453Mb.A0M(r9)
            java.lang.String r0 = "google_migrate_import_start_time"
            long r2 = X.C17890vO.A05(r2, r0)
            long r7 = r7 - r2
            if (r11 == r4) goto L_0x00c2
            if (r11 == r5) goto L_0x0084
            if (r11 != r6) goto L_0x0024
            X.1jT r0 = r9.A4j()
            r0.A0A()
            android.content.Intent r1 = X.AnonymousClass1LU.A04(r9)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.clear_phone_number"
            r1.putExtra(r0, r4)
            r9.startActivity(r1)
            r9.finish()
            goto L_0x0024
        L_0x0084:
            X.9xY r0 = r9.A14
            if (r0 == 0) goto L_0x0329
            android.content.SharedPreferences r0 = X.C197959xY.A00(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = "google_migrate_ios_funnel_id"
            android.content.SharedPreferences$Editor r0 = r0.remove(r3)
            java.lang.String r2 = "google_migrate_ios_export_duration"
            X.C17880vN.A1B(r0, r2)
            X.9xY r0 = r9.A14
            if (r0 == 0) goto L_0x0329
            android.content.SharedPreferences r0 = X.C197959xY.A00(r0)
            r4 = 0
            java.lang.String r5 = r0.getString(r3, r4)
            X.9xY r0 = r9.A14
            if (r0 == 0) goto L_0x031d
            android.content.SharedPreferences r0 = X.C197959xY.A00(r0)
            java.lang.String r6 = r0.getString(r2, r4)
            X.A8V r2 = X.AnonymousClass8BW.A0U(r9)
            java.lang.String r3 = "profile_photo"
            r2.A0M(r3, r4, r5, r6, r7)
            r9.A4e(r1)
            goto L_0x0024
        L_0x00c2:
            X.9xY r0 = r9.A14
            if (r0 == 0) goto L_0x0329
            android.content.SharedPreferences r0 = X.C197959xY.A00(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "google_migrate_ios_funnel_id"
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)
            java.lang.String r1 = "google_migrate_ios_export_duration"
            X.C17880vN.A1B(r0, r1)
            X.9xY r0 = r9.A14
            if (r0 == 0) goto L_0x0329
            android.content.SharedPreferences r0 = X.C197959xY.A00(r0)
            r4 = 0
            java.lang.String r5 = r0.getString(r2, r4)
            X.9xY r0 = r9.A14
            if (r0 == 0) goto L_0x0323
            android.content.SharedPreferences r0 = X.C197959xY.A00(r0)
            java.lang.String r6 = r0.getString(r1, r4)
            X.A8V r2 = X.AnonymousClass8BW.A0U(r9)
            java.lang.String r3 = "profile_photo"
            r2.A0M(r3, r4, r5, r6, r7)
            goto L_0x0101
        L_0x00fc:
            java.lang.String r0 = "RegisterName/activity-result/chat-transfer/succeeded from donor entry point"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0101:
            r9.A4m()
            goto L_0x0024
        L_0x0106:
            r9.A0V(r6, r6)
            r9.A03()
            X.00H r0 = r9.A18
            if (r0 == 0) goto L_0x032c
            boolean r0 = X.C72463Mc.A1W(r0)
            if (r0 == 0) goto L_0x0024
            X.10I r1 = r9.A05
            r0 = 15
            X.C21449AkG.A00(r1, r9, r0)
            goto L_0x0024
        L_0x011f:
            if (r11 == r4) goto L_0x015d
            if (r11 != r5) goto L_0x0140
            java.lang.String r0 = "restore>RegisterName/checking for google and local backups"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r9.getPackageName()
            java.lang.String r0 = "com.whatsapp.backup.google.RestoreFromBackupActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "action_show_restore_one_time_setup"
            r1.setAction(r0)
            r0 = 14
            r9.startActivityForResult(r1, r0)
        L_0x0140:
            X.1Vv r4 = r9.A0z
            if (r4 == 0) goto L_0x032f
            long r2 = android.os.SystemClock.elapsedRealtime()
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r9)
            java.lang.String r0 = "direct_migration_start_time"
            long r0 = X.C17890vO.A04(r1, r0)
            long r2 = r2 - r0
            X.1Vw r1 = r4.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A09 = r0
            goto L_0x0024
        L_0x015d:
            java.lang.String r0 = "RegisterName/activity-result/successfully-restored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11O r0 = r9.A0B
            android.content.SharedPreferences r2 = r0.A00
            java.lang.String r1 = "push_name"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.getString(r1, r0)
            A0t(r9, r0)
            r9.A4m()
            goto L_0x0140
        L_0x0175:
            r0 = 103(0x67, float:1.44E-43)
            X.AnonymousClass4Yv.A00(r9, r0)
            goto L_0x0024
        L_0x017c:
            if (r11 == 0) goto L_0x0215
            java.lang.String r7 = "no_backup_found"
            if (r11 == r4) goto L_0x01ef
            java.lang.String r3 = "skip"
            if (r11 == r5) goto L_0x01d7
            if (r11 == r6) goto L_0x01b6
            if (r11 == r2) goto L_0x0204
            if (r11 == r0) goto L_0x01ad
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>RegisterName/activity-result unknown result code "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " from RestoreFromBackupActivity."
            X.C17890vO.A19(r1, r0)
        L_0x019d:
            X.A8V r3 = X.AnonymousClass8BW.A0U(r9)
            java.lang.String r1 = "profile_photo"
            java.lang.String r0 = "no_tap"
            r3.A0H(r1, r0)
            r9.A0V(r2, r2)
            goto L_0x0024
        L_0x01ad:
            java.lang.String r0 = "RegisterName/activity-result/chat-transfer/succeeded from receiver entry point"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.A4m()
            goto L_0x019d
        L_0x01b6:
            java.lang.String r0 = "restore>RegisterName/activity-result backup found and is being restored."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.A4m()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r9.A1N = r0
            X.8dJ r0 = r9.A0u
            if (r0 == 0) goto L_0x01cb
            r0.hide()
        L_0x01cb:
            X.9XQ r0 = r9.A0X
            if (r0 == 0) goto L_0x0332
            X.10I r1 = r9.A05
            r0 = 15
            X.C21449AkG.A00(r1, r9, r0)
            goto L_0x019d
        L_0x01d7:
            java.lang.String r0 = "restore>RegisterName/activity-result backup found but not restored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.A4e(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r9.A1N = r0
            X.A8V r1 = X.AnonymousClass8BW.A0U(r9)
            java.lang.String r0 = "backup_found"
            r1.A0H(r0, r3)
            goto L_0x019d
        L_0x01ef:
            java.lang.String r0 = "restore>RegisterName/activity-result no google backup found"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.A4e(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r9.A1N = r0
            X.A8V r0 = X.AnonymousClass8BW.A0U(r9)
            java.lang.String r3 = "next"
            goto L_0x0211
        L_0x0204:
            r9.A4e(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r9.A1N = r0
            X.A8V r0 = X.AnonymousClass8BW.A0U(r9)
        L_0x0211:
            r0.A0H(r7, r3)
            goto L_0x019d
        L_0x0215:
            java.lang.String r0 = "restore>RegisterName/activity-result restore canceled because Google Play Services were not available on the device"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.BCg r0 = X.C166678dR.A2B(r9)
            r0.CRb()
            goto L_0x019d
        L_0x0223:
            X.1Up r0 = r9.A4i()
            r0.A0A(r3)
            if (r11 == r7) goto L_0x024b
            if (r11 != 0) goto L_0x0024
            if (r12 == 0) goto L_0x0237
            X.1Up r0 = r9.A4i()
            r0.A03(r12, r9)
        L_0x0237:
            X.0zA r0 = r9.A4g()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0246
            java.lang.NullPointerException r0 = X.AnonymousClass8BX.A0X(r9)
            throw r0
        L_0x0246:
            r0 = 0
            r9.A1O = r0
            goto L_0x0024
        L_0x024b:
            X.1E7 r1 = r9.A0Y
            if (r1 != 0) goto L_0x0263
            java.lang.String r0 = "RegisterName/onActivityResult/meContact is null. Trying to set it again from meManager."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1E8 r1 = X.AnonymousClass3MY.A0P(r9)
            r9.A0Y = r1
            if (r1 != 0) goto L_0x0263
            java.lang.String r0 = "RegisterName/onActivityResult/meContact is null. Can't set the profile image."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0024
        L_0x0263:
            X.1Up r0 = r9.A4i()
            boolean r0 = r0.A0F(r1)
            if (r0 == 0) goto L_0x0270
            A0r(r9)
        L_0x0270:
            X.0zA r0 = r9.A4g()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0024
            java.lang.NullPointerException r0 = X.AnonymousClass8BX.A0X(r9)
            throw r0
        L_0x027f:
            if (r11 != r7) goto L_0x030e
            java.lang.String r2 = "profile_photo"
            if (r12 == 0) goto L_0x02fa
            java.lang.String r0 = "is_reset"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 != r4) goto L_0x02b3
            X.A8V r1 = X.AnonymousClass8BW.A0U(r9)
            java.lang.String r0 = "did_not_set"
            r1.A0I(r2, r0)
            X.1E7 r1 = r9.A0Y
            if (r1 == 0) goto L_0x02a1
            X.1Up r0 = r9.A4i()
            r0.A0D(r1)
        L_0x02a1:
            A0r(r9)
            X.0zA r0 = r9.A4g()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0024
            java.lang.NullPointerException r0 = X.AnonymousClass8BX.A0X(r9)
            throw r0
        L_0x02b3:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 != r4) goto L_0x02e2
            X.1Up r0 = r9.A4i()
            r0.A0A(r3)
            X.1E7 r1 = r9.A0Y
            if (r1 == 0) goto L_0x02d3
            X.1Up r0 = r9.A4i()
            boolean r0 = r0.A0F(r1)
            if (r0 == 0) goto L_0x02d3
            A0r(r9)
        L_0x02d3:
            X.0zA r0 = r9.A4g()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0024
            java.lang.NullPointerException r0 = X.AnonymousClass8BX.A0X(r9)
            throw r0
        L_0x02e2:
            java.lang.String r1 = "photo_source"
            boolean r0 = r12.hasExtra(r1)
            if (r0 != r4) goto L_0x02fa
            android.os.Bundle r0 = r12.getExtras()
            if (r0 == 0) goto L_0x0339
            int r0 = r0.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A1O = r0
        L_0x02fa:
            X.A8V r1 = X.AnonymousClass8BW.A0U(r9)
            java.lang.String r0 = "set_photo"
            r1.A0I(r2, r0)
            X.1Up r1 = r9.A4i()
            r0 = 13
            r1.A04(r12, r9, r0)
            goto L_0x0024
        L_0x030e:
            X.0zA r0 = r9.A4g()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0024
            java.lang.NullPointerException r0 = X.AnonymousClass8BX.A0X(r9)
            throw r0
        L_0x031d:
            java.lang.String r0 = "googleMigrateSharedPreferences"
            X.C18070vi.A11(r0)
            throw r4
        L_0x0323:
            java.lang.String r0 = "googleMigrateSharedPreferences"
            X.C18070vi.A11(r0)
            throw r4
        L_0x0329:
            java.lang.String r0 = "googleMigrateSharedPreferences"
            goto L_0x0334
        L_0x032c:
            java.lang.String r0 = "contactAccessHelper"
            goto L_0x0334
        L_0x032f:
            java.lang.String r0 = "directMigrationLogging"
            goto L_0x0334
        L_0x0332:
            java.lang.String r0 = "userSettingsStore"
        L_0x0334:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0339:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.RegisterName.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onDestroy() {
        if (isFinishing()) {
            C32291gx r0 = this.A0n;
            if (r0 != null) {
                r0.A08();
            } else {
                C18070vi.A11("messageNotification");
                throw null;
            }
        }
        C23581Gv r1 = this.A1a;
        if (r1 != null) {
            C24671Lf r02 = this.A0M;
            if (r02 != null) {
                r02.unregisterObserver(r1);
                this.A1a = null;
            } else {
                C18070vi.A11("contactObservers");
                throw null;
            }
        }
        AnonymousClass9BJ r12 = this.A1c;
        if (r12 != null) {
            r12.A00 = null;
            r12.A0B(true);
            this.A1c = null;
        }
        AnonymousClass00H r03 = this.A1J;
        if (r03 != null) {
            AnonymousClass8BU.A1F(r03);
            RegistrationScrollView registrationScrollView = this.A1d;
            if (registrationScrollView != null) {
                registrationScrollView.getViewTreeObserver().removeOnScrollChangedListener(registrationScrollView.A07);
                if (registrationScrollView.A00 != null) {
                    registrationScrollView.getViewTreeObserver().removeOnGlobalLayoutListener(registrationScrollView.A00);
                }
                this.A1d = null;
            }
            super.onDestroy();
            return;
        }
        C18070vi.A11("registrationHelper");
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        int A0B2 = C72453Mb.A0B(menuItem);
        if (A0B2 == 0) {
            C33641j9 r0 = this.A0x;
            if (r0 != null) {
                r0.A02("register-name");
                AnonymousClass00H r02 = this.A1J;
                if (r02 != null) {
                    C58712l8 r1 = (C58712l8) r02.get();
                    C33641j9 r03 = this.A0x;
                    if (r03 != null) {
                        r1.A01(this, r03, "register-name");
                        return true;
                    }
                } else {
                    str = "registrationHelper";
                    C18070vi.A11(str);
                    throw null;
                }
            }
            str = "verificationFlowState";
            C18070vi.A11(str);
            throw null;
        } else if (A0B2 != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            AnonymousClass8BX.A0v(this, A4j());
            return true;
        }
    }

    public void onPause() {
        Handler handler;
        super.onPause();
        C70703Ce r2 = A1n;
        if (!(r2 == null || (handler = r2.A02) == null)) {
            handler.removeMessages(0);
            r2.A02 = null;
        }
        Integer num = this.A1N;
        if (num != null) {
            C17880vN.A1C(AnonymousClass8BR.A08(this), "reg_backup_status_key", num.intValue());
        }
        Integer num2 = this.A1O;
        if (num2 != null) {
            C17880vN.A1C(AnonymousClass8BR.A08(this), "reg_profile_pic_source_key", num2.intValue());
        }
        if (this.A1S) {
            C17880vN.A1F(AnonymousClass8BR.A08(this), "reg_profile_pic_tapped_key", true);
        }
    }

    public void onResume() {
        super.onResume();
        if (A1n != null) {
            AnonymousClass4Yv.A01(this, 0);
            C70703Ce r2 = A1n;
            if (r2 != null) {
                Handler handler = this.A1i;
                if (r2.A03) {
                    handler.sendEmptyMessage(0);
                }
                r2.A02 = handler;
            }
            A0d(this);
        }
        if (this.A07.A04() && this.A0t == null) {
            AnonymousClass4Yv.A01(this, 0);
            Log.i("RegisterName/resume reg verified; explicitly display continue screen");
        }
    }
}
