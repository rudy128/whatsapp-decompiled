package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass1OS;
import X.C123096Tc;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1", f = "AvatarOnDemandStickers.kt", i = {0, 1, 1}, l = {241, 247, 252}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "stickerLocations"}, s = {"L$0", "L$0", "L$1"})
public final class AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $qplInstanceKey;
    public final /* synthetic */ C123096Tc $searchType;
    public final /* synthetic */ List $stableIds;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1(C123096Tc r2, AvatarOnDemandStickers avatarOnDemandStickers, List list, C30391dr r5, int i) {
        super(2, r5);
        this.this$0 = avatarOnDemandStickers;
        this.$stableIds = list;
        this.$qplInstanceKey = i;
        this.$searchType = r2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1 avatarOnDemandStickers$getOnDemandResultsStickerFlow$1 = new AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1(this.$searchType, this.this$0, this.$stableIds, r8, this.$qplInstanceKey);
        avatarOnDemandStickers$getOnDemandResultsStickerFlow$1.L$0 = obj;
        return avatarOnDemandStickers$getOnDemandResultsStickerFlow$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b2, code lost:
        if (com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A01(r5, r6, r7, r8, r9, r10) != r2) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            r8 = r11
            int r0 = r11.label
            r3 = 3
            r7 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0016
            if (r0 == r1) goto L_0x0036
            if (r0 == r7) goto L_0x0096
            if (r0 != r3) goto L_0x00b5
            X.C30691eM.A01(r12)
        L_0x0013:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0016:
            X.C30691eM.A01(r12)
            java.lang.Object r9 = r11.L$0
            X.1G2 r9 = (X.AnonymousClass1G2) r9
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r11.this$0
            X.6jj r6 = r0.A00
            java.util.List r5 = r11.$stableIds
            r11.L$0 = r9
            r11.label = r1
            X.0wl r4 = r6.A07
            r1 = 0
            com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2 r0 = new com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2
            r0.<init>(r6, r5, r1)
            java.lang.Object r12 = X.C30451dy.A00(r11, r4, r0)
            if (r12 != r2) goto L_0x003d
            return r2
        L_0x0036:
            java.lang.Object r9 = r11.L$0
            X.1G2 r9 = (X.AnonymousClass1G2) r9
            X.C30691eM.A01(r12)
        L_0x003d:
            java.util.List r12 = (java.util.List) r12
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r11.this$0
            X.70I r4 = com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A00(r0)
            int r1 = r11.$qplInstanceKey
            java.lang.String r0 = "stickers_located"
            r4.A03(r1, r0)
            X.6Tc r5 = r11.$searchType
            r11.L$0 = r9
            r11.L$1 = r12
            r11.label = r7
            java.util.ArrayList r4 = X.C29351c6.A0D(r12)
            java.util.Iterator r6 = r12.iterator()
        L_0x005c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r1 = r6.next()
            X.6Te r1 = (X.C123116Te) r1
            boolean r0 = r1 instanceof X.AnonymousClass6E0
            if (r0 == 0) goto L_0x0079
            X.6E0 r1 = (X.AnonymousClass6E0) r1
            X.77d r0 = r1.A00
            X.6Dy r1 = new X.6Dy
            r1.<init>(r0)
        L_0x0075:
            r4.add(r1)
            goto L_0x005c
        L_0x0079:
            boolean r0 = r1 instanceof X.AnonymousClass6E1
            if (r0 == 0) goto L_0x00ba
            X.6E1 r1 = (X.AnonymousClass6E1) r1
            X.6zL r0 = r1.A00
            java.lang.String r0 = r0.A00
            X.6Dx r1 = new X.6Dx
            r1.<init>(r0)
            goto L_0x0075
        L_0x0089:
            X.6Dw r0 = new X.6Dw
            r0.<init>(r5, r4)
            java.lang.Object r0 = r9.BJt(r0, r11)
            if (r0 == r2) goto L_0x00b4
            r7 = r12
            goto L_0x00a1
        L_0x0096:
            java.lang.Object r7 = r11.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r9 = r11.L$0
            X.1G2 r9 = (X.AnonymousClass1G2) r9
            X.C30691eM.A01(r12)
        L_0x00a1:
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r6 = r11.this$0
            X.6Tc r5 = r11.$searchType
            int r10 = r11.$qplInstanceKey
            r0 = 0
            r11.L$0 = r0
            r11.L$1 = r0
            r11.label = r3
            java.lang.Object r0 = com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A01(r5, r6, r7, r8, r9, r10)
            if (r0 != r2) goto L_0x0013
        L_0x00b4:
            return r2
        L_0x00b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00ba:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
