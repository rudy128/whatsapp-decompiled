package X;

/* renamed from: X.1hd  reason: invalid class name and case insensitive filesystem */
public class C32711hd extends C32701hc {
    public String description;
    public final int e2eFailureReason;

    public C32711hd(Exception exc) {
        super(exc);
        this.e2eFailureReason = 26;
    }

    public C32711hd(int i, String str) {
        this.e2eFailureReason = i;
        this.description = str;
    }

    public C32711hd(int i) {
        this.e2eFailureReason = i;
    }
}
