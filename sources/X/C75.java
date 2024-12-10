package X;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;

public abstract class C75 {
    public static final void A00(C03380Hv r13, C16960tV r14, AnonymousClass0NG r15, C02000Cg r16, C26222CvC cvC, C25827Cme cme, float f) {
        C16960tV r8 = r14;
        C03380Hv r7 = r13;
        r14.CGe();
        List list = cvC.A05;
        AnonymousClass0NG r9 = r15;
        C02000Cg r10 = r16;
        C25827Cme cme2 = cme;
        float f2 = f;
        if (list.size() <= 1 || (r13 instanceof AnonymousClass09Y)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                EA0 ea0 = BE6.A0S(list, i).A06;
                ea0.CB5(r7, r8, r9, r10, cme2, f2);
                r14.CPp(0.0f, ea0.BSR());
            }
        } else if (r13 instanceof C016009d) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                BE6.A0S(list, i2).A06.BSR();
            }
            long j = AnonymousClass0QG.A01;
            Shader shader = ((C015909c) ((C016009d) r7)).A00;
            Matrix A0J = C108945cZ.A0J();
            shader.getLocalMatrix(A0J);
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                EA0 ea02 = BE6.A0S(list, i3).A06;
                ea02.CB5(new C015909c(shader), r8, r9, r10, cme, f);
                r8.CPp(0.0f, ea02.BSR());
                A0J.setTranslate(0.0f, -ea02.BSR());
                shader.setLocalMatrix(A0J);
            }
        }
        r8.CFz();
    }
}
