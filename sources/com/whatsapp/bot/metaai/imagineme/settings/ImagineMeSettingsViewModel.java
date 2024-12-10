package com.whatsapp.bot.metaai.imagineme.settings;

import X.AnonymousClass000;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass2JU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.C108965cb;
import X.C1408073d;
import X.C18070vi;
import X.C38731rn;
import X.C41731wy;
import com.whatsapp.imagineme.ImagineMeOnboardingRequester;

public final class ImagineMeSettingsViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DS A02;
    public final AnonymousClass1DS A03;
    public final AnonymousClass1DS A04;
    public final AnonymousClass1DS A05;
    public final AnonymousClass1DS A06;
    public final AnonymousClass1KB A07;
    public final C38731rn A08;
    public final C1408073d A09;
    public final ImagineMeOnboardingRequester A0A;
    public final AnonymousClass2JU A0B;
    public final C41731wy A0C;
    public final C41731wy A0D;
    public final C41731wy A0E;
    public final C41731wy A0F;
    public final AnonymousClass1DT A0G;
    public final AnonymousClass1DT A0H;
    public final AnonymousClass1DT A0I;

    public static final void A00(ImagineMeSettingsViewModel imagineMeSettingsViewModel) {
        AnonymousClass1DT r1;
        int i;
        boolean A012 = imagineMeSettingsViewModel.A08.A01();
        AnonymousClass1DT r12 = imagineMeSettingsViewModel.A0I;
        if (A012) {
            AnonymousClass3MX.A1J(r12, 2131892185);
            AnonymousClass3MX.A1J(imagineMeSettingsViewModel.A0G, 0);
            r1 = imagineMeSettingsViewModel.A0H;
            i = 2131892183;
        } else {
            AnonymousClass3MX.A1J(r12, 2131892186);
            AnonymousClass3MX.A1J(imagineMeSettingsViewModel.A0G, 8);
            r1 = imagineMeSettingsViewModel.A0H;
            i = 2131892184;
        }
        AnonymousClass3MX.A1J(r1, i);
    }

    public ImagineMeSettingsViewModel(AnonymousClass1KB r3, C38731rn r4, C1408073d r5, ImagineMeOnboardingRequester imagineMeOnboardingRequester, AnonymousClass2JU r7) {
        C18070vi.A0o(r3, r5, r4);
        C18070vi.A0d(r7, 5);
        this.A07 = r3;
        this.A09 = r5;
        this.A08 = r4;
        this.A0A = imagineMeOnboardingRequester;
        this.A0B = r7;
        AnonymousClass1DT A0D2 = C108965cb.A0D(2131892186);
        this.A0I = A0D2;
        this.A06 = A0D2;
        AnonymousClass1DT A0M = AnonymousClass3MW.A0M(AnonymousClass3MY.A0g());
        this.A0G = A0M;
        this.A01 = A0M;
        AnonymousClass1DT A0D3 = C108965cb.A0D(2131892184);
        this.A0H = A0D3;
        this.A02 = A0D3;
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A0F = A0o;
        this.A05 = A0o;
        C41731wy A0o2 = AnonymousClass3MW.A0o();
        this.A0E = A0o2;
        this.A04 = A0o2;
        C41731wy r0 = new C41731wy(AnonymousClass000.A0h());
        this.A0D = r0;
        this.A03 = r0;
        C41731wy A0o3 = AnonymousClass3MW.A0o();
        this.A0C = A0o3;
        this.A00 = A0o3;
    }
}
