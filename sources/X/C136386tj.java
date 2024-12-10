package X;

import com.whatsapp.media.WamediaManager;

/* renamed from: X.6tj  reason: invalid class name and case insensitive filesystem */
public final class C136386tj {
    public final AnonymousClass190 A00;
    public final C190019kF A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass118 A03;
    public final C219317y A04;
    public final WamediaManager A05;
    public final AnonymousClass00H A06;

    /* JADX WARNING: type inference failed for: r2v4, types: [X.6oW, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a7, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02aa, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0186, code lost:
        if (r10.getShort(r2) <= 0) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0194, code lost:
        if (r2 <= 0) goto L_0x0196;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass725 A01(java.lang.String r27, java.lang.String r28) {
        /*
            r26 = this;
            r5 = 0
            r19 = 1
            r13 = r27
            boolean r0 = X.C64062u9.A0V(r13)
            if (r0 != 0) goto L_0x030b
            r12 = r28
            boolean r0 = X.C64062u9.A0V(r12)
            if (r0 != 0) goto L_0x02fd
            int r2 = r12.length()
            r0 = 128(0x80, float:1.794E-43)
            if (r2 > r0) goto L_0x02ea
            r11 = r26
            X.118 r0 = r11.A03
            android.content.Context r0 = r0.A00
            android.content.pm.PackageManager r4 = r0.getPackageManager()
            if (r4 == 0) goto L_0x02be
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r2 = r4.resolveContentProvider(r13, r3)
            if (r2 == 0) goto L_0x02be
            java.lang.String r1 = "com.whatsapp.sticker.READ"
            java.lang.String r0 = r2.readPermission
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02be
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            if (r0 == 0) goto L_0x02be
            java.lang.String r0 = r0.packageName     // Catch:{ NameNotFoundException -> 0x02ab }
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r0, r3)     // Catch:{ NameNotFoundException -> 0x02ab }
            java.lang.String r15 = r0.versionName     // Catch:{ NameNotFoundException -> 0x02ab }
            if (r15 == 0) goto L_0x02c7
            int r0 = r15.length()
            if (r0 == 0) goto L_0x02c7
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r14 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r14)
            android.net.Uri$Builder r1 = r0.authority(r13)
            java.lang.String r0 = "metadata"
            android.net.Uri r21 = X.C108985cd.A0D(r1, r0, r12)
            r0 = 9
            java.lang.String[] r10 = new java.lang.String[r0]
            java.lang.String r9 = "sticker_pack_identifier"
            r10[r5] = r9
            java.lang.String r8 = "sticker_pack_name"
            r10[r19] = r8
            r0 = 2
            java.lang.String r7 = "sticker_pack_publisher"
            r10[r0] = r7
            r0 = 3
            java.lang.String r6 = "sticker_pack_icon"
            r10[r0] = r6
            r0 = 4
            java.lang.String r5 = "android_play_store_link"
            r10[r0] = r5
            r0 = 5
            java.lang.String r4 = "ios_app_download_link"
            r10[r0] = r4
            r0 = 6
            java.lang.String r3 = "image_data_version"
            r10[r0] = r3
            r0 = 7
            java.lang.String r2 = "whatsapp_will_not_cache_stickers"
            r10[r0] = r2
            r0 = 8
            java.lang.String r1 = "animated_sticker_pack"
            r10[r0] = r1
            X.C18070vi.A0b(r21)
            X.11C r0 = r11.A02
            X.11B r20 = X.C108955ca.A0d(r0)
            r0 = 0
            r24 = r0
            r25 = r0
            r22 = r10
            r23 = r0
            android.database.Cursor r10 = r20.A03(r21, r22, r23, r24, r25)
            if (r10 == 0) goto L_0x02c7
            int r16 = r10.getCount()     // Catch:{ all -> 0x02a4 }
            if (r16 <= 0) goto L_0x02c4
            r10.moveToFirst()     // Catch:{ all -> 0x02a4 }
            java.lang.String r9 = X.C17890vO.A0S(r10, r9)     // Catch:{ all -> 0x02a4 }
            boolean r16 = r12.equals(r9)     // Catch:{ all -> 0x02a4 }
            if (r16 == 0) goto L_0x0289
            java.lang.String r18 = X.C17890vO.A0S(r10, r8)     // Catch:{ all -> 0x02a4 }
            java.lang.String r17 = X.C17890vO.A0S(r10, r7)     // Catch:{ all -> 0x02a4 }
            java.lang.String r6 = X.C17890vO.A0S(r10, r6)     // Catch:{ all -> 0x02a4 }
            boolean r8 = X.C64062u9.A0V(r6)     // Catch:{ all -> 0x02a4 }
            java.lang.String r7 = ", identifier: "
            java.lang.String r16 = "ThirdPartyStickerFetcher/tray image name: ("
            if (r8 == 0) goto L_0x00f3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r16)     // Catch:{ all -> 0x02a4 }
            r1.append(r6)     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = ") contains invalid characters, from authority: "
        L_0x00dc:
            r1.append(r0)     // Catch:{ all -> 0x02a4 }
            r1.append(r13)     // Catch:{ all -> 0x02a4 }
            X.C17900vP.A0e(r7, r12, r1)     // Catch:{ all -> 0x02a4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = "tray image name invalid, tray image name: "
            r1.append(r0)     // Catch:{ all -> 0x02a4 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r6, r1)     // Catch:{ all -> 0x02a4 }
        L_0x00f2:
            throw r0     // Catch:{ all -> 0x02a4 }
        L_0x00f3:
            if (r6 == 0) goto L_0x0269
            int r9 = r6.length()     // Catch:{ all -> 0x02a4 }
            r8 = 128(0x80, float:1.794E-43)
            if (r9 > r8) goto L_0x0269
            int r5 = r10.getColumnIndex(r5)     // Catch:{ all -> 0x02a4 }
            java.lang.String r7 = " is invalid"
            if (r5 <= 0) goto L_0x012a
            java.lang.String r5 = r10.getString(r5)     // Catch:{ all -> 0x02a4 }
            if (r5 == 0) goto L_0x012b
            int r8 = r5.length()     // Catch:{ all -> 0x02a4 }
            if (r8 == 0) goto L_0x012b
            java.lang.String r8 = "play.google.com"
            boolean r8 = X.C137446vT.A01(r5, r8)     // Catch:{ all -> 0x02a4 }
            if (r8 != 0) goto L_0x012b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = "play link: "
            r1.append(r0)     // Catch:{ all -> 0x02a4 }
            r1.append(r5)     // Catch:{ all -> 0x02a4 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r7, r1)     // Catch:{ all -> 0x02a4 }
            goto L_0x00f2
        L_0x012a:
            r5 = 0
        L_0x012b:
            int r4 = r10.getColumnIndex(r4)     // Catch:{ all -> 0x02a4 }
            if (r4 <= 0) goto L_0x015e
            java.lang.String r0 = r10.getString(r4)     // Catch:{ all -> 0x02a4 }
            if (r0 == 0) goto L_0x015e
            int r4 = r0.length()     // Catch:{ all -> 0x02a4 }
            if (r4 == 0) goto L_0x015e
            java.lang.String r4 = "itunes.apple.com"
            boolean r4 = X.C137446vT.A01(r0, r4)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x015e
            java.lang.String r4 = "apps.apple.com"
            boolean r4 = X.C137446vT.A01(r0, r4)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x015e
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02a4 }
            java.lang.String r1 = "apple store link: "
            r2.append(r1)     // Catch:{ all -> 0x02a4 }
            r2.append(r0)     // Catch:{ all -> 0x02a4 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r7, r2)     // Catch:{ all -> 0x02a4 }
            goto L_0x00f2
        L_0x015e:
            java.lang.String r4 = ""
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x02a4 }
            if (r3 <= 0) goto L_0x017b
            java.lang.String r4 = r10.getString(r3)     // Catch:{ all -> 0x02a4 }
            X.C18070vi.A0X(r4)     // Catch:{ all -> 0x02a4 }
            int r3 = r4.length()     // Catch:{ all -> 0x02a4 }
            if (r3 != 0) goto L_0x017b
            java.lang.String r0 = "image_data_version should not be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x02a4 }
            goto L_0x00f2
        L_0x017b:
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x02a4 }
            if (r2 <= 0) goto L_0x0188
            short r2 = r10.getShort(r2)     // Catch:{ all -> 0x02a4 }
            r7 = 1
            if (r2 > 0) goto L_0x0189
        L_0x0188:
            r7 = 0
        L_0x0189:
            int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x02a4 }
            if (r1 <= 0) goto L_0x0196
            short r2 = r10.getShort(r1)     // Catch:{ all -> 0x02a4 }
            r1 = 1
            if (r2 > 0) goto L_0x0197
        L_0x0196:
            r1 = 0
        L_0x0197:
            X.6oW r2 = new X.6oW     // Catch:{ all -> 0x02a4 }
            r2.<init>()     // Catch:{ all -> 0x02a4 }
            java.lang.String r3 = X.C137416vQ.A01(r13, r12)     // Catch:{ all -> 0x02a4 }
            r2.A0P = r1     // Catch:{ all -> 0x02a4 }
            r2.A0R = r1     // Catch:{ all -> 0x02a4 }
            r2.A0Q = r7     // Catch:{ all -> 0x02a4 }
            r2.A0E = r3     // Catch:{ all -> 0x02a4 }
            r1 = r18
            r2.A0G = r1     // Catch:{ all -> 0x02a4 }
            r1 = r17
            r2.A0I = r1     // Catch:{ all -> 0x02a4 }
            android.net.Uri$Builder r1 = new android.net.Uri$Builder     // Catch:{ all -> 0x02a4 }
            r1.<init>()     // Catch:{ all -> 0x02a4 }
            android.net.Uri$Builder r1 = r1.scheme(r14)     // Catch:{ all -> 0x02a4 }
            android.net.Uri$Builder r7 = r1.authority(r13)     // Catch:{ all -> 0x02a4 }
            java.lang.String r1 = "stickers_asset"
            android.net.Uri$Builder r1 = r7.appendPath(r1)     // Catch:{ all -> 0x02a4 }
            android.net.Uri r1 = X.C108985cd.A0D(r1, r12, r6)     // Catch:{ all -> 0x02a4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x02a4 }
            r2.A0L = r1     // Catch:{ all -> 0x02a4 }
            r1 = r19
            r2.A0Z = r1     // Catch:{ all -> 0x02a4 }
            r2.A0H = r5     // Catch:{ all -> 0x02a4 }
            r2.A0D = r0     // Catch:{ all -> 0x02a4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r3)     // Catch:{ all -> 0x02a4 }
            r0 = 47
            r1.append(r0)     // Catch:{ all -> 0x02a4 }
            r1.append(r15)     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = X.C17890vO.A0Z(r4, r1, r0)     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = X.C17970vW.A05(r0)     // Catch:{ all -> 0x02a4 }
            r2.A0F = r0     // Catch:{ all -> 0x02a4 }
            X.725 r3 = r2.A00()     // Catch:{ all -> 0x02a4 }
            java.lang.String r2 = r3.A0H     // Catch:{ all -> 0x02a4 }
            java.lang.String r1 = r3.A0K     // Catch:{ all -> 0x02a4 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x025a
            int r0 = r1.length()     // Catch:{ all -> 0x02a4 }
            r1 = 128(0x80, float:1.794E-43)
            if (r0 > r1) goto L_0x024b
            java.lang.String r0 = r3.A04     // Catch:{ all -> 0x02a4 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x023c
            java.lang.String r0 = r3.A04     // Catch:{ all -> 0x02a4 }
            int r0 = r0.length()     // Catch:{ all -> 0x02a4 }
            if (r0 > r1) goto L_0x022d
            java.lang.String r0 = r3.A0M     // Catch:{ all -> 0x02a4 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x021e
            r11.A02(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x02a0
        L_0x021e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = "Third party sticker pack tray id is empty,"
            r1.append(r0)     // Catch:{ all -> 0x02a4 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r2, r1)     // Catch:{ all -> 0x02a4 }
            goto L_0x00f2
        L_0x022d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = "Third party sticker pack name cannot exceed 128 characters,"
            r1.append(r0)     // Catch:{ all -> 0x02a4 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r2, r1)     // Catch:{ all -> 0x02a4 }
            goto L_0x00f2
        L_0x023c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = "Third party sticker pack name is empty,"
            r1.append(r0)     // Catch:{ all -> 0x02a4 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r2, r1)     // Catch:{ all -> 0x02a4 }
            goto L_0x00f2
        L_0x024b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = "Third party sticker pack publisher cannot exceed 128 characters,"
            r1.append(r0)     // Catch:{ all -> 0x02a4 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r2, r1)     // Catch:{ all -> 0x02a4 }
            goto L_0x00f2
        L_0x025a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = "Third party sticker pack publisher is empty,"
            r1.append(r0)     // Catch:{ all -> 0x02a4 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r2, r1)     // Catch:{ all -> 0x02a4 }
            goto L_0x00f2
        L_0x0269:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r16)     // Catch:{ all -> 0x02a4 }
            r1.append(r6)     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = ") has "
            r1.append(r0)     // Catch:{ all -> 0x02a4 }
            if (r6 == 0) goto L_0x0278
            goto L_0x027a
        L_0x0278:
            r0 = 0
            goto L_0x0282
        L_0x027a:
            int r0 = r6.length()     // Catch:{ all -> 0x02a4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02a4 }
        L_0x0282:
            r1.append(r0)     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = " characters, limit is: 128, from authority: "
            goto L_0x00dc
        L_0x0289:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = "the pack returned was not what was requested, request identifier: "
            r1.append(r0)     // Catch:{ all -> 0x02a4 }
            r1.append(r12)     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = ",result identifier: "
            r1.append(r0)     // Catch:{ all -> 0x02a4 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r9, r1)     // Catch:{ all -> 0x02a4 }
            goto L_0x00f2
        L_0x02a0:
            r10.close()
            return r3
        L_0x02a4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02a6 }
        L_0x02a6:
            r0 = move-exception
            X.CDX.A00(r10, r1)
            throw r0
        L_0x02ab:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StickerContentProviderFetcher/getThirdPartyAppVersionCode/package name not found, content provider:"
            r1.append(r0)
            int r0 = r13.hashCode()
            r1.append(r0)
            X.C17890vO.A0w(r1)
        L_0x02be:
            java.lang.String r0 = "StickerContentProviderFetcher/getThirdPartyAppVersionCode/app may have been deleted"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x02c7
        L_0x02c4:
            r10.close()
        L_0x02c7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Third party pack cannot be found likely because the corresponding app is restricted, sdk: "
            r1.append(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1.append(r0)
            java.lang.String r0 = " ,power saving mode: "
            r1.append(r0)
            X.9kF r0 = r11.A01
            boolean r0 = r0.A00()
            java.lang.String r0 = X.AnonymousClass3MY.A0r(r1, r0)
            X.1SD r1 = new X.1SD
            r1.<init>(r0)
            throw r1
        L_0x02ea:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "identifier length is: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", limit is: 128"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A12(r0, r1)
            throw r1
        L_0x02fd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "identifier contains invalid characters: "
            r1.append(r0)
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A12(r12, r1)
            throw r1
        L_0x030b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "authority contains invalid characters: "
            r1.append(r0)
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A12(r13, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136386tj.A01(java.lang.String, java.lang.String):X.725");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A02(X.AnonymousClass725 r10) {
        /*
            r9 = this;
            r8 = 0
            X.11C r0 = r9.A02     // Catch:{ IOException | IllegalArgumentException -> 0x00c9, Exception -> 0x00b3 }
            X.11B r1 = X.C108955ca.A0d(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x00c9, Exception -> 0x00b3 }
            java.lang.String r0 = r10.A0M     // Catch:{ IOException | IllegalArgumentException -> 0x00c9, Exception -> 0x00b3 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x00c9, Exception -> 0x00b3 }
            java.io.InputStream r2 = r1.A07(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x00c9, Exception -> 0x00b3 }
            if (r2 == 0) goto L_0x007e
            r0 = 51201(0xc801, float:7.1748E-41)
            byte[] r7 = new byte[r0]     // Catch:{ all -> 0x00ac }
            int r6 = r2.read(r7, r8, r0)     // Catch:{ all -> 0x00ac }
            if (r6 == r0) goto L_0x006e
            android.graphics.Bitmap r5 = X.C72473Md.A0E(r7)     // Catch:{ all -> 0x00ac }
            if (r5 == 0) goto L_0x005e
            int r0 = r5.getWidth()     // Catch:{ all -> 0x00ac }
            java.lang.String r4 = ", should be between 24 and 512 pixels, sticker pack: "
            r3 = 512(0x200, float:7.175E-43)
            if (r0 > r3) goto L_0x004b
            int r0 = r5.getWidth()     // Catch:{ all -> 0x00ac }
            r1 = 24
            if (r0 < r1) goto L_0x004b
            int r0 = r5.getHeight()     // Catch:{ all -> 0x00ac }
            if (r0 > r3) goto L_0x0092
            int r0 = r5.getHeight()     // Catch:{ all -> 0x00ac }
            if (r0 < r1) goto L_0x0092
            byte[] r0 = new byte[r6]     // Catch:{ all -> 0x00ac }
            java.lang.System.arraycopy(r7, r8, r0, r8, r6)     // Catch:{ all -> 0x00ac }
            r2.close()     // Catch:{ IOException | IllegalArgumentException -> 0x00c9, Exception -> 0x00b3 }
            return r0
        L_0x004b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "tray icon width incorrect, it is currently "
            X.C108975cc.A0o(r5, r0, r1)     // Catch:{ all -> 0x00ac }
            r1.append(r4)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = r10.A0H     // Catch:{ all -> 0x00ac }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)     // Catch:{ all -> 0x00ac }
            goto L_0x00ab
        L_0x005e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "Failed to parse sticker tray icon, input stream is not valid, sticker pack: "
            r1.append(r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = r10.A0H     // Catch:{ all -> 0x00ac }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)     // Catch:{ all -> 0x00ac }
            goto L_0x00ab
        L_0x006e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "tray icon file size too big, limit is 50 KB, sticker pack: "
            r1.append(r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = r10.A0H     // Catch:{ all -> 0x00ac }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)     // Catch:{ all -> 0x00ac }
            goto L_0x00ab
        L_0x007e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "failed to fetch sticker tray icon, input stream is null: "
            r1.append(r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = r10.A0H     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x00ac }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x00ac }
            goto L_0x00ab
        L_0x0092:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "tray icon height incorrect, it is currently "
            r1.append(r0)     // Catch:{ all -> 0x00ac }
            int r0 = r5.getHeight()     // Catch:{ all -> 0x00ac }
            r1.append(r0)     // Catch:{ all -> 0x00ac }
            r1.append(r4)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = r10.A0H     // Catch:{ all -> 0x00ac }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)     // Catch:{ all -> 0x00ac }
        L_0x00ab:
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException | IllegalArgumentException -> 0x00c9, Exception -> 0x00b3 }
            throw r0     // Catch:{ IOException | IllegalArgumentException -> 0x00c9, Exception -> 0x00b3 }
        L_0x00b3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "failed to fetch sticker tray icon, sticker pack:"
            r1.append(r0)
            java.lang.String r0 = r10.A0H
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        L_0x00c9:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136386tj.A02(X.725):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("sticker file name: ");
        r1.append(r9);
        r1.append(" is invalid, authority: ");
        r1.append(r8);
        r1.append(",identifier: ");
        r0 = X.AnonymousClass001.A12(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        X.CDX.A00(r13, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015e, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0210 A[Catch:{ all -> 0x021a }, LOOP:0: B:8:0x0065->B:100:0x0210, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x020f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x017e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce A[Catch:{ all -> 0x021a }, LOOP:2: B:37:0x00cc->B:38:0x00ce, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018e A[Catch:{ IOException -> 0x0200 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass725 A00(java.lang.String r48, java.lang.String r49) {
        /*
            r47 = this;
            r8 = r48
            r7 = r49
            boolean r2 = X.C18070vi.A16(r8, r7)
            r6 = r47
            X.725 r5 = r6.A01(r8, r7)
            java.util.ArrayList r19 = X.AnonymousClass000.A13()
            java.lang.String r18 = X.C137416vQ.A01(r8, r7)
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r17 = "content"
            r0 = r17
            android.net.Uri$Builder r0 = r1.scheme(r0)
            android.net.Uri$Builder r1 = r0.authority(r8)
            java.lang.String r0 = "stickers"
            android.net.Uri r12 = X.C108985cd.A0D(r1, r0, r7)
            r9 = 3
            java.lang.String[] r10 = new java.lang.String[r9]
            r1 = 0
            java.lang.String r4 = "sticker_file_name"
            r10[r1] = r4
            java.lang.String r3 = "sticker_emoji"
            r10[r2] = r3
            r0 = 2
            java.lang.String r2 = "sticker_accessibility_text"
            r10[r0] = r2
            X.11C r0 = r6.A02
            r46 = r0
            X.11B r11 = X.C108955ca.A0d(r46)
            r21 = 0
            r15 = r21
            r16 = r15
            r13 = r10
            r14 = r15
            android.database.Cursor r10 = r11.A03(r12, r13, r14, r15, r16)
            if (r10 == 0) goto L_0x0276
            int r0 = r10.getCount()     // Catch:{ all -> 0x029b }
            if (r0 < r9) goto L_0x025c
            int r9 = r10.getCount()     // Catch:{ all -> 0x029b }
            r0 = 30
            if (r9 > r0) goto L_0x025c
            r10.moveToFirst()     // Catch:{ all -> 0x029b }
        L_0x0065:
            java.lang.String r9 = X.C17890vO.A0S(r10, r4)     // Catch:{ all -> 0x029b }
            java.lang.String r12 = X.C17890vO.A0S(r10, r3)     // Catch:{ all -> 0x029b }
            int r11 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x029b }
            if (r11 < 0) goto L_0x0213
            boolean r0 = r10.isNull(r11)     // Catch:{ all -> 0x029b }
            if (r0 != 0) goto L_0x0213
            java.lang.String r29 = r10.getString(r11)     // Catch:{ all -> 0x029b }
        L_0x007d:
            boolean r13 = r5.A0O     // Catch:{ all -> 0x029b }
            r11 = 125(0x7d, float:1.75E-43)
            if (r13 == 0) goto L_0x0085
            r11 = 250(0xfa, float:3.5E-43)
        L_0x0085:
            if (r29 == 0) goto L_0x0093
            int r0 = r29.length()     // Catch:{ all -> 0x029b }
            if (r0 <= 0) goto L_0x0093
            if (r0 <= r11) goto L_0x0093
            if (r13 == 0) goto L_0x0217
            goto L_0x0286
        L_0x0093:
            boolean r0 = X.C64062u9.A0V(r9)     // Catch:{ all -> 0x029b }
            if (r0 != 0) goto L_0x023e
            if (r12 == 0) goto L_0x00d9
            int r0 = r12.length()     // Catch:{ all -> 0x029b }
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = ","
            java.util.List r12 = X.C108965cb.A0v(r12, r0, r1)     // Catch:{ all -> 0x029b }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x029b }
            if (r0 != 0) goto L_0x00c9
            java.util.ListIterator r11 = X.C108955ca.A18(r12)     // Catch:{ all -> 0x029b }
        L_0x00b1:
            boolean r0 = r11.hasPrevious()     // Catch:{ all -> 0x029b }
            if (r0 == 0) goto L_0x00c9
            int r0 = X.C108985cd.A08(r11)     // Catch:{ all -> 0x029b }
            if (r0 == 0) goto L_0x00b1
            java.util.List r0 = X.C108985cd.A0t(r12, r11)     // Catch:{ all -> 0x029b }
        L_0x00c1:
            java.lang.String[] r13 = X.C108955ca.A1b(r0)     // Catch:{ all -> 0x029b }
            int r12 = r13.length     // Catch:{ all -> 0x029b }
            X.737[] r11 = new X.AnonymousClass737[r12]     // Catch:{ all -> 0x029b }
            goto L_0x00cc
        L_0x00c9:
            X.0wS r0 = X.C18460wS.A00     // Catch:{ all -> 0x029b }
            goto L_0x00c1
        L_0x00cc:
            if (r1 >= r12) goto L_0x00da
            r0 = r13[r1]     // Catch:{ all -> 0x029b }
            X.737 r0 = X.C137176v2.A00(r0)     // Catch:{ all -> 0x029b }
            r11[r1] = r0     // Catch:{ all -> 0x029b }
            int r1 = r1 + 1
            goto L_0x00cc
        L_0x00d9:
            r11 = 0
        L_0x00da:
            android.net.Uri$Builder r1 = new android.net.Uri$Builder     // Catch:{ all -> 0x029b }
            r1.<init>()     // Catch:{ all -> 0x029b }
            r0 = r17
            android.net.Uri$Builder r0 = r1.scheme(r0)     // Catch:{ all -> 0x029b }
            android.net.Uri$Builder r1 = r0.authority(r8)     // Catch:{ all -> 0x029b }
            java.lang.String r0 = "stickers_asset"
            android.net.Uri$Builder r0 = r1.appendPath(r0)     // Catch:{ all -> 0x029b }
            android.net.Uri r16 = X.C108985cd.A0D(r0, r7, r9)     // Catch:{ all -> 0x029b }
            java.lang.String r14 = r5.A04     // Catch:{ all -> 0x029b }
            java.lang.String r13 = r5.A0K     // Catch:{ all -> 0x029b }
            java.lang.String r1 = r5.A0J     // Catch:{ all -> 0x029b }
            java.lang.String r0 = r5.A0G     // Catch:{ all -> 0x029b }
            r35 = 0
            r12 = 0
            X.73B r9 = new X.73B     // Catch:{ all -> 0x029b }
            r30 = r12
            r31 = r12
            r34 = r35
            r36 = r35
            r37 = r35
            r38 = r35
            r39 = r35
            r40 = r35
            r22 = r9
            r23 = r18
            r24 = r14
            r25 = r13
            r26 = r1
            r27 = r0
            r28 = r12
            r32 = r11
            r33 = r35
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x029b }
            X.C18070vi.A0b(r16)     // Catch:{ all -> 0x029b }
            X.11B r1 = X.C108955ca.A0d(r46)     // Catch:{ IOException -> 0x015f }
            r0 = r16
            java.io.InputStream r13 = r1.A07(r0)     // Catch:{ IOException -> 0x015f }
            if (r13 == 0) goto L_0x0165
            X.17y r11 = r6.A04     // Catch:{ all -> 0x0158 }
            r0 = 32
            byte[] r0 = X.C17970vW.A0I(r0)     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = X.C108955ca.A14(r0)     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = X.AnonymousClass1EG.A0A(r0)     // Catch:{ all -> 0x0158 }
            X.17z r0 = r11.A00     // Catch:{ all -> 0x0158 }
            java.io.File r11 = r0.A01(r1)     // Catch:{ all -> 0x0158 }
            boolean r0 = X.C64062u9.A0T(r11, r13)     // Catch:{ all -> 0x0158 }
            if (r0 == 0) goto L_0x0154
            r13.close()     // Catch:{ IOException -> 0x015f }
            goto L_0x0166
        L_0x0154:
            r13.close()     // Catch:{ IOException -> 0x015f }
            goto L_0x0165
        L_0x0158:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x015a }
        L_0x015a:
            r0 = move-exception
            X.CDX.A00(r13, r1)     // Catch:{ IOException -> 0x015f }
            throw r0     // Catch:{ IOException -> 0x015f }
        L_0x015f:
            r1 = move-exception
            java.lang.String r0 = "ThirdPartyStickerFetcher/saveStickerFileToTempLocation/io exception when fetching sticker"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x029b }
        L_0x0165:
            r11 = r12
        L_0x0166:
            java.lang.String r13 = r16.getPath()     // Catch:{ all -> 0x029b }
            if (r11 == 0) goto L_0x0209
            if (r13 == 0) goto L_0x0209
            com.whatsapp.media.WamediaManager r1 = r6.A05     // Catch:{ IOException -> 0x0200 }
            boolean r0 = r5.A0Q     // Catch:{ IOException -> 0x0200 }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0200 }
            X.737[] r0 = r9.A0H     // Catch:{ IOException -> 0x0200 }
            if (r0 == 0) goto L_0x018e
            int r14 = r0.length     // Catch:{ IOException -> 0x0200 }
            r0 = 3
            if (r14 <= r0) goto L_0x018e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0200 }
            java.lang.String r0 = "emoji count exceed limit, sticker name:"
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r13, r1)     // Catch:{ IOException -> 0x0200 }
            X.1SE r0 = new X.1SE     // Catch:{ IOException -> 0x0200 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0200 }
            throw r0     // Catch:{ IOException -> 0x0200 }
        L_0x018e:
            X.C137446vT.A00(r1, r11, r15, r13)     // Catch:{ IOException -> 0x0200 }
            byte[] r0 = r9.A04()     // Catch:{ IOException -> 0x0200 }
            boolean r0 = r1.insertWebpMetadata(r11, r0)     // Catch:{ IOException -> 0x0200 }
            if (r0 == 0) goto L_0x01fa
            java.lang.String r1 = X.C1402370n.A00(r11)     // Catch:{ IOException -> 0x0200 }
            if (r1 == 0) goto L_0x0206
            X.77d r13 = new X.77d     // Catch:{ IOException -> 0x0200 }
            r23 = r12
            r24 = r12
            r25 = r12
            r26 = r12
            r27 = r12
            r29 = r12
            r32 = r12
            r33 = r12
            r34 = r12
            r41 = r35
            r42 = r35
            r43 = r35
            r44 = r35
            r45 = r35
            r20 = r13
            r22 = r12
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ IOException -> 0x0200 }
            r0 = r18
            r13.A0H = r0     // Catch:{ IOException -> 0x01f8 }
            java.lang.String r14 = r16.toString()     // Catch:{ IOException -> 0x01f8 }
            r0 = 3
            r13.A0B = r14     // Catch:{ IOException -> 0x01f6 }
            r13.A01 = r0     // Catch:{ IOException -> 0x01f6 }
            r13.A0F = r1     // Catch:{ IOException -> 0x01f6 }
            java.lang.String r0 = "image/webp"
            r13.A0E = r0     // Catch:{ IOException -> 0x01f6 }
            X.00H r0 = r6.A06     // Catch:{ IOException -> 0x01f6 }
            X.6uF r0 = X.C138906xt.A00(r13, r0, r11)     // Catch:{ IOException -> 0x01f6 }
            if (r0 == 0) goto L_0x01e5
            java.lang.String r12 = r0.A01(r11)     // Catch:{ IOException -> 0x01f6 }
        L_0x01e5:
            r13.A0C = r12     // Catch:{ IOException -> 0x01f6 }
            long r0 = r11.length()     // Catch:{ IOException -> 0x01f6 }
            int r12 = (int) r0     // Catch:{ IOException -> 0x01f6 }
            r13.A00 = r12     // Catch:{ IOException -> 0x01f6 }
            r13.A04 = r9     // Catch:{ IOException -> 0x01f6 }
            r0 = r19
            r0.add(r13)     // Catch:{ IOException -> 0x01f6 }
            goto L_0x0206
        L_0x01f6:
            r1 = move-exception
            goto L_0x0201
        L_0x01f8:
            r1 = move-exception
            goto L_0x0201
        L_0x01fa:
            java.lang.String r0 = "ThirdPartyStickerFetcher/calculatePlainTextHash/failed to insert metadata"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0200 }
            goto L_0x0206
        L_0x0200:
            r1 = move-exception
        L_0x0201:
            java.lang.String r0 = "ThirdPartyStickerFetcher/fetchStickersForStickerPack/exception when operating on sticker file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x021a }
        L_0x0206:
            X.C64062u9.A0Q(r11)     // Catch:{ all -> 0x029b }
        L_0x0209:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x029b }
            if (r0 != 0) goto L_0x0210
            goto L_0x021f
        L_0x0210:
            r1 = 0
            goto L_0x0065
        L_0x0213:
            r29 = 0
            goto L_0x007d
        L_0x0217:
            java.lang.String r2 = "static stickers"
            goto L_0x0288
        L_0x021a:
            r0 = move-exception
            X.C64062u9.A0Q(r11)     // Catch:{ all -> 0x029b }
            goto L_0x029a
        L_0x021f:
            r10.close()
            java.util.Iterator r4 = r19.iterator()
            r2 = 0
        L_0x0228:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0237
            X.77d r0 = X.C108945cZ.A0x(r4)
            int r0 = r0.A00
            long r0 = (long) r0
            long r2 = r2 + r0
            goto L_0x0228
        L_0x0237:
            r0 = r19
            r5.A07 = r0
            r5.A01 = r2
            return r5
        L_0x023e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x029b }
            java.lang.String r0 = "sticker file name: "
            r1.append(r0)     // Catch:{ all -> 0x029b }
            r1.append(r9)     // Catch:{ all -> 0x029b }
            java.lang.String r0 = " is invalid, authority: "
            r1.append(r0)     // Catch:{ all -> 0x029b }
            r1.append(r8)     // Catch:{ all -> 0x029b }
            java.lang.String r0 = ",identifier: "
            r1.append(r0)     // Catch:{ all -> 0x029b }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r7, r1)     // Catch:{ all -> 0x029b }
            goto L_0x029a
        L_0x025c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x029b }
            java.lang.String r0 = "sticker count should be between 3 to 30 inclusive, it currently has "
            r1.append(r0)     // Catch:{ all -> 0x029b }
            int r0 = r10.getCount()     // Catch:{ all -> 0x029b }
            r1.append(r0)     // Catch:{ all -> 0x029b }
            java.lang.String r0 = ", sticker pack: "
            r1.append(r0)     // Catch:{ all -> 0x029b }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r7, r1)     // Catch:{ all -> 0x029b }
            goto L_0x029a
        L_0x0276:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x029b }
            java.lang.String r0 = "could not find stickers for sticker pack: "
            r1.append(r0)     // Catch:{ all -> 0x029b }
            r0 = r18
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)     // Catch:{ all -> 0x029b }
            goto L_0x029a
        L_0x0286:
            java.lang.String r2 = "animated stickers"
        L_0x0288:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x029b }
            java.lang.String r0 = "accessibility text for "
            r1.append(r0)     // Catch:{ all -> 0x029b }
            r1.append(r2)     // Catch:{ all -> 0x029b }
            java.lang.String r0 = " cannot be longer than "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r11)     // Catch:{ all -> 0x029b }
        L_0x029a:
            throw r0     // Catch:{ all -> 0x029b }
        L_0x029b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x029d }
        L_0x029d:
            r0 = move-exception
            X.CDX.A00(r10, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136386tj.A00(java.lang.String, java.lang.String):X.725");
    }

    public C136386tj(AnonymousClass190 r1, C190019kF r2, AnonymousClass11C r3, AnonymousClass118 r4, C219317y r5, WamediaManager wamediaManager, AnonymousClass00H r7) {
        C18070vi.A0w(r4, r1, r3, wamediaManager, r2);
        C18070vi.A0l(r5, r7);
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A05 = wamediaManager;
        this.A01 = r2;
        this.A04 = r5;
        this.A06 = r7;
    }
}
