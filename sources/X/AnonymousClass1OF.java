package X;

/* renamed from: X.1OF  reason: invalid class name */
public abstract class AnonymousClass1OF {
    public static final AnonymousClass1I8 A00 = new AnonymousClass1I8("COMPLETING_WAITING_CHILDREN");
    public static final AnonymousClass1OH A01 = new AnonymousClass1OH(true);
    public static final AnonymousClass1OH A02 = new AnonymousClass1OH(false);
    public static final AnonymousClass1I8 A03 = new AnonymousClass1I8("COMPLETING_ALREADY");
    public static final AnonymousClass1I8 A04 = new AnonymousClass1I8("COMPLETING_RETRY");
    public static final AnonymousClass1I8 A05 = new AnonymousClass1I8("SEALED");
    public static final AnonymousClass1I8 A06 = new AnonymousClass1I8("TOO_LATE_TO_CANCEL");

    public static final Object A00(Object obj) {
        if (obj instanceof AnonymousClass1OG) {
            return new C41881xE((AnonymousClass1OG) obj);
        }
        return obj;
    }

    public static final Object A01(Object obj) {
        C41881xE r0;
        AnonymousClass1OG r02;
        if (!(obj instanceof C41881xE) || (r0 = (C41881xE) obj) == null || (r02 = r0.A00) == null) {
            return obj;
        }
        return r02;
    }
}
