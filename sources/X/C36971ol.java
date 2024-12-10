package X;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1ol  reason: invalid class name and case insensitive filesystem */
public final class C36971ol {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final Set A02;
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();

    public C36971ol(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A01 = r2;
        this.A00 = r3;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C18070vi.A0X(newSetFromMap);
        this.A02 = newSetFromMap;
    }
}
