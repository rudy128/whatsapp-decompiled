package X;

import android.view.ViewTreeObserver;
import java.io.File;

/* renamed from: X.791  reason: invalid class name */
public class AnonymousClass791 implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00 = true;
    public final /* synthetic */ AnonymousClass70T A01;
    public final /* synthetic */ AnonymousClass7OH A02;
    public final /* synthetic */ File A03;

    public void onGlobalLayout() {
        AnonymousClass7OH r3 = this.A02;
        double floor = Math.floor((double) (C108945cZ.A03(r3.A03) / r3.A03.A0B));
        if (floor != 0.0d || !this.A00) {
            this.A00 = true;
            AnonymousClass3MY.A1D(r3.A0K.A02(), this);
            r3.A0L.CGN(new AnonymousClass7Pu(this.A01, this, this.A03, floor));
            return;
        }
        this.A00 = false;
    }

    public AnonymousClass791(AnonymousClass70T r2, AnonymousClass7OH r3, File file) {
        this.A02 = r3;
        this.A03 = file;
        this.A01 = r2;
    }
}
