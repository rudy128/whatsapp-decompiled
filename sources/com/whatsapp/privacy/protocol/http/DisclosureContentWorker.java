package com.whatsapp.privacy.protocol.http;

import X.AnonymousClass10E;
import X.AnonymousClass112;
import X.AnonymousClass181;
import X.AnonymousClass1D9;
import X.AnonymousClass6XF;
import X.C000100c;
import X.C108965cb;
import X.C17890vO;
import X.C18030ve;
import X.C18070vi;
import X.C194159rG;
import X.C220418j;
import X.C25768Clf;
import X.C33541iz;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.wamsys.JniBridge;

public final class DisclosureContentWorker extends Worker {
    public final AnonymousClass181 A00;
    public final C18030ve A01;
    public final C33541iz A02;
    public final JniBridge A03;
    public final AnonymousClass1D9 A04;
    public final C25768Clf A05;
    public final C220418j A06;

    private final void A00(int[] iArr, int i) {
        for (int A022 : iArr) {
            this.A05.A02(A022, Integer.valueOf(i));
        }
    }

    public C194159rG A0A() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && i >= 23) {
            Context context = this.A00;
            C18070vi.A0X(context);
            Notification A002 = AnonymousClass6XF.A00(context);
            if (A002 != null) {
                return new C194159rG(59, A002, AnonymousClass112.A06() ? 1 : 0);
            }
        }
        super.A0A();
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: X.8Jj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: X.8Jj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: X.9Lg} */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C180129Lg A0B() {
        /*
            r17 = this;
            r5 = r17
            androidx.work.WorkerParameters r1 = r5.A01
            X.A6Y r2 = r1.A01
            X.C18070vi.A0X(r2)
            java.lang.String r0 = "disclosure_ids"
            int[] r3 = r2.A04(r0)
            if (r3 == 0) goto L_0x0114
            int r0 = r3.length
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = "url"
            java.lang.String r7 = r2.A03(r0)
            r4 = 2
            if (r7 == 0) goto L_0x0101
            int r1 = r1.A00
            r0 = 4
            if (r1 > r0) goto L_0x0101
            java.lang.String r1 = "handler"
            r0 = -1
            int r6 = r2.A02(r1, r0)
            java.lang.String r0 = "language"
            java.lang.String r1 = r2.A03(r0)
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = ""
        L_0x0033:
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.1D9 r2 = r5.A04     // Catch:{ IOException -> 0x00da }
            X.0ve r9 = r5.A01     // Catch:{ IOException -> 0x00da }
            com.whatsapp.wamsys.JniBridge r10 = r5.A03     // Catch:{ IOException -> 0x00da }
            r11 = 0
            java.lang.String r12 = "disclosure_content"
            java.lang.String r13 = "document"
            java.lang.String r14 = "manual"
            r16 = 0
            X.2k8 r8 = new X.2k8     // Catch:{ IOException -> 0x00da }
            r15 = r11
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x00da }
            java.lang.String r8 = r8.A00()     // Catch:{ IOException -> 0x00da }
            X.18j r0 = r5.A06     // Catch:{ IOException -> 0x00da }
            X.AUZ r2 = r2.A07(r0, r7, r8)     // Catch:{ IOException -> 0x00da }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x00d3 }
            java.net.HttpURLConnection r0 = r2.A01     // Catch:{ all -> 0x00d3 }
            int r7 = r0.getResponseCode()     // Catch:{ all -> 0x00d3 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r7 == r0) goto L_0x0070
            r5.A00(r3, r4)     // Catch:{ all -> 0x00d3 }
            r2.close()     // Catch:{ all -> 0x00d3 }
            X.8Ji r0 = new X.8Ji     // Catch:{ all -> 0x00d3 }
            r0.<init>()     // Catch:{ all -> 0x00d3 }
            goto L_0x00cf
        L_0x0070:
            X.1iz r8 = r5.A02     // Catch:{ all -> 0x00d3 }
            X.1iw r10 = r8.A00(r6)     // Catch:{ all -> 0x00d3 }
            java.lang.String r7 = "null cannot be cast to non-null type com.whatsapp.privacy.protocol.xmpp.DisclosureHandler"
            X.C18070vi.A0z(r10, r7)     // Catch:{ all -> 0x00d3 }
            X.181 r6 = r5.A00     // Catch:{ all -> 0x00d3 }
            r0 = 27
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d3 }
            X.9Hb r0 = r2.BMP(r6, r11, r0)     // Catch:{ all -> 0x00d3 }
            byte[] r0 = X.AnonymousClass1EY.A04(r0)     // Catch:{ all -> 0x00d3 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00d3 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x00d3 }
            r9.<init>(r0)     // Catch:{ all -> 0x00d3 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ JSONException -> 0x00b4 }
            r6.<init>(r9)     // Catch:{ JSONException -> 0x00b4 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ JSONException -> 0x00b4 }
            r0.<init>(r6)     // Catch:{ JSONException -> 0x00b4 }
            java.lang.String r0 = X.C181849Sb.A00(r0)     // Catch:{ JSONException -> 0x00b4 }
            org.json.JSONObject r0 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x00b4 }
            r10.BcD(r1, r0, r3)     // Catch:{ JSONException -> 0x00b4 }
            r9.close()     // Catch:{ all -> 0x00d3 }
            r2.close()     // Catch:{ all -> 0x00d3 }
            X.8Jk r0 = new X.8Jk     // Catch:{ all -> 0x00d3 }
            r0.<init>()     // Catch:{ all -> 0x00d3 }
            goto L_0x00cf
        L_0x00b4:
            r1 = move-exception
            java.lang.String r0 = "disclosureContentWorker/handleResponse malformed downloaded content"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x00d3 }
            r0 = 3
            r5.A00(r3, r0)     // Catch:{ all -> 0x00d3 }
            r1 = 410(0x19a, float:5.75E-43)
            X.1iw r0 = r8.A00(r4)     // Catch:{ all -> 0x00d3 }
            X.C18070vi.A0z(r0, r7)     // Catch:{ all -> 0x00d3 }
            r0.Brk(r3, r1)     // Catch:{ all -> 0x00d3 }
            X.8Jj r0 = new X.8Jj     // Catch:{ all -> 0x00d3 }
            r0.<init>()     // Catch:{ all -> 0x00d3 }
        L_0x00cf:
            r2.close()     // Catch:{ IOException -> 0x00da }
            goto L_0x00f8
        L_0x00d3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x00da }
            throw r0     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            r1 = move-exception
            java.lang.String r0 = "disclosureContentWorker/doWork/fetch failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00fc }
            r5.A00(r3, r4)     // Catch:{ all -> 0x00fc }
            r2 = 400(0x190, float:5.6E-43)
            X.1iz r0 = r5.A02     // Catch:{ all -> 0x00fc }
            X.1iw r1 = r0.A00(r4)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.privacy.protocol.xmpp.DisclosureHandler"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x00fc }
            r1.Brk(r3, r2)     // Catch:{ all -> 0x00fc }
            X.8Jj r0 = new X.8Jj     // Catch:{ all -> 0x00fc }
            r0.<init>()     // Catch:{ all -> 0x00fc }
        L_0x00f8:
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x00fc:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0101:
            r5.A00(r3, r4)
            r2 = 400(0x190, float:5.6E-43)
            X.1iz r0 = r5.A02
            X.1iw r1 = r0.A00(r4)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.privacy.protocol.xmpp.DisclosureHandler"
            X.C18070vi.A0z(r1, r0)
            r1.Brk(r3, r2)
        L_0x0114:
            X.8Jj r0 = new X.8Jj
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.privacy.protocol.http.DisclosureContentWorker.A0B():X.9Lg");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisclosureContentWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        C000100c A0H = C17890vO.A0H(context);
        this.A01 = A0H.BAL();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A03 = (JniBridge) r1.A8z.get();
        this.A00 = C108965cb.A0H(r1);
        this.A04 = (AnonymousClass1D9) r1.A0n.get();
        this.A06 = (C220418j) r1.A9d.get();
        this.A05 = (C25768Clf) r1.A8g.get();
        this.A02 = (C33541iz) r1.A3U.get();
    }
}
