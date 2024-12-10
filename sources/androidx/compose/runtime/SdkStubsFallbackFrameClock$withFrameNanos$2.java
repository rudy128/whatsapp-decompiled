package androidx.compose.runtime;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
public final class SdkStubsFallbackFrameClock$withFrameNanos$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $onFrame;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SdkStubsFallbackFrameClock$withFrameNanos$2(C30391dr r2, C22821Di r3) {
        super(2, r2);
        this.$onFrame = r3;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((SdkStubsFallbackFrameClock$withFrameNanos$2) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(r4, this.$onFrame);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.label = 1;
            if (C62882s9.A00(this, 16) == A03) {
                return A03;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return this.$onFrame.invoke(new Long(System.nanoTime()));
    }
}
