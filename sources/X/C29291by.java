package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: X.1by  reason: invalid class name and case insensitive filesystem */
public class C29291by extends C29281bx {
    public Typeface A02(Context context, Resources resources, C51022Wr r11, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C55532fw r6 : r11.A00) {
                try {
                    Font build = new Font.Builder(resources, r6.A00).setWeight(r6.A02).setSlant(r6.A05 ? 1 : 0).setTtcIndex(r6.A01).setFontVariationSettings(r6.A04).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(A01(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    public Typeface A05(Context context, C187099fG[] r11, int i) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C187099fG r8 : r11) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(r8.A03, "r", (CancellationSignal) null);
                    if (openFileDescriptor != null) {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(r8.A02).setSlant(r8.A04 ? 1 : 0).setTtcIndex(r8.A01).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                        openFileDescriptor.close();
                    } else {
                        continue;
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(A01(build2, i).getStyle()).build();
            throw th;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static Font A01(FontFamily fontFamily, int i) {
        int i2 = 400;
        if ((i & 1) != 0) {
            i2 = 700;
        }
        int i3 = 0;
        if ((i & 2) != 0) {
            i3 = 1;
        }
        FontStyle fontStyle = new FontStyle(i2, i3);
        Font font = fontFamily.getFont(0);
        FontStyle style = font.getStyle();
        int abs = Math.abs(fontStyle.getWeight() - style.getWeight()) / 100;
        int i4 = 2;
        if (fontStyle.getSlant() == style.getSlant()) {
            i4 = 0;
        }
        int i5 = abs + i4;
        for (int i6 = 1; i6 < fontFamily.getSize(); i6++) {
            Font font2 = fontFamily.getFont(i6);
            FontStyle style2 = font2.getStyle();
            int abs2 = Math.abs(fontStyle.getWeight() - style2.getWeight()) / 100;
            int i7 = 2;
            if (fontStyle.getSlant() == style2.getSlant()) {
                i7 = 0;
            }
            int i8 = abs2 + i7;
            if (i8 < i5) {
                font = font2;
                i5 = i8;
            }
        }
        return font;
    }

    public Typeface A03(Context context, Resources resources, String str, int i, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public C187099fG A06(C187099fG[] r3, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public Typeface A04(Context context, Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }
}
