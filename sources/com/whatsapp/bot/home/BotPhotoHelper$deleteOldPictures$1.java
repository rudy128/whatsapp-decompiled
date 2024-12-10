package com.whatsapp.bot.home;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3BV;
import X.C122616Rb;
import X.C139536z0;
import X.C19810z2;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C64062u9;
import java.io.File;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.home.BotPhotoHelper$deleteOldPictures$1", f = "BotPhotoHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BotPhotoHelper$deleteOldPictures$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $botId;
    public int label;
    public final /* synthetic */ C139536z0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotPhotoHelper$deleteOldPictures$1(C139536z0 r2, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$botId = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new BotPhotoHelper$deleteOldPictures$1(this.this$0, this.$botId, r5);
    }

    public final Object invokeSuspend(Object obj) {
        File[] listFiles;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C19810z2<C122616Rb> r0 = C122616Rb.A00;
            C139536z0 r4 = this.this$0;
            ArrayList<File> A13 = AnonymousClass000.A13();
            for (C122616Rb A02 : r0) {
                File A022 = r4.A02(A02, false);
                if (A022 != null) {
                    A13.add(A022);
                }
            }
            String str = this.$botId;
            for (File file : A13) {
                if (file.exists() && (listFiles = file.listFiles(new AnonymousClass3BV(str, 1))) != null) {
                    for (File A0Q : listFiles) {
                        C64062u9.A0Q(A0Q);
                    }
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BotPhotoHelper$deleteOldPictures$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
