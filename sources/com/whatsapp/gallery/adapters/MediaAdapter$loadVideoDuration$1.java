package com.whatsapp.gallery.adapters;

import X.AnonymousClass000;
import X.AnonymousClass1IT;
import X.AnonymousClass1OS;
import X.AnonymousClass65B;
import X.AnonymousClass8B2;
import X.C112325lI;
import X.C132516mw;
import X.C1405471x;
import X.C23761Hn;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.adapters.MediaAdapter$loadVideoDuration$1", f = "MediaAdapter.kt", i = {}, l = {221}, m = "invokeSuspend", n = {}, s = {})
public final class MediaAdapter$loadVideoDuration$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass8B2 $media;
    public final /* synthetic */ AnonymousClass65B $thumbView;
    public int label;
    public final /* synthetic */ C112325lI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaAdapter$loadVideoDuration$1(AnonymousClass8B2 r2, AnonymousClass65B r3, C112325lI r4, C30391dr r5) {
        super(2, r5);
        this.$media = r2;
        this.this$0 = r4;
        this.$thumbView = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new MediaAdapter$loadVideoDuration$1(this.$media, this.$thumbView, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            File BQC = this.$media.BQC();
            if (BQC != null) {
                C112325lI r0 = this.this$0;
                AnonymousClass65B r4 = this.$thumbView;
                C1405471x A00 = ((C132516mw) r0.A05.get()).A00(BQC);
                AnonymousClass1IT A002 = C23761Hn.A00();
                MediaAdapter$loadVideoDuration$1$1$1 mediaAdapter$loadVideoDuration$1$1$1 = new MediaAdapter$loadVideoDuration$1$1$1(r4, A00, (C30391dr) null);
                this.label = 1;
                if (C30451dy.A00(this, A002, mediaAdapter$loadVideoDuration$1$1$1) == r6) {
                    return r6;
                }
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (Exception e) {
                e.getMessage();
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaAdapter$loadVideoDuration$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
