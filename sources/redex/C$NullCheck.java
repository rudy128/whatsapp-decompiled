package redex;

/* renamed from: redex.$NullCheck  reason: invalid class name */
public abstract class C$NullCheck {
    public static void null_check(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
    }
}
