package X;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;

/* renamed from: X.0fE  reason: invalid class name and case insensitive filesystem */
public final class C08520fE extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08520fE(Recomposer recomposer) {
        super(0);
        this.this$0 = recomposer;
    }

    public final void A00() {
        C31761g5 A0C;
        Recomposer recomposer = this.this$0;
        synchronized (recomposer.A0B) {
            A0C = recomposer.A0B();
            if (((AnonymousClass0CU) recomposer.A0L.getValue()).compareTo(AnonymousClass0CU.ShuttingDown) <= 0) {
                Throwable th = recomposer.A01;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (A0C != null) {
            A0C.resumeWith(C27621Wu.A00);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        A00();
        return C27621Wu.A00;
    }
}
