package X;

import android.content.Context;
import android.view.WindowMetrics;
import androidx.window.extensions.core.util.function.Predicate;

public final /* synthetic */ class D7J implements Predicate {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C22728BMp A01;

    public final boolean test(Object obj) {
        return C26275CwR.A07(this.A00, (WindowMetrics) obj, this.A01);
    }

    public /* synthetic */ D7J(Context context, C22728BMp bMp) {
        this.A01 = bMp;
        this.A00 = context;
    }
}
