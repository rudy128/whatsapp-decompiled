package com.whatsapp.smartcapture.bloks;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass8BR;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.util.Log;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$idvUploadInternal$3", f = "WaAuthenticityInterpreterCallbackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WaAuthenticityInterpreterCallbackImpl$idvUploadInternal$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Map $fileUrisBeforeDeobfuscate;
    public final /* synthetic */ C22821Di $onUploadFailed;
    public final /* synthetic */ C22821Di $onUploadSuccess;
    public final /* synthetic */ Map $successMap;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaAuthenticityInterpreterCallbackImpl$idvUploadInternal$3(Map map, Map map2, C30391dr r4, C22821Di r5, C22821Di r6) {
        super(2, r4);
        this.$successMap = map;
        this.$fileUrisBeforeDeobfuscate = map2;
        this.$onUploadSuccess = r5;
        this.$onUploadFailed = r6;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new WaAuthenticityInterpreterCallbackImpl$idvUploadInternal$3(this.$successMap, this.$fileUrisBeforeDeobfuscate, r8, this.$onUploadSuccess, this.$onUploadFailed);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (!AnonymousClass8BR.A1Y(this.$successMap) || this.$successMap.size() != this.$fileUrisBeforeDeobfuscate.size()) {
                this.$onUploadFailed.invoke("");
                Log.e("WaAuthenticityInterpreterCallbackImpl/idvUpload failure callback was called");
            } else {
                this.$onUploadSuccess.invoke(this.$successMap);
                this.$successMap.size();
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WaAuthenticityInterpreterCallbackImpl$idvUploadInternal$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
