package X;

import android.graphics.Bitmap;

/* renamed from: X.6zg  reason: invalid class name and case insensitive filesystem */
public final class C139936zg {
    public final Bitmap A00;
    public final AnonymousClass4ZN A01;
    public final AnonymousClass4ZN A02;
    public final Integer A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139936zg) {
                C139936zg r5 = (C139936zg) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass001.A0k(this.A02) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A03);
    }

    public C139936zg(Bitmap bitmap, AnonymousClass4ZN r2, AnonymousClass4ZN r3, Integer num) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = bitmap;
        this.A03 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StatusBannerInfo(statusText=");
        A10.append(this.A02);
        A10.append(", additionalText=");
        A10.append(this.A01);
        A10.append(", glassesIcon=");
        A10.append(this.A00);
        A10.append(", statusIconColorFilter=");
        return AnonymousClass001.A1F(this.A03, A10);
    }

    public C139936zg() {
        this((Bitmap) null, (AnonymousClass4ZN) null, (AnonymousClass4ZN) null, (Integer) null);
    }
}
