package X;

import java.text.Format;
import java.text.NumberFormat;

/* renamed from: X.4QX  reason: invalid class name */
public final class AnonymousClass4QX {
    public final C18000vb A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C103005Iq(this));
    public final C18100vl A02 = AnonymousClass1DF.A01(new C103015Ir(this));

    public AnonymousClass4QX(C18000vb r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final String A00(Number number) {
        String format;
        float floatValue = number.floatValue();
        if (floatValue != 0.0f) {
            int floor = (int) ((float) Math.floor((double) ((float) Math.log10((double) Math.abs(floatValue)))));
            C18100vl r1 = this.A02;
            if (floor < (-(((NumberFormat) r1.getValue()).getMaximumFractionDigits() + 2))) {
                Object clone = ((Format) r1.getValue()).clone();
                C18070vi.A0z(clone, "null cannot be cast to non-null type java.text.NumberFormat");
                NumberFormat numberFormat = (NumberFormat) clone;
                numberFormat.setMaximumFractionDigits(Math.abs(floor) - 2);
                format = numberFormat.format(number);
                C18070vi.A0X(format);
                return format;
            }
        }
        format = ((Format) this.A02.getValue()).format(number);
        C18070vi.A0X(format);
        return format;
    }
}
