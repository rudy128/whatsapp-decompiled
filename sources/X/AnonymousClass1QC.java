package X;

/* renamed from: X.1QC  reason: invalid class name */
public class AnonymousClass1QC extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1QC(String str) {
        super(str != null ? str.toString() : "The operation has been canceled.");
    }

    public AnonymousClass1QC() {
        super("The operation has been canceled.");
    }
}
