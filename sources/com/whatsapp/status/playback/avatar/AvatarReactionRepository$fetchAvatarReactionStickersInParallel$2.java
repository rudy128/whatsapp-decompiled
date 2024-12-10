package com.whatsapp.status.playback.avatar;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C133416oi;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2", f = "AvatarReactionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $finalAvatarReactionList;
    public final /* synthetic */ WeakReference $listener;
    public int label;
    public final /* synthetic */ AvatarReactionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2(AvatarReactionRepository avatarReactionRepository, WeakReference weakReference, List list, C30391dr r5) {
        super(2, r5);
        this.this$0 = avatarReactionRepository;
        this.$finalAvatarReactionList = list;
        this.$listener = weakReference;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2(this.this$0, this.$listener, this.$finalAvatarReactionList, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AvatarReactionRepository avatarReactionRepository = this.this$0;
            List list = this.$finalAvatarReactionList;
            WeakReference weakReference = this.$listener;
            List A0t = C29431cG.A0t(list);
            C133416oi r0 = (C133416oi) weakReference.get();
            if (r0 != null) {
                r0.A01(A0t);
            }
            avatarReactionRepository.A01 = A0t;
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
