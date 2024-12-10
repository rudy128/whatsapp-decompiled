package X;

public class DFG implements AnonymousClass0sR {
    public static final C26112Csa A00 = new C26112Csa();

    public static DFL A02(AnonymousClass0sU r2) {
        if (!(r2 instanceof DFL)) {
            return null;
        }
        DFL dfl = (DFL) r2;
        if (BE7.A0P(dfl) == null || BE7.A0P(dfl).A05 != 13368) {
            return null;
        }
        return BE7.A0P(dfl);
    }

    public static float A00(DFL dfl, float f, int i, boolean z) {
        String A0D = dfl.A0D(i);
        if (A0D == null || (z && A0D.equals("auto"))) {
            return Float.NaN;
        }
        try {
            if (BE6.A1V(A0D)) {
                return A90.A00(A0D) * 0.01f * f;
            }
            return A90.A01(A0D);
        } catch (AnonymousClass9HX e) {
            C25913CoX.A00((DOZ) null, "BloksFlexLayoutProvider", "Error parsing size dimension value", e);
            return Float.NaN;
        }
    }

    public static float A01(DFL dfl, int i) {
        String A0D = dfl.A0D(i);
        if (A0D == null) {
            return Float.NaN;
        }
        try {
            return A90.A01(A0D);
        } catch (AnonymousClass9HX e) {
            C25913CoX.A00((DOZ) null, "BloksFlexLayoutProvider", "Error parsing padding value", e);
            return Float.NaN;
        }
    }

    public int BkQ(AnonymousClass0sU r4) {
        DFL A02 = A02(r4);
        if (A02 != null) {
            return A02.A04(81, 0);
        }
        return 0;
    }
}
