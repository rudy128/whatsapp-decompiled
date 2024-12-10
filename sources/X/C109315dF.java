package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* renamed from: X.5dF  reason: invalid class name and case insensitive filesystem */
public final class C109315dF extends ContextWrapper {
    public final Resources A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109315dF(Context context, Resources resources) {
        super(context);
        C18070vi.A0d(resources, 2);
        this.A00 = resources;
    }

    public Resources getResources() {
        return this.A00;
    }
}
