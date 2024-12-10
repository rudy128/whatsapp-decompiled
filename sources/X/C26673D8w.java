package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.D8w  reason: case insensitive filesystem */
public final class C26673D8w implements E8W {
    public final /* synthetic */ D95 A00;

    public boolean BgN() {
        return true;
    }

    public C26673D8w(D95 d95) {
        this.A00 = d95;
    }

    public long BR1() {
        D95 d95 = this.A00;
        return (d95.A05 * SearchActionVerificationClientService.MS_TO_NS) / ((long) d95.A0B.A00);
    }

    public C25155Ca6 BYo(long j) {
        D95 d95 = this.A00;
        long A0F = BE8.A0F((long) d95.A0B.A00, j);
        long j2 = d95.A09;
        long j3 = d95.A08;
        C25781Cls cls = new C25781Cls(j, Math.max(j2, Math.min((j2 + ((A0F * (j3 - j2)) / d95.A05)) - C20113A7w.A0L, j3 - 1)));
        return new C25155Ca6(cls, cls);
    }
}
