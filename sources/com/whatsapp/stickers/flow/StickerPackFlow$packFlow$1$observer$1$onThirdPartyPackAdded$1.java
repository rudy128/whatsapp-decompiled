package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6HC;
import X.AnonymousClass6HF;
import X.AnonymousClass725;
import X.AnonymousClass72N;
import X.C108475bl;
import X.C108945cZ;
import X.C133436ok;
import X.C134006pr;
import X.C18070vi;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1", f = "StickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108475bl $$this$callbackFlow;
    public final /* synthetic */ String $authority;
    public final /* synthetic */ String $identifier;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1(StickerPackFlow stickerPackFlow, String str, String str2, C30391dr r5, C108475bl r6) {
        super(2, r5);
        this.this$0 = stickerPackFlow;
        this.$authority = str;
        this.$identifier = str2;
        this.$$this$callbackFlow = r6;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1(this.this$0, this.$authority, this.$identifier, r8, this.$$this$callbackFlow);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            try {
                String str = this.$authority;
                String str2 = this.$identifier;
                AnonymousClass725 A00 = ((C134006pr) this.this$0.A08.get()).A00(str, str2, C18070vi.A15(str, str2));
                AnonymousClass72N A0z = C108945cZ.A0z(this.this$0.A03);
                String A002 = AnonymousClass725.A00(A00);
                int A02 = A0z.A02(A002);
                A00.A0B = true;
                A00.A00 = A02;
                List list = this.this$0.A00.A00;
                ArrayList A13 = AnonymousClass000.A13();
                for (Object next : list) {
                    if (!C18070vi.A18(((C133436ok) next).A01(), A002)) {
                        A13.add(next);
                    }
                }
                ArrayList A0l = C29431cG.A0l(new AnonymousClass6HF(A00, A002), A13);
                C18070vi.A0d(A0l, 0);
                StickerPackFlow.A00(new AnonymousClass6HC(A0l), this.this$0, this.$$this$callbackFlow);
            } catch (Exception e) {
                Log.e("StickerPackFlow/onThirdPartyPackAdded/e", e);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
