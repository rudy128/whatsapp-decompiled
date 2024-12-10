package X;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.whatsapp.push.RegistrationIntentService;
import java.util.concurrent.CountDownLatch;

public class AJE implements OnCompleteListener {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ RegistrationIntentService A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ CountDownLatch A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public AJE(Intent intent, RegistrationIntentService registrationIntentService, String str, CountDownLatch countDownLatch, boolean z, boolean z2, boolean z3) {
        this.A01 = registrationIntentService;
        this.A00 = intent;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = z3;
        this.A02 = str;
        this.A03 = countDownLatch;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r14 = X.C108945cZ.A1I();
        X.C18070vi.A0b(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x025a, code lost:
        r5 = X.C19620yd.A0C;
        r20 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0264, code lost:
        if (r20.hasNext() == false) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0266, code lost:
        r3 = (X.C194379rd) r20.next();
        r0 = r3.A01.getRawString();
        X.C18070vi.A0b(r5);
        r14.update(X.C18070vi.A1A(r0, r5));
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x027e, code lost:
        if (r0 != null) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0280, code lost:
        r1 = r3.A02.longValue();
        r18 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x028a, code lost:
        if (r1 == -1) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x028c, code lost:
        r18 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0292, code lost:
        r0 = java.lang.Long.valueOf(r18);
        r3.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0298, code lost:
        r14.update(X.C18070vi.A1A(java.lang.String.valueOf(r0.longValue()), r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02a8, code lost:
        r0 = new byte[6];
        java.lang.System.arraycopy(r14.digest(), 0, r0, 0, 6);
        r0 = X.C108955ca.A14(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02b6, code lost:
        if (r0 == null) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02be, code lost:
        if ((!r0.equalsIgnoreCase(r15)) == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        r18 = android.text.TextUtils.isEmpty(r6);
        r0 = X.AnonymousClass000.A1S(242478021, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02fe, code lost:
        throw X.AnonymousClass8BR.A0v(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        if (r19 != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x031a, code lost:
        if (r3.equals(r0) == false) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x031c, code lost:
        r9 = java.lang.Math.min(r7.getLongExtra("delay_ms", 15000), 86400000);
        r7.putExtra("delay_ms", 2 * r9);
        r3 = ((X.AnonymousClass11C) r8.A0A.get()).A05();
        r2 = X.C1408573i.A03(r8, r7, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        if (r18 != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0341, code lost:
        if (r3 == null) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0343, code lost:
        r3.cancel(r2);
        r3.set(3, android.os.SystemClock.elapsedRealtime() + r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0356, code lost:
        if (r3.equals(r0) == false) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0358, code lost:
        r0 = X.C17900vP.A0C("GCM: attempted to register for GCM but registration count was exceeded already; exceptionMessage=", X.AnonymousClass000.A10(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0365, code lost:
        r0 = r3.equals(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x036e, code lost:
        if (r0 == false) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (r15 != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0370, code lost:
        r2 = X.C41371wF.A00(r8);
        r1 = X.AnonymousClass000.A10();
        r1.append("GCM: attempted to register for GCM but received undocumented error; exceptionMessage=");
        X.AnonymousClass8BS.A1I(r1, r9);
        X.C17900vP.A0i("; playServicesAvailable=", r1, r2);
        X.C17880vN.A0K(r8.A0B).A0x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0392, code lost:
        if ("FIS_AUTH_ERROR".equals(r3) == false) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0394, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("GPlayService:");
        r1.append(r2);
        r8.A00.A0G("gcm-fis-auth-error", X.AnonymousClass000.A0y(";", r1), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03b9, code lost:
        com.whatsapp.util.Log.e(r0);
        X.C17880vN.A0K(r8.A0B).A0x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03c7, code lost:
        com.whatsapp.util.Log.w("RegistrationIntentService/onHandleWork AlarmManager is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ce, code lost:
        r8.A00.A0G(X.AnonymousClass001.A1H("gcm-", r3, X.AnonymousClass000.A10()), (java.lang.String) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (r0 != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03f8, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r1 == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("GCM: token retrieved successfully; token=");
        r1.append(r10.length());
        X.C17900vP.A0j(" bytes; applicationVersion=", r1, 242478021);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        if (r18 == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        com.whatsapp.util.Log.i("GCM: no previously saved token");
        X.C17880vN.A1C(X.C19830z4.A00(X.C17880vN.A0K(r13.A0B)), "logins_with_messages", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        r5 = !android.text.TextUtils.equals(r10, r6);
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
        if (r15 != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (r5 != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        if (r14 != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a2, code lost:
        X.C17880vN.A1C(X.C19830z4.A00(X.C17880vN.A0K(r13.A0B)).putString("c2dm_reg_id", r10), "c2dm_app_vers", 242478021);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b5, code lost:
        if (r8 != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b7, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        if (android.text.TextUtils.equals(r10, r3) != false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00be, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bf, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config due to new token");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        if (r15 == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
        if (r19 == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c8, code lost:
        if (r5 != false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
        if (X.C17900vP.A02(r13.A0B).getBoolean("saved_gcm_token_server_unreg", false) != false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
        com.whatsapp.util.Log.i("GCM: verifying tokenUnregisteredOnServer fetched saved token");
        r13.A00.A0G("gcm-retrieved-saved-token", (java.lang.String) null, false);
        X.C17880vN.A1F(X.C19830z4.A00(X.C17880vN.A0K(r13.A0B)), "saved_gcm_token_server_unreg", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f1, code lost:
        if (r8 != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f4, code lost:
        r1 = ((X.C57332iu) r13.A06.get()).A00;
        r7 = X.C18040vf.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0106, code lost:
        if (X.C18020vd.A05(r7, r1, 283) != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010e, code lost:
        if (X.C18020vd.A05(r7, r1, 2792) != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0110, code lost:
        r21 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0112, code lost:
        r1 = r12.getIntExtra("numberOfAccountsFromServer", 1);
        r2 = X.C17880vN.A0I(((X.C183799Zq) r13.A03.get()).A00).A0A.A0E() + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012e, code lost:
        if (r1 == r2) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0130, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013f, code lost:
        if (X.C18020vd.A00(r7, r13.A02, 4116) == r12.getIntExtra("voipPayloadType", 0)) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0141, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config due to calling push payload version");
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0147, code lost:
        r1 = ((X.A1D) r13.A07.get()).A02();
        r0 = r13.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0155, code lost:
        if (r1 == false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0157, code lost:
        r1 = ((X.A1D) r0.get()).A01(r12.getStringExtra("pKeyHash"), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0167, code lost:
        if (r8 != false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016f, code lost:
        if (X.AnonymousClass000.A1Y(r1.first) == false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0171, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config due to pKey rotation");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003e, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0176, code lost:
        r6 = (java.lang.String) r1.second;
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017b, code lost:
        if (r8 == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0189, code lost:
        if (((X.AnonymousClass1CM) r13.A09.get()).A04() != false) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0198, code lost:
        if (((X.AnonymousClass1CM) r13.A09.get()).A00(false) == 2) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a9, code lost:
        if (((X.C51792Zq) r13.A04.get()).A00.A00() < 7) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ab, code lost:
        ((X.C191159m7) r13.A08.get()).A00(r21, (X.C22523BBg) null, java.lang.Integer.valueOf(r2), r10, "gcm", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c6, code lost:
        r9 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c8, code lost:
        X.C17880vN.A1B(X.AnonymousClass8BV.A06(((X.A1D) r0.get()).A02.A00).remove("push:push_pkey_data"), "push:push_pkey_generate_ts");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e2, code lost:
        r21 = ((X.C57332iu) r13.A06.get()).A00();
        r0 = r21;
        r2 = r0.A01;
        r5 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01f4, code lost:
        if (r8 != false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f6, code lost:
        r15 = r12.getStringExtra("mutedChatsHash");
        r3 = r12.getStringExtra("appMuteConfig");
        r0 = (X.C57332iu) r13.A06.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x020a, code lost:
        if (r15 == null) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x020c, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0211, code lost:
        if (r15.length() != 0) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0213, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0214, code lost:
        r18 = !r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0216, code lost:
        if (r2 == null) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0042, code lost:
        if (r14 != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0218, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x021d, code lost:
        if (X.AnonymousClass000.A1a(r2) != false) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x021f, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0220, code lost:
        if (r18 != false) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0222, code lost:
        if (r14 == false) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0224, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config due to new muted chats");
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0234, code lost:
        if (X.C18020vd.A05(r7, r0.A00, 2792) == false) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0236, code lost:
        if (r5 != 0) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0238, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x023d, code lost:
        if (X.C42171xk.A00(r0, r3) != false) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0240, code lost:
        r0 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0245, code lost:
        if (r3 == null) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x024b, code lost:
        if (r3.length() != 0) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x024d, code lost:
        if (r18 == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x024f, code lost:
        if (r14 == false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0251, code lost:
        if (r2 == null) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        if (android.text.TextUtils.equals(r3, r6) == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onComplete(com.google.android.gms.tasks.Task r28) {
        /*
            r27 = this;
            long r16 = android.os.Binder.clearCallingIdentity()
            boolean r0 = r28.isSuccessful()
            r4 = r27
            if (r0 == 0) goto L_0x02c2
            java.lang.Object r10 = r28.getResult()
            java.lang.String r10 = (java.lang.String) r10
            com.whatsapp.push.RegistrationIntentService r13 = r4.A01
            android.content.Intent r12 = r4.A00
            boolean r14 = r4.A06
            boolean r8 = r4.A05
            boolean r1 = r4.A04
            java.lang.String r6 = r4.A02
            X.00H r0 = r13.A0B
            android.content.SharedPreferences r0 = X.C17900vP.A02(r0)
            java.lang.String r7 = "c2dm_app_vers"
            r5 = 0
            int r0 = r0.getInt(r7, r5)
            java.lang.String r2 = "registrationId"
            java.lang.String r3 = r12.getStringExtra(r2)
            r2 = 242478021(0xe73ebc5, float:3.0065581E-30)
            r11 = 0
            r9 = 1
            if (r14 == 0) goto L_0x0040
            boolean r15 = android.text.TextUtils.isEmpty(r3)
            r19 = 1
            if (r15 != 0) goto L_0x0044
        L_0x0040:
            r19 = 0
            if (r14 == 0) goto L_0x004b
        L_0x0044:
            boolean r18 = android.text.TextUtils.equals(r3, r6)
            r15 = 1
            if (r18 == 0) goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            boolean r18 = android.text.TextUtils.isEmpty(r6)
            boolean r0 = X.AnonymousClass000.A1S(r2, r0)
            if (r19 != 0) goto L_0x005f
            if (r18 != 0) goto L_0x005f
            if (r15 != 0) goto L_0x005f
            if (r0 != 0) goto L_0x005f
            r15 = 0
            if (r1 == 0) goto L_0x0060
        L_0x005f:
            r15 = 1
        L_0x0060:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GCM: token retrieved successfully; token="
            r1.append(r0)
            int r0 = r10.length()
            r1.append(r0)
            java.lang.String r0 = " bytes; applicationVersion="
            X.C17900vP.A0j(r0, r1, r2)
            if (r18 == 0) goto L_0x008b
            java.lang.String r0 = "GCM: no previously saved token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r13.A0B
            X.0z4 r0 = X.C17880vN.A0K(r0)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "logins_with_messages"
            X.C17880vN.A1C(r1, r0, r5)
        L_0x008b:
            boolean r0 = android.text.TextUtils.equals(r10, r6)
            r5 = r0 ^ 1
            r6 = 0
            if (r15 != 0) goto L_0x00a2
            if (r5 != 0) goto L_0x00a2
            r8 = 0
        L_0x0097:
            if (r14 != 0) goto L_0x00f4
        L_0x0099:
            java.util.concurrent.CountDownLatch r0 = r4.A03
            r0.countDown()
            android.os.Binder.restoreCallingIdentity(r16)
            return
        L_0x00a2:
            X.00H r0 = r13.A0B
            X.0z4 r0 = X.C17880vN.A0K(r0)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "c2dm_reg_id"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r10)
            X.C17880vN.A1C(r0, r7, r2)
            if (r8 != 0) goto L_0x00be
            boolean r0 = android.text.TextUtils.equals(r10, r3)
            r8 = 0
            if (r0 != 0) goto L_0x00bf
        L_0x00be:
            r8 = 1
        L_0x00bf:
            java.lang.String r0 = "GCM: sending client config due to new token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r15 == 0) goto L_0x00f1
            if (r19 == 0) goto L_0x00f1
            if (r5 != 0) goto L_0x00f1
            X.00H r0 = r13.A0B
            android.content.SharedPreferences r0 = X.C17900vP.A02(r0)
            java.lang.String r1 = "saved_gcm_token_server_unreg"
            boolean r0 = r0.getBoolean(r1, r11)
            if (r0 != 0) goto L_0x00f1
            java.lang.String r0 = "GCM: verifying tokenUnregisteredOnServer fetched saved token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.190 r2 = r13.A00
            java.lang.String r0 = "gcm-retrieved-saved-token"
            r2.A0G(r0, r6, r11)
            X.00H r0 = r13.A0B
            X.0z4 r0 = X.C17880vN.A0K(r0)
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r0)
            X.C17880vN.A1F(r0, r1, r9)
        L_0x00f1:
            if (r8 != 0) goto L_0x00f4
            goto L_0x0097
        L_0x00f4:
            X.00H r0 = r13.A06
            java.lang.Object r0 = r0.get()
            X.2iu r0 = (X.C57332iu) r0
            X.0ve r1 = r0.A00
            r0 = 283(0x11b, float:3.97E-43)
            X.0vf r7 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r7, r1, r0)
            if (r0 != 0) goto L_0x01e2
            r0 = 2792(0xae8, float:3.912E-42)
            boolean r0 = X.C18020vd.A05(r7, r1, r0)
            if (r0 != 0) goto L_0x01e2
            r21 = r6
        L_0x0112:
            java.lang.String r0 = "numberOfAccountsFromServer"
            int r1 = r12.getIntExtra(r0, r9)
            X.00H r0 = r13.A03
            java.lang.Object r0 = r0.get()
            X.9Zq r0 = (X.C183799Zq) r0
            X.00H r0 = r0.A00
            X.1cN r0 = X.C17880vN.A0I(r0)
            X.0z4 r0 = r0.A0A
            int r0 = r0.A0E()
            int r2 = r0 + 1
            if (r1 == r2) goto L_0x0131
            r8 = 1
        L_0x0131:
            java.lang.String r0 = "voipPayloadType"
            int r3 = r12.getIntExtra(r0, r11)
            X.0ve r1 = r13.A02
            r0 = 4116(0x1014, float:5.768E-42)
            int r0 = X.C18020vd.A00(r7, r1, r0)
            if (r0 == r3) goto L_0x0147
            java.lang.String r0 = "GCM: sending client config due to calling push payload version"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8 = 1
        L_0x0147:
            X.00H r0 = r13.A07
            java.lang.Object r0 = r0.get()
            X.A1D r0 = (X.A1D) r0
            boolean r1 = r0.A02()
            X.00H r0 = r13.A07
            if (r1 == 0) goto L_0x01c8
            java.lang.Object r1 = r0.get()
            X.A1D r1 = (X.A1D) r1
            java.lang.String r0 = "pKeyHash"
            java.lang.String r0 = r12.getStringExtra(r0)
            android.util.Pair r1 = r1.A01(r0, r8)
            if (r8 != 0) goto L_0x01c6
            java.lang.Object r0 = r1.first
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = "GCM: sending client config due to pKey rotation"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0176:
            java.lang.Object r6 = r1.second
            java.lang.String r6 = (java.lang.String) r6
            r8 = r9
        L_0x017b:
            if (r8 == 0) goto L_0x0099
            X.00H r0 = r13.A09
            java.lang.Object r0 = r0.get()
            X.1CM r0 = (X.AnonymousClass1CM) r0
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x01ab
            X.00H r0 = r13.A09
            java.lang.Object r0 = r0.get()
            X.1CM r0 = (X.AnonymousClass1CM) r0
            int r1 = r0.A00(r11)
            r0 = 2
            if (r1 == r0) goto L_0x01ab
            X.00H r0 = r13.A04
            java.lang.Object r0 = r0.get()
            X.2Zq r0 = (X.C51792Zq) r0
            X.1Dn r0 = r0.A00
            int r1 = r0.A00()
            r0 = 7
            if (r1 < r0) goto L_0x0099
        L_0x01ab:
            X.00H r0 = r13.A08
            java.lang.Object r0 = r0.get()
            X.9m7 r0 = (X.C191159m7) r0
            java.lang.String r25 = "gcm"
            java.lang.Integer r23 = java.lang.Integer.valueOf(r2)
            r22 = 0
            r20 = r0
            r24 = r10
            r26 = r6
            r20.A00(r21, r22, r23, r24, r25, r26)
            goto L_0x0099
        L_0x01c6:
            r9 = r8
            goto L_0x0176
        L_0x01c8:
            java.lang.Object r0 = r0.get()
            X.A1D r0 = (X.A1D) r0
            X.0z4 r0 = r0.A02
            X.00H r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BV.A06(r0)
            java.lang.String r0 = "push:push_pkey_data"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "push:push_pkey_generate_ts"
            X.C17880vN.A1B(r1, r0)
            goto L_0x017b
        L_0x01e2:
            X.00H r0 = r13.A06
            java.lang.Object r0 = r0.get()
            X.2iu r0 = (X.C57332iu) r0
            X.9nz r21 = r0.A00()
            r0 = r21
            java.util.List r2 = r0.A01
            int r5 = r0.A00
            if (r8 != 0) goto L_0x0112
            java.lang.String r0 = "mutedChatsHash"
            java.lang.String r15 = r12.getStringExtra(r0)
            java.lang.String r0 = "appMuteConfig"
            java.lang.String r3 = r12.getStringExtra(r0)
            X.00H r0 = r13.A06
            java.lang.Object r0 = r0.get()
            X.2iu r0 = (X.C57332iu) r0
            if (r15 == 0) goto L_0x0213
            int r14 = r15.length()
            r1 = 0
            if (r14 != 0) goto L_0x0214
        L_0x0213:
            r1 = 1
        L_0x0214:
            r18 = r1 ^ 1
            if (r2 == 0) goto L_0x021f
            boolean r1 = X.AnonymousClass000.A1a(r2)
            r14 = 1
            if (r1 != 0) goto L_0x0220
        L_0x021f:
            r14 = 0
        L_0x0220:
            if (r18 != 0) goto L_0x022c
            if (r14 == 0) goto L_0x022c
        L_0x0224:
            java.lang.String r0 = "GCM: sending client config due to new muted chats"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8 = 1
            goto L_0x0112
        L_0x022c:
            X.0ve r1 = r0.A00
            r0 = 2792(0xae8, float:3.912E-42)
            boolean r0 = X.C18020vd.A05(r7, r1, r0)
            if (r0 == 0) goto L_0x0245
            if (r5 != 0) goto L_0x0240
            r0 = 0
        L_0x0239:
            boolean r0 = X.C42171xk.A00(r0, r3)
            if (r0 != 0) goto L_0x024d
            goto L_0x0224
        L_0x0240:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            goto L_0x0239
        L_0x0245:
            if (r3 == 0) goto L_0x024d
            int r0 = r3.length()
            if (r0 != 0) goto L_0x0224
        L_0x024d:
            if (r18 == 0) goto L_0x0112
            if (r14 == 0) goto L_0x0224
            if (r2 == 0) goto L_0x03f4
            java.security.MessageDigest r14 = X.C108945cZ.A1I()     // Catch:{ NoSuchAlgorithmException -> 0x03ed }
            X.C18070vi.A0b(r14)     // Catch:{ NoSuchAlgorithmException -> 0x03ed }
            java.nio.charset.Charset r5 = X.C19620yd.A0C
            java.util.Iterator r20 = r2.iterator()
        L_0x0260:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x02a8
            java.lang.Object r3 = r20.next()
            X.9rd r3 = (X.C194379rd) r3
            X.1BI r0 = r3.A01
            java.lang.String r0 = r0.getRawString()
            X.C18070vi.A0b(r5)
            byte[] r0 = X.C18070vi.A1A(r0, r5)
            r14.update(r0)
            java.lang.Long r0 = r3.A00
            if (r0 != 0) goto L_0x0298
            java.lang.Long r0 = r3.A02
            long r1 = r0.longValue()
            r18 = -1
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0292
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r18 = r0.toSeconds(r1)
        L_0x0292:
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            r3.A00 = r0
        L_0x0298:
            long r0 = r0.longValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            byte[] r0 = X.C18070vi.A1A(r0, r5)
            r14.update(r0)
            goto L_0x0260
        L_0x02a8:
            byte[] r2 = r14.digest()
            r1 = 6
            byte[] r0 = new byte[r1]
            java.lang.System.arraycopy(r2, r11, r0, r11, r1)
            java.lang.String r0 = X.C108955ca.A14(r0)
            if (r0 == 0) goto L_0x03ed
            boolean r0 = r0.equalsIgnoreCase(r15)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0112
            goto L_0x0224
        L_0x02c2:
            java.lang.String r0 = "GCM: failed to get token"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Exception r9 = r28.getException()
            boolean r0 = r9 instanceof java.io.IOException
            if (r0 == 0) goto L_0x03e0
            com.whatsapp.push.RegistrationIntentService r8 = r4.A01
            android.content.Intent r7 = r4.A00
            java.lang.String r0 = r9.getMessage()
            if (r0 == 0) goto L_0x03f9
            r1 = r9
            r2 = r9
        L_0x02db:
            java.lang.Throwable r0 = r1.getCause()
            if (r0 == 0) goto L_0x02eb
            java.lang.Throwable r1 = r1.getCause()
            boolean r0 = r1 instanceof java.io.IOException
            if (r0 == 0) goto L_0x02db
            r2 = r1
            goto L_0x02db
        L_0x02eb:
            java.lang.String r3 = r2.getMessage()
            int r0 = r3.hashCode()
            java.lang.String r10 = "FIS_AUTH_ERROR"
            r5 = 3
            r6 = 0
            switch(r0) {
                case -1992442893: goto L_0x02ff;
                case -1800638118: goto L_0x0302;
                case -1579216525: goto L_0x0305;
                case -1515255836: goto L_0x0308;
                case -829011630: goto L_0x030b;
                case -630263762: goto L_0x030e;
                case -595928767: goto L_0x0311;
                case 370784008: goto L_0x0314;
                case 855732677: goto L_0x0350;
                case 901541140: goto L_0x0363;
                case 1669997632: goto L_0x036a;
                case 1750400351: goto L_0x03af;
                default: goto L_0x02fa;
            }
        L_0x02fa:
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r9)
            throw r0
        L_0x02ff:
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            goto L_0x0316
        L_0x0302:
            java.lang.String r0 = "QUOTA_EXCEEDED"
            goto L_0x0352
        L_0x0305:
            java.lang.String r0 = "PHONE_REGISTRATION_ERROR"
            goto L_0x0365
        L_0x0308:
            java.lang.String r0 = "AUTHENTICATION_FAILED"
            goto L_0x0365
        L_0x030b:
            java.lang.String r0 = "INVALID_PARAMETERS"
            goto L_0x0365
        L_0x030e:
            java.lang.String r0 = "INTERNAL_SERVER_ERROR"
            goto L_0x0365
        L_0x0311:
            java.lang.String r0 = "TIMEOUT"
            goto L_0x0316
        L_0x0314:
            java.lang.String r0 = "BACKOFF"
        L_0x0316:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x02fa
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r11 = "delay_ms"
            long r2 = r7.getLongExtra(r11, r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r9 = java.lang.Math.min(r2, r0)
            r0 = 2
            long r0 = r0 * r9
            r7.putExtra(r11, r0)
            X.00H r0 = r8.A0A
            java.lang.Object r0 = r0.get()
            X.11C r0 = (X.AnonymousClass11C) r0
            android.app.AlarmManager r3 = r0.A05()
            android.app.PendingIntent r2 = X.C1408573i.A03(r8, r7, r6)
            if (r3 == 0) goto L_0x03c7
            r3.cancel(r2)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 + r9
            r3.set(r5, r0, r2)
            goto L_0x0099
        L_0x0350:
            java.lang.String r0 = "TOO_MANY_REGISTRATIONS"
        L_0x0352:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x02fa
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GCM: attempted to register for GCM but registration count was exceeded already; exceptionMessage="
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r9)
            goto L_0x03b9
        L_0x0363:
            java.lang.String r0 = "ACCOUNT_MISSING"
        L_0x0365:
            boolean r0 = r3.equals(r0)
            goto L_0x036e
        L_0x036a:
            boolean r0 = r3.equals(r10)
        L_0x036e:
            if (r0 == 0) goto L_0x02fa
            int r2 = X.C41371wF.A00(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GCM: attempted to register for GCM but received undocumented error; exceptionMessage="
            r1.append(r0)
            X.AnonymousClass8BS.A1I(r1, r9)
            java.lang.String r0 = "; playServicesAvailable="
            X.C17900vP.A0i(r0, r1, r2)
            X.00H r0 = r8.A0B
            X.0z4 r0 = X.C17880vN.A0K(r0)
            r0.A0x()
            boolean r0 = r10.equals(r3)
            if (r0 == 0) goto L_0x03ce
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GPlayService:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ";"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)
            X.190 r1 = r8.A00
            java.lang.String r0 = "gcm-fis-auth-error"
            r1.A0G(r0, r2, r6)
            goto L_0x0099
        L_0x03af:
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x02fa
            java.lang.String r0 = "GCM: attempted to register for GCM but Google Play Services was missing"
        L_0x03b9:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.00H r0 = r8.A0B
            X.0z4 r0 = X.C17880vN.A0K(r0)
            r0.A0x()
            goto L_0x0099
        L_0x03c7:
            java.lang.String r0 = "RegistrationIntentService/onHandleWork AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0099
        L_0x03ce:
            X.190 r2 = r8.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "gcm-"
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r3, r1)
            r0 = 0
            r2.A0G(r1, r0, r6)
            goto L_0x0099
        L_0x03e0:
            boolean r0 = r9 instanceof java.lang.SecurityException
            if (r0 == 0) goto L_0x03fe
            com.whatsapp.push.RegistrationIntentService r0 = r4.A01
            java.lang.SecurityException r9 = (java.lang.SecurityException) r9
            com.whatsapp.push.RegistrationIntentService.A05(r0, r9)
            goto L_0x0099
        L_0x03ed:
            java.lang.String r0 = "No SHA-256 alg. available"
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)
            throw r0
        L_0x03f4:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x03f9:
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r9)
            throw r0
        L_0x03fe:
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJE.onComplete(com.google.android.gms.tasks.Task):void");
    }
}
