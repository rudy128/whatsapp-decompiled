package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.72c  reason: invalid class name and case insensitive filesystem */
public abstract class C1405972c {
    public static final Map A00;
    public static final Integer[] A01;

    public static double[] A01(int i) {
        double d;
        double[] dArr = {((double) ((i >> 16) & 255)) / 255.0d, ((double) ((i >> 8) & 255)) / 255.0d, ((double) (i & 255)) / 255.0d};
        int i2 = 0;
        do {
            double d2 = dArr[i2];
            if (d2 > 0.04045d) {
                d = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            } else {
                d = d2 / 12.92d;
            }
            dArr[i2] = d;
            dArr[i2] = d * 100.0d;
            i2++;
        } while (i2 < 3);
        double d3 = dArr[0];
        double d4 = dArr[1];
        double d5 = dArr[2];
        return new double[]{(0.4124d * d3) + (0.3576d * d4) + (0.1805d * d5), (0.2126d * d3) + (0.7152d * d4) + (0.0722d * d5), (d3 * 0.0193d) + (d4 * 0.1192d) + (d5 * 0.9505d)};
    }

    public static double[] A02(double[] dArr) {
        double d;
        double[] dArr2 = {dArr[0] / 95.047d, dArr[1] / 100.0d, dArr[2] / 108.883d};
        int i = 0;
        do {
            double d2 = dArr2[i];
            if (d2 > 0.008856d) {
                d = Math.pow(d2, 0.3333333333333333d);
            } else {
                d = (d2 * 7.787d) + 0.13793103448275862d;
            }
            dArr2[i] = d;
            i++;
        } while (i < 3);
        double d3 = dArr2[1];
        return new double[]{(116.0d * d3) - 16.0d, (dArr2[0] - d3) * 500.0d, (d3 - dArr2[2]) * 200.0d};
    }

    public static Integer A00(int i) {
        Integer[] numArr = A01;
        int i2 = -1;
        double d = Double.MAX_VALUE;
        for (int i3 = 0; i3 < numArr.length; i3++) {
            double[] A02 = A02(A01(numArr[i3].intValue()));
            double[] A022 = A02(A01(i));
            double d2 = A02[0] - A022[0];
            double d3 = A02[1];
            double d4 = A022[1];
            double d5 = A02[2];
            double d6 = A022[2];
            double d7 = d5 - d6;
            double sqrt = Math.sqrt(Math.pow(d3, 2.0d) + Math.pow(d5, 2.0d));
            double sqrt2 = sqrt - Math.sqrt(Math.pow(d4, 2.0d) + Math.pow(d6, 2.0d));
            double pow = (Math.pow(d3 - d4, 2.0d) + Math.pow(d7, 2.0d)) - Math.pow(sqrt2, 2.0d);
            double d8 = 0.0d;
            if (pow > 0.0d) {
                d8 = Math.sqrt(pow);
            }
            double sqrt3 = Math.sqrt((double) ((float) (Math.pow(d2 / 1.0d, 2.0d) + Math.pow(sqrt2 / ((0.045d * sqrt) + 1.0d), 2.0d) + Math.pow(d8 / ((sqrt * 0.015d) + 1.0d), 2.0d))));
            if (sqrt3 < d) {
                i2 = numArr[i3].intValue();
                d = sqrt3;
            }
        }
        return (Integer) AnonymousClass000.A0w(A00, i2);
    }

    static {
        HashMap A11 = C17880vN.A11();
        A00 = A11;
        Integer A0k = C108955ca.A0k(15792383, A11, 2131888419);
        C108955ca.A1V(A0k, A11, 761085);
        Integer A0k2 = C108955ca.A0k(16444375, A11, 2131888372);
        Integer A0k3 = C108955ca.A0k(65535, A11, 2131888379);
        C108955ca.A1V(A0k3, A11, 8388564);
        Integer A0k4 = C108955ca.A0k(15794175, A11, 2131888467);
        C108955ca.A1V(A0k2, A11, 16119260);
        C108955ca.A1V(A0k2, A11, 16770244);
        C17890vO.A0z(AnonymousClass3MY.A0f(), A11, 2131888375);
        C108955ca.A1V(A0k2, A11, 16772045);
        Integer A0k5 = C108955ca.A0k(255, A11, 2131888376);
        Integer A0k6 = C108955ca.A0k(9055202, A11, 2131888446);
        Integer A0k7 = C108955ca.A0k(10824234, A11, 2131888407);
        C108955ca.A1V(A0k2, A11, 14596231);
        Integer A0k8 = C108955ca.A0k(6266528, A11, 2131888460);
        Integer A0k9 = C108955ca.A0k(8388352, A11, 2131888421);
        C108955ca.A1V(A0k9, A11, 6537036);
        Integer A0k10 = C108955ca.A0k(13789470, A11, 2131888404);
        Integer A0k11 = C108955ca.A0k(16744272, A11, 2131888440);
        C108955ca.A1V(A0k, A11, 6591981);
        Integer A0k12 = C108955ca.A0k(16775388, A11, 2131888428);
        Integer A0k13 = C108955ca.A0k(14423100, A11, 2131888449);
        Integer A0k14 = C108955ca.A0k(139, A11, 2131888400);
        C108955ca.A1V(A0k8, A11, 35723);
        C108955ca.A1V(A0k2, A11, 12092939);
        Integer A0k15 = C108955ca.A0k(11119017, A11, 2131888417);
        C17890vO.A0z(25600, A11, 2131888402);
        Integer A0k16 = C108955ca.A0k(12433259, A11, 2131888439);
        Integer A0k17 = C108955ca.A0k(9109643, A11, 2131888406);
        C108955ca.A1V(A0k16, A11, 5597999);
        C108955ca.A1V(A0k11, A11, 16747520);
        C108955ca.A1V(A0k6, A11, 10040012);
        C108955ca.A1V(A0k7, A11, 9109504);
        Integer A0k18 = C108955ca.A0k(16166665, A11, 2131888468);
        Integer A0k19 = C108955ca.A0k(15308410, A11, 2131888423);
        C108955ca.A1V(A0k16, A11, 9419919);
        C108955ca.A1V(A0k17, A11, 4734347);
        C108955ca.A1V(A0k8, A11, 3100495);
        C108955ca.A1V(A0k3, A11, 52945);
        C108955ca.A1V(A0k6, A11, 9699539);
        Integer A0k20 = C108955ca.A0k(16716947, A11, 2131888443);
        C108955ca.A1V(A0k5, A11, 49151);
        Integer A0k21 = C108955ca.A0k(6908265, A11, 2131888403);
        C108955ca.A1V(A0k5, A11, 2003199);
        C108955ca.A1V(A0k7, A11, 11674146);
        C108955ca.A1V(A0k4, A11, 16775920);
        Integer A0k22 = C108955ca.A0k(2263842, A11, 2131888416);
        Integer A0k23 = C108955ca.A0k(16711935, A11, 2131888429);
        Integer A0k24 = C108955ca.A0k(14474460, A11, 2131888422);
        C108955ca.A1V(A0k4, A11, 16316671);
        A11.put(16766720, A0k18);
        C17890vO.A0z(14329120, A11, 2131888409);
        A11.put(8421504, A0k21);
        C108955ca.A1V(A0k22, A11, 32768);
        C108955ca.A1V(A0k9, A11, 11403055);
        C108955ca.A1V(A0k9, A11, 15794160);
        C108955ca.A1V(A0k20, A11, 16738740);
        C108955ca.A1V(A0k13, A11, 13458524);
        C17890vO.A0z(12201298, A11, 2131888397);
        C108955ca.A1V(A0k17, A11, 4915330);
        C108955ca.A1V(A0k4, A11, 16777200);
        C108955ca.A1V(A0k12, A11, 15787660);
        Integer A0k25 = C108955ca.A0k(15132410, A11, 2131888425);
        C17890vO.A0z(16773365, A11, 2131888424);
        C108955ca.A1V(A0k9, A11, 8190976);
        C108955ca.A1V(A0k12, A11, 16775885);
        C108955ca.A1V(A0k, A11, 11393254);
        Integer A0k26 = C108955ca.A0k(15761536, A11, 2131888426);
        C108955ca.A1V(A0k, A11, 14745599);
        C108955ca.A1V(A0k12, A11, 16448210);
        C108955ca.A1V(A0k24, A11, 13882323);
        C108955ca.A1V(A0k9, A11, 9498256);
        C108955ca.A1V(A0k20, A11, 16758465);
        C108955ca.A1V(A0k19, A11, 16752762);
        C108955ca.A1V(A0k8, A11, 2142890);
        C108955ca.A1V(A0k, A11, 8900346);
        C108955ca.A1V(A0k15, A11, 7833753);
        C108955ca.A1V(A0k24, A11, 11584734);
        C108955ca.A1V(A0k12, A11, 16777184);
        C108955ca.A1V(A0k22, A11, 65280);
        C108955ca.A1V(A0k22, A11, 3329330);
        C108955ca.A1V(A0k2, A11, 16445670);
        C108955ca.A1V(A0k7, A11, 8388608);
        C108955ca.A1V(A0k8, A11, 6737322);
        C108955ca.A1V(A0k5, A11, 205);
        C108955ca.A1V(A0k6, A11, 12211667);
        C108955ca.A1V(A0k6, A11, 9662683);
        C108955ca.A1V(A0k22, A11, 3978097);
        C108955ca.A1V(A0k6, A11, 8087790);
        C108955ca.A1V(A0k9, A11, 64154);
        C108955ca.A1V(A0k3, A11, 4772300);
        C108955ca.A1V(A0k23, A11, 13047173);
        C108955ca.A1V(A0k14, A11, 1644912);
        C108955ca.A1V(A0k9, A11, 16121850);
        C108955ca.A1V(A0k20, A11, 16770273);
        C108955ca.A1V(A0k2, A11, 16770229);
        C108955ca.A1V(A0k2, A11, 16768685);
        C108955ca.A1V(A0k14, A11, 128);
        C108955ca.A1V(A0k2, A11, 16643558);
        C108955ca.A1V(A0k16, A11, 8421376);
        C108955ca.A1V(A0k16, A11, 7048739);
        C108955ca.A1V(A0k11, A11, 16753920);
        C108955ca.A1V(A0k10, A11, 15881513);
        C108955ca.A1V(A0k13, A11, 16729344);
        C108955ca.A1V(A0k25, A11, 14315734);
        C108955ca.A1V(A0k2, A11, 15657130);
        C108955ca.A1V(A0k9, A11, 10025880);
        C108955ca.A1V(A0k, A11, 11529966);
        C108955ca.A1V(A0k20, A11, 14381203);
        C108955ca.A1V(A0k2, A11, 16773077);
        C108955ca.A1V(A0k2, A11, 16767673);
        Integer A0k27 = C108955ca.A0k(13468991, A11, 2131888389);
        C108955ca.A1V(A0k20, A11, 16761035);
        C108955ca.A1V(A0k25, A11, 14524637);
        C108955ca.A1V(A0k, A11, 11591910);
        C108955ca.A1V(A0k6, A11, 8388736);
        C108955ca.A1V(A0k6, A11, 6697881);
        C108955ca.A1V(A0k13, A11, 16711680);
        C108955ca.A1V(A0k26, A11, 12357519);
        C108955ca.A1V(A0k5, A11, 4286945);
        C108955ca.A1V(A0k27, A11, 9127187);
        C108955ca.A1V(A0k13, A11, 16416882);
        C108955ca.A1V(A0k19, A11, 16032864);
        C108955ca.A1V(A0k22, A11, 3050327);
        C108955ca.A1V(A0k4, A11, 16774638);
        C108955ca.A1V(A0k27, A11, 10506797);
        C108955ca.A1V(A0k15, A11, 12632256);
        C108955ca.A1V(A0k, A11, 8900331);
        C108955ca.A1V(A0k6, A11, 6970061);
        C108955ca.A1V(A0k15, A11, 7372944);
        C108955ca.A1V(A0k4, A11, 16775930);
        C108955ca.A1V(A0k22, A11, 65407);
        C108955ca.A1V(A0k5, A11, 4620980);
        C108955ca.A1V(A0k2, A11, 13808780);
        C108955ca.A1V(A0k8, A11, 32896);
        C108955ca.A1V(A0k20, A11, 14204888);
        C108955ca.A1V(A0k13, A11, 16737095);
        C108955ca.A1V(A0k, A11, 4251856);
        C108955ca.A1V(A0k20, A11, 15631086);
        C108955ca.A1V(A0k2, A11, 16113331);
        C108955ca.A1V(A0k4, A11, 16777215);
        C108955ca.A1V(A0k24, A11, 16119285);
        C108955ca.A1V(A0k18, A11, 16776960);
        C108955ca.A1V(A0k9, A11, 10145074);
        C108955ca.A1V(A0k, A11, 39398);
        C17890vO.A0z(33217, A11, 2131888456);
        C108955ca.A1V(A0k5, A11, 1603570);
        C108955ca.A1V(A0k9, A11, 3252812);
        C108955ca.A1V(A0k22, A11, 2393404);
        C108955ca.A1V(A0k8, A11, 630409);
        C108955ca.A1V(A0k6, A11, 8474087);
        C17890vO.A0z(16537462, A11, 2131888396);
        C108955ca.A1V(A0k10, A11, 15551028);
        C108955ca.A1V(A0k11, A11, 15427085);
        C108955ca.A1V(A0k13, A11, 15738953);
        C108955ca.A1V(A0k20, A11, 15548837);
        C17890vO.A0z(13725460, A11, 2131888459);
        C108955ca.A1V(A0k27, A11, 11883520);
        A01 = (Integer[]) A11.keySet().toArray(new Integer[A11.size()]);
    }
}
