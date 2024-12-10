package com.whatsapp.status.playback.avatar;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncAvatarReactionFetch$2", f = "AvatarReactionRepository.kt", i = {0}, l = {148, 152}, m = "invokeSuspend", n = {"shouldFetchAnimatedAvatars"}, s = {"I$0"})
public final class AvatarReactionRepository$startAsyncAvatarReactionFetch$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isAnimatedAvatarsEnabled;
    public final /* synthetic */ WeakReference $listener;
    public int I$0;
    public int label;
    public final /* synthetic */ AvatarReactionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$startAsyncAvatarReactionFetch$2(AvatarReactionRepository avatarReactionRepository, WeakReference weakReference, C30391dr r4, boolean z) {
        super(2, r4);
        this.$isAnimatedAvatarsEnabled = z;
        this.this$0 = avatarReactionRepository;
        this.$listener = weakReference;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AvatarReactionRepository$startAsyncAvatarReactionFetch$2(this.this$0, this.$listener, r6, this.$isAnimatedAvatarsEnabled);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (((X.AnonymousClass11E) r8.this$0.A06.get()).A09() == false) goto L_0x002b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 0
            r4 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0013
            if (r0 == r7) goto L_0x003d
            if (r0 != r4) goto L_0x0059
            X.C30691eM.A01(r9)
        L_0x0010:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0013:
            X.C30691eM.A01(r9)
            boolean r0 = r8.$isAnimatedAvatarsEnabled
            if (r0 == 0) goto L_0x002b
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r0 = r8.this$0
            X.00H r0 = r0.A06
            java.lang.Object r0 = r0.get()
            X.11E r0 = (X.AnonymousClass11E) r0
            boolean r0 = r0.A09()
            r3 = 1
            if (r0 != 0) goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r2 = r8.this$0
            X.1OX r1 = r2.A09
            java.lang.ref.WeakReference r0 = r8.$listener
            r8.I$0 = r3
            r8.label = r7
            java.lang.Object r9 = r2.A00(r0, r8, r1, r3)
            if (r9 != r5) goto L_0x0042
            return r5
        L_0x003d:
            int r3 = r8.I$0
            X.C30691eM.A01(r9)
        L_0x0042:
            boolean r0 = X.AnonymousClass000.A1Y(r9)
            if (r0 != 0) goto L_0x0010
            if (r3 == 0) goto L_0x0010
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r2 = r8.this$0
            X.1OX r1 = r2.A09
            java.lang.ref.WeakReference r0 = r8.$listener
            r8.label = r4
            java.lang.Object r0 = r2.A00(r0, r8, r1, r6)
            if (r0 != r5) goto L_0x0010
            return r5
        L_0x0059:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncAvatarReactionFetch$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarReactionRepository$startAsyncAvatarReactionFetch$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
