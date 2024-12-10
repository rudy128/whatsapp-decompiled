package com.whatsapp.gallery.adapters;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass65N;
import X.AnonymousClass8B2;
import X.C113295mr;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.adapters.GalleryMediaAdapter$onBindMediaItemView$1", f = "GalleryMediaAdapter.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
public final class GalleryMediaAdapter$onBindMediaItemView$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C113295mr $holder;
    public final /* synthetic */ int $id;
    public final /* synthetic */ int $position;
    public int label;
    public final /* synthetic */ AnonymousClass65N this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryMediaAdapter$onBindMediaItemView$1(C113295mr r2, AnonymousClass65N r3, C30391dr r4, int i, int i2) {
        super(2, r4);
        this.this$0 = r3;
        this.$holder = r2;
        this.$id = i;
        this.$position = i2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new GalleryMediaAdapter$onBindMediaItemView$1(this.$holder, this.this$0, r8, this.$id, this.$position);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            try {
                AnonymousClass65N r4 = this.this$0;
                C18600wl r3 = r4.A04;
                GalleryMediaAdapter$onBindMediaItemView$1$processedMedia$1 galleryMediaAdapter$onBindMediaItemView$1$processedMedia$1 = new GalleryMediaAdapter$onBindMediaItemView$1$processedMedia$1(r4, (C30391dr) null, this.$position);
                this.label = 1;
                obj = C30451dy.A00(this, r3, galleryMediaAdapter$onBindMediaItemView$1$processedMedia$1);
                if (obj == r6) {
                    return r6;
                }
            } catch (Exception e) {
                Log.e("GalleryMediaAdapter/onBindMediaItemView/", e);
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass8B2 r8 = (AnonymousClass8B2) obj;
        if (r8 != null) {
            C113295mr r2 = this.$holder;
            Integer num = r2.A00;
            int i2 = this.$id;
            if (num != null && num.intValue() == i2) {
                this.this$0.A0V(r8, r2, this.$position);
                this.this$0.A0G(this.$holder.A05());
            }
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GalleryMediaAdapter$onBindMediaItemView$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
