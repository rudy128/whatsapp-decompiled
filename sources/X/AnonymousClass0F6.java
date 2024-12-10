package X;

/* renamed from: X.0F6  reason: invalid class name */
public abstract class AnonymousClass0F6 {
    public static final AnonymousClass0XW A00(C15830rH r3, int i) {
        AnonymousClass0XW r32 = ((AnonymousClass0XW) r3).A03.A02;
        if (r32 != null && (r32.A00 & i) != 0) {
            do {
                int i2 = r32.A01;
                if ((i2 & 2) != 0) {
                    break;
                } else if ((i2 & i) != 0) {
                    return r32;
                } else {
                    r32 = r32.A02;
                }
            } while (r32 != null);
        }
        return null;
    }
}
