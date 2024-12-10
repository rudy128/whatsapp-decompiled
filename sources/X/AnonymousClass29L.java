package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.29L  reason: invalid class name */
public class AnonymousClass29L extends AnonymousClass29P {
    public final C40871vQ A00;

    public /* bridge */ /* synthetic */ Object A06(C40511up r12, float f) {
        C40871vQ r5 = this.A00;
        C40871vQ r8 = (C40871vQ) r12.A0E;
        C40871vQ r9 = (C40871vQ) r12.A07;
        int[] iArr = r8.A01;
        int length = iArr.length;
        int[] iArr2 = r9.A01;
        int length2 = iArr2.length;
        if (length == length2) {
            for (int i = 0; i < length; i++) {
                float[] fArr = r5.A00;
                float f2 = r8.A00[i];
                float f3 = r9.A00[i];
                PointF pointF = C40761vE.A00;
                fArr[i] = C17880vN.A00(f3, f2, f);
                r5.A01[i] = C40881vR.A02(f, iArr[i], iArr2[i]);
            }
            int i2 = length;
            while (true) {
                float[] fArr2 = r5.A00;
                if (i2 >= fArr2.length) {
                    return r5;
                }
                int i3 = length - 1;
                fArr2[i2] = fArr2[i3];
                int[] iArr3 = r5.A01;
                iArr3[i2] = iArr3[i3];
                i2++;
            }
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Cannot interpolate between gradients. Lengths vary (");
            A10.append(length);
            A10.append(" vs ");
            A10.append(length2);
            throw AnonymousClass001.A12(")", A10);
        }
    }

    public AnonymousClass29L(List list) {
        super(list);
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C40871vQ r0 = (C40871vQ) ((C40511up) list.get(i2)).A0E;
            if (r0 != null) {
                i = Math.max(i, r0.A01.length);
            }
        }
        this.A00 = new C40871vQ(new float[i], new int[i]);
    }
}
