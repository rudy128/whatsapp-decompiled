package X;

import com.whatsapp.media.WamediaManager;
import java.io.File;

/* renamed from: X.71x  reason: invalid class name and case insensitive filesystem */
public class C1405471x {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public int A04;
    public final File A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARNING: Can't wrap try/catch for region: R(8:27|28|29|30|31|(3:33|34|(1:54))|47|48) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1405471x(com.whatsapp.media.WamediaManager r13, java.io.File r14, boolean r15) {
        /*
            r12 = this;
            java.lang.String r8 = ") "
            java.lang.String r2 = ") or height ("
            java.lang.String r4 = " "
            r12.<init>()
            r12.A05 = r14
            r12.A08 = r15
            X.DRK.A04(r14)     // Catch:{ IOException -> 0x0011 }
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            r12.A07 = r0
            r3 = 0
            if (r15 == 0) goto L_0x002c
            android.util.Pair r1 = X.C26511Sk.A0B(r14)
            int r0 = X.C108965cb.A01(r1)
            r12.A02 = r0
            int r0 = X.C108965cb.A00(r1)
            r12.A00 = r0
        L_0x0029:
            r12.A06 = r3
            return
        L_0x002c:
            if (r0 == 0) goto L_0x004b
            X.6gF r1 = X.DRK.A04(r14)     // Catch:{ Exception -> 0x003b }
            int r0 = r1.A01     // Catch:{ Exception -> 0x003b }
            r12.A02 = r0     // Catch:{ Exception -> 0x003b }
            int r0 = r1.A00     // Catch:{ Exception -> 0x003b }
            r12.A00 = r0     // Catch:{ Exception -> 0x003b }
            goto L_0x0029
        L_0x003b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "media_file not found: "
            X.C108995ce.A1J(r14, r0, r1, r2)
            X.Bw8 r0 = new X.Bw8
            r0.<init>()
            throw r0
        L_0x004b:
            java.lang.String r0 = "VideoMeta/constructor"
            X.5dc r3 = new X.5dc
            r3.<init>(r0)
            r3.A00(r14)     // Catch:{ Exception -> 0x0123 }
            boolean r0 = r13.hasGifTag(r14)     // Catch:{ all -> 0x015e }
            r12.A06 = r0     // Catch:{ all -> 0x015e }
            r0 = 9
            java.lang.String r7 = r3.extractMetadata(r0)     // Catch:{ all -> 0x015e }
            r0 = 18
            java.lang.String r10 = r3.extractMetadata(r0)     // Catch:{ all -> 0x015e }
            r0 = 19
            java.lang.String r9 = r3.extractMetadata(r0)     // Catch:{ all -> 0x015e }
            long r5 = java.lang.Long.parseLong(r7)     // Catch:{ Exception -> 0x0109 }
            r12.A03 = r5     // Catch:{ Exception -> 0x0109 }
            r0 = 0
            int r11 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r11 == 0) goto L_0x00e6
            int r4 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x0086 }
            r12.A02 = r4     // Catch:{ Exception -> 0x0086 }
            int r4 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x0086 }
            r12.A00 = r4     // Catch:{ Exception -> 0x0086 }
            goto L_0x00b5
        L_0x0086:
            r6 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x015e }
            java.lang.String r4 = "videometa/cannot parse width ("
            X.C17900vP.A0c(r4, r10, r2, r9, r5)     // Catch:{ all -> 0x015e }
            r5.append(r8)     // Catch:{ all -> 0x015e }
            A00(r12, r5)     // Catch:{ all -> 0x015e }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x015e }
            com.whatsapp.util.Log.w(r4, r6)     // Catch:{ all -> 0x015e }
            android.graphics.Bitmap r1 = r3.getFrameAtTime(r0)     // Catch:{ Exception | NoSuchMethodError -> 0x00d1 }
            if (r1 == 0) goto L_0x00d1
            int r0 = r1.getWidth()     // Catch:{ all -> 0x015e }
            r12.A02 = r0     // Catch:{ all -> 0x015e }
            int r1 = r1.getHeight()     // Catch:{ all -> 0x015e }
            r12.A00 = r1     // Catch:{ all -> 0x015e }
            int r0 = r12.A02     // Catch:{ all -> 0x015e }
            if (r0 == 0) goto L_0x0146
            if (r1 == 0) goto L_0x0146
        L_0x00b5:
            r0 = 20
            java.lang.String r0 = r3.extractMetadata(r0)     // Catch:{ Exception -> 0x00c1 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x00c1 }
            r12.A04 = r0     // Catch:{ Exception -> 0x00c1 }
        L_0x00c1:
            r0 = 24
            java.lang.String r0 = r3.extractMetadata(r0)     // Catch:{ Exception -> 0x00cd }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x00cd }
            r12.A01 = r0     // Catch:{ Exception -> 0x00cd }
        L_0x00cd:
            r3.close()
            return
        L_0x00d1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "videometa/cannot get frame"
            r1.append(r0)     // Catch:{ all -> 0x015e }
            A00(r12, r1)     // Catch:{ all -> 0x015e }
            X.C17890vO.A0w(r1)     // Catch:{ all -> 0x015e }
            X.Bw9 r0 = new X.Bw9     // Catch:{ all -> 0x015e }
            r0.<init>()     // Catch:{ all -> 0x015e }
            goto L_0x015d
        L_0x00e6:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "videometa/no duration:"
            X.C17890vO.A10(r0, r7, r4, r2)     // Catch:{ all -> 0x015e }
            java.lang.String r0 = r14.getAbsolutePath()     // Catch:{ all -> 0x015e }
            r2.append(r0)     // Catch:{ all -> 0x015e }
            r2.append(r4)     // Catch:{ all -> 0x015e }
            long r0 = r14.length()     // Catch:{ all -> 0x015e }
            r2.append(r0)     // Catch:{ all -> 0x015e }
            X.C17890vO.A0w(r2)     // Catch:{ all -> 0x015e }
            X.Bw9 r0 = new X.Bw9     // Catch:{ all -> 0x015e }
            r0.<init>()     // Catch:{ all -> 0x015e }
            goto L_0x015d
        L_0x0109:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "videometa/cannot parse duration:"
            X.C17890vO.A10(r0, r7, r4, r1)     // Catch:{ all -> 0x015e }
            A00(r12, r1)     // Catch:{ all -> 0x015e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x015e }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x015e }
            X.Bw9 r0 = new X.Bw9     // Catch:{ all -> 0x015e }
            r0.<init>()     // Catch:{ all -> 0x015e }
            goto L_0x015d
        L_0x0123:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "videometa/cannot process file:"
            r1.append(r0)     // Catch:{ all -> 0x015e }
            A00(r12, r1)     // Catch:{ all -> 0x015e }
            r1.append(r4)     // Catch:{ all -> 0x015e }
            java.io.File r0 = r12.A05     // Catch:{ all -> 0x015e }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x015e }
            java.lang.String r0 = X.AnonymousClass3MY.A0r(r1, r0)     // Catch:{ all -> 0x015e }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x015e }
            X.Bw9 r0 = new X.Bw9     // Catch:{ all -> 0x015e }
            r0.<init>()     // Catch:{ all -> 0x015e }
            goto L_0x015d
        L_0x0146:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "videometa/bad width ("
            X.C17900vP.A0c(r0, r10, r2, r9, r1)     // Catch:{ all -> 0x015e }
            r1.append(r8)     // Catch:{ all -> 0x015e }
            A00(r12, r1)     // Catch:{ all -> 0x015e }
            X.C17890vO.A0w(r1)     // Catch:{ all -> 0x015e }
            X.Bw9 r0 = new X.Bw9     // Catch:{ all -> 0x015e }
            r0.<init>()     // Catch:{ all -> 0x015e }
        L_0x015d:
            throw r0     // Catch:{ all -> 0x015e }
        L_0x015e:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0163 }
            throw r1
        L_0x0163:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1405471x.<init>(com.whatsapp.media.WamediaManager, java.io.File, boolean):void");
    }

    public static void A00(C1405471x r3, StringBuilder sb) {
        File file = r3.A05;
        sb.append(file.getAbsolutePath());
        sb.append(" ");
        sb.append(file.length());
    }

    public int A01() {
        int i = this.A04;
        if (i != 0) {
            return i;
        }
        long j = this.A03;
        if (j != 0) {
            return (int) ((this.A05.length() * 8000) / j);
        }
        return 0;
    }

    public boolean A02() {
        return AnonymousClass000.A1T(Math.abs(this.A01 % 180), 90);
    }

    public C1405471x(WamediaManager wamediaManager, File file) {
        this(wamediaManager, file, false);
    }
}
