package X;

import android.content.Context;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;

/* renamed from: X.68l  reason: invalid class name and case insensitive filesystem */
public class C1195168l extends C1195468o implements BC9 {
    public AnonymousClass64W A00;
    public final long A01;
    public final AnonymousClass118 A02;
    public final C18030ve A03;
    public final C55782gM A04;
    public final AnonymousClass1U8 A05;
    public final AnonymousClass1TI A06;
    public final JniBridge A07;
    public final String A08;
    public final C26881Tv A09;
    public volatile File A0A;
    public volatile boolean A0B;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1195168l(X.AnonymousClass181 r12, X.C26881Tv r13, X.AnonymousClass11P r14, X.AnonymousClass118 r15, X.AnonymousClass11Z r16, X.C18030ve r17, X.C24371Kb r18, X.C55782gM r19, X.AnonymousClass1U8 r20, X.C24421Kg r21, X.AnonymousClass1TI r22, com.whatsapp.wamsys.JniBridge r23, java.lang.String r24, long r25) {
        /*
            r11 = this;
            r10 = 0
            r3 = r11
            r4 = r12
            r5 = r14
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2 = r19
            X.C17960vV.A07(r2)
            r11.A03 = r7
            r0 = r23
            r11.A07 = r0
            r0 = r25
            r11.A01 = r0
            r0 = r24
            r11.A08 = r0
            r0 = r22
            r11.A06 = r0
            r11.A02 = r15
            r11.A04 = r2
            r0 = r20
            r11.A05 = r0
            r11.A09 = r13
            r11.BB6(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1195168l.<init>(X.181, X.1Tv, X.11P, X.118, X.11Z, X.0ve, X.1Kb, X.2gM, X.1U8, X.1Kg, X.1TI, com.whatsapp.wamsys.JniBridge, java.lang.String, long):void");
    }

    public /* synthetic */ void BsA(long j) {
    }

    public void BsC(boolean z) {
        Context context = this.A02.A00;
        C55782gM r0 = this.A04;
        C108985cd.A1C(AnonymousClass1U9.A00(context, r0.A04, r0.A06, r0.A02));
        this.A06.accept(this.A08);
        this.A0B = false;
        AnonymousClass64W r1 = this.A00;
        if (r1 != null) {
            this.A05.A00.CC7(r1);
        }
    }

    public C126026c4 A03() {
        C126026c4 A032 = super.A03();
        AnonymousClass64W r3 = A032.A00.A00;
        this.A00 = r3;
        if (r3 != null) {
            r3.A0L = C108955ca.A0g();
            r3.A0M = AnonymousClass3MY.A0h();
            r3.A0K = AnonymousClass3MY.A0g();
            int i = 5;
            if (this.A04.A02 == 1) {
                i = 2;
            }
            r3.A0J = Integer.valueOf(i);
            return A032;
        }
        Log.e("ProfilePicturePlainFileDownload/download media_download2 event in DownloadResponse is null");
        return A032;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BsD(X.C1409173o r12, X.C136996uk r13) {
        /*
            r11 = this;
            boolean r0 = r12.A03()
            r4 = 0
            if (r0 == 0) goto L_0x003d
            java.io.File r0 = r11.A0A
            long r2 = r0.length()
            int r1 = (int) r2
            byte[] r3 = new byte[r1]
            java.io.File r0 = r11.A0A     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0048 }
            java.io.FileInputStream r2 = X.C108945cZ.A18(r0)     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0048 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x002f }
            r0.<init>(r2)     // Catch:{ all -> 0x002f }
            r0.read(r3, r4, r1)     // Catch:{ all -> 0x0025 }
            r0.close()     // Catch:{ all -> 0x002f }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0048 }
            goto L_0x004e
        L_0x0025:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x002a }
            goto L_0x002e
        L_0x002a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x002f }
        L_0x002e:
            throw r1     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0048 }
        L_0x0038:
            throw r1     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0048 }
        L_0x0039:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: Could not find picture download file"
            goto L_0x004b
        L_0x003d:
            int r0 = r12.A01
            boolean r0 = X.C1409173o.A02(r0)
            r8 = 6
            if (r0 == 0) goto L_0x0058
            r8 = 4
            goto L_0x0058
        L_0x0048:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: IO Exception while reading the picture download file"
        L_0x004b:
            com.whatsapp.util.Log.w(r0, r1)
        L_0x004e:
            X.2gM r1 = r11.A04
            r1.A00 = r3
            X.1Tv r0 = r11.A09
            r0.A04(r1)
            r8 = 1
        L_0x0058:
            X.64W r0 = r12.A00
            if (r0 == 0) goto L_0x00a6
            java.lang.Long r0 = r0.A0R
            if (r0 == 0) goto L_0x00a6
            long r0 = r0.longValue()
            int r10 = (int) r0
        L_0x0065:
            X.1U8 r5 = r11.A05
            X.2gM r0 = r11.A04
            int r1 = r0.A02
            r0 = 1
            r9 = 1
            if (r1 != r0) goto L_0x0070
            r9 = 2
        L_0x0070:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r11.A01
            java.lang.Long r7 = X.C108945cZ.A1B(r2, r0)
            java.io.File r0 = r11.A0A
            if (r0 == 0) goto L_0x00a4
            java.io.File r0 = r11.A0A
            long r0 = r0.length()
            double r2 = (double) r0
            java.lang.Double r6 = java.lang.Double.valueOf(r2)
        L_0x0089:
            r5.A00(r6, r7, r8, r9, r10)
            java.io.File r0 = r11.A0A
            r0.delete()
            X.1TI r1 = r11.A06
            java.lang.String r0 = r11.A08
            r1.accept(r0)
            r11.A0B = r4
            X.64W r1 = r11.A00
            if (r1 == 0) goto L_0x00a3
            X.18K r0 = r5.A00
            r0.CC7(r1)
        L_0x00a3:
            return
        L_0x00a4:
            r6 = 0
            goto L_0x0089
        L_0x00a6:
            r10 = -1
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1195168l.BsD(X.73o, X.6uk):void");
    }
}
