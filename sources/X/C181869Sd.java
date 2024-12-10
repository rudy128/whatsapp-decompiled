package X;

/* renamed from: X.9Sd  reason: invalid class name and case insensitive filesystem */
public abstract class C181869Sd {
    public static final double A00(C179589Io r7, C179589Io r8, double d) {
        long convert = r8.timeUnit.convert(1, r7.timeUnit);
        if (convert > 0) {
            return d * ((double) convert);
        }
        return d / ((double) r7.timeUnit.convert(1, r8.timeUnit));
    }
}
