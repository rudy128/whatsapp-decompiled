package X;

import android.util.Log;
import com.facebook.wearable.datax.Service;

/* renamed from: X.Dom  reason: case insensitive filesystem */
public final class C27950Dom extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Service this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27950Dom(Service service) {
        super(1);
        this.this$0 = service;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A05 = C17880vN.A05(obj);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Deallocating service ");
        Log.i(Service.TAG, C17880vN.A0t(A10, this.this$0.id));
        Service.deallocateNative(A05);
        return C27621Wu.A00;
    }
}
