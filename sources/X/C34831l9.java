package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1l9  reason: invalid class name and case insensitive filesystem */
public class C34831l9 {
    public int A00;
    public final Map A01 = new HashMap();
    public final C18140vp A02;

    public C60042nI A00(String str, String str2, int i) {
        if (i != this.A00) {
            A01();
            this.A00 = i;
        }
        Map map = this.A01;
        if (!map.containsKey(str)) {
            C28781at r2 = (C28781at) this.A02.get();
            try {
                map.put(str, ((C28801av) r2).A02.A0D(str, str2));
                r2.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
        return (C60042nI) map.get(str);
    }

    public void A01() {
        Map map = this.A01;
        for (C60042nI r0 : map.values()) {
            if (r0 != null) {
                r0.A00.close();
            }
        }
        map.clear();
    }

    public C34831l9(C18140vp r2, int i) {
        this.A00 = i;
        this.A02 = r2;
    }
}
