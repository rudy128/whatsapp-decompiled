package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.whatsapp.Me;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.1jT  reason: invalid class name and case insensitive filesystem */
public class C33841jT implements C201511a {
    public WeakReference A00 = null;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AnonymousClass195 A02;
    public final C31361fR A03;
    public final AnonymousClass1KB A04;
    public final AnonymousClass11S A05;
    public final AnonymousClass120 A06;
    public final C33621j7 A07;
    public final C26811To A08;
    public final AnonymousClass11P A09;
    public final AnonymousClass118 A0A;
    public final C27301Vn A0B;
    public final C19830z4 A0C;
    public final AnonymousClass11O A0D;
    public final C18000vb A0E;
    public final AnonymousClass1RK A0F;
    public final C18030ve A0G;
    public final C25011Mn A0H;
    public final C32291gx A0I;
    public final AnonymousClass1CM A0J;
    public final AnonymousClass10I A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final C19880zA A0Q;
    public final C19880zA A0R;
    public final C19880zA A0S;
    public final C19880zA A0T;
    public final C19880zA A0U;
    public final C19880zA A0V;
    public final C19880zA A0W;
    public final C19880zA A0X;
    public final C19880zA A0Y;
    public final C19880zA A0Z;
    public final C19880zA A0a;
    public final C19880zA A0b;
    public final C19880zA A0c;
    public final C19880zA A0d;
    public final C19880zA A0e;
    public final AnonymousClass18O A0f;
    public final C25001Mm A0g;
    public final C32531hL A0h;
    public final AnonymousClass1NP A0i;
    public final AnonymousClass1PM A0j;
    public final C26881Tv A0k;
    public final AnonymousClass12E A0l;
    public final C33831jS A0m;
    public final AnonymousClass1RW A0n;
    public final AnonymousClass1R8 A0o;
    public final AnonymousClass11C A0p;
    public final AnonymousClass1P3 A0q;
    public final C22621Co A0r;
    public final C22611Cn A0s;
    public final AnonymousClass1Cd A0t;
    public final AnonymousClass1WZ A0u;
    public final C33631j8 A0v;
    public final AnonymousClass19F A0w;
    public final AnonymousClass126 A0x;
    public final AnonymousClass1LU A0y;
    public final C30261de A0z;
    public final C33701jF A10;
    public final C18010vc A11;
    public final C33451iq A12;
    public final C33641j9 A13;
    public final C33721jH A14;
    public final AnonymousClass00H A15;
    public final AnonymousClass00H A16;
    public final AnonymousClass00H A17;
    public final AnonymousClass00H A18;
    public final AnonymousClass00H A19;
    public final AnonymousClass00H A1A;

    /* JADX WARNING: type inference failed for: r0v5, types: [X.72G, androidx.core.app.NotificationCompat$BigTextStyle] */
    public static C1409673t A00(C33841jT r5, String str, String str2, String str3) {
        Context context = r5.A0A.A00;
        C1409673t A032 = C217217d.A03(context);
        A032.A0M = "critical_app_alerts@1";
        A032.A03 = 1;
        A032.A0F(str3);
        A032.A09(AnonymousClass11P.A01(r5.A09));
        A032.A06(3);
        A032.A0G(true);
        A032.A0E(str);
        A032.A0D(str2);
        ? r0 = new AnonymousClass72G();
        r0.A07(str2);
        A032.A0B(r0);
        A032.A0A = C1408573i.A00(context, 1, AnonymousClass1LU.A0A(context), 0);
        A032.A08.icon = 2131231578;
        return A032;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02() {
        /*
            r9 = this;
            X.0ve r2 = r9.A0G
            r1 = 11151(0x2b8f, float:1.5626E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0087
            X.1P3 r1 = r9.A0q
            X.1MH r0 = r1.A0I
            X.1au r8 = r0.A06()
            X.1xA r7 = r8.BD0()     // Catch:{ all -> 0x007a }
            X.00H r6 = r1.A0P     // Catch:{ all -> 0x0070 }
            java.lang.Object r4 = r6.get()     // Catch:{ all -> 0x0070 }
            X.2nN r4 = (X.C60092nN) r4     // Catch:{ all -> 0x0070 }
            monitor-enter(r4)     // Catch:{ all -> 0x0070 }
            X.1Ov r0 = r1.A09     // Catch:{ all -> 0x006d }
            java.lang.String r3 = "SignalSessionStore/deleteSessionsForChangeNumber"
            X.1MH r0 = r0.A01     // Catch:{ all -> 0x006d }
            X.1au r5 = r0.A06()     // Catch:{ all -> 0x006d }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0066 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "sessions"
            r0 = 0
            int r0 = r2.A04(r1, r0, r3, r0)     // Catch:{ all -> 0x0066 }
            long r2 = (long) r0     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r1.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "SignalSessionStore/deleteSessionsForChangeNumber "
            r1.append(r0)     // Catch:{ all -> 0x0066 }
            r1.append(r2)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = " sessions"
            r1.append(r0)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0066 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0066 }
            r5.close()     // Catch:{ all -> 0x006d }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x006d }
            X.2nN r0 = (X.C60092nN) r0     // Catch:{ all -> 0x006d }
            r0.A02()     // Catch:{ all -> 0x006d }
            r7.A00()     // Catch:{ all -> 0x006d }
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            r7.close()     // Catch:{ all -> 0x007a }
            goto L_0x0084
        L_0x0066:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x006d }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x007a }
        L_0x0079:
            throw r1     // Catch:{ all -> 0x007a }
        L_0x007a:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x007f }
            throw r1
        L_0x007f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0084:
            r8.close()
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33841jT.A02():void");
    }

    public static void A03(C33841jT r4, int i, boolean z) {
        if (r4.A0D.A00.getInt("registration_state", -1) != i) {
            C33641j9 r1 = r4.A13;
            r1.A00 = null;
            C33641j9.A00(r1);
            r1.A01 = false;
            r1.A02 = false;
            r1.A03 = false;
            r1.A06 = false;
            r1.A07 = false;
            r1.A04 = false;
            r1.A05 = true;
            r4.A0C.A10();
        }
        AnonymousClass1CM r2 = r4.A0J;
        if (z) {
            r2.A01(i);
        } else {
            r2.A00.A00.edit().putInt("registration_state", i).commit();
            ((AnonymousClass1DS) r2.A01.get()).A0E(Integer.valueOf(i));
        }
        C19880zA r12 = r4.A0b;
        if (r12.A07() && r2.A04()) {
            r12.A03();
            throw new NullPointerException("postValidVNameEvent");
        }
    }

    public Intent A04() {
        C19830z4 r4 = this.A0C;
        C19830z4.A00(r4).putBoolean("pref_enter_phone_number_notif_shown", false).apply();
        A09();
        C59932n7 r0 = (C59932n7) this.A15.get();
        r0.A01 = false;
        r0.A00 = null;
        r0.A04.A1r((String) null, (String) null);
        AnonymousClass00H r8 = this.A0N;
        ((C37551pj) r8.get()).A0C();
        ((C219017v) this.A0P.get()).A0F(false, 16);
        AnonymousClass11S r6 = this.A05;
        r6.A0I();
        AnonymousClass1E8 r2 = r6.A0D;
        if (r2 != null) {
            C26881Tv r1 = this.A0k;
            r1.A03.A03(r2);
            r1.A01(r2, 0, 0);
        }
        Context context = this.A0A.A00;
        File file = new File(context.getFilesDir(), "me");
        if (file.exists()) {
            file.delete();
        }
        r6.A0F();
        A0D((String) null, (String) null, (String) null);
        this.A0u.A01();
        Intent A052 = AnonymousClass1LU.A05(context);
        A052.addFlags(32768);
        C19880zA r62 = this.A0T;
        if (r62.A07()) {
            ((AnonymousClass00H) r62.A03()).get();
            throw new NullPointerException("clearAllStoredData");
        }
        C19880zA r63 = this.A0R;
        if (r63.A07()) {
            ((AnonymousClass00H) r63.A03()).get();
            throw new NullPointerException("clearAllStoredData");
        }
        C19880zA r64 = this.A0e;
        if (r64.A07()) {
            ((AnonymousClass00H) r64.A03()).get();
            throw new NullPointerException("clear");
        }
        A03(this, 1, true);
        ((C143877Fd) this.A18.get()).A0B();
        C33451iq r02 = this.A12;
        r02.A0A();
        C33451iq.A04(r02);
        this.A0t.A07 = false;
        C33621j7.A00(this.A07).A08.A00 = true;
        A85.A02(context);
        C19830z4.A00(r4).putInt("gdrive_successive_backup_failed_count", 0).apply();
        AnonymousClass1NP r65 = this.A0i;
        if (r65.A08() == C49532Qv.PASSWORD_ENCRYPTED) {
            r65.A0N(true);
        }
        AnonymousClass10I r66 = this.A0K;
        r66.CGF(new C21449AkG((Object) this, 22));
        ((C37551pj) r8.get()).A0D();
        r4.A2A(true);
        r66.CGF(new C21449AkG((Object) this, 23));
        SharedPreferences.Editor A002 = C19830z4.A00(r4);
        A002.remove("show_pre_reg_do_not_share_code_warning");
        A002.apply();
        r4.A2C(false);
        C19830z4.A00(r4).putString("contact_qr_code", (String) null).apply();
        C19830z4.A00(r4).putBoolean("support_ban_appeal_screen_before_verification", false).apply();
        C19830z4.A00(r4).putString("logout_message_header", (String) null).apply();
        C19830z4.A00(r4).putString("logout_message_subtext", (String) null).apply();
        C19830z4.A00(r4).putString("logout_message_locale", (String) null).apply();
        C19830z4.A00(r4).putString("main_button_text", (String) null).apply();
        C19830z4.A00(r4).putString("main_button_url", (String) null).apply();
        C19830z4.A00(r4).putString("secondary_button_text", (String) null).apply();
        C19830z4.A00(r4).putString("secondary_button_url", (String) null).apply();
        C19830z4.A00(r4).putString("pcr_active_pn", (String) null).apply();
        C19830z4.A00(r4).putString("pcr_active_cc", (String) null).apply();
        for (C52632bE r03 : (Set) this.A19.get()) {
            r03.A00.A03();
        }
        AnonymousClass9Q8.A00(this.A0n.A00(), (AnonymousClass1BI) null);
        return A052;
    }

    public void A05() {
        PendingIntent A012 = C1408573i.A01(this.A0A.A00, 0, new Intent("com.whatsapp.alarm.REGISTRATION_RETRY").setPackage("com.whatsapp"), 536870912);
        if (A012 != null) {
            AlarmManager A052 = this.A0p.A05();
            if (A052 != null) {
                A052.cancel(A012);
            } else {
                Log.w("RegistrationManager/cancelRegistrationRetryAlarm AlarmManager is null");
            }
            A012.cancel();
        }
        ((A8V) this.A17.get()).A0E("reg_retry_verification_timer_canceled", "reg_retry_notification_step");
    }

    public void A06() {
        AnonymousClass11S r0 = this.A05;
        Me A072 = r0.A07();
        if (A072 != null) {
            r0.A0H();
            this.A03.A00();
            A02();
            C19880zA r1 = this.A0S;
            if (r1.A07()) {
                C37251pD r2 = (C37251pD) ((AnonymousClass00H) r1.A03()).get();
                if (r2.A01.A00.A09(AnonymousClass18O.A0G)) {
                    C37231pB r22 = r2.A02;
                    C37231pB.A00(new C685733w(r22, 0), r22);
                }
            }
            ((C143877Fd) this.A18.get()).A0B();
            AnonymousClass00H r12 = this.A0N;
            ((C37551pj) r12.get()).A0D();
            ((C37551pj) r12.get()).A0L((C57732jY) null);
            C33831jS r23 = this.A0m;
            AnonymousClass1UN r13 = r23.A01;
            if (r13.A07() && r13.A02.A2J()) {
                r23.A00.A1G(1);
                r23.A00();
            }
            this.A0x.A0P(3, false);
            this.A01.post(new C146517Pk(this, A072, 32));
            return;
        }
        Log.w("RegistrationManager/notifyChangeNumberSuccess/response/ok already changed?");
    }

    public void A07() {
        this.A0h.A02();
        if (!this.A0J.A04()) {
            Log.i("RegistrationManager/notifyOrShowLoginFailureOverlayAlert/ignore as registration not verified");
        } else {
            this.A04.CGP(new C21449AkG((Object) this, 21));
        }
    }

    public void A08() {
        AnonymousClass11S r1 = this.A05;
        r1.A0I();
        if (r1.A00 != null) {
            Log.i("RegistrationManager/xmpp/service/reset-registered/updateparams");
            r1.A0I();
            PhoneUserJid phoneUserJid = r1.A0E;
            C219017v r12 = (C219017v) this.A0P.get();
            if (r12.A17) {
                r12.A05 = phoneUserJid;
            }
        }
    }

    public void A09() {
        C18010vc r2 = this.A11;
        Context context = this.A0A.A00;
        r2.A05(A01(context, "com.whatsapp.registration.phonenumberentry.RegisterPhone")).edit().clear().apply();
        r2.A05(A01(context, "com.whatsapp.registration.verifyphone.VerifyPhoneNumber")).edit().clear().apply();
    }

    public void A0A() {
        this.A05.A0F();
        this.A0C.A14();
        AnonymousClass1CJ r1 = this.A0r.A00;
        synchronized (r1) {
            AnonymousClass1CJ.A01(r1).clear();
            r1.A00 = false;
        }
        A03(this, 1, true);
    }

    public void A0B() {
        this.A0K.CGF(new C146517Pk(this, this.A0A.A00, 31));
    }

    public void A0D(String str, String str2, String str3) {
        C19830z4 r0 = this.A0C;
        r0.A1d(str3);
        r0.A1t(str, str2);
    }

    public boolean A0E() {
        C25011Mn r5 = this.A0H;
        r5.A00();
        A02();
        AnonymousClass00H r4 = this.A0P;
        ((C219017v) r4.get()).A0F(false, 16);
        this.A0w.A04();
        C19830z4 r3 = this.A0C;
        C19830z4.A00(r3).putLong("registration_success_time_ms", AnonymousClass11P.A01(this.A09)).apply();
        this.A0z.A00();
        Log.i("RegistrationManager/completeChangeNumber");
        Me me = new Me(r3.A0l(), r3.A0n(), r3.A0m());
        boolean z = false;
        if (me.jabber_id != null) {
            z = true;
        }
        Log.a(z);
        AnonymousClass11S r1 = this.A05;
        r1.A0I();
        if (AnonymousClass11S.A05(me, r1, "me")) {
            r1.A0I();
            AnonymousClass11S.A03(me, r1);
            AnonymousClass1Cd r0 = this.A0t;
            r0.A06();
            boolean z2 = r0.A08;
            if (!z2) {
                C22611Cn r2 = this.A0s;
                if (r2.A00.A09((AnonymousClass1DQ) null, false)) {
                    Log.i("RegistrationManager/completeChangeNumber/msgstoredb/healthy");
                    C22621Co.A02(this.A0r, false);
                    r2.A01();
                }
            }
            A08();
            ((C219017v) r4.get()).A07();
            if (!z2) {
                this.A0l.A05();
            }
            A03(this, 3, true);
            AnonymousClass10I r8 = this.A0K;
            r8.CGF(new C21449AkG((Object) this, 24));
            C33621j7.A00(this.A07).A08.A00 = true;
            A85.A02(this.A0A.A00);
            Log.i("RegistrationManager/completeChangeNumber/changenumber/setregverified");
            this.A0l.A06();
            this.A10.A01(true, false);
            Log.i("RegistrationManager/completeChangeNumber/reinitalized-payments");
            AnonymousClass18O r02 = this.A0f;
            synchronized (AnonymousClass18O.class) {
                r02.A00.edit().putLong("groups_server_props_last_refresh_time", 0).apply();
            }
            r8.CGF(new C21449AkG((Object) this, 20));
            C33721jH r12 = this.A14;
            r12.A01(1, 3);
            r12.A01(2, 3);
            r5.A00();
            ((C37551pj) this.A0N.get()).A0D();
            r3.A1D(3);
            ((C219017v) r4.get()).A0B(0, true, false, false, false);
            return true;
        }
        Log.i("RegistrationManager/completeChangeNumber/error-saving");
        return false;
    }

    public boolean A0F() {
        Log.i("RegistrationManager/revertToOldNumber");
        AnonymousClass11S r2 = this.A05;
        Me A072 = r2.A07();
        r2.A0I();
        if (!AnonymousClass11S.A05(A072, r2, "me")) {
            return false;
        }
        r2.A0I();
        AnonymousClass11S.A03(A072, r2);
        C19830z4 r0 = this.A0C;
        r0.A23(false);
        r0.A22(false);
        r2.A0H();
        this.A03.A00();
        C22611Cn r22 = this.A0s;
        if (r22.A00.A09((AnonymousClass1DQ) null, false)) {
            Log.i("RegistrationManager/revertToOldNumber/msgstoredb/healthy");
            C22621Co.A02(this.A0r, false);
            r22.A01();
            ((C219017v) this.A0P.get()).A07();
            this.A0l.A05();
            return true;
        }
        ((C219017v) this.A0P.get()).A08();
        return true;
    }

    public boolean A0G() {
        C19830z4 r0 = this.A0C;
        Me me = new Me(r0.A0l(), r0.A0n(), r0.A0m());
        if (me.jabber_id == null) {
            return false;
        }
        AnonymousClass11S r02 = this.A05;
        r02.A0I();
        AnonymousClass11S.A03(me, r02);
        AnonymousClass00H r2 = this.A0P;
        ((C219017v) r2.get()).A16 = true;
        Log.i("RegistrationManager/startPassiveConnectionBeforeRestore/finishRegistration/set-connection/passive");
        A08();
        ((C219017v) r2.get()).A07();
        return true;
    }

    public static String A01(Context context, String str) {
        String packageName = context.getPackageName();
        int length = packageName.length();
        if (!str.startsWith(packageName) || str.length() <= length || str.charAt(length) != '.') {
            return str;
        }
        return str.substring(length + 1);
    }

    public void A0C(long j) {
        if (j >= 60000) {
            if (!this.A0o.A00(C1408573i.A01(this.A0A.A00, 0, new Intent("com.whatsapp.alarm.REGISTRATION_RETRY").setPackage("com.whatsapp"), 134217728), 2, SystemClock.elapsedRealtime() + j)) {
                Log.w("RegistrationManager/startRegistrationRetryAlarm AlarmManager is null");
            } else {
                ((A8V) this.A17.get()).A0E("reg_retry_verification_timer_scheduled", "reg_retry_notification_step");
            }
        }
    }

    public C33841jT(C19880zA r3, C19880zA r4, C19880zA r5, C19880zA r6, C19880zA r7, C19880zA r8, C19880zA r9, C19880zA r10, C19880zA r11, C19880zA r12, C19880zA r13, C19880zA r14, C19880zA r15, C19880zA r16, C19880zA r17, AnonymousClass195 r18, C31361fR r19, AnonymousClass1KB r20, AnonymousClass11S r21, AnonymousClass120 r22, AnonymousClass18O r23, C25001Mm r24, C32531hL r25, AnonymousClass1NP r26, C33621j7 r27, C26811To r28, AnonymousClass1PM r29, C26881Tv r30, AnonymousClass12E r31, C33831jS r32, AnonymousClass1RW r33, AnonymousClass1R8 r34, AnonymousClass11C r35, AnonymousClass11P r36, AnonymousClass118 r37, C27301Vn r38, C19830z4 r39, AnonymousClass11O r40, C18000vb r41, AnonymousClass1P3 r42, C22621Co r43, C22611Cn r44, AnonymousClass1Cd r45, AnonymousClass1WZ r46, AnonymousClass1RK r47, C33631j8 r48, C18030ve r49, AnonymousClass19F r50, AnonymousClass126 r51, AnonymousClass1LU r52, C25011Mn r53, C32291gx r54, C30261de r55, C33701jF r56, C18010vc r57, C33451iq r58, AnonymousClass1CM r59, C33641j9 r60, C33721jH r61, AnonymousClass10I r62, AnonymousClass00H r63, AnonymousClass00H r64, AnonymousClass00H r65, AnonymousClass00H r66, AnonymousClass00H r67, AnonymousClass00H r68, AnonymousClass00H r69, AnonymousClass00H r70, AnonymousClass00H r71, AnonymousClass00H r72, AnonymousClass00H r73) {
        Boolean bool = C17960vV.A01;
        this.A0A = r37;
        this.A09 = r36;
        this.A0G = r49;
        this.A0Z = r3;
        this.A04 = r20;
        this.A15 = r63;
        this.A0o = r34;
        this.A05 = r21;
        this.A0K = r62;
        this.A18 = r64;
        this.A0a = r4;
        this.A0r = r43;
        this.A0H = r53;
        this.A0f = r23;
        this.A08 = r28;
        this.A0O = r65;
        this.A0g = r24;
        this.A07 = r27;
        this.A17 = r66;
        this.A0P = r69;
        this.A0Y = r5;
        this.A0w = r50;
        this.A0p = r35;
        this.A0E = r41;
        this.A0M = r67;
        this.A0N = r68;
        this.A0x = r51;
        this.A06 = r22;
        this.A0q = r42;
        this.A12 = r58;
        this.A0h = r25;
        this.A0l = r31;
        this.A0v = r48;
        this.A03 = r19;
        this.A0k = r30;
        this.A0t = r45;
        this.A0V = r8;
        this.A0d = r9;
        this.A0j = r29;
        this.A0C = r39;
        this.A0I = r54;
        this.A13 = r60;
        this.A0B = r38;
        this.A0F = r47;
        this.A0b = r6;
        this.A0c = r7;
        this.A0i = r26;
        this.A0z = r55;
        this.A0S = r10;
        this.A19 = r71;
        this.A0T = r11;
        this.A10 = r56;
        this.A0J = r59;
        this.A11 = r57;
        this.A02 = r18;
        this.A14 = r61;
        this.A0R = r13;
        this.A0u = r46;
        this.A0D = r40;
        this.A0U = r12;
        this.A0s = r44;
        this.A1A = r70;
        this.A0L = r72;
        this.A0n = r33;
        this.A0Q = r14;
        this.A16 = r73;
        this.A0W = r15;
        this.A0e = r16;
        this.A0X = r17;
        this.A0m = r32;
        this.A0y = r52;
    }
}
