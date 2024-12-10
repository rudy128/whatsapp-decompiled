package X;

import java.util.List;
import java.util.Locale;

/* renamed from: X.1vX  reason: invalid class name and case insensitive filesystem */
public class C40941vX {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final C39801tf A09;
    public final C40561uu A0A;
    public final C22736BMz A0B;
    public final C24946CQw A0C;
    public final C40691v7 A0D;
    public final C24747CIj A0E;
    public final CS8 A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final String A0J;
    public final String A0K;
    public final List A0L;
    public final List A0M;
    public final List A0N;
    public final boolean A0O;

    public String A00(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.A0J);
        sb.append("\n");
        C39801tf r5 = this.A09;
        C40941vX r1 = (C40941vX) r5.A05.A05(this.A08);
        if (r1 != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                sb.append(str2);
                sb.append(r1.A0J);
                r1 = (C40941vX) r5.A05.A05(r1.A08);
                if (r1 == null) {
                    break;
                }
                str2 = "->";
            }
            sb.append(str);
            sb.append("\n");
        }
        List list = this.A0M;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(list.size());
            sb.append("\n");
        }
        int i2 = this.A06;
        if (!(i2 == 0 || (i = this.A05) == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.A04)}));
        }
        List list2 = this.A0N;
        if (!list2.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object next : list2) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(next);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public String toString() {
        return A00("");
    }

    public C40941vX(C39801tf r3, C40561uu r4, C22736BMz bMz, C24946CQw cQw, C40691v7 r7, C24747CIj cIj, CS8 cs8, Integer num, Integer num2, Integer num3, String str, String str2, List list, List list2, List list3, float f, float f2, float f3, float f4, int i, int i2, int i3, long j, long j2, boolean z) {
        this.A0N = list;
        this.A09 = r3;
        this.A0J = str;
        this.A07 = j;
        this.A0H = num;
        this.A08 = j2;
        this.A0K = str2;
        this.A0M = list2;
        this.A0D = r7;
        this.A06 = i;
        this.A05 = i2;
        this.A04 = i3;
        this.A03 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A0B = bMz;
        this.A0C = cQw;
        this.A0L = list3;
        this.A0I = num2;
        this.A0A = r4;
        this.A0O = z;
        this.A0E = cIj;
        this.A0F = cs8;
        this.A0G = num3;
    }
}
