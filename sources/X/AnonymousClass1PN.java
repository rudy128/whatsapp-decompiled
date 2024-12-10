package X;

import java.io.IOException;

/* renamed from: X.1PN  reason: invalid class name */
public class AnonymousClass1PN extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;
    public C28668EDk unfinishedMessage = null;
    public boolean wasThrownFromInputStream;

    public AnonymousClass1PN(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public AnonymousClass1PN(String str) {
        super(str);
    }
}
