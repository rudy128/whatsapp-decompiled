package com.whatsapp.gallery.adapters;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass65N;
import X.C132516mw;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.adapters.GalleryMediaAdapter$loadVideoDuration$1$1$duration$1", f = "GalleryMediaAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GalleryMediaAdapter$loadVideoDuration$1$1$duration$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ File $it;
    public int label;
    public final /* synthetic */ AnonymousClass65N this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryMediaAdapter$loadVideoDuration$1$1$duration$1(AnonymousClass65N r2, File file, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$it = file;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new GalleryMediaAdapter$loadVideoDuration$1$1$duration$1(this.this$0, this.$it, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return new Long(((C132516mw) this.this$0.A03.get()).A00(this.$it).A03);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GalleryMediaAdapter$loadVideoDuration$1$1$duration$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
