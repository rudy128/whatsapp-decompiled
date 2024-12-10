package com.whatsapp.flows.webview.nativeUI;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C1187364s;
import X.C136626u7;
import X.C196299un;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C55612g5;
import X.C61382pa;
import X.C98484rE;
import X.C98494rF;
import android.util.Base64;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.nativeUI.FlowsMediaPicker$startJob$3$1", f = "FlowsMediaPicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsMediaPicker$startJob$3$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $collectionId;
    public final /* synthetic */ C98484rE $fileSize;
    public final /* synthetic */ String $mediaJobId;
    public final /* synthetic */ C98494rF $mediaType;
    public final /* synthetic */ C55612g5 $mediaUploadResponse;
    public final /* synthetic */ C98494rF $mimeType;
    public final /* synthetic */ C22821Di $uploadResponse;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsMediaPicker$startJob$3$1(C55612g5 r2, String str, String str2, C30391dr r5, C22821Di r6, C98484rE r7, C98494rF r8, C98494rF r9) {
        super(2, r5);
        this.$uploadResponse = r6;
        this.$collectionId = str;
        this.$mediaJobId = str2;
        this.$mediaUploadResponse = r2;
        this.$mimeType = r8;
        this.$mediaType = r9;
        this.$fileSize = r7;
    }

    public final C30391dr create(Object obj, C30391dr r11) {
        C22821Di r5 = this.$uploadResponse;
        String str = this.$collectionId;
        String str2 = this.$mediaJobId;
        return new FlowsMediaPicker$startJob$3$1(this.$mediaUploadResponse, str, str2, r11, r5, this.$fileSize, this.$mimeType, this.$mediaType);
    }

    public final Object invokeSuspend(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C22821Di r4 = this.$uploadResponse;
            String str = this.$collectionId;
            String str2 = this.$mediaJobId;
            String A07 = this.$mediaUploadResponse.A02.A07();
            String encodeToString = Base64.encodeToString(this.$mediaUploadResponse.A02.A0C(), 2);
            String encodeToString2 = Base64.encodeToString(this.$mediaUploadResponse.A02.A0D(), 2);
            C196299un r3 = this.$mediaUploadResponse.A02;
            synchronized (r3) {
                bArr = r3.A0O;
            }
            String encodeToString3 = Base64.encodeToString(bArr, 2);
            String A06 = this.$mediaUploadResponse.A02.A06();
            String A05 = this.$mediaUploadResponse.A02.A05();
            C61382pa A00 = this.$mediaUploadResponse.A02.A00();
            Long l = null;
            if (A00 != null) {
                bArr2 = A00.A01;
            } else {
                bArr2 = null;
            }
            String encodeToString4 = Base64.encodeToString(bArr2, 2);
            String A03 = this.$mediaUploadResponse.A02.A03();
            C61382pa A002 = this.$mediaUploadResponse.A02.A00();
            if (A002 != null) {
                l = new Long(A002.A00);
            }
            r4.invoke(new C1187364s(new C136626u7(l, new Long(this.$fileSize.element), str, str2, A07, encodeToString, encodeToString2, encodeToString3, A06, A05, encodeToString4, A03, (String) this.$mimeType.element, (String) this.$mediaType.element)));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsMediaPicker$startJob$3$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
