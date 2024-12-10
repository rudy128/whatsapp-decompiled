package X;

import android.graphics.Bitmap;

/* renamed from: X.6zU  reason: invalid class name and case insensitive filesystem */
public final class C139816zU {
    public final Bitmap A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139816zU) {
                C139816zU r5 = (C139816zU) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A01;
        return (C72453Mb.A0E(num, A00(num)) * 31) + AnonymousClass001.A0k(this.A00);
    }

    public C139816zU(Bitmap bitmap, Integer num) {
        this.A01 = num;
        this.A00 = bitmap;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "DOWNLOADING";
            case 1:
                return "DOWNLOAD_FAILED";
            case 2:
                return "DOWNLOAD_SUCCESS";
            default:
                return "NO_ARTWORK";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArtworkState(downloadState=");
        A10.append(A00(this.A01));
        A10.append(", artworkBitmap=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
