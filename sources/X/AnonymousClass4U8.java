package X;

import android.net.Uri;

/* renamed from: X.4U8  reason: invalid class name */
public final class AnonymousClass4U8 {
    public final Uri A00;
    public final CharSequence A01;
    public final CharSequence A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4U8) {
                AnonymousClass4U8 r5 = (AnonymousClass4U8) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass001.A0k(this.A02) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A00);
    }

    public AnonymousClass4U8(Uri uri, CharSequence charSequence, CharSequence charSequence2) {
        this.A02 = charSequence;
        this.A01 = charSequence2;
        this.A00 = uri;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SystemInfoModel(title=");
        A10.append(this.A02);
        A10.append(", description=");
        A10.append(this.A01);
        A10.append(", learnMoreUri=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
