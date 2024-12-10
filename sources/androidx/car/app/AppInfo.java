package androidx.car.app;

import X.AnonymousClass000;

public final class AppInfo {
    public final int mLatestCarAppApiLevel = 0;
    public final String mLibraryVersion = null;
    public final int mMinCarAppApiLevel = 0;

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Library version: [");
        String str = this.mLibraryVersion;
        str.getClass();
        A10.append(str);
        A10.append("] Min Car Api Level: [");
        A10.append(this.mMinCarAppApiLevel);
        A10.append("] Latest Car App Api Level: [");
        A10.append(this.mLatestCarAppApiLevel);
        return AnonymousClass000.A0z(A10);
    }
}
