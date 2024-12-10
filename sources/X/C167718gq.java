package X;

/* renamed from: X.8gq  reason: invalid class name and case insensitive filesystem */
public final class C167718gq extends AnonymousClass9LZ {
    public final int retryAfter;

    public C167718gq(String str, int i) {
        super(str, (Throwable) null);
        this.retryAfter = i;
    }

    public static C167718gq A00(String str) {
        return new C167718gq(str, -1);
    }

    public C167718gq(Throwable th) {
        super(th.getMessage(), th);
        this.retryAfter = -1;
    }
}
