package X;

/* renamed from: X.10z  reason: invalid class name and case insensitive filesystem */
public abstract class C201410z {
    public abstract C201410z add(Object obj);

    public static int expandedCapacity(int i, int i2) {
        if (i2 >= 0) {
            int i3 = i + (i >> 1) + 1;
            if (i3 >= i2) {
                return i3;
            }
            int highestOneBit = Integer.highestOneBit(i2 - 1) << 1;
            if (highestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return highestOneBit;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public C201410z addAll(Iterable iterable) {
        for (Object add : iterable) {
            add(add);
        }
        return this;
    }
}
