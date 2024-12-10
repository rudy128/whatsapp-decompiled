package X;

/* renamed from: X.0WM  reason: invalid class name */
public final class AnonymousClass0WM implements C16700sr {
    public static Boolean A00;
    public static final AnonymousClass0WM A01 = new Object();

    public boolean BOD() {
        Boolean bool = A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw AnonymousClass000.A0n("canFocus is read before it is written");
    }

    public void CIF(boolean z) {
        A00 = Boolean.valueOf(z);
    }
}
