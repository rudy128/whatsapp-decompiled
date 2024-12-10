package X;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.10l  reason: invalid class name and case insensitive filesystem */
public class C200010l {
    public static final Set A04 = C200410p.A0S(new String[]{"ab-props", "ab-props-back-up", "ab-prechatd-props", "ab-props-backup", "dropped_wam_events"});
    public static final Set A05;
    public ConcurrentHashMap A00;
    public ConcurrentHashMap A01;
    public ConcurrentHashMap A02;
    public boolean A03;

    static {
        Set singleton = Collections.singleton("chatCounts");
        C18070vi.A0X(singleton);
        A05 = singleton;
    }

    public final void A00(String str, String str2) {
        ConcurrentHashMap concurrentHashMap;
        Object obj;
        Object putIfAbsent;
        String str3;
        C18070vi.A0d(str, 0);
        if (this.A03 && !A04.contains(str)) {
            if (str2.equals("get")) {
                concurrentHashMap = this.A01;
                if (concurrentHashMap == null) {
                    str3 = "getterCounter";
                }
                obj = concurrentHashMap.get(str);
                if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, obj)) != null) {
                    obj = putIfAbsent;
                }
                ((AtomicLong) obj).incrementAndGet();
                return;
            } else if (str2.equals("edit")) {
                concurrentHashMap = this.A00;
                if (concurrentHashMap == null) {
                    str3 = "editorCounter";
                }
                obj = concurrentHashMap.get(str);
                obj = new AtomicLong(0);
                obj = putIfAbsent;
                ((AtomicLong) obj).incrementAndGet();
                return;
            } else {
                return;
            }
            C18070vi.A11(str3);
            throw null;
        }
    }
}
