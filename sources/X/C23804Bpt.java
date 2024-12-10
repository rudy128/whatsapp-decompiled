package X;

import com.whatsapp.areffects.arclass.ArClassManager;
import com.whatsapp.areffects.util.ArEffectsGatingUtil;

/* renamed from: X.Bpt  reason: case insensitive filesystem */
public final class C23804Bpt extends C88544a4 {
    public final C23852Br9 A00 = new C23852Br9();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23804Bpt(ArClassManager arClassManager, C107855aj r3, C92384hD r4, ArEffectsGatingUtil arEffectsGatingUtil, AnonymousClass11P r6, C18030ve r7, AnonymousClass18K r8) {
        super(arClassManager, r3, r4, arEffectsGatingUtil, r6, r7, r8);
        C18070vi.A0d(arEffectsGatingUtil, 5);
    }

    public void A0K() {
        this.A00.A00 = false;
    }

    public void A0L() {
        this.A00.A06 = 0;
    }

    public boolean A0i(Integer num) {
        C18070vi.A0d(num, 0);
        if (!super.A0i(num)) {
            return false;
        }
        try {
            C23852Br9 br9 = this.A00;
            String str = br9.A0K;
            Integer num2 = AnonymousClass00R.A00;
            C88544a4.A01(num2, num, str, "effectInstanceId");
            C88544a4.A01(num2, num, br9.A0N, "effectTier");
            C88544a4.A01(num2, num, br9.A0C, "effectEmtT");
            C88544a4.A01(num2, num, br9.A06, "flmConsentType");
            C88544a4.A01(num2, num, br9.A00, "flmConsentRequested");
            C88544a4.A01(num2, num, br9.A0H, "flmConsentDurationT");
            Long l = br9.A0A;
            Integer num3 = AnonymousClass00R.A01;
            C88544a4.A01(num3, num, l, "effectEftT");
            C88544a4.A01(num3, num, br9.A0I, "deliveryOperationId");
            Long l2 = br9.A0E;
            Integer num4 = AnonymousClass00R.A0C;
            C88544a4.A01(num4, num, l2, "effectEttiT");
            C88544a4.A01(num4, num, br9.A0B, "effectEitT");
            return true;
        } catch (IllegalStateException e) {
            e.getMessage();
            return false;
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass184 A03() {
        return this.A00;
    }

    public Integer A04() {
        return this.A00.A01;
    }

    public Integer A05() {
        return this.A00.A04;
    }

    public Integer A06() {
        return this.A00.A07;
    }

    public Integer A07() {
        return this.A00.A05;
    }

    public Long A08() {
        return this.A00.A0A;
    }

    public Long A09() {
        return this.A00.A0C;
    }

    public Long A0A() {
        return this.A00.A0F;
    }

    public Long A0B() {
        return this.A00.A0E;
    }

    public Long A0C() {
        return this.A00.A08;
    }

    public Long A0D() {
        return this.A00.A0D;
    }

    public Long A0E() {
        return this.A00.A0G;
    }

    public String A0F() {
        return this.A00.A0J;
    }

    public String A0G() {
        return this.A00.A0M;
    }

    public String A0H() {
        return this.A00.A0O;
    }

    public void A0I() {
        this.A00.A0J = "";
    }

    public void A0J() {
        this.A00.A0H = 0L;
    }

    public void A0M() {
        this.A00.A0C = 0L;
    }

    public void A0N(int i) {
        this.A00.A01 = Integer.valueOf(i);
    }

    public void A0O(int i) {
        this.A00.A04 = Integer.valueOf(i);
    }

    public void A0P(int i) {
        this.A00.A07 = Integer.valueOf(i);
    }

    public void A0Q(int i) {
        this.A00.A05 = Integer.valueOf(i);
    }

    public void A0R(int i) {
        this.A00.A02 = Integer.valueOf(i);
    }

    public void A0S(int i) {
        this.A00.A03 = Integer.valueOf(i);
    }

    public void A0U(long j) {
        this.A00.A08 = Long.valueOf(j);
    }

    public void A0V(long j) {
        this.A00.A0A = Long.valueOf(j);
    }

    public void A0W(long j) {
        this.A00.A0B = Long.valueOf(j);
    }

    public void A0X(long j) {
        this.A00.A0F = Long.valueOf(j);
    }

    public void A0Y(long j) {
        this.A00.A0E = Long.valueOf(j);
    }

    public void A0Z(long j) {
        this.A00.A0G = Long.valueOf(j);
    }

    public void A0a(long j) {
        this.A00.A09 = Long.valueOf(j);
    }

    public void A0b(long j) {
        this.A00.A0D = Long.valueOf(j);
    }

    public void A0c(String str) {
        this.A00.A0I = str;
    }

    public void A0d(String str) {
        this.A00.A0K = str;
    }

    public void A0e(String str) {
        this.A00.A0M = str;
    }

    public void A0f(String str) {
        this.A00.A0N = str;
    }

    public void A0g(String str) {
        this.A00.A0O = str;
    }

    public void A0h(String str) {
        this.A00.A0L = str;
    }

    public boolean A0j(boolean z) {
        boolean z2;
        if (super.A0j(z)) {
            try {
                C23852Br9 br9 = this.A00;
                boolean z3 = true;
                C88544a4.A02(br9.A0K, "effectInstanceId", true);
                C88544a4.A02(br9.A0N, "effectTier", true);
                C88544a4.A02(br9.A0C, "effectEmtT", true);
                C88544a4.A02(br9.A06, "flmConsentType", true);
                C88544a4.A02(br9.A00, "flmConsentRequested", true);
                C88544a4.A02(br9.A0H, "flmConsentDurationT", true);
                Integer num = br9.A04;
                boolean z4 = true;
                if (num == null) {
                    z4 = false;
                    if (br9.A0B == null) {
                        z2 = false;
                        if (br9.A0A == null) {
                            z3 = false;
                        }
                        C88544a4.A02(br9.A0A, "effectEftT", z3);
                        C88544a4.A02(br9.A0I, "deliveryOperationId", z3);
                        C88544a4.A02(br9.A0E, "effectEttiT", z2);
                        C88544a4.A02(br9.A0B, "effectEitT", z2);
                        C88544a4.A02(br9.A0G, "effectTotalLoadingT", z4);
                        C88544a4.A02(num, "effectLoadingResultType", z4);
                        return true;
                    }
                }
                z2 = true;
                C88544a4.A02(br9.A0A, "effectEftT", z3);
                C88544a4.A02(br9.A0I, "deliveryOperationId", z3);
                C88544a4.A02(br9.A0E, "effectEttiT", z2);
                C88544a4.A02(br9.A0B, "effectEitT", z2);
                C88544a4.A02(br9.A0G, "effectTotalLoadingT", z4);
                C88544a4.A02(num, "effectLoadingResultType", z4);
                return true;
            } catch (IllegalStateException e) {
                e.getMessage();
            }
        }
        return false;
    }
}
