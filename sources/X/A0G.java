package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.security.SecureRandom;
import java.util.List;

public final class A0G {
    public static String A07 = "";
    public WhatsAppLibLoader A00;
    public AnonymousClass00H A01;
    public final C19830z4 A02;
    public final C18030ve A03;
    public final SecureRandom A04;
    public final AnonymousClass11C A05;
    public final AnonymousClass18K A06;

    private final Integer A00() {
        ActivityManager A042 = this.A05.A04();
        if (A042 == null) {
            Log.e("UnfinishedCallEventUploader/getProcessExitReason: could not get activity manager");
            return null;
        }
        List historicalProcessExitReasons = A042.getHistoricalProcessExitReasons((String) null, 0, 1);
        C18070vi.A0X(historicalProcessExitReasons);
        if (historicalProcessExitReasons.isEmpty()) {
            return null;
        }
        return Integer.valueOf(((ApplicationExitInfo) C29431cG.A0b(historicalProcessExitReasons)).getReason());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        if (r2.callTestBucket != null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r2.callTestBucket = X.C17880vN.A0r(X.C17880vN.A0B(r3), "voip_call_ab_test_bucket");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
        if (r2.callRandomId != null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        r1 = new byte[16];
        r8.A04.nextBytes(r1);
        r2.callRandomId = X.C200410p.A0J(X.B2A.A00, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        if (android.os.Build.VERSION.SDK_INT < 30) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c7, code lost:
        r0 = A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
        if (r0 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cd, code lost:
        if (r10 == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d4, code lost:
        r2.appExitReason = r0;
        r8.A06.CC6(r2, X.C18180vt.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00de, code lost:
        if (r11 == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e0, code lost:
        r0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e2, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e3, code lost:
        if (r12 == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e5, code lost:
        r0 = 6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[Catch:{ Exception -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(boolean r9, boolean r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            X.0ve r7 = r8.A03
            r0 = 6454(0x1936, float:9.044E-42)
            X.0vf r2 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r2, r7, r0)
            if (r0 <= 0) goto L_0x00f1
            r5 = 0
            if (r9 != 0) goto L_0x00f1
            X.0z4 r0 = r8.A02
            X.00H r3 = r0.A00
            android.content.SharedPreferences r4 = X.C17880vN.A0B(r3)
            java.lang.String r0 = "voip_call_id"
            java.lang.String r1 = r4.getString(r0, r5)
            java.lang.String r0 = "session_id_for_voip_call_id"
            java.lang.String r0 = r4.getString(r0, r5)
            X.0yx r4 = X.AnonymousClass8BR.A0B(r1, r0)
            java.lang.String r6 = A07
            monitor-enter(r6)
            r0 = 8147(0x1fd3, float:1.1416E-41)
            int r0 = X.C18020vd.A00(r2, r7, r0)     // Catch:{ all -> 0x00ee }
            if (r0 <= 0) goto L_0x003f
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r8.A00     // Catch:{ all -> 0x00ee }
            boolean r0 = r0.A04()     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "UnfinishedCallEventUploader/getUnfinishedCallEvent: aborting due to native libraries missing"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ee }
        L_0x003f:
            com.whatsapp.fieldstats.events.WamCall r2 = new com.whatsapp.fieldstats.events.WamCall     // Catch:{ all -> 0x00ee }
            r2.<init>()     // Catch:{ all -> 0x00ee }
        L_0x0044:
            java.lang.Object r5 = r4.A00     // Catch:{ all -> 0x00ee }
            if (r5 == 0) goto L_0x00e7
            java.lang.String r1 = X.C223919s.A00     // Catch:{ all -> 0x00ee }
            java.lang.Object r0 = r4.A01     // Catch:{ all -> 0x00ee }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x00ee }
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x00e7
            java.lang.String r0 = A07     // Catch:{ all -> 0x00ee }
            boolean r0 = X.C18070vi.A18(r0, r5)     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x00e7
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00ee }
            A07 = r5     // Catch:{ all -> 0x00ee }
            goto L_0x009b
        L_0x0061:
            X.00H r0 = r8.A01     // Catch:{ Exception -> 0x008f }
            X.17w r1 = X.AnonymousClass3MW.A0c(r0)     // Catch:{ Exception -> 0x008f }
            java.lang.Class<X.11s> r0 = X.C203311s.class
            X.11a r0 = r1.A01(r0)     // Catch:{ Exception -> 0x008f }
            X.11s r0 = (X.C203311s) r0     // Catch:{ Exception -> 0x008f }
            com.whatsapp.voipcalling.JNIUtils r0 = r0.A00     // Catch:{ Exception -> 0x008f }
            com.whatsapp.voipcalling.Voip.nativeRegisterJNIUtils(r0)     // Catch:{ Exception -> 0x008f }
            com.whatsapp.fieldstats.events.WamCall r2 = com.whatsapp.voipcalling.Voip.getUnfinishedCallEvent(r0)     // Catch:{ Exception -> 0x008f }
            if (r2 == 0) goto L_0x0089
            int r0 = r0.getArClass()     // Catch:{ Exception -> 0x008f }
            java.lang.Long r0 = X.C17880vN.A0n(r0)     // Catch:{ Exception -> 0x008f }
            r2.deviceArClass = r0     // Catch:{ Exception -> 0x008f }
            r2.callTermReason = r5     // Catch:{ Exception -> 0x008f }
            r2.callResult = r5     // Catch:{ Exception -> 0x008f }
            goto L_0x0044
        L_0x0089:
            com.whatsapp.fieldstats.events.WamCall r2 = new com.whatsapp.fieldstats.events.WamCall     // Catch:{ all -> 0x00ee }
            r2.<init>()     // Catch:{ all -> 0x00ee }
            goto L_0x0044
        L_0x008f:
            r1 = move-exception
            java.lang.String r0 = "UnfinishedCallEventUploader/getUnfinishedCallEvent: Exception occured"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00ee }
            com.whatsapp.fieldstats.events.WamCall r2 = new com.whatsapp.fieldstats.events.WamCall     // Catch:{ all -> 0x00ee }
            r2.<init>()     // Catch:{ all -> 0x00ee }
            goto L_0x0044
        L_0x009b:
            monitor-exit(r6)
            java.lang.String r0 = r2.callTestBucket
            if (r0 != 0) goto L_0x00ac
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r3)
            java.lang.String r0 = "voip_call_ab_test_bucket"
            java.lang.String r0 = X.C17880vN.A0r(r1, r0)
            r2.callTestBucket = r0
        L_0x00ac:
            java.lang.String r0 = r2.callRandomId
            if (r0 != 0) goto L_0x00c1
            r0 = 16
            byte[] r1 = new byte[r0]
            java.security.SecureRandom r0 = r8.A04
            r0.nextBytes(r1)
            X.B2A r0 = X.B2A.A00
            java.lang.String r0 = X.C200410p.A0J(r0, r1)
            r2.callRandomId = r0
        L_0x00c1:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x00cd
            java.lang.Integer r0 = r8.A00()
            if (r0 != 0) goto L_0x00d4
        L_0x00cd:
            if (r10 == 0) goto L_0x00de
            r0 = 4
        L_0x00d0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00d4:
            r2.appExitReason = r0
            X.18K r1 = r8.A06
            X.0vt r0 = X.C18180vt.A06
            r1.CC6(r2, r0)
            return
        L_0x00de:
            if (r11 == 0) goto L_0x00e2
            r0 = 5
            goto L_0x00d0
        L_0x00e2:
            r0 = 0
            if (r12 == 0) goto L_0x00d0
            r0 = 6
            goto L_0x00d0
        L_0x00e7:
            java.lang.String r0 = "UnfinishedCallEventUploader/getPendingEventByPreferences: waSharedPreferences.currentCallIdAndSessionId is empty"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ee }
            monitor-exit(r6)
            return
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0G.A01(boolean, boolean, boolean, boolean):void");
    }

    public A0G(AnonymousClass11C r1, C19830z4 r2, C18030ve r3, AnonymousClass18K r4, WhatsAppLibLoader whatsAppLibLoader, AnonymousClass00H r6, SecureRandom secureRandom) {
        C18070vi.A0w(r3, r4, secureRandom, r1, r2);
        C18070vi.A0l(r6, whatsAppLibLoader);
        this.A03 = r3;
        this.A06 = r4;
        this.A04 = secureRandom;
        this.A05 = r1;
        this.A02 = r2;
        this.A01 = r6;
        this.A00 = whatsAppLibLoader;
    }
}
