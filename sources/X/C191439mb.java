package X;

import android.content.SharedPreferences;

/* renamed from: X.9mb  reason: invalid class name and case insensitive filesystem */
public final class C191439mb {
    public final AnonymousClass11P A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C18600wl A03;
    public final AnonymousClass1OX A04;

    public final boolean A00() {
        return AnonymousClass000.A1O((((SharedPreferences) AnonymousClass3MX.A14(((C185119c3) this.A02.get()).A01)).getLong("consumer_disclosure", -1) > -1 ? 1 : (((SharedPreferences) AnonymousClass3MX.A14(((C185119c3) this.A02.get()).A01)).getLong("consumer_disclosure", -1) == -1 ? 0 : -1)));
    }

    public C191439mb(AnonymousClass11P r2, AnonymousClass00H r3, AnonymousClass00H r4, C18600wl r5, AnonymousClass1OX r6) {
        C18070vi.A0w(r2, r5, r6, r3, r4);
        this.A00 = r2;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r3;
        this.A01 = r4;
        Boolean bool = C17960vV.A01;
    }
}
