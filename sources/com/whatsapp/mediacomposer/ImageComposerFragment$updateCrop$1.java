package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.ImageComposerFragment$updateCrop$1", f = "ImageComposerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ImageComposerFragment$updateCrop$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Rect $cropRect;
    public final /* synthetic */ RectF $displayRect;
    public int label;
    public final /* synthetic */ ImageComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageComposerFragment$updateCrop$1(Rect rect, RectF rectF, ImageComposerFragment imageComposerFragment, C30391dr r5) {
        super(2, r5);
        this.this$0 = imageComposerFragment;
        this.$cropRect = rect;
        this.$displayRect = rectF;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ImageComposerFragment$updateCrop$1(this.$cropRect, this.$displayRect, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            ImageComposerFragment.A07(this.$cropRect, this.$displayRect, this.this$0, (Integer) null, 0, -1);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ImageComposerFragment$updateCrop$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
