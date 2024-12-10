package X;

/* renamed from: X.6Rr  reason: invalid class name and case insensitive filesystem */
public enum C122726Rr {
    HIDE(false, false),
    SHOW_APP_EXIST(true, true),
    SHOW_APP_EXIST_XPOST_DISABLED(true, false);
    
    public final boolean isEnabled;
    public final boolean isVisible;

    /* access modifiers changed from: public */
    static {
        C122726Rr[] r0;
        A00 = C19780yz.A00(r0);
    }

    /* access modifiers changed from: public */
    C122726Rr(boolean z, boolean z2) {
        this.isVisible = z;
        this.isEnabled = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("visible: ");
        A10.append(this.isVisible);
        A10.append(" enabled: ");
        return AnonymousClass3MY.A0r(A10, this.isEnabled);
    }
}
