package X;

/* renamed from: X.8EC  reason: invalid class name */
public abstract class AnonymousClass8EC extends C161078Bi {
    public C22492B9y A06() {
        try {
            return super.A06();
        } catch (SecurityException e) {
            if (e.getMessage().contains("Caller no longer running")) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("WaJobIntentService/'Caller no longer running' failure for ");
                C17900vP.A0a(this, A10);
                C17880vN.A1M(A10, e);
                return null;
            }
            throw e;
        }
    }
}
