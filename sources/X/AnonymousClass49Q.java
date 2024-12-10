package X;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.49Q  reason: invalid class name */
public class AnonymousClass49Q extends A34 {
    public int A00;
    public int A01;
    public AnonymousClass1EC A02;
    public final AnonymousClass12M A03;
    public final C55082fB A04;
    public final WeakReference A05;
    public final AnonymousClass11P A06;

    /* JADX WARNING: type inference failed for: r0v15, types: [X.1LU, java.lang.Object] */
    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        int i;
        ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A05.get();
        if (viewGroupInviteActivity != null) {
            AnonymousClass1EC r1 = this.A02;
            int i2 = this.A00;
            int i3 = this.A01;
            if (r1 == null) {
                if (i2 != 400) {
                    i = 2131890965;
                    if (i2 != 419) {
                        if (i2 != 500) {
                            i = 2131890964;
                            if (i2 != 404) {
                                i = 2131890966;
                                if (i2 != 405) {
                                    i = 2131890962;
                                    if (i2 != 409) {
                                        i = 2131890967;
                                        if (i2 != 410) {
                                            i = 2131895032;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ViewGroupInviteActivity.A03(viewGroupInviteActivity, i);
                }
                i = 2131890963;
                ViewGroupInviteActivity.A03(viewGroupInviteActivity, i);
            } else if (i3 == 1) {
                viewGroupInviteActivity.A02.setVisibility(4);
                viewGroupInviteActivity.A01.setVisibility(0);
                AnonymousClass4SZ r2 = viewGroupInviteActivity.A0F;
                r2.A07.setText(2131898390);
                WDSButton wDSButton = r2.A0C;
                wDSButton.setText(2131895287);
                wDSButton.setEnabled(false);
                r2.A0D.setVisibility(8);
            } else if (!viewGroupInviteActivity.A0B.A0P(r1) || !viewGroupInviteActivity.A0D.A0J(r1)) {
                Runnable runnable = viewGroupInviteActivity.A0M;
                if (runnable == null) {
                    runnable = new C146447Pd(viewGroupInviteActivity, 34);
                    viewGroupInviteActivity.A0M = runnable;
                }
                viewGroupInviteActivity.A05.A0K(runnable, 32000);
            } else {
                Intent A062 = AnonymousClass3MY.A06(viewGroupInviteActivity, new Object(), r1);
                C60442o2.A00(A062, viewGroupInviteActivity.A05, "ViewGroupInviteActivity:onGroupJoined");
                viewGroupInviteActivity.A3q(A062, true);
            }
        }
    }

    public AnonymousClass49Q(AnonymousClass11P r2, AnonymousClass12M r3, ViewGroupInviteActivity viewGroupInviteActivity, C55082fB r5) {
        this.A06 = r2;
        this.A03 = r3;
        this.A05 = AnonymousClass3MW.A0z(viewGroupInviteActivity);
        this.A04 = r5;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.A03.A09(new C96594o6(this, 2), new C97514pb(this, 2), this.A04).get(32000, TimeUnit.MILLISECONDS);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 < 500) {
                SystemClock.sleep(500 - elapsedRealtime2);
                return null;
            }
        } catch (Exception e) {
            Log.w("ViewGroupInviteActivityJoinGroupTask send join timed out", e);
        }
        return null;
    }
}
