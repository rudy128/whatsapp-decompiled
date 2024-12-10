package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18600wl;
import X.C22385B5o;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.AccountTransferManager$executeRegisterTask$1", f = "AccountTransferManager.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
public final class AccountTransferManager$executeRegisterTask$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22385B5o $accountTransferCallback;
    public int label;
    public final /* synthetic */ AccountTransferManager this$0;

    @DebugMetadata(c = "com.whatsapp.registration.AccountTransferManager$executeRegisterTask$1$1", f = "AccountTransferManager.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.registration.AccountTransferManager$executeRegisterTask$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(b5o, r5);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AccountTransferManager accountTransferManager = AccountTransferManager.this;
                C22385B5o b5o = b5o;
                this.label = 1;
                if (accountTransferManager.A01(b5o, this) == r3) {
                    return r3;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountTransferManager$executeRegisterTask$1(AccountTransferManager accountTransferManager, C22385B5o b5o, C30391dr r4) {
        super(2, r4);
        this.this$0 = accountTransferManager;
        this.$accountTransferCallback = b5o;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AccountTransferManager$executeRegisterTask$1(this.this$0, this.$accountTransferCallback, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final AccountTransferManager accountTransferManager = this.this$0;
            C18600wl r3 = accountTransferManager.A05;
            final C22385B5o b5o = this.$accountTransferCallback;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r3, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AccountTransferManager$executeRegisterTask$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
