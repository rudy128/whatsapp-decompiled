package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.2KZ  reason: invalid class name */
public class AnonymousClass2KZ extends C60182nW implements AnonymousClass3LC {
    public C55072fA A00;
    public final AnonymousClass118 A01;
    public final C42351y2 A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2KZ(X.AnonymousClass190 r17, X.AnonymousClass11S r18, X.AnonymousClass18O r19, X.AnonymousClass1M9 r20, X.C24921Me r21, X.AnonymousClass11C r22, X.AnonymousClass118 r23, X.C18000vb r24, X.C32211gp r25, X.C42351y2 r26, X.C18030ve r27, X.AnonymousClass1LU r28, X.C217217d r29, X.C55072fA r30, X.AnonymousClass72L r31) {
        /*
            r16 = this;
            r0 = r30
            X.212 r14 = r0.A02
            r12 = r28
            r11 = r27
            r15 = r31
            r3 = r18
            r2 = r17
            r13 = r29
            r1 = r16
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.A01 = r8
            r1.A00 = r0
            r0 = r26
            r1.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2KZ.<init>(X.190, X.11S, X.18O, X.1M9, X.1Me, X.11C, X.118, X.0vb, X.1gp, X.1y2, X.0ve, X.1LU, X.17d, X.2fA, X.72L):void");
    }

    public static String A00(AnonymousClass2KZ r12) {
        Integer num;
        C55072fA r2 = r12.A00;
        AnonymousClass212 r4 = r2.A02;
        if (r4 instanceof AnonymousClass227) {
            AnonymousClass118 r0 = r12.A01;
            C217217d r1 = r12.A08;
            int i = r2.A00 - 1;
            Context context = r0.A00;
            CharSequence A0J = r1.A0J(r2.A01);
            String A022 = C1409073n.A02(((AnonymousClass227) r2.A02).A01);
            if (i != 0) {
                Object[] objArr = new Object[3];
                objArr[0] = A022;
                C17880vN.A1S(objArr, i, 1);
                return C17880vN.A0q(context, A0J, objArr, 2, 2131894925);
            }
            Object[] objArr2 = new Object[2];
            objArr2[0] = A022;
            return C17880vN.A0q(context, A0J, objArr2, 1, 2131894927);
        } else if (r4 instanceof AnonymousClass22E) {
            AnonymousClass118 r13 = r12.A01;
            AnonymousClass206 r5 = r2.A01;
            if (!(r5 instanceof AnonymousClass22H)) {
                return "";
            }
            Context context2 = r13.A00;
            Object[] objArr3 = new Object[2];
            objArr3[0] = "📊";
            return C17880vN.A0q(context2, ((AnonymousClass22H) r5).A05, objArr3, 1, 2131894699);
        } else if (!(r4 instanceof AnonymousClass24H)) {
            return "";
        } else {
            AnonymousClass206 r8 = r2.A01;
            if (!(r8 instanceof C445823z)) {
                return "";
            }
            AnonymousClass24H r6 = (AnonymousClass24H) r4;
            C49552Qx r52 = r6.A02;
            ArrayList A10 = C17880vN.A10(Arrays.asList(new C49552Qx[]{C49552Qx.NOT_GOING, C49552Qx.GOING}));
            if (C18020vd.A05(C18040vf.A02, r12.A07, 9278)) {
                A10.add(C49552Qx.MAYBE);
            }
            if (!A10.contains(r52)) {
                return "";
            }
            int i2 = r6.A00;
            int ordinal = r52.ordinal();
            if (ordinal != 1) {
                if (ordinal != 3) {
                    num = AnonymousClass00R.A0j;
                } else {
                    num = AnonymousClass00R.A0u;
                }
            } else if (i2 > 0) {
                num = AnonymousClass00R.A0Y;
            } else {
                num = AnonymousClass00R.A0N;
            }
            return r12.A02.A00((TextView) null, (C445823z) r8, r4.A0H(), num, AnonymousClass00R.A00, 200).toString();
        }
    }

    public static String A01(AnonymousClass2KZ r5, String str) {
        int i = r5.A00.A00 - 1;
        if (i == 0) {
            return str;
        }
        Resources resources = r5.A01.A00.getResources();
        Object[] A1a = C17890vO.A1a(str);
        C17880vN.A1T(A1a, i, 1);
        return resources.getQuantityString(2131755352, i, A1a);
    }

    public C136826uT A09() {
        boolean z;
        AnonymousClass212 r1 = this.A00.A02;
        if (!(r1 instanceof AnonymousClass22E) && !(r1 instanceof AnonymousClass24H)) {
            return super.A09();
        }
        AnonymousClass1E7 A03 = A03();
        String A06 = A06();
        AnonymousClass1BI r0 = this.A00.A0v.A00;
        C24921Me r12 = this.A04;
        String A0U = r12.A0U(A03, r12.A09(A03, r0), false);
        if (this.A00.A00 > 1) {
            Resources resources = this.A01.A00.getResources();
            int i = this.A00.A00 - 1;
            Object[] objArr = new Object[2];
            objArr[0] = A0U;
            C17880vN.A1S(objArr, i, 1);
            A0U = resources.getQuantityString(2131755342, i, objArr);
        }
        AnonymousClass206 r2 = this.A00;
        if (!this.A02.A09(AnonymousClass18O.A0B) || (!(r2 instanceof C48392Mh) && !(r2 instanceof C436420i))) {
            z = r2.A0v.A02;
        } else {
            z = this.A01.A0O(A03.A0J);
        }
        if (z) {
            return this.A08.A0G();
        }
        return new C136826uT(IconCompat.A03(this.A08.A0F(A03)), A0U, (String) null, A06, false, false);
    }

    public AnonymousClass205 BWG() {
        return this.A00.A01.A0v;
    }
}
