package X;

import java.util.Calendar;

/* renamed from: X.6lE  reason: invalid class name and case insensitive filesystem */
public final class C131516lE {
    public final AnonymousClass11P A00;

    public C131516lE(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final int A00(C18090vk r6, int i, int i2, int i3) {
        C18070vi.A0d(r6, 3);
        if (i2 < 0 || i2 >= 12) {
            throw AnonymousClass001.A13("Months are 0 indexed, invalid month: ", AnonymousClass000.A10(), i2);
        }
        Calendar calendar = (Calendar) r6.invoke();
        calendar.set(i, i2, i3);
        calendar.setLenient(false);
        try {
            calendar.getTime();
            Calendar calendar2 = (Calendar) r6.invoke();
            calendar2.setTimeInMillis(AnonymousClass11P.A01(this.A00));
            int i4 = calendar2.get(1) - calendar.get(1);
            int i5 = calendar.get(2);
            int i6 = calendar2.get(2);
            if (i5 > i6 || (i5 == i6 && calendar.get(5) > calendar2.get(5))) {
                return i4 - 1;
            }
            return i4;
        } catch (Exception unused) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Date format invalid. Year: ");
            A10.append(i);
            A10.append(" Month: ");
            A10.append(i2);
            throw AnonymousClass001.A13(" Day: ", A10, i3);
        }
    }
}
