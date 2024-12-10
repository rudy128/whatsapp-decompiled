package X;

import android.content.Context;
import android.view.OrientationEventListener;

public final class BH7 extends OrientationEventListener {
    public final /* synthetic */ C26805DEn A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BH7(Context context, C26805DEn dEn) {
        super(context, 2);
        this.A00 = dEn;
    }

    public void onOrientationChanged(int i) {
        this.A00.A00 = i;
    }
}
