package X;

import android.graphics.Bitmap;

/* renamed from: X.CmA  reason: case insensitive filesystem */
public class C25798CmA {
    public static final C25798CmA A04 = new C25798CmA(new CRJ());
    public final int A00;
    public final Bitmap.Config A01;
    public final Bitmap.Config A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C25798CmA cmA = (C25798CmA) obj;
                if (!(this.A00 == cmA.A00 && this.A03 == cmA.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return BE6.A06(((((BE6.A06(3100, this.A00) * 31 * 31 * 31) + (this.A03 ? 1 : 0)) * 31) + this.A02.ordinal()) * 31, this.A01.ordinal()) * 31;
    }

    public C25798CmA(CRJ crj) {
        this.A00 = crj.A00;
        this.A03 = crj.A03;
        this.A02 = crj.A02;
        this.A01 = crj.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImageDecodeOptions{");
        C26004CqL cqL = new C26004CqL(C108955ca.A0x(this));
        C26004CqL.A01(cqL, "minDecodeIntervalMs", 100);
        C26004CqL.A01(cqL, "maxDimensionPx", this.A00);
        cqL.A02("decodePreviewFrame", false);
        cqL.A02("useLastFrameForPreview", false);
        cqL.A02("useEncodedImageForPreview", false);
        cqL.A02("decodeAllFrames", false);
        cqL.A02("forceStaticImage", this.A03);
        C26004CqL.A00(cqL, this.A02.name(), "bitmapConfigName");
        C26004CqL.A00(cqL, this.A01.name(), "animatedBitmapConfigName");
        C26004CqL.A00(cqL, (Object) null, "customImageDecoder");
        C26004CqL.A00(cqL, (Object) null, "bitmapTransformation");
        C26004CqL.A00(cqL, (Object) null, "colorSpace");
        return BEA.A0n(cqL.toString(), A10);
    }
}
