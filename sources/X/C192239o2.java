package X;

import java.util.concurrent.Executor;

/* renamed from: X.9o2  reason: invalid class name and case insensitive filesystem */
public final class C192239o2 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public final C21132Af0 A00(String str, int i) {
        C21132Af0 af0;
        AnonymousClass8BR.A0V(this.A01).A0B(Integer.valueOf(i), "psl_cache_fetch_start");
        C21132Af0 af02 = new C21132Af0();
        C20443ALg aLg = (C20443ALg) this.A00.get();
        synchronized (aLg) {
            af0 = new C21132Af0();
            if (aLg.A06) {
                byte[] bArr = (byte[]) aLg.A00.get(str);
                af0.A0B(AnonymousClass1D6.A01(Boolean.valueOf(AnonymousClass000.A1W(bArr)), bArr));
            } else {
                C20443ALg.A00(aLg, new C21526AlZ(af0, aLg, str, 0));
            }
        }
        af0.A09(new C21118Aem(af02, i, 0, this));
        return af02;
    }

    public C192239o2(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public final Object A01(String str, C30391dr r7, int i) {
        C71053Dp A0k = C108975cc.A0k(r7);
        C21132Af0 A002 = A00(str, i);
        A002.A09(new C21133Af1(A0k, A002, 3));
        A002.A00.A03(new C21133Af1(A0k, A002, 4), (Executor) null);
        return A0k.A00();
    }
}
