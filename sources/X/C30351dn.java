package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.1dn  reason: invalid class name and case insensitive filesystem */
public final class C30351dn {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public Map A07 = new LinkedHashMap();
    public final long A08;
    public final AnonymousClass19T A09;

    public C30351dn(AnonymousClass19T r3, boolean z) {
        C18070vi.A0d(r3, 1);
        this.A09 = r3;
        String obj = UUID.randomUUID().toString();
        C18070vi.A0X(obj);
        this.A06 = obj;
        this.A08 = r3.currentMonotonicTimestampNanos();
        if (z && this.A05 == null) {
            this.A05 = Long.valueOf(this.A09.currentMonotonicTimestampNanos());
        }
    }
}
