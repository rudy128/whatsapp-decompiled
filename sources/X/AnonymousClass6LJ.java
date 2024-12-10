package X;

import android.util.Pair;
import java.io.File;
import java.util.Collections;

/* renamed from: X.6LJ  reason: invalid class name */
public class AnonymousClass6LJ extends A34 {
    public final C25311Ns A00;
    public final AnonymousClass1SB A01;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        boolean z;
        Pair[] pairArr = (Pair[]) objArr;
        C17960vV.A07(pairArr);
        boolean z2 = false;
        C17960vV.A0C(AnonymousClass000.A1T(pairArr.length, 1));
        Pair pair = pairArr[0];
        C1418377d r5 = (C1418377d) pair.first;
        C17960vV.A07(r5);
        C17960vV.A07(r5.A0H);
        C17960vV.A07(r5.A0F);
        Object obj = pair.second;
        A0C(obj);
        C25311Ns r6 = this.A00;
        File A04 = r6.A04(r5.A0F, r5.A0E);
        if ((r5.A0B == null || r5.A01 == 1) && !A04.exists()) {
            File A042 = r6.A04(r5.A0F, r5.A0E);
            C17960vV.A07(A042);
            if (this.A01.A0A(r5, A042) == null) {
                z = false;
                return C108945cZ.A0N(z, obj);
            }
        } else {
            z2 = true;
        }
        this.A01.A0K(Collections.singleton(r5), z2);
        z = true;
        return C108945cZ.A0N(z, obj);
    }

    public AnonymousClass6LJ(C25311Ns r1, AnonymousClass1SB r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
