package X;

import android.text.TextUtils;

/* renamed from: X.2ki  reason: invalid class name and case insensitive filesystem */
public final class C58452ki {
    public final CharSequence A00;
    public final CharSequence A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C58452ki r5 = (C58452ki) obj;
            if (!TextUtils.equals(this.A00, r5.A00) || !TextUtils.equals(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0l = AnonymousClass001.A0l(this.A00) * 31;
        CharSequence charSequence = this.A01;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return A0l + i;
    }

    public C58452ki(CharSequence charSequence, CharSequence charSequence2) {
        this.A00 = charSequence;
        this.A01 = charSequence2;
    }
}
