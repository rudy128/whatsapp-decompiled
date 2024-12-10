package X;

import android.view.Choreographer;

/* renamed from: X.0iE  reason: invalid class name and case insensitive filesystem */
public final class C10370iE extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Choreographer.FrameCallback $callback;
    public final /* synthetic */ AnonymousClass0VZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10370iE(Choreographer.FrameCallback frameCallback, AnonymousClass0VZ r3) {
        super(1);
        this.this$0 = r3;
        this.$callback = frameCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.this$0.A00().removeFrameCallback(this.$callback);
        return C27621Wu.A00;
    }
}
