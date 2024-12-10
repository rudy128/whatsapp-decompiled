package X;

import android.view.OrientationEventListener;

/* renamed from: X.DgI  reason: case insensitive filesystem */
public final class C27489DgI extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BUF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27489DgI(BUF buf) {
        super(0);
        this.this$0 = buf;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        if (((OrientationEventListener) this.this$0.A06.getValue()).canDetectOrientation()) {
            ((OrientationEventListener) this.this$0.A06.getValue()).disable();
        }
        return C27621Wu.A00;
    }
}
