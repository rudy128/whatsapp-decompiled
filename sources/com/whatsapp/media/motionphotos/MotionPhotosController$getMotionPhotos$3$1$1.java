package com.whatsapp.media.motionphotos;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass72S;
import X.C129076hD;
import X.C137626vl;
import X.C23761Hn;
import X.C23771Ho;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.media.motionphotos.MotionPhotosController$getMotionPhotos$3$1$1", f = "MotionPhotosController.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
public final class MotionPhotosController$getMotionPhotos$3$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ File $file;
    public final /* synthetic */ AnonymousClass72S $it;
    public int label;
    public final /* synthetic */ C129076hD this$0;

    @DebugMetadata(c = "com.whatsapp.media.motionphotos.MotionPhotosController$getMotionPhotos$3$1$1$1", f = "MotionPhotosController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.media.motionphotos.MotionPhotosController$getMotionPhotos$3$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            File file = file;
            return new AnonymousClass1(r2, r3, file, r6);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                if (C137626vl.A00(file)) {
                    r3.A02.add(r2.A0X);
                }
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MotionPhotosController$getMotionPhotos$3$1$1(AnonymousClass72S r2, C129076hD r3, File file, C30391dr r5) {
        super(2, r5);
        this.$file = file;
        this.this$0 = r3;
        this.$it = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        File file = this.$file;
        return new MotionPhotosController$getMotionPhotos$3$1$1(this.$it, this.this$0, file, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23771Ho r5 = C23761Hn.A01;
            final File file = this.$file;
            final C129076hD r3 = this.this$0;
            final AnonymousClass72S r2 = this.$it;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r5, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MotionPhotosController$getMotionPhotos$3$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
