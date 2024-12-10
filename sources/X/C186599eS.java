package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.9eS  reason: invalid class name and case insensitive filesystem */
public class C186599eS {
    public C03190Gy A00;
    public C22851Dl A01;
    public boolean A02;
    public boolean A03;

    public C186599eS(Context context) {
        Boolean bool = C17960vV.A01;
        if (Build.VERSION.SDK_INT >= 23) {
            this.A00 = new C03190Gy(context);
            this.A01 = new C20335AGr(this, 36);
        }
    }
}
