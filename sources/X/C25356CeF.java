package X;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CeF  reason: case insensitive filesystem */
public abstract class C25356CeF {
    public static final void A00(Bitmap bitmap, C17130tn r14, C17090tj r15, String str, C18090vk r17, int i, int i2) {
        long j;
        C18090vk r10 = r17;
        String str2 = str;
        C17090tj r8 = r15;
        r14.COC(-936336683);
        int i3 = i2;
        int i4 = i2 & 1;
        int i5 = i;
        int i6 = i | 6;
        if (i4 == 0) {
            if ((i & 6) == 0) {
                i6 = AnonymousClass001.A0Q(r14, r15) | i;
            } else {
                i6 = i5;
            }
        }
        Bitmap bitmap2 = bitmap;
        if ((i2 & 2) != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            i6 |= AnonymousClass001.A0b(r14, bitmap);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i6 |= 384;
        } else if ((i5 & 384) == 0) {
            i6 |= AnonymousClass001.A0S(r14, str2);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i6 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i6 |= AnonymousClass001.A0d(r14, r10);
        }
        if ((i6 & 1171) != 1170 || !r14.BZO()) {
            if (i4 != 0) {
                r8 = C17090tj.A00;
            }
            if (i7 != 0) {
                str2 = "";
            }
            if (i8 != 0) {
                r10 = new DWU(24);
            }
            C17090tj CP5 = r8.CP5(C05130Qo.A00);
            C26257Cw2 A0g = BE6.A0g(r14, CG7.A00);
            if (A0g instanceof BqD) {
                j = ((BqD) A0g).A0D;
            } else {
                j = ((BqC) A0g).A0D;
            }
            C17090tj A00 = C02190Db.A00(CP5, AnonymousClass0GC.A00, j);
            C16870tM A0S = BEA.A0S(r14, AnonymousClass0MX.A05);
            AnonymousClass0VR r4 = (AnonymousClass0VR) r14;
            int i9 = r4.A01;
            C17350uW BPs = r14.BPs();
            C18090vk r0 = C05030Qc.A00;
            AnonymousClass04D A01 = AnonymousClass0LO.A01(A00);
            BEA.A19(r14, r4, r0);
            BE9.A18(r14, A0S, BPs);
            AnonymousClass1OS r1 = C05030Qc.A01;
            if (r4.A0K || !BE9.A1R(r14, i9)) {
                BE9.A19(r14, r1, i9);
            }
            BEB.A0r(r14, A01);
            AnonymousClass0WC r12 = C17090tj.A00;
            r14.BFh(CG8.A00);
            C24620CCg.A00(r14, AnonymousClass0Q7.A04(r12, 40.0f), AnonymousClass0LC.A00(r14, new C27165DXa(bitmap, r8, str2, r10), 1690975607), 48, 0);
            BEA.A18(r14, r4);
        } else {
            r14.CNR();
        }
        C05660Vf BKF = r14.BKF();
        if (BKF != null) {
            BKF.A06 = new DX6(bitmap2, r8, str2, r10, i5, i3);
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [X.C5L, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v4, types: [X.C4e, java.lang.Object] */
    public static final void A01(C17130tn r11, int i, long j) {
        int i2;
        r11.COC(-79486864);
        if ((i & 6) == 0) {
            i2 = AnonymousClass000.A09(r11.BEe(j) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r11.BZO()) {
            AnonymousClass0WC r3 = C17090tj.A00;
            C28644ECa eCa = (C28644ECa) r11.BFh(AnonymousClass0OD.A01);
            C17090tj A0B = C05130Qo.A0B(r3, eCa.CPG(AnonymousClass000.A0G(j)), eCa.CPG(AnonymousClass000.A0H(j)));
            Integer[] numArr = new Integer[4];
            C17880vN.A1T(numArr, AnonymousClass0Oy.A00(AnonymousClass0FW.A00(r11, 2131100194)), 0);
            numArr[1] = Integer.valueOf(AnonymousClass0Oy.A00(AnonymousClass0FW.A00(r11, 2131100195)));
            C17880vN.A1T(numArr, AnonymousClass0Oy.A00(AnonymousClass0FW.A00(r11, 2131100196)), 2);
            C17890vO.A1G(numArr, AnonymousClass0Oy.A00(AnonymousClass0FW.A00(r11, 2131100197)));
            List asList = Arrays.asList(numArr);
            C18070vi.A0X(asList);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C25144CZv cZv = new C25144CZv(timeUnit);
            ? obj = new Object();
            long convert = timeUnit.convert(100, cZv.A00);
            obj.A01 = convert;
            obj.A00 = ((float) (convert / 100)) / 1000.0f;
            ? obj2 = new Object();
            C25787Cly[] clyArr = new C25787Cly[2];
            clyArr[0] = C25787Cly.A04;
            C24644CDe.A00(r11, A0B, C18070vi.A0M(new C25226CbN(C18070vi.A0O(C25787Cly.A03, clyArr, 1), asList, obj2, obj)), 0, 4);
        } else {
            r11.CNR();
        }
        C05660Vf BKF = r11.BKF();
        if (BKF != null) {
            BKF.A06 = new C27159DWu(j, i);
        }
    }
}
