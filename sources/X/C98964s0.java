package X;

import java.text.Collator;
import java.util.Comparator;

@Deprecated
/* renamed from: X.4s0  reason: invalid class name and case insensitive filesystem */
public class C98964s0 implements Comparator {
    public final int A00;
    public final AnonymousClass11S A01;
    public final C24921Me A02;
    public final Collator A03;

    public static int A00(C42751yg r5, C42751yg r6, Collator collator) {
        char c;
        char c2;
        Integer num = r5.A00;
        Integer num2 = AnonymousClass00R.A0Y;
        if (num == num2) {
            c = 1;
        } else {
            c = 0;
            if (num == AnonymousClass00R.A0N) {
                c = 2;
            }
        }
        Integer num3 = r6.A00;
        if (num3 == num2) {
            c2 = 1;
        } else {
            c2 = 0;
            if (num3 == AnonymousClass00R.A0N) {
                c2 = 2;
            }
        }
        if (c == c2) {
            String str = r5.A01;
            String str2 = r6.A01;
            if (str == null) {
                if (str2 == null) {
                    return 0;
                }
                return -1;
            } else if (str2 != null) {
                return collator.compare(str, str2);
            }
        } else if (c < c2) {
            return -1;
        }
        return 1;
    }

    @Deprecated
    /* renamed from: A01 */
    public int compare(AnonymousClass1E7 r7, AnonymousClass1E7 r8) {
        AnonymousClass11S r0 = this.A01;
        boolean A1V = AnonymousClass3Ma.A1V(r0, r7);
        if (A1V == AnonymousClass3Ma.A1V(r0, r8)) {
            Collator collator = this.A03;
            C24921Me r4 = this.A02;
            int i = this.A00;
            return A00(r4.A0F(r7, i, false, true), r4.A0F(r8, i, false, true), collator);
        } else if (A1V) {
            return -1;
        } else {
            return 1;
        }
    }

    public C98964s0(AnonymousClass11S r2, C24921Me r3, int i) {
        this.A01 = r2;
        this.A00 = i;
        this.A02 = r3;
        this.A03 = r3.A0c();
    }
}
