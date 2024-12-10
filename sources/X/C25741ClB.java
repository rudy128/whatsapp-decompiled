package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.List;

/* renamed from: X.ClB  reason: case insensitive filesystem */
public final class C25741ClB {
    public Paint A00;
    public Paint A01;
    public Paint A02;
    public C22877BTo A03;
    public C22879BTq A04;
    public C22880BTr A05;
    public final C002100z A06;
    public final C29021bS A07;

    public C25741ClB(int i, int i2) {
        this.A07 = new C29021bS(5);
        this.A06 = new C002100z(10);
    }

    public final Path A00(BU3 bu3, BUD bud) {
        Path.FillType fillType;
        C18070vi.A0d(bu3, 0);
        C002100z r5 = this.A06;
        Path path = (Path) r5.A04(AnonymousClass1D6.A01(bu3, bud));
        if (path == null) {
            path = C108945cZ.A0L();
            if (bu3.A00 == 0) {
                fillType = Path.FillType.WINDING;
            } else {
                fillType = Path.FillType.EVEN_ODD;
            }
            if (path.getFillType() != fillType) {
                path.setFillType(fillType);
            }
            List list = bu3.A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C28505E4n) list.get(i)).BCV(path, this);
            }
            r5.A08(AnonymousClass1D6.A01(bu3, bud), path);
        }
        return path;
    }

    public final void A01(BUD bud, C22821Di r4) {
        C29021bS r1 = this.A07;
        Matrix matrix = (Matrix) r1.BAf();
        if (matrix == null) {
            matrix = C108945cZ.A0J();
        }
        bud.BCU(matrix);
        r4.invoke(matrix);
        matrix.reset();
        r1.CEF(matrix);
    }

    public C25741ClB() {
        this(5, 10);
    }
}
