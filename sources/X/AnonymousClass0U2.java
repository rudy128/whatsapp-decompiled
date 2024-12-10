package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0U2  reason: invalid class name */
public final class AnonymousClass0U2 implements C17170uE {
    public final int A00;
    public final int A01;
    public final C16020ra A02;

    public /* synthetic */ float BRJ(float f, float f2, float f3) {
        return BbJ(f, f2, f3, BQz(f, f2, f3));
    }

    private final long A00(long j) {
        return C28851b7.A05(j - ((long) this.A00), 0, (long) this.A01);
    }

    public long BQz(float f, float f2, float f3) {
        return ((long) (this.A00 + this.A01)) * SearchActionVerificationClientService.MS_TO_NS;
    }

    public /* bridge */ /* synthetic */ C16830tI CRk(C16590sg r3) {
        return new AnonymousClass0U9(new AnonymousClass0Tu((C17170uE) this));
    }

    public AnonymousClass0U2(C16020ra r1, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r1;
    }

    public float BbE(float f, float f2, float f3, long j) {
        float CPf = this.A02.CPf(C28851b7.A02(((float) A00(j / SearchActionVerificationClientService.MS_TO_NS)) / ((float) this.A01), 0.0f, 1.0f));
        return AnonymousClass000.A00(f, 1.0f - CPf, f2, CPf);
    }

    public float BbJ(float f, float f2, float f3, long j) {
        long A002 = A00(j / SearchActionVerificationClientService.MS_TO_NS);
        if (A002 < 0) {
            return 0.0f;
        }
        float f4 = f3;
        if (A002 == 0) {
            return f3;
        }
        float f5 = f;
        float f6 = f2;
        return (BbE(f5, f6, f4, A002 * SearchActionVerificationClientService.MS_TO_NS) - BbE(f5, f6, f4, (A002 - 1) * SearchActionVerificationClientService.MS_TO_NS)) * 1000.0f;
    }

    public AnonymousClass0U2() {
        this(C02980Gd.A01, 300, 0);
    }
}
