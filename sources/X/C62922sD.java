package X;

/* renamed from: X.2sD  reason: invalid class name and case insensitive filesystem */
public abstract class C62922sD {
    public static final AnonymousClass1I8 A00 = new AnonymousClass1I8("NO_VALUE");

    public static final C25701Ph A01(C25691Pg r2, int i, int i2) {
        if (i < 0) {
            throw AnonymousClass001.A13("replay cannot be negative, but was ", AnonymousClass000.A10(), i);
        } else if (i2 < 0) {
            throw AnonymousClass001.A13("extraBufferCapacity cannot be negative, but was ", AnonymousClass000.A10(), i2);
        } else if (i > 0 || i2 > 0 || r2 == C25691Pg.SUSPEND) {
            int i3 = i2 + i;
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            return new C25701Ph(r2, i, i3);
        } else {
            throw AnonymousClass000.A0k(AnonymousClass001.A1E(r2, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", AnonymousClass000.A10()));
        }
    }
}
