package X;

import com.facebook.dsp.core.typography.LineHeightMultiplierValue;
import com.facebook.dsp.core.typography.LineHeightPtValue;
import com.facebook.dsp.core.typography.LineHeightValue;
import com.facebook.dsp.core.typography.TypographyData;

/* renamed from: X.Cna  reason: case insensitive filesystem */
public abstract class C25867Cna {
    public static final float A00(LineHeightValue lineHeightValue) {
        C18070vi.A0d(lineHeightValue, 0);
        if (lineHeightValue instanceof LineHeightPtValue) {
            return 1.0f;
        }
        if (lineHeightValue instanceof LineHeightMultiplierValue) {
            return ((LineHeightMultiplierValue) lineHeightValue).getLineHeightMultiplier();
        }
        throw AnonymousClass3MW.A14();
    }

    public static final int A01(C0J c0j, boolean z) {
        C18070vi.A0d(c0j, 0);
        D3N BFD = C26724DBa.A00.BFD(c0j);
        if (z) {
            return BFD.A00;
        }
        return BFD.A01;
    }

    public static final TypographyData A02(Integer num) {
        return C24542C8n.A00(num);
    }
}
