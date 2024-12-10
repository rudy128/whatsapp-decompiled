package X;

import org.json.JSONObject;

/* renamed from: X.Cbe  reason: case insensitive filesystem */
public final class C25243Cbe {
    public BTI A00;
    public C24328BzP A01;
    public JSONObject A02;
    public final C25770Clh A03;
    public final Boolean A04;
    public final Double A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final Integer A0K;
    public final boolean A0L;
    public final boolean A0M;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25243Cbe) {
                C25243Cbe cbe = (C25243Cbe) obj;
                if (!C18070vi.A18(this.A0D, cbe.A0D) || !C18070vi.A18(this.A0F, cbe.A0F) || !C18070vi.A18(this.A0E, cbe.A0E) || !C18070vi.A18(this.A03, cbe.A03) || !C18070vi.A18(this.A05, cbe.A05) || this.A0M != cbe.A0M || this.A0L != cbe.A0L || this.A01 != cbe.A01 || !C18070vi.A18(this.A00, cbe.A00) || !C18070vi.A18(this.A02, cbe.A02) || this.A0J != cbe.A0J || this.A0I != cbe.A0I || this.A0H != cbe.A0H || !C18070vi.A18(this.A0C, cbe.A0C) || !C18070vi.A18(this.A06, cbe.A06) || !C18070vi.A18(this.A04, cbe.A04) || !C18070vi.A18(this.A09, cbe.A09) || !C18070vi.A18(this.A0B, cbe.A0B) || !C18070vi.A18(this.A08, cbe.A08) || !C18070vi.A18(this.A0A, cbe.A0A) || this.A0G != cbe.A0G || !C18070vi.A18(this.A07, cbe.A07) || !C18070vi.A18(this.A0K, cbe.A0K)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C25243Cbe(BTI bti, C24328BzP bzP, C25770Clh clh, Boolean bool, Double d, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C18070vi.A0d(bzP, 8);
        this.A0D = str;
        this.A0F = str2;
        this.A0E = str3;
        this.A03 = clh;
        this.A05 = d;
        this.A0M = z;
        this.A0L = z2;
        this.A01 = bzP;
        this.A00 = bti;
        this.A02 = jSONObject;
        this.A0J = z3;
        this.A0I = z4;
        this.A0H = z5;
        this.A0C = str4;
        this.A06 = num;
        this.A04 = bool;
        this.A09 = num2;
        this.A0B = num3;
        this.A08 = num4;
        this.A0A = num5;
        this.A0G = z6;
        this.A07 = num6;
        this.A0K = num7;
    }

    public int hashCode() {
        return ((AnonymousClass0DV.A00(BE6.A06((((((((((BE6.A06((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00((((((AnonymousClass000.A0N(this.A01, AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass000.A0N(this.A03, C17890vO.A02(this.A0E, C17890vO.A02(this.A0F, C17900vP.A00(this.A0D) * 31))) + AnonymousClass001.A0k(this.A05)) * 31, this.A0M), this.A0L)) + 1237) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + AnonymousClass001.A0k(this.A02)) * 31, this.A0J), this.A0I), this.A0H) + 1237) * 31, C17900vP.A00(this.A0C)) + AnonymousClass001.A0k(this.A06)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A09)) * 31) + AnonymousClass001.A0k(this.A0B)) * 31) + AnonymousClass001.A0k(this.A08)) * 31, AnonymousClass001.A0k(this.A0A)), this.A0G) + AnonymousClass001.A0k(this.A07)) * 31) + C17880vN.A02(this.A0K);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LiveEditingInitializationParameters(effectId=");
        A10.append(this.A0D);
        A10.append(", revisionId=");
        A10.append(this.A0F);
        A10.append(", profileName=");
        A10.append(this.A0E);
        A10.append(", networkConfig=");
        A10.append(this.A03);
        A10.append(", initialTimeout=");
        A10.append(this.A05);
        A10.append(", isParametricsEnabled=");
        A10.append(this.A0M);
        A10.append(", isEffectPrewarmMode=");
        A10.append(this.A0L);
        A10.append(", liveEditingMemoryMode=");
        A10.append(this.A01);
        C108975cc.A15(A10, ", forceNoMSAA=");
        A10.append(", qualityOverride=");
        A10.append(this.A00);
        A10.append(", initialArEffectConfig=");
        A10.append(this.A02);
        A10.append(", useAle=");
        A10.append(this.A0J);
        A10.append(", isM6Config=");
        A10.append(this.A0I);
        A10.append(", isBackgroundRenderingPrewarmEnabled=");
        A10.append(this.A0H);
        C108975cc.A15(A10, ", disableLoaderIfRenderedFromCache=");
        A10.append(", deliverySpecId=");
        A10.append(this.A0C);
        C108975cc.A17(A10, ", deliverySpecOverride=");
        A10.append(", atomVersionType=");
        A10.append(this.A06);
        A10.append(", hideLoadingIndictor=");
        A10.append(this.A04);
        A10.append(", highPriRamCacheSize=");
        A10.append(this.A09);
        A10.append(", lowPriRamCacheSize=");
        A10.append(this.A0B);
        A10.append(", highPriDiskCacheSize=");
        A10.append(this.A08);
        A10.append(", lowPriDiskCacheSize=");
        A10.append(this.A0A);
        AnonymousClass000.A1G(A10, ", lowMemoryFallbackEvents=");
        A10.append(", aleOperationsOnBackgroundThread=");
        A10.append(this.A0G);
        A10.append(", criticalMemoryThreshold=");
        A10.append(this.A07);
        A10.append(", avatarUpdateMemoryThreshold=");
        return AnonymousClass001.A1F(this.A0K, A10);
    }
}
