package X;

/* renamed from: X.BnI  reason: case insensitive filesystem */
public final class C23649BnI extends C23577Bm6 implements C22356B4k {
    public static final int BOOLTYPEEVENTMAP_FIELD_NUMBER = 4;
    public static final C23649BnI DEFAULT_INSTANCE;
    public static final int EVENTTYPE_FIELD_NUMBER = 1;
    public static final int FLOATTYPEEVENTMAP_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int STRINGTYPEEVENTMAP_FIELD_NUMBER = 2;
    public C27328Dbz boolTypeEventMap_;
    public int eventType_;
    public C27328Dbz floatTypeEventMap_;
    public C27328Dbz stringTypeEventMap_;

    static {
        C23649BnI bnI = new C23649BnI();
        DEFAULT_INSTANCE = bnI;
        C23577Bm6.A0E(bnI, C23649BnI.class);
    }

    public C23649BnI() {
        C27328Dbz dbz = C27328Dbz.A00;
        this.stringTypeEventMap_ = dbz;
        this.floatTypeEventMap_ = dbz;
        this.boolTypeEventMap_ = dbz;
    }
}
