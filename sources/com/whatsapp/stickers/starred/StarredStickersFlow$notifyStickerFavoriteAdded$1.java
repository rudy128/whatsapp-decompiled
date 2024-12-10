package com.whatsapp.stickers.starred;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.AnonymousClass6I5;
import X.AnonymousClass6I6;
import X.C138666xU;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.starred.StarredStickersFlow$notifyStickerFavoriteAdded$1", f = "StarredStickersFlow.kt", i = {}, l = {187, 190}, m = "invokeSuspend", n = {}, s = {})
public final class StarredStickersFlow$notifyStickerFavoriteAdded$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isAvatarSticker;
    public final /* synthetic */ Collection $starredStickers;
    public int label;
    public final /* synthetic */ C138666xU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarredStickersFlow$notifyStickerFavoriteAdded$1(C138666xU r2, Collection collection, C30391dr r4, boolean z) {
        super(2, r4);
        this.$isAvatarSticker = z;
        this.this$0 = r2;
        this.$starredStickers = collection;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new StarredStickersFlow$notifyStickerFavoriteAdded$1(this.this$0, this.$starredStickers, r6, this.$isAvatarSticker);
    }

    public final Object invokeSuspend(Object obj) {
        Object r0;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            boolean z = this.$isAvatarSticker;
            AnonymousClass1G3 r2 = this.this$0.A00;
            List A0t = C29431cG.A0t(this.$starredStickers);
            if (z) {
                r0 = new AnonymousClass6I5(A0t);
                this.label = 1;
            } else {
                r0 = new AnonymousClass6I6(A0t);
                this.label = 2;
            }
            if (r2.BJt(r0, this) == r6) {
                return r6;
            }
        } else if (i == 1 || i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StarredStickersFlow$notifyStickerFavoriteAdded$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
