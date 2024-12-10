package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7wO;
import X.C160888Ai;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C98494rF;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.ImageComposerFragment$loadImage$recipient$1$onSuccess$1", f = "ImageComposerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ImageComposerFragment$loadImage$recipient$1$onSuccess$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C98494rF $backgroundBitmap;
    public final /* synthetic */ boolean $cached;
    public final /* synthetic */ C160888Ai $composerContainer;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Uri $currentUri;
    public final /* synthetic */ Bitmap $result;
    public int label;
    public final /* synthetic */ ImageComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageComposerFragment$loadImage$recipient$1$onSuccess$1(Context context, Bitmap bitmap, Uri uri, ImageComposerFragment imageComposerFragment, C160888Ai r6, C30391dr r7, C98494rF r8, boolean z) {
        super(2, r7);
        this.$backgroundBitmap = r8;
        this.this$0 = imageComposerFragment;
        this.$result = bitmap;
        this.$composerContainer = r6;
        this.$currentUri = uri;
        this.$context = context;
        this.$cached = z;
    }

    public final C30391dr create(Object obj, C30391dr r11) {
        C98494rF r7 = this.$backgroundBitmap;
        ImageComposerFragment imageComposerFragment = this.this$0;
        Bitmap bitmap = this.$result;
        C160888Ai r5 = this.$composerContainer;
        return new ImageComposerFragment$loadImage$recipient$1$onSuccess$1(this.$context, bitmap, this.$currentUri, imageComposerFragment, r5, r11, r7, this.$cached);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$backgroundBitmap.element = this.this$0.A27(this.$result);
            ImageComposerFragment imageComposerFragment = this.this$0;
            C160888Ai r6 = this.$composerContainer;
            Uri uri = this.$currentUri;
            Bitmap bitmap = this.$result;
            Bitmap bitmap2 = (Bitmap) this.$backgroundBitmap.element;
            Context context = this.$context;
            boolean z = this.$cached;
            Bitmap bitmap3 = bitmap2;
            if (bitmap2 == null) {
                bitmap3 = bitmap;
            }
            ImageComposerFragment.A04(context, bitmap3, uri, imageComposerFragment, r6);
            ImageComposerFragment.A0A(imageComposerFragment, new AnonymousClass7wO(bitmap2, bitmap, imageComposerFragment, z));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ImageComposerFragment$loadImage$recipient$1$onSuccess$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
