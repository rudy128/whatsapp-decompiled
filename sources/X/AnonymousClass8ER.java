package X;

/* renamed from: X.8ER  reason: invalid class name */
public abstract class AnonymousClass8ER extends C2O {
    public final String type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8ER(String str, CharSequence charSequence) {
        super(str, charSequence);
        C18070vi.A0d(str, 1);
        this.type = str;
        if (str.length() <= 0) {
            throw AnonymousClass000.A0k("type must not be empty");
        }
    }
}
