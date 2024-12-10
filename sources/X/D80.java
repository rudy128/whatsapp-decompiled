package X;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

public class D80 implements E3l {
    public final int A00;
    public final Object A01;

    public D80(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final PorterDuffColorFilter BbB() {
        int i;
        PorterDuff.Mode mode;
        if (this.A00 != 0) {
            i = C19740yt.A00(((View) this.A01).getContext(), 2131103154);
            mode = PorterDuff.Mode.SRC_IN;
        } else {
            C97634pn r1 = (C97634pn) this.A01;
            C18070vi.A0d(r1, 0);
            i = r1.A00;
            mode = PorterDuff.Mode.SRC_ATOP;
        }
        return new PorterDuffColorFilter(i, mode);
    }
}
