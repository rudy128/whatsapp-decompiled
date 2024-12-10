package com.whatsapp.stickers.starred;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1OS;
import X.AnonymousClass4W9;
import X.AnonymousClass6H6;
import X.AnonymousClass7vX;
import X.C108475bl;
import X.C108965cb;
import X.C138666xU;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.starred.StarredStickersFlow$avatarStickerCallbackFlow$1", f = "StarredStickersFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
public final class StarredStickersFlow$avatarStickerCallbackFlow$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass00H $stickerObservers;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C138666xU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarredStickersFlow$avatarStickerCallbackFlow$1(C138666xU r2, AnonymousClass00H r3, C30391dr r4) {
        super(2, r4);
        this.$stickerObservers = r3;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        StarredStickersFlow$avatarStickerCallbackFlow$1 starredStickersFlow$avatarStickerCallbackFlow$1 = new StarredStickersFlow$avatarStickerCallbackFlow$1(this.this$0, this.$stickerObservers, r5);
        starredStickersFlow$avatarStickerCallbackFlow$1.L$0 = obj;
        return starredStickersFlow$avatarStickerCallbackFlow$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108475bl r3 = (C108475bl) this.L$0;
            AnonymousClass6H6 r2 = new AnonymousClass6H6(this.this$0, r3, 4);
            C108965cb.A1J(r2, this.$stickerObservers);
            C138666xU.A00(this.this$0, r3, 2);
            AnonymousClass7vX r0 = new AnonymousClass7vX(r2, this.$stickerObservers);
            this.label = 1;
            if (AnonymousClass4W9.A00(this, r0, r3) == r5) {
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
        return ((StarredStickersFlow$avatarStickerCallbackFlow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
