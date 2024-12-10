package X;

/* renamed from: X.6Sl  reason: invalid class name and case insensitive filesystem */
public class C122926Sl extends Exception {
    public static final long serialVersionUID = 1;

    public C122926Sl(Throwable th) {
        super("Invalid quoted-printable encoding", th);
    }

    public C122926Sl(String str) {
        super(str);
    }
}
