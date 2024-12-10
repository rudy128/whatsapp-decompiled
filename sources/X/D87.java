package X;

import android.view.View;

public final class D87 implements E7I {
    public final /* synthetic */ BIH A00;
    public final /* synthetic */ BEZ A01;

    public D87(BIH bih, BEZ bez) {
        this.A00 = bih;
        this.A01 = bez;
    }

    public void C0x(View view, int i) {
        BIH bih = this.A00;
        bih.requestLayout();
        bih.invalidate();
    }

    public void C10(View view, C28483E3n e3n) {
        this.A01.A08.A0H.remove(this);
    }
}
