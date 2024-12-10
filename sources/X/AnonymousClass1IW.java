package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.calling.upsell.UnAnsweredCallUpSellHandler$resetAndLaunchCallScopeCoroutine$1;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* renamed from: X.1IW  reason: invalid class name */
public final class AnonymousClass1IW extends C23701Hh implements AnonymousClass1IV {
    public long A00;
    public C59522mR A01;
    public CallInfo A02;
    public WeakReference A03;
    public AnonymousClass1OX A04;
    public boolean A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final C18100vl A0G = new C18110vm(new C71023Dm(this, 19));
    public final C18100vl A0H = new C18110vm(new C71023Dm(this, 20));
    public final C18100vl A0I = new C18110vm(new C71023Dm(this, 21));
    public final C18600wl A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;

    public AnonymousClass1IW(AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15, C18600wl r16) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r8, 6);
        C18070vi.A0d(r9, 7);
        C18070vi.A0d(r10, 8);
        C18070vi.A0d(r11, 9);
        C18070vi.A0d(r12, 10);
        C18070vi.A0d(r13, 11);
        C18070vi.A0d(r14, 12);
        C18070vi.A0d(r15, 13);
        C18600wl r1 = r16;
        C18070vi.A0d(r1, 14);
        this.A0M = r3;
        this.A0B = r4;
        this.A0F = r5;
        this.A08 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A0K = r9;
        this.A0C = r10;
        this.A0E = r11;
        this.A0D = r12;
        this.A09 = r13;
        this.A0A = r14;
        this.A0L = r15;
        this.A0J = r1;
    }

    public /* synthetic */ void Bmn() {
    }

    public void Bn7(C178119Bw r11) {
        CallInfo callInfo;
        Activity activity;
        C18070vi.A0d(r11, 0);
        this.A01 = null;
        if (A01() && (callInfo = this.A02) != null) {
            C59522mR r5 = new C59522mR(callInfo, r11);
            long j = this.A00;
            this.A00 = 0;
            this.A0D.get();
            long currentTimeMillis = System.currentTimeMillis();
            if (j > 0) {
                if (currentTimeMillis - j <= ((long) C18020vd.A00(C18040vf.A02, (C18020vd) this.A06.get(), 11569)) * 1000) {
                    this.A01 = null;
                    return;
                }
            }
            if (r5.A03) {
                if (this.A05) {
                    this.A05 = false;
                    this.A01 = r5;
                } else {
                    WeakReference weakReference = this.A03;
                    if (weakReference != null && (activity = (Activity) weakReference.get()) != null) {
                        A00(activity, r5);
                    } else {
                        return;
                    }
                }
                AnonymousClass1OX r0 = this.A04;
                if (r0 != null) {
                    AnonymousClass1OW.A04((CancellationException) null, r0);
                }
            }
        }
    }

    public /* synthetic */ void BnG(C178119Bw r1, boolean z) {
    }

    public /* synthetic */ void BnH(long j, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public void BnJ(C178119Bw r6) {
        C18070vi.A0d(r6, 0);
        this.A02 = null;
        if (A01()) {
            this.A0D.get();
            this.A00 = System.currentTimeMillis();
            AnonymousClass1OX r0 = this.A04;
            if (r0 != null) {
                AnonymousClass1OW.A04((CancellationException) null, r0);
            }
            AnonymousClass1OY A022 = AnonymousClass1OW.A02(AnonymousClass1OQ.A03(this.A0J, new AnonymousClass1OD((AnonymousClass1OB) null)));
            this.A04 = A022;
            UnAnsweredCallUpSellHandler$resetAndLaunchCallScopeCoroutine$1 unAnsweredCallUpSellHandler$resetAndLaunchCallScopeCoroutine$1 = new UnAnsweredCallUpSellHandler$resetAndLaunchCallScopeCoroutine$1(this, (C30391dr) null);
            C30451dy.A02(AnonymousClass00R.A00, AnonymousClass1OR.A00, unAnsweredCallUpSellHandler$resetAndLaunchCallScopeCoroutine$1, A022);
        }
    }

    public /* synthetic */ void BnK(AnonymousClass1BI r1, CallState callState, String str) {
    }

    public /* synthetic */ void C5e() {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C18070vi.A0d(activity, 0);
        if (A01() && C18070vi.A18(activity.getComponentName().getClassName(), "com.whatsapp.HomeActivity")) {
            ((AnonymousClass10T) this.A0K.get()).registerObserver(this);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C18070vi.A0d(activity, 0);
        if (C18070vi.A18(activity.getComponentName().getClassName(), "com.whatsapp.HomeActivity")) {
            ((AnonymousClass10T) this.A0K.get()).unregisterObserver(this);
        }
    }

    public void onActivityResumed(Activity activity) {
        C18070vi.A0d(activity, 0);
        if (A01()) {
            this.A03 = new WeakReference(activity);
            this.A05 = C18070vi.A18(activity.getComponentName().getClassName(), "com.whatsapp.voipcalling.VoipActivityV2");
            C59522mR r0 = this.A01;
            if (r0 != null) {
                A00(activity, r0);
            }
            this.A01 = null;
        }
    }

    private final void A00(Activity activity, C59522mR r5) {
        AnonymousClass1BI r2;
        Intent intent;
        C22559BCs bCs = ((AnonymousClass1RW) this.A0L.get()).A00().A00;
        if (bCs != null) {
            r2 = bCs.getChatJid();
        } else {
            r2 = null;
        }
        CallInfo callInfo = r5.A01;
        if (!callInfo.isGroupCall && callInfo.isEndedByMe) {
            int i = callInfo.callResult;
            if (i == 4 || i == 9) {
                C178119Bw r1 = r5.A02;
                if (r1.A04.A03 && (!r1.A0O()) && r1.A06 == 2) {
                    if (C18070vi.A18(activity.getComponentName().getClassName(), "com.whatsapp.Conversation") && C18070vi.A18(r5.A00, r2)) {
                        return;
                    }
                    if (!C18070vi.A18(activity.getComponentName().getClassName(), "com.whatsapp.chatinfo.ContactInfoActivity") || (intent = activity.getIntent()) == null || !intent.getBooleanExtra("should_show_chat_action", false)) {
                        ((AnonymousClass10I) this.A0M.get()).CGF(new C21434Ak1(r5, this, activity, 29));
                    }
                }
            }
        }
    }

    private final boolean A01() {
        AnonymousClass00H r3 = this.A06;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, (C18020vd) r3.get(), 9798) || !C18020vd.A05(r2, (C18020vd) r3.get(), 10242)) {
            return false;
        }
        return true;
    }
}
