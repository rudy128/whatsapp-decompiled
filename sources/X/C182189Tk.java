package X;

/* renamed from: X.9Tk  reason: invalid class name and case insensitive filesystem */
public abstract class C182189Tk {
    public static final C41661wr A00;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[eE][+-]?");
        String A0y = AnonymousClass000.A0y("(\\p{Digit}+)", A10);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("(0[xX]");
        A102.append("(\\p{XDigit}+)");
        A102.append("(\\.)?)|(0[xX]");
        A102.append("(\\p{XDigit}+)");
        A102.append("?(\\.)");
        A102.append("(\\p{XDigit}+)");
        String A0c = C17890vO.A0c(A102, ')');
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append('(');
        A103.append("(\\p{Digit}+)");
        A103.append("(\\.)?(");
        A103.append("(\\p{Digit}+)");
        A103.append("?)(");
        A103.append(A0y);
        A103.append(")?)|(\\.(");
        A103.append("(\\p{Digit}+)");
        A103.append(")(");
        A103.append(A0y);
        A103.append(")?)|((");
        A103.append(A0c);
        A103.append(")[pP][+-]?");
        String A0l = AnonymousClass8BW.A0l("(\\p{Digit}+)", A103, ')');
        StringBuilder A104 = AnonymousClass000.A10();
        A104.append("[\\x00-\\x20]*[+-]?(NaN|Infinity|((");
        A104.append(A0l);
        A00 = new C41661wr(AnonymousClass000.A0y(")[fFdD]?))[\\x00-\\x20]*", A104));
    }
}
