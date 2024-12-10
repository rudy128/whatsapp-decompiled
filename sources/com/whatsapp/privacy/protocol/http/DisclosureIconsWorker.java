package com.whatsapp.privacy.protocol.http;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass112;
import X.AnonymousClass181;
import X.AnonymousClass1D9;
import X.AnonymousClass6XF;
import X.AnonymousClass776;
import X.AnonymousClass77L;
import X.C000100c;
import X.C108965cb;
import X.C122906Sj;
import X.C134876rI;
import X.C139476yu;
import X.C1418177b;
import X.C162168Jj;
import X.C162178Jk;
import X.C17880vN;
import X.C17890vO;
import X.C180129Lg;
import X.C18030ve;
import X.C18070vi;
import X.C18460wS;
import X.C194159rG;
import X.C220418j;
import X.C33461ir;
import X.C33501iv;
import X.C39551tG;
import X.C56962iJ;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class DisclosureIconsWorker extends Worker {
    public final C18030ve A00;
    public final C33501iv A01;
    public final C139476yu A02;
    public final JniBridge A03;
    public final AnonymousClass181 A04;
    public final AnonymousClass1D9 A05;
    public final C56962iJ A06;
    public final C220418j A07;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r2 == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A00(int r14, java.lang.String r15) {
        /*
            r13 = this;
            X.2iJ r1 = r13.A06
            java.io.File r0 = r1.A00(r15, r14)
            if (r0 == 0) goto L_0x000f
            boolean r2 = r0.exists()
            r0 = 1
            if (r2 != 0) goto L_0x00bc
        L_0x000f:
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            r12 = 0
            X.1D9 r3 = r13.A05     // Catch:{ IOException -> 0x00aa, Exception -> 0x00a3 }
            X.0ve r5 = r13.A00     // Catch:{ IOException -> 0x00aa, Exception -> 0x00a3 }
            com.whatsapp.wamsys.JniBridge r6 = r13.A03     // Catch:{ IOException -> 0x00aa, Exception -> 0x00a3 }
            r7 = 0
            java.lang.String r8 = "disclosure_icon"
            java.lang.String r9 = "image"
            java.lang.String r10 = "manual"
            X.2k8 r4 = new X.2k8     // Catch:{ IOException -> 0x00aa, Exception -> 0x00a3 }
            r11 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x00aa, Exception -> 0x00a3 }
            java.lang.String r2 = r4.A00()     // Catch:{ IOException -> 0x00aa, Exception -> 0x00a3 }
            X.18j r0 = r13.A07     // Catch:{ IOException -> 0x00aa, Exception -> 0x00a3 }
            X.AUZ r3 = r3.A07(r0, r15, r2)     // Catch:{ IOException -> 0x00aa, Exception -> 0x00a3 }
            java.net.HttpURLConnection r4 = r3.A01     // Catch:{ all -> 0x009c }
            int r2 = r4.getResponseCode()     // Catch:{ all -> 0x009c }
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L_0x0053
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "disclosureiconworker/downloadAndSave/createDownloadableFilesConnection failed "
            r1.append(r0)     // Catch:{ all -> 0x009c }
            int r0 = r4.getResponseCode()     // Catch:{ all -> 0x009c }
            r1.append(r0)     // Catch:{ all -> 0x009c }
            X.C17890vO.A0w(r1)     // Catch:{ all -> 0x009c }
            r3.close()     // Catch:{ IOException -> 0x00aa, Exception -> 0x00a3 }
            goto L_0x00b0
        L_0x0053:
            X.181 r2 = r13.A04     // Catch:{ all -> 0x009c }
            r0 = 27
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x009c }
            X.9Hb r4 = r3.BMP(r2, r7, r0)     // Catch:{ all -> 0x009c }
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x0095 }
            java.io.File r0 = r1.A00(r15, r14)     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x008d
            java.io.FileOutputStream r2 = X.C108945cZ.A19(r0)     // Catch:{ IOException -> 0x0083, Exception -> 0x007b }
            X.C64062u9.A00(r4, r2)     // Catch:{ all -> 0x0074 }
            r2.close()     // Catch:{ IOException -> 0x0083, Exception -> 0x007b }
            r0 = 1
            goto L_0x008e
        L_0x0074:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x0083, Exception -> 0x007b }
            throw r0     // Catch:{ IOException -> 0x0083, Exception -> 0x007b }
        L_0x007b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = "PrivacyDisclosureFileCache/saveDisclosureIcon exception: "
            goto L_0x008a
        L_0x0083:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = "PrivacyDisclosureFileCache/saveDisclosureIcon can not write to file "
        L_0x008a:
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ all -> 0x0095 }
        L_0x008d:
            r0 = 0
        L_0x008e:
            r4.close()     // Catch:{ all -> 0x009c }
            r3.close()     // Catch:{ IOException -> 0x00aa, Exception -> 0x00a3 }
            goto L_0x00b9
        L_0x0095:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x009c }
            throw r0     // Catch:{ all -> 0x009c }
        L_0x009c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ IOException -> 0x00aa, Exception -> 0x00a3 }
            throw r0     // Catch:{ IOException -> 0x00aa, Exception -> 0x00a3 }
        L_0x00a3:
            r1 = move-exception
            java.lang.String r0 = "disclosureiconworker/downloadAndSave failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00b4 }
            goto L_0x00b0
        L_0x00aa:
            r1 = move-exception
            java.lang.String r0 = "disclosureiconworker/downloadAndSave io failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00b4 }
        L_0x00b0:
            android.net.TrafficStats.clearThreadStatsTag()
            return r12
        L_0x00b4:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x00b9:
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x00bc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.privacy.protocol.http.DisclosureIconsWorker.A00(int, java.lang.String):boolean");
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

    /* JADX WARNING: type inference failed for: r0v8, types: [X.9Lg, java.lang.Object] */
    public C180129Lg A0B() {
        String str;
        int length;
        String str2;
        boolean z;
        Collection collection;
        WorkerParameters workerParameters = this.A01;
        int[] A042 = workerParameters.A01.A04("disclosure_ids");
        if (A042 == null || (length = A042.length) == 0) {
            str = "disclosureiconworker/dowork no disclosureIds";
        } else if (workerParameters.A00 > 4) {
            str = "disclosureiconworker/dowork exceed retry limit";
        } else {
            int i = 0;
            boolean z2 = true;
            do {
                int i2 = A042[i];
                if (z2) {
                    C33501iv r0 = this.A01;
                    C33501iv.A00(r0);
                    C33461ir r02 = r0.A02;
                    C33461ir.A01(r02);
                    C39551tG r03 = (C39551tG) r02.A04.get(Integer.valueOf(i2));
                    if (r03 == null) {
                        str2 = null;
                    } else {
                        str2 = r03.A06;
                    }
                    if (str2 == null || str2.length() == 0) {
                        StringBuilder A11 = AnonymousClass000.A11("disclosureiconworker/downloadDisclosureIcons/");
                        A11.append(i2);
                        C17890vO.A19(A11, " notice content not found");
                    } else {
                        try {
                            C134876rI A002 = this.A02.A00(C17880vN.A16(str2), i2);
                            ArrayList A13 = AnonymousClass000.A13();
                            for (C1418177b r1 : A002.A01) {
                                ArrayList A132 = AnonymousClass000.A13();
                                AnonymousClass77L r04 = r1.A03;
                                if (r04 != null) {
                                    A132.add(r04);
                                }
                                for (AnonymousClass776 r05 : r1.A0D) {
                                    AnonymousClass77L r06 = r05.A00;
                                    if (r06 != null) {
                                        collection = C18070vi.A0M(r06);
                                    } else {
                                        collection = C18460wS.A00;
                                    }
                                    A132.addAll(collection);
                                }
                                A13.addAll(A132);
                            }
                            Iterator it = A13.iterator();
                            while (true) {
                                z = true;
                                while (it.hasNext()) {
                                    AnonymousClass77L r12 = (AnonymousClass77L) it.next();
                                    if (z && A00(i2, r12.A04)) {
                                        String str3 = r12.A03;
                                        if (str3 != null) {
                                            if (A00(i2, str3)) {
                                            }
                                        }
                                    }
                                    z = false;
                                }
                                break;
                            }
                            z2 = true;
                            if (!z) {
                            }
                        } catch (C122906Sj unused) {
                            StringBuilder A112 = AnonymousClass000.A11("disclosureiconworker/downloadDisclosureIcons/");
                            A112.append(i2);
                            C17890vO.A19(A112, " failed to parse notice");
                        }
                        i++;
                    }
                }
                z2 = false;
                i++;
            } while (i < length);
            if (z2) {
                return new C162178Jk();
            }
            return new Object();
        }
        Log.e(str);
        return new C162168Jj();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisclosureIconsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        C000100c A0H = C17890vO.A0H(context);
        this.A00 = A0H.BAL();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A03 = (JniBridge) r1.A8z.get();
        this.A04 = C108965cb.A0H(r1);
        this.A05 = (AnonymousClass1D9) r1.A0n.get();
        this.A07 = (C220418j) r1.A9d.get();
        this.A01 = (C33501iv) r1.A8d.get();
        this.A02 = (C139476yu) r1.Ao8.A00.A3s.get();
        this.A06 = (C56962iJ) r1.A8e.get();
    }
}
