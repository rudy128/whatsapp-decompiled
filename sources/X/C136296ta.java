package X;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.6ta  reason: invalid class name and case insensitive filesystem */
public final class C136296ta {
    public double A00 = 0.0d;
    public Long A01 = null;
    public Long A02 = null;
    public Long A03 = null;
    public Long A04 = null;
    public Long A05 = null;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136296ta) {
                C136296ta r7 = (C136296ta) obj;
                if (Double.compare(this.A00, r7.A00) != 0 || !C18070vi.A18(this.A05, r7.A05) || !C18070vi.A18(this.A02, r7.A02) || !C18070vi.A18(this.A04, r7.A04) || !C18070vi.A18(this.A01, r7.A01) || !C18070vi.A18(this.A03, r7.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((AnonymousClass000.A0I(Double.doubleToLongBits(this.A00)) * 31) + AnonymousClass001.A0k(this.A05)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A03);
    }

    public String toString() {
        Locale locale;
        int i;
        Object[] A1b;
        String str;
        int i2;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Long l = this.A05;
        Number number = null;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = this.A04;
            if (l2 != null) {
                long longValue2 = (l2.longValue() - longValue) + C17900vP.A01(this.A03);
                if (Long.valueOf(longValue2) != null) {
                    number = Double.valueOf(((double) longValue2) / 1000.0d);
                }
            }
        }
        Long l3 = this.A03;
        if (l3 != null) {
            Double valueOf = Double.valueOf(((double) l3.longValue()) / 1000.0d);
            locale = Locale.US;
            Object[] objArr = new Object[4];
            if (number != null) {
                i2 = Double.valueOf(this.A00 / number.doubleValue());
            } else {
                i2 = 0;
            }
            objArr[0] = decimalFormat.format(i2);
            objArr[1] = decimalFormat.format(this.A00);
            if (number == null) {
                number = 0;
            }
            objArr[2] = decimalFormat.format(number);
            objArr[3] = decimalFormat.format(valueOf);
            A1b = Arrays.copyOf(objArr, 4);
            str = "%s MBps, %s MB, %s s, Wait: %s s";
        } else {
            locale = Locale.US;
            Object[] objArr2 = new Object[3];
            if (number != null) {
                i = Double.valueOf(this.A00 / number.doubleValue());
            } else {
                i = 0;
            }
            objArr2[0] = decimalFormat.format(i);
            objArr2[1] = decimalFormat.format(this.A00);
            if (number == null) {
                number = 0;
            }
            A1b = C108945cZ.A1b(decimalFormat.format(number), objArr2, 2, 3);
            str = "Speed: %s MBps, Size: %s MB, Time: %s sec";
        }
        return C108955ca.A12(locale, str, A1b);
    }
}
