package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2", f = "AvatarStickersRepository.kt", i = {1, 2, 3}, l = {274, 292, 304, 322}, m = "invokeSuspend", n = {"error", "error", "revisionOutdated"}, s = {"L$0", "L$0", "L$0"})
public final class AvatarStickersRepository$fetchOnDemandAvatarStickers$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $defaultPack;
    public final /* synthetic */ Set $stableIds;
    public Object L$0;
    public int label;
    public final /* synthetic */ AvatarStickersRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchOnDemandAvatarStickers$2(AvatarStickersRepository avatarStickersRepository, Set set, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = avatarStickersRepository;
        this.$stableIds = set;
        this.$defaultPack = z;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AvatarStickersRepository$fetchOnDemandAvatarStickers$2(this.this$0, this.$stableIds, r6, this.$defaultPack);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: X.6Ta} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r2 = r14.label
            r5 = 4
            r6 = 3
            r1 = 2
            r0 = 1
            r3 = 0
            if (r2 == 0) goto L_0x0018
            if (r2 == r0) goto L_0x0051
            if (r2 == r1) goto L_0x00f1
            if (r2 == r6) goto L_0x0115
            if (r2 == r5) goto L_0x00e9
            java.lang.IllegalStateException r6 = X.AnonymousClass000.A0l()
        L_0x0017:
            throw r6
        L_0x0018:
            X.C30691eM.A01(r15)
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository r2 = r14.this$0
            X.0vp r2 = r2.A08
            java.lang.Object r8 = r2.get()
            X.6ef r8 = (X.C127626ef) r8
            X.C18070vi.A0b(r8)
            java.util.Set r12 = r14.$stableIds
            boolean r13 = r14.$defaultPack
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository r2 = r14.this$0
            X.00H r2 = r2.A01
            java.lang.String r10 = X.C138886xr.A00(r2)
            java.lang.Integer r9 = X.AnonymousClass00R.A00
            X.0wS r11 = X.C18460wS.A00
            X.C108975cc.A12(r12, r11, r5)
            X.87k r2 = r8.A01
            X.7L3 r7 = new X.7L3
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.7I9 r2 = r2.BGe(r7)
            r14.label = r0
            X.1Ho r0 = X.C23761Hn.A01
            java.lang.Object r15 = r2.CBx(r14, r0)
            if (r15 != r4) goto L_0x0054
            return r4
        L_0x0051:
            X.C30691eM.A01(r15)
        L_0x0054:
            X.6xC r15 = (X.C138506xC) r15
            X.6Tb r2 = X.AnonymousClass6XG.A00(r15)
            boolean r0 = r2 instanceof X.AnonymousClass6D8
            if (r0 == 0) goto L_0x0175
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AvatarStickersRepository/fetchOnDemandAvatarStickers/"
            r7.append(r0)
            X.6D8 r2 = (X.AnonymousClass6D8) r2
            java.lang.Object r2 = r2.A00
            r7.append(r2)
            X.C17890vO.A0w(r7)
            boolean r0 = r2 instanceof X.C123076Ta
            if (r0 == 0) goto L_0x00af
            r7 = r2
            X.6Ta r7 = (X.C123076Ta) r7
        L_0x0078:
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository r9 = r14.this$0
            if (r7 == 0) goto L_0x00ac
            java.lang.String r8 = com.whatsapp.productinfra.avatar.data.AvatarStickersRepository.A01(r7)
            if (r8 == 0) goto L_0x00ac
        L_0x0082:
            java.lang.String r0 = "fetch_on_demand_avatar_stickers_failed"
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository.A02(r9, r0, r8)
            boolean r0 = r7 instanceof X.AnonymousClass6D1
            if (r0 != 0) goto L_0x0170
            boolean r0 = r7 instanceof X.AnonymousClass6D2
            if (r0 == 0) goto L_0x00b1
            r0 = r7
            X.6D2 r0 = (X.AnonymousClass6D2) r0
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass6DZ
            if (r0 == 0) goto L_0x00f8
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository r5 = r14.this$0
            X.0wl r2 = r5.A0B
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$1 r0 = new com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$1
            r0.<init>(r5, r7, r3)
            r14.L$0 = r7
            r14.label = r1
            java.lang.Object r0 = X.C30451dy.A00(r14, r2, r0)
            if (r0 != r4) goto L_0x00f8
            return r4
        L_0x00ac:
            java.lang.String r8 = "unknown error"
            goto L_0x0082
        L_0x00af:
            r7 = r3
            goto L_0x0078
        L_0x00b1:
            boolean r0 = r7 instanceof X.AnonymousClass6D3
            if (r0 == 0) goto L_0x012a
            X.6D3 r7 = (X.AnonymousClass6D3) r7
            java.util.List r2 = r7.A00
            java.util.Iterator r1 = r2.iterator()
        L_0x00bd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r6 = r1.next()
            boolean r0 = r6 instanceof X.AnonymousClass6DZ
            if (r0 == 0) goto L_0x00bd
        L_0x00cb:
            boolean r0 = r6 instanceof X.AnonymousClass6DZ
            if (r0 == 0) goto L_0x0123
            X.6DZ r6 = (X.AnonymousClass6DZ) r6
            if (r6 == 0) goto L_0x0123
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository r2 = r14.this$0
            X.0wl r1 = r2.A0B
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$3 r0 = new com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$3
            r0.<init>(r2, r6, r3)
            r14.L$0 = r6
            r14.label = r5
            java.lang.Object r0 = X.C30451dy.A00(r14, r1, r0)
            if (r0 != r4) goto L_0x0017
            return r4
        L_0x00e7:
            r6 = r3
            goto L_0x00cb
        L_0x00e9:
            java.lang.Object r6 = r14.L$0
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            X.C30691eM.A01(r15)
            throw r6
        L_0x00f1:
            java.lang.Object r7 = r14.L$0
            X.6Ta r7 = (X.C123076Ta) r7
            X.C30691eM.A01(r15)
        L_0x00f8:
            r0 = r7
            X.6D2 r0 = (X.AnonymousClass6D2) r0
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.C120276Db
            if (r0 == 0) goto L_0x011c
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository r2 = r14.this$0
            X.0wl r1 = r2.A0B
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$2 r0 = new com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$2
            r0.<init>(r2, r3)
            r14.L$0 = r7
            r14.label = r6
            java.lang.Object r0 = X.C30451dy.A00(r14, r1, r0)
            if (r0 != r4) goto L_0x011c
            return r4
        L_0x0115:
            java.lang.Object r7 = r14.L$0
            X.6Ta r7 = (X.C123076Ta) r7
            X.C30691eM.A01(r15)
        L_0x011c:
            X.6D2 r7 = (X.AnonymousClass6D2) r7
            java.lang.Object r6 = r7.A00
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        L_0x0123:
            java.lang.Object r6 = X.C29431cG.A0b(r2)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        L_0x012a:
            boolean r0 = r7 instanceof X.AnonymousClass6D4
            if (r0 != 0) goto L_0x015b
            boolean r0 = r7 instanceof X.AnonymousClass6D0
            if (r0 != 0) goto L_0x0149
            if (r7 != 0) goto L_0x0144
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown error received: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            java.lang.UnknownError r6 = new java.lang.UnknownError
            r6.<init>(r0)
            throw r6
        L_0x0144:
            X.3EW r6 = X.AnonymousClass3MW.A14()
            throw r6
        L_0x0149:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown error code: "
            r1.append(r0)
            r0 = 0
            r1.append(r0)
            java.lang.IllegalStateException r6 = X.AnonymousClass000.A0m(r1)
            throw r6
        L_0x015b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown error: "
            r1.append(r0)
            X.6D4 r7 = (X.AnonymousClass6D4) r7
            java.lang.Throwable r0 = r7.A00
            r1.append(r0)
            java.lang.IllegalStateException r6 = X.AnonymousClass000.A0m(r1)
            throw r6
        L_0x0170:
            X.6D1 r7 = (X.AnonymousClass6D1) r7
            java.lang.Throwable r6 = r7.A00
            throw r6
        L_0x0175:
            boolean r0 = r2 instanceof X.AnonymousClass6D9
            if (r0 == 0) goto L_0x01e1
            X.6D9 r2 = (X.AnonymousClass6D9) r2
            java.lang.Object r1 = r2.A00
            X.77O r1 = (X.AnonymousClass77O) r1
            if (r1 == 0) goto L_0x01e0
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository r3 = r14.this$0
            X.0vp r0 = r3.A09
            java.lang.Object r4 = r0.get()
            X.71T r4 = (X.AnonymousClass71T) r4
            java.lang.String r6 = r1.A04
            java.lang.String r7 = r1.A05
            java.lang.String r8 = r1.A02
            java.lang.String r9 = r1.A06
            java.lang.String r10 = r1.A08
            java.lang.String r11 = r1.A07
            java.lang.String r12 = r1.A03
            X.77Q r5 = r1.A00
            java.util.List r13 = r1.A09
            X.725 r8 = r4.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.util.List r0 = r8.A07
            X.C18070vi.A0X(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x01aa:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01dd
            X.77d r7 = X.C108945cZ.A0x(r9)
            java.lang.String r0 = r7.A07
            if (r0 == 0) goto L_0x01aa
            X.6uS r2 = r3.A00     // Catch:{ all -> 0x01d8 }
            X.6zL r1 = new X.6zL     // Catch:{ all -> 0x01d8 }
            r1.<init>(r0)     // Catch:{ all -> 0x01d8 }
            r0 = 0
            java.io.File r6 = r2.A00(r1, r0)     // Catch:{ all -> 0x01d8 }
            boolean r0 = r6.exists()     // Catch:{ all -> 0x01d8 }
            if (r0 == 0) goto L_0x01aa
            long r4 = r6.length()     // Catch:{ all -> 0x01d8 }
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01aa
            X.C108945cZ.A1O(r7, r6)     // Catch:{ all -> 0x01d8 }
            goto L_0x01aa
        L_0x01d8:
            r0 = move-exception
            X.C30691eM.A00(r0)
            goto L_0x01aa
        L_0x01dd:
            java.util.List r4 = r8.A07
            return r4
        L_0x01e0:
            return r3
        L_0x01e1:
            X.3EW r6 = X.AnonymousClass3MW.A14()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickersRepository$fetchOnDemandAvatarStickers$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
