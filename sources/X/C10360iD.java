package X;

import android.view.Choreographer;

/* renamed from: X.0iD  reason: invalid class name and case insensitive filesystem */
public final class C10360iD extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Choreographer.FrameCallback $callback;
    public final /* synthetic */ C15290qO $uiDispatcher;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10360iD(Choreographer.FrameCallback frameCallback, C15290qO r3) {
        super(1);
        this.$uiDispatcher = r3;
        this.$callback = frameCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.$uiDispatcher.A0H(this.$callback);
        return C27621Wu.A00;
    }
}
