package X;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2sv  reason: invalid class name and case insensitive filesystem */
public class C63352sv {
    public static final String[] A03;
    public final AnonymousClass118 A00;
    public final AnonymousClass181 A01;
    public final C18030ve A02;

    private List A00(String str) {
        File[] listFiles;
        File A04 = A04(false);
        if (A04.exists()) {
            File A0e = C17880vN.A0e(A04, "thumbnails");
            if (A0e.exists()) {
                File A0e2 = C17880vN.A0e(A0e, str);
                if (A0e2.exists() && (listFiles = A0e2.listFiles()) != null) {
                    Arrays.sort(listFiles, new C147027Rn(35));
                    return Arrays.asList(listFiles);
                }
            }
        }
        return AnonymousClass000.A13();
    }

    public C85274Mt A01() {
        File A04 = A04(false);
        if (!A04.exists() || !C17880vN.A0e(A04, "thumbnails").exists()) {
            return null;
        }
        List A002 = A00("light");
        Collections.sort(A002, new C147027Rn(34));
        return new C85274Mt(AnonymousClass000.A13(), A002);
    }

    public C85274Mt A02() {
        File A04 = A04(false);
        if (!A04.exists() || !C17880vN.A0e(A04, "thumbnails").exists()) {
            return null;
        }
        return new C85274Mt(A00("dark"), A00("light"));
    }

    public File A03(String str) {
        File A04 = A04(false);
        if (A04.exists()) {
            File A0e = C17880vN.A0e(A04, AnonymousClass000.A0y(".jpg", AnonymousClass000.A11(str)));
            if (A0e.exists()) {
                return A0e;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0087, code lost:
        if (r5.startsWith(X.AnonymousClass000.A0y("thumbnails-v3", r1)) != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fc, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0100, code lost:
        r6 = A04(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010f, code lost:
        if (r6.getName().equals("wallpaper-v3-1") == false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0111, code lost:
        r12 = A03;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0115, code lost:
        X.C64062u9.A0R(X.C17880vN.A0e(r11.A00.A00.getFilesDir(), X.AnonymousClass001.A1H("downloadable/", r12[r8], X.AnonymousClass000.A10())));
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0132, code lost:
        if (r8 >= 2) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (X.C64062u9.A0S(r6) != false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013b, code lost:
        com.whatsapp.util.Log.e("DownloadableWallpaperStorage/store/Could not prepare wallpaper subdirectory");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        X.C64062u9.A0I(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0147, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(X.AnonymousClass8BJ r18) {
        /*
            r17 = this;
            r3 = 0
            r11 = r17
            X.181 r2 = r11.A01     // Catch:{ IOException -> 0x016c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x016c }
            r0 = 17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x016c }
            r4 = r18
            X.9Hb r0 = r4.BMP(r2, r1, r0)     // Catch:{ IOException -> 0x016c }
            java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x016c }
            r4.<init>(r0)     // Catch:{ IOException -> 0x016c }
            r10 = 1
            java.io.File r7 = r11.A04(r10)     // Catch:{ all -> 0x0162 }
            boolean r0 = X.C64062u9.A0S(r7)     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Could not prepare temporary cache subdirectory"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0162 }
            goto L_0x015e
        L_0x002c:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r9 = new byte[r0]     // Catch:{ all -> 0x0162 }
            r15 = 0
            r8 = 0
        L_0x0033:
            java.util.zip.ZipEntry r12 = r4.getNextEntry()     // Catch:{ all -> 0x0162 }
            if (r12 == 0) goto L_0x0100
            java.lang.String r1 = r7.getCanonicalPath()     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = r12.getName()     // Catch:{ all -> 0x0162 }
            java.io.File r2 = X.C64062u9.A06(r1, r0)     // Catch:{ all -> 0x0162 }
            if (r2 == 0) goto L_0x0089
            boolean r0 = r2.isDirectory()     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x0089
            java.lang.String r5 = r2.getCanonicalPath()     // Catch:{ all -> 0x0162 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = r7.getCanonicalPath()     // Catch:{ all -> 0x0162 }
            r1.append(r0)     // Catch:{ all -> 0x0162 }
            r6 = 47
            r1.append(r6)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "thumbnails"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0162 }
            boolean r0 = r5.startsWith(r0)     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x008d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = r7.getCanonicalPath()     // Catch:{ all -> 0x0162 }
            r1.append(r0)     // Catch:{ all -> 0x0162 }
            r1.append(r6)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "thumbnails-v3"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0162 }
            boolean r0 = r5.startsWith(r0)     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x008d
        L_0x0089:
            r12.getName()     // Catch:{ all -> 0x0162 }
            goto L_0x0033
        L_0x008d:
            java.lang.String r0 = r2.getAbsolutePath()     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = X.C64062u9.A09(r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "jpg"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x00a3
            boolean r0 = r2.isDirectory()     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x0089
        L_0x00a3:
            java.io.File r1 = r2.getParentFile()     // Catch:{ all -> 0x0162 }
            if (r1 == 0) goto L_0x00b2
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x00b2
            r1.mkdirs()     // Catch:{ all -> 0x0162 }
        L_0x00b2:
            r13 = 0
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00de }
            r12.<init>(r2)     // Catch:{ FileNotFoundException -> 0x00de }
        L_0x00b9:
            int r1 = r4.read(r9)     // Catch:{ all -> 0x00d4 }
            r0 = -1
            if (r1 == r0) goto L_0x00d0
            r12.write(r9, r3, r1)     // Catch:{ all -> 0x00d4 }
            long r0 = (long) r1     // Catch:{ all -> 0x00d4 }
            long r13 = r13 + r0
            r5 = 8192(0x2000, double:4.0474E-320)
            long r5 = r5 + r13
            r1 = 5242880(0x500000, double:2.590327E-317)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00d0
            goto L_0x00b9
        L_0x00d0:
            r12.close()     // Catch:{ FileNotFoundException -> 0x00de }
            goto L_0x00e4
        L_0x00d4:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x00d9 }
            goto L_0x00dd
        L_0x00d9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x00de }
        L_0x00dd:
            throw r1     // Catch:{ FileNotFoundException -> 0x00de }
        L_0x00de:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperZipEntrySaver"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0162 }
        L_0x00e4:
            long r15 = r15 + r13
            r5 = 8192(0x2000, double:4.0474E-320)
            long r5 = r5 + r15
            r1 = 5242880(0x500000, double:2.590327E-317)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            goto L_0x00f7
        L_0x00f0:
            int r8 = r8 + 1
            r0 = 200(0xc8, float:2.8E-43)
            if (r8 <= r0) goto L_0x0033
            goto L_0x00fa
        L_0x00f7:
            java.lang.String r0 = "SafeZipEntrySaver: File being unzipped is too big."
            goto L_0x00fc
        L_0x00fa:
            java.lang.String r0 = "SafeZipEntrySaver: Too many files to unzip."
        L_0x00fc:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0162 }
            goto L_0x015e
        L_0x0100:
            java.io.File r6 = r11.A04(r3)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = r6.getName()     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "wallpaper-v3-1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x0135
            java.lang.String[] r12 = A03     // Catch:{ all -> 0x0162 }
            r9 = 2
            r8 = 0
        L_0x0115:
            r5 = r12[r8]     // Catch:{ all -> 0x0162 }
            X.118 r0 = r11.A00     // Catch:{ all -> 0x0162 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0162 }
            java.io.File r2 = r0.getFilesDir()     // Catch:{ all -> 0x0162 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "downloadable/"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r5, r1)     // Catch:{ all -> 0x0162 }
            java.io.File r0 = X.C17880vN.A0e(r2, r0)     // Catch:{ all -> 0x0162 }
            X.C64062u9.A0R(r0)     // Catch:{ all -> 0x0162 }
            int r8 = r8 + 1
            if (r8 >= r9) goto L_0x0135
            goto L_0x0115
        L_0x0135:
            boolean r0 = X.C64062u9.A0S(r6)     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x0141
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Could not prepare wallpaper subdirectory"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0162 }
            goto L_0x015e
        L_0x0141:
            X.C64062u9.A0I(r7, r6)     // Catch:{ IOException -> 0x0148 }
            r4.close()     // Catch:{ IOException -> 0x016c }
            return r10
        L_0x0148:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "DownloadableWallpaperStorage/store : move failed, from "
            r1.append(r0)     // Catch:{ all -> 0x0162 }
            r1.append(r7)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = " to "
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)     // Catch:{ all -> 0x0162 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0162 }
        L_0x015e:
            r4.close()     // Catch:{ IOException -> 0x016c }
            return r3
        L_0x0162:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0167 }
            goto L_0x016b
        L_0x0167:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x016c }
        L_0x016b:
            throw r1     // Catch:{ IOException -> 0x016c }
        L_0x016c:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Failed!"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63352sv.A05(X.8BJ):boolean");
    }

    public File A04(boolean z) {
        String str;
        File cacheDir;
        StringBuilder A11;
        if (AnonymousClass1J8.A01(this.A02)) {
            str = "wallpaper-v3-1";
        } else {
            str = "wallpaper";
        }
        Context context = this.A00.A00;
        if (!z) {
            cacheDir = context.getFilesDir();
            A11 = AnonymousClass000.A11("downloadable/");
        } else {
            cacheDir = context.getCacheDir();
            A11 = AnonymousClass000.A11("downloadable/");
            A11.append(str);
            str = "_tmp";
        }
        return C17880vN.A0e(cacheDir, AnonymousClass000.A0y(str, A11));
    }

    static {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "wallpaper-v3";
        A1Z[1] = "wallpaper";
        A03 = A1Z;
    }

    public C63352sv(AnonymousClass181 r1, AnonymousClass118 r2, C18030ve r3) {
        this.A02 = r3;
        this.A00 = r2;
        this.A01 = r1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:38|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("DownloadableWallpaperStorage/storeFullResolutionWallpaper : rename failed, from ");
        r1.append(r7);
        X.C17900vP.A0X(r2, " to ", r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0094 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(X.AnonymousClass8BJ r19, java.lang.String r20) {
        /*
            r18 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r20)
            java.lang.String r0 = ".jpg"
            java.lang.String r10 = X.AnonymousClass000.A0y(r0, r1)
            r3 = 0
            r11 = r18
            X.181 r2 = r11.A01     // Catch:{ IOException -> 0x00ba }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x00ba }
            r0 = 17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x00ba }
            r4 = r19
            X.9Hb r0 = r4.BMP(r2, r1, r0)     // Catch:{ IOException -> 0x00ba }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00ba }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00ba }
            r8 = 1
            java.io.File r1 = r11.A04(r8)     // Catch:{ all -> 0x00b0 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x003b
            boolean r0 = X.C64062u9.A0S(r1)     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Could not prepare temporary cache subdirectory"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00b0 }
            goto L_0x00ac
        L_0x003b:
            java.io.File r7 = X.C17880vN.A0e(r1, r10)     // Catch:{ all -> 0x00b0 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r9 = new byte[r0]     // Catch:{ all -> 0x00b0 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00a6 }
            r2.<init>(r7)     // Catch:{ FileNotFoundException -> 0x00a6 }
            r16 = 0
        L_0x004a:
            r14 = 8192(0x2000, double:4.0474E-320)
            long r12 = r16 + r14
            r5 = 2097152(0x200000, double:1.0361308E-317)
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x006d
            int r1 = r4.read(r9)     // Catch:{ all -> 0x0063 }
            r0 = -1
            if (r1 == r0) goto L_0x006d
            r2.write(r9, r3, r1)     // Catch:{ all -> 0x0063 }
            long r0 = (long) r1     // Catch:{ all -> 0x0063 }
            long r16 = r16 + r0
            goto L_0x004a
        L_0x0063:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x00a6 }
        L_0x006c:
            throw r1     // Catch:{ FileNotFoundException -> 0x00a6 }
        L_0x006d:
            r2.close()     // Catch:{ FileNotFoundException -> 0x00a6 }
            long r16 = r16 + r14
            int r0 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x007c
            java.lang.String r0 = "DownloadableWallpaperStorage: File being saved is too large."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00b0 }
            goto L_0x00ac
        L_0x007c:
            java.io.File r0 = r11.A04(r3)     // Catch:{ all -> 0x00b0 }
            java.io.File r2 = X.C17880vN.A0e(r0, r10)     // Catch:{ all -> 0x00b0 }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x008d
            r2.delete()     // Catch:{ all -> 0x00b0 }
        L_0x008d:
            X.C64062u9.A0I(r7, r2)     // Catch:{ IOException -> 0x0094 }
            r4.close()     // Catch:{ IOException -> 0x00ba }
            return r8
        L_0x0094:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "DownloadableWallpaperStorage/storeFullResolutionWallpaper : rename failed, from "
            r1.append(r0)     // Catch:{ all -> 0x00b0 }
            r1.append(r7)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = " to "
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ all -> 0x00b0 }
            goto L_0x00ac
        L_0x00a6:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperStorage/storeFullResolutionWallpaper/"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00b0 }
        L_0x00ac:
            r4.close()     // Catch:{ IOException -> 0x00ba }
            return r3
        L_0x00b0:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00b5 }
            goto L_0x00b9
        L_0x00b5:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x00ba }
        L_0x00b9:
            throw r1     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperStorage/storeFullResolutionWallpaper/Failed!"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63352sv.A06(X.8BJ, java.lang.String):boolean");
    }
}
