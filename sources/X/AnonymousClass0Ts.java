package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0Ts  reason: invalid class name */
public final class AnonymousClass0Ts implements C16900tP {
    public final long A00;
    public final C16590sg A01;
    public final Object A02;
    public final Object A03;
    public final AnonymousClass0D0 A04;
    public final AnonymousClass0D0 A05;
    public final AnonymousClass0D0 A06;
    public final AnonymousClass0D0 A07;
    public final C16830tI A08;

    public Object BbD(long j) {
        long j2 = j;
        if (AnonymousClass000.A1Q((j > this.A00 ? 1 : (j == this.A00 ? 0 : -1)))) {
            return this.A03;
        }
        AnonymousClass0D0 BbF = this.A08.BbF(this.A05, this.A07, this.A06, j2);
        int A012 = BbF.A01();
        int i = 0;
        while (i < A012) {
            if (!Float.isNaN(BbF.A00(i))) {
                i++;
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("AnimationVector cannot contain a NaN. ");
                A10.append(BbF);
                A10.append(". Animation: ");
                A10.append(this);
                A10.append(", playTimeNanos: ");
                A10.append(j);
                throw AnonymousClass000.A0m(A10);
            }
        }
        return this.A01.BPR().invoke(BbF);
    }

    public AnonymousClass0D0 BbM(long j) {
        long j2 = j;
        if (!AnonymousClass000.A1Q((j > this.A00 ? 1 : (j == this.A00 ? 0 : -1)))) {
            return this.A08.BbK(this.A05, this.A07, this.A06, j2);
        }
        return this.A04;
    }

    public /* synthetic */ boolean Ben(long j) {
        return AnonymousClass000.A1Q((j > this.A00 ? 1 : (j == this.A00 ? 0 : -1)));
    }

    public boolean Bf5() {
        return this.A08.Bf5();
    }

    public AnonymousClass0Ts(AnonymousClass0D0 r6, C16590sg r7, C16830tI r8, Object obj, Object obj2) {
        AnonymousClass0D0 A012;
        this.A08 = r8;
        this.A01 = r7;
        this.A02 = obj;
        this.A03 = obj2;
        AnonymousClass0D0 r4 = (AnonymousClass0D0) r7.BPS().invoke(obj);
        this.A05 = r4;
        AnonymousClass0D0 r3 = (AnonymousClass0D0) this.A01.BPS().invoke(this.A03);
        this.A07 = r3;
        if (r6 != null) {
            A012 = C03860Kx.A00(r6);
        } else {
            A012 = C03860Kx.A01((AnonymousClass0D0) this.A01.BPS().invoke(obj));
        }
        this.A06 = A012;
        this.A00 = r8.BR0(r4, r3, A012);
        this.A04 = r8.BRK(r4, r3, A012);
    }

    public long BQy() {
        return this.A00;
    }

    public Object BaD() {
        return this.A03;
    }

    public C16590sg Bav() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TargetBasedAnimation: ");
        A10.append(this.A02);
        A10.append(" -> ");
        A10.append(this.A03);
        A10.append(",initial velocity: ");
        A10.append(this.A06);
        A10.append(", duration: ");
        A10.append(this.A00 / SearchActionVerificationClientService.MS_TO_NS);
        A10.append(" ms,animationSpec: ");
        A10.append(this.A08);
        return A10.toString();
    }

    public AnonymousClass0Ts(C16000rY r7, AnonymousClass0D0 r8, C16590sg r9, Object obj, Object obj2) {
        this(r8, r9, r7.CRk(r9), obj, obj2);
    }
}
