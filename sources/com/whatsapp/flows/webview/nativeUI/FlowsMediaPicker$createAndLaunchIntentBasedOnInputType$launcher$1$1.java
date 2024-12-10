package com.whatsapp.flows.webview.nativeUI;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C005702m;
import X.C108985cd;
import X.C139346yg;
import X.C18070vi;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.nativeUI.FlowsMediaPicker$createAndLaunchIntentBasedOnInputType$launcher$1$1", f = "FlowsMediaPicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsMediaPicker$createAndLaunchIntentBasedOnInputType$launcher$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $collectionId;
    public final /* synthetic */ String $inputType;
    public final /* synthetic */ int $maxFileSizeBytes;
    public final /* synthetic */ C005702m $result;
    public final /* synthetic */ C22821Di $uploadResponseStatus;
    public int label;
    public final /* synthetic */ C139346yg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsMediaPicker$createAndLaunchIntentBasedOnInputType$launcher$1$1(C005702m r2, C139346yg r3, String str, String str2, C30391dr r6, C22821Di r7, int i) {
        super(2, r6);
        this.this$0 = r3;
        this.$result = r2;
        this.$collectionId = str;
        this.$maxFileSizeBytes = i;
        this.$inputType = str2;
        this.$uploadResponseStatus = r7;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        C139346yg r2 = this.this$0;
        return new FlowsMediaPicker$createAndLaunchIntentBasedOnInputType$launcher$1$1(this.$result, r2, this.$collectionId, this.$inputType, r10, this.$uploadResponseStatus, this.$maxFileSizeBytes);
    }

    public final Object invokeSuspend(Object obj) {
        Uri[] uriArr;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C139346yg r6 = this.this$0;
            C005702m r0 = this.$result;
            String str = this.$collectionId;
            int i = this.$maxFileSizeBytes;
            String str2 = this.$inputType;
            C22821Di r11 = this.$uploadResponseStatus;
            int A17 = C18070vi.A17(r0, str);
            C108985cd.A1D(str2, r11);
            Intent intent = r0.A01;
            if (r0.A00 == -1 && intent != null) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                if (parcelableArrayListExtra == null || (uriArr = (Uri[]) parcelableArrayListExtra.toArray(new Uri[0])) == null) {
                    uriArr = new Uri[A17];
                    uriArr[0] = intent.getData();
                }
                boolean booleanExtra = intent.getBooleanExtra("selection_from_gallery_picker", false);
                for (Uri uri : uriArr) {
                    if (uri != null) {
                        r6.A01(uri, str, C108985cd.A0f(), str2, r11, i, booleanExtra);
                    }
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsMediaPicker$createAndLaunchIntentBasedOnInputType$launcher$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
