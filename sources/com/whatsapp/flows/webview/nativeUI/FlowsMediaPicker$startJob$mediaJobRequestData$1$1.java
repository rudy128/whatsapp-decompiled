package com.whatsapp.flows.webview.nativeUI;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C1187064p;
import X.C136136tK;
import X.C139346yg;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C98484rE;
import X.C98494rF;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.nativeUI.FlowsMediaPicker$startJob$mediaJobRequestData$1$1", f = "FlowsMediaPicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsMediaPicker$startJob$mediaJobRequestData$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $base64ThumbNail;
    public final /* synthetic */ String $collectionId;
    public final /* synthetic */ int $documentPageCount;
    public final /* synthetic */ File $file;
    public final /* synthetic */ C98484rE $fileSize;
    public final /* synthetic */ String $mediaJobId;
    public final /* synthetic */ C98494rF $mediaType;
    public final /* synthetic */ C22821Di $uploadResponse;
    public int label;
    public final /* synthetic */ C139346yg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsMediaPicker$startJob$mediaJobRequestData$1$1(C139346yg r2, File file, String str, String str2, String str3, C30391dr r7, C22821Di r8, C98484rE r9, C98494rF r10, int i) {
        super(2, r7);
        this.$mediaType = r10;
        this.$fileSize = r9;
        this.this$0 = r2;
        this.$file = file;
        this.$collectionId = str;
        this.$mediaJobId = str2;
        this.$base64ThumbNail = str3;
        this.$documentPageCount = i;
        this.$uploadResponse = r8;
    }

    public final C30391dr create(Object obj, C30391dr r13) {
        C98494rF r9 = this.$mediaType;
        C98484rE r8 = this.$fileSize;
        return new FlowsMediaPicker$startJob$mediaJobRequestData$1$1(this.this$0, this.$file, this.$collectionId, this.$mediaJobId, this.$base64ThumbNail, r13, this.$uploadResponse, r8, r9, this.$documentPageCount);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        long j;
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$mediaType.element = "document";
            C98484rE r3 = this.$fileSize;
            File file = this.$file;
            String str2 = this.$collectionId;
            String str3 = this.$mediaJobId;
            String str4 = this.$base64ThumbNail;
            Integer A0v = AnonymousClass3MW.A0v(this.$documentPageCount);
            C22821Di r2 = this.$uploadResponse;
            Long l = null;
            if (file != null) {
                str = file.getName();
                l = Long.valueOf(file.length());
            } else {
                str = null;
            }
            r2.invoke(new C1187064p(new C136136tK(A0v, l, str4, str2, str3, str)));
            if (file != null) {
                j = file.length();
            } else {
                j = 0;
            }
            r3.element = j;
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsMediaPicker$startJob$mediaJobRequestData$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
