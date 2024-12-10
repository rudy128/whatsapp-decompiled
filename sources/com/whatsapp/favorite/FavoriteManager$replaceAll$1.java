package com.whatsapp.favorite;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C17890vO;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorite.FavoriteManager$replaceAll$1", f = "FavoriteManager.kt", i = {}, l = {289}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteManager$replaceAll$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ FavoriteManager this$0;

    @DebugMetadata(c = "com.whatsapp.favorite.FavoriteManager$replaceAll$1$1", f = "FavoriteManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.favorite.FavoriteManager$replaceAll$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                C17890vO.A0q(FavoriteManager.this.A03, 18);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteManager$replaceAll$1(FavoriteManager favoriteManager, C30391dr r3) {
        super(2, r3);
        this.this$0 = favoriteManager;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new FavoriteManager$replaceAll$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FavoriteManager$replaceAll$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final FavoriteManager favoriteManager = this.this$0;
            C18600wl r2 = favoriteManager.A09;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r2, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
