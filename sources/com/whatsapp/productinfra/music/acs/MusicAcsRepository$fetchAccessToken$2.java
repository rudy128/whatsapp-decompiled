package com.whatsapp.productinfra.music.acs;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C199319zn;
import X.C20461ALy;
import X.C22416B6y;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C63042sP;
import X.C72473Md;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.music.acs.MusicAcsRepository$fetchAccessToken$2", f = "MusicAcsRepository.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
public final class MusicAcsRepository$fetchAccessToken$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $acsTokenName;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C199319zn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicAcsRepository$fetchAccessToken$2(C199319zn r2, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$acsTokenName = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MusicAcsRepository$fetchAccessToken$2(this.this$0, this.$acsTokenName, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C63042sP.A00((C63042sP) this.this$0.A01.get(), 501817647);
            C199319zn r5 = this.this$0;
            String str = this.$acsTokenName;
            this.L$0 = r5;
            this.L$1 = str;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            ((C22416B6y) r5.A00.get()).BLo(new C20461ALy(r5, A0m), C199319zn.A03, str);
            obj = A0m.A0C();
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MusicAcsRepository$fetchAccessToken$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
