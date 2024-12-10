package X;

import android.content.Context;

/* renamed from: X.0xY  reason: invalid class name and case insensitive filesystem */
public final class C19030xY implements C18140vp {
    public final C18140vp A00;

    public /* bridge */ /* synthetic */ Object get() {
        String packageName = ((Context) this.A00.get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public C19030xY(C18140vp r1) {
        this.A00 = r1;
    }
}
