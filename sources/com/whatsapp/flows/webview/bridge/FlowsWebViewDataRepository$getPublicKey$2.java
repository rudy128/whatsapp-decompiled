package com.whatsapp.flows.webview.bridge;

import X.A5A;
import X.AS3;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass8BR;
import X.C108975cc;
import X.C172078sk;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C188249h7;
import X.C190939ll;
import X.C195719tn;
import X.C20081A6h;
import X.C20503ANo;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C71053Dp;
import com.whatsapp.jid.UserJid;
import javax.crypto.SecretKey;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository$getPublicKey$2", f = "FlowsWebViewDataRepository.kt", i = {}, l = {493, 495}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsWebViewDataRepository$getPublicKey$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ boolean $forceRefresh;
    public int label;
    public final /* synthetic */ FlowsWebViewDataRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsWebViewDataRepository$getPublicKey$2(FlowsWebViewDataRepository flowsWebViewDataRepository, UserJid userJid, C30391dr r4, boolean z) {
        super(2, r4);
        this.$forceRefresh = z;
        this.this$0 = flowsWebViewDataRepository;
        this.$bizJid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new FlowsWebViewDataRepository$getPublicKey$2(this.this$0, this.$bizJid, r6, this.$forceRefresh);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            if (this.$forceRefresh || ((A5A) this.this$0.A09.get()).A04(this.$bizJid)) {
                FlowsWebViewDataRepository flowsWebViewDataRepository = this.this$0;
                C195719tn r0 = flowsWebViewDataRepository.A00;
                if (r0 != null) {
                    AnonymousClass8BR.A0V(flowsWebViewDataRepository.A0C).A07(r0.A04.hashCode(), "fetch_key_cache_hit", false);
                }
                boolean A05 = C18020vd.A05(C18040vf.A02, this.this$0.A07, 7351);
                FlowsWebViewDataRepository flowsWebViewDataRepository2 = this.this$0;
                UserJid userJid = this.$bizJid;
                if (A05) {
                    this.label = 1;
                    obj = FlowsWebViewDataRepository.A01(flowsWebViewDataRepository2, userJid, this);
                } else {
                    this.label = 2;
                    C71053Dp A0k = C108975cc.A0k(this);
                    C188249h7 r6 = (C188249h7) flowsWebViewDataRepository2.A0A.get();
                    AS3 as3 = new AS3(flowsWebViewDataRepository2, A0k, userJid, 1);
                    C195719tn r02 = flowsWebViewDataRepository2.A00;
                    if (r02 != null) {
                        i = r02.A04.hashCode();
                    } else {
                        i = -1;
                    }
                    C18070vi.A0d(userJid, 0);
                    C20081A6h.A02(AnonymousClass8BR.A0V(r6.A01), "fetch_key_network_start", i);
                    ((C190939ll) r6.A02.get()).A00(new C20503ANo(r6, as3, (String) null, (SecretKey) null, (byte[]) null, i, true, false), userJid);
                    obj = A0k.A00();
                }
                if (obj == r3) {
                    return r3;
                }
            } else {
                FlowsWebViewDataRepository flowsWebViewDataRepository3 = this.this$0;
                C195719tn r03 = flowsWebViewDataRepository3.A00;
                if (r03 != null) {
                    AnonymousClass8BR.A0V(flowsWebViewDataRepository3.A0C).A07(r03.A04.hashCode(), "fetch_key_cache_hit", true);
                }
                return new C172078sk(this.this$0.A06.A03(this.$bizJid.user));
            }
        } else if (i2 == 1 || i2 == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsWebViewDataRepository$getPublicKey$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
