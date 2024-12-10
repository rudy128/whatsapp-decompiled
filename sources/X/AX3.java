package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;

public class AX3 implements B8W {
    public final int A00;
    public final Object A01;

    public AX3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C4W() {
        Activity A1B;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 2:
            case 4:
                A1B = ((Fragment) obj).A1B();
                break;
            default:
                A1B = (Activity) obj;
                break;
        }
        A12.A00(A1B);
    }
}
