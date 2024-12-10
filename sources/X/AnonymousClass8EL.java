package X;

/* renamed from: X.8EL  reason: invalid class name */
public final class AnonymousClass8EL extends C2O {
    public final String type;

    public AnonymousClass8EL(String str, CharSequence charSequence) {
        super(str, charSequence);
        this.type = str;
        if (str.length() <= 0) {
            throw AnonymousClass000.A0k("type must not be empty");
        }
    }
}
