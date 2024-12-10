package X;

import android.content.Intent;

public final class AGP implements C22492B9y {
    public final int A00;
    public final Intent A01;
    public final /* synthetic */ C161078Bi A02;

    public AGP(Intent intent, C161078Bi r2, int i) {
        this.A02 = r2;
        this.A01 = intent;
        this.A00 = i;
    }

    public void BFM() {
        this.A02.stopSelf(this.A00);
    }

    public Intent getIntent() {
        return this.A01;
    }
}
