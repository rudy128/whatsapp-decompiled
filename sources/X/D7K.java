package X;

import android.content.Context;
import android.view.WindowMetrics;
import androidx.window.extensions.core.util.function.Predicate;

public final /* synthetic */ class D7K implements Predicate {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C22727BMo A01;

    public final boolean test(Object obj) {
        return C26275CwR.A06(this.A00, (WindowMetrics) obj, this.A01);
    }

    public /* synthetic */ D7K(Context context, C22727BMo bMo) {
        this.A01 = bMo;
        this.A00 = context;
    }
}
