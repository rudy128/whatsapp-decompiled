package X;

/* renamed from: X.10y  reason: invalid class name and case insensitive filesystem */
public abstract class C201310y {
    public static void checkEntryNotNull(Object obj, Object obj2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("null key in entry: null=");
            sb.append(obj2);
            throw new NullPointerException(sb.toString());
        } else if (obj2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("null value in entry: ");
            sb2.append(obj);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }

    public static int checkNonnegative(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void checkPositive(int i, String str) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("count");
            sb.append(" must be positive but was: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void checkRemove(boolean z) {
        C199610h.A08(z, "no calls to next() since the last call to remove()");
    }
}
