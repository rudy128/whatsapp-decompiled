package X;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: X.703  reason: invalid class name */
public final class AnonymousClass703 {
    public final String A00;
    public final LocusId A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.A00;
        String str2 = ((AnonymousClass703) obj).A00;
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public static AnonymousClass703 A00(LocusId locusId) {
        C28111Yx.A03(locusId, "locusId cannot be null");
        String A012 = C137056uq.A01(locusId);
        if (!TextUtils.isEmpty(A012)) {
            return new AnonymousClass703(A012);
        }
        throw AnonymousClass000.A0k(String.valueOf("id cannot be empty"));
    }

    public int hashCode() {
        return 31 + C17900vP.A00(this.A00);
    }

    public AnonymousClass703(String str) {
        LocusId locusId;
        if (!TextUtils.isEmpty(str)) {
            this.A00 = str;
            if (Build.VERSION.SDK_INT >= 29) {
                locusId = C137056uq.A00(str);
            } else {
                locusId = null;
            }
            this.A01 = locusId;
            return;
        }
        throw AnonymousClass000.A0k(String.valueOf("id cannot be empty"));
    }

    public LocusId A01() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LocusIdCompat[");
        int length = this.A00.length();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append(length);
        C108985cd.A1L("_chars", A102, A10);
        return AnonymousClass000.A0y("]", A10);
    }
}
