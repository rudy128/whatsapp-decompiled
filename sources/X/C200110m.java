package X;

/* renamed from: X.10m  reason: invalid class name and case insensitive filesystem */
public abstract class C200110m {
    public static final void A00(int i, int i2) {
        if (i > i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("toIndex (");
            sb.append(i);
            sb.append(") is greater than size (");
            sb.append(i2);
            sb.append(").");
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }
}
