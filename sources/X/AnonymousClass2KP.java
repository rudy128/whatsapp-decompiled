package X;

import java.io.File;

/* renamed from: X.2KP  reason: invalid class name */
public class AnonymousClass2KP extends C1194668g {
    public final File A00;
    public final File A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final /* synthetic */ C26741Th A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2KP(X.C26741Th r14, X.C165718be r15, java.lang.String r16) {
        /*
            r13 = this;
            r5 = r13
            r13.A06 = r14
            X.11P r7 = r14.A01
            X.0ve r9 = r14.A03
            X.181 r6 = r14.A00
            X.11Z r8 = r14.A02
            X.1Kg r11 = r14.A06
            X.1Kb r10 = r14.A05
            r12 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.17y r0 = r14.A04     // Catch:{ IOException -> 0x0083 }
            X.17z r2 = r0.A00     // Catch:{ IOException -> 0x0083 }
            java.lang.String r1 = ""
            java.io.File r0 = r2.A01(r1)     // Catch:{ IOException -> 0x0083 }
            r13.A01 = r0     // Catch:{ IOException -> 0x0083 }
            java.io.File r0 = r2.A01(r1)     // Catch:{ IOException -> 0x0083 }
            r13.A00 = r0     // Catch:{ IOException -> 0x0083 }
            int r1 = r15.bitField0_
            r0 = r1 & 1
            r2 = r16
            if (r0 == 0) goto L_0x007b
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0073
            r0 = r1 & 16
            if (r0 == 0) goto L_0x006b
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0063
            X.DSQ r0 = r15.mediaKey_
            byte[] r4 = r0.A06()
            X.DSQ r0 = r15.fileSha256_
            byte[] r3 = r0.A06()
            X.DSQ r0 = r15.fileEncSha256_
            byte[] r2 = r0.A06()
            java.lang.String r0 = r15.directPath_
            r13.A03 = r0
            r1 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r4, r1)
            r13.A02 = r0
            java.lang.String r0 = android.util.Base64.encodeToString(r3, r1)
            r13.A05 = r0
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r1)
            r13.A04 = r0
            return
        L_0x0063:
            r1 = 52
            X.1Tq r0 = new X.1Tq
            r0.<init>(r1, r2)
            throw r0
        L_0x006b:
            r1 = 51
            X.1Tq r0 = new X.1Tq
            r0.<init>(r1, r2)
            throw r0
        L_0x0073:
            r1 = 50
            X.1Tq r0 = new X.1Tq
            r0.<init>(r1, r2)
            throw r0
        L_0x007b:
            r1 = 49
            X.1Tq r0 = new X.1Tq
            r0.<init>(r1, r2)
            throw r0
        L_0x0083:
            r2 = move-exception
            java.lang.String r0 = "external-mutations-downloader: Failed to prepare location for encryptedFile/destinationFile"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "Failed to prepare location for encryptedFile/destinationFile "
            X.2E0 r0 = new X.2E0
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2KP.<init>(X.1Th, X.8be, java.lang.String):void");
    }

    public C136996uk A02(C1409173o r3) {
        C136996uk r1 = new C136996uk();
        r1.A0E(r3.A03());
        r1.A08();
        return r1;
    }

    public /* bridge */ /* synthetic */ Object A04() {
        C26551So r7 = C26551So.A0N;
        String str = this.A04;
        String str2 = this.A03;
        if (str != null) {
            AnonymousClass2NY r0 = new AnonymousClass2NY((C18030ve) null, str, "md-app-state", "mms", str2, (String) null);
            File file = this.A01;
            C17960vV.A07(file);
            File file2 = this.A00;
            C17960vV.A07(file2);
            return new C130356jI(r7, r0, file, file2, this.A02, this.A05);
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }
}
