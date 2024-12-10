package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.9LH  reason: invalid class name */
public final class AnonymousClass9LH extends Exception {
    public static final long serialVersionUID = 3026362227162912146L;
    public final String message;
    public final List throwables;

    public AnonymousClass9LH(List list) {
        this.throwables = AnonymousClass8BU.A0y(list);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(list.size());
        A10.append(" exceptions occurred: ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass8BS.A1I(A10, (Throwable) it.next());
            A10.append(";");
        }
        this.message = A10.toString();
    }

    public String getMessage() {
        return this.message;
    }
}
