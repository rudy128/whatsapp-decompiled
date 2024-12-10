package X;

import java.util.Map;
import java.util.TreeMap;

public abstract class A3D {
    public static final AHX A01(String str, int i) {
        C18070vi.A0d(str, 0);
        TreeMap treeMap = AHX.A08;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                AHX ahx = (AHX) ceilingEntry.getValue();
                ahx.A07 = str;
                ahx.A00 = i;
                return ahx;
            }
            AHX ahx2 = new AHX(i);
            ahx2.A07 = str;
            ahx2.A00 = i;
            return ahx2;
        }
    }

    public static AHX A02(String str, String str2) {
        TreeMap treeMap = AHX.A08;
        AHX A01 = A01(str, 1);
        if (str2 == null) {
            A01.BDA(1);
            return A01;
        }
        A01.BDB(1, str2);
        return A01;
    }

    public static AHX A00(String str, int i) {
        TreeMap treeMap = AHX.A08;
        return A01(str, i);
    }
}
