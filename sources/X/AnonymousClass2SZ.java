package X;

/* renamed from: X.2SZ  reason: invalid class name */
public abstract class AnonymousClass2SZ {
    public static StringBuilder newStringBuilderForCollection(int i) {
        C201310y.checkNonnegative(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824));
    }
}
