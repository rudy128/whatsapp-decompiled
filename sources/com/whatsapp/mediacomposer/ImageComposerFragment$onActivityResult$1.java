package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.ImageComposerFragment$onActivityResult$1", f = "ImageComposerFragment.kt", i = {}, l = {545}, m = "invokeSuspend", n = {}, s = {})
public final class ImageComposerFragment$onActivityResult$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Rect $cropRect;
    public final /* synthetic */ RectF $displayRect;
    public final /* synthetic */ int $errorMessageId;
    public final /* synthetic */ int $rotate;
    public final /* synthetic */ Integer $toolToActivateAfterCrop;
    public int label;
    public final /* synthetic */ ImageComposerFragment this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.ImageComposerFragment$onActivityResult$1$1", f = "ImageComposerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.ImageComposerFragment$onActivityResult$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r10) {
            ImageComposerFragment imageComposerFragment = imageComposerFragment;
            return new AnonymousClass1(rect, rectF, imageComposerFragment, num, r10, i2, i3);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                ImageComposerFragment imageComposerFragment = imageComposerFragment;
                ImageComposerFragment.A07(rect, rectF, imageComposerFragment, num, i2, i3);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageComposerFragment$onActivityResult$1(Rect rect, RectF rectF, ImageComposerFragment imageComposerFragment, Integer num, C30391dr r6, int i, int i2) {
        super(2, r6);
        this.this$0 = imageComposerFragment;
        this.$cropRect = rect;
        this.$displayRect = rectF;
        this.$rotate = i;
        this.$errorMessageId = i2;
        this.$toolToActivateAfterCrop = num;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        ImageComposerFragment imageComposerFragment = this.this$0;
        return new ImageComposerFragment$onActivityResult$1(this.$cropRect, this.$displayRect, imageComposerFragment, this.$toolToActivateAfterCrop, r10, this.$rotate, this.$errorMessageId);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final ImageComposerFragment imageComposerFragment = this.this$0;
            C18600wl r0 = imageComposerFragment.A09;
            if (r0 != null) {
                final Rect rect = this.$cropRect;
                final RectF rectF = this.$displayRect;
                final int i2 = this.$rotate;
                final int i3 = this.$errorMessageId;
                final Integer num = this.$toolToActivateAfterCrop;
                AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
                this.label = 1;
                if (C30451dy.A00(this, r0, r3) == r2) {
                    return r2;
                }
            } else {
                C18070vi.A11("ioDispatcher");
                throw null;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ImageComposerFragment$onActivityResult$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
