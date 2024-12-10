package com.whatsapp.gallery.adapters;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass65B;
import X.AnonymousClass65N;
import X.AnonymousClass65a;
import X.AnonymousClass8B2;
import X.C113295mr;
import X.C17880vN;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.util.Log;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.adapters.GalleryMediaAdapter$loadVideoDuration$1$1", f = "GalleryMediaAdapter.kt", i = {0}, l = {136}, m = "invokeSuspend", n = {"id"}, s = {"I$0"})
public final class GalleryMediaAdapter$loadVideoDuration$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C113295mr $holder;
    public final /* synthetic */ File $it;
    public final /* synthetic */ AnonymousClass8B2 $media;
    public final /* synthetic */ AnonymousClass65B $thumbView;
    public int I$0;
    public int label;
    public final /* synthetic */ AnonymousClass65N this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryMediaAdapter$loadVideoDuration$1$1(AnonymousClass8B2 r2, AnonymousClass65B r3, C113295mr r4, AnonymousClass65N r5, File file, C30391dr r7) {
        super(2, r7);
        this.this$0 = r5;
        this.$holder = r4;
        this.$media = r2;
        this.$thumbView = r3;
        this.$it = file;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        AnonymousClass65N r4 = this.this$0;
        return new GalleryMediaAdapter$loadVideoDuration$1$1(this.$media, this.$thumbView, this.$holder, r4, this.$it, r9);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        AnonymousClass65a r1;
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            AnonymousClass65N r3 = this.this$0;
            i = r3.A00 + 1;
            r3.A00 = i;
            this.$holder.A01 = AnonymousClass3MW.A0v(i);
            try {
                C18600wl r2 = r3.A04;
                GalleryMediaAdapter$loadVideoDuration$1$1$duration$1 galleryMediaAdapter$loadVideoDuration$1$1$duration$1 = new GalleryMediaAdapter$loadVideoDuration$1$1$duration$1(r3, this.$it, (C30391dr) null);
                this.I$0 = i;
                this.label = 1;
                obj = C30451dy.A00(this, r2, galleryMediaAdapter$loadVideoDuration$1$1$duration$1);
                if (obj == r7) {
                    return r7;
                }
            } catch (Exception e) {
                Log.e("loadVideoDuration/failure/", e);
            }
        } else if (i2 == 1) {
            i = this.I$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        long A05 = C17880vN.A05(obj);
        Integer num = this.$holder.A01;
        if (num != null && num.intValue() == i) {
            AnonymousClass8B2 r12 = this.$media;
            if ((r12 instanceof AnonymousClass65a) && (r1 = (AnonymousClass65a) r12) != null) {
                r1.A00 = A05;
            }
            this.$thumbView.setDuration(new Long(A05));
            this.$holder.A01 = null;
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GalleryMediaAdapter$loadVideoDuration$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
