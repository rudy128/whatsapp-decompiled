package X;

/* renamed from: X.4Vg  reason: invalid class name and case insensitive filesystem */
public abstract class C87354Vg {
    public static final Float A00(C107855aj r1, Integer num) {
        C18070vi.A0d(r1, 0);
        Float BUT = r1.BUq().BUT();
        if (num == null || BUT == null) {
            return null;
        }
        float floatValue = BUT.floatValue();
        return Float.valueOf(C28851b7.A02((((float) num.intValue()) / 100.0f) * floatValue, 0.0f, floatValue));
    }

    public static final Integer A01(C107855aj r1, Float f) {
        Float BUT = r1.BUq().BUT();
        if (f == null || BUT == null) {
            return null;
        }
        int floatValue = (int) ((f.floatValue() / BUT.floatValue()) * 100.0f);
        if (floatValue < 1) {
            floatValue = 1;
        } else if (floatValue > 100) {
            floatValue = 100;
        }
        return Integer.valueOf(floatValue);
    }
}
