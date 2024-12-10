package X;

/* renamed from: X.1yx  reason: invalid class name and case insensitive filesystem */
public abstract class C42921yx {
    public static final byte[] A00 = new byte[1792];

    static {
        int i = 0;
        do {
            A00[i] = Character.getDirectionality(i);
            i++;
        } while (i < 1792);
    }
}
