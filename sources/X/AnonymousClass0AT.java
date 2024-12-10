package X;

import android.graphics.Path;

/* renamed from: X.0AT  reason: invalid class name */
public final class AnonymousClass0AT extends C014308l {
    public float A00;
    public C03380Hv A01;
    public C16370s9 A02;
    public AnonymousClass0JD A03;
    public final C17710v6 A04;

    public static final C014408m A00(C22821Di r2) {
        return new C014408m(new C06320Xv(), r2);
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [X.0JD, java.lang.Object] */
    /* access modifiers changed from: private */
    public final AnonymousClass0I1 A02(C06320Xv r24, C03380Hv r25, C015809b r26, float f, long j, long j2, boolean z) {
        AnonymousClass0NJ r3 = r26.A00;
        C06320Xv r6 = r24;
        C03380Hv r8 = r25;
        float f2 = f;
        boolean z2 = z;
        if (C02480Ee.A00(r3)) {
            long j3 = r3.A06;
            return r6.A02(new C10500iR(r8, new C016809l(f2, 4.0f, 0, 0), f / 2.0f, f2, j3, j, j2, z2));
        }
        AnonymousClass0JD r1 = this.A03;
        AnonymousClass0JD r12 = r1;
        if (r1 == null) {
            ? obj = new Object();
            obj.A00 = null;
            this.A03 = obj;
            r12 = obj;
        }
        C18070vi.A0b(r12);
        C17040te r0 = r12.A00;
        if (r0 == null) {
            r0 = AnonymousClass0WS.A00();
            r12.A00 = r0;
        }
        Path path = ((AnonymousClass0WS) r0).A03;
        path.reset();
        r0.BBh(r3);
        if (!z) {
            AnonymousClass0WS A002 = AnonymousClass0WS.A00();
            float f3 = f2;
            A002.BBh(new AnonymousClass0NJ(f2, f3, (r3.A02 - r3.A01) - f, (r3.A00 - r3.A03) - f, C02200Dc.A00(f2, r3.A06), C02200Dc.A00(f2, r3.A07), C02200Dc.A00(f2, r3.A05), C02200Dc.A00(f2, r3.A04)));
            Path.Op op = Path.Op.DIFFERENCE;
            if (r0 instanceof AnonymousClass0WS) {
                path.op(path, A002.A03, op);
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        }
        return r6.A02(new C10200hx(r8, r0));
    }

    public final void A0O(C03380Hv r2) {
        if (!C18070vi.A18(this.A01, r2)) {
            this.A01 = r2;
            this.A04.Bdm();
        }
    }

    public final void A0P(C16370s9 r2) {
        if (!C18070vi.A18(this.A02, r2)) {
            this.A02 = r2;
            this.A04.Bdm();
        }
    }

    public AnonymousClass0AT(C03380Hv r2, C16370s9 r3, float f) {
        this.A00 = f;
        this.A01 = r2;
        this.A02 = r3;
        C014408m A002 = A00(new C12620m3(this));
        A0N(A002);
        this.A04 = A002;
    }
}
