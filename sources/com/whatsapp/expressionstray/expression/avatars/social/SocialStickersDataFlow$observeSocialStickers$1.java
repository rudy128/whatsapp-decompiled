package com.whatsapp.expressionstray.expression.avatars.social;

import X.AnonymousClass20G;
import X.C130336jG;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.social.SocialStickersDataFlow$observeSocialStickers$1", f = "SocialStickersDataFlow.kt", i = {1, 1}, l = {101, 103, 114, 116}, m = "invokeSuspend", n = {"$this$combineTransform", "chatFbId"}, s = {"L$0", "L$1"})
public final class SocialStickersDataFlow$observeSocialStickers$1 extends C30431dv implements AnonymousClass20G {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;
    public final /* synthetic */ C130336jG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SocialStickersDataFlow$observeSocialStickers$1(C130336jG r2, C30391dr r3) {
        super(4, r3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SocialStickersDataFlow$observeSocialStickers$1 socialStickersDataFlow$observeSocialStickers$1 = new SocialStickersDataFlow$observeSocialStickers$1(this.this$0, (C30391dr) obj4);
        socialStickersDataFlow$observeSocialStickers$1.L$0 = obj;
        socialStickersDataFlow$observeSocialStickers$1.L$1 = obj2;
        socialStickersDataFlow$observeSocialStickers$1.L$2 = obj3;
        return socialStickersDataFlow$observeSocialStickers$1.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1g4 r8 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r10.label
            r7 = 4
            r6 = 3
            r9 = 2
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 == r3) goto L_0x008b
            if (r0 == r9) goto L_0x0047
            if (r0 == r6) goto L_0x008b
            if (r0 == r7) goto L_0x008b
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0018:
            X.C30691eM.A01(r11)
            java.lang.Object r4 = r10.L$0
            X.1G2 r4 = (X.AnonymousClass1G2) r4
            java.lang.Object r2 = r10.L$1
            java.lang.Object r0 = r10.L$2
            if (r2 == 0) goto L_0x007c
            boolean r0 = r0 instanceof X.AnonymousClass6ER
            if (r0 != 0) goto L_0x007c
            X.6jG r0 = r10.this$0
            X.6y1 r0 = r0.A03
            java.util.Set r0 = r0.A01()
            int r1 = r0.size()
            X.5zd r0 = new X.5zd
            r0.<init>(r1)
            r10.L$0 = r4
            r10.L$1 = r2
            r10.label = r9
            java.lang.Object r0 = r4.BJt(r0, r10)
            if (r0 != r8) goto L_0x0050
            return r8
        L_0x0047:
            java.lang.Object r2 = r10.L$1
            java.lang.Object r4 = r10.L$0
            X.1G2 r4 = (X.AnonymousClass1G2) r4
            X.C30691eM.A01(r11)
        L_0x0050:
            X.6jG r0 = r10.this$0
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository r3 = r0.A01
            java.util.List r2 = X.C18070vi.A0M(r2)
            X.0wl r1 = r3.A0A
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarSocialStickersSync$1 r0 = new com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarSocialStickersSync$1
            r0.<init>(r3, r5, r2, r5)
            java.lang.Object r0 = X.AnonymousClass4GT.A00(r1, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0073
            X.5ze r1 = new X.5ze
            r1.<init>(r0)
            r10.L$0 = r5
            r10.L$1 = r5
            r10.label = r6
            goto L_0x0084
        L_0x0073:
            X.5zf r1 = X.C117365zf.A00
            r10.L$0 = r5
            r10.L$1 = r5
            r10.label = r7
            goto L_0x0084
        L_0x007c:
            X.5zf r1 = X.C117365zf.A00
            r10.L$0 = r5
            r10.L$1 = r5
            r10.label = r3
        L_0x0084:
            java.lang.Object r0 = r4.BJt(r1, r10)
            if (r0 != r8) goto L_0x008e
            return r8
        L_0x008b:
            X.C30691eM.A01(r11)
        L_0x008e:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.avatars.social.SocialStickersDataFlow$observeSocialStickers$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
