package com.whatsapp.gallery.adapters;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass65B;
import X.C1405471x;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.adapters.MediaAdapter$loadVideoDuration$1$1$1", f = "MediaAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MediaAdapter$loadVideoDuration$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C1405471x $metaData;
    public final /* synthetic */ AnonymousClass65B $thumbView;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaAdapter$loadVideoDuration$1$1$1(AnonymousClass65B r2, C1405471x r3, C30391dr r4) {
        super(2, r4);
        this.$thumbView = r2;
        this.$metaData = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MediaAdapter$loadVideoDuration$1$1$1(this.$thumbView, this.$metaData, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$thumbView.setDuration(new Long(this.$metaData.A03));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaAdapter$loadVideoDuration$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
