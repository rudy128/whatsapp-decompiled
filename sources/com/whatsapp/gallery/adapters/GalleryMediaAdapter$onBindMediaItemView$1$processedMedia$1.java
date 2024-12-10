package com.whatsapp.gallery.adapters;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass65N;
import X.C160878Ah;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.adapters.GalleryMediaAdapter$onBindMediaItemView$1$processedMedia$1", f = "GalleryMediaAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GalleryMediaAdapter$onBindMediaItemView$1$processedMedia$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $position;
    public int label;
    public final /* synthetic */ AnonymousClass65N this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryMediaAdapter$onBindMediaItemView$1$processedMedia$1(AnonymousClass65N r2, C30391dr r3, int i) {
        super(2, r3);
        this.this$0 = r2;
        this.$position = i;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new GalleryMediaAdapter$onBindMediaItemView$1$processedMedia$1(this.this$0, r5, this.$position);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C160878Ah r1 = this.this$0.A02.A0G;
            if (r1 != null) {
                return r1.CCk(this.$position);
            }
            return null;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GalleryMediaAdapter$onBindMediaItemView$1$processedMedia$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
