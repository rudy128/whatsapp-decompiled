package X;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;

/* renamed from: X.0ir  reason: invalid class name and case insensitive filesystem */
public final class C10760ir extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10760ir(Recomposer recomposer) {
        super(1);
        this.this$0 = recomposer;
    }

    public final void A00(Throwable th) {
        CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
        cancellationException.initCause(th);
        Recomposer recomposer = this.this$0;
        synchronized (recomposer.A0B) {
            AnonymousClass1OB A0D = recomposer.A09;
            if (A0D != null) {
                recomposer.A0L.setValue(AnonymousClass0CU.ShuttingDown);
                A0D.BEM(cancellationException);
                recomposer.A08 = null;
                A0D.Bdy(new C11020jM(recomposer, th));
            } else {
                recomposer.A01 = cancellationException;
                recomposer.A0L.setValue(AnonymousClass0CU.ShutDown);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((Throwable) obj);
        return C27621Wu.A00;
    }
}
