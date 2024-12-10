package com.whatsapp.flows.webview.bridge.factory.impl;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.bridge.factory.impl.StoreShoppingFlowContext$execute$2", f = "StoreShoppingFlowContext.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
public final class StoreShoppingFlowContext$execute$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $flowAction;
    public final /* synthetic */ String $flowActionPayloadEncoded;
    public final /* synthetic */ String $flowId;
    public final /* synthetic */ String $flowToken;
    public int label;
    public final /* synthetic */ StoreShoppingFlowContext this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoreShoppingFlowContext$execute$2(StoreShoppingFlowContext storeShoppingFlowContext, String str, String str2, String str3, String str4, C30391dr r7) {
        super(2, r7);
        this.this$0 = storeShoppingFlowContext;
        this.$flowId = str;
        this.$flowToken = str2;
        this.$flowAction = str3;
        this.$flowActionPayloadEncoded = str4;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new StoreShoppingFlowContext$execute$2(this.this$0, this.$flowId, this.$flowToken, this.$flowAction, this.$flowActionPayloadEncoded, r9);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            StoreShoppingFlowContext storeShoppingFlowContext = this.this$0;
            UserJid userJid = storeShoppingFlowContext.A00;
            String str = this.$flowId;
            String str2 = this.$flowToken;
            C18070vi.A0b(str2);
            String str3 = this.$flowAction;
            String str4 = this.$flowActionPayloadEncoded;
            this.label = 1;
            if (StoreShoppingFlowContext.A00(storeShoppingFlowContext, userJid, str, str2, str3, str4, this) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StoreShoppingFlowContext$execute$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
