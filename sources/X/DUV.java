package X;

import java.util.Comparator;
import java.util.TreeSet;

public class DUV implements Comparator, C28652ECm {
    public long A00;
    public final long A01;
    public final TreeSet A02 = new TreeSet(this);

    public void Bt8(int i, int i2, String str, String str2) {
    }

    public void A00(EA9 ea9, long j) {
        try {
            C25304Cd8.A01("evictCache");
            C28653ECn eCn = (C28653ECn) ea9;
            while (this.A00 + j > this.A01) {
                TreeSet treeSet = this.A02;
                if (treeSet.isEmpty()) {
                    break;
                }
                eCn.CF1((DSC) treeSet.first(), "lru_policy");
            }
        } finally {
            C25304Cd8.A00();
        }
    }

    public void C61(EA9 ea9, DSC dsc) {
        this.A02.add(dsc);
        this.A00 += dsc.A04;
        A00(ea9, 0);
    }

    public void C62(EA9 ea9, DSC dsc) {
        this.A02.remove(dsc);
        this.A00 -= dsc.A04;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        DSC dsc = (DSC) obj;
        DSC dsc2 = (DSC) obj2;
        long j = dsc.A03;
        long j2 = dsc2.A03;
        if (j - j2 == 0) {
            return dsc.compareTo(dsc2);
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    public DUV(long j) {
        this.A01 = j;
    }

    public void C63(EA9 ea9, DSC dsc, DSC dsc2, Integer num) {
        C62(ea9, dsc);
        C61(ea9, dsc2);
    }

    public void C6K(EA9 ea9, String str, long j, long j2) {
        A00(ea9, j2);
    }
}
