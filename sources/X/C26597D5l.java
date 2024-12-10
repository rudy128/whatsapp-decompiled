package X;

import android.os.Build;
import android.text.StaticLayout;

/* renamed from: X.D5l  reason: case insensitive filesystem */
public final class C26597D5l implements E77 {
    public boolean Bej(StaticLayout staticLayout) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return C25286Cco.A01(staticLayout);
        }
        return i >= 28;
    }

    public StaticLayout BG8(CUH cuh) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(cuh.A0D, 0, cuh.A02, cuh.A0B, cuh.A08);
        obtain.setTextDirection(cuh.A0A);
        obtain.setAlignment(cuh.A09);
        obtain.setMaxLines(cuh.A07);
        obtain.setEllipsize(cuh.A0C);
        obtain.setEllipsizedWidth(cuh.A01);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(cuh.A0E);
        obtain.setBreakStrategy(cuh.A00);
        obtain.setHyphenationFrequency(cuh.A03);
        obtain.setIndents((int[]) null, (int[]) null);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            C24503C6x.A00(obtain, cuh.A04);
            if (i >= 28) {
                C24504C6y.A00(obtain);
                if (i >= 33) {
                    C25286Cco.A00(obtain, cuh.A05, cuh.A06);
                }
            }
        }
        return obtain.build();
    }
}
