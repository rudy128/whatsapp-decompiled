package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass167;
import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.AnonymousClass6EP;
import X.AnonymousClass6EQ;
import X.AnonymousClass6ER;
import X.AnonymousClass725;
import X.C108945cZ;
import X.C130746jw;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C72463Mc;
import java.util.HashMap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerPackFlowImpl$stickerPackFlow$2", f = "AvatarStickerPackFlowImpl.kt", i = {0}, l = {106, 113, 115, 118}, m = "invokeSuspend", n = {"$this$onSubscription"}, s = {"L$0"})
public final class AvatarStickerPackFlowImpl$stickerPackFlow$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C130746jw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackFlowImpl$stickerPackFlow$2(C130746jw r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AvatarStickerPackFlowImpl$stickerPackFlow$2 avatarStickerPackFlowImpl$stickerPackFlow$2 = new AvatarStickerPackFlowImpl$stickerPackFlow$2(this.this$0, r4);
        avatarStickerPackFlowImpl$stickerPackFlow$2.L$0 = obj;
        return avatarStickerPackFlowImpl$stickerPackFlow$2;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1G2 r4;
        Object r1;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r4 = (AnonymousClass1G2) this.L$0;
            C130746jw r6 = this.this$0;
            this.L$0 = r4;
            this.label = 1;
            obj = C30451dy.A00(this, r6.A05, new AvatarStickerPackFlowImpl$getStickerPackWithStickers$2(r6, (C30391dr) null));
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            r4 = (AnonymousClass1G2) this.L$0;
            C30691eM.A01(obj);
        } else if (i == 2 || i == 3 || i == 4) {
            C30691eM.A01(obj);
            return C27621Wu.A00;
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass725 r10 = (AnonymousClass725) obj;
        if (r10 != null) {
            String A00 = AnonymousClass725.A00(r10);
            if (((AnonymousClass167) this.this$0.A02.get()).A01.containsKey(A00)) {
                r1 = new AnonymousClass6EQ(C72463Mc.A0B(C108945cZ.A1D(A00, new HashMap(((AnonymousClass167) this.this$0.A02.get()).A01))));
                this.L$0 = null;
                this.label = 2;
            } else {
                r1 = new AnonymousClass6EP(r10);
                this.L$0 = null;
                this.label = 3;
            }
        } else {
            r1 = new AnonymousClass6ER("onSubscription pack was null");
            this.L$0 = null;
            this.label = 4;
        }
        if (r4.BJt(r1, this) == r3) {
            return r3;
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerPackFlowImpl$stickerPackFlow$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
