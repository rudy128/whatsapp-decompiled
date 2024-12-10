package com.whatsapp.flows.webview.nativeUI;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C1187164q;
import X.C136356tg;
import X.C22811Dh;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.net.Uri;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.nativeUI.FlowsMediaPicker$startJob$3$2", f = "FlowsMediaPicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsMediaPicker$startJob$3$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $collectionId;
    public final /* synthetic */ int $errorCode;
    public final /* synthetic */ C22811Dh $isRetryable;
    public final /* synthetic */ int $maxFileSizeBytes;
    public final /* synthetic */ String $mediaJobId;
    public final /* synthetic */ Uri $mediaJobUri;
    public final /* synthetic */ boolean $selectionFromGalleryPicker;
    public final /* synthetic */ C22821Di $uploadResponse;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsMediaPicker$startJob$3$2(Uri uri, String str, String str2, C30391dr r5, C22821Di r6, C22811Dh r7, int i, int i2, boolean z) {
        super(2, r5);
        this.$uploadResponse = r6;
        this.$collectionId = str;
        this.$mediaJobId = str2;
        this.$mediaJobUri = uri;
        this.$maxFileSizeBytes = i;
        this.$errorCode = i2;
        this.$isRetryable = r7;
        this.$selectionFromGalleryPicker = z;
    }

    public final C30391dr create(Object obj, C30391dr r12) {
        C22821Di r5 = this.$uploadResponse;
        String str = this.$collectionId;
        String str2 = this.$mediaJobId;
        return new FlowsMediaPicker$startJob$3$2(this.$mediaJobUri, str, str2, r12, r5, this.$isRetryable, this.$maxFileSizeBytes, this.$errorCode, this.$selectionFromGalleryPicker);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$uploadResponse.invoke(new C1187164q(new C136356tg(this.$mediaJobUri, this.$collectionId, this.$mediaJobId, this.$maxFileSizeBytes, this.$errorCode, this.$isRetryable.element, this.$selectionFromGalleryPicker)));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsMediaPicker$startJob$3$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
