package com.whatsapp.status.playback.avatar;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6EP;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$listenToAvatarEditorEvents$2", f = "AvatarReactionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionRepository$listenToAvatarEditorEvents$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isAnimatedAvatars;
    public final /* synthetic */ WeakReference $listener;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AvatarReactionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$listenToAvatarEditorEvents$2(AvatarReactionRepository avatarReactionRepository, WeakReference weakReference, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = avatarReactionRepository;
        this.$isAnimatedAvatars = z;
        this.$listener = weakReference;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        AvatarReactionRepository$listenToAvatarEditorEvents$2 avatarReactionRepository$listenToAvatarEditorEvents$2 = new AvatarReactionRepository$listenToAvatarEditorEvents$2(this.this$0, this.$listener, r6, this.$isAnimatedAvatars);
        avatarReactionRepository$listenToAvatarEditorEvents$2.L$0 = obj;
        return avatarReactionRepository$listenToAvatarEditorEvents$2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.L$0;
            AvatarReactionRepository avatarReactionRepository = this.this$0;
            boolean z = this.$isAnimatedAvatars;
            WeakReference weakReference = this.$listener;
            if (obj2 instanceof AnonymousClass6EP) {
                avatarReactionRepository.A01(weakReference, z);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarReactionRepository$listenToAvatarEditorEvents$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
