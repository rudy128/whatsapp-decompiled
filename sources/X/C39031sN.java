package X;

import java.util.Arrays;

/* renamed from: X.1sN  reason: invalid class name and case insensitive filesystem */
public class C39031sN extends C38991sJ {
    public int A00;
    public C39001sK A01;
    public C39061sQ A02;
    public C38971sH[] A03;
    public C38971sH[] A04;

    public static final void A02(C39031sN r6, C38971sH r7) {
        int i = 0;
        while (true) {
            int i2 = r6.A00;
            if (i < i2) {
                C38971sH[] r2 = r6.A03;
                if (r2[i] != r7) {
                    i++;
                } else {
                    while (true) {
                        int i3 = i2 - 1;
                        if (i < i3) {
                            int i4 = i + 1;
                            r2[i] = r2[i4];
                            i = i4;
                        } else {
                            r6.A00 = i3;
                            r7.A07 = false;
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public static final void A01(C39031sN r7, C38971sH r8) {
        C38971sH[] r1;
        int i = r7.A00 + 1;
        C38971sH[] r12 = r7.A03;
        int length = r12.length;
        if (i > length) {
            C38971sH[] r13 = (C38971sH[]) Arrays.copyOf(r12, length * 2);
            r7.A03 = r13;
            r7.A04 = (C38971sH[]) Arrays.copyOf(r13, r13.length * 2);
        }
        C38971sH[] r6 = r7.A03;
        int i2 = r7.A00;
        r6[i2] = r8;
        int i3 = i2 + 1;
        r7.A00 = i3;
        if (i3 > 1 && r6[i3 - 1].A02 > r8.A02) {
            int i4 = 0;
            do {
                r1 = r7.A04;
                r1[i4] = r6[i4];
                i4++;
            } while (i4 < i3);
            Arrays.sort(r1, 0, i3, new DUP(r7, 0));
            for (int i5 = 0; i5 < r7.A00; i5++) {
                r7.A03[i5] = r7.A04[i5];
            }
        }
        r8.A07 = true;
        r8.A02(r7);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(" goal -> (");
        sb.append(this.A00);
        sb.append(") : ");
        String obj = sb.toString();
        for (int i = 0; i < this.A00; i++) {
            C38971sH r1 = this.A03[i];
            C39061sQ r0 = this.A02;
            r0.A01 = r1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(r0);
            sb2.append(" ");
            obj = sb2.toString();
        }
        return obj;
    }
}
