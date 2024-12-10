package X;

import java.util.List;

/* renamed from: X.DZx  reason: case insensitive filesystem */
public class C27219DZx extends RuntimeException {
    public static final long serialVersionUID = -7466929953374883507L;
    public final List missingFields = null;

    public C27219DZx() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
