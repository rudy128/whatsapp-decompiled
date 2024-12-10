package X;

import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.2Uz  reason: invalid class name and case insensitive filesystem */
public abstract class C50582Uz {
    public static final Object A00(List list) {
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        throw new NoSuchElementException("List is empty.");
    }
}
