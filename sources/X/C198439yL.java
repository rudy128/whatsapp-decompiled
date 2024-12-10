package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.9yL  reason: invalid class name and case insensitive filesystem */
public final class C198439yL {
    public final C20123A8i A00;
    public final AnonymousClass9WQ A01;
    public final AnonymousClass9P7 A02;
    public final Map A03;
    public final Executor A04;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.9N0, java.lang.Object] */
    public static final AnonymousClass9N0 A00(C198439yL r3, String str) {
        Map map = r3.A03;
        LinkedHashMap A0b = C108995ce.A0b(map);
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            A0b.put(A16.getKey(), AnonymousClass8BR.A0u(str, AnonymousClass8BR.A10(A16)).getPath());
        }
        ? obj = new Object();
        obj.A00 = A0b;
        return obj;
    }

    public C198439yL(C20123A8i a8i, AnonymousClass9WQ r2, AnonymousClass9P7 r3, Map map, Executor executor) {
        C72473Md.A1J(r3, r2);
        this.A04 = executor;
        this.A00 = a8i;
        this.A03 = map;
        this.A02 = r3;
        this.A01 = r2;
    }
}
