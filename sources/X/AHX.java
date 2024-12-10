package X;

import java.util.Iterator;
import java.util.TreeMap;

public final class AHX implements BE4, BA0 {
    public static final TreeMap A08 = new TreeMap();
    public int A00;
    public final double[] A01;
    public final long[] A02;
    public final String[] A03;
    public final byte[][] A04;
    public final int A05;
    public final int[] A06;
    public volatile String A07;

    public void BD5(int i, byte[] bArr) {
        C18070vi.A0d(bArr, 1);
        this.A06[i] = 5;
        this.A04[i] = bArr;
    }

    public void BDB(int i, String str) {
        C18070vi.A0d(str, 1);
        this.A06[i] = 4;
        this.A03[i] = str;
    }

    public void close() {
    }

    public final void A00() {
        TreeMap treeMap = A08;
        synchronized (treeMap) {
            C108955ca.A1V(this, treeMap, this.A05);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                C18070vi.A0X(it);
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    public void BD9(int i, long j) {
        this.A06[i] = 2;
        this.A02[i] = j;
    }

    public void BDA(int i) {
        this.A06[i] = 1;
    }

    public void BDD(BE4 be4) {
        int i = this.A00;
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                int i3 = this.A06[i2];
                if (i3 == 1) {
                    be4.BDA(i2);
                } else if (i3 == 2) {
                    be4.BD9(i2, this.A02[i2]);
                } else if (i3 == 3) {
                    ((AHW) be4).A00.bindDouble(i2, this.A01[i2]);
                } else if (i3 == 4) {
                    String str = this.A03[i2];
                    if (str != null) {
                        be4.BDB(i2, str);
                    } else {
                        throw AnonymousClass000.A0k("Required value was null.");
                    }
                } else if (i3 == 5) {
                    byte[] bArr = this.A04[i2];
                    if (bArr != null) {
                        be4.BD5(i2, bArr);
                    } else {
                        throw AnonymousClass000.A0k("Required value was null.");
                    }
                }
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public String BZW() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        throw C17880vN.A0g();
    }

    public AHX(int i) {
        this.A05 = i;
        int i2 = i + 1;
        this.A06 = new int[i2];
        this.A02 = new long[i2];
        this.A01 = new double[i2];
        this.A03 = new String[i2];
        this.A04 = new byte[i2][];
    }
}
