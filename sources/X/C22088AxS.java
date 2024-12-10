package X;

import android.os.CancellationSignal;

/* renamed from: X.AxS  reason: case insensitive filesystem */
public final class C22088AxS extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CancellationSignal $canceller;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22088AxS(CancellationSignal cancellationSignal) {
        super(1);
        this.$canceller = cancellationSignal;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.$canceller.cancel();
        return C27621Wu.A00;
    }
}
