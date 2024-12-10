package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0UC  reason: invalid class name */
public final class AnonymousClass0UC implements C17200uH {
    public final int A00;
    public final int A01;
    public final AnonymousClass0U9 A02;
    public final C16020ra A03;

    public /* synthetic */ AnonymousClass0D0 BRK(AnonymousClass0D0 r7, AnonymousClass0D0 r8, AnonymousClass0D0 r9) {
        long BR0 = BR0(r7, r8, r9);
        return this.A02.BbK(r7, r8, r9, BR0);
    }

    public /* synthetic */ long BR0(AnonymousClass0D0 r5, AnonymousClass0D0 r6, AnonymousClass0D0 r7) {
        return ((long) (this.A00 + this.A01)) * SearchActionVerificationClientService.MS_TO_NS;
    }

    public AnonymousClass0D0 BbF(AnonymousClass0D0 r7, AnonymousClass0D0 r8, AnonymousClass0D0 r9, long j) {
        return this.A02.BbF(r7, r8, r9, j);
    }

    public AnonymousClass0D0 BbK(AnonymousClass0D0 r7, AnonymousClass0D0 r8, AnonymousClass0D0 r9, long j) {
        return this.A02.BbK(r7, r8, r9, j);
    }

    public AnonymousClass0UC(C16020ra r3, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = r3;
        this.A02 = new AnonymousClass0U9(new AnonymousClass0Tu((C17170uE) new AnonymousClass0U2(r3, i, i2)));
    }

    public int BQT() {
        return this.A00;
    }

    public int BQx() {
        return this.A01;
    }

    public /* synthetic */ boolean Bf5() {
        return false;
    }

    public AnonymousClass0UC() {
        this(C02980Gd.A01, 300, 0);
    }
}
