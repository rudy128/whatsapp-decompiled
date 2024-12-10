package com.whatsapp.bot.home;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.C122616Rb;
import X.C136486tt;
import X.C139536z0;
import X.C20125A8k;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.bot.home.sync.BotPhotoDownloader;
import com.whatsapp.bot.home.sync.BotPhotoDownloader$downloadPhoto$2;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBot;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBotImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.home.BotPhotoLoader$loadPhoto$1", f = "BotPhotoLoader.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
public final class BotPhotoLoader$loadPhoto$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AiHomeBot $bot;
    public final /* synthetic */ AnonymousClass1G4 $flow;
    public int label;
    public final /* synthetic */ C136486tt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotPhotoLoader$loadPhoto$1(C136486tt r2, AiHomeBot aiHomeBot, C30391dr r4, AnonymousClass1G4 r5) {
        super(2, r4);
        this.this$0 = r2;
        this.$bot = aiHomeBot;
        this.$flow = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new BotPhotoLoader$loadPhoto$1(this.this$0, this.$bot, r6, this.$flow);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            BotPhotoDownloader botPhotoDownloader = (BotPhotoDownloader) this.this$0.A03.get();
            AiHomeBot aiHomeBot = this.$bot;
            C122616Rb r4 = this.this$0.A01;
            AnonymousClass1G4 r11 = this.$flow;
            this.label = 1;
            String A0F = ((C20125A8k) aiHomeBot).A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            if (A0F != null) {
                int ordinal = r4.ordinal();
                AiHomeBotImpl.Persona BX1 = aiHomeBot.BX1();
                if (ordinal != 0) {
                    if (BX1 != null) {
                        str = "full_image_url";
                    }
                } else if (BX1 != null) {
                    str = "thumbnail_url";
                }
                String A0F2 = BX1.A0F(str);
                if (A0F2 != null) {
                    if (C30451dy.A00(this, botPhotoDownloader.A08, new BotPhotoDownloader$downloadPhoto$2(r4, botPhotoDownloader, aiHomeBot, C139536z0.A00(r4, aiHomeBot), A0F2, A0F, (C30391dr) null, r11)) == r2) {
                        return r2;
                    }
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BotPhotoLoader$loadPhoto$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
