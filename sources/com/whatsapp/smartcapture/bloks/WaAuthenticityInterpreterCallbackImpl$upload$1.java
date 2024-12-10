package com.whatsapp.smartcapture.bloks;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$upload$1", f = "WaAuthenticityInterpreterCallbackImpl.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
public final class WaAuthenticityInterpreterCallbackImpl$upload$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Map $fileUris;
    public final /* synthetic */ C22821Di $onUploadFailed;
    public final /* synthetic */ C22821Di $onUploadSuccess;
    public final /* synthetic */ String $product;
    public final /* synthetic */ long $submissionId;
    public final /* synthetic */ Map $uploadMediums;
    public int label;
    public final /* synthetic */ WaAuthenticityInterpreterCallbackImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaAuthenticityInterpreterCallbackImpl$upload$1(WaAuthenticityInterpreterCallbackImpl waAuthenticityInterpreterCallbackImpl, String str, Map map, Map map2, C30391dr r6, C22821Di r7, C22821Di r8, long j) {
        super(2, r6);
        this.this$0 = waAuthenticityInterpreterCallbackImpl;
        this.$fileUris = map;
        this.$uploadMediums = map2;
        this.$product = str;
        this.$submissionId = j;
        this.$onUploadSuccess = r7;
        this.$onUploadFailed = r8;
    }

    public final C30391dr create(Object obj, C30391dr r12) {
        WaAuthenticityInterpreterCallbackImpl waAuthenticityInterpreterCallbackImpl = this.this$0;
        Map map = this.$fileUris;
        Map map2 = this.$uploadMediums;
        return new WaAuthenticityInterpreterCallbackImpl$upload$1(waAuthenticityInterpreterCallbackImpl, this.$product, map, map2, r12, this.$onUploadSuccess, this.$onUploadFailed, this.$submissionId);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            WaAuthenticityInterpreterCallbackImpl waAuthenticityInterpreterCallbackImpl = this.this$0;
            Map map = this.$fileUris;
            Map map2 = this.$uploadMediums;
            String str = this.$product;
            long j = this.$submissionId;
            C22821Di r8 = this.$onUploadSuccess;
            C22821Di r9 = this.$onUploadFailed;
            this.label = 1;
            if (waAuthenticityInterpreterCallbackImpl.A00(str, map, map2, this, r8, r9, j) == r2) {
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
        return ((WaAuthenticityInterpreterCallbackImpl$upload$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
