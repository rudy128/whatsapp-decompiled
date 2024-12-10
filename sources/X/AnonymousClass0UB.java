package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0UB  reason: invalid class name */
public final class AnonymousClass0UB implements C17200uH {
    public AnonymousClass0D0 A00;
    public AnonymousClass0D0 A01;
    public final int A02;
    public final Map A03;

    public /* synthetic */ long BR0(AnonymousClass0D0 r5, AnonymousClass0D0 r6, AnonymousClass0D0 r7) {
        return ((long) (0 + this.A02)) * SearchActionVerificationClientService.MS_TO_NS;
    }

    public /* synthetic */ AnonymousClass0D0 BRK(AnonymousClass0D0 r9, AnonymousClass0D0 r10, AnonymousClass0D0 r11) {
        return BbK(r9, r10, r11, ((long) (0 + this.A02)) * SearchActionVerificationClientService.MS_TO_NS);
    }

    public AnonymousClass0UB(Map map, int i) {
        this.A03 = map;
        this.A02 = i;
    }

    public static final long A00(C17200uH r5, long j) {
        return C28851b7.A05(j - ((long) r5.BQT()), 0, (long) r5.BQx());
    }

    public int BQT() {
        return 0;
    }

    public int BQx() {
        return this.A02;
    }

    public AnonymousClass0D0 BbF(AnonymousClass0D0 r11, AnonymousClass0D0 r12, AnonymousClass0D0 r13, long j) {
        int A002 = (int) A00(this, j / SearchActionVerificationClientService.MS_TO_NS);
        Map map = this.A03;
        Integer valueOf = Integer.valueOf(A002);
        if (map.containsKey(valueOf)) {
            return (AnonymousClass0D0) ((AnonymousClass1D6) AnonymousClass1D7.A06(valueOf, map)).A06();
        }
        int i = this.A02;
        if (A002 >= i) {
            return r12;
        }
        if (A002 <= 0) {
            return r11;
        }
        C16020ra r2 = C02980Gd.A02;
        Iterator A15 = AnonymousClass000.A15(map);
        int i2 = 0;
        AnonymousClass0D0 r6 = r11;
        int i3 = 0;
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            int A0M = AnonymousClass000.A0M(A16.getKey());
            AnonymousClass1D6 r0 = (AnonymousClass1D6) A16.getValue();
            if (A002 > A0M && A0M >= i3) {
                r6 = (AnonymousClass0D0) r0.A06();
                r2 = (C16020ra) r0.A07();
                i3 = A0M;
            } else if (A002 < A0M && A0M <= i) {
                r12 = (AnonymousClass0D0) r0.A06();
                i = A0M;
            }
        }
        float CPf = r2.CPf(((float) (A002 - i3)) / ((float) (i - i3)));
        if (this.A00 == null) {
            this.A00 = C03860Kx.A01(r11);
            this.A01 = C03860Kx.A01(r11);
        }
        int A012 = r6.A01();
        while (true) {
            if (i2 < A012) {
                AnonymousClass0D0 r3 = this.A00;
                if (r3 == null) {
                    break;
                }
                r3.A04(i2, AnonymousClass000.A00(r6.A00(i2), 1.0f - CPf, r12.A00(i2), CPf));
                i2++;
            } else {
                AnonymousClass0D0 r1 = this.A00;
                if (r1 != null) {
                    return r1;
                }
            }
        }
        C18070vi.A11("valueVector");
        throw null;
    }

    public AnonymousClass0D0 BbK(AnonymousClass0D0 r14, AnonymousClass0D0 r15, AnonymousClass0D0 r16, long j) {
        long A002 = A00(this, j / SearchActionVerificationClientService.MS_TO_NS);
        AnonymousClass0D0 r10 = r16;
        if (A002 <= 0) {
            return r16;
        }
        AnonymousClass0D0 BbF = BbF(r14, r15, r10, (A002 - 1) * SearchActionVerificationClientService.MS_TO_NS);
        AnonymousClass0D0 BbF2 = BbF(r14, r15, r10, A002 * SearchActionVerificationClientService.MS_TO_NS);
        if (this.A00 == null) {
            this.A00 = C03860Kx.A01(r14);
            this.A01 = C03860Kx.A01(r14);
        }
        int A012 = BbF.A01();
        int i = 0;
        while (true) {
            if (i < A012) {
                AnonymousClass0D0 r2 = this.A01;
                if (r2 == null) {
                    break;
                }
                r2.A04(i, (BbF.A00(i) - BbF2.A00(i)) * 1000.0f);
                i++;
            } else {
                AnonymousClass0D0 r0 = this.A01;
                if (r0 != null) {
                    return r0;
                }
            }
        }
        C18070vi.A11("velocityVector");
        throw null;
    }

    public /* synthetic */ boolean Bf5() {
        return false;
    }
}
