package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.D9w  reason: case insensitive filesystem */
public class C26698D9w implements C28652ECm {
    public final Map A00 = C17880vN.A11();

    public void Bt8(int i, int i2, String str, String str2) {
    }

    public void C63(EA9 ea9, DSC dsc, DSC dsc2, Integer num) {
    }

    public void C6K(EA9 ea9, String str, long j, long j2) {
    }

    public void C61(EA9 ea9, DSC dsc) {
        String str = dsc.A07;
        String A002 = C24578C9z.A00(str);
        Map map = this.A00;
        if (!map.containsKey(A002)) {
            map.put(A002, C17880vN.A12());
        }
        ((Set) map.get(A002)).add(Integer.valueOf(str.hashCode()));
    }

    public void C62(EA9 ea9, DSC dsc) {
        String str = dsc.A07;
        String A002 = C24578C9z.A00(str);
        Map map = this.A00;
        Set set = (Set) map.get(A002);
        if (set != null) {
            set.remove(Integer.valueOf(str.hashCode()));
            if (set.isEmpty()) {
                map.remove(A002);
            }
        }
    }
}
