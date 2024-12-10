package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass47N;
import X.AnonymousClass4aW;
import X.C000200d;
import X.C72473Md;
import X.C72483Me;
import X.C91034f2;
import android.net.Uri;
import android.view.MenuItem;
import com.whatsapp.mediaview.PhotoView;

public class GalleryWallpaperPreview extends AnonymousClass47N {
    public int A00;
    public Uri A01;
    public PhotoView A02;
    public AnonymousClass4aW A03;
    public AnonymousClass00H A04;
    public boolean A05;

    public GalleryWallpaperPreview() {
        this(0);
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            AnonymousClass47N.A0V(A0L, r1, this);
            this.A04 = C000200d.A00(A0L.A6E);
            this.A03 = (AnonymousClass4aW) r1.A5C.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x018f, code lost:
        if (r6 != null) goto L_0x0191;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r3 = r19
            r0 = r20
            super.onCreate(r0)
            r0 = 2131436978(0x7f0b25b2, float:1.8495842E38)
            android.view.View r0 = r3.findViewById(r0)
            com.whatsapp.mediaview.PhotoView r0 = (com.whatsapp.mediaview.PhotoView) r0
            r3.A02 = r0
            r0 = 2131428815(0x7f0b05cf, float:1.8479285E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 25
            X.C89974dK.A00(r1, r3, r0)
            r0 = 2131434043(0x7f0b1a3b, float:1.8489889E38)
            android.view.ViewGroup r9 = X.AnonymousClass3MX.A0F(r3, r0)
            r0 = -1
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r11.<init>(r0, r0)
            X.11P r1 = r3.A05
            X.11S r0 = r3.A02
            r8 = 0
            r6 = 0
            r12 = 0
            java.lang.String r0 = X.AnonymousClass1PP.A00(r0, r1, r6)
            X.210 r10 = X.C72473Md.A0a(r3, r8, r0, r6)
            r0 = 2131898399(0x7f12301f, float:1.9431715E38)
            java.lang.String r0 = r3.getString(r0)
            r10.A0i(r0)
            X.11P r4 = r3.A05
            X.11S r0 = r3.A02
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass11S.A00(r0)
            r5 = 1
            r2 = 1
            java.lang.String r0 = X.AnonymousClass1PP.A00(r0, r4, r6)
            X.210 r7 = X.C72473Md.A0a(r3, r1, r0, r5)
            java.lang.String r0 = r3.A4b()
            r7.A0i(r0)
            r0 = 5
            r7.A0a(r0)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r3)
            r4.setBackgroundResource(r6)
            r4.setLayoutParams(r11)
            r4.setOrientation(r5)
            X.3tc r1 = new X.3tc
            r1.<init>(r3, r8, r10)
            r1.A1M()
            r1.A2W(r5)
            r1.setEnabled(r6)
            r1.setClickable(r6)
            X.3tc r0 = new X.3tc
            r0.<init>(r3, r8, r7)
            r0.A1M()
            r0.A2W(r6)
            r0.setEnabled(r6)
            r0.setClickable(r6)
            r4.addView(r1)
            r4.addView(r0)
            r4.setClickable(r6)
            r9.addView(r4)
            android.os.Bundle r4 = X.AnonymousClass3MY.A09(r3)
            if (r4 == 0) goto L_0x00b7
            java.lang.String r1 = "output"
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Object r0 = X.C24141Ja.A00(r4, r0, r1)
            android.net.Uri r0 = (android.net.Uri) r0
            r3.A01 = r0
            java.lang.String r0 = "maxFileSize"
            int r0 = r4.getInt(r0, r6)
            r3.A00 = r0
        L_0x00b7:
            android.content.Intent r0 = r3.getIntent()
            android.net.Uri r6 = r0.getData()
            java.lang.String r4 = "io-error"
            if (r6 != 0) goto L_0x00d7
            java.lang.String r0 = "GalleryWallpaperPreview/no uri found in intent"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r0 = X.C17880vN.A0A()
        L_0x00cc:
            android.content.Intent r0 = r0.putExtra(r4, r2)
        L_0x00d0:
            r3.setResult(r12, r0)
            r3.finish()
            return
        L_0x00d7:
            android.graphics.Point r1 = X.C72483Me.A0D(r3)     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            X.00H r0 = r3.A04     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            X.1Nq r0 = (X.C25291Nq) r0     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            java.io.InputStream r9 = r0.A0A(r6, r5)     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x01ed }
            r7.<init>()     // Catch:{ all -> 0x01ed }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x01ed }
            r7.inPreferredConfig = r0     // Catch:{ all -> 0x01ed }
            r7.inDither = r5     // Catch:{ all -> 0x01ed }
            int r5 = r1.x     // Catch:{ all -> 0x01ed }
            int r1 = r1.y     // Catch:{ all -> 0x01ed }
            X.25O r0 = new X.25O     // Catch:{ all -> 0x01ed }
            r13 = r0
            r14 = r7
            r15 = r8
            r16 = r5
            r17 = r1
            r18 = r12
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01ed }
            X.25P r0 = X.AnonymousClass204.A0B(r0, r9)     // Catch:{ all -> 0x01ed }
            android.graphics.Bitmap r11 = r0.A02     // Catch:{ all -> 0x01ed }
            r9.close()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            java.lang.String r5 = "not-a-image"
            java.lang.String r9 = "GalleryWallpaperPreview/failed to load bitmap"
            if (r11 == 0) goto L_0x01d6
            int r0 = r11.getWidth()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            if (r0 == 0) goto L_0x01d6
            int r0 = r11.getHeight()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            if (r0 == 0) goto L_0x01d6
            X.11C r0 = r3.A08     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            X.11B r0 = r0.A0O()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            android.graphics.Matrix r16 = X.C26511Sk.A09(r6, r0)     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            if (r16 != 0) goto L_0x0130
            android.graphics.Matrix r16 = new android.graphics.Matrix     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            r16.<init>()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
        L_0x0130:
            int r14 = r11.getWidth()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            int r15 = r11.getHeight()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            r13 = r12
            r17 = r2
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            if (r11 == r7) goto L_0x0144
            r11.recycle()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
        L_0x0144:
            r6 = r7
            if (r7 == 0) goto L_0x01c9
            android.graphics.Point r1 = X.C72483Me.A0D(r3)     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            int r0 = r1.x     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            float r8 = (float) r0     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            int r0 = r7.getWidth()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            float r8 = r8 / r0
            int r0 = r1.y     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            float r1 = (float) r0     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            int r0 = r7.getHeight()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            float r1 = r1 / r0
            float r8 = java.lang.Math.max(r8, r1)     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x018a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            java.lang.String r0 = "GalleryWallpaperPreview/scaling image by "
            r1.append(r0)     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            r1.append(r8)     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            java.lang.String r0 = "x to fit screen"
            X.C17890vO.A1A(r1, r0)     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            int r0 = r7.getWidth()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            float r0 = r0 * r8
            int r1 = (int) r0     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            int r0 = r7.getHeight()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            float r0 = r0 * r8
            int r0 = (int) r0     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r7, r1, r0, r2)     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
        L_0x018a:
            if (r6 == r7) goto L_0x0191
            r7.recycle()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            if (r6 == 0) goto L_0x01c9
        L_0x0191:
            int r0 = r6.getWidth()
            if (r0 == 0) goto L_0x01c9
            int r0 = r6.getHeight()
            if (r0 == 0) goto L_0x01c9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GalleryWallpaperPreview/wallpaper loaded/w="
            r1.append(r0)
            int r0 = r6.getWidth()
            r1.append(r0)
            java.lang.String r0 = "; h="
            r1.append(r0)
            int r0 = r6.getHeight()
            X.C17900vP.A0o(r1, r0)
            com.whatsapp.mediaview.PhotoView r1 = r3.A02
            r1.A0P = r2
            r0 = 3
            r1.A09 = r0
            r1.setAllowFullViewCrop(r2)
            com.whatsapp.mediaview.PhotoView r0 = r3.A02
            r0.A0A(r6)
            return
        L_0x01c9:
            com.whatsapp.util.Log.e((java.lang.String) r9)
            android.content.Intent r0 = X.C17880vN.A0A()
            android.content.Intent r0 = r0.putExtra(r5, r2)
            goto L_0x00d0
        L_0x01d6:
            com.whatsapp.util.Log.e((java.lang.String) r9)     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            if (r11 == 0) goto L_0x01de
            r11.recycle()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
        L_0x01de:
            android.content.Intent r0 = X.C17880vN.A0A()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            android.content.Intent r0 = r0.putExtra(r5, r2)     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            r3.setResult(r12, r0)     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            r3.finish()     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
            goto L_0x0211
        L_0x01ed:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x01f2 }
            goto L_0x01f6
        L_0x01f2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
        L_0x01f6:
            throw r1     // Catch:{ IOException -> 0x0205, OutOfMemoryError -> 0x01f7 }
        L_0x01f7:
            r1 = move-exception
            java.lang.String r0 = "GalleryWallpaperPreview/out of memory trying to load wallpaper"
            com.whatsapp.util.Log.e(r0, r1)
            android.content.Intent r0 = X.C17880vN.A0A()
            java.lang.String r4 = "error-oom"
            goto L_0x00cc
        L_0x0205:
            r1 = move-exception
            java.lang.String r0 = "GalleryWallpaperPreview/io error loading wallpaper"
            com.whatsapp.util.Log.e(r0, r1)
            android.content.Intent r0 = X.C17880vN.A0A()
            goto L_0x00cc
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0);
        finish();
        return true;
    }

    public GalleryWallpaperPreview(int i) {
        this.A05 = false;
        C91034f2.A00(this, 35);
    }
}
