package com.whatsapp.status.playback.avatar;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C133416oi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1", f = "AvatarReactionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ File $it;
    public final /* synthetic */ WeakReference $listener;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1(File file, WeakReference weakReference, C30391dr r4) {
        super(2, r4);
        this.$listener = weakReference;
        this.$it = file;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1(this.$it, this.$listener, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C133416oi r1 = (C133416oi) this.$listener.get();
            if (r1 != null) {
                r1.A00(this.$it);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
