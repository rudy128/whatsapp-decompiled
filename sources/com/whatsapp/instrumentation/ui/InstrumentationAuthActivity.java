package com.whatsapp.instrumentation.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass18O;
import X.AnonymousClass194;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1OX;
import X.AnonymousClass1PN;
import X.AnonymousClass1R8;
import X.AnonymousClass1TM;
import X.AnonymousClass2BC;
import X.AnonymousClass3KQ;
import X.AnonymousClass3KR;
import X.AnonymousClass5Y0;
import X.AnonymousClass5a1;
import X.C003401n;
import X.C006602x;
import X.C146447Pd;
import X.C17880vN;
import X.C17960vV;
import X.C18030ve;
import X.C18070vi;
import X.C219017v;
import X.C23577Bm6;
import X.C30391dr;
import X.C30451dy;
import X.C32291gx;
import X.C34001jj;
import X.C37011op;
import X.C56632hm;
import X.C58292kS;
import X.C62012qe;
import X.C80633xb;
import X.C88364Zk;
import X.C91014f0;
import X.C95694me;
import X.C97654pp;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager;
import com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager$startRegistration$1;
import com.whatsapp.util.Log;

public class InstrumentationAuthActivity extends AnonymousClass1FY implements AnonymousClass5a1, AnonymousClass3KQ, AnonymousClass3KR, AnonymousClass5Y0 {
    public C56632hm A00;
    public AnonymousClass194 A01;
    public CompanionRegOverSideChannelV2Manager A02;
    public AnonymousClass1R8 A03;
    public AnonymousClass118 A04;
    public C80633xb A05;
    public AnonymousClass1TM A06;
    public C97654pp A07;
    public ConfirmFragment A08;
    public PermissionsFragment A09;
    public VerificationCodeFragment A0A;
    public C62012qe A0B;
    public C37011op A0C;
    public C58292kS A0D;
    public C219017v A0E;
    public C32291gx A0F;
    public Boolean A0G;
    public String A0H;
    public boolean A0I;

    public static void A03(InstrumentationAuthActivity instrumentationAuthActivity, int i) {
        if (i == -1 || i == 4) {
            C34001jj r2 = new C34001jj(instrumentationAuthActivity.A03.A00.A03);
            r2.A09(instrumentationAuthActivity.A08, 2131430999);
            r2.A0H((String) null);
            r2.A00(false);
        }
    }

    public void A2y() {
        if (!this.A0I) {
            this.A0I = true;
            AnonymousClass10E A0J = AnonymousClass1FB.A0J((AnonymousClass1K1) ((C006602x) generatedComponent()), this);
            AnonymousClass1FB.A0M(A0J, this);
            AnonymousClass10G r1 = A0J.A00;
            AnonymousClass1FB.A0K(A0J, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0J, r1, this, r1.A5A);
            this.A01 = (AnonymousClass194) A0J.A9Z.get();
            this.A0D = (C58292kS) A0J.AAy.get();
            this.A0E = (C219017v) A0J.A6S.get();
            this.A0F = (C32291gx) A0J.A6X.get();
            this.A04 = (AnonymousClass118) A0J.ABY.get();
            this.A03 = (AnonymousClass1R8) A0J.A0H.get();
            this.A06 = (AnonymousClass1TM) A0J.A5K.get();
            this.A0C = (C37011op) A0J.A5N.get();
            this.A0B = (C62012qe) r1.A2o.get();
            this.A02 = (CompanionRegOverSideChannelV2Manager) A0J.A2U.get();
            this.A00 = (C56632hm) r1.A23.get();
        }
    }

    public void BpF() {
        Log.e("InstrumentationAuthActivity/onCompanionRegistrationError");
        this.A05.A0J(new C146447Pd(this, 23));
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.whatsapp.instrumentation.ui.PermissionsFragment, com.whatsapp.instrumentation.ui.Hilt_PermissionsFragment, androidx.fragment.app.Fragment] */
    /* JADX WARNING: type inference failed for: r6v1, types: [com.whatsapp.instrumentation.ui.Hilt_ConfirmFragment, androidx.fragment.app.Fragment, com.whatsapp.instrumentation.ui.ConfirmFragment] */
    public void onCreate(Bundle bundle) {
        String A1H;
        super.onCreate(bundle);
        setTitle(2131899088);
        if (!this.A06.A00.A09(AnonymousClass18O.A0G)) {
            A0V(this, "Feature is disabled!", 3);
            return;
        }
        ComponentName callingActivity = getCallingActivity();
        int i = 8;
        if (callingActivity == null) {
            A1H = "Not started for result.";
        } else {
            String packageName = callingActivity.getPackageName();
            try {
                if (this.A0C.A01(packageName).A03) {
                    Intent intent = getIntent();
                    String str = null;
                    if (!(intent == null || getCallingPackage() == null)) {
                        str = intent.getStringExtra("request_token");
                    }
                    this.A0H = str;
                    boolean A012 = this.A0D.A01(packageName, str);
                    i = 4;
                    if (!A012) {
                        Log.e("InstrumentationAuthActivity/onCreate no correct request token!");
                        A1H = "Request is not authorized!";
                    } else {
                        C97654pp r2 = new C97654pp(this.A00, this.A02, this);
                        this.A07 = r2;
                        this.A02.registerObserver(r2);
                        setContentView(2131625712);
                        C18030ve r15 = this.A0E;
                        this.A05 = new C80633xb(this, this.A03, this.A05, this.A08, new C95694me(this, 4), r15, 2131891684, 0);
                        Intent intent2 = getIntent();
                        int i2 = 0;
                        if (intent2 != null) {
                            i2 = intent2.getIntExtra("content_variant", 0);
                        }
                        ? hilt_PermissionsFragment = new Hilt_PermissionsFragment();
                        Bundle A0D2 = C17880vN.A0D();
                        A0D2.putInt("content_variant", i2);
                        hilt_PermissionsFragment.A1R(A0D2);
                        this.A09 = hilt_PermissionsFragment;
                        ? hilt_ConfirmFragment = new Hilt_ConfirmFragment();
                        Bundle A0D3 = C17880vN.A0D();
                        A0D3.putInt("content_variant", i2);
                        hilt_ConfirmFragment.A1R(A0D3);
                        this.A08 = hilt_ConfirmFragment;
                        this.A0A = new VerificationCodeFragment();
                        if (i2 == 3 || i2 == 4) {
                            this.A0G = true;
                            C97654pp r5 = this.A07;
                            CompanionRegOverSideChannelV2Manager companionRegOverSideChannelV2Manager = r5.A00;
                            CompanionRegOverSideChannelV2Manager.A01(companionRegOverSideChannelV2Manager);
                            if (intent2 != null) {
                                byte[] byteArrayExtra = intent2.getByteArrayExtra("companion_ephemeral_identity");
                                if (byteArrayExtra == null) {
                                    Log.e("CompanionRegistrationHelper/startRegistration/error null companion ephemeral identity");
                                } else {
                                    try {
                                        AnonymousClass2BC r6 = (AnonymousClass2BC) C23577Bm6.A07(AnonymousClass2BC.DEFAULT_INSTANCE, byteArrayExtra);
                                        C18070vi.A0b(r6);
                                        C18070vi.A0d(r6, 0);
                                        AnonymousClass1OX r52 = companionRegOverSideChannelV2Manager.A06;
                                        C30451dy.A02(AnonymousClass00R.A00, companionRegOverSideChannelV2Manager.A05, new CompanionRegOverSideChannelV2Manager$startRegistration$1(companionRegOverSideChannelV2Manager, r6, (C30391dr) null), r52);
                                    } catch (AnonymousClass1PN e) {
                                        Log.e("CompanionRegistrationHelper/startRegistration/error", e);
                                        r5.A01.BpF();
                                    }
                                }
                            }
                            r5.A01.BpF();
                        }
                        if (bundle == null) {
                            C34001jj r3 = new C34001jj(this.A03.A00.A03);
                            r3.A08(this.A09, 2131430999);
                            r3.A00(false);
                        }
                        if (this.A01.A02()) {
                            Log.w("InstrumentationAuthActivity/onCreate/clock-wrong");
                            C88364Zk.A02(this, this.A0E, this.A0F);
                        } else if (this.A01.A01()) {
                            Log.w("InstrumentationAuthActivity/onCreate/sw-expired");
                            C88364Zk.A03(this, this.A0E, this.A0F);
                        }
                        C003401n supportActionBar = getSupportActionBar();
                        C17960vV.A07(supportActionBar);
                        supportActionBar.A0W(true);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            A1H = AnonymousClass001.A1H("Untrusted caller: ", packageName, AnonymousClass000.A10());
        }
        A0V(this, A1H, i);
    }

    public void onDestroy() {
        this.A02.unregisterObserver(this.A07);
        super.onDestroy();
    }

    public InstrumentationAuthActivity(int i) {
        this.A0I = false;
        A2L(new C91014f0(this, 26));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x010e, code lost:
        if (r0 == false) goto L_0x0110;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0Q(com.whatsapp.instrumentation.ui.InstrumentationAuthActivity r12, java.lang.String r13) {
        /*
            android.content.Intent r4 = X.C17880vN.A0A()
            java.lang.String r3 = r12.getCallingPackage()
            X.C17960vV.A07(r3)
            X.2kS r6 = r12.A0D
            monitor-enter(r6)
            boolean r0 = r6.A01(r3, r13)     // Catch:{ all -> 0x0123 }
            if (r0 != 0) goto L_0x0016
            goto L_0x00a4
        L_0x0016:
            X.1HY r11 = r6.A00     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "request/token"
            java.lang.String r2 = X.AnonymousClass1HY.A01(r3, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "request/token_ts"
            java.lang.String r1 = X.AnonymousClass1HY.A01(r3, r0)     // Catch:{ all -> 0x0123 }
            android.content.SharedPreferences r0 = X.AnonymousClass1HY.A00(r11)     // Catch:{ all -> 0x0123 }
            android.content.SharedPreferences$Editor r0 = X.C17890vO.A09(r0, r2)     // Catch:{ all -> 0x0123 }
            X.C17880vN.A1B(r0, r1)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "auth/encryption_key"
            java.lang.String r1 = X.AnonymousClass1HY.A01(r3, r0)     // Catch:{ all -> 0x0123 }
            android.content.SharedPreferences r0 = X.AnonymousClass1HY.A00(r11)     // Catch:{ all -> 0x0123 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0123 }
            X.C17880vN.A1B(r0, r1)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "encrypted_cache/key"
            java.lang.String r1 = X.AnonymousClass1HY.A01(r3, r0)     // Catch:{ all -> 0x0123 }
            android.content.SharedPreferences r0 = X.AnonymousClass1HY.A00(r11)     // Catch:{ all -> 0x0123 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0123 }
            X.C17880vN.A1B(r0, r1)     // Catch:{ all -> 0x0123 }
            java.security.SecureRandom r2 = new java.security.SecureRandom     // Catch:{ all -> 0x0123 }
            r2.<init>()     // Catch:{ all -> 0x0123 }
            r0 = 16
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0123 }
            r2.nextBytes(r1)     // Catch:{ all -> 0x0123 }
            r0 = 11
            java.lang.String r5 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "auth/token"
            java.lang.String r10 = X.AnonymousClass1HY.A01(r3, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "auth/token_ts"
            java.lang.String r9 = X.AnonymousClass1HY.A01(r3, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "metadata/last_active_time"
            java.lang.String r8 = X.AnonymousClass1HY.A01(r3, r0)     // Catch:{ all -> 0x0123 }
            X.11P r0 = r11.A01     // Catch:{ all -> 0x0123 }
            long r1 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "metadata/last_call_ranking_time"
            java.lang.String r7 = X.AnonymousClass1HY.A01(r3, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "metadata/last_message_ranking_time"
            java.lang.String r3 = X.AnonymousClass1HY.A01(r3, r0)     // Catch:{ all -> 0x0123 }
            android.content.SharedPreferences r0 = X.AnonymousClass1HY.A00(r11)     // Catch:{ all -> 0x0123 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0123 }
            android.content.SharedPreferences$Editor r0 = r0.putString(r10, r5)     // Catch:{ all -> 0x0123 }
            android.content.SharedPreferences$Editor r0 = r0.putLong(r9, r1)     // Catch:{ all -> 0x0123 }
            android.content.SharedPreferences$Editor r0 = r0.putLong(r8, r1)     // Catch:{ all -> 0x0123 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r7)     // Catch:{ all -> 0x0123 }
            X.C17880vN.A1B(r0, r3)     // Catch:{ all -> 0x0123 }
            monitor-exit(r6)
            goto L_0x00a6
        L_0x00a4:
            monitor-exit(r6)
            r5 = 0
        L_0x00a6:
            X.118 r0 = r12.A04
            android.content.Context r0 = r0.A00
            android.content.Context r8 = r0.getApplicationContext()
            java.lang.Class<com.whatsapp.instrumentation.notification.DelayedNotificationReceiver> r7 = com.whatsapp.instrumentation.notification.DelayedNotificationReceiver.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r8, r7)
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = 0
            android.app.PendingIntent r0 = X.C1408573i.A01(r8, r6, r1, r0)
            if (r0 != 0) goto L_0x00ef
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            double r2 = r0.nextDouble()
            r0 = 4712059816451768320(0x4164997000000000, double:1.08E7)
            double r2 = r2 * r0
            long r0 = (long) r2
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            long r0 = r0 + r2
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 + r0
            X.11C r0 = r12.A08
            android.app.AlarmManager r0 = r0.A05()
            if (r0 == 0) goto L_0x00f8
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r8, r7)
            android.app.PendingIntent r1 = X.C17880vN.A06(r8, r0, r6)
            X.1R8 r0 = r12.A03
            X.1R9 r0 = r0.A00
            r0.A01(r1, r6, r2)
        L_0x00ef:
            if (r5 != 0) goto L_0x00fe
            r1 = 4
            java.lang.String r0 = "Request is not authorized!"
            A0V(r12, r0, r1)
            return
        L_0x00f8:
            java.lang.String r0 = "InstrumentationAuthActivity/scheduleDelayedNotification AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00ef
        L_0x00fe:
            X.11S r0 = r12.A02
            r0.A0I()
            X.1E8 r1 = r0.A0D
            if (r1 == 0) goto L_0x0110
            X.2qe r0 = r12.A0B
            boolean r0 = r0.A00(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0111
        L_0x0110:
            r1 = 0
        L_0x0111:
            java.lang.String r0 = "authorization_token"
            r4.putExtra(r0, r5)
            java.lang.String r0 = "is_test_user"
            r4.putExtra(r0, r1)
            r0 = -1
            r12.setResult(r0, r4)
            r12.finish()
            return
        L_0x0123:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.instrumentation.ui.InstrumentationAuthActivity.A0Q(com.whatsapp.instrumentation.ui.InstrumentationAuthActivity, java.lang.String):void");
    }

    public static void A0V(InstrumentationAuthActivity instrumentationAuthActivity, String str, int i) {
        Intent A0A2 = C17880vN.A0A();
        A0A2.putExtra("error_code", i);
        A0A2.putExtra("error_message", str);
        instrumentationAuthActivity.setResult(0, A0A2);
        instrumentationAuthActivity.finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 12345) {
            A03(this, i2);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !this.A08.A1b()) {
            return super.onOptionsItemSelected(menuItem);
        }
        C34001jj r2 = new C34001jj(this.A03.A00.A03);
        r2.A09(this.A09, 2131430999);
        r2.A00(false);
        return true;
    }

    public void onResume() {
        super.onResume();
        C34001jj r2 = new C34001jj(this.A03.A00.A03);
        r2.A09(this.A09, 2131430999);
        r2.A00(false);
    }

    public InstrumentationAuthActivity() {
        this(0);
        this.A0G = false;
    }
}
