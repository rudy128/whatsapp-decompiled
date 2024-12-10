package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

/* renamed from: X.03v  reason: invalid class name and case insensitive filesystem */
public final class C008603v extends ContextWrapper {
    public LayoutInflater A00;
    public LayoutInflater A01;
    public Fragment A02;
    public final AnonymousClass1GC A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C008603v(android.view.LayoutInflater r3, androidx.fragment.app.Fragment r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0024
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x001e
            r2.<init>(r0)
            X.0Y9 r1 = new X.0Y9
            r1.<init>(r2)
            r2.A03 = r1
            r2.A00 = r3
            r2.A02 = r4
            X.1Fv r0 = r4.getLifecycle()
            r0.A05(r1)
            return
        L_0x001e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0024:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C008603v.<init>(android.view.LayoutInflater, androidx.fragment.app.Fragment):void");
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.A01;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflater2 = this.A00;
        if (layoutInflater2 == null) {
            layoutInflater2 = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            this.A00 = layoutInflater2;
        }
        LayoutInflater cloneInContext = layoutInflater2.cloneInContext(this);
        this.A01 = cloneInContext;
        return cloneInContext;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C008603v(Context context, Fragment fragment) {
        super(context);
        if (context != null) {
            AnonymousClass0Y9 r1 = new AnonymousClass0Y9(this);
            this.A03 = r1;
            this.A00 = null;
            this.A02 = fragment;
            fragment.getLifecycle().A05(r1);
            return;
        }
        throw new NullPointerException();
    }
}
