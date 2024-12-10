package com.whatsapp.expressionstray.expression.avatars.social;

import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.C130336jG;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.social.SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1", f = "SocialStickersDataFlow.kt", i = {0, 1, 2, 2}, l = {58, 60, 64, 83, 85}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "fbId"}, s = {"L$0", "L$0", "L$0", "L$1"})
public final class SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public final /* synthetic */ String $ownFbId;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C130336jG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1(C130336jG r2, AnonymousClass1BI r3, String str, C30391dr r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$chatJid = r3;
        this.$ownFbId = str;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1 socialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1 = new SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1(this.this$0, this.$chatJid, this.$ownFbId, r6);
        socialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1.L$0 = obj;
        return socialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r8.BJt((java.lang.Object) null, r10) == r7) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r2 = r10.label
            r4 = 5
            r6 = 4
            r9 = 3
            r1 = 2
            r0 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0025
            if (r2 == r0) goto L_0x0037
            if (r2 == r1) goto L_0x0058
            if (r2 == r9) goto L_0x001b
            if (r2 == r6) goto L_0x00be
            if (r2 == r4) goto L_0x00be
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001b:
            java.lang.Object r4 = r10.L$1
            java.lang.Object r8 = r10.L$0
            X.1G2 r8 = (X.AnonymousClass1G2) r8
            X.C30691eM.A01(r11)
            goto L_0x0077
        L_0x0025:
            X.C30691eM.A01(r11)
            java.lang.Object r8 = r10.L$0
            X.1G2 r8 = (X.AnonymousClass1G2) r8
            r10.L$0 = r8
            r10.label = r0
            java.lang.Object r0 = r8.BJt(r5, r10)
            if (r0 != r7) goto L_0x003e
        L_0x0036:
            return r7
        L_0x0037:
            java.lang.Object r8 = r10.L$0
            X.1G2 r8 = (X.AnonymousClass1G2) r8
            X.C30691eM.A01(r11)
        L_0x003e:
            X.6jG r0 = r10.this$0
            X.6eh r3 = r0.A04
            X.1BI r2 = r10.$chatJid
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            r10.L$0 = r8
            r10.label = r1
            X.0wl r1 = r3.A01
            com.whatsapp.productinfra.avatar.socialstickers.GetSocialStickersFbId$execute$2 r0 = new com.whatsapp.productinfra.avatar.socialstickers.GetSocialStickersFbId$execute$2
            r0.<init>(r2, r3, r5)
            java.lang.Object r11 = X.C30451dy.A00(r10, r1, r0)
            if (r11 != r7) goto L_0x005f
            return r7
        L_0x0058:
            java.lang.Object r8 = r10.L$0
            X.1G2 r8 = (X.AnonymousClass1G2) r8
            X.C30691eM.A01(r11)
        L_0x005f:
            X.6Tg r11 = (X.C123136Tg) r11
            boolean r0 = r11 instanceof X.AnonymousClass6EK
            if (r0 == 0) goto L_0x00b5
            r0 = r11
            X.6EK r0 = (X.AnonymousClass6EK) r0
            java.lang.String r0 = r0.A00
            r10.L$0 = r8
            r10.L$1 = r11
            r10.label = r9
            java.lang.Object r0 = r8.BJt(r0, r10)
            if (r0 == r7) goto L_0x0036
            r4 = r11
        L_0x0077:
            X.6jG r0 = r10.this$0
            X.6cO r0 = r0.A02
            X.5bm r0 = r0.A00
            X.5WO r3 = X.AnonymousClass4WB.A01(r0)
            java.lang.String r2 = r10.$ownFbId
            r1 = 1
            X.7Sg r0 = new X.7Sg
            r0.<init>(r3, r4, r2, r1)
            X.7Se r1 = new X.7Se
            r1.<init>(r0, r9)
            com.whatsapp.expressionstray.expression.avatars.social.SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1$3 r0 = new com.whatsapp.expressionstray.expression.avatars.social.SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1$3
            r0.<init>(r5)
            r4 = 10
            X.DXs r3 = new X.DXs
            r3.<init>((X.AnonymousClass1OS) r0, (X.C23421Fz) r1, (int) r4)
            X.6jG r2 = r10.this$0
            X.1BI r0 = r10.$chatJid
            com.whatsapp.expressionstray.expression.avatars.social.SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1$4 r1 = new com.whatsapp.expressionstray.expression.avatars.social.SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1$4
            r1.<init>(r0, r5, r8)
            X.DXs r0 = new X.DXs
            r0.<init>((X.AnonymousClass1OS) r1, (X.C23421Fz) r3, (int) r4)
            r10.L$0 = r5
            r10.L$1 = r5
            r10.label = r6
            java.lang.Object r0 = X.C88604aC.A01(r10, r0)
        L_0x00b2:
            if (r0 != r7) goto L_0x00c1
            return r7
        L_0x00b5:
            r10.L$0 = r5
            r10.label = r4
            java.lang.Object r0 = r8.BJt(r5, r10)
            goto L_0x00b2
        L_0x00be:
            X.C30691eM.A01(r11)
        L_0x00c1:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.avatars.social.SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
