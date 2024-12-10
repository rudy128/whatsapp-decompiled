package com.whatsapp.community.communitysettings.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass1OX;
import X.AnonymousClass3L6;
import X.AnonymousClass3MW;
import X.AnonymousClass4CR;
import X.AnonymousClass4U4;
import X.AnonymousClass8GZ;
import X.C18070vi;
import X.C22801Dg;
import X.C30391dr;
import X.C41111vp;
import X.C41561wd;
import X.C85674Oh;
import X.C88274Za;
import X.C96294nc;
import X.C99874tb;
import com.whatsapp.community.communitysettings.AllowNonAdminGroupCreationManager$updateAllowNonAdminSubgroupCreationValue$1;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class CommunitySettingsViewModel extends AnonymousClass1J2 {
    public int A00;
    public AnonymousClass8GZ A01;
    public AnonymousClass1EC A02;
    public AnonymousClass1EC A03;
    public final C22801Dg A04 = new C22801Dg();
    public final AnonymousClass1M9 A05;
    public final AnonymousClass3L6 A06 = new C96294nc(this, 5);
    public final C41111vp A07 = AnonymousClass3MW.A0n(new C88274Za(AnonymousClass4CR.ADMINS, AnonymousClass00R.A00));
    public final C41111vp A08 = AnonymousClass3MW.A0n(new AnonymousClass4U4(-1, 0, 0));
    public final AnonymousClass10I A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;

    public void A0S() {
        AnonymousClass3MW.A0e(this.A0B).A01(this.A06);
    }

    public final void A0T(boolean z) {
        AnonymousClass4CR r6;
        AnonymousClass4CR r5;
        AnonymousClass1EC r7 = this.A03;
        if (r7 != null) {
            C85674Oh r4 = (C85674Oh) this.A0D.get();
            AnonymousClass1E7 A0E2 = this.A05.A0E(r7);
            if (A0E2 == null || !A0E2.A0e) {
                r6 = AnonymousClass4CR.ADMINS;
            } else {
                r6 = AnonymousClass4CR.EVERYONE;
            }
            C41111vp r8 = this.A07;
            AnonymousClass1OX A002 = C41561wd.A00(this);
            C18070vi.A0f(r8, 3, A002);
            boolean z2 = z;
            if (z) {
                r5 = AnonymousClass4CR.EVERYONE;
            } else {
                r5 = AnonymousClass4CR.ADMINS;
            }
            C88274Za.A01(r8, r5, AnonymousClass00R.A01);
            AnonymousClass3MW.A1X(new C99874tb(r6, r8, CoroutineExceptionHandler.A00), new AllowNonAdminGroupCreationManager$updateAllowNonAdminSubgroupCreationValue$1(r4, r5, r6, r7, r8, (C30391dr) null, z2), A002);
        }
    }

    public CommunitySettingsViewModel(AnonymousClass1M9 r4, AnonymousClass10I r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r5, r6, r4, r7, r8);
        C18070vi.A0l(r9, r10);
        this.A09 = r5;
        this.A0E = r6;
        this.A05 = r4;
        this.A0A = r7;
        this.A0B = r8;
        this.A0C = r9;
        this.A0D = r10;
    }
}
