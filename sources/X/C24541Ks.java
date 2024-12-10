package X;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Ks  reason: invalid class name and case insensitive filesystem */
public class C24541Ks extends C24531Kr {
    public final SparseArray A00 = new SparseArray();
    public final C18180vt A01 = new C18180vt(1, 1000, 100000, false);
    public final C24501Ko A02;
    public final Set A03 = new HashSet();
    public final C18180vt A04 = new C18180vt(1, 1000, 100000, false);
    public final C18180vt A05 = new C18180vt(1, 1000, 100000, false);
    public final Map A06 = new HashMap();

    public static synchronized void A04(C24541Ks r11, String str, int i) {
        synchronized (r11) {
            if (!TextUtils.isEmpty(str)) {
                File A032 = A03(r11, str, i, false);
                if (!A032.exists()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DoodleEmojiManager/loadFilePaths subdirectory for bundle=");
                    sb.append(i);
                    sb.append(" hash=");
                    sb.append(str);
                    sb.append(" doesn't exist");
                    Log.e(sb.toString());
                } else {
                    String[] list = A032.list();
                    if (list == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("DoodleEmojiManager/loadFilePaths no files found in ");
                        sb2.append(A032);
                        Log.e(sb2.toString());
                    } else {
                        String absolutePath = A032.getAbsolutePath();
                        for (String str2 : list) {
                            int parseInt = Integer.parseInt(str2.split("\\.")[0].split("e")[1]);
                            SparseArray sparseArray = r11.A00;
                            if (C64062u9.A09(str2).equals("obi")) {
                                C24501Ko r2 = r11.A02;
                                Set set = r2.A00;
                                if (set == null) {
                                    set = new HashSet(Collections.emptyList());
                                    r2.A00 = set;
                                }
                                if (set.contains(Integer.valueOf(parseInt))) {
                                    if (!C18020vd.A05(C18040vf.A02, r2.A01, 2025)) {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else if (sparseArray.indexOfKey(parseInt) >= 0) {
                                continue;
                            }
                            sparseArray.put(parseInt, new File(absolutePath, str2));
                        }
                        r11.A03.add(Integer.valueOf(i));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A01, 2025) == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d5, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01a7, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap A0E(X.C72233Ld r12, int r13) {
        /*
            r11 = this;
            r10 = r11
            monitor-enter(r10)
            r9 = 0
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r0 = 1
        L_0x0007:
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x01aa }
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x01aa }
            r7.<init>()     // Catch:{ all -> 0x01aa }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x01aa }
            r7.inPreferredConfig = r0     // Catch:{ all -> 0x01aa }
            int r5 = r13 / 100
            boolean r0 = r11.A0C(r5)     // Catch:{ all -> 0x01aa }
            r3 = 0
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "DoodleEmojiManager/getBitmap/Downloadable files are not ready and getBitmap is called"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01aa }
            r11.A0G(r12, r5)     // Catch:{ all -> 0x01aa }
            monitor-exit(r10)
            return r3
        L_0x0026:
            android.util.SparseArray r0 = r11.A00     // Catch:{ all -> 0x01a8 }
            java.lang.Object r4 = r0.get(r13)     // Catch:{ all -> 0x01a8 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x01a8 }
            if (r4 == 0) goto L_0x00fb
            boolean r0 = r4.exists()     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x00fb
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00e0 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x00e0 }
            java.lang.String r0 = r4.getPath()     // Catch:{ all -> 0x00d6 }
            java.lang.String r1 = X.C64062u9.A09(r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "obi"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x00cd
            X.1Ko r6 = r11.A02     // Catch:{ all -> 0x00d6 }
            java.util.Set r1 = r6.A00     // Catch:{ all -> 0x00d6 }
            if (r1 != 0) goto L_0x005c
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00d6 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x00d6 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d6 }
            r6.A00 = r1     // Catch:{ all -> 0x00d6 }
        L_0x005c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x00d6 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x0073
            X.0ve r2 = r6.A01     // Catch:{ all -> 0x00d6 }
            r1 = 2025(0x7e9, float:2.838E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x00d6 }
            boolean r1 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x00d6 }
            r0 = 1
            if (r1 != 0) goto L_0x0074
        L_0x0073:
            r0 = 0
        L_0x0074:
            if (r0 == 0) goto L_0x00cd
            int r2 = r5.available()     // Catch:{ IOException -> 0x00b1 }
            X.1Kp r1 = r6.A03     // Catch:{ IOException -> 0x00b1 }
            r0 = 12288(0x3000, float:1.7219E-41)
            int r0 = java.lang.Math.max(r2, r0)     // Catch:{ IOException -> 0x00b1 }
            X.1Kp r8 = X.C60952os.A00     // Catch:{ IOException -> 0x00b1 }
            java.nio.ByteBuffer r7 = r8.A00(r0)     // Catch:{ IOException -> 0x00b1 }
            byte[] r0 = r7.array()     // Catch:{ all -> 0x00ac }
            r5.read(r0)     // Catch:{ all -> 0x00ac }
            byte[] r0 = r7.array()     // Catch:{ all -> 0x00ac }
            com.whatsapp.superpack.WhatsAppObiInputStream r2 = com.whatsapp.superpack.WhatsAppObiInputStream.openBytes(r0, r9, r2)     // Catch:{ all -> 0x00ac }
            android.graphics.Bitmap r0 = X.C60952os.A00(r1, r2)     // Catch:{ all -> 0x00a2 }
            r2.close()     // Catch:{ all -> 0x00ac }
            r8.A01(r7)     // Catch:{ IOException -> 0x00b1 }
            goto L_0x00c9
        L_0x00a2:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00a7 }
            goto L_0x00ab
        L_0x00a7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00ac }
        L_0x00ab:
            throw r1     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            r8.A01(r7)     // Catch:{ IOException -> 0x00b1 }
            throw r0     // Catch:{ IOException -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00d6 }
            X.2Fe r2 = new X.2Fe     // Catch:{ all -> 0x00d6 }
            r2.<init>()     // Catch:{ all -> 0x00d6 }
            r2.A02 = r0     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "doodle_emoji"
            r2.A01 = r0     // Catch:{ all -> 0x00d6 }
            X.0vt r1 = X.C24501Ko.A04     // Catch:{ all -> 0x00d6 }
            X.18K r0 = r6.A02     // Catch:{ all -> 0x00d6 }
            r0.CC6(r2, r1)     // Catch:{ all -> 0x00d6 }
            r0 = 0
        L_0x00c9:
            r5.close()     // Catch:{ IOException -> 0x00e0 }
            goto L_0x00d4
        L_0x00cd:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r5, r3, r7)     // Catch:{ all -> 0x00d6 }
            r5.close()     // Catch:{ IOException -> 0x00e0 }
        L_0x00d4:
            monitor-exit(r10)
            return r0
        L_0x00d6:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00db }
            goto L_0x00df
        L_0x00db:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x00e0 }
        L_0x00df:
            throw r1     // Catch:{ IOException -> 0x00e0 }
        L_0x00e0:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01aa }
            r1.<init>()     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = "DoodleEmojiManager/getBitmap/Could not get bitmap from downloaded file for "
            r1.append(r0)     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x01aa }
            r1.append(r0)     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01aa }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x01aa }
            monitor-exit(r10)
            return r3
        L_0x00fb:
            r11.A0A(r9, r5)     // Catch:{ all -> 0x01aa }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01aa }
            r1.<init>()     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = "DoodleEmojiManager/getBitmap/Error getting downloaded file to compute bitmap for emojiId="
            r1.append(r0)     // Catch:{ all -> 0x01aa }
            r1.append(r13)     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01aa }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01aa }
            X.0ve r2 = r11.A0A     // Catch:{ all -> 0x01aa }
            r1 = 12465(0x30b1, float:1.7467E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x01aa }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x01aa }
            if (r0 != 0) goto L_0x0120
            monitor-exit(r10)
            return r3
        L_0x0120:
            X.0vt r0 = r11.A05     // Catch:{ all -> 0x01aa }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x0133
            X.190 r2 = r11.A03     // Catch:{ all -> 0x01aa }
            java.lang.String r1 = "DoodleEmojiManager/getBitmap/Error getting downloaded file to compute bitmap for emoji"
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01aa }
            r2.A0G(r1, r0, r9)     // Catch:{ all -> 0x01aa }
        L_0x0133:
            java.util.Map r2 = r11.A06     // Catch:{ all -> 0x01aa }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x01aa }
            boolean r0 = r2.containsKey(r1)     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x014a
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x01aa }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01aa }
            int r4 = r0.intValue()     // Catch:{ all -> 0x01aa }
            goto L_0x014b
        L_0x014a:
            r4 = 0
        L_0x014b:
            r0 = 3
            if (r4 >= r0) goto L_0x0193
            int r0 = r4 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01aa }
            r2.put(r1, r0)     // Catch:{ all -> 0x01aa }
            java.util.Set r0 = r11.A03     // Catch:{ all -> 0x01aa }
            r0.clear()     // Catch:{ all -> 0x01aa }
            X.2rg r2 = r11.A06()     // Catch:{ all -> 0x01aa }
            r0 = -1
            r1 = 0
            if (r5 == r0) goto L_0x0165
            r1 = 1
        L_0x0165:
            java.lang.String r0 = "Can not delete id hash bundle"
            X.C17960vV.A0G(r1, r0)     // Catch:{ all -> 0x01aa }
            java.util.Map r1 = r2.A03     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x01aa }
            r1.remove(r0)     // Catch:{ all -> 0x01aa }
            r11.A0G(r12, r5)     // Catch:{ all -> 0x01aa }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01aa }
            r1.<init>()     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = "DoodleEmojiManager/getBitmap/Downloadable files are corrupt retry for bundle "
            r1.append(r0)     // Catch:{ all -> 0x01aa }
            r1.append(r5)     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = " number = "
            r1.append(r0)     // Catch:{ all -> 0x01aa }
            r1.append(r4)     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01aa }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01aa }
            goto L_0x01a6
        L_0x0193:
            X.0vt r0 = r11.A04     // Catch:{ all -> 0x01aa }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x01a6
            X.190 r2 = r11.A03     // Catch:{ all -> 0x01aa }
            java.lang.String r1 = "DoodleEmojiManager/getBitmap/Error limit exceeded for bundle"
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01aa }
            r2.A0G(r1, r0, r9)     // Catch:{ all -> 0x01aa }
        L_0x01a6:
            monitor-exit(r10)
            return r3
        L_0x01a8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01aa }
        L_0x01aa:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24541Ks.A0E(X.3Ld, int):android.graphics.Bitmap");
    }

    public synchronized void A0F(int i) {
        C62612rg A062;
        if (!this.A03.contains(Integer.valueOf(i)) && (A062 = A06()) != null) {
            A04(this, A062.A03(i), i);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24541Ks(X.AnonymousClass190 r21, X.AnonymousClass181 r22, X.AnonymousClass11E r23, X.AnonymousClass11P r24, X.AnonymousClass118 r25, X.C24521Kq r26, X.C19830z4 r27, X.C24491Kn r28, X.C18030ve r29, X.AnonymousClass18K r30, X.AnonymousClass1D9 r31, X.C24481Km r32, X.C220418j r33, X.C24501Ko r34, X.AnonymousClass10I r35) {
        /*
            r20 = this;
            r5 = r20
            r18 = r33
            r17 = r32
            r19 = r35
            r7 = r22
            r6 = r21
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r15 = r30
            r16 = r31
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4 = 1
            r3 = 1000(0x3e8, float:1.401E-42)
            r2 = 100000(0x186a0, float:1.4013E-40)
            r1 = 0
            X.0vt r0 = new X.0vt
            r0.<init>(r4, r3, r2, r1)
            r5.A01 = r0
            X.0vt r0 = new X.0vt
            r0.<init>(r4, r3, r2, r1)
            r5.A04 = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r5.A00 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5.A03 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.A06 = r0
            X.0vt r0 = new X.0vt
            r0.<init>(r4, r3, r2, r1)
            r5.A05 = r0
            r0 = r34
            r5.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24541Ks.<init>(X.190, X.181, X.11E, X.11P, X.118, X.1Kq, X.0z4, X.1Kn, X.0ve, X.18K, X.1D9, X.1Km, X.18j, X.1Ko, X.10I):void");
    }

    public static File A03(C24541Ks r2, String str, int i, boolean z) {
        String str2;
        File filesDir = r2.A07.A00.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append("downloadable/doodle_emoji_");
        sb.append(i);
        sb.append("_");
        sb.append(str);
        if (z) {
            str2 = "_temp";
        } else {
            str2 = "";
        }
        sb.append(str2);
        return new File(filesDir, sb.toString());
    }

    public Map A0D(String str, String str2, String str3, int i) {
        Map A0D = super.A0D(str, str2, str3, i);
        A0D.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Integer.toString(i));
        return A0D;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.C72233Ld r7, int r8) {
        /*
            r6 = this;
            int r5 = r6.A05(r8)
            r4 = r6
            r3 = 0
            monitor-enter(r4)
            r1 = 5
            r2 = 1
            if (r5 == 0) goto L_0x0048
            if (r5 == r2) goto L_0x0039
            r0 = 2
            if (r5 == r0) goto L_0x0048
            r0 = 3
            if (r5 == r0) goto L_0x0039
            r0 = 4
            if (r5 == r0) goto L_0x0048
            if (r5 == r1) goto L_0x0073
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r2.<init>()     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "DoodleEmojiManager/getFilesAsyncFromState/Unexpected state "
            r2.append(r0)     // Catch:{ all -> 0x0086 }
            java.util.HashMap r1 = X.C24531Kr.A0J     // Catch:{ all -> 0x0086 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0086 }
            r2.append(r0)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0086 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0086 }
            goto L_0x006a
        L_0x0039:
            java.util.HashMap r1 = X.C24531Kr.A0J     // Catch:{ all -> 0x0086 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0086 }
            r1.get(r0)     // Catch:{ all -> 0x0086 }
            if (r7 == 0) goto L_0x0084
            r6.A0B(r7, r8)     // Catch:{ all -> 0x0086 }
            goto L_0x0084
        L_0x0048:
            boolean r0 = r6.A0C(r8)     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x0070
            X.0z4 r1 = r6.A08     // Catch:{ all -> 0x0086 }
            X.11E r0 = r6.A05     // Catch:{ all -> 0x0086 }
            int r0 = r0.A03(r2)     // Catch:{ all -> 0x0086 }
            int r0 = X.AnonymousClass2TA.A00(r1, r0)     // Catch:{ all -> 0x0086 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x006a
            r6.A0A(r2, r8)     // Catch:{ all -> 0x0086 }
            if (r7 == 0) goto L_0x0066
            r6.A0B(r7, r8)     // Catch:{ all -> 0x0086 }
        L_0x0066:
            r6.A09(r3, r8)     // Catch:{ all -> 0x0086 }
            goto L_0x0084
        L_0x006a:
            if (r7 == 0) goto L_0x0084
            r7.Bsl()     // Catch:{ all -> 0x0086 }
            goto L_0x0084
        L_0x0070:
            r6.A0A(r1, r8)     // Catch:{ all -> 0x0086 }
        L_0x0073:
            if (r7 == 0) goto L_0x0084
            boolean r0 = r6.A0C(r8)     // Catch:{ all -> 0x0086 }
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x0086 }
            r6.A0F(r8)     // Catch:{ all -> 0x0086 }
            android.util.SparseArray r0 = r6.A00     // Catch:{ all -> 0x0086 }
            r7.C2Y(r0)     // Catch:{ all -> 0x0086 }
        L_0x0084:
            monitor-exit(r4)
            return
        L_0x0086:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24541Ks.A0G(X.3Ld, int):void");
    }
}
