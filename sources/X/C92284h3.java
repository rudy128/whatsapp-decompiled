package X;

import android.app.Activity;

/* renamed from: X.4h3  reason: invalid class name and case insensitive filesystem */
public final class C92284h3 implements C107045Ye {
    public final Activity A00;
    public final C108245bN A01;
    public final AnonymousClass4aW A02;
    public final AnonymousClass1FR A03;
    public final AnonymousClass1KB A04;
    public final AnonymousClass4GR A05;
    public final AnonymousClass11C A06;
    public final C18030ve A07;

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x016d, code lost:
        if (r10 != null) goto L_0x016f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0192  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bky(android.content.Intent r22, int r23, int r24) {
        /*
            r21 = this;
            r8 = r21
            X.0ve r9 = r8.A07
            boolean r2 = X.AnonymousClass1J8.A01(r9)
            r0 = 18
            r1 = -1
            r11 = 1
            r10 = r22
            r4 = r23
            r3 = r24
            if (r4 != r0) goto L_0x001e
            if (r2 == 0) goto L_0x0065
            if (r3 != r1) goto L_0x0065
            android.app.Activity r7 = r8.A00
        L_0x001a:
            r7.finish()
        L_0x001d:
            return r11
        L_0x001e:
            r0 = 17
            r5 = 0
            if (r4 != r0) goto L_0x027d
            if (r3 != r1) goto L_0x00f6
            if (r22 == 0) goto L_0x00f6
            X.1BI r6 = X.C88594aB.A04(r10)
            java.lang.String r4 = "is_using_global_wallpaper"
            boolean r3 = r10.getBooleanExtra(r4, r5)
            android.app.Activity r7 = r8.A00
            android.graphics.Point r1 = X.AnonymousClass4aW.A00(r7)
            android.net.Uri r0 = r10.getData()
            if (r0 == 0) goto L_0x00ad
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversation/wallpaper/setup/src:"
            r2.append(r0)
            android.net.Uri r0 = r10.getData()
            java.lang.String r0 = r0.toString()
            X.C17890vO.A1A(r2, r0)
            X.11C r0 = r8.A06
            X.11B r15 = r0.A0O()
            java.lang.String r0 = "FROM_INTERNAL_DOWNLOADS_KEY"
            boolean r0 = r10.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x023d
            android.net.Uri r4 = r10.getData()
            r3 = 0
            goto L_0x0078
        L_0x0065:
            if (r3 != r1) goto L_0x0099
            if (r22 == 0) goto L_0x001d
            android.net.Uri r0 = r10.getData()
            if (r0 == 0) goto L_0x001d
            X.1BI r6 = X.C88594aB.A04(r10)
            android.net.Uri r4 = r10.getData()
            r3 = 1
        L_0x0078:
            X.4aW r1 = r8.A02
            android.app.Activity r2 = r8.A00
            if (r4 != 0) goto L_0x0094
            r0 = 0
            X.4SC r0 = r1.A0D(r2, r0, r6, r3)
        L_0x0083:
            android.graphics.drawable.Drawable r1 = r1.A0B(r0)
            X.5bN r0 = r8.A01
            r0.CLS(r1)
            if (r3 == 0) goto L_0x001d
            if (r4 == 0) goto L_0x001d
            X.C26511Sk.A0O(r2, r4)
            return r11
        L_0x0094:
            X.4SC r0 = r1.A0D(r2, r4, r6, r3)
            goto L_0x0083
        L_0x0099:
            if (r24 != 0) goto L_0x001d
            if (r22 == 0) goto L_0x001d
            java.lang.String r0 = "error_message_id"
            int r2 = r10.getIntExtra(r0, r1)
            if (r2 <= 0) goto L_0x001d
            X.1KB r1 = r8.A04
            X.1FR r0 = r8.A03
            r1.A0E(r0, r2)
            return r11
        L_0x00ad:
            if (r2 != 0) goto L_0x001a
            X.5bN r3 = r8.A01
            r3.BEx()
            java.lang.String r0 = "selected_res_id"
            int r13 = r10.getIntExtra(r0, r5)
            if (r13 == 0) goto L_0x01a9
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversation/wallpaper from pgk:"
            r2.append(r0)
            r2.append(r13)
            java.lang.String r0 = " ["
            r2.append(r0)
            int r0 = r1.x
            r2.append(r0)
            java.lang.String r0 = ","
            r2.append(r0)
            int r0 = r1.y
            r2.append(r0)
            java.lang.String r0 = "]"
            X.C17890vO.A1A(r2, r0)
            int r12 = r1.x
            int r1 = r1.y
            r4 = 0
            r0 = -1
            X.4aW r2 = r8.A02
            if (r13 != r0) goto L_0x00fc
            X.4SC r0 = r2.A0D(r7, r4, r6, r11)
        L_0x00ef:
            android.graphics.drawable.Drawable r0 = r2.A0B(r0)
        L_0x00f3:
            r3.CLS(r0)
        L_0x00f6:
            X.5bN r0 = r8.A01
            r0.CS1()
            return r11
        L_0x00fc:
            X.1KB r4 = r2.A03
            r16 = 0
            android.content.pm.PackageManager r9 = r7.getPackageManager()     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x017e }
            java.lang.String r0 = "com.whatsapp.wallpaper"
            android.content.res.Resources r0 = r9.getResourcesForApplication(r0)     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x017e }
            android.graphics.drawable.Drawable r9 = r0.getDrawable(r13)     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x017e }
            r0 = r9
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            android.graphics.Bitmap r10 = r0.getBitmap()     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            if (r10 == 0) goto L_0x0177
            int r0 = r10.getWidth()     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            float r15 = (float) r0     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            float r14 = (float) r12     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            float r15 = r15 / r14
            int r0 = r10.getHeight()     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            float r13 = (float) r0     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            float r0 = (float) r1     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            float r13 = r13 / r0
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0146
            int r0 = r10.getWidth()     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            float r0 = (float) r0     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            float r0 = r0 / r13
            int r0 = (int) r0     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            if (r0 <= 0) goto L_0x016f
            if (r1 <= 0) goto L_0x016f
            if (r12 <= 0) goto L_0x016f
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createScaledBitmap(r10, r0, r1, r11)     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            int r0 = r13.getWidth()     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            int r0 = r0 - r12
            int r0 = r0 / 2
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r13, r0, r5, r12, r1)     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            goto L_0x0168
        L_0x0146:
            int r0 = r10.getHeight()     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            float r13 = (float) r0     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            float r13 = r13 * r14
            int r0 = r10.getWidth()     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            float r0 = (float) r0     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            float r13 = r13 / r0
            int r0 = (int) r13     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            if (r0 <= 0) goto L_0x016f
            if (r1 <= 0) goto L_0x016f
            if (r12 <= 0) goto L_0x016f
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createScaledBitmap(r10, r12, r0, r11)     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            int r0 = r13.getHeight()     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            int r0 = r0 - r1
            int r0 = r0 / 2
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r13, r5, r0, r12, r1)     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
        L_0x0168:
            if (r10 == r13) goto L_0x016f
            r13.recycle()     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            if (r10 == 0) goto L_0x0177
        L_0x016f:
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            r0 = r16
            r1.<init>(r0, r10)     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            goto L_0x0198
        L_0x0177:
            r0 = 2131889983(0x7f120f3f, float:1.9414645E38)
            r4.A05(r0)     // Catch:{ NameNotFoundException | OutOfMemoryError | RuntimeException -> 0x0180 }
            goto L_0x0190
        L_0x017e:
            r1 = move-exception
            goto L_0x0183
        L_0x0180:
            r1 = move-exception
            r16 = r9
        L_0x0183:
            java.lang.String r0 = "wallpaper/set-global-wallpaper"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 2131889983(0x7f120f3f, float:1.9414645E38)
            r4.A05(r0)
            r9 = r16
        L_0x0190:
            if (r9 != 0) goto L_0x0199
            X.4SC r0 = r2.A0E(r7, r6)
            goto L_0x00ef
        L_0x0198:
            r9 = r1
        L_0x0199:
            boolean r1 = X.AnonymousClass000.A1X(r6)
            android.graphics.drawable.BitmapDrawable r9 = (android.graphics.drawable.BitmapDrawable) r9
            X.4Na r0 = X.AnonymousClass4aW.A06(r7, r9, r6, r2)
            X.4SC r0 = X.AnonymousClass4aW.A05(r7, r0, r2, r1)
            goto L_0x00ef
        L_0x01a9:
            java.lang.String r1 = "wallpaper_color_file"
            boolean r0 = r10.hasExtra(r1)
            if (r0 == 0) goto L_0x01e2
            int r1 = r10.getIntExtra(r1, r5)
            java.lang.String r0 = "wallpaper_doodle_overlay"
            boolean r0 = r10.getBooleanExtra(r0, r5)
            X.4aW r9 = r8.A02
            if (r0 == 0) goto L_0x01df
            java.lang.String r4 = "COLOR_WITH_WA_OVERLAY"
        L_0x01c1:
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            X.4Na r1 = new X.4Na
            r1.<init>(r0, r4, r2)
            boolean r0 = X.C28281Zt.A0B(r7)
            X.AnonymousClass4aW.A09(r6, r1, r9, r0, r11)
            X.4SC r0 = r9.A0E(r7, r6)
            android.graphics.drawable.Drawable r0 = r9.A0B(r0)
            goto L_0x00f3
        L_0x01df:
            java.lang.String r4 = "COLOR_ONLY"
            goto L_0x01c1
        L_0x01e2:
            java.lang.String r0 = "is_reset"
            boolean r0 = r10.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x0209
            X.4aW r9 = r8.A02
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "NONE"
            r2 = 0
            X.4Na r1 = new X.4Na
            r1.<init>(r4, r0, r2)
            boolean r0 = X.C28281Zt.A0B(r7)
            X.AnonymousClass4aW.A09(r6, r1, r9, r0, r11)
            r3.CLS(r2)
            java.lang.String r0 = "conversation/wallpaper/reset"
        L_0x0204:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00f6
        L_0x0209:
            java.lang.String r0 = "is_default"
            boolean r0 = r10.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x022a
            X.4aW r2 = r8.A02
            X.4Na r1 = X.AnonymousClass4aW.A0L
            boolean r0 = X.C28281Zt.A0B(r7)
            X.AnonymousClass4aW.A09(r6, r1, r2, r0, r11)
            X.4SC r0 = r2.A0E(r7, r6)
            android.graphics.drawable.Drawable r0 = r2.A0B(r0)
            r3.CLS(r0)
            java.lang.String r0 = "conversation/wallpaper/default"
            goto L_0x0204
        L_0x022a:
            X.1KB r1 = r8.A04
            r0 = 2131890027(0x7f120f6b, float:1.9414734E38)
            r1.A08(r0, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversation/wallpaper/invalid_file:"
            X.C17900vP.A0X(r10, r0, r1)
            goto L_0x00f6
        L_0x023d:
            if (r15 != 0) goto L_0x02a5
            java.lang.String r0 = "conversation/wallpaper/setup cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0244:
            if (r9 == 0) goto L_0x027e
            r1 = 7736(0x1e38, float:1.084E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r9, r1)
            if (r0 == 0) goto L_0x027e
            android.net.Uri r2 = r10.getData()
            X.AnonymousClass3Ma.A1O(r7, r5, r2)
            android.content.Intent r9 = X.C17880vN.A0A()
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.theme.preview.ThemesGalleryWallpaperPreviewActivity"
            r9.setClassName(r1, r0)
            r9.setData(r2)
        L_0x0267:
            java.lang.String r1 = X.C22971Dz.A06(r6)
            java.lang.String r0 = "chat_jid"
            r9.putExtra(r0, r1)
            r9.putExtra(r4, r3)
            r0 = 18
            r7.startActivityForResult(r9, r0)
            X.5bN r0 = r8.A01
            r0.CS1()
        L_0x027d:
            return r5
        L_0x027e:
            android.net.Uri r10 = r10.getData()
            X.4aW r0 = r8.A02
            android.net.Uri r2 = r0.A0C()
            X.C18070vi.A0d(r7, r5)
            r0 = 3
            X.C18070vi.A0f(r10, r0, r2)
            android.content.Intent r9 = X.C17880vN.A0A()
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview"
            r9.setClassName(r1, r0)
            r9.setData(r10)
            java.lang.String r0 = "output"
            r9.putExtra(r0, r2)
            goto L_0x0267
        L_0x02a5:
            android.net.Uri r16 = r10.getData()
            r16.getClass()
            r0 = 0
            r19 = r0
            r20 = r0
            r17 = r0
            r18 = r0
            android.database.Cursor r2 = r15.A03(r16, r17, r18, r19, r20)
            if (r2 == 0) goto L_0x0244
            boolean r13 = r2.moveToFirst()     // Catch:{ all -> 0x033f }
            java.lang.String r12 = "bucket_display_name"
            int r12 = r2.getColumnIndex(r12)     // Catch:{ all -> 0x033f }
            if (r13 == 0) goto L_0x0336
            if (r12 < 0) goto L_0x0336
            java.lang.String r13 = "WallPaper"
            java.lang.String r12 = r2.getString(r12)     // Catch:{ all -> 0x033f }
            boolean r12 = r13.equals(r12)     // Catch:{ all -> 0x033f }
            if (r12 == 0) goto L_0x0336
            android.graphics.BitmapFactory$Options r14 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x033f }
            r14.<init>()     // Catch:{ all -> 0x033f }
            r14.inJustDecodeBounds = r11     // Catch:{ all -> 0x033f }
            android.net.Uri r12 = r10.getData()     // Catch:{ FileNotFoundException -> 0x0332, IOException -> 0x032d }
            java.io.InputStream r12 = r15.A07(r12)     // Catch:{ FileNotFoundException -> 0x0332, IOException -> 0x032d }
            android.graphics.BitmapFactory.decodeStream(r12, r0, r14)     // Catch:{ all -> 0x0321 }
            int r15 = r14.outWidth     // Catch:{ all -> 0x0321 }
            int r13 = r1.x     // Catch:{ all -> 0x0321 }
            if (r15 != r13) goto L_0x031b
            int r13 = r14.outHeight     // Catch:{ all -> 0x0321 }
            int r1 = r1.y     // Catch:{ all -> 0x0321 }
            if (r13 != r1) goto L_0x031b
            android.net.Uri r13 = r10.getData()     // Catch:{ all -> 0x0321 }
            if (r13 != 0) goto L_0x0309
            X.4aW r1 = r8.A02     // Catch:{ all -> 0x0321 }
            X.4SC r0 = r1.A0D(r7, r0, r6, r11)     // Catch:{ all -> 0x0321 }
        L_0x02ff:
            android.graphics.drawable.Drawable r1 = r1.A0B(r0)     // Catch:{ all -> 0x0321 }
            X.5bN r0 = r8.A01     // Catch:{ all -> 0x0321 }
            r0.CLS(r1)     // Catch:{ all -> 0x0321 }
            goto L_0x0310
        L_0x0309:
            X.4aW r1 = r8.A02     // Catch:{ all -> 0x0321 }
            X.4SC r0 = r1.A0D(r7, r13, r6, r11)     // Catch:{ all -> 0x0321 }
            goto L_0x02ff
        L_0x0310:
            if (r13 == 0) goto L_0x0315
            X.C26511Sk.A0O(r7, r13)     // Catch:{ all -> 0x0321 }
        L_0x0315:
            if (r12 == 0) goto L_0x033b
            r12.close()     // Catch:{ FileNotFoundException -> 0x0332, IOException -> 0x032d }
            goto L_0x033b
        L_0x031b:
            if (r12 == 0) goto L_0x0336
            r12.close()     // Catch:{ FileNotFoundException -> 0x0332, IOException -> 0x032d }
            goto L_0x0336
        L_0x0321:
            r1 = move-exception
            if (r12 == 0) goto L_0x032c
            r12.close()     // Catch:{ all -> 0x0328 }
            goto L_0x032c
        L_0x0328:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x0332, IOException -> 0x032d }
        L_0x032c:
            throw r1     // Catch:{ FileNotFoundException -> 0x0332, IOException -> 0x032d }
        L_0x032d:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x033f }
            goto L_0x0336
        L_0x0332:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x033f }
        L_0x0336:
            r2.close()
            goto L_0x0244
        L_0x033b:
            r2.close()
            return r11
        L_0x033f:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0344 }
            throw r1
        L_0x0344:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92284h3.Bky(android.content.Intent, int, int):boolean");
    }

    public C92284h3(Activity activity, AnonymousClass1FR r2, AnonymousClass1KB r3, C108245bN r4, AnonymousClass4GR r5, AnonymousClass11C r6, C18030ve r7, AnonymousClass4aW r8) {
        this.A07 = r7;
        this.A00 = activity;
        this.A04 = r3;
        this.A06 = r6;
        this.A02 = r8;
        this.A03 = r2;
        this.A01 = r4;
        this.A05 = r5;
    }
}
