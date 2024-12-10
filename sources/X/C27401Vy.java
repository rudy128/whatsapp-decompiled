package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1Vy  reason: invalid class name and case insensitive filesystem */
public class C27401Vy {
    public final C218617r A00;
    public final AnonymousClass1L7 A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass118 A03;
    public final C219217x A04;
    public final C19830z4 A05;
    public final C27371Vv A06;
    public final C27391Vx A07;
    public final AnonymousClass190 A08;
    public final AnonymousClass1NM A09;
    public final C18030ve A0A;
    public final AnonymousClass10I A0B;
    public final AnonymousClass00H A0C;

    public static Uri A00(String str, String str2, String str3) {
        Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.whatsapp.provider.MigrationContentProvider").appendPath("media");
        if (str != null) {
            appendPath.appendQueryParameter("query_param_country_code", str);
        }
        if (str2 != null) {
            appendPath.appendQueryParameter("query_param_phone_number", str2);
        }
        if (str3 != null) {
            appendPath.appendQueryParameter("path", str3);
        }
        return appendPath.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0039, code lost:
        if (r26.A0n().equals(((android.content.SharedPreferences) r4.get()).getString("registration_sibling_app_phone_number", (java.lang.String) null)) == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r27 = this;
            java.lang.String r0 = "MediaMigrationUtil/moveMediaIfNeeded/moveMediaFromSisterApp"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = r27
            X.0z4 r0 = r7.A05
            r26 = r0
            java.lang.String r2 = r26.A0l()
            X.00H r4 = r0.A00
            java.lang.Object r1 = r4.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "registration_sibling_app_country_code"
            r3 = 0
            java.lang.String r0 = r1.getString(r0, r3)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.String r2 = r26.A0n()
            java.lang.Object r1 = r4.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "registration_sibling_app_phone_number"
            java.lang.String r0 = r1.getString(r0, r3)
            boolean r0 = r2.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaMigrationUtil/shouldMoveAllMediaFromOtherApp/samePhoneNumberAsOtherApp= "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 != 0) goto L_0x0063
            X.1Vv r1 = r7.A06
            r0 = 3
            X.1Vw r1 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05 = r0
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/did-not-move-phone-number-not-matched"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0063:
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/moving media from sister app"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.17r r0 = r7.A00
            r0.A0h()
            java.lang.String r3 = "Media"
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r1 = "WhatsApp Business"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r3)
            X.1L7 r0 = r7.A01
            r25 = r0
            java.io.File r8 = r25.A05()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/moving from= "
            r1.append(r0)
            java.lang.String r0 = r2.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = " and to= "
            r1.append(r0)
            java.lang.String r0 = r8.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.17x r6 = r7.A04
            boolean r0 = r6.A0G()
            if (r0 != 0) goto L_0x00c4
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/destination-permission-not-granted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Vv r1 = r7.A06
            r0 = 6
        L_0x00bb:
            X.1Vw r1 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05 = r0
            return
        L_0x00c4:
            X.118 r0 = r7.A03
            android.content.Context r5 = r0.A00
            java.lang.String[] r4 = X.AnonymousClass73I.A04()
            int r3 = r4.length
            r1 = 0
        L_0x00ce:
            if (r1 >= r3) goto L_0x00e4
            r0 = r4[r1]
            boolean r0 = X.C219217x.A01(r5, r0)
            if (r0 != 0) goto L_0x00e1
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/origin-permission-not-granted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Vv r1 = r7.A06
            r0 = 5
            goto L_0x00bb
        L_0x00e1:
            int r1 = r1 + 1
            goto L_0x00ce
        L_0x00e4:
            boolean r0 = A01(r8)
            if (r0 != 0) goto L_0x00f3
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/destination-folder-not-empty-did-not-move"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Vv r1 = r7.A06
            r0 = 2
            goto L_0x00bb
        L_0x00f3:
            boolean r0 = X.AnonymousClass1L7.A02()
            if (r0 != 0) goto L_0x0108
            boolean r0 = A01(r2)
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/origin-folder-is-empty-nothing-to-move"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Vv r1 = r7.A06
            r0 = 4
            goto L_0x00bb
        L_0x0108:
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/all-conditions-are-met"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            X.C64062u9.A0K(r8, r0)
            java.io.File r0 = r25.A05()
            r0.mkdir()
            boolean r0 = X.AnonymousClass1L7.A02()
            if (r0 != 0) goto L_0x0133
            boolean r0 = r6.A0G()
            if (r0 == 0) goto L_0x0133
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0133
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0133
            r2.listFiles()
        L_0x0133:
            java.lang.String r1 = r26.A0l()
            java.lang.String r0 = r26.A0n()
            r10 = 0
            android.net.Uri r1 = A00(r1, r0, r10)
            X.11C r0 = r7.A02     // Catch:{ Exception -> 0x02ad }
            r24 = r0
            X.11B r0 = r24.A0O()     // Catch:{ Exception -> 0x02ad }
            r3 = r10
            r4 = r10
            r5 = r10
            r2 = r10
            android.database.Cursor r13 = r0.A03(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x02ad }
            if (r13 == 0) goto L_0x02b1
            int r9 = r13.getCount()     // Catch:{ all -> 0x02a3 }
            if (r9 != 0) goto L_0x015f
            java.lang.String r0 = "MediaMigrationUtil/moveMediaWithContentProvider/origin-folder-is-empty-nothing-to-move"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02a3 }
            goto L_0x029f
        L_0x015f:
            X.1Vx r8 = r7.A07     // Catch:{ all -> 0x02a3 }
            X.1KB r12 = r8.A02     // Catch:{ all -> 0x02a3 }
            java.lang.Runnable r11 = r8.A03     // Catch:{ all -> 0x02a3 }
            r0 = 500(0x1f4, double:2.47E-321)
            r12.A0K(r11, r0)     // Catch:{ all -> 0x02a3 }
            r6 = 0
            r5 = 0
        L_0x016c:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x028e
            r0 = 0
            java.lang.String r4 = r13.getString(r0)     // Catch:{ all -> 0x02a3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a3 }
            r1.<init>()     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = "MediaMigrationUtil/moveMediaWithContentProvider/file = "
            r1.append(r0)     // Catch:{ all -> 0x02a3 }
            r1.append(r4)     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02a3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02a3 }
            java.io.File r0 = r25.A05()     // Catch:{ all -> 0x02a3 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x02a3 }
            r1.<init>(r0, r4)     // Catch:{ all -> 0x02a3 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x02a3 }
            r17 = 0
            if (r0 == 0) goto L_0x01bf
            boolean r0 = r1.delete()     // Catch:{ all -> 0x02a3 }
            if (r0 != 0) goto L_0x01bf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a3 }
            r2.<init>()     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFile/file = "
            r2.append(r0)     // Catch:{ all -> 0x02a3 }
            r2.append(r1)     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = " already exists"
            r2.append(r0)     // Catch:{ all -> 0x02a3 }
        L_0x01b4:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x02a3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02a3 }
            if (r17 != 0) goto L_0x0286
            goto L_0x0270
        L_0x01bf:
            X.11B r3 = r24.A0O()     // Catch:{ IOException | SecurityException -> 0x0245 }
            java.lang.String r2 = r26.A0l()     // Catch:{ IOException | SecurityException -> 0x0245 }
            java.lang.String r0 = r26.A0n()     // Catch:{ IOException | SecurityException -> 0x0245 }
            android.net.Uri r2 = A00(r2, r0, r4)     // Catch:{ IOException | SecurityException -> 0x0245 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r16 = r3.A06(r2, r0)     // Catch:{ IOException | SecurityException -> 0x0245 }
            if (r16 == 0) goto L_0x0270
            java.io.FileDescriptor r0 = r16.getFileDescriptor()     // Catch:{ all -> 0x023b }
            if (r0 == 0) goto L_0x0237
            java.io.File r0 = r1.getParentFile()     // Catch:{ all -> 0x023b }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x023b }
            r0.mkdirs()     // Catch:{ all -> 0x023b }
            java.io.FileOutputStream r15 = new java.io.FileOutputStream     // Catch:{ all -> 0x023b }
            r15.<init>(r1)     // Catch:{ all -> 0x023b }
            java.io.FileDescriptor r0 = r16.getFileDescriptor()     // Catch:{ all -> 0x022d }
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ all -> 0x022d }
            r14.<init>(r0)     // Catch:{ all -> 0x022d }
            java.nio.channels.FileChannel r18 = r14.getChannel()     // Catch:{ all -> 0x0223 }
            java.nio.channels.WritableByteChannel r23 = java.nio.channels.Channels.newChannel(r15)     // Catch:{ all -> 0x0223 }
            r19 = 0
        L_0x01ff:
            long r1 = r18.size()     // Catch:{ all -> 0x0223 }
            int r0 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x021a
            long r2 = r18.size()     // Catch:{ all -> 0x0223 }
            long r2 = r2 - r19
            r0 = 131072(0x20000, double:6.47582E-319)
            long r21 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x0223 }
            r18.transferTo(r19, r21, r23)     // Catch:{ all -> 0x0223 }
            long r19 = r19 + r0
            goto L_0x01ff
        L_0x021a:
            r14.close()     // Catch:{ all -> 0x022d }
            r15.close()     // Catch:{ all -> 0x023b }
            r17 = 1
            goto L_0x0237
        L_0x0223:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0228 }
            goto L_0x022c
        L_0x0228:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x022d }
        L_0x022c:
            throw r1     // Catch:{ all -> 0x022d }
        L_0x022d:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0232 }
            goto L_0x0236
        L_0x0232:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x023b }
        L_0x0236:
            throw r1     // Catch:{ all -> 0x023b }
        L_0x0237:
            r16.close()     // Catch:{ IOException | SecurityException -> 0x0245 }
            goto L_0x0249
        L_0x023b:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0240 }
            goto L_0x0244
        L_0x0240:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException | SecurityException -> 0x0245 }
        L_0x0244:
            throw r1     // Catch:{ IOException | SecurityException -> 0x0245 }
        L_0x0245:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x02a3 }
        L_0x0249:
            if (r17 == 0) goto L_0x0270
            X.11B r2 = r24.A0O()     // Catch:{ all -> 0x02a3 }
            java.lang.String r1 = r26.A0l()     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = r26.A0n()     // Catch:{ all -> 0x02a3 }
            android.net.Uri r0 = A00(r1, r0, r4)     // Catch:{ all -> 0x02a3 }
            int r0 = r2.A01(r0, r10, r10)     // Catch:{ all -> 0x02a3 }
            if (r0 > 0) goto L_0x0286
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a3 }
            r2.<init>()     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = "MediaMigrationUtil/deleteMediaFile/Could not delete "
            r2.append(r0)     // Catch:{ all -> 0x02a3 }
            r2.append(r4)     // Catch:{ all -> 0x02a3 }
            goto L_0x01b4
        L_0x0270:
            int r6 = r6 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a3 }
            r1.<init>()     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = "MediaMigrationUtil/moveMediaWithContentProvider/Failed to move file = "
            r1.append(r0)     // Catch:{ all -> 0x02a3 }
            r1.append(r4)     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02a3 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x02a3 }
        L_0x0286:
            int r5 = r5 + 1
            r8.A00 = r5     // Catch:{ all -> 0x02a3 }
            r8.A01 = r9     // Catch:{ all -> 0x02a3 }
            goto L_0x016c
        L_0x028e:
            float r1 = (float) r6     // Catch:{ all -> 0x02a3 }
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            float r0 = (float) r9     // Catch:{ all -> 0x02a3 }
            float r1 = r1 / r0
            double r1 = (double) r1     // Catch:{ all -> 0x02a3 }
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x029f
            r13.close()     // Catch:{ Exception -> 0x02ad }
            goto L_0x02bc
        L_0x029f:
            r13.close()     // Catch:{ Exception -> 0x02ad }
            goto L_0x02b1
        L_0x02a3:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x02a8 }
            goto L_0x02ac
        L_0x02a8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x02ad }
        L_0x02ac:
            throw r1     // Catch:{ Exception -> 0x02ad }
        L_0x02ad:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x02da }
        L_0x02b1:
            X.1Vx r0 = r7.A07
            X.1KB r1 = r0.A02
            java.lang.Runnable r0 = r0.A03
            r1.A0I(r0)
            r2 = 0
            goto L_0x02c0
        L_0x02bc:
            r12.A0I(r11)
            r2 = 1
        L_0x02c0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/successfully-renamed = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Vv r1 = r7.A06
            r0 = r2 ^ 1
            goto L_0x00bb
        L_0x02da:
            r2 = move-exception
            X.1Vx r0 = r7.A07
            X.1KB r1 = r0.A02
            java.lang.Runnable r0 = r0.A03
            r1.A0I(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27401Vy.A02():void");
    }

    public C27401Vy(AnonymousClass190 r1, C218617r r2, AnonymousClass1L7 r3, AnonymousClass1NM r4, AnonymousClass11C r5, AnonymousClass118 r6, C219217x r7, C19830z4 r8, C18030ve r9, C27371Vv r10, C27391Vx r11, AnonymousClass10I r12, AnonymousClass00H r13) {
        this.A0A = r9;
        this.A03 = r6;
        this.A0B = r12;
        this.A08 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A0C = r13;
        this.A02 = r5;
        this.A09 = r4;
        this.A04 = r7;
        this.A05 = r8;
        this.A06 = r10;
        this.A07 = r11;
    }

    public static boolean A01(File file) {
        StringBuilder sb;
        String str;
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MediaMigrationUtil/mediaFolderIsEmpty/no-files-in-folder: ");
            sb2.append(file);
            Log.i(sb2.toString());
        } else {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory() && !A01(file2)) {
                    sb = new StringBuilder();
                    str = "MediaMigrationUtil/mediaFolderIsEmpty/is-directory-and-contain-media-file-name: ";
                } else if (file2.isDirectory() || ".nomedia".equals(file2.getName())) {
                    i++;
                } else {
                    sb = new StringBuilder();
                    str = "MediaMigrationUtil/mediaFolderIsEmpty/is-file-and-is-media-file-file-name: ";
                }
                sb.append(str);
                sb.append(file2);
                Log.i(sb.toString());
                return false;
            }
        }
        return true;
    }
}
