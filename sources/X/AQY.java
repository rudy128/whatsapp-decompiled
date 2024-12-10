package X;

import android.os.Build;
import java.lang.ref.WeakReference;

public final class AQY implements C23501Gn {
    public final B9J A00;
    public final C139956zi A01;
    public final WeakReference A02;

    public AQY(AnonymousClass1FU r2, B9J b9j, C139956zi r4) {
        C18070vi.A0d(r4, 2);
        this.A01 = r4;
        this.A00 = b9j;
        this.A02 = AnonymousClass3MW.A0z(r2);
    }

    public void C2V() {
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A02);
        if (A0Z != null) {
            this.A01.A03(A0Z);
        }
    }

    public void C2W() {
        AnonymousClass1FP r5 = (AnonymousClass1FP) this.A02.get();
        if (r5 != null) {
            int BXv = this.A00.BXv();
            if (!r5.isFinishing()) {
                r5.startActivityForResult(AnonymousClass74O.A03(r5, 2131894455, BXv, false), 151);
            }
        }
    }

    public void C9R() {
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A02);
        if (A0Z != null) {
            this.A01.A03(A0Z);
        }
    }

    public void C9S() {
        int i;
        AnonymousClass1FP r5 = (AnonymousClass1FP) this.A02.get();
        if (r5 != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 30) {
                i = 2131894425;
            } else {
                i = 2131894496;
                if (i2 < 33) {
                    i = 2131894495;
                }
            }
            if (!r5.isFinishing()) {
                r5.startActivityForResult(AnonymousClass74O.A03(r5, 2131894494, i, false), 151);
            }
        }
    }
}
