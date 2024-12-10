package com.whatsapp.expressionstray.expression.stickers.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass69M;
import X.AnonymousClass69N;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C132866nk;
import X.C134326qP;
import X.C135756si;
import X.C1409773u;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C98494rF;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.mediacomposer.ShapeImageViewLoader$loadShape$job$1", f = "ShapeImageViewLoader.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
public final class ShapeImageViewLoader$loadShape$job$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C135756si $task;
    public int label;
    public final /* synthetic */ C132866nk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShapeImageViewLoader$loadShape$job$1(C135756si r2, C132866nk r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$task = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ShapeImageViewLoader$loadShape$job$1(this.$task, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Drawable drawable;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            C132866nk r7 = this.this$0;
            C135756si r4 = this.$task;
            this.label = 1;
            C134326qP r8 = r4.A01;
            ImageView imageView = r4.A00;
            if (C108965cb.A1V(imageView, r8)) {
                C1409773u r13 = r4.A02;
                C98494rF A00 = C98494rF.A00();
                if (r13 instanceof AnonymousClass69N) {
                    drawable = ((AnonymousClass69N) r13).A00;
                } else if (r13 instanceof AnonymousClass69M) {
                    drawable = ((AnonymousClass69M) r13).A00;
                } else {
                    drawable = null;
                }
                A00.element = drawable;
                Context context = r7.A01;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166729);
                if (r4.A03) {
                    i = context.getResources().getDimensionPixelSize(2131166730);
                    dimensionPixelSize = AnonymousClass3MZ.A01(context, 2131166730);
                } else {
                    i = dimensionPixelSize;
                }
                if (A00.element == null) {
                    boolean A0T = r13.A0T();
                    RectF A08 = AnonymousClass3MW.A08();
                    if (A0T) {
                        f3 = r13.A0B();
                        f4 = r13.A0B();
                        f = ((float) i) - r13.A0B();
                        f2 = ((float) dimensionPixelSize) - r13.A0B();
                    } else {
                        f = (float) dimensionPixelSize;
                        f2 = (float) i;
                        f3 = 0.0f;
                        f4 = 0.0f;
                    }
                    r13.A0O(A08, f3, f4, f, f2);
                    Bitmap A0H = C108945cZ.A0H(i, dimensionPixelSize);
                    r13.A0M(C108955ca.A0E(A0H));
                    A00.element = C108975cc.A08(context, A0H);
                }
                if (C108965cb.A1V(imageView, r8) && C30451dy.A00(this, r7.A04, new ShapeImageViewLoader$loadShapeIntoView$2(r4, (C30391dr) null, A00)) == r5) {
                    return r5;
                }
            }
        } else if (i2 == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ShapeImageViewLoader$loadShape$job$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
