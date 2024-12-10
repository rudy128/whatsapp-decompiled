package X;

/* renamed from: X.8EO  reason: invalid class name */
public abstract class AnonymousClass8EO extends C24398C1t {
    public final String type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8EO(String str, CharSequence charSequence) {
        super(str, charSequence);
        C18070vi.A0d(str, 1);
        this.type = str;
        if (str.length() <= 0) {
            throw AnonymousClass000.A0k("type must not be empty");
        }
    }
}
