package com.whatsapp.expressionstray.expression.avatars;

import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1", f = "AvatarExpressionsViewModel.kt", i = {0}, l = {216, 189}, m = "invokeSuspend", n = {"searchQuery"}, s = {"L$1"})
public final class AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C30391dr r3) {
        super(3, r3);
        this.this$0 = avatarExpressionsViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1 avatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1 = new AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1(this.this$0, (C30391dr) obj3);
        avatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1.L$0 = obj;
        avatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1.L$1 = obj2;
        return avatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0085 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r1) goto L_0x0034
            if (r0 != r5) goto L_0x008a
            X.C30691eM.A01(r9)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r9)
            java.lang.Object r3 = r8.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            java.lang.Object r7 = r8.L$1
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0068
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x0068
            r8.L$0 = r3
            r8.L$1 = r7
            r8.label = r1
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.C62882s9.A00(r8, r0)
            if (r0 != r4) goto L_0x003f
            return r4
        L_0x0034:
            java.lang.Object r7 = r8.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r8.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            X.C30691eM.A01(r9)
        L_0x003f:
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel r6 = r8.this$0
            X.00H r0 = r6.A0B
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r2 = (com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers) r2
            X.6Dt r1 = new X.6Dt
            r1.<init>(r7)
            r0 = 0
            X.Du4 r2 = r2.A03(r1, r0)
            r0 = 0
            X.7Sg r1 = new X.7Sg
            r1.<init>(r6, r2, r7, r0)
            X.0wl r0 = r6.A0I
            X.1Fz r2 = X.AnonymousClass4I5.A00(r0, r1)
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel r1 = r8.this$0
            r0 = 4
            X.7Sf r6 = new X.7Sf
            r6.<init>(r1, r2, r0)
            goto L_0x0078
        L_0x0068:
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel r2 = r8.this$0
            boolean r1 = r2.A01
            com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow r0 = r2.A02
            if (r1 == 0) goto L_0x0086
            X.1Fz r1 = r0.A0B
            r0 = 5
        L_0x0073:
            X.7Sf r6 = new X.7Sf
            r6.<init>(r2, r1, r0)
        L_0x0078:
            r0 = 0
            r8.L$0 = r0
            r8.L$1 = r0
            r8.label = r5
            java.lang.Object r0 = X.C88604aC.A02(r8, r6, r3)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x0086:
            X.1Fz r1 = r0.A0A
            r0 = 6
            goto L_0x0073
        L_0x008a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
