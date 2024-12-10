package com.whatsapp.status.playback.avatar;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass71H;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1", f = "AvatarReactionRepository.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ WeakReference $listener;
    public int label;
    public final /* synthetic */ AvatarReactionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1(AvatarReactionRepository avatarReactionRepository, WeakReference weakReference, C30391dr r4) {
        super(2, r4);
        this.this$0 = avatarReactionRepository;
        this.$listener = weakReference;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1(this.this$0, this.$listener, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            File A01 = AnonymousClass71H.A01(this.this$0.A02, "meta-avatar-tab-icon", false);
            if (A01 != null) {
                AvatarReactionRepository avatarReactionRepository = this.this$0;
                WeakReference weakReference = this.$listener;
                avatarReactionRepository.A00 = A01;
                C18600wl r2 = avatarReactionRepository.A08;
                AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1 avatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1 = new AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1(A01, weakReference, (C30391dr) null);
                this.label = 1;
                if (C30451dy.A00(this, r2, avatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1) == r6) {
                    return r6;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
