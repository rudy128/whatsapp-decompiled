package com.whatsapp.expressions.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6g1;
import X.C1417976z;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressions.mediacomposer.ShapeStickerLayoutDataProvider$setShapeStickerLayoutDataSync$1", f = "ShapeStickerLayoutDataProvider.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
public final class ShapeStickerLayoutDataProvider$setShapeStickerLayoutDataSync$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C1417976z $shapeStickerLayoutData;
    public int label;
    public final /* synthetic */ AnonymousClass6g1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShapeStickerLayoutDataProvider$setShapeStickerLayoutDataSync$1(C1417976z r2, AnonymousClass6g1 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$shapeStickerLayoutData = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ShapeStickerLayoutDataProvider$setShapeStickerLayoutDataSync$1(this.$shapeStickerLayoutData, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass6g1 r4 = this.this$0;
            C1417976z r3 = this.$shapeStickerLayoutData;
            this.label = 1;
            if (C30451dy.A00(this, r4.A00, new ShapeStickerLayoutDataProvider$setShapeStickerLayoutDataAsync$2(r3, r4, (C30391dr) null)) == r5) {
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
        return ((ShapeStickerLayoutDataProvider$setShapeStickerLayoutDataSync$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
