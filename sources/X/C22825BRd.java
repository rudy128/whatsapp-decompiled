package X;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;

/* renamed from: X.BRd  reason: case insensitive filesystem */
public final class C22825BRd extends CWA {
    public static C22825BRd A0Z;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Bitmap.Config A05;
    public final ColorFilter A06;
    public final PointF A07;
    public final PointF A08;
    public final PointF A09;
    public final Drawable A0A;
    public final Drawable A0B;
    public final Drawable A0C;
    public final Drawable A0D;
    public final EBA A0E;
    public final EBA A0F;
    public final EBA A0G;
    public final EBA A0H;
    public final C25697CkS A0I;
    public final C25798CmA A0J;
    public final C25157Ca8 A0K;
    public final C25786Clx A0L;
    public final C24272ByV A0M;
    public final Boolean A0N;
    public final Integer A0O;
    public final Integer A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;

    static {
        C22824BRc bRc = new C22824BRc();
        EBA eba = EBA.A02;
        bRc.A0F = eba;
        bRc.A0G = eba;
        bRc.A0E = eba;
        bRc.A00 = C24271ByU.HIGH;
        A0Z = new C22825BRd(bRc);
    }

    public final C22824BRc A00() {
        return new C22824BRc(this);
    }

    public final boolean A01() {
        return this.A0X;
    }

    public final boolean A02() {
        return this.A0W;
    }

    public final boolean A03() {
        return this.A0R;
    }

    public final boolean A04() {
        return this.A0S;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18070vi.A14(this, obj)) {
            C22825BRd bRd = (C22825BRd) obj;
            if (C18070vi.A18(this.A0P, bRd.A0P) && this.A03 == bRd.A03 && C24545C8q.A00(this.A0C, bRd.A0C) && C24545C8q.A00(this.A0G, bRd.A0G) && C24545C8q.A00(this.A09, bRd.A09) && this.A0Y == bRd.A0Y && C18070vi.A18(this.A0O, bRd.A0O) && this.A00 == bRd.A00 && C24545C8q.A00(this.A0F, bRd.A0F) && C24545C8q.A00(this.A08, bRd.A08) && this.A0T == bRd.A0T && this.A02 == bRd.A02 && C24545C8q.A00(this.A0B, bRd.A0B)) {
                Drawable drawable = this.A0A;
                Drawable drawable2 = bRd.A0A;
                if (!C24545C8q.A00(drawable, drawable2) || this.A04 != bRd.A04 || this.A0D != bRd.A0D || this.A0H != bRd.A0H || !C24545C8q.A00(this.A06, bRd.A06) || this.A0S != bRd.A0S || this.A01 != bRd.A01 || this.A0Q != bRd.A0Q || this.A0R != bRd.A0R || !C24545C8q.A00(this.A0I, bRd.A0I) || drawable != drawable2 || !C24545C8q.A00(this.A0K, bRd.A0K) || !C24545C8q.A00(this.A0M, bRd.A0M) || !C24545C8q.A00(this.A0L, bRd.A0L) || !C24545C8q.A00(this.A0J, bRd.A0J) || !C24545C8q.A00(this.A0E, bRd.A0E) || !C24545C8q.A00(this.A07, bRd.A07) || this.A0X != bRd.A0X || this.A0W != bRd.A0W || this.A0N != bRd.A0N || !C24545C8q.A00(this.A05, bRd.A05) || !C24545C8q.A00(this.A00, bRd.A00) || !C24545C8q.A00(this.A01, bRd.A01) || !C24545C8q.A00(this.A02, bRd.A02)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C22825BRd(C22824BRc bRc) {
        super(bRc);
        this.A0K = bRc.A0K;
        this.A0M = bRc.A0M;
        this.A0L = bRc.A0L;
        this.A0J = bRc.A0J;
        this.A0E = bRc.A0H;
        this.A07 = bRc.A09;
        this.A0X = bRc.A0Y;
        this.A0W = bRc.A0X;
        this.A05 = bRc.A05;
        this.A0N = bRc.A0N;
        this.A0P = bRc.A0P;
        this.A03 = bRc.A03;
        this.A0C = bRc.A0C;
        this.A0G = bRc.A0F;
        this.A09 = bRc.A08;
        this.A0Y = bRc.A0V;
        this.A04 = bRc.A04;
        this.A0D = bRc.A0D;
        this.A0H = bRc.A0G;
        this.A0O = bRc.A0O;
        this.A00 = bRc.A00;
        this.A0F = bRc.A0E;
        this.A08 = bRc.A07;
        this.A0A = bRc.A0A;
        this.A0T = bRc.A0S;
        this.A06 = bRc.A06;
        this.A02 = bRc.A02;
        this.A0B = bRc.A0B;
        this.A0S = bRc.A0W;
        this.A01 = bRc.A01;
        this.A0Q = bRc.A0Q;
        this.A0R = bRc.A0R;
        this.A0I = bRc.A0I;
        this.A0U = bRc.A0T;
        this.A0V = bRc.A0U;
    }

    public int hashCode() {
        int i = 0;
        int A0N2 = (((((((AnonymousClass000.A0N(this.A0E, BE6.A06(BE6.A06(((((super.hashCode() * 31) + AnonymousClass001.A0l(this.A0K)) * 31) + AnonymousClass001.A0l(this.A0M)) * 31, AnonymousClass001.A0l(this.A0L)), AnonymousClass001.A0l(this.A0J)) * 31) + AnonymousClass001.A0l(this.A07)) * 31) + (this.A0X ? 1 : 0)) * 31) + (this.A0W ? 1 : 0)) * 31) + AnonymousClass001.A0l(this.A05)) * 31;
        Boolean bool = this.A0N;
        if (bool != null) {
            i = bool.hashCode();
        }
        int i2 = 0;
        int A062 = (BE6.A06((((((((((((BE6.A06((((((((((((((((((((((((((((A0N2 + i) * 31) + C72463Mc.A0B(this.A0P)) * 31) + this.A03) * 31) + AnonymousClass001.A0l(this.A0C)) * 31) + AnonymousClass001.A0l(this.A0G)) * 31) + AnonymousClass001.A0l(this.A09)) * 31) + (this.A0Y ? 1 : 0)) * 31) + C72463Mc.A0B(this.A0O)) * 31) + this.A00) * 31) + AnonymousClass001.A0l(this.A0F)) * 31) + AnonymousClass001.A0l(this.A08)) * 31) + AnonymousClass001.A0l(this.A0A)) * 31) + (this.A0T ? 1 : 0)) * 31) + this.A02) * 31, AnonymousClass001.A0l(this.A0B)) + AnonymousClass001.A0l(this.A0D)) * 31) + AnonymousClass001.A0l(this.A0H)) * 31) + AnonymousClass001.A0l(this.A06)) * 31) + (this.A0S ? 1 : 0)) * 31) + this.A01) * 31) + (this.A0Q ? 1 : 0)) * 31, this.A0R ? 1 : 0) + this.A04) * 31;
        C25697CkS ckS = this.A0I;
        if (ckS != null) {
            i2 = ckS.hashCode();
        }
        return A062 + i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImageOptions{");
        C26004CqL cqL = new C26004CqL(C108955ca.A0x(this));
        C26004CqL.A00(cqL, this.A00, "priority");
        C26004CqL.A00(cqL, this.A01, "cacheChoice");
        C26004CqL.A00(cqL, this.A02, "diskCacheId");
        C26004CqL.A00(cqL, this.A0K, "resizeOptions");
        C26004CqL.A00(cqL, this.A0M, "downsampleOverride");
        C26004CqL.A00(cqL, this.A0L, "rotationOptions");
        C26004CqL.A00(cqL, (Object) null, "postprocessor");
        C26004CqL.A00(cqL, this.A0J, "imageDecodeOptions");
        C26004CqL.A00(cqL, (Object) null, "roundingOptions");
        C26004CqL.A00(cqL, (Object) null, "borderOptions");
        C26004CqL.A00(cqL, this.A0E, "actualImageScaleType");
        C26004CqL.A00(cqL, this.A07, "actualImageFocusPoint");
        cqL.A02("localThumbnailPreviewsEnabled", this.A0X);
        cqL.A02("loadThumbnailOnly", this.A0W);
        C26004CqL.A00(cqL, this.A05, "bitmapConfig");
        C26004CqL.A00(cqL, this.A0N, "progressiveRenderingEnabled");
        C26004CqL.A00(cqL, this.A0P, "placeholderColor");
        C26004CqL.A01(cqL, "placeholderRes", this.A03);
        C26004CqL.A00(cqL, this.A0C, "placeholderDrawable");
        C26004CqL.A00(cqL, this.A0G, "placeholderScaleType");
        C26004CqL.A00(cqL, this.A09, "placeholderFocusPoint");
        cqL.A02("placeholderApplyRoundingOptions", this.A0Y);
        C26004CqL.A01(cqL, "progressRes", this.A04);
        C26004CqL.A00(cqL, this.A0D, "progressDrawable");
        C26004CqL.A00(cqL, this.A0H, "progressScaleType");
        C26004CqL.A00(cqL, this.A0O, "errorColor");
        C26004CqL.A01(cqL, "errorRes", this.A00);
        C26004CqL.A00(cqL, this.A0F, "errorScaleType");
        C26004CqL.A00(cqL, this.A08, "errorFocusPoint");
        C26004CqL.A00(cqL, this.A0A, "errorDrawable");
        cqL.A02("errorApplyRoundingOptions", this.A0T);
        C26004CqL.A00(cqL, this.A06, "actualImageColorFilter");
        C26004CqL.A01(cqL, "overlayRes", this.A02);
        C26004CqL.A00(cqL, this.A0B, "overlayDrawable");
        C26004CqL.A00(cqL, (Object) null, "backgroundDrawable");
        cqL.A02("resizeToViewport", this.A0S);
        cqL.A02("autoPlay", this.A0Q);
        cqL.A02("autoStop", this.A0R);
        cqL.A02("mPerfMediaRemountInstrumentationFix", false);
        C26004CqL.A01(cqL, "fadeDurationMs", this.A01);
        C26004CqL.A00(cqL, this.A0I, "customDrawableFactory");
        return AnonymousClass8BX.A0c(cqL, A10);
    }
}
