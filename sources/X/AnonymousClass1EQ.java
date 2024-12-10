package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.Statistics$Data;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.1EQ  reason: invalid class name */
public class AnonymousClass1EQ extends Handler implements AnonymousClass11J {
    public Statistics$Data A00;
    public File A01;
    public File A02;
    public final CountDownLatch A03 = new CountDownLatch(1);
    public volatile boolean A04;
    public final /* synthetic */ AnonymousClass181 A05;

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2.write(r11.A00.A00().getBytes());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2.close();
        r11.A02.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        com.whatsapp.util.Log.e("statistics/save: error saving", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012e, code lost:
        if (r11.A04 == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0130, code lost:
        r11.A00.A07 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0137, code lost:
        if (r5 == 0) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013a, code lost:
        if (r5 == 1) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013d, code lost:
        if (r5 == 2) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r1 = r11.A01;
        X.C17960vV.A07(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0140, code lost:
        if (r5 == 3) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0143, code lost:
        if (r5 != 4) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0145, code lost:
        r11.A00.A08 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014e, code lost:
        r11.A00.A00 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0157, code lost:
        r11.A00.A0B += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0160, code lost:
        r11.A00.A03 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0169, code lost:
        r11.A00.A01 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0179, code lost:
        if (r11.A04 == false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x017b, code lost:
        r11.A00.A0I += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0182, code lost:
        if (r5 == 0) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0185, code lost:
        if (r5 == 1) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0188, code lost:
        if (r5 == 2) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x018b, code lost:
        if (r5 == 3) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r2 = new X.AnonymousClass2QW(r11.A05.A04.A00, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x018e, code lost:
        if (r5 != 4) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0190, code lost:
        r11.A00.A0J += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0199, code lost:
        r11.A00.A0D += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01a2, code lost:
        r11.A00.A0M += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ab, code lost:
        r11.A00.A0G += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b3, code lost:
        r11.A00.A0E += r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleMessage(android.os.Message r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            int r0 = r12.what     // Catch:{ all -> 0x0230 }
            r5 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x01bb;
                case 1: goto L_0x0026;
                case 2: goto L_0x0172;
                case 3: goto L_0x0127;
                case 4: goto L_0x011a;
                case 5: goto L_0x010d;
                case 6: goto L_0x00da;
                case 7: goto L_0x0079;
                case 8: goto L_0x0060;
                case 9: goto L_0x001f;
                default: goto L_0x0008;
            }     // Catch:{ all -> 0x0230 }
        L_0x0008:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0230 }
            r1.<init>()     // Catch:{ all -> 0x0230 }
            java.lang.String r0 = "statistics/stats-handler:unknown message:"
            r1.append(r0)     // Catch:{ all -> 0x0230 }
            r1.append(r12)     // Catch:{ all -> 0x0230 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0230 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0230 }
            goto L_0x022e
        L_0x001f:
            com.whatsapp.Statistics$Data r0 = new com.whatsapp.Statistics$Data     // Catch:{ all -> 0x0230 }
            r0.<init>((boolean) r2)     // Catch:{ all -> 0x0230 }
            r11.A00 = r0     // Catch:{ all -> 0x0230 }
        L_0x0026:
            java.io.File r1 = r11.A01     // Catch:{ all -> 0x0230 }
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x0230 }
            X.181 r0 = r11.A05     // Catch:{ Exception -> 0x0057 }
            X.17y r0 = r0.A04     // Catch:{ Exception -> 0x0057 }
            X.17z r0 = r0.A00     // Catch:{ Exception -> 0x0057 }
            X.2QW r2 = new X.2QW     // Catch:{ Exception -> 0x0057 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x0057 }
            com.whatsapp.Statistics$Data r0 = r11.A00     // Catch:{ all -> 0x004d }
            java.lang.String r0 = r0.A00()     // Catch:{ all -> 0x004d }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x004d }
            r2.write(r0)     // Catch:{ all -> 0x004d }
            r2.close()     // Catch:{ Exception -> 0x0057 }
            java.io.File r0 = r11.A02     // Catch:{ Exception -> 0x0057 }
            r0.delete()     // Catch:{ Exception -> 0x0057 }
            goto L_0x022e
        L_0x004d:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0057 }
        L_0x0056:
            throw r1     // Catch:{ Exception -> 0x0057 }
        L_0x0057:
            r1 = move-exception
            java.lang.String r0 = "statistics/save: error saving"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0230 }
            goto L_0x022e
        L_0x0060:
            int r0 = r12.arg1     // Catch:{ all -> 0x0230 }
            if (r0 != r2) goto L_0x0065
            r5 = 1
        L_0x0065:
            r3 = 1
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            if (r5 == 0) goto L_0x0072
            long r0 = r2.A0N     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A0N = r0     // Catch:{ all -> 0x0230 }
            goto L_0x022e
        L_0x0072:
            long r0 = r2.A0C     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A0C = r0     // Catch:{ all -> 0x0230 }
            goto L_0x022e
        L_0x0079:
            android.os.Bundle r3 = r12.getData()     // Catch:{ all -> 0x0230 }
            java.lang.String r0 = "messageType"
            int r7 = r3.getInt(r0)     // Catch:{ all -> 0x0230 }
            java.lang.String r0 = "timestamp"
            long r1 = r3.getLong(r0)     // Catch:{ all -> 0x0230 }
            java.lang.String r0 = "isPayment"
            boolean r10 = r3.getBoolean(r0)     // Catch:{ all -> 0x0230 }
            X.181 r0 = r11.A05     // Catch:{ all -> 0x0230 }
            X.11P r0 = r0.A02     // Catch:{ all -> 0x0230 }
            long r8 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0230 }
            long r8 = r8 - r1
            r1 = 1000(0x3e8, double:4.94E-321)
            r5 = 1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00af
            com.whatsapp.Statistics$Data r4 = r11.A00     // Catch:{ all -> 0x0230 }
            long r2 = r4.A04     // Catch:{ all -> 0x0230 }
            long r0 = r4.A05     // Catch:{ all -> 0x0230 }
            long r2 = r2 * r0
            long r2 = r2 + r8
            long r0 = r0 + r5
            r4.A05 = r0     // Catch:{ all -> 0x0230 }
            long r2 = r2 / r0
            r4.A04 = r2     // Catch:{ all -> 0x0230 }
        L_0x00af:
            r0 = 3
            if (r7 != r0) goto L_0x00ba
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A09     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r5
            r2.A09 = r0     // Catch:{ all -> 0x0230 }
            goto L_0x00cf
        L_0x00ba:
            r0 = 1
            if (r7 != r0) goto L_0x00c5
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A0A     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r5
            r2.A0A = r0     // Catch:{ all -> 0x0230 }
            goto L_0x00cf
        L_0x00c5:
            r0 = 2
            if (r7 != r0) goto L_0x00cf
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A02     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r5
            r2.A02 = r0     // Catch:{ all -> 0x0230 }
        L_0x00cf:
            if (r10 == 0) goto L_0x022e
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A06     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r5
            r2.A06 = r0     // Catch:{ all -> 0x0230 }
            goto L_0x022e
        L_0x00da:
            int r1 = r12.arg1     // Catch:{ all -> 0x0230 }
            int r0 = r12.arg2     // Catch:{ all -> 0x0230 }
            if (r0 != r2) goto L_0x00e1
            r5 = 1
        L_0x00e1:
            r0 = 3
            r3 = 1
            if (r1 != r0) goto L_0x00ee
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A0K     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A0K = r0     // Catch:{ all -> 0x0230 }
            goto L_0x0102
        L_0x00ee:
            if (r1 != r2) goto L_0x00f8
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A0L     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A0L = r0     // Catch:{ all -> 0x0230 }
            goto L_0x0102
        L_0x00f8:
            r0 = 2
            if (r1 != r0) goto L_0x0102
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A0F     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A0F = r0     // Catch:{ all -> 0x0230 }
        L_0x0102:
            if (r5 == 0) goto L_0x022e
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A0H     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A0H = r0     // Catch:{ all -> 0x0230 }
            goto L_0x022e
        L_0x010d:
            int r5 = r12.arg1     // Catch:{ all -> 0x0230 }
            android.os.Bundle r1 = r12.getData()     // Catch:{ all -> 0x0230 }
            java.lang.String r0 = "bytes"
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0230 }
            goto L_0x012c
        L_0x011a:
            int r5 = r12.arg1     // Catch:{ all -> 0x0230 }
            android.os.Bundle r1 = r12.getData()     // Catch:{ all -> 0x0230 }
            java.lang.String r0 = "bytes"
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0230 }
            goto L_0x0177
        L_0x0127:
            int r5 = r12.arg1     // Catch:{ all -> 0x0230 }
            int r0 = r12.arg2     // Catch:{ all -> 0x0230 }
            long r3 = (long) r0     // Catch:{ all -> 0x0230 }
        L_0x012c:
            boolean r0 = r11.A04     // Catch:{ all -> 0x0230 }
            if (r0 == 0) goto L_0x0137
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A07     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A07 = r0     // Catch:{ all -> 0x0230 }
        L_0x0137:
            if (r5 == 0) goto L_0x0169
            r0 = 1
            if (r5 == r0) goto L_0x0160
            r0 = 2
            if (r5 == r0) goto L_0x0157
            r0 = 3
            if (r5 == r0) goto L_0x014e
            r0 = 4
            if (r5 != r0) goto L_0x022e
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A08     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A08 = r0     // Catch:{ all -> 0x0230 }
            goto L_0x022e
        L_0x014e:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A00     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A00 = r0     // Catch:{ all -> 0x0230 }
            goto L_0x022e
        L_0x0157:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A0B     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A0B = r0     // Catch:{ all -> 0x0230 }
            goto L_0x022e
        L_0x0160:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A03     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A03 = r0     // Catch:{ all -> 0x0230 }
            goto L_0x022e
        L_0x0169:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A01     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A01 = r0     // Catch:{ all -> 0x0230 }
            goto L_0x022e
        L_0x0172:
            int r5 = r12.arg1     // Catch:{ all -> 0x0230 }
            int r0 = r12.arg2     // Catch:{ all -> 0x0230 }
            long r3 = (long) r0     // Catch:{ all -> 0x0230 }
        L_0x0177:
            boolean r0 = r11.A04     // Catch:{ all -> 0x0230 }
            if (r0 == 0) goto L_0x0182
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A0I     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A0I = r0     // Catch:{ all -> 0x0230 }
        L_0x0182:
            if (r5 == 0) goto L_0x01b3
            r0 = 1
            if (r5 == r0) goto L_0x01ab
            r0 = 2
            if (r5 == r0) goto L_0x01a2
            r0 = 3
            if (r5 == r0) goto L_0x0199
            r0 = 4
            if (r5 != r0) goto L_0x022e
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A0J     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A0J = r0     // Catch:{ all -> 0x0230 }
            goto L_0x022e
        L_0x0199:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A0D     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A0D = r0     // Catch:{ all -> 0x0230 }
            goto L_0x022e
        L_0x01a2:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A0M     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A0M = r0     // Catch:{ all -> 0x0230 }
            goto L_0x022e
        L_0x01ab:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A0G     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A0G = r0     // Catch:{ all -> 0x0230 }
            goto L_0x022e
        L_0x01b3:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0230 }
            long r0 = r2.A0E     // Catch:{ all -> 0x0230 }
            long r0 = r0 + r3
            r2.A0E = r0     // Catch:{ all -> 0x0230 }
            goto L_0x022e
        L_0x01bb:
            X.181 r0 = r11.A05     // Catch:{ all -> 0x0230 }
            X.118 r0 = r0.A03     // Catch:{ all -> 0x0230 }
            android.content.Context r3 = r0.A00     // Catch:{ all -> 0x0230 }
            java.io.File r2 = r3.getFilesDir()     // Catch:{ all -> 0x0230 }
            java.lang.String r1 = "statistics"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0230 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0230 }
            r11.A02 = r0     // Catch:{ all -> 0x0230 }
            java.io.File r2 = r3.getFilesDir()     // Catch:{ all -> 0x0230 }
            java.lang.String r1 = "statistics.json"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0230 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0230 }
            r11.A01 = r0     // Catch:{ all -> 0x0230 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0230 }
            if (r0 == 0) goto L_0x0207
            java.io.File r0 = r11.A01     // Catch:{ Exception -> 0x01f9 }
            byte[] r0 = X.AnonymousClass1EW.A00(r0)     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x01f9 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01f9 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x01f9 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01f9 }
            com.whatsapp.Statistics$Data r1 = new com.whatsapp.Statistics$Data     // Catch:{ Exception -> 0x01f9 }
            r1.<init>((org.json.JSONObject) r0)     // Catch:{ Exception -> 0x01f9 }
            goto L_0x020c
        L_0x01f9:
            r1 = move-exception
            java.lang.String r0 = "statistics/load: reset due to the error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0230 }
            r0 = 1
            com.whatsapp.Statistics$Data r1 = new com.whatsapp.Statistics$Data     // Catch:{ all -> 0x0230 }
            r1.<init>((boolean) r0)     // Catch:{ all -> 0x0230 }
            goto L_0x020c
        L_0x0207:
            com.whatsapp.Statistics$Data r1 = new com.whatsapp.Statistics$Data     // Catch:{ all -> 0x0230 }
            r1.<init>((boolean) r5)     // Catch:{ all -> 0x0230 }
        L_0x020c:
            r11.A00 = r1     // Catch:{ all -> 0x0230 }
            java.util.concurrent.CountDownLatch r0 = r11.A03     // Catch:{ all -> 0x0230 }
            r0.countDown()     // Catch:{ all -> 0x0230 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0230 }
            r1.<init>()     // Catch:{ all -> 0x0230 }
            java.lang.String r0 = "statistics/init: "
            r1.append(r0)     // Catch:{ all -> 0x0230 }
            com.whatsapp.Statistics$Data r0 = r11.A00     // Catch:{ all -> 0x0230 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0230 }
            r1.append(r0)     // Catch:{ all -> 0x0230 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0230 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0230 }
        L_0x022e:
            monitor-exit(r11)
            return
        L_0x0230:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1EQ.handleMessage(android.os.Message):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1EQ(Looper looper, AnonymousClass181 r4, AnonymousClass11E r5) {
        super(looper);
        this.A05 = r4;
        r5.registerObserver(this);
    }

    public void Bps(C59732mn r2) {
        this.A04 = r2.A04;
    }
}
