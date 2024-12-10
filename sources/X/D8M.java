package X;

import android.view.View;

public class D8M implements E8T {
    public final /* synthetic */ View A00;
    public final /* synthetic */ BIJ A01;

    public D8M(View view, BIJ bij) {
        this.A01 = bij;
        this.A00 = view;
    }

    public void C5v() {
        C26071Crl.A02(this.A01, 0.0f);
    }

    public void C5w(int i) {
        int height = this.A00.getHeight();
        if (height > 0) {
            C26071Crl.A02(this.A01, (((float) i) * 1.0f) / ((float) height));
        }
    }

    public void C5x(int i) {
        int height = this.A00.getHeight();
        if (height > 0) {
            C26071Crl.A02(this.A01, (((float) i) * 1.0f) / ((float) height));
        }
    }
}
