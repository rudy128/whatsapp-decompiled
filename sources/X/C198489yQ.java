package X;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.9yQ  reason: invalid class name and case insensitive filesystem */
public class C198489yQ {
    public final char A00;
    public final DecimalFormat A01;
    public final char A02;
    public final int A03;
    public final int A04;

    public static String A00(C198489yQ r5, String str) {
        int lastIndexOf = str.lastIndexOf(r5.A02);
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        int i = lastIndexOf - 1;
        while (i > 0 && AnonymousClass8BU.A1Y(str, i - 1)) {
            i--;
        }
        StringBuilder sb = new StringBuilder(AnonymousClass8BS.A0o(str, i + 1));
        while (true) {
            i++;
            if (i >= lastIndexOf) {
                return AnonymousClass000.A0y(str.substring(lastIndexOf), sb);
            }
            int i2 = (lastIndexOf - i) - r5.A03;
            if (i2 == 0 || (i2 > 0 && i2 % r5.A04 == 0)) {
                sb.append(r5.A00);
            }
            sb.append(str.charAt(i));
        }
    }

    public C198489yQ(String str, Locale locale) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(locale);
        this.A01 = decimalFormat;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        this.A02 = decimalFormatSymbols.getDecimalSeparator();
        this.A00 = decimalFormatSymbols.getGroupingSeparator();
        decimalFormat.applyPattern(str);
        decimalFormat.setGroupingUsed(false);
        int indexOf = str.indexOf(46);
        indexOf = indexOf == -1 ? str.length() : indexOf;
        int lastIndexOf = str.lastIndexOf(44, indexOf - 1);
        int i = (indexOf - lastIndexOf) - 1;
        this.A03 = i;
        int lastIndexOf2 = str.lastIndexOf(44, lastIndexOf - 1);
        if (lastIndexOf2 == -1) {
            this.A04 = i;
        } else {
            this.A04 = (lastIndexOf - lastIndexOf2) - 1;
        }
    }
}
