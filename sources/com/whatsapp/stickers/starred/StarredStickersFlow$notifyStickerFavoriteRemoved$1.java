package com.whatsapp.stickers.starred;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.AnonymousClass6I7;
import X.AnonymousClass6I8;
import X.C138666xU;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.starred.StarredStickersFlow$notifyStickerFavoriteRemoved$1", f = "StarredStickersFlow.kt", i = {}, l = {173, 175}, m = "invokeSuspend", n = {}, s = {})
public final class StarredStickersFlow$notifyStickerFavoriteRemoved$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isAvatar;
    public int label;
    public final /* synthetic */ C138666xU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarredStickersFlow$notifyStickerFavoriteRemoved$1(C138666xU r2, C30391dr r3, boolean z) {
        super(2, r3);
        this.$isAvatar = z;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new StarredStickersFlow$notifyStickerFavoriteRemoved$1(this.this$0, r5, this.$isAvatar);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            boolean z = this.$isAvatar;
            AnonymousClass1G3 r1 = this.this$0.A00;
            if (z) {
                obj2 = AnonymousClass6I7.A00;
                this.label = 1;
            } else {
                obj2 = AnonymousClass6I8.A00;
                this.label = 2;
            }
            if (r1.BJt(obj2, this) == r5) {
                return r5;
            }
        } else if (i == 1 || i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StarredStickersFlow$notifyStickerFavoriteRemoved$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
