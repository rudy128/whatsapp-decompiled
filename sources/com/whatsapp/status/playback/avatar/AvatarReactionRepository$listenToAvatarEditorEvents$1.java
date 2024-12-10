package com.whatsapp.status.playback.avatar;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$listenToAvatarEditorEvents$1", f = "AvatarReactionRepository.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionRepository$listenToAvatarEditorEvents$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ WeakReference $listener;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AvatarReactionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$listenToAvatarEditorEvents$1(AvatarReactionRepository avatarReactionRepository, WeakReference weakReference, C30391dr r4) {
        super(2, r4);
        this.this$0 = avatarReactionRepository;
        this.$listener = weakReference;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        AvatarReactionRepository$listenToAvatarEditorEvents$1 avatarReactionRepository$listenToAvatarEditorEvents$1 = new AvatarReactionRepository$listenToAvatarEditorEvents$1(this.this$0, this.$listener, r5);
        avatarReactionRepository$listenToAvatarEditorEvents$1.L$0 = obj;
        return avatarReactionRepository$listenToAvatarEditorEvents$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r6.label
            r0 = 1
            if (r1 == 0) goto L_0x000f
            if (r1 != r0) goto L_0x003e
            X.C30691eM.A01(r7)
        L_0x000c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x000f:
            X.C30691eM.A01(r7)
            java.lang.Object r1 = r6.L$0
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r4 = r6.this$0
            java.lang.ref.WeakReference r3 = r6.$listener
            r6.label = r0
            boolean r0 = r1 instanceof X.AnonymousClass6E5
            r2 = 0
            if (r0 == 0) goto L_0x002f
            X.0wl r1 = r4.A08
            com.whatsapp.status.playback.avatar.AvatarReactionRepository$handleAvatarEvent$2 r0 = new com.whatsapp.status.playback.avatar.AvatarReactionRepository$handleAvatarEvent$2
            r0.<init>(r4, r3, r2)
        L_0x0026:
            X.1OS r0 = (X.AnonymousClass1OS) r0
            java.lang.Object r0 = X.C30451dy.A00(r6, r1, r0)
        L_0x002c:
            if (r0 != r5) goto L_0x000c
            return r5
        L_0x002f:
            boolean r0 = r1 instanceof X.AnonymousClass6E6
            if (r0 == 0) goto L_0x003b
            X.0wl r1 = r4.A08
            com.whatsapp.status.playback.avatar.AvatarReactionRepository$handleAvatarEvent$3 r0 = new com.whatsapp.status.playback.avatar.AvatarReactionRepository$handleAvatarEvent$3
            r0.<init>(r3, r2)
            goto L_0x0026
        L_0x003b:
            X.1Wu r0 = X.C27621Wu.A00
            goto L_0x002c
        L_0x003e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.avatar.AvatarReactionRepository$listenToAvatarEditorEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarReactionRepository$listenToAvatarEditorEvents$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
