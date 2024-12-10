package com.whatsapp.waffle.companions.accountlinking.operations;

import X.AnonymousClass1OS;
import X.AnonymousClass705;
import X.C122936Sm;
import X.C18090vk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C34891lF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonError$2", f = "AccountLinkingFbPasswordlessEntityOperationHelper.kt", i = {}, l = {490}, m = "invokeSuspend", n = {}, s = {})
public final class AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonError$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122936Sm $e;
    public final /* synthetic */ int $errorCode;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ C18090vk $retryRunnable;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ C34891lF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonError$2(AnonymousClass705 r2, C122936Sm r3, C34891lF r4, C30391dr r5, C18090vk r6, int i) {
        super(2, r5);
        this.$errorCode = i;
        this.$e = r3;
        this.this$0 = r4;
        this.$operationRetryState = r2;
        this.$retryRunnable = r6;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        int i = this.$errorCode;
        return new AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonError$2(this.$operationRetryState, this.$e, this.this$0, r9, this.$retryRunnable, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1g4 r1 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r10.label
            r3 = 1
            if (r0 == 0) goto L_0x000d
            if (r0 != r3) goto L_0x006d
            X.C30691eM.A01(r11)
        L_0x000c:
            return r11
        L_0x000d:
            X.C30691eM.A01(r11)
            int r4 = r10.$errorCode
            X.6Sm r6 = r10.$e
            X.1lF r7 = r10.this$0
            X.705 r5 = r10.$operationRetryState
            X.0vk r9 = r10.$retryRunnable
            r10.L$0 = r6
            r10.L$1 = r7
            r10.L$2 = r5
            r10.L$3 = r9
            r10.I$0 = r4
            r10.label = r3
            X.1g7 r2 = X.C72473Md.A0m(r10)
            r0 = 400(0x190, float:5.6E-43)
            if (r4 == r0) goto L_0x004c
            r0 = 405(0x195, float:5.68E-43)
            if (r4 == r0) goto L_0x004c
            r0 = 408(0x198, float:5.72E-43)
            r8 = 0
            if (r4 == r0) goto L_0x005b
            r0 = 416(0x1a0, float:5.83E-43)
            if (r4 == r0) goto L_0x004c
            r0 = 429(0x1ad, float:6.01E-43)
            if (r4 == r0) goto L_0x005b
            r0 = 481(0x1e1, float:6.74E-43)
            if (r4 == r0) goto L_0x0061
            r0 = 500(0x1f4, float:7.0E-43)
            if (r4 == r0) goto L_0x004c
            r0 = 503(0x1f7, float:7.05E-43)
            if (r4 == r0) goto L_0x004c
            r3 = 0
        L_0x004c:
            X.6OB r0 = new X.6OB
            r0.<init>(r6, r3)
        L_0x0051:
            r2.resumeWith(r0)
            java.lang.Object r11 = r2.A0C()
            if (r11 != r1) goto L_0x000c
            return r1
        L_0x005b:
            com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonError$2$1$2 r4 = new com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonError$2$1$2
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0066
        L_0x0061:
            com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonError$2$1$1 r4 = new com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonError$2$1$1
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0066:
            X.1OR r0 = X.AnonymousClass1OR.A00
            java.lang.Object r0 = X.AnonymousClass4GT.A00(r0, r4)
            goto L_0x0051
        L_0x006d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.waffle.companions.accountlinking.operations.AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonError$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountLinkingFbPasswordlessEntityOperationHelper$handleCommonError$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
