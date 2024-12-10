package X;

import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import java.math.BigDecimal;
import java.util.Locale;

public class A2Z {
    public static final boolean A02 = C108975cc.A1C(Build.VERSION.SDK_INT, 24);
    public final DecimalFormat A00;
    public final C198489yQ A01;

    public Number A00(String str) {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            C17960vV.A07(decimalFormat);
            return decimalFormat.parse(str);
        }
        C198489yQ r0 = this.A01;
        C17960vV.A07(r0);
        return r0.A01.parse(str.replace(String.valueOf(r0.A00), ""));
    }

    public String A01() {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            C17960vV.A07(decimalFormat);
            return decimalFormat.format(1.0d);
        }
        C198489yQ r1 = this.A01;
        C17960vV.A07(r1);
        return C198489yQ.A00(r1, r1.A01.format(1.0d));
    }

    public String A02(BigDecimal bigDecimal) {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            C17960vV.A07(decimalFormat);
            return decimalFormat.format(bigDecimal);
        }
        C198489yQ r1 = this.A01;
        C17960vV.A07(r1);
        return C198489yQ.A00(r1, r1.A01.format(bigDecimal));
    }

    public void A03(int i) {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            C17960vV.A07(decimalFormat);
            decimalFormat.setMinimumFractionDigits(i);
            decimalFormat.setMaximumFractionDigits(i);
            return;
        }
        C198489yQ r0 = this.A01;
        C17960vV.A07(r0);
        java.text.DecimalFormat decimalFormat2 = r0.A01;
        decimalFormat2.setMinimumFractionDigits(i);
        decimalFormat2.setMaximumFractionDigits(i);
    }

    public A2Z(String str, Locale locale) {
        if (A02) {
            this.A00 = new DecimalFormat(str, DecimalFormatSymbols.getInstance(locale));
        } else {
            this.A01 = new C198489yQ(str, locale);
        }
    }
}
