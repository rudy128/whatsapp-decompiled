package com.whatsapp.settings.chat.theme.preview;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1DS;
import X.AnonymousClass1F9;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MY;
import X.AnonymousClass47H;
import X.AnonymousClass47Q;
import X.AnonymousClass4aW;
import X.AnonymousClass5QN;
import X.C000200d;
import X.C103705Li;
import X.C108675c7;
import X.C108875cR;
import X.C18100vl;
import X.C441822l;
import X.C72473Md;
import X.C72483Me;
import X.C91034f2;
import X.C94874lK;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.WaImageView;
import com.whatsapp.mediaview.PhotoView;
import java.util.ArrayList;
import java.util.List;

public final class ThemesGalleryWallpaperPreviewActivity extends AnonymousClass47H implements C108875cR {
    public Bitmap A00;
    public WaImageView A01;
    public PhotoView A02;
    public AnonymousClass4aW A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public boolean A06;
    public final C18100vl A07;
    public final C18100vl A08;

    public ThemesGalleryWallpaperPreviewActivity() {
        this(0);
        this.A08 = AnonymousClass1DF.A01(AnonymousClass5QN.A00);
        this.A07 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C103705Li(this));
    }

    public /* synthetic */ void BC4(Drawable drawable, View view) {
    }

    public /* synthetic */ void BCy(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BCz(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BId() {
    }

    public /* synthetic */ void BLL() {
    }

    public /* synthetic */ void BLe(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C2C(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C2F(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C3D(AnonymousClass206 r1, boolean z) {
    }

    public /* synthetic */ void CH6(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CJr(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void CKg(List list, boolean z) {
    }

    public /* synthetic */ void CMe(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CNC(C441822l r1) {
    }

    public void CND(View view, AnonymousClass206 r2, int i, int i2, boolean z) {
    }

    public /* synthetic */ void CNE(View view, AnonymousClass206 r2, Runnable runnable, int i, int i2, boolean z) {
    }

    public /* synthetic */ void CNF(int i) {
    }

    public /* synthetic */ void COH(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CRK(AnonymousClass206 r1) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (AnonymousClass3MY.A01(menuItem, 0) != 16908332) {
            return false;
        }
        setResult(0);
        finish();
        return true;
    }

    public /* synthetic */ void setAnimationNye(AnonymousClass205 r1) {
    }

    public /* synthetic */ void setQuotedMessage(AnonymousClass206 r1) {
    }

    public void A2y() {
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            AnonymousClass47Q.A0d(A0K, r2, this);
            this.A04 = C000200d.A00(A0K.A0n);
            this.A05 = C000200d.A00(r2.A6E);
            this.A03 = (AnonymousClass4aW) r1.A5C.get();
        }
    }

    public /* synthetic */ boolean Bcq() {
        return false;
    }

    public /* synthetic */ boolean BfZ() {
        return false;
    }

    public /* synthetic */ boolean Bfy() {
        return false;
    }

    public /* synthetic */ boolean Bgu() {
        return false;
    }

    public /* synthetic */ boolean Bjq() {
        return true;
    }

    public /* synthetic */ boolean CMM() {
        return false;
    }

    public /* synthetic */ boolean CMu() {
        return false;
    }

    public /* synthetic */ int getContainerType() {
        return 0;
    }

    public C108675c7 getConversationRowCustomizer() {
        return new C94874lK(this);
    }

    public /* synthetic */ AnonymousClass206 getFirstEverKnownLastMessage() {
        return null;
    }

    public /* synthetic */ AnonymousClass1DS getHasOutgoingMessagesLiveData() {
        return null;
    }

    public /* synthetic */ AnonymousClass1DS getLastMessageLiveData() {
        return null;
    }

    public AnonymousClass1F9 getLifecycleOwner() {
        return this;
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        return null;
    }

    public /* synthetic */ EditText getTextEntryField() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01bf, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c8, code lost:
        X.CDX.A00(r8, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r5 = r23
            r0 = r24
            super.onCreate(r0)
            r0 = 2131436978(0x7f0b25b2, float:1.8495842E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r5, r0)
            com.whatsapp.mediaview.PhotoView r0 = (com.whatsapp.mediaview.PhotoView) r0
            r5.A02 = r0
            r0 = 2131436107(0x7f0b224b, float:1.8494075E38)
            android.view.View r1 = X.AnonymousClass3MY.A0H(r5, r0)
            com.whatsapp.WaImageView r1 = (com.whatsapp.WaImageView) r1
            r5.A01 = r1
            java.lang.String r3 = "themeButton"
            if (r1 == 0) goto L_0x01e6
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r0 = r5.A4e()
            X.1DS r2 = r0.A0A
            X.5UK r1 = new X.5UK
            r1.<init>(r5)
            r0 = 34
            X.C91634g0.A00(r5, r2, r1, r0)
            com.whatsapp.WaImageView r1 = r5.A01
            if (r1 == 0) goto L_0x01e6
            r0 = 22
            X.C89974dK.A00(r1, r5, r0)
            android.content.Intent r0 = r5.getIntent()
            android.net.Uri r2 = r0.getData()
            java.lang.String r6 = "io-error"
            r13 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0063
            java.lang.String r0 = "GalleryWallpaperPreview/no uri found in intent"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r0 = X.C17880vN.A0A()
        L_0x0055:
            android.content.Intent r0 = r0.putExtra(r6, r4)
        L_0x0059:
            r5.setResult(r13, r0)
            r5.finish()
        L_0x005f:
            r5.A4g()
            return
        L_0x0063:
            android.graphics.Point r1 = X.C72483Me.A0D(r5)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            X.00H r0 = r5.A05     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            if (r0 == 0) goto L_0x01c1
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            X.1Nq r0 = (X.C25291Nq) r0     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            java.io.InputStream r8 = r0.A0A(r2, r4)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x01bd }
            r7.<init>()     // Catch:{ all -> 0x01bd }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x01bd }
            r7.inPreferredConfig = r0     // Catch:{ all -> 0x01bd }
            r7.inDither = r4     // Catch:{ all -> 0x01bd }
            int r3 = r1.x     // Catch:{ all -> 0x01bd }
            int r1 = r1.y     // Catch:{ all -> 0x01bd }
            r19 = 0
            X.25O r0 = new X.25O     // Catch:{ all -> 0x01bd }
            r18 = r7
            r20 = r3
            r21 = r1
            r22 = r13
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x01bd }
            X.25P r0 = X.AnonymousClass204.A0B(r0, r8)     // Catch:{ all -> 0x01bd }
            android.graphics.Bitmap r12 = r0.A02     // Catch:{ all -> 0x01bd }
            r8.close()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            java.lang.String r7 = "not-a-image"
            java.lang.String r11 = "GalleryWallpaperPreview/failed to load bitmap"
            if (r12 == 0) goto L_0x01a5
            int r0 = r12.getWidth()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            if (r0 == 0) goto L_0x01a5
            int r0 = r12.getHeight()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            if (r0 == 0) goto L_0x01a5
            X.11C r0 = r5.A08     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            X.11B r0 = r0.A0O()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            android.graphics.Matrix r17 = X.C26511Sk.A09(r2, r0)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            if (r17 != 0) goto L_0x00c1
            android.graphics.Matrix r17 = new android.graphics.Matrix     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            r17.<init>()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
        L_0x00c1:
            int r15 = r12.getWidth()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            int r16 = r12.getHeight()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            r14 = r13
            r18 = r4
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            boolean r0 = r12.equals(r8)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            if (r0 != 0) goto L_0x00d9
            r12.recycle()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
        L_0x00d9:
            r9 = r8
            if (r8 != 0) goto L_0x00de
            r9 = 0
            goto L_0x0124
        L_0x00de:
            android.graphics.Point r10 = X.C72483Me.A0D(r5)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            int r0 = r10.x     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            float r1 = (float) r0     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            int r0 = r8.getWidth()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            float r0 = (float) r0     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            float r1 = r1 / r0
            double r2 = (double) r1     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            int r0 = r10.y     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            float r1 = (float) r0     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            int r0 = r8.getHeight()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            float r0 = (float) r0     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            float r1 = r1 / r0
            double r0 = (double) r1     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            double r0 = java.lang.Math.max(r2, r0)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            float r2 = (float) r0     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0124
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            java.lang.String r0 = "GalleryWallpaperPreview/scaling image by "
            r1.append(r0)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            r1.append(r2)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            java.lang.String r0 = "x to fit screen"
            X.C17890vO.A1A(r1, r0)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            int r0 = r8.getWidth()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            float r0 = (float) r0     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            float r0 = r0 * r2
            int r1 = (int) r0     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            int r0 = r8.getHeight()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            float r0 = (float) r0     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            float r0 = r0 * r2
            int r0 = (int) r0     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createScaledBitmap(r8, r1, r0, r4)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
        L_0x0124:
            r5.A00 = r9     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            boolean r0 = X.C18070vi.A18(r9, r8)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            if (r0 != 0) goto L_0x0131
            if (r8 == 0) goto L_0x0131
            r8.recycle()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
        L_0x0131:
            android.graphics.Bitmap r0 = r5.A00
            if (r0 == 0) goto L_0x0145
            int r0 = r0.getWidth()
            if (r0 == 0) goto L_0x0145
            android.graphics.Bitmap r0 = r5.A00
            if (r0 == 0) goto L_0x0152
            int r0 = r0.getHeight()
            if (r0 != 0) goto L_0x0152
        L_0x0145:
            com.whatsapp.util.Log.e((java.lang.String) r11)
            android.content.Intent r0 = X.C17880vN.A0A()
            android.content.Intent r0 = r0.putExtra(r7, r4)
            goto L_0x0059
        L_0x0152:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GalleryWallpaperPreview/wallpaper loaded/w="
            r1.append(r0)
            android.graphics.Bitmap r0 = r5.A00
            if (r0 == 0) goto L_0x018b
            int r0 = r0.getWidth()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0167:
            r1.append(r0)
            java.lang.String r0 = "; h="
            r1.append(r0)
            android.graphics.Bitmap r0 = r5.A00
            if (r0 == 0) goto L_0x0188
            int r0 = r0.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x017b:
            X.C17900vP.A0b(r0, r1)
            com.whatsapp.mediaview.PhotoView r1 = r5.A02
            java.lang.String r2 = "photoView"
            if (r1 != 0) goto L_0x018e
            X.C18070vi.A11(r2)
            throw r19
        L_0x0188:
            r0 = r19
            goto L_0x017b
        L_0x018b:
            r0 = r19
            goto L_0x0167
        L_0x018e:
            r1.A0P = r4
            r0 = 3
            r1.A09 = r0
            r1.setAllowFullViewCrop(r4)
            com.whatsapp.mediaview.PhotoView r1 = r5.A02
            if (r1 != 0) goto L_0x019e
            X.C18070vi.A11(r2)
            throw r19
        L_0x019e:
            android.graphics.Bitmap r0 = r5.A00
            r1.A0A(r0)
            goto L_0x005f
        L_0x01a5:
            com.whatsapp.util.Log.e((java.lang.String) r11)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            if (r12 == 0) goto L_0x01ad
            r12.recycle()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
        L_0x01ad:
            android.content.Intent r0 = X.C17880vN.A0A()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            android.content.Intent r0 = r0.putExtra(r7, r4)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            r5.setResult(r13, r0)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            r5.finish()     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            goto L_0x005f
        L_0x01bd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01bf }
        L_0x01bf:
            r0 = move-exception
            goto L_0x01c8
        L_0x01c1:
            java.lang.String r0 = "mediaUtils"
            X.C18070vi.A11(r0)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
            r0 = 0
            goto L_0x01cb
        L_0x01c8:
            X.CDX.A00(r8, r1)     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
        L_0x01cb:
            throw r0     // Catch:{ IOException -> 0x01da, OutOfMemoryError -> 0x01cc }
        L_0x01cc:
            r1 = move-exception
            java.lang.String r0 = "GalleryWallpaperPreview/out of memory trying to load wallpaper"
            com.whatsapp.util.Log.e(r0, r1)
            android.content.Intent r0 = X.C17880vN.A0A()
            java.lang.String r6 = "error-oom"
            goto L_0x0055
        L_0x01da:
            r1 = move-exception
            java.lang.String r0 = "GalleryWallpaperPreview/io error loading wallpaper"
            com.whatsapp.util.Log.e(r0, r1)
            android.content.Intent r0 = X.C17880vN.A0A()
            goto L_0x0055
        L_0x01e6:
            X.C18070vi.A11(r3)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.chat.theme.preview.ThemesGalleryWallpaperPreviewActivity.onCreate(android.os.Bundle):void");
    }

    public /* synthetic */ Object BPO(Class cls) {
        return null;
    }

    public /* synthetic */ int BW6(AnonymousClass206 r2) {
        return 1;
    }

    public /* synthetic */ boolean Bfa(AnonymousClass206 r2) {
        return false;
    }

    public /* synthetic */ boolean Bgo(AnonymousClass206 r2) {
        return false;
    }

    public /* synthetic */ boolean CPY(AnonymousClass206 r2) {
        return false;
    }

    public ThemesGalleryWallpaperPreviewActivity(int i) {
        this.A06 = false;
        C91034f2.A00(this, 29);
    }
}
