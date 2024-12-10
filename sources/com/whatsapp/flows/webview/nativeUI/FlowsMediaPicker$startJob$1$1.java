package com.whatsapp.flows.webview.nativeUI;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C1187064p;
import X.C136136tK;
import X.C139346yg;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C55362fe;
import X.C98484rE;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.nativeUI.FlowsMediaPicker$startJob$1$1", f = "FlowsMediaPicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsMediaPicker$startJob$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $base64ThumbNail;
    public final /* synthetic */ String $collectionId;
    public final /* synthetic */ C98484rE $fileSize;
    public final /* synthetic */ String $mediaJobId;
    public final /* synthetic */ C55362fe $processMediaResponse;
    public final /* synthetic */ C22821Di $uploadResponse;
    public int label;
    public final /* synthetic */ C139346yg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsMediaPicker$startJob$1$1(C139346yg r2, C55362fe r3, String str, String str2, String str3, C30391dr r7, C22821Di r8, C98484rE r9) {
        super(2, r7);
        this.$fileSize = r9;
        this.this$0 = r2;
        this.$processMediaResponse = r3;
        this.$collectionId = str;
        this.$mediaJobId = str2;
        this.$base64ThumbNail = str3;
        this.$uploadResponse = r8;
    }

    public final C30391dr create(Object obj, C30391dr r11) {
        return new FlowsMediaPicker$startJob$1$1(this.this$0, this.$processMediaResponse, this.$collectionId, this.$mediaJobId, this.$base64ThumbNail, r11, this.$uploadResponse, this.$fileSize);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        long j;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C98484rE r4 = this.$fileSize;
            File file = this.$processMediaResponse.A00;
            String str2 = this.$collectionId;
            String str3 = this.$mediaJobId;
            String str4 = this.$base64ThumbNail;
            C22821Di r2 = this.$uploadResponse;
            Long l = null;
            if (file != null) {
                str = file.getName();
                l = Long.valueOf(file.length());
            } else {
                str = null;
            }
            r2.invoke(new C1187064p(new C136136tK((Integer) null, l, str4, str2, str3, str)));
            if (file != null) {
                j = file.length();
            } else {
                j = 0;
            }
            r4.element = j;
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsMediaPicker$startJob$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
