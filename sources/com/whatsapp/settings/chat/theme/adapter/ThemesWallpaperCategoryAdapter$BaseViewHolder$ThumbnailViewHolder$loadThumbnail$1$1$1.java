package com.whatsapp.settings.chat.theme.adapter;

import X.AnonymousClass000;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.AnonymousClass3MY;
import X.AnonymousClass47A;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.chat.theme.adapter.ThemesWallpaperCategoryAdapter$BaseViewHolder$ThumbnailViewHolder$loadThumbnail$1$1$1", f = "ThemesWallpaperCategoryAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ThemesWallpaperCategoryAdapter$BaseViewHolder$ThumbnailViewHolder$loadThumbnail$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ StateListDrawable $stateListDrawable;
    public int label;
    public final /* synthetic */ AnonymousClass47A this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThemesWallpaperCategoryAdapter$BaseViewHolder$ThumbnailViewHolder$loadThumbnail$1$1$1(StateListDrawable stateListDrawable, AnonymousClass47A r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$stateListDrawable = stateListDrawable;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ThemesWallpaperCategoryAdapter$BaseViewHolder$ThumbnailViewHolder$loadThumbnail$1$1$1(this.$stateListDrawable, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OB r0 = this.this$0.A00;
            if (r0 == null || !r0.isCancelled()) {
                View A0F = AnonymousClass3MY.A0F(this.this$0.A01);
                C18070vi.A0z(A0F, "null cannot be cast to non-null type com.whatsapp.settings.chat.wallpaper.ThemesWallpaperGridItemView");
                ((ImageView) A0F).setImageDrawable(this.$stateListDrawable);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ThemesWallpaperCategoryAdapter$BaseViewHolder$ThumbnailViewHolder$loadThumbnail$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
