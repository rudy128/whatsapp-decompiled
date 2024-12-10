package X;

import android.os.Build;
import java.util.Set;

/* renamed from: X.7At  reason: invalid class name and case insensitive filesystem */
public abstract class C142777At implements C1593184b {
    public static final Set A02 = C17880vN.A12();
    public final String A00;
    public final String A01;

    public boolean A01() {
        Set set = AnonymousClass6YN.A00;
        String str = this.A01;
        if (set.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (("eng".equals(str2) || "userdebug".equals(str2)) && set.contains(AnonymousClass000.A0y(":dev", AnonymousClass000.A11(str)))) {
            return true;
        }
        return false;
    }

    public C142777At(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
        A02.add(this);
    }

    public boolean A00() {
        return false;
    }
}
