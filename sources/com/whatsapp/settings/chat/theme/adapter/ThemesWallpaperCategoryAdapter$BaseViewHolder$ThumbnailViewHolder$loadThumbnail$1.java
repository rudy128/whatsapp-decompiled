package com.whatsapp.settings.chat.theme.adapter;

import X.AnonymousClass1OS;
import X.AnonymousClass47A;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.chat.theme.adapter.ThemesWallpaperCategoryAdapter$BaseViewHolder$ThumbnailViewHolder$loadThumbnail$1", f = "ThemesWallpaperCategoryAdapter.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
public final class ThemesWallpaperCategoryAdapter$BaseViewHolder$ThumbnailViewHolder$loadThumbnail$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ File $file;
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass47A this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThemesWallpaperCategoryAdapter$BaseViewHolder$ThumbnailViewHolder$loadThumbnail$1(AnonymousClass47A r2, File file, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$file = file;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ThemesWallpaperCategoryAdapter$BaseViewHolder$ThumbnailViewHolder$loadThumbnail$1(this.this$0, this.$file, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            java.lang.String r6 = "ThemesWallpaperCategoryAdapter/error when loading wallpaper "
            r10 = 0
            r8 = 1
            if (r0 == 0) goto L_0x001b
            if (r0 != r8) goto L_0x0016
            java.lang.Object r7 = r12.L$0
            java.io.Closeable r7 = (java.io.Closeable) r7
            X.C30691eM.A01(r13)     // Catch:{ all -> 0x008c }
            if (r7 == 0) goto L_0x0097
            goto L_0x0088
        L_0x0016:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001b:
            X.C30691eM.A01(r13)
            X.47A r0 = r12.this$0     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
            android.view.View r0 = r0.A0H     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
            android.content.Context r1 = r0.getContext()     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
            r0 = 2131232768(0x7f080800, float:1.8081655E38)
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r1, r0)     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
            if (r0 == 0) goto L_0x0050
            android.graphics.drawable.Drawable r11 = r0.mutate()     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
        L_0x0033:
            java.lang.String r0 = "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable"
            X.C18070vi.A0z(r11, r0)     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
            android.graphics.drawable.LayerDrawable r11 = (android.graphics.drawable.LayerDrawable) r11     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
            X.47A r0 = r12.this$0     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
            android.view.View r0 = r0.A0H     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
            android.content.Context r0 = r0.getContext()     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
            android.graphics.Point r1 = X.AnonymousClass4aW.A00(r0)     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
            java.io.File r0 = r12.$file     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
            r7.<init>(r0)     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
            X.47A r5 = r12.this$0     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
            goto L_0x0052
        L_0x0050:
            r11 = r10
            goto L_0x0033
        L_0x0052:
            android.graphics.Bitmap r0 = X.C72453Mb.A0O(r1, r7, r8)     // Catch:{ all -> 0x008c }
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x008c }
            r4.<init>(r0)     // Catch:{ all -> 0x008c }
            r0 = 2131436994(0x7f0b25c2, float:1.8495874E38)
            r11.setDrawableByLayerId(r0, r4)     // Catch:{ all -> 0x008c }
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable     // Catch:{ all -> 0x008c }
            r3.<init>()     // Catch:{ all -> 0x008c }
            int[] r2 = new int[r8]     // Catch:{ all -> 0x008c }
            r1 = 16842912(0x10100a0, float:2.3694006E-38)
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x008c }
            r3.addState(r2, r11)     // Catch:{ all -> 0x008c }
            int[] r0 = new int[r0]     // Catch:{ all -> 0x008c }
            r3.addState(r0, r4)     // Catch:{ all -> 0x008c }
            X.0wl r1 = r5.A04     // Catch:{ all -> 0x008c }
            com.whatsapp.settings.chat.theme.adapter.ThemesWallpaperCategoryAdapter$BaseViewHolder$ThumbnailViewHolder$loadThumbnail$1$1$1 r0 = new com.whatsapp.settings.chat.theme.adapter.ThemesWallpaperCategoryAdapter$BaseViewHolder$ThumbnailViewHolder$loadThumbnail$1$1$1     // Catch:{ all -> 0x008c }
            r0.<init>(r3, r5, r10)     // Catch:{ all -> 0x008c }
            r12.L$0 = r7     // Catch:{ all -> 0x008c }
            r12.label = r8     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = X.C30451dy.A00(r12, r1, r0)     // Catch:{ all -> 0x008c }
            if (r0 != r9) goto L_0x0088
            return r9
        L_0x0088:
            r7.close()     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
            goto L_0x0097
        L_0x008c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008e }
        L_0x008e:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
            throw r0     // Catch:{ IOException | OutOfMemoryError -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
        L_0x0097:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.chat.theme.adapter.ThemesWallpaperCategoryAdapter$BaseViewHolder$ThumbnailViewHolder$loadThumbnail$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ThemesWallpaperCategoryAdapter$BaseViewHolder$ThumbnailViewHolder$loadThumbnail$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
