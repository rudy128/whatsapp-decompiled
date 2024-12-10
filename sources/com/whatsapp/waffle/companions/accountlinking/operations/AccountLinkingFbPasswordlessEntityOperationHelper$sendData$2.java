package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7GO;
import X.AnonymousClass878;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C34891lF;
import X.C72473Md;
import java.security.PrivateKey;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$sendData$2", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {490}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$sendData$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Object $data;
    public final /* synthetic */ AnonymousClass878 $helper;
    public final /* synthetic */ PrivateKey $privateKey;
    public final /* synthetic */ int $smaxId;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$sendData$2(AnonymousClass878 r2, C34891lF r3, Object obj, PrivateKey privateKey, C30391dr r6, int i) {
        super(2, r6);
        this.$helper = r2;
        this.$smaxId = i;
        this.$data = obj;
        this.$privateKey = privateKey;
        this.this$0 = r3;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        AnonymousClass878 r1 = this.$helper;
        int i = this.$smaxId;
        return new AccountLinkingFbPasswordlessEntityOperationHelper$sendData$2(r1, this.this$0, this.$data, this.$privateKey, r9, i);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass878 r6 = this.$helper;
            int i2 = this.$smaxId;
            Object obj2 = this.$data;
            PrivateKey privateKey = this.$privateKey;
            C34891lF r2 = this.this$0;
            this.L$0 = r6;
            this.L$1 = obj2;
            this.L$2 = privateKey;
            this.L$3 = r2;
            this.I$0 = i2;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            r6.CHQ(new AnonymousClass7GO(r2, obj2, privateKey, A0m), obj2, i2);
            obj = A0m.A0C();
            if (obj == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$sendData$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
