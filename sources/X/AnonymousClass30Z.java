package X;

import com.whatsapp.HomeActivity;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.conversationslist.InteropViewModel;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.30Z  reason: invalid class name */
public class AnonymousClass30Z implements C25231Nk {
    public final int A00;
    public final Object A01;

    public AnonymousClass30Z(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BqG(AnonymousClass1BI r5) {
        InteropViewModel interopViewModel;
        switch (this.A00) {
            case 0:
                ((C23281Fk) this.A01).A4h();
                return;
            case 1:
                ((C40631v1) this.A01).A00.A0U(r5);
                return;
            case 2:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A01;
                conversationsFragment.A0r.A0J(new C70633Bw(this, r5, 14));
                if ((conversationsFragment.A3r || conversationsFragment.A3s) && (interopViewModel = conversationsFragment.A1h) != null) {
                    interopViewModel.A0T();
                }
                if (((C38501rO) conversationsFragment.A3I.get()).A08()) {
                    conversationsFragment.A1k.A0V(new C99154sM(conversationsFragment, 0));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BqH(AnonymousClass1BI r4, boolean z) {
        if (2 - this.A00 == 0) {
            ((ConversationsFragment) this.A01).A0r.A0J(new AnonymousClass7RF(this, r4, 38, z));
        }
    }

    public /* synthetic */ void BqN(int i) {
        if (2 - this.A00 == 0) {
            ((ConversationsFragment) this.A01).A0r.CGP(new AnonymousClass7RP(this, i, 48));
        }
    }

    public void BqO() {
        AnonymousClass1KB r4;
        Runnable runnable;
        switch (this.A00) {
            case 0:
                HomeActivity homeActivity = (HomeActivity) this.A01;
                homeActivity.A4h();
                if (C18020vd.A05(C18040vf.A02, homeActivity.A0E, 1266) && ((C25161Nd) homeActivity.A1H.get()).A03() == 0) {
                    r4 = homeActivity.A05;
                    runnable = new C70603Bt(homeActivity, 16);
                    break;
                } else {
                    return;
                }
                break;
            case 1:
                C40401ue r1 = ((C40631v1) this.A01).A00;
                r4 = r1.A03;
                runnable = new C98764rg((Object) r1, 14);
                break;
            case 2:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A01;
                if (conversationsFragment.A0s.A0N()) {
                    long j = AnonymousClass11Q.A01(conversationsFragment.A1n).getLong("critical_bootstrap_completed_timestamp", -1);
                    if (j != -1) {
                        long currentTimeMillis = System.currentTimeMillis() - j;
                        if (currentTimeMillis >= 0 && currentTimeMillis <= 120000 && conversationsFragment.A4U.getAndSet(true)) {
                            AtomicBoolean atomicBoolean = conversationsFragment.A4V;
                            if (!atomicBoolean.get()) {
                                atomicBoolean.set(conversationsFragment.A4A.postDelayed(new C98554rL(this, 43), 1500));
                            } else {
                                return;
                            }
                        }
                    }
                    r4 = conversationsFragment.A0r;
                    runnable = new C98554rL(conversationsFragment, 42);
                    break;
                } else {
                    conversationsFragment.A0r.A0J(new C98554rL(conversationsFragment, 42));
                    if (ConversationsFragment.A11(conversationsFragment)) {
                        conversationsFragment.A0r.A0J(new C98554rL(conversationsFragment, 44));
                    }
                }
                if (((C38501rO) conversationsFragment.A3I.get()).A08()) {
                    conversationsFragment.A1k.A0V(new C99154sM(conversationsFragment, 0));
                    return;
                }
                return;
            default:
                C25201Nh.A07((C25201Nh) this.A01);
                return;
        }
        r4.A0J(runnable);
    }

    public /* synthetic */ void BqF(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BqI(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BqJ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BqK(AnonymousClass1BI r1) {
    }
}
