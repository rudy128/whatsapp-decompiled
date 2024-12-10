package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4W9;
import X.AnonymousClass6H6;
import X.AnonymousClass7vP;
import X.C108475bl;
import X.C108965cb;
import X.C130746jw;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerPackFlowImpl$stickerPackFlow$1", f = "AvatarStickerPackFlowImpl.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerPackFlowImpl$stickerPackFlow$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C130746jw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackFlowImpl$stickerPackFlow$1(C130746jw r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AvatarStickerPackFlowImpl$stickerPackFlow$1 avatarStickerPackFlowImpl$stickerPackFlow$1 = new AvatarStickerPackFlowImpl$stickerPackFlow$1(this.this$0, r4);
        avatarStickerPackFlowImpl$stickerPackFlow$1.L$0 = obj;
        return avatarStickerPackFlowImpl$stickerPackFlow$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108475bl r3 = (C108475bl) this.L$0;
            C130746jw r1 = this.this$0;
            AnonymousClass6H6 r2 = new AnonymousClass6H6(r1, r3, 0);
            C108965cb.A1J(r2, r1.A01);
            AnonymousClass7vP r0 = new AnonymousClass7vP(r2, this.this$0);
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
        return ((AvatarStickerPackFlowImpl$stickerPackFlow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
