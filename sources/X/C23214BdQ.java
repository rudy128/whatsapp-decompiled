package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.BdQ  reason: case insensitive filesystem */
public final class C23214BdQ extends C64172uL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ Intent A02;

    public C23214BdQ(Activity activity, Intent intent, int i) {
        this.A02 = intent;
        this.A01 = activity;
        this.A00 = i;
    }

    public final void A00() {
        Intent intent = this.A02;
        if (intent != null) {
            this.A01.startActivityForResult(intent, this.A00);
        }
    }
}
