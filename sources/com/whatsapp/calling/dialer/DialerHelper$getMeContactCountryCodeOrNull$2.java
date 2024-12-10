package com.whatsapp.calling.dialer;

import X.AnonymousClass000;
import X.AnonymousClass11S;
import X.AnonymousClass17K;
import X.AnonymousClass1BI;
import X.AnonymousClass1E8;
import X.AnonymousClass1OS;
import X.AnonymousClass1YD;
import X.C20056A5f;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerHelper$getMeContactCountryCodeOrNull$2", f = "DialerHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DialerHelper$getMeContactCountryCodeOrNull$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ DialerHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialerHelper$getMeContactCountryCodeOrNull$2(DialerHelper dialerHelper, C30391dr r3) {
        super(2, r3);
        this.this$0 = dialerHelper;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new DialerHelper$getMeContactCountryCodeOrNull$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new DialerHelper$getMeContactCountryCodeOrNull$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1BI r0;
        String A04;
        String A02;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass11S r02 = this.this$0.A02;
            r02.A0I();
            AnonymousClass1E8 r03 = r02.A0D;
            if (r03 == null || (r0 = r03.A0J) == null || (A04 = AnonymousClass17K.A04(r0)) == null || (A02 = C20056A5f.A02(A04)) == null) {
                return null;
            }
            return AnonymousClass1YD.A03(A02);
        }
        throw AnonymousClass000.A0l();
    }
}
