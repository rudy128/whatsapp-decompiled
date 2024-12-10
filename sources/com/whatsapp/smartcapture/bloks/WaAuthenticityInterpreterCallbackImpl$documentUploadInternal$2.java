package com.whatsapp.smartcapture.bloks;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass978;
import X.AnonymousClass979;
import X.AnonymousClass9Z2;
import X.C180339Md;
import X.C18070vi;
import X.C18090vk;
import X.C19880zA;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$documentUploadInternal$2", f = "WaAuthenticityInterpreterCallbackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WaAuthenticityInterpreterCallbackImpl$documentUploadInternal$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18090vk $onCancel;
    public final /* synthetic */ C22821Di $onFailure;
    public final /* synthetic */ C22821Di $onSuccess;
    public final /* synthetic */ C180339Md $uploadResponse;
    public int label;
    public final /* synthetic */ WaAuthenticityInterpreterCallbackImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaAuthenticityInterpreterCallbackImpl$documentUploadInternal$2(C180339Md r2, WaAuthenticityInterpreterCallbackImpl waAuthenticityInterpreterCallbackImpl, C30391dr r4, C18090vk r5, C22821Di r6, C22821Di r7) {
        super(2, r4);
        this.$uploadResponse = r2;
        this.$onSuccess = r6;
        this.this$0 = waAuthenticityInterpreterCallbackImpl;
        this.$onFailure = r7;
        this.$onCancel = r5;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        C180339Md r1 = this.$uploadResponse;
        C22821Di r5 = this.$onSuccess;
        return new WaAuthenticityInterpreterCallbackImpl$documentUploadInternal$2(r1, this.this$0, r9, this.$onCancel, r5, this.$onFailure);
    }

    public final Object invokeSuspend(Object obj) {
        C22821Di r1;
        String str;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C180339Md r2 = this.$uploadResponse;
            if (r2 instanceof AnonymousClass979) {
                r1 = this.$onSuccess;
                str = ((AnonymousClass979) r2).A00;
            } else {
                if (r2 instanceof AnonymousClass978) {
                    r1 = this.$onFailure;
                    str = ((AnonymousClass978) r2).A00;
                }
                return C27621Wu.A00;
            }
            r1.invoke(str);
            C19880zA r12 = ((AnonymousClass9Z2) this.this$0.A06.get()).A00;
            if (r12.A07()) {
                C18070vi.A0X(r12.A03());
                throw AnonymousClass000.A0s("logMetaVerifiedUserActionWithResult");
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WaAuthenticityInterpreterCallbackImpl$documentUploadInternal$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
