package com.whatsapp.calling.datachannel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4W9;
import X.AnonymousClass5DS;
import X.C108475bl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C84684Kl;
import X.C93324in;
import com.whatsapp.voipcalling.Voip;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.datachannel.DataChannelRepository$getDataChannelMessages$1", f = "DataChannelRepository.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
public final class DataChannelRepository$getDataChannelMessages$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C84684Kl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataChannelRepository$getDataChannelMessages$1(C84684Kl r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        DataChannelRepository$getDataChannelMessages$1 dataChannelRepository$getDataChannelMessages$1 = new DataChannelRepository$getDataChannelMessages$1(this.this$0, r4);
        dataChannelRepository$getDataChannelMessages$1.L$0 = obj;
        return dataChannelRepository$getDataChannelMessages$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108475bl r2 = (C108475bl) this.L$0;
            Voip.registerDataChannelCallback(new C93324in(r2));
            AnonymousClass5DS r0 = new AnonymousClass5DS(this.this$0);
            this.label = 1;
            if (AnonymousClass4W9.A00(this, r0, r2) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DataChannelRepository$getDataChannelMessages$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
