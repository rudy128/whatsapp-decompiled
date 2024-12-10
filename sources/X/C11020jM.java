package X;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;

/* renamed from: X.0jM  reason: invalid class name and case insensitive filesystem */
public final class C11020jM extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Throwable $throwable;
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11020jM(Recomposer recomposer, Throwable th) {
        super(1);
        this.this$0 = recomposer;
        this.$throwable = th;
    }

    public final void A00(Throwable th) {
        Recomposer recomposer = this.this$0;
        AnonymousClass1G4 r0 = Recomposer.A0N;
        Object obj = recomposer.A0B;
        Throwable th2 = this.$throwable;
        synchronized (obj) {
            if (th2 == null) {
                th2 = null;
            } else if (th != null) {
                if (!(th instanceof CancellationException)) {
                    C25359CeJ.A01(th2, th);
                }
            }
            recomposer.A01 = th2;
            recomposer.A0L.setValue(AnonymousClass0CU.ShutDown);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((Throwable) obj);
        return C27621Wu.A00;
    }
}
