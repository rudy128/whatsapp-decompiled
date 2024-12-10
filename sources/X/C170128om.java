package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.8om  reason: invalid class name and case insensitive filesystem */
public final class C170128om extends AnonymousClass1NZ {
    public final AnonymousClass118 A00;
    public final AnonymousClass00H A01;
    public final C25141Na A02;

    public void A0I(Context context, C171768sF r23, File file) {
        int i;
        C171768sF r3 = r23;
        try {
            AnonymousClass118 r15 = this.A00;
            String canonicalPath = C17880vN.A0e(AnonymousClass8BR.A0t(r15), "Wallpapers").getCanonicalPath();
            HashSet BMw = this.A02.BMw();
            HashMap A11 = C17880vN.A11();
            Iterator it = BMw.iterator();
            while (it.hasNext()) {
                String lastPathSegment = Uri.parse(C17880vN.A0v(it)).getLastPathSegment();
                if (lastPathSegment != null) {
                    A11.put(lastPathSegment, C64062u9.A06(canonicalPath, lastPathSegment));
                }
            }
            if (!A11.isEmpty()) {
                File A0e = C17880vN.A0e(this.A02.A03(), "Wallpapers");
                if (!A0e.exists()) {
                    Log.e("OptimizedWallpaper/backup folder doesnt exist");
                    return;
                }
                Iterator it2 = A0N(A0e).iterator();
                int i2 = 0;
                int i3 = 0;
                while (it2.hasNext()) {
                    File A0T = AnonymousClass8BS.A0T(it2);
                    File file2 = (File) A11.get(C21721ArX.A04(A0T));
                    if (file2 != null) {
                        File parentFile = file2.getParentFile();
                        if (parentFile == null || parentFile.exists()) {
                            Log.w("OptimizedWallpaper/restore/restoreWallpapers/target file is null");
                        } else {
                            parentFile.mkdirs();
                        }
                        C18070vi.A0d(A0T, 0);
                        try {
                            C191639mv r2 = (C191639mv) this.A01.get();
                            AnonymousClass9JN A022 = AnonymousClass9JN.A02(A3K.A00(AnonymousClass8BS.A0i(A0T), C21721ArX.A04(A0T)));
                            if (A022 == null) {
                                A022 = AnonymousClass9JN.UNENCRYPTED;
                            }
                            C189869jz A07 = r2.A00((C19947A0e) null, A022, A0T, false).A07(r15, (B9V) null, file2, 0, 0, false);
                            C17900vP.A0Y(A07, "OptimizedWallpaper/restore/result ", AnonymousClass000.A10());
                            if (A07.A00 == 1) {
                                i3++;
                            }
                        } catch (C18130vo | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                            Log.w("OptimizedWallpaper/restore/error", e);
                        }
                        i2++;
                    }
                }
                if (r23 != null) {
                    if (i2 == 0) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    r3.A08 = i;
                    r3.A0O = C17880vN.A0n(i2);
                    r3.A0P = C17880vN.A0n(i3);
                }
            }
        } catch (IOException e2) {
            if (r23 != null) {
                r3.A08 = Integer.valueOf(A3O.A02(e2));
                Long A0L = C17890vO.A0L();
                r3.A0O = A0L;
                r3.A0P = A0L;
            }
            Log.e("OptimizedWallpaper/restore failed", e2);
        }
    }

    public ArrayList A0N(File file) {
        C18070vi.A0d(file, 0);
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return AnonymousClass000.A13();
        }
        List asList = Arrays.asList(listFiles);
        C18070vi.A0X(asList);
        return C17880vN.A10(asList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.io.File} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.A26 A0T(X.C171828sL r19, X.AnonymousClass9JN r20) {
        /*
            r18 = this;
            r2 = 0
            r1 = r19
            r5 = r20
            boolean r15 = X.C18070vi.A17(r5, r1)
            r0 = r18
            boolean r3 = r0.A0L()
            if (r3 != 0) goto L_0x002d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "OptimizedWallpaper/backup/sdcard_unavailable "
            r1.append(r0)
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            X.C17890vO.A1A(r1, r0)
            java.lang.String r14 = "wallpapers"
            r12 = 0
        L_0x0024:
            r16 = 0
            X.A26 r11 = new X.A26
            r13 = r12
            r11.<init>(r12, r13, r14, r15, r16)
            return r11
        L_0x002d:
            java.util.HashMap r10 = X.C17880vN.A11()
            X.1Na r3 = r0.A02
            java.util.HashSet r3 = r3.BMw()
            java.util.Iterator r6 = r3.iterator()
        L_0x003b:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0065
            java.lang.String r3 = X.C17880vN.A0v(r6)
            android.net.Uri r4 = android.net.Uri.parse(r3)
            java.lang.String r3 = r4.getPath()
            if (r3 == 0) goto L_0x003b
            java.lang.String r3 = r4.getPath()
            java.io.File r4 = X.C108945cZ.A17(r3)
            boolean r3 = r4.exists()
            if (r3 == 0) goto L_0x003b
            java.lang.String r3 = X.AnonymousClass8BS.A0i(r4)
            r10.put(r3, r4)
            goto L_0x003b
        L_0x0065:
            X.1L7 r3 = r0.A02
            java.io.File r4 = r3.A03()
            java.lang.String r3 = "Wallpapers"
            java.io.File r4 = X.C17880vN.A0e(r4, r3)
            X.AnonymousClass8BV.A1H(r4)
            java.io.File[] r9 = r4.listFiles()
            if (r9 == 0) goto L_0x0093
            int r8 = r9.length
            r7 = 0
        L_0x007c:
            if (r7 >= r8) goto L_0x0093
            r6 = r9[r7]
            X.C18070vi.A0b(r6)
            java.lang.String r3 = X.C21721ArX.A04(r6)
            boolean r3 = r10.containsKey(r3)
            if (r3 != 0) goto L_0x0090
            X.C64062u9.A0Q(r6)
        L_0x0090:
            int r7 = r7 + 1
            goto L_0x007c
        L_0x0093:
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L_0x009e
            java.lang.String r14 = "wallpapers"
            r12 = 0
            r15 = 3
            goto L_0x0024
        L_0x009e:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r14 = X.C17890vO.A0i(r10)
        L_0x00a6:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x016f
            java.util.Map$Entry r7 = X.AnonymousClass000.A16(r14)
            java.lang.String r6 = X.C17880vN.A0x(r7)
            java.lang.Object r11 = r7.getValue()
            java.io.File r11 = (java.io.File) r11
            X.C18070vi.A0d(r6, r15)
            java.lang.StringBuilder r7 = X.AnonymousClass000.A11(r6)
            java.lang.String r6 = X.A3K.A01(r5)
            java.io.File r8 = X.AnonymousClass8BW.A0X(r4, r6, r7)
            boolean r6 = r8.exists()
            if (r6 == 0) goto L_0x00f0
            long r12 = r11.lastModified()
            long r9 = r8.lastModified()
            int r6 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x00f0
            java.lang.String r6 = "OptimizedWallpaper/backupWallpapers/skip as source wallpaper file is older than backup file"
            com.whatsapp.util.Log.i((java.lang.String) r6)
            java.lang.String r10 = "wallpapers"
            r8 = 0
            r11 = 2
            r12 = 0
            X.A26 r7 = new X.A26
            r9 = r8
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x00ec:
            r3.add(r7)
            goto L_0x00a6
        L_0x00f0:
            X.C18070vi.A0d(r11, r15)
            X.00H r6 = r0.A01     // Catch:{ IOException -> 0x0157 }
            java.lang.Object r7 = r6.get()     // Catch:{ IOException -> 0x0157 }
            X.9mv r7 = (X.C191639mv) r7     // Catch:{ IOException -> 0x0157 }
            r6 = 0
            X.A5N r10 = r7.A00(r6, r5, r8, r2)     // Catch:{ IOException -> 0x0157 }
            X.118 r7 = r0.A00     // Catch:{ IOException -> 0x0157 }
            android.content.Context r9 = r7.A00     // Catch:{ IOException -> 0x0157 }
            boolean r7 = r10.A09(r9, r11)     // Catch:{ IOException -> 0x0157 }
            if (r7 == 0) goto L_0x0125
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0157 }
            java.lang.String r7 = "OptimizedWallpaper/createSingleFileBackupIfNeeded/skip backup because backup file "
            X.AnonymousClass8BV.A1J(r8, r7, r9)     // Catch:{ IOException -> 0x0157 }
            java.lang.String r7 = " has the same source file"
            X.C17890vO.A1A(r9, r7)     // Catch:{ IOException -> 0x0157 }
            java.lang.String r10 = "wallpapers"
            r11 = 2
            r12 = 0
            X.A26 r7 = new X.A26     // Catch:{ IOException -> 0x0157 }
            r8 = r6
            r9 = r6
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x0157 }
            goto L_0x00ec
        L_0x0125:
            boolean r7 = r10.A0A(r9, r11)     // Catch:{ IOException -> 0x0157 }
            if (r7 != 0) goto L_0x013d
            java.lang.String r7 = "OptimizedWallpaper/backup/failed to prepare for backup"
            com.whatsapp.util.Log.e((java.lang.String) r7)     // Catch:{ IOException -> 0x0157 }
            java.lang.String r10 = "wallpapers"
            r12 = 0
            X.A26 r7 = new X.A26     // Catch:{ IOException -> 0x0157 }
            r9 = r6
            r8 = r6
            r11 = r15
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x0157 }
            goto L_0x00ec
        L_0x013d:
            r10.A08(r6, r11)     // Catch:{ IOException -> 0x0157 }
            r8.getName()
            r8.length()
            java.lang.String r10 = "wallpapers"
            long r12 = r8.length()
            java.lang.Long r9 = X.C17890vO.A0L()
            X.A26 r7 = new X.A26
            r11 = r2
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x00ec
        L_0x0157:
            r8 = move-exception
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r6 = "OptimizedWallpaper/backup/failed to create single file backup. Error: "
            X.C108995ce.A1M(r6, r7, r8)
            java.lang.String r10 = "wallpapers"
            r8 = 0
            r12 = 0
            X.A26 r7 = new X.A26
            r9 = r8
            r11 = r15
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x00ec
        L_0x016f:
            java.util.LinkedHashMap r7 = X.C17880vN.A13()
            java.util.Iterator r6 = r3.iterator()
        L_0x0177:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01a6
            java.lang.Object r0 = r6.next()
            X.A26 r0 = (X.A26) r0
            int r0 = r0.A01
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Object r4 = r7.get(r5)
            if (r4 != 0) goto L_0x019a
            boolean r0 = r7.containsKey(r5)
            if (r0 != 0) goto L_0x019a
            X.4rD r4 = new X.4rD
            r4.<init>()
        L_0x019a:
            X.4rD r4 = (X.C98474rD) r4
            int r0 = r4.element
            int r0 = r0 + 1
            r4.element = r0
            r7.put(r5, r4)
            goto L_0x0177
        L_0x01a6:
            java.util.Iterator r4 = X.AnonymousClass000.A15(r7)
        L_0x01aa:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01b4
            X.AnonymousClass8BY.A1N(r4)
            goto L_0x01aa
        L_0x01b4:
            java.util.Map r5 = X.C41681wt.A03(r7)
            java.lang.Object r0 = X.AnonymousClass000.A0w(r5, r15)
            java.lang.Number r0 = (java.lang.Number) r0
            r4 = 0
            if (r0 == 0) goto L_0x0220
            java.lang.Long r0 = X.C17890vO.A0N(r0)
        L_0x01c5:
            r1.A0V = r0
            r0 = 2
            java.lang.Object r0 = X.AnonymousClass000.A0w(r5, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x021e
            java.lang.Long r0 = X.C17890vO.A0N(r0)
        L_0x01d4:
            r1.A0W = r0
            java.lang.Object r0 = X.AnonymousClass000.A0w(r5, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01e2
            java.lang.Long r4 = X.C17890vO.A0N(r0)
        L_0x01e2:
            r1.A0X = r4
            java.util.Iterator r2 = r3.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0233
            java.lang.Object r3 = r2.next()
        L_0x01f2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0222
            java.lang.Object r1 = r2.next()
            X.A26 r1 = (X.A26) r1
            X.A26 r3 = (X.A26) r3
            java.lang.String r6 = r3.A05
            int r7 = r3.A01
            int r0 = r1.A01
            if (r7 == r0) goto L_0x020e
            if (r7 == r15) goto L_0x020d
            r7 = 0
            if (r0 != r15) goto L_0x020e
        L_0x020d:
            r7 = 1
        L_0x020e:
            long r8 = r3.A02
            long r0 = r1.A02
            long r8 = r8 + r0
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r4 = 0
            X.A26 r3 = new X.A26
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x01f2
        L_0x021e:
            r0 = r4
            goto L_0x01d4
        L_0x0220:
            r0 = r4
            goto L_0x01c5
        L_0x0222:
            X.A26 r3 = (X.A26) r3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "OptimizedWallpaper/total size of backup is "
            r2.append(r0)
            long r0 = r3.A02
            X.C17890vO.A16(r2, r0)
            return r3
        L_0x0233:
            java.lang.String r1 = "Empty collection can't be reduced."
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170128om.A0T(X.8sL, X.9JN):X.A26");
    }

    public boolean A0S(C171768sF r2, File file) {
        Log.w("OptimizedWallpaper/restoreFile() should not be called");
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170128om(AnonymousClass118 r1, AnonymousClass1NX r2, C25141Na r3, AnonymousClass00H r4) {
        super(r2);
        C18070vi.A0o(r1, r4, r3);
        this.A00 = r1;
        this.A01 = r4;
        this.A02 = r3;
    }

    public String A0M() {
        return "wallpapers";
    }

    public void A0R(C171878sQ r2, double d) {
        r2.A0Z = Double.valueOf(d);
    }
}
