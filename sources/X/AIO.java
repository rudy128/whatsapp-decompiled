package X;

import java.util.List;

public class AIO implements C22407B6l {
    public final C22407B6l A00;
    public final C22407B6l A01;
    public final List A02;
    public final /* synthetic */ C20375AIg A03;

    public AIO(C20375AIg aIg, C22407B6l b6l, C22407B6l b6l2, List list) {
        this.A03 = aIg;
        this.A00 = b6l;
        this.A01 = b6l2;
        this.A02 = list;
    }

    public boolean cancel() {
        boolean cancel;
        synchronized (this.A03.A07) {
            cancel = false | this.A01.cancel() | this.A00.cancel();
        }
        return cancel;
    }
}
