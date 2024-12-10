package com.whatsapp;

import X.A8V;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11E;
import X.AnonymousClass11O;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass127;
import X.AnonymousClass188;
import X.AnonymousClass1BI;
import X.AnonymousClass1CH;
import X.AnonymousClass1CM;
import X.AnonymousClass1Cd;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1L1;
import X.AnonymousClass1L2;
import X.AnonymousClass1L4;
import X.AnonymousClass1L7;
import X.AnonymousClass1L9;
import X.AnonymousClass1LC;
import X.AnonymousClass1LD;
import X.AnonymousClass1LU;
import X.AnonymousClass1VJ;
import X.AnonymousClass2PM;
import X.AnonymousClass3KH;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass739;
import X.AnonymousClass757;
import X.AnonymousClass79Z;
import X.C000200d;
import X.C006602x;
import X.C139576z4;
import X.C147087Rt;
import X.C166678dR;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18150vq;
import X.C19830z4;
import X.C19880zA;
import X.C19890zB;
import X.C21368Aix;
import X.C22891Dp;
import X.C23641Hb;
import X.C28361a1;
import X.C28721an;
import X.C28901bF;
import X.C29491cN;
import X.C31391fU;
import X.C33621j7;
import X.C49152Pj;
import X.C49332Qb;
import X.C50152Ti;
import X.C57082iV;
import X.C62562rb;
import X.C70603Bt;
import X.C70613Bu;
import X.C73203Rj;
import X.C90604eL;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import com.whatsapp.companionmode.CompanionStateHolder$CompanionLogoutStateReceiver;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

public class Main extends C166678dR implements AnonymousClass3KH {
    public Uri A00;
    public C19880zA A01;
    public AnonymousClass2PM A02;
    public AnonymousClass1VJ A03;
    public AnonymousClass1Cd A04;
    public AnonymousClass127 A05;
    public AnonymousClass1LU A06;
    public WhatsAppLibLoader A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public boolean A0M;
    public C49152Pj A0N;
    public boolean A0O;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        if (isFinishing() != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005e, code lost:
        startActivity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0138, code lost:
        r3 = X.AnonymousClass1LU.A1l(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x022c, code lost:
        if (X.C17890vO.A0B(r15.A0A).getBoolean("support_ban_appeal_screen_before_verification", false) != false) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x022e, code lost:
        r3 = X.C17880vN.A0A();
        r3.setClassName(getPackageName(), "com.whatsapp.userban.ui.BanAppealActivity");
        r3.putExtra("launch_source", 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0242, code lost:
        r3 = A03(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x026e, code lost:
        if (X.AnonymousClass1FB.A0O(r15) != false) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0270, code lost:
        X.C33841jT.A03((X.C33841jT) r15.A0G.get(), 4, true);
        r3 = A03(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0282, code lost:
        X.C33841jT.A03((X.C33841jT) r15.A0G.get(), 1, true);
        r3 = X.AnonymousClass1LU.A04(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        X.C33841jT.A03((X.C33841jT) r15.A0G.get(), 0, true);
        r3 = X.C17880vN.A0A();
        r3.setClassName(getPackageName(), "com.whatsapp.registration.EULA");
        r3.putExtra("show_registration_first_dlg", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0056, code lost:
        if (r15.A0M == false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4c() {
        /*
            r15 = this;
            r8 = r15
            X.11S r0 = r15.A02
            r0.A0I()
            com.whatsapp.Me r0 = r0.A00
            if (r0 != 0) goto L_0x02be
            boolean r0 = r15.isFinishing()
            if (r0 != 0) goto L_0x0064
            X.1CM r1 = r15.A07
            r0 = 0
            int r3 = r1.A00(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Main/messageStoreVerified/registration state is "
            X.C17900vP.A0j(r0, r1, r3)
            r14 = 1
            r2 = 0
            switch(r3) {
                case 0: goto L_0x02a1;
                case 1: goto L_0x0036;
                case 2: goto L_0x0293;
                case 3: goto L_0x0025;
                case 4: goto L_0x0270;
                case 5: goto L_0x0036;
                case 6: goto L_0x025b;
                case 7: goto L_0x024e;
                case 8: goto L_0x0248;
                case 9: goto L_0x021f;
                case 10: goto L_0x022e;
                case 11: goto L_0x0210;
                case 12: goto L_0x026a;
                case 13: goto L_0x0242;
                case 14: goto L_0x01f1;
                case 15: goto L_0x01c2;
                case 16: goto L_0x0025;
                case 17: goto L_0x0242;
                case 18: goto L_0x024e;
                case 19: goto L_0x0242;
                case 20: goto L_0x0282;
                case 21: goto L_0x0149;
                case 22: goto L_0x013e;
                case 23: goto L_0x026a;
                case 24: goto L_0x0242;
                case 25: goto L_0x0138;
                case 26: goto L_0x0138;
                case 27: goto L_0x0138;
                case 28: goto L_0x0138;
                case 29: goto L_0x0138;
                case 30: goto L_0x0138;
                case 31: goto L_0x0125;
                case 32: goto L_0x012b;
                case 33: goto L_0x0085;
                case 34: goto L_0x0138;
                case 35: goto L_0x0138;
                case 36: goto L_0x0025;
                case 37: goto L_0x0074;
                case 38: goto L_0x0242;
                case 39: goto L_0x006a;
                case 40: goto L_0x0025;
                case 41: goto L_0x0138;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "main/invalid/registration state="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; default to EULA"
            X.C17890vO.A19(r1, r0)
        L_0x0036:
            X.00H r0 = r15.A0G
            java.lang.Object r0 = r0.get()
            X.1jT r0 = (X.C33841jT) r0
            X.C33841jT.A03(r0, r2, r14)
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.EULA"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "show_registration_first_dlg"
            r3.putExtra(r0, r2)
        L_0x0054:
            boolean r0 = r15.A0M
            if (r0 == 0) goto L_0x0061
            boolean r0 = r15.isFinishing()
            if (r0 != 0) goto L_0x0061
            r15.startActivity(r3)
        L_0x0061:
            r15.finish()
        L_0x0064:
            java.lang.String r0 = "main/me App.me is null, can't proceed."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x006a:
            java.lang.String r1 = X.C17890vO.A0Q()
            r0 = 6
            android.content.Intent r3 = X.AnonymousClass1LU.A1P(r15, r1, r0)
            goto L_0x0054
        L_0x0074:
            X.AnonymousClass1FB.A0N(r15)
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.security.PCRSuccessfulActivity"
            r3.setClassName(r1, r0)
            goto L_0x0054
        L_0x0085:
            X.00H r0 = r15.A0H
            java.lang.Object r0 = r0.get()
            X.0vc r0 = (X.C18010vc) r0
            java.lang.String r7 = "consent"
            android.content.SharedPreferences r3 = r0.A05(r7)
            java.lang.String r0 = "minted_idv_token"
            java.lang.String r1 = X.C17880vN.A0r(r3, r0)
            java.lang.String r0 = "minted_idvtoken_expiry_time_secs"
            long r5 = X.C17890vO.A05(r3, r0)
            if (r1 == 0) goto L_0x00c6
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00c6
            X.11P r0 = r15.A05
            long r3 = X.AnonymousClass11P.A00(r0)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c6
            java.lang.String r2 = "com.bloks.www.wa.authenticity.launcher.async"
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.ageverification.idv.AuthenticityActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "screen_name"
            r3.putExtra(r0, r2)
            goto L_0x0054
        L_0x00c6:
            java.lang.String r0 = "Main/remediation token either expired or empty, reset!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.00H r0 = r15.A0H
            java.lang.Object r0 = r0.get()
            X.0vc r0 = (X.C18010vc) r0
            android.content.SharedPreferences r0 = r0.A05(r7)
            X.C17900vP.A0J(r0)
            X.0z4 r0 = r15.A0A
            java.lang.String r3 = ""
            r0.A1t(r3, r3)
            X.0z4 r0 = r15.A0A
            r4 = 0
            java.lang.String r1 = "2fa"
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r0)
            X.C17880vN.A1B(r0, r1)
            X.0z4 r0 = r15.A0A
            r0.A1d(r4)
            X.0z4 r0 = r15.A0A
            r0.A1c(r3)
            X.0z4 r0 = r15.A0A
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "registration_voice_code_length"
            X.C17880vN.A1C(r1, r0, r2)
            X.0z4 r0 = r15.A0A
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "registration_sms_code_length"
            X.C17880vN.A1C(r1, r0, r2)
            X.0z4 r0 = r15.A0A
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "registration_failure_reason"
            X.C17880vN.A1E(r1, r0, r3)
            X.0z4 r0 = r15.A0A
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "registration_push_notif_code"
            X.C17880vN.A1E(r1, r0, r3)
            goto L_0x0036
        L_0x0125:
            android.content.Intent r3 = X.AnonymousClass1LU.A04(r15)
            goto L_0x0054
        L_0x012b:
            X.00H r0 = r15.A0G
            java.lang.Object r1 = r0.get()
            X.1jT r1 = (X.C33841jT) r1
            r0 = 29
            X.C33841jT.A03(r1, r0, r14)
        L_0x0138:
            android.content.Intent r3 = X.AnonymousClass1LU.A1l(r15, r2)
            goto L_0x0054
        L_0x013e:
            boolean r1 = X.AnonymousClass1FB.A0O(r15)
            r0 = 0
            android.content.Intent r3 = X.AnonymousClass1LU.A1Z(r15, r0, r0, r2, r1)
            goto L_0x0054
        L_0x0149:
            X.00H r0 = r15.A0K
            java.lang.Object r2 = r0.get()
            X.6yf r2 = (X.C139336yf) r2
            X.C17960vV.A07(r2)
            r9 = 0
            r12 = 21
            r13 = -1
            r11 = r9
            r10 = r9
            android.content.Intent r3 = X.C139336yf.A00(r8, r9, r10, r11, r12, r13, r14)
            X.00H r0 = r2.A08
            java.lang.Object r0 = r0.get()
            X.6n0 r0 = (X.C132556n0) r0
            java.lang.String r4 = r0.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WfacManager/startWfacLogging for main with ban state "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r4, r1)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            int r0 = r4.hashCode()
            switch(r0) {
                case -358171056: goto L_0x01ab;
                case 191367207: goto L_0x01a8;
                case 272787191: goto L_0x0194;
                case 1951953694: goto L_0x0181;
                default: goto L_0x017f;
            }
        L_0x017f:
            goto L_0x0054
        L_0x0181:
            java.lang.String r0 = "BANNED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0054
            X.00H r0 = r2.A09
            java.lang.Object r1 = r0.get()
            X.6om r1 = (X.C133456om) r1
            java.lang.String r0 = "banned"
            goto L_0x01bd
        L_0x0194:
            java.lang.String r0 = "UNBANNED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0054
            X.00H r0 = r2.A09
            java.lang.Object r1 = r0.get()
            X.6om r1 = (X.C133456om) r1
            java.lang.String r0 = "unbanned"
            goto L_0x01bd
        L_0x01a8:
            java.lang.String r0 = "CHECKPOINTED"
            goto L_0x01ad
        L_0x01ab:
            java.lang.String r0 = "UNKNOWN_IN_CLIENT"
        L_0x01ad:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0054
            X.00H r0 = r2.A09
            java.lang.Object r1 = r0.get()
            X.6om r1 = (X.C133456om) r1
            java.lang.String r0 = "other"
        L_0x01bd:
            r1.A00(r0, r13, r14)
            goto L_0x0054
        L_0x01c2:
            boolean r4 = X.AnonymousClass1FB.A0O(r15)
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.verifyphone.VerifyPhoneNumber"
            android.content.Intent r3 = r3.setClassName(r1, r0)
            java.lang.String r0 = "changenumber"
            r3.putExtra(r0, r4)
            java.lang.String r0 = "use_sms_retriever"
            r3.putExtra(r0, r2)
            java.lang.String r0 = "wa_old_eligible"
            r3.putExtra(r0, r14)
            java.lang.String r0 = "code_verification_mode"
            r3.putExtra(r0, r2)
            java.lang.String r0 = "EXTRA_IS_APP_RESTARTED"
            r3.putExtra(r0, r14)
            goto L_0x0054
        L_0x01f1:
            boolean r4 = X.AnonymousClass1FB.A0O(r15)
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity"
            android.content.Intent r3 = r3.setClassName(r1, r0)
            java.lang.String r0 = "change_number"
            r3.putExtra(r0, r4)
            java.lang.String r0 = "use_sms_retriever"
            r3.putExtra(r0, r2)
            goto L_0x0054
        L_0x0210:
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.migration.export.ui.ExportMigrationDataExportedActivity"
            r3.setClassName(r1, r0)
            goto L_0x0054
        L_0x021f:
            X.0z4 r0 = r15.A0A
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "support_ban_appeal_screen_before_verification"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x0242
        L_0x022e:
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.userban.ui.BanAppealActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "launch_source"
            r3.putExtra(r0, r14)
            goto L_0x0054
        L_0x0242:
            android.content.Intent r3 = r15.A03(r3)
            goto L_0x0054
        L_0x0248:
            java.lang.String r0 = "main/messageStoreVerified/registration-state-is-registration-flash-primary"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0270
        L_0x024e:
            X.AnonymousClass1FB.A0N(r15)
            boolean r0 = X.AnonymousClass1FB.A0O(r15)
            android.content.Intent r3 = X.AnonymousClass1LU.A1o(r15, r0, r2)
            goto L_0x0054
        L_0x025b:
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.account.delete.DeleteAccountConfirmation"
            r3.setClassName(r1, r0)
            goto L_0x0054
        L_0x026a:
            boolean r0 = X.AnonymousClass1FB.A0O(r15)
            if (r0 == 0) goto L_0x0282
        L_0x0270:
            X.00H r0 = r15.A0G
            java.lang.Object r1 = r0.get()
            X.1jT r1 = (X.C33841jT) r1
            r0 = 4
            X.C33841jT.A03(r1, r0, r14)
            android.content.Intent r3 = r15.A03(r3)
            goto L_0x0054
        L_0x0282:
            X.00H r0 = r15.A0G
            java.lang.Object r0 = r0.get()
            X.1jT r0 = (X.C33841jT) r0
            X.C33841jT.A03(r0, r14, r14)
            android.content.Intent r3 = X.AnonymousClass1LU.A04(r15)
            goto L_0x0054
        L_0x0293:
            java.lang.String r0 = "main/no-me/regname"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AnonymousClass1FB.A0N(r15)
            android.content.Intent r3 = X.AnonymousClass1LU.A03(r15)
            goto L_0x0054
        L_0x02a1:
            android.content.Intent r0 = r15.getIntent()
            java.lang.String r4 = "show_registration_first_dlg"
            boolean r2 = r0.getBooleanExtra(r4, r2)
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.EULA"
            r3.setClassName(r1, r0)
            r3.putExtra(r4, r2)
            goto L_0x0054
        L_0x02be:
            X.1CM r1 = r15.A07
            r0 = 0
            int r1 = r1.A00(r0)
            r0 = 2
            if (r1 != r0) goto L_0x02e5
            java.lang.String r0 = "main/me/regname"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AnonymousClass1FB.A0N(r15)
            android.content.Intent r1 = X.AnonymousClass1LU.A03(r15)
            boolean r0 = r15.A0M
            if (r0 == 0) goto L_0x02e1
            boolean r0 = r15.isFinishing()
            if (r0 != 0) goto L_0x02e1
            r15.startActivity(r1)
        L_0x02e1:
            r15.finish()
            return
        L_0x02e5:
            r2 = 3
            X.1CM r1 = r15.A07
            r0 = 0
            int r0 = r1.A00(r0)
            if (r0 == r2) goto L_0x02fb
            X.00H r0 = r15.A0G
            java.lang.Object r1 = r0.get()
            X.1jT r1 = (X.C33841jT) r1
            r0 = 1
            X.C33841jT.A03(r1, r2, r0)
        L_0x02fb:
            java.lang.String r0 = "main/verified/setregverified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.10I r2 = r15.A05
            r1 = 22
            X.3Bt r0 = new X.3Bt
            r0.<init>(r15, r1)
            r2.CGN(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Main.A4c():void");
    }

    public void onStart() {
        super.onStart();
        this.A0M = true;
    }

    private Intent A03(int i) {
        int i2;
        if (i == 13) {
            i2 = 1;
        } else if (i == 9) {
            i2 = 3;
        } else if (i == 24) {
            i2 = 4;
        } else {
            i2 = 0;
            if (i == 38) {
                i2 = 5;
            }
        }
        boolean A0O2 = AnonymousClass1FB.A0O(this);
        Intent className = C17880vN.A0A().setClassName(getPackageName(), "com.whatsapp.registration.verifyphone.VerifyPhoneNumber");
        className.putExtra("changenumber", A0O2);
        className.putExtra("use_sms_retriever", false);
        className.putExtra("wa_old_eligible", 0);
        className.putExtra("code_verification_mode", i2);
        className.putExtra("EXTRA_IS_APP_RESTARTED", true);
        return className;
    }

    public static void A0Q(Main main) {
        C49152Pj r0 = main.A0N;
        if (r0 == null || r0.A09() != 1) {
            C49152Pj r2 = new C49152Pj(main);
            main.A0N = r2;
            main.A05.CGM(r2, new Void[0]);
            return;
        }
        Log.i("main/show dialog sync");
        if (main.A0M) {
            AnonymousClass4Yv.A01(main, 104);
        }
    }

    public static void A0c(Main main, Me me) {
        if (me != null) {
            AnonymousClass1Cd r0 = main.A04;
            r0.A06();
            if (!r0.A08) {
                if (C166678dR.A2B(main).BEi()) {
                    int A0E2 = C33621j7.A00((C33621j7) main.A0C.get()).A09.A0E();
                    C17900vP.A0j("main/create/backupfilesfound ", AnonymousClass000.A10(), A0E2);
                    if (A0E2 > 0) {
                        AnonymousClass4Yv.A01(main, 105);
                        return;
                    } else {
                        main.A4e(false);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        main.A0M = true;
        main.A4c();
    }

    public void A2y() {
        if (!this.A0O) {
            this.A0O = true;
            AnonymousClass1K1 r1 = (AnonymousClass1K1) ((C006602x) generatedComponent());
            this.A01 = AnonymousClass1K1.A1X(r1);
            AnonymousClass10E r12 = r1.AAQ;
            this.A05 = AnonymousClass10E.AL1(r12);
            this.A09 = AnonymousClass10E.A6O(r12);
            AnonymousClass1FB.A0M(r12, this);
            AnonymousClass10G r2 = r12.A00;
            this.A0F = (AnonymousClass1L1) r2.A45.get();
            this.A07 = (AnonymousClass11E) r12.A2X.get();
            this.A0B = (AnonymousClass11O) r12.ABn.get();
            this.A0C = (AnonymousClass1L2) r2.A40.get();
            this.A0G = C000200d.A00(r2.A5A);
            this.A05 = AnonymousClass10E.A6O(r12);
            this.A09 = (AnonymousClass1L4) r2.A2e.get();
            this.A02 = AnonymousClass10E.A17(r12);
            this.A04 = (AnonymousClass1L7) r12.A3t.get();
            this.A0C = C000200d.A00(r12.AAV);
            this.A01 = (AnonymousClass1L9) r12.A0E.get();
            this.A03 = (AnonymousClass1LC) r2.A5B.get();
            this.A0A = C000200d.A00(r12.A0J);
            this.A0B = C000200d.A00(r2.A3J);
            this.A08 = (AnonymousClass1LD) r12.A9j.get();
            this.A07 = (AnonymousClass1CM) r12.A9V.get();
            this.A06 = AnonymousClass10E.A7j(r12);
            this.A01 = (AnonymousClass1LU) r12.ABd.get();
            this.A00 = AnonymousClass10G.A51(r2);
            this.A06 = (AnonymousClass1LU) r12.ABd.get();
            this.A0I = C000200d.A00(r12.AB7);
            this.A0K = C000200d.A00(r12.ABu);
            this.A0L = C000200d.A00(r12.AC2);
            this.A0C = C000200d.A00(r12.A0g);
            this.A07 = (WhatsAppLibLoader) r12.ABy.get();
            this.A0E = C000200d.A00(r12.A4U);
            this.A08 = C000200d.A00(r12.A01);
            this.A09 = C000200d.A00(r12.A02);
            this.A0A = C000200d.A00(r12.A08);
            this.A04 = (AnonymousClass1Cd) r12.A6i.get();
            this.A0F = C000200d.A00(r12.A4h);
            this.A03 = (AnonymousClass1VJ) r12.A2W.get();
            this.A01 = C19890zB.A00;
            this.A0J = C000200d.A00(r12.ABm);
            this.A0D = C000200d.A00(r12.A1z);
            this.A0G = C000200d.A00(r12.A9T);
            this.A05 = (AnonymousClass127) r12.A4v.get();
            this.A0B = C000200d.A00(r12.A0B);
            this.A0H = C000200d.A00(r12.A9s);
        }
    }

    public C18150vq A4b() {
        AnonymousClass00H r2 = this.A0G;
        r2.getClass();
        return C18150vq.A01(new C147087Rt(r2, 0));
    }

    public void onCreate(Bundle bundle) {
        Intent A0A2;
        Intent A0A3;
        Intent intent;
        String str;
        String stringExtra;
        Method method = AnonymousClass1CH.A03;
        Trace.beginSection("Main/onCreate");
        this.A06 = false;
        this.A07 = false;
        try {
            this.A02.A0A("Main");
            this.A02.A09("main_onCreate");
            super.onCreate(bundle);
            setTitle(2131899099);
            if (!this.A07.A04()) {
                Log.i("aborting due to native libraries missing");
                A0A2 = C17880vN.A0A();
                A0A2.setClassName(getPackageName(), "com.whatsapp.corruptinstallation.CorruptInstallationActivity");
            } else {
                if (C28361a1.A00()) {
                    Log.w("main/device-not-supported");
                    setTheme(2132083991);
                    CMl(new DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment());
                } else {
                    AnonymousClass1VJ r10 = this.A03;
                    Context context = r10.A02.A00;
                    PackageManager packageManager = context.getPackageManager();
                    ComponentName componentName = r10.A00;
                    if (componentName == null) {
                        componentName = new ComponentName(context, CompanionStateHolder$CompanionLogoutStateReceiver.class);
                        r10.A00 = componentName;
                    }
                    if (packageManager.getComponentEnabledSetting(componentName) == 1) {
                        A0A2 = C17880vN.A0A();
                        A0A2.setClassName(getPackageName(), "com.whatsapp.companionmode.registration.CompanionPostLogoutActivity");
                    } else {
                        if (getIntent().getBooleanExtra("extra_onboarding_incomplete_notification_clicked", false)) {
                            ((A8V) this.A0E.get()).A0E("onboarding_incomplete_notification_clicked", "onboarding_incomplete_notification_step");
                        }
                        if (getIntent().getBooleanExtra("extra_reg_retry_verification_notification_clicked", false)) {
                            ((A8V) this.A0E.get()).A0E("reg_retry_verification_notification_clicked", "reg_retry_notification_step");
                        }
                        if (getIntent().getBooleanExtra("extra_enter_phone_number_notification_clicked", false)) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("enter_phone_number_notification_clicked");
                            this.A09.get();
                            ((A8V) this.A0E.get()).A0E(AnonymousClass000.A0y(C49332Qb.A02.A00((C139576z4) this.A08.get()), A10), "reg_retry_notification_step");
                        }
                        Intent intent2 = getIntent();
                        C18070vi.A0d(intent2, 0);
                        if (intent2.getBooleanExtra("is_success", false)) {
                            C29491cN A0I2 = C17880vN.A0I(this.A0A);
                            Intent intent3 = getIntent();
                            C18070vi.A0d(intent3, 0);
                            Log.i("AccountSwitcher/processIntentAfterAccountSwitching/switch successful");
                            if (intent3.hasExtra("request_type")) {
                                boolean z = false;
                                int intExtra = intent3.getIntExtra("request_type", 0);
                                if (intExtra == 1 || intExtra == 2 || intExtra == 4) {
                                    z = true;
                                }
                                C17900vP.A0n("AccountSwitcher/processIntentAfterAccountSwitching/shouldShowAccountSwitchingToast: ", AnonymousClass000.A10(), z);
                                C19830z4 r12 = A0I2.A0A;
                                C17880vN.A1F(C19830z4.A00(r12), "show_account_switching_toast", z);
                                if (1 == intent3.getIntExtra("request_type", 0)) {
                                    C17880vN.A1C(C19830z4.A00(r12), "add_account_source", intent3.getIntExtra("source", 0));
                                }
                            }
                            int intExtra2 = intent3.getIntExtra("request_type", 0);
                            if (intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 3 || intExtra2 == 4) {
                                Long valueOf = Long.valueOf(AnonymousClass11P.A01(A0I2.A09));
                                A0I2.A00 = valueOf;
                                C17900vP.A0Y(valueOf, "AccountSwitcher/processIntentAfterAccountSwitching/lastSwitchedTsMs=", AnonymousClass000.A10());
                            }
                            if (intent3.hasExtra("number_of_accounts")) {
                                int intExtra3 = intent3.getIntExtra("number_of_accounts", 0);
                                C17900vP.A0j("AccountSwitcher/processIntentAfterAccountSwitching/ACTIVITY_EXTRA_NUMBER_OF_ACCOUNTS: ", AnonymousClass000.A10(), intExtra3);
                                A0I2.A0A.A1H(intExtra3);
                                int i = intExtra3 + 1;
                                AnonymousClass188 r6 = ((C23641Hb) A0I2.A0H.get()).A08;
                                Long A0n = C17880vN.A0n(i);
                                C18070vi.A0d(r6, 0);
                                r6.CHx(A0n, 15265, 0);
                                r6.CHx(A0n, 15265, 1);
                            }
                            if (intent3.hasExtra("account_language") && (stringExtra = intent3.getStringExtra("account_language")) != null) {
                                C17900vP.A0f("AccountSwitcher/processIntentAfterAccountSwitching/ACTIVITY_EXTRA_ACCOUNT_LANGUAGE: ", stringExtra, AnonymousClass000.A10());
                                C17880vN.A1E(A0I2.A0B.A00.edit(), "forced_language", stringExtra);
                                A0I2.A0C.A0Q(stringExtra);
                            }
                            C62562rb A032 = A0I2.A03();
                            if (C18020vd.A05(C18040vf.A02, A0I2.A0D, 8680) && A032 != null) {
                                A0I2.A0E.CGF(new C70613Bu(A0I2, 23));
                            }
                        }
                        Intent intent4 = getIntent();
                        C18070vi.A0d(intent4, 0);
                        if (intent4.getIntExtra("request_type", 0) == 3 && intent4.getBooleanExtra("abandon_add_account_from_back_press", false)) {
                            C29491cN A0I3 = C17880vN.A0I(this.A0A);
                            C19830z4 r11 = A0I3.A0A;
                            boolean A18 = C18070vi.A18(C17880vN.A0r(C17890vO.A0B(r11), "abandon_add_account_landing_screen"), "settings_account");
                            AnonymousClass1L9 r62 = A0I3.A04;
                            if (A18) {
                                boolean A0G2 = A0I3.A0G();
                                intent = C17880vN.A0A();
                                intent.setClassName(getPackageName(), "com.whatsapp.settings.SettingsAccount");
                                if (A0G2) {
                                    str = "account_switcher_add_account";
                                } else {
                                    str = "account_switcher";
                                }
                                intent.putExtra(str, true);
                                intent.putExtra("source", 15);
                            } else {
                                intent = AnonymousClass1LU.A0I(this, 1, A0I3.A0G());
                            }
                            r62.A08(this, intent);
                            C17880vN.A1E(C19830z4.A00(r11), "abandon_add_account_landing_screen", (String) null);
                            ((AnonymousClass739) this.A0B.get()).A03(getIntent());
                            finish();
                        }
                        int A002 = this.A07.A00(false);
                        AnonymousClass11S r0 = this.A02;
                        r0.A0I();
                        Me me = r0.A00;
                        if (me == null) {
                            AnonymousClass00H r02 = this.A08;
                            if (!(r02 == null || r02.get() == null || !((C139576z4) this.A08.get()).A02(11905))) {
                                C22891Dp.A02 = true;
                            }
                            if (A002 == 0) {
                                C29491cN A0I4 = C17880vN.A0I(this.A0A);
                                Intent intent5 = getIntent();
                                C18070vi.A0d(intent5, 0);
                                Log.i("AccountSwitcher/processNewUserIntentAfterAccountSwitching");
                                String stringExtra2 = intent5.getStringExtra("device_id");
                                if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                                    Log.i("AccountSwitcher/processNewUserIntentAfterAccountSwitching/init device id");
                                    C19830z4 r112 = A0I4.A0A;
                                    if (C17890vO.A0B(r112).getString("perf_device_id", (String) null) == null) {
                                        C17880vN.A1E(C19830z4.A00(r112), "perf_device_id", stringExtra2);
                                    }
                                }
                                String stringExtra3 = intent5.getStringExtra("phone_id");
                                long longExtra = intent5.getLongExtra("phone_id_timestamp", 0);
                                if (!(stringExtra3 == null || stringExtra3.length() == 0 || longExtra <= A0I4.A0A.A0W("phoneid_timestamp"))) {
                                    Log.i("AccountSwitcher/processNewUserIntentAfterAccountSwitching/init phone id");
                                    ((C31391fU) A0I4.A0J.get()).CJu(new C57082iV(stringExtra3, longExtra));
                                }
                                boolean booleanExtra = intent5.getBooleanExtra("should_open_link_companion", false);
                                if (booleanExtra) {
                                    C17880vN.A1F(C19830z4.A00(A0I4.A0A), "account_switching_open_link_companion", true);
                                }
                                String stringExtra4 = intent5.getStringExtra("multi_account_priming_token");
                                if (!(stringExtra4 == null || stringExtra4.length() == 0)) {
                                    Log.i("AccountSwitcher/processNewUserIntentAfterAccountSwitching/init multi account priming token");
                                    C17880vN.A1E(C19830z4.A00(A0I4.A0A), "pref_multi_account_priming_token", stringExtra4);
                                }
                                C17900vP.A0n("AccountSwitcher/processNewUserIntentAfterAccountSwitching/isOpenLinkCompanionFlow=", AnonymousClass000.A10(), booleanExtra);
                                if (!isFinishing()) {
                                    if (!C17880vN.A0I(this.A0A).A0J(AnonymousClass1FB.A0O(this)) || !C17890vO.A0B(this.A0A).getBoolean("account_switching_open_link_companion", false)) {
                                        boolean booleanExtra2 = getIntent().getBooleanExtra("show_registration_first_dlg", false);
                                        A0A3 = C17880vN.A0A();
                                        A0A3.setClassName(getPackageName(), "com.whatsapp.registration.EULA");
                                        A0A3.putExtra("show_registration_first_dlg", booleanExtra2);
                                    } else {
                                        A0A3 = C17880vN.A0A();
                                        A0A3.setClassName(getPackageName(), "com.whatsapp.companionmode.registration.RegisterAsCompanionActivity");
                                        A0A3.putExtra("entry_point", "entry_account_switching");
                                    }
                                    startActivity(A0A3);
                                    finishAffinity();
                                }
                            }
                        }
                        if (A002 != 6) {
                            if (!this.A04.A08) {
                                Log.i("main/create/message-store-not-ready");
                                View findViewById = findViewById(16908290);
                                if (findViewById == null) {
                                    Log.i("Main/keepSplashscreen/no content view found");
                                } else {
                                    C90604eL r1 = new C90604eL(1);
                                    findViewById.getViewTreeObserver().addOnPreDrawListener(r1);
                                    this.A05.CGN(new C21368Aix(this, r1, findViewById, me, 15));
                                }
                            }
                            A0c(this, me);
                        } else if (!isFinishing()) {
                            A0A2 = C17880vN.A0A();
                            A0A2.setClassName(getPackageName(), "com.whatsapp.account.delete.DeleteAccountConfirmation");
                        }
                    }
                }
            }
            startActivity(A0A2);
            finish();
        } finally {
            this.A02.A0B("Main", "onCreate", "_end");
            this.A02.A08("main_onCreate");
            Trace.endSection();
        }
    }

    public Main(int i) {
        this.A0O = false;
        A2L(new AnonymousClass79Z(this, 4));
    }

    public static void A0V(Main main) {
        if (!main.isFinishing()) {
            Intent intent = main.getIntent();
            if (intent != null && !C17890vO.A1S(intent, "android.intent.action.MAIN") && (intent.getFlags() & 67108864) != 0 && C17890vO.A0B(main.A0A).getInt("shortcut_version", 0) == 0) {
                Log.i("main/recreate_shortcut");
                String string = main.getString(2131898700);
                Intent A0A2 = AnonymousClass1LU.A0A(main);
                A0A2.addFlags(268435456);
                A0A2.addFlags(67108864);
                Intent A0A3 = C17880vN.A0A();
                try {
                    A0A3.putExtra("android.intent.extra.shortcut.INTENT", Intent.parseUri(A0A2.toUri(0), 0));
                } catch (URISyntaxException e) {
                    Log.e(C17900vP.A0C("RegisterName/remove-shortcut cannot parse shortcut uri ", AnonymousClass000.A10(), e), e);
                }
                A0A3.putExtra("android.intent.extra.shortcut.NAME", string);
                A0A3.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
                main.sendBroadcast(A0A3);
                C50152Ti.A00(main, main.getString(2131898700));
                C17900vP.A0M(main.A0A, "shortcut_version", 1);
            }
            Intent intent2 = main.getIntent();
            C18070vi.A0d(intent2, 0);
            boolean z = false;
            int intExtra = intent2.getIntExtra("request_type", 0);
            if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4) {
                z = true;
                main.A05.CGF(new C70603Bt(main, 24));
                ((C28721an) main.A0L.get()).A01();
                ((AnonymousClass739) main.A0B.get()).A03(main.getIntent());
            }
            if (main.A0M && !main.isFinishing()) {
                Intent A022 = AnonymousClass1LU.A02(main);
                A022.putExtra("show_payment_account_recovery", main.getIntent().getBooleanExtra("show_payment_account_recovery", false));
                if (z) {
                    Intent intent3 = main.getIntent();
                    C18070vi.A0d(intent3, 0);
                    if (intent3.getBooleanExtra("is_success", false)) {
                        main.A0A.get();
                        Intent intent4 = main.getIntent();
                        C18070vi.A0d(intent4, 0);
                        AnonymousClass1BI A023 = AnonymousClass1BI.A00.A02(intent4.getStringExtra("account_switching_sender_jid"));
                        main.A0A.get();
                        Intent intent5 = main.getIntent();
                        C18070vi.A0d(intent5, 0);
                        if (intent5.getBooleanExtra("is_missed_call_notification", false)) {
                            A022 = AnonymousClass1LU.A02(main).setAction(C28901bF.A01);
                        } else if (A023 != null) {
                            A022 = main.A06.A1w(main, A023, 0);
                        }
                    }
                }
                main.startActivity(A022);
                main.overridePendingTransition(0, 0);
            }
            main.finish();
        }
    }

    public Dialog onCreateDialog(int i) {
        setTheme(2132083991);
        if (i != 0) {
            return super.onCreateDialog(i);
        }
        Log.i("main/dialog/upgrade");
        this.A02.A07("upgrade");
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0E(2131897389);
        A002.A0D(2131897388);
        A002.A0T(false);
        A002.A0Z(new AnonymousClass757(this, 0), 2131898593);
        A002.A0X(new AnonymousClass757(this, 1), 2131891595);
        return A002.create();
    }

    public void onResume() {
        super.onResume();
    }

    public void onStop() {
        super.onStop();
        this.A0M = false;
    }

    public Main() {
        this(0);
    }
}
