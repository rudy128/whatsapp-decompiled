package X;

import java.util.List;

/* renamed from: X.1cE  reason: invalid class name and case insensitive filesystem */
public abstract class C29411cE extends C29401cD {
    public static final int A0P(List list, int i) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Element index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new C25411Oc(0, list.size() - 1));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static final int A0Q(List list, int i) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Position index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new C25411Oc(0, list.size()));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
