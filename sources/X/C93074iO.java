package X;

import android.content.Intent;
import com.whatsapp.bot.onboarding.BonsaiOnboardingActivity;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.Jid;

/* renamed from: X.4iO  reason: invalid class name and case insensitive filesystem */
public class C93074iO implements C1598586d {
    public final int A00;
    public final Object A01;

    public C93074iO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C7d(AnonymousClass1E7 r11, Object obj, boolean z) {
        AnonymousClass1FL A1B;
        switch (this.A00) {
            case 0:
                BonsaiOnboardingActivity bonsaiOnboardingActivity = (BonsaiOnboardingActivity) this.A01;
                C18070vi.A0d(obj, 2);
                if (r11 == null) {
                    return;
                }
                if (obj instanceof C75833lp) {
                    BonsaiOnboardingActivity.A03(bonsaiOnboardingActivity, r11, 1);
                    return;
                } else if (obj instanceof C75813ln) {
                    BonsaiOnboardingActivity.A03(bonsaiOnboardingActivity, r11, 2);
                    return;
                } else {
                    return;
                }
            case 1:
                AnonymousClass3tC r1 = (AnonymousClass3tC) this.A01;
                C18070vi.A0d(r1, 0);
                AnonymousClass3VB r0 = r1.A07;
                if (z) {
                    r0.A09.A0F((Object) null);
                    return;
                }
                return;
            case 2:
                AnonymousClass4aY r02 = (AnonymousClass4aY) this.A01;
                if (z) {
                    C108865cQ r3 = r02.A2Q;
                    r3.startActivityForResult(AnonymousClass1LU.A0f(r3.getActivityNullable(), r02.A3R, AnonymousClass3MY.A0f()), 476);
                    return;
                }
                return;
            case 3:
                AnonymousClass4aY r4 = (AnonymousClass4aY) this.A01;
                C1416576l r12 = (C1416576l) obj;
                if (r12 instanceof C75853lr) {
                    C75853lr r122 = (C75853lr) r12;
                    AnonymousClass3US r03 = r4.A1f;
                    if (r03 != null) {
                        r03.A0T();
                    }
                    if (r122.A03) {
                        C72463Mc.A1C(r4);
                        AnonymousClass4aY.A0p(r4);
                    }
                    if (r122.A01) {
                        AnonymousClass4aY.A0o(r4);
                    }
                    if (r122.A02) {
                        AnonymousClass4aY.A16(r4);
                    }
                    String str = r122.A00;
                    if (str != null) {
                        r4.A1V.A0T(r4.A3R, (Integer) null, r4.A6K, str, (String) null, r4.A6Q);
                        return;
                    }
                    return;
                } else if (r12 instanceof C75843lq) {
                    C75843lq r123 = (C75843lq) r12;
                    AnonymousClass1FY A0P = AnonymousClass3MW.A0P(r4);
                    if (r123.A03) {
                        A0P.startActivity(AnonymousClass1LU.A1D(A0P, r123.A00, 1, true, true));
                    }
                    if (r123.A02) {
                        ((AnonymousClass700) r4.A62.get()).A02(A0P, r123.A00, r123.A01);
                        return;
                    }
                    return;
                } else if (r12 instanceof C75813ln) {
                    AnonymousClass4aY.A0t(r4);
                    return;
                } else {
                    return;
                }
            default:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A01;
                if (r11 == null) {
                    return;
                }
                if (obj instanceof C75803lm) {
                    AnonymousClass1FL A1B2 = conversationsFragment.A1B();
                    if (A1B2 != null) {
                        AnonymousClass1BI A002 = AnonymousClass1E7.A00(r11);
                        conversationsFragment.A3c.get();
                        ConversationsFragment.A0C(AnonymousClass1LU.A0h(A1B2, A002, AnonymousClass00R.A00, C17890vO.A0Q(), 20, 6), conversationsFragment);
                        return;
                    }
                    return;
                } else if (obj instanceof C75813ln) {
                    conversationsFragment.A2f.CGF(new C98554rL(conversationsFragment, 30));
                    return;
                } else if ((obj instanceof C75823lo) && (A1B = conversationsFragment.A1B()) != null) {
                    Jid A0g = AnonymousClass3MW.A0g(r11);
                    Intent A06 = AnonymousClass3MZ.A06(conversationsFragment.A3c);
                    A06.setClassName(A1B.getPackageName(), "com.whatsapp.bot.metaai.voice.MetaAiVoiceMultimodalComposerActivity");
                    A06.putExtra("extra_chat_jid", C22971Dz.A06(A0g));
                    conversationsFragment.A1k(A06);
                    return;
                } else {
                    return;
                }
        }
    }
}
