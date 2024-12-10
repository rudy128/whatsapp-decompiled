package X;

import android.text.Editable;

/* renamed from: X.5dn  reason: invalid class name and case insensitive filesystem */
public final class C109655dn extends Editable.Factory {
    public static Class A00;
    public static final Object A01 = C17880vN.A0p();
    public static volatile Editable.Factory A02;

    public Editable newEditable(CharSequence charSequence) {
        Class cls = A00;
        if (cls != null) {
            return new C109665do(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }

    public C109655dn() {
        try {
            A00 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (Throwable unused) {
        }
    }
}
