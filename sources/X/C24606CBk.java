package X;

/* renamed from: X.CBk  reason: case insensitive filesystem */
public abstract class C24606CBk {
    public static boolean equalsImpl(C28579E8q e8q, Object obj) {
        if (obj == e8q) {
            return true;
        }
        if (obj instanceof C28579E8q) {
            return e8q.asMap().equals(((C28579E8q) obj).asMap());
        }
        return false;
    }
}
