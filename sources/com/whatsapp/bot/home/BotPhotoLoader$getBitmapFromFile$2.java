package com.whatsapp.bot.home;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass2RM;
import X.C122616Rb;
import X.C136486tt;
import X.C139536z0;
import X.C25291Nq;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.net.Uri;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBot;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.home.BotPhotoLoader$getBitmapFromFile$2", f = "BotPhotoLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BotPhotoLoader$getBitmapFromFile$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AiHomeBot $bot;
    public final /* synthetic */ C122616Rb $botPhotoType;
    public int label;
    public final /* synthetic */ C136486tt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotPhotoLoader$getBitmapFromFile$2(C136486tt r2, C122616Rb r3, AiHomeBot aiHomeBot, C30391dr r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$bot = aiHomeBot;
        this.$botPhotoType = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new BotPhotoLoader$getBitmapFromFile$2(this.this$0, this.$botPhotoType, this.$bot, r6);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        if (this.label == 0) {
            C30691eM.A01(obj);
            File A01 = ((C139536z0) this.this$0.A04.get()).A01(this.$botPhotoType, this.$bot);
            if (A01 != null) {
                C136486tt r1 = this.this$0;
                try {
                    Uri fromFile = Uri.fromFile(A01);
                    int i = r1.A00;
                    return ((C25291Nq) r1.A05.get()).A08(fromFile, i, i, false, false);
                } catch (IOException e) {
                    e = e;
                    str = "BotPhotoLoader/getBitmapFromFile/IOException";
                    Log.e(str, e);
                    return null;
                } catch (AnonymousClass2RM e2) {
                    e = e2;
                    str = "BotPhotoLoader/getBitmapFromFile/NotAnImageException";
                    Log.e(str, e);
                    return null;
                } catch (OutOfMemoryError e3) {
                    e = e3;
                    str = "BotPhotoLoader/getBitmapFromFile/OutOfMemoryError";
                    Log.e(str, e);
                    return null;
                }
            }
            return null;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BotPhotoLoader$getBitmapFromFile$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
