package com.whatsapp.expressionstray.expression.stickers.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C135756si;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C98494rF;
import android.graphics.drawable.Drawable;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.mediacomposer.ShapeImageViewLoader$loadShapeIntoView$2", f = "ShapeImageViewLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ShapeImageViewLoader$loadShapeIntoView$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C98494rF $cachedDrawable;
    public final /* synthetic */ C135756si $task;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShapeImageViewLoader$loadShapeIntoView$2(C135756si r2, C30391dr r3, C98494rF r4) {
        super(2, r3);
        this.$task = r2;
        this.$cachedDrawable = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ShapeImageViewLoader$loadShapeIntoView$2(this.$task, r5, this.$cachedDrawable);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$task.A00.setImageDrawable((Drawable) this.$cachedDrawable.element);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ShapeImageViewLoader$loadShapeIntoView$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
