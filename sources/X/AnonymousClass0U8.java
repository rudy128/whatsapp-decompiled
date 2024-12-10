package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0U8  reason: invalid class name */
public final class AnonymousClass0U8 implements C16830tI {
    public final long A00;
    public final C17200uH A01;

    public long BR0(AnonymousClass0D0 r3, AnonymousClass0D0 r4, AnonymousClass0D0 r5) {
        return Long.MAX_VALUE;
    }

    public boolean Bf5() {
        return true;
    }

    public AnonymousClass0D0 BbF(AnonymousClass0D0 r16, AnonymousClass0D0 r17, AnonymousClass0D0 r18, long j) {
        long j2;
        AnonymousClass0D0 r8 = r18;
        C17200uH r5 = this.A01;
        if (j <= 0) {
            j2 = 0;
        } else {
            long j3 = this.A00;
            j2 = j - ((j / j3) * j3);
        }
        long j4 = this.A00;
        AnonymousClass0D0 r6 = r16;
        AnonymousClass0D0 r7 = r17;
        if (j > j4) {
            r8 = r5.BbK(r6, r7, r8, j4);
        }
        return r5.BbF(r6, r7, r8, j2);
    }

    public AnonymousClass0D0 BbK(AnonymousClass0D0 r16, AnonymousClass0D0 r17, AnonymousClass0D0 r18, long j) {
        long j2;
        AnonymousClass0D0 r8 = r18;
        C17200uH r5 = this.A01;
        if (j <= 0) {
            j2 = 0;
        } else {
            long j3 = this.A00;
            j2 = j - ((j / j3) * j3);
        }
        long j4 = this.A00;
        AnonymousClass0D0 r6 = r16;
        AnonymousClass0D0 r7 = r17;
        if (j > j4) {
            r8 = r5.BbK(r6, r7, r8, j4);
        }
        return r5.BbK(r6, r7, r8, j2);
    }

    public AnonymousClass0U8(C17200uH r5) {
        this.A01 = r5;
        this.A00 = ((long) (r5.BQT() + r5.BQx())) * SearchActionVerificationClientService.MS_TO_NS;
    }

    public /* synthetic */ AnonymousClass0D0 BRK(AnonymousClass0D0 r7, AnonymousClass0D0 r8, AnonymousClass0D0 r9) {
        return BbK(r7, r8, r9, Long.MAX_VALUE);
    }
}
