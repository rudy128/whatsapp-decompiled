package com.whatsapp.reels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass204;
import X.AnonymousClass25O;
import X.C18100vl;
import X.C18600wl;
import X.C218617r;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C72453Mb;
import android.graphics.Bitmap;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reels.ReelsPreviewView$showProfilePictureFrom$1", f = "ReelsPreviewView.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
public final class ReelsPreviewView$showProfilePictureFrom$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $url;
    public int label;
    public final /* synthetic */ ReelsPreviewView this$0;

    @DebugMetadata(c = "com.whatsapp.reels.ReelsPreviewView$showProfilePictureFrom$1$1", f = "ReelsPreviewView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.reels.ReelsPreviewView$showProfilePictureFrom$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(bitmap, reelsPreviewView2, r5);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                ReelsPreviewView.A01(bitmap, reelsPreviewView2);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReelsPreviewView$showProfilePictureFrom$1(ReelsPreviewView reelsPreviewView, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = reelsPreviewView;
        this.$url = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ReelsPreviewView$showProfilePictureFrom$1(this.this$0, this.$url, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ReelsPreviewView reelsPreviewView = this.this$0;
            File A0Q = ((C218617r) reelsPreviewView.getFMessageIO().get()).A0Q(this.$url);
            C18100vl r0 = reelsPreviewView.A0A;
            final Bitmap bitmap = AnonymousClass204.A0A(new AnonymousClass25O(C72453Mb.A0I(r0), C72453Mb.A0I(r0)), A0Q).A02;
            C18600wl mainDispatcher = this.this$0.getMainDispatcher();
            final ReelsPreviewView reelsPreviewView2 = this.this$0;
            AnonymousClass1 r02 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, mainDispatcher, r02) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReelsPreviewView$showProfilePictureFrom$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
