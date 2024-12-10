package X;

import android.graphics.ColorSpace;

/* renamed from: X.0Pa  reason: invalid class name and case insensitive filesystem */
public abstract class C04810Pa {
    public static final ColorSpace A04(C03710Kf r19) {
        ColorSpace.Named named;
        ColorSpace.Rgb rgb;
        C03710Kf r1 = r19;
        if (!C18070vi.A18(r1, C03090Go.A0G)) {
            if (C18070vi.A18(r1, C03090Go.A03)) {
                named = ColorSpace.Named.ACES;
            } else if (C18070vi.A18(r1, C03090Go.A04)) {
                named = ColorSpace.Named.ACESCG;
            } else if (C18070vi.A18(r1, C03090Go.A05)) {
                named = ColorSpace.Named.ADOBE_RGB;
            } else if (C18070vi.A18(r1, C03090Go.A06)) {
                named = ColorSpace.Named.BT2020;
            } else if (C18070vi.A18(r1, C03090Go.A07)) {
                named = ColorSpace.Named.BT709;
            } else if (C18070vi.A18(r1, C03090Go.A00)) {
                named = ColorSpace.Named.CIE_LAB;
            } else if (C18070vi.A18(r1, C03090Go.A01)) {
                named = ColorSpace.Named.CIE_XYZ;
            } else if (C18070vi.A18(r1, C03090Go.A08)) {
                named = ColorSpace.Named.DCI_P3;
            } else if (C18070vi.A18(r1, C03090Go.A09)) {
                named = ColorSpace.Named.DISPLAY_P3;
            } else if (C18070vi.A18(r1, C03090Go.A0A)) {
                named = ColorSpace.Named.EXTENDED_SRGB;
            } else if (C18070vi.A18(r1, C03090Go.A0B)) {
                named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            } else if (C18070vi.A18(r1, C03090Go.A0C)) {
                named = ColorSpace.Named.LINEAR_SRGB;
            } else if (C18070vi.A18(r1, C03090Go.A0D)) {
                named = ColorSpace.Named.NTSC_1953;
            } else if (C18070vi.A18(r1, C03090Go.A0E)) {
                named = ColorSpace.Named.PRO_PHOTO_RGB;
            } else if (C18070vi.A18(r1, C03090Go.A0F)) {
                named = ColorSpace.Named.SMPTE_C;
            } else if (r1 instanceof C016509i) {
                C016509i r0 = (C016509i) r1;
                float[] A00 = r0.A07.A00();
                AnonymousClass0KB r2 = r0.A06;
                if (r2 != null) {
                    rgb = new ColorSpace.Rgb(r1.A02, r0.A09, A00, new ColorSpace.Rgb.TransferParameters(r2.A00, r2.A01, r2.A02, r2.A03, 0.0d, 0.0d, r2.A04));
                } else {
                    String str = r1.A02;
                    float[] fArr = r0.A09;
                    C07070aJ r3 = new C07070aJ(r0.A0A());
                    rgb = new ColorSpace.Rgb(str, fArr, A00, r3, new C07080aK(r0.A09()), r1.A05(0), r1.A04(0));
                }
                return rgb;
            }
            return ColorSpace.get(named);
        }
        named = ColorSpace.Named.SRGB;
        return ColorSpace.get(named);
    }

    public static final double A00(C22821Di r1, double d) {
        return ((Number) r1.invoke(Double.valueOf(d))).doubleValue();
    }

    public static final double A01(C22821Di r1, double d) {
        return ((Number) r1.invoke(Double.valueOf(d))).doubleValue();
    }
}
