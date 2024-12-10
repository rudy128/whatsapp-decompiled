package X;

/* renamed from: X.5nt  reason: invalid class name and case insensitive filesystem */
public class C113865nt extends C113875nu {
    public C113865nt() {
        super("MULTI_PROFILE", "MULTI_PROFILE");
    }

    public boolean A01() {
        if (!super.A01() || !C137806w3.A00("MULTI_PROCESS")) {
            return false;
        }
        if (C137806w3.A0R.A01()) {
            return AnonymousClass6YO.A00.BZf().isMultiProcessEnabled();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
