package X;

import android.view.Choreographer;

/* renamed from: X.0hM  reason: invalid class name and case insensitive filesystem */
public final class C09830hM extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Choreographer.FrameCallback $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C09830hM(Choreographer.FrameCallback frameCallback) {
        super(1);
        this.$callback = frameCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C05640Vc.A00.removeFrameCallback(this.$callback);
        return C27621Wu.A00;
    }
}
