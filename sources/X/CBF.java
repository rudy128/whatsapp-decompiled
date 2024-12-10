package X;

public abstract class CBF {
    public static void A00(Object[] objArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                throw AnonymousClass000.A0s(AnonymousClass001.A1I("at index ", AnonymousClass000.A10(), i2));
            }
        }
    }
}
