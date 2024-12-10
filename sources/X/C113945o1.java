package X;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.5o1  reason: invalid class name and case insensitive filesystem */
public class C113945o1 extends C142777At {
    public final Pattern A00 = Pattern.compile("\\A\\d+");

    public C113945o1() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
    }

    public final boolean A00() {
        return C108975cc.A1C(Build.VERSION.SDK_INT, 33);
    }

    public boolean A01() {
        boolean A01 = super.A01();
        if (!A01 || Build.VERSION.SDK_INT >= 29) {
            return A01;
        }
        PackageInfo A002 = C1403370z.A00();
        if (A002 == null) {
            return false;
        }
        Matcher matcher = this.A00.matcher(A002.versionName);
        if (!matcher.find() || Integer.parseInt(A002.versionName.substring(matcher.start(), matcher.end())) < 105) {
            return false;
        }
        return true;
    }
}
