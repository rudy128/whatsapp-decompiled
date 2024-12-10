package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1;
import com.whatsapp.bot.onboarding.AiNotAvailableBottomSheet;
import com.whatsapp.bot.onboarding.BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$1;
import com.whatsapp.bot.onboarding.BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1;
import com.whatsapp.dobverification.DosaRepository;

/* renamed from: X.1Pj  reason: invalid class name and case insensitive filesystem */
public final class C25721Pj {
    public final C19880zA A00;
    public final AnonymousClass1KB A01;
    public final C18000vb A02;
    public final DosaRepository A03;
    public final AnonymousClass18K A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final C18030ve A09;
    public final AnonymousClass1LU A0A;

    public C25721Pj(C19880zA r2, AnonymousClass1KB r3, C18000vb r4, DosaRepository dosaRepository, C18030ve r6, AnonymousClass18K r7, AnonymousClass1LU r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r7, 2);
        C18070vi.A0d(r9, 3);
        C18070vi.A0d(r4, 4);
        C18070vi.A0d(r10, 5);
        C18070vi.A0d(r11, 6);
        C18070vi.A0d(r12, 7);
        C18070vi.A0d(r6, 8);
        C18070vi.A0d(r2, 9);
        C18070vi.A0d(r8, 10);
        C18070vi.A0d(dosaRepository, 11);
        this.A01 = r3;
        this.A04 = r7;
        this.A06 = r9;
        this.A02 = r4;
        this.A05 = r10;
        this.A07 = r11;
        this.A08 = r12;
        this.A09 = r6;
        this.A00 = r2;
        this.A0A = r8;
        this.A03 = dosaRepository;
    }

    public static final void A00(Bundle bundle, AnonymousClass86Z r2, C1598386b r3, C25721Pj r4, AnonymousClass6RD r5, String str) {
        AnonymousClass6R9 r0;
        C18070vi.A0d(str, 4);
        C18070vi.A0d(bundle, 5);
        if (!str.equals("CUSTOM_TOS_UI_REQUEST_KEY")) {
            if (r2 != null) {
                r0 = AnonymousClass6R9.NOT_ACCEPTED;
            } else {
                return;
            }
        } else if (bundle.getBoolean("CUSTOM_TOS_UI_ACCEPT_RESULT_KEY")) {
            if (r3 != null) {
                r3.BzV(true);
            }
            if (r2 != null) {
                r0 = AnonymousClass6R9.JUST_ACCEPTED;
            } else {
                return;
            }
        } else if (bundle.getBoolean("CUSTOM_TOS_UI_DISMISS_RESULT_KEY")) {
            Object obj = r4.A05.get();
            C18070vi.A0X(obj);
            ((C1408073d) obj).A06(r2, r3, r5);
            return;
        } else {
            return;
        }
        r2.BzU(r0);
    }

    public void A03(AnonymousClass1FU r13, AnonymousClass86Z r14, C1598286a r15, C1598386b r16, C134526qj r17, AnonymousClass6RD r18, Integer num, boolean z) {
        AnonymousClass1FU r4 = r13;
        C18070vi.A0d(r13, 0);
        AnonymousClass18K r2 = this.A04;
        C47192Hl r1 = new C47192Hl();
        r1.A02 = 52;
        Integer num2 = num;
        r1.A05 = num2;
        r1.A0E = C50542Uv.A00();
        r2.CC7(r1);
        AnonymousClass00H r12 = this.A06;
        AnonymousClass86Z r5 = r14;
        if (((AnonymousClass1UD) r12.get()).A08()) {
            C1598386b r7 = r16;
            if (z) {
                if (r16 != null) {
                    r7.BzV(false);
                }
            } else if (((AnonymousClass1UD) r12.get()).A06()) {
                A01(r4, r5, r15, r7, this, r17, r18, num2);
                return;
            } else {
                if (r14 != null) {
                    r14.BzU(AnonymousClass6R9.SKIPPED);
                }
                r13.CMl(new AiNotAvailableBottomSheet());
                return;
            }
        }
        if (r14 != null) {
            r14.BzU(AnonymousClass6R9.SKIPPED);
        }
    }

    public static final void A01(AnonymousClass1FU r5, AnonymousClass86Z r6, C1598286a r7, C1598386b r8, C25721Pj r9, C134526qj r10, AnonymousClass6RD r11, Integer num) {
        C157287wg r4 = new C157287wg(r5, r6, r7, r8, r9, r10, r11, num);
        AnonymousClass00H r2 = r9.A05;
        if (((C1408073d) r2.get()).A0A(r11)) {
            r4.invoke();
            return;
        }
        r9.A01.A07(0, 2131891797);
        C1408073d r22 = (C1408073d) r2.get();
        AnonymousClass7DD r62 = new AnonymousClass7DD(r22, new C157187vw(r9, r11, r4), 0);
        long j = AnonymousClass6RZ.INVOKE_TOS.noticeId;
        ((C131876lo) r22.A00.get()).A00(r62, j, AnonymousClass6RZ.AGENT_TOS.noticeId, AnonymousClass6RZ.META_AI_SHORTCUT_TOS.noticeId, AnonymousClass6RZ.IMAGINE_ME_NUX.noticeId, AnonymousClass6RZ.IMAGINE_ME_TOS.noticeId, AnonymousClass6RZ.AI_STUDIO_TOS.noticeId, AnonymousClass6RZ.META_AI_SHORTCUT_BR_TOS.noticeId, j);
    }

    public static final void A02(AnonymousClass1FU r12, AnonymousClass86Z r13, C1598386b r14, AnonymousClass6R9 r15, C25721Pj r16, boolean z) {
        C25721Pj r11 = r16;
        C18030ve r0 = r11.A09;
        C18040vf r2 = C18040vf.A02;
        AnonymousClass86Z r8 = r13;
        C1598386b r9 = r14;
        AnonymousClass6R9 r10 = r15;
        boolean z2 = z;
        if (C18020vd.A05(r2, r0, 10248)) {
            DosaRepository dosaRepository = r11.A03;
            if (C18020vd.A05(r2, dosaRepository.A04, 10248) && !dosaRepository.A02().getBoolean("dob_verified", false)) {
                AnonymousClass1FU r7 = r12;
                C37581pm A002 = C37561pk.A00(r12.getLifecycle());
                BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1 bonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1 = new BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1(r7, r8, r9, r10, r11, (C30391dr) null, z2);
                AnonymousClass1OR r5 = AnonymousClass1OR.A00;
                Integer num = AnonymousClass00R.A00;
                C30511e4 A022 = C30451dy.A02(num, r5, bonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1, A002);
                C37581pm A003 = C37561pk.A00(r7.getLifecycle());
                C30451dy.A02(num, r5, new LifecycleCoroutineScope$launchWhenResumed$1(A003, (C30391dr) null, new BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$1((C30391dr) null, A022)), A003);
                Intent className = new Intent().setClassName(r7.getPackageName(), "com.whatsapp.pancake.dosa.DosaActivity");
                C18070vi.A0X(className);
                r7.startActivity(className);
                return;
            }
        }
        if (r14 != null) {
            r14.BzV(z2);
        }
        if (r8 != null) {
            r8.BzU(r15);
        }
    }

    public void A04(Integer num, boolean z) {
        AnonymousClass18K r2 = this.A04;
        C47192Hl r1 = new C47192Hl();
        int i = 69;
        if (z) {
            i = 33;
        }
        r1.A02 = Integer.valueOf(i);
        r1.A05 = num;
        r1.A0E = C50542Uv.A00();
        r2.CC7(r1);
    }
}
