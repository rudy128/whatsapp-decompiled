package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0LL  reason: invalid class name */
public abstract class AnonymousClass0LL {
    public static final void A01(Resources.Theme theme, Resources resources, AttributeSet attributeSet, AnonymousClass0OQ r22, AnonymousClass0NX r23) {
        List list;
        Resources.Theme theme2 = theme;
        AnonymousClass0NX r3 = r23;
        TypedArray A04 = r3.A04(theme2, resources, attributeSet, C03010Gg.A02);
        if (C63882tq.A07("pathData", r3.A01)) {
            String string = A04.getString(0);
            AnonymousClass0NX.A00(A04, r3);
            if (string == null) {
                string = "";
            }
            String string2 = A04.getString(2);
            AnonymousClass0NX.A00(A04, r3);
            List list2 = AnonymousClass0GD.A00;
            if (string2 == null) {
                list = AnonymousClass0GD.A00;
            } else {
                AnonymousClass0ID r0 = new AnonymousClass0ID();
                r0.A00(string2);
                list = r0.A01;
            }
            C59202lv A05 = r3.A05(theme2, A04, "fillColor", 1);
            float A01 = r3.A01(A04, "fillAlpha", 1.0f, 12);
            int A02 = r3.A02(A04, "strokeLineCap", 8, -1);
            int i = 0;
            if (A02 != 0) {
                if (A02 == 1) {
                    i = 1;
                } else if (A02 == 2) {
                    i = 2;
                }
            }
            int A022 = r3.A02(A04, "strokeLineJoin", 9, -1);
            int i2 = 2;
            if (A022 == 0) {
                i2 = 0;
            } else if (A022 == 1) {
                i2 = 1;
            }
            float A012 = r3.A01(A04, "strokeMiterLimit", 1.0f, 10);
            C59202lv A052 = r3.A05(theme2, A04, "strokeColor", 3);
            float A013 = r3.A01(A04, "strokeAlpha", 1.0f, 11);
            float A014 = r3.A01(A04, "strokeWidth", 1.0f, 4);
            float A015 = r3.A01(A04, "trimPathEnd", 1.0f, 6);
            float A016 = r3.A01(A04, "trimPathOffset", 0.0f, 7);
            float A017 = r3.A01(A04, "trimPathStart", 0.0f, 5);
            int A023 = r3.A02(A04, "fillType", 13, 0);
            A04.recycle();
            C03380Hv A00 = A00(A05);
            C03380Hv A002 = A00(A052);
            int i3 = 1;
            if (A023 == 0) {
                i3 = 0;
            }
            AnonymousClass0OQ r02 = r22;
            AnonymousClass0OQ.A01(r02);
            ArrayList arrayList = r02.A02;
            ((C04250Ml) arrayList.get(AnonymousClass000.A0Q(arrayList))).A08.add(new AnonymousClass0AB(A00, A002, string, list, A01, A013, A014, A012, A017, A015, A016, i3, i, i2));
            return;
        }
        throw AnonymousClass000.A0k("No path data available");
    }

    public static final C03380Hv A00(C59202lv r4) {
        if (!r4.A02()) {
            return null;
        }
        Shader A01 = r4.A01();
        if (A01 != null) {
            return new C015909c(A01);
        }
        C02540Ek r0 = C05100Qk.A06;
        return new AnonymousClass09Y(((long) r4.A00()) << 32);
    }
}
