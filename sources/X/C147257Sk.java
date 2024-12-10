package X;

import androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1;
import com.whatsapp.bot.onboarding.BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1$1$1;
import com.whatsapp.util.Log;

/* renamed from: X.7Sk  reason: invalid class name and case insensitive filesystem */
public final class C147257Sk implements AnonymousClass1G2 {
    public final /* synthetic */ AnonymousClass1FU A00;
    public final /* synthetic */ AnonymousClass86Z A01;
    public final /* synthetic */ C1598386b A02;
    public final /* synthetic */ AnonymousClass6R9 A03;
    public final /* synthetic */ boolean A04;

    public C147257Sk(AnonymousClass1FU r1, AnonymousClass86Z r2, C1598386b r3, AnonymousClass6R9 r4, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = z;
        this.A03 = r4;
    }

    public /* bridge */ /* synthetic */ Object BJt(Object obj, C30391dr r10) {
        if (obj instanceof C143967Fm) {
            C37581pm A002 = C37561pk.A00(this.A00.getLifecycle());
            AnonymousClass3MX.A1Q(new LifecycleCoroutineScope$launchWhenResumed$1(A002, (C30391dr) null, new BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1$1$1(this.A01, this.A02, this.A03, (C30391dr) null, this.A04)), A002);
        } else {
            if (!(obj instanceof C143937Fj) && !C18070vi.A18(obj, C144007Fq.A00) && !(obj instanceof C143927Fi)) {
                Log.e("Age verification error");
            }
            AnonymousClass86Z r1 = this.A01;
            if (r1 != null) {
                r1.BzU(AnonymousClass6R9.AGE_GATE);
            }
        }
        return C27621Wu.A00;
    }
}
