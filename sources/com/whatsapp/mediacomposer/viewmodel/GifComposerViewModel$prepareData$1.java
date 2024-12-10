package com.whatsapp.mediacomposer.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7JQ;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.DRK;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.viewmodel.GifComposerViewModel$prepareData$1", f = "GifComposerViewModel.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
public final class GifComposerViewModel$prepareData$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ File $file;
    public final /* synthetic */ Uri $uri;
    public int label;
    public final /* synthetic */ GifComposerViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.viewmodel.GifComposerViewModel$prepareData$1$1", f = "GifComposerViewModel.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.viewmodel.GifComposerViewModel$prepareData$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            File file = file;
            return new AnonymousClass1(uri, gifComposerViewModel, file, r6);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                try {
                    DRK.A04(file);
                    z = true;
                } catch (IOException unused) {
                    z = false;
                }
                GifComposerViewModel gifComposerViewModel = gifComposerViewModel;
                AnonymousClass7JQ r3 = new AnonymousClass7JQ(uri, file, z);
                this.label = 1;
                if (C30451dy.A00(this, gifComposerViewModel.A02, new GifComposerViewModel$notifyState$2(r3, gifComposerViewModel, (C30391dr) null)) == r6) {
                    return r6;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifComposerViewModel$prepareData$1(Uri uri, GifComposerViewModel gifComposerViewModel, File file, C30391dr r5) {
        super(2, r5);
        this.this$0 = gifComposerViewModel;
        this.$file = file;
        this.$uri = uri;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new GifComposerViewModel$prepareData$1(this.$uri, this.this$0, this.$file, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final GifComposerViewModel gifComposerViewModel = this.this$0;
            C18600wl r4 = gifComposerViewModel.A01;
            final File file = this.$file;
            final Uri uri = this.$uri;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r4, r0) == r7) {
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
        return ((GifComposerViewModel$prepareData$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
