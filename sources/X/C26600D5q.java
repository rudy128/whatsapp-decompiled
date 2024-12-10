package X;

import android.graphics.Typeface;

/* renamed from: X.D5q  reason: case insensitive filesystem */
public final class C26600D5q implements E78 {
    public Typeface BHJ(DSF dsf, int i) {
        if (i != 0 || !C18070vi.A18(dsf, DSF.A03)) {
            return Typeface.create(Typeface.DEFAULT, dsf.A00, C17890vO.A1R(i));
        }
        return Typeface.DEFAULT;
    }

    public Typeface BHb(DSF dsf, BJG bjg, int i) {
        String str = bjg.A00;
        if (i == 0 && C18070vi.A18(dsf, DSF.A03) && str.length() == 0) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(Typeface.create(str, 0), dsf.A00, C17890vO.A1R(i));
    }
}
