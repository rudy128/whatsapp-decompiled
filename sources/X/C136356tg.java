package X;

import android.net.Uri;

/* renamed from: X.6tg  reason: invalid class name and case insensitive filesystem */
public final class C136356tg {
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136356tg) {
                C136356tg r5 = (C136356tg) obj;
                if (!(C18070vi.A18(this.A03, r5.A03) && C18070vi.A18(this.A04, r5.A04) && C18070vi.A18(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A05 == r5.A05 && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00((((AnonymousClass000.A0N(this.A02, C17890vO.A02(this.A04, C17880vN.A03(this.A03))) + this.A01) * 31) + this.A00) * 31, this.A05), this.A06);
    }

    public C136356tg(Uri uri, String str, String str2, int i, int i2, boolean z, boolean z2) {
        C18070vi.A0o(str, str2, uri);
        this.A03 = str;
        this.A04 = str2;
        this.A02 = uri;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A06 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaUploadFailedParams(collectionId=");
        A10.append(this.A03);
        A10.append(", mediaJobId=");
        A10.append(this.A04);
        A10.append(", mediaJobUri=");
        A10.append(this.A02);
        A10.append(", maxFileSizeBytes=");
        A10.append(this.A01);
        A10.append(", errorCode=");
        A10.append(this.A00);
        A10.append(", isRetryAble=");
        A10.append(this.A05);
        A10.append(", selectionFromGalleryPicker=");
        return C17900vP.A0F(A10, this.A06);
    }
}
