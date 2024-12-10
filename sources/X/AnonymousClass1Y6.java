package X;

/* renamed from: X.1Y6  reason: invalid class name */
public abstract class AnonymousClass1Y6 {
    public static final void A00(Appendable appendable, Object obj, C22821Di r3) {
        if (r3 != null) {
            obj = r3.invoke(obj);
        } else if (obj != null && !(obj instanceof CharSequence)) {
            if (obj instanceof Character) {
                appendable.append(((Character) obj).charValue());
                return;
            }
            obj = String.valueOf(obj);
        }
        appendable.append((CharSequence) obj);
    }
}
