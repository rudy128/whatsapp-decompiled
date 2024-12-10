package X;

import java.util.HashMap;

/* renamed from: X.6oC  reason: invalid class name and case insensitive filesystem */
public final class C133116oC {
    public HashMap A00 = C17880vN.A11();
    public final AnonymousClass1KB A01;
    public final AnonymousClass11C A02;
    public final C18030ve A03;
    public final AnonymousClass1T6 A04;
    public final C26521Sl A05;
    public final AnonymousClass10I A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C21132Af0 A00(android.net.Uri r28, int r29) {
        /*
            r27 = this;
            r0 = r27
            X.00H r3 = r0.A08
            java.lang.Object r1 = r3.get()
            X.6lx r1 = (X.C131966lx) r1
            r4 = 476716874(0x1c6a1f4a, float:7.7464546E-22)
            X.19T r2 = r1.A00
            r1 = r29
            r2.markerStart(r4, r1)
            X.Af0 r2 = new X.Af0
            r2.<init>()
            r4 = 0
            r15 = 1
            X.2qf r9 = new X.2qf
            r9.<init>(r15, r4, r15)
            X.0ve r4 = r0.A03
            X.68f r8 = new X.68f
            r8.<init>(r4)
            X.1Sl r4 = r0.A05
            r6 = r28
            java.lang.String r4 = X.C108975cc.A0c(r6, r4)
            boolean r26 = X.C26521Sl.A0f(r4)
            if (r26 == 0) goto L_0x00bb
            java.lang.String r4 = X.C18070vi.A0H(r6)
            android.net.Uri r17 = android.net.Uri.parse(r4)
            X.11C r4 = r0.A02
            X.11B r16 = r4.A0O()
            r5 = 0
            if (r16 == 0) goto L_0x0062
            r20 = r5
            r21 = r5
            r18 = r5
            r19 = r5
            android.database.Cursor r5 = r16.A03(r17, r18, r19, r20, r21)
            if (r5 == 0) goto L_0x0062
            r5.moveToFirst()     // Catch:{ all -> 0x00b4 }
            java.lang.String r4 = "_data"
            int r4 = r5.getColumnIndex(r4)     // Catch:{ all -> 0x00b4 }
            java.lang.String r4 = r5.getString(r4)     // Catch:{ all -> 0x00b4 }
            goto L_0x0067
        L_0x0062:
            java.lang.String r4 = r17.getPath()     // Catch:{ all -> 0x00b4 }
            goto L_0x006a
        L_0x0067:
            r5.close()
        L_0x006a:
            if (r4 != 0) goto L_0x0073
            java.lang.String r4 = "InAppBugReportingScreenshotsUploadRepository/getFilePath: null path for media uri"
            com.whatsapp.util.Log.e((java.lang.String) r4)
            r9 = 0
            goto L_0x00c8
        L_0x0073:
            java.io.File r19 = X.C108945cZ.A17(r4)
            X.1So r18 = X.C26551So.A0q
            java.lang.String r4 = "doodle"
            java.lang.String r20 = r6.getQueryParameter(r4)
            java.lang.String r4 = "from"
            java.lang.String r5 = r6.getQueryParameter(r4)
            if (r5 == 0) goto L_0x00b1
            int r4 = r5.length()
            if (r4 == 0) goto L_0x00b1
            long r22 = java.lang.Long.parseLong(r5)
        L_0x0091:
            java.lang.String r4 = "to"
            java.lang.String r5 = r6.getQueryParameter(r4)
            if (r5 == 0) goto L_0x00ae
            int r4 = r5.length()
            if (r4 == 0) goto L_0x00ae
            long r24 = java.lang.Long.parseLong(r5)
        L_0x00a3:
            r16 = 0
            r21 = 0
            r17 = r9
            X.2ta r9 = X.C63722ta.A03(r16, r17, r18, r19, r20, r21, r22, r24)
            goto L_0x00c8
        L_0x00ae:
            r24 = 0
            goto L_0x00a3
        L_0x00b1:
            r22 = 0
            goto L_0x0091
        L_0x00b4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x00bb:
            X.1So r10 = X.C26551So.A0E
            r7 = 0
            r13 = 0
            r12 = r7
            r11 = r7
            r14 = r13
            r16 = r15
            X.2ta r9 = X.C63722ta.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x00c8:
            java.lang.Object r4 = r3.get()
            X.6lx r4 = (X.C131966lx) r4
            if (r26 == 0) goto L_0x0116
            java.lang.String r7 = "video"
        L_0x00d2:
            java.lang.String r5 = "mms_type"
            r6 = 476716874(0x1c6a1f4a, float:7.7464546E-22)
            X.19T r4 = r4.A00
            r4.markerAnnotate((int) r6, (int) r1, (java.lang.String) r5, (java.lang.String) r7)
            java.lang.Object r8 = r3.get()
            X.6lx r8 = (X.C131966lx) r8
            java.lang.Object r4 = r3.get()
            X.6lx r4 = (X.C131966lx) r4
            java.lang.String r7 = r4.A00()
            java.lang.String r5 = "network_type"
            X.19T r4 = r8.A00
            r4.markerAnnotate((int) r6, (int) r1, (java.lang.String) r5, (java.lang.String) r7)
            if (r9 != 0) goto L_0x0119
            java.lang.String r0 = "InAppBugReportingScreenshotsUploadRepository/mediaJobRequestData is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8 = 0
            r12 = 19
            X.4Ut r7 = new X.4Ut
            r10 = r8
            r11 = r8
            r9 = r8
            r7.<init>(r8, r9, r10, r11, r12)
            r2.A0B(r7)
            java.lang.Object r0 = r3.get()
            X.6lx r0 = (X.C131966lx) r0
            r3 = 148(0x94, float:2.07E-43)
            X.19T r0 = r0.A00
            r0.markerEnd(r6, r1, r3)
            return r2
        L_0x0116:
            java.lang.String r7 = "image"
            goto L_0x00d2
        L_0x0119:
            X.1T6 r3 = r0.A04
            X.34B r6 = r3.A0C(r9, r15)
            java.lang.String r3 = "mms"
            r6.A0Z = r3
            X.10I r5 = r0.A06
            r4 = 14
            X.3Cu r3 = new X.3Cu
            r3.<init>(r0, r1, r4, r6)
            r5.CGF(r3)
            X.7Nj r3 = new X.7Nj
            r21 = r3
            r22 = r2
            r23 = r0
            r24 = r6
            r25 = r1
            r21.<init>(r22, r23, r24, r25, r26)
            r0 = 0
            r6.A07(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133116oC.A00(android.net.Uri, int):X.Af0");
    }

    public C133116oC(AnonymousClass1KB r2, AnonymousClass11C r3, C18030ve r4, AnonymousClass1T6 r5, C26521Sl r6, AnonymousClass10I r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        C18070vi.A0w(r5, r7, r2, r4, r8);
        C18070vi.A0q(r6, r3, r9);
        this.A04 = r5;
        this.A06 = r7;
        this.A01 = r2;
        this.A03 = r4;
        this.A07 = r8;
        this.A05 = r6;
        this.A02 = r3;
        this.A08 = r9;
    }
}
