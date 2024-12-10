package com.whatsapp.avatar.autogen;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C202911o;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.autogen.AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1", f = "AvatarAutogenMediaUploadManagerImpl.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $callback;
    public final /* synthetic */ File $file;
    public int label;
    public final /* synthetic */ C202911o this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1(C202911o r2, File file, C30391dr r4, C22821Di r5) {
        super(2, r4);
        this.this$0 = r2;
        this.$file = file;
        this.$callback = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1(this.this$0, this.$file, r6, this.$callback);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C202911o r3 = this.this$0;
            this.label = 1;
            obj = C30451dy.A00(this, r3.A04, new AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3(r3, (C30391dr) null));
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.$callback.invoke(obj);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
