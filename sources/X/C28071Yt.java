package X;

/* renamed from: X.1Yt  reason: invalid class name and case insensitive filesystem */
public class C28071Yt {
    public void A00(AnonymousClass1Z5 r12, float f, float f2, float f3) {
        if (this instanceof AnonymousClass2AG) {
            AnonymousClass2AG r0 = (AnonymousClass2AG) this;
            r0.A01.A00(r12, f, f2 - r0.A00, f3);
        } else if (this instanceof AnonymousClass2AF) {
            double d = (double) ((AnonymousClass2AF) this).A00;
            double sqrt = d * Math.sqrt(2.0d);
            float f4 = (float) (sqrt / 2.0d);
            float f5 = (float) (-(sqrt - d));
            float sqrt2 = f5 + ((float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow((double) f4, 2.0d)));
            r12.A02(f2 - f4, sqrt2, 270.0f, 0.0f);
            r12.A01(f2, f5);
            r12.A01(f2 + f4, sqrt2);
        } else {
            r12.A01(f, 0.0f);
        }
    }

    public boolean A01() {
        if (this instanceof AnonymousClass2AG) {
            return ((AnonymousClass2AG) this).A01.A01();
        }
        if (this instanceof AnonymousClass2AF) {
            return true;
        }
        return false;
    }
}
