package X;

import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.06M  reason: invalid class name */
public class AnonymousClass06M extends AnonymousClass0Rj {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass06M(View view, Object obj, Object obj2, int i) {
        super(view);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public AnonymousClass0t8 A01() {
        if (this.A00 != 0) {
            return (AnonymousClass0SF) this.A02;
        }
        AnonymousClass06D r0 = ((AnonymousClass06F) this.A01).A00.A0C;
        if (r0 == null) {
            return null;
        }
        return r0.A01();
    }

    public boolean A02() {
        if (this.A00 != 0) {
            return super.A02();
        }
        AnonymousClass03I r1 = ((AnonymousClass06F) this.A01).A00;
        if (r1.A0A != null) {
            return false;
        }
        r1.A0I();
        return true;
    }

    public boolean A03() {
        if (this.A00 != 0) {
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) this.A01;
            C16940tT r2 = appCompatSpinner.A01;
            if (r2.BgV()) {
                return true;
            }
            r2.CMY(AppCompatSpinner.A01(appCompatSpinner), AppCompatSpinner.A00(appCompatSpinner));
            return true;
        }
        ((AnonymousClass06F) this.A01).A00.A0L();
        return true;
    }
}
