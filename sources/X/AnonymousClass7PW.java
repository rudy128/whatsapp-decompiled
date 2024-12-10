package X;

import android.util.Pair;
import java.util.HashMap;
import java.util.TreeSet;

/* renamed from: X.7PW  reason: invalid class name */
public class AnonymousClass7PW implements Comparable {
    public int A00 = 0;
    public final AnonymousClass11S A01;
    public final String A02;
    public final HashMap A03 = C17880vN.A11();
    public final TreeSet A04 = new TreeSet();

    public int A00() {
        if (this instanceof C115125tR) {
            return (int) ((C115125tR) this).A00;
        }
        return this.A04.size();
    }

    public void A01(AnonymousClass7PX r5) {
        AnonymousClass1BI r3 = r5.A04;
        Pair A0N = C108945cZ.A0N(r3, Long.valueOf(r5.A00));
        HashMap hashMap = this.A03;
        if (!hashMap.containsKey(A0N)) {
            hashMap.put(A0N, r5);
            this.A04.add(r5);
            if (this.A01.A0O(r3)) {
                this.A00++;
            }
        }
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        boolean A1R;
        boolean A1R2;
        AnonymousClass7PW r8 = (AnonymousClass7PW) obj;
        if (this instanceof C115125tR) {
            A1R = ((C115125tR) this).A01;
        } else {
            A1R = AnonymousClass000.A1R(this.A00);
        }
        if (r8 instanceof C115125tR) {
            A1R2 = ((C115125tR) r8).A01;
        } else {
            A1R2 = AnonymousClass000.A1R(r8.A00);
        }
        if (A1R == A1R2) {
            TreeSet treeSet = this.A04;
            TreeSet treeSet2 = r8.A04;
            int i = (((long) treeSet.size()) > ((long) treeSet2.size()) ? 1 : (((long) treeSet.size()) == ((long) treeSet2.size()) ? 0 : -1));
            if (i != 0) {
                return i;
            }
            int i2 = (((AnonymousClass7PX) treeSet.first()).A02 > ((AnonymousClass7PX) treeSet2.first()).A02 ? 1 : (((AnonymousClass7PX) treeSet.first()).A02 == ((AnonymousClass7PX) treeSet2.first()).A02 ? 0 : -1));
            if (i2 == 0) {
                return this.A02.compareTo(r8.A02);
            }
            return i2;
        } else if (A1R) {
            return 1;
        } else {
            return -1;
        }
    }

    public AnonymousClass7PW(AnonymousClass11S r2, AnonymousClass7PX r3, String str) {
        this.A01 = r2;
        this.A02 = str;
        A01(r3);
    }
}
