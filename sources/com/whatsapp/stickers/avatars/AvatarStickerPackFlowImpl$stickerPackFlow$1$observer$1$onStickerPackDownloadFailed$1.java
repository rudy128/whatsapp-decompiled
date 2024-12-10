package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6EP;
import X.AnonymousClass6ER;
import X.AnonymousClass725;
import X.C108475bl;
import X.C130746jw;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1", f = "AvatarStickerPackFlowImpl.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108475bl $$this$callbackFlow;
    public int label;
    public final /* synthetic */ C130746jw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1(C130746jw r2, C30391dr r3, C108475bl r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$$this$callbackFlow = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1(this.this$0, r5, this.$$this$callbackFlow);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C130746jw r3 = this.this$0;
            this.label = 1;
            obj = C30451dy.A00(this, r3.A05, new AvatarStickerPackFlowImpl$getStickerPackWithStickers$2(r3, (C30391dr) null));
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass725 r6 = (AnonymousClass725) obj;
        if (r6 != null) {
            this.$$this$callbackFlow.CQ0(new AnonymousClass6EP(r6));
        } else {
            this.$$this$callbackFlow.CQ0(new AnonymousClass6ER("onStickerPackDownloadFailed"));
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
