package X;

import android.graphics.Bitmap;

/* renamed from: X.6zc  reason: invalid class name and case insensitive filesystem */
public final class C139896zc {
    public final Bitmap A00;
    public final AnonymousClass1E7 A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139896zc) {
                C139896zc r5 = (C139896zc) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass001.A0k(this.A01) * 31) + C17900vP.A00(this.A02)) * 31) + C17880vN.A02(this.A00);
    }

    public C139896zc(Bitmap bitmap, AnonymousClass1E7 r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = bitmap;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("State(contact=");
        A10.append(this.A01);
        A10.append(", contactName=");
        A10.append(this.A02);
        A10.append(", profilePhoto=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C139896zc() {
        this((Bitmap) null, (AnonymousClass1E7) null, (String) null);
    }
}
