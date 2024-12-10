package com.whatsapp.bot.home.sync;

import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.C122616Rb;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBot;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.home.sync.BotPhotoDownloader$downloadPhoto$2", f = "BotPhotoDownloader.kt", i = {}, l = {55, 76}, m = "invokeSuspend", n = {}, s = {})
public final class BotPhotoDownloader$downloadPhoto$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AiHomeBot $bot;
    public final /* synthetic */ String $botId;
    public final /* synthetic */ AnonymousClass1G4 $flow;
    public final /* synthetic */ String $photoKey;
    public final /* synthetic */ C122616Rb $preferType;
    public final /* synthetic */ String $url;
    public int label;
    public final /* synthetic */ BotPhotoDownloader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotPhotoDownloader$downloadPhoto$2(C122616Rb r2, BotPhotoDownloader botPhotoDownloader, AiHomeBot aiHomeBot, String str, String str2, String str3, C30391dr r8, AnonymousClass1G4 r9) {
        super(2, r8);
        this.this$0 = botPhotoDownloader;
        this.$bot = aiHomeBot;
        this.$preferType = r2;
        this.$flow = r9;
        this.$photoKey = str;
        this.$url = str2;
        this.$botId = str3;
    }

    public final C30391dr create(Object obj, C30391dr r11) {
        BotPhotoDownloader botPhotoDownloader = this.this$0;
        AiHomeBot aiHomeBot = this.$bot;
        return new BotPhotoDownloader$downloadPhoto$2(this.$preferType, botPhotoDownloader, aiHomeBot, this.$photoKey, this.$url, this.$botId, r11, this.$flow);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r3 = r16
            X.1g4 r1 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r15.label
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0014
            if (r0 == r6) goto L_0x0028
            if (r0 != r2) goto L_0x00aa
            X.C30691eM.A01(r3)
        L_0x0011:
            X.1Wu r1 = X.C27621Wu.A00
            return r1
        L_0x0014:
            X.C30691eM.A01(r3)
            com.whatsapp.bot.home.sync.BotPhotoDownloader r5 = r15.this$0
            com.whatsapp.infra.graphql.generated.aihome.AiHomeBot r4 = r15.$bot
            X.6Rb r3 = r15.$preferType
            X.1G4 r0 = r15.$flow
            r15.label = r6
            java.lang.Object r3 = com.whatsapp.bot.home.sync.BotPhotoDownloader.A00(r3, r5, r4, r15, r0)
            if (r3 != r1) goto L_0x002b
            return r1
        L_0x0028:
            X.C30691eM.A01(r3)
        L_0x002b:
            boolean r0 = X.AnonymousClass000.A1Y(r3)
            if (r0 != 0) goto L_0x0011
            com.whatsapp.bot.home.sync.BotPhotoDownloader r0 = r15.this$0
            java.util.Set r3 = r0.A07
            java.lang.String r0 = r15.$photoKey
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0011
            com.whatsapp.bot.home.sync.BotPhotoDownloader r0 = r15.this$0
            X.6z0 r4 = r0.A01
            com.whatsapp.infra.graphql.generated.aihome.AiHomeBot r3 = r15.$bot
            X.6Rb r0 = r15.$preferType
            java.io.File r12 = r4.A01(r0, r3)
            if (r12 == 0) goto L_0x0011
            com.whatsapp.bot.home.sync.BotPhotoDownloader r0 = r15.this$0
            X.11P r6 = r0.A02
            X.0ve r8 = r0.A04
            X.181 r5 = r0.A00
            X.11Z r7 = r0.A03
            X.1Kg r11 = r0.A06
            X.1Kb r9 = r0.A05
            java.lang.String r13 = r15.$url
            java.lang.String r14 = "image/jpg"
            X.1So r10 = X.C26551So.A0E
            X.68i r4 = new X.68i
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.whatsapp.bot.home.sync.BotPhotoDownloader r0 = r15.this$0
            java.util.Set r3 = r0.A07
            java.lang.String r0 = r15.$photoKey
            r3.add(r0)
            X.6c4 r0 = r4.A03()
            X.73o r4 = r0.A00
            com.whatsapp.bot.home.sync.BotPhotoDownloader r0 = r15.this$0
            java.util.Set r3 = r0.A07
            java.lang.String r0 = r15.$photoKey
            r3.remove(r0)
            boolean r0 = r4.A03()
            if (r0 == 0) goto L_0x009f
            X.1G4 r6 = r15.$flow
            java.lang.String r5 = r15.$botId
            X.6Rb r4 = r15.$preferType
            X.6Rb r3 = X.C122616Rb.A02
            r0 = 1
            if (r4 != r3) goto L_0x008e
            r0 = 2
        L_0x008e:
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r5, r0)
            r15.label = r2
            java.lang.Object r0 = r6.BJt(r0, r15)
            if (r0 != r1) goto L_0x0011
            return r1
        L_0x009f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BotPhotoDownloader/downloadPhoto failed result="
            X.C17900vP.A0X(r4, r0, r1)
            goto L_0x0011
        L_0x00aa:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.home.sync.BotPhotoDownloader$downloadPhoto$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BotPhotoDownloader$downloadPhoto$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
