package X;

import com.whatsapp.util.Log;

/* renamed from: X.72E  reason: invalid class name */
public final class AnonymousClass72E {
    public AnonymousClass6Qj A00;
    public Long A01;
    public Runnable A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final C18100vl A08 = AnonymousClass1DF.A01(new C153037os(this));

    private final void A00(long j) {
        C448825d r0;
        synchronized (this) {
            if (j == 0) {
                Runnable runnable = this.A02;
                if (runnable != null) {
                    AnonymousClass3MX.A0x(this.A07).CEz(runnable);
                }
                r0 = null;
            } else if (this.A02 == null) {
                long A0K = j + C72453Mb.A0K(this.A08);
                this.A05.get();
                r0 = AnonymousClass3MX.A0x(this.A07).CGv(new C21448AkF(this, 26), Math.max(0, A0K - System.currentTimeMillis()));
            }
            this.A02 = r0;
        }
    }

    public static final void A01(AnonymousClass72E r2, long j) {
        synchronized (r2) {
            C17880vN.A1D(C17890vO.A0A(((C38731rn) r2.A04.get()).A01), "meta_ai_premium_model_quota_exceeding_ts", j);
            r2.A01 = Long.valueOf(j);
            r2.A00(j);
        }
    }

    public final AnonymousClass6Qj A03() {
        AnonymousClass6Qj r1;
        synchronized (this) {
            r1 = this.A00;
            if (r1 == null) {
                String str = "";
                String string = C108995ce.A0G(this.A04).getString("meta_ai_model_tier_selection", str);
                if (string != null) {
                    str = string;
                }
                try {
                    r1 = AnonymousClass6Qj.valueOf(str);
                    this.A00 = r1;
                    C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.premium.MetaAiModelTier");
                } catch (IllegalArgumentException e) {
                    Log.e("MetaAiPremiumModelManager/getMetaAiModelTier/invalid model", e);
                    r1 = AnonymousClass6Qj.BASE;
                }
            }
        }
        return r1;
    }

    public final boolean A04() {
        long longValue;
        synchronized (this) {
            if (this.A01 == null) {
                long A052 = C17890vO.A05(C108995ce.A0G(this.A04), "meta_ai_premium_model_quota_exceeding_ts");
                Long valueOf = Long.valueOf(A052);
                this.A01 = valueOf;
                if (valueOf != null) {
                    A00(A052);
                }
            }
            Long l = this.A01;
            C18070vi.A0z(l, "null cannot be cast to non-null type kotlin.Long");
            longValue = l.longValue();
        }
        return AnonymousClass000.A1O((longValue > 0 ? 1 : (longValue == 0 ? 0 : -1)));
    }

    public final C20944Aby A02() {
        AnonymousClass9IU r1;
        if (!AnonymousClass3MW.A0X(this.A06).A0E()) {
            return null;
        }
        int ordinal = A03().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw AnonymousClass3MW.A14();
            } else if (!A04()) {
                r1 = AnonymousClass9IU.LLAMA_PROD_PREMIUM;
                return new C20944Aby(r1, (Integer) null);
            }
        }
        r1 = AnonymousClass9IU.LLAMA_PROD;
        return new C20944Aby(r1, (Integer) null);
    }

    public AnonymousClass72E(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        this.A04 = r2;
        this.A06 = r3;
        this.A05 = r4;
        this.A07 = r5;
        this.A03 = r6;
    }
}
