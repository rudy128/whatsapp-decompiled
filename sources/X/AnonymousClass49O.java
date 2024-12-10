package X;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.49O  reason: invalid class name */
public class AnonymousClass49O extends A34 {
    public int A00;
    public AnonymousClass1EC A01;
    public final int A02;
    public final AnonymousClass12M A03;
    public final String A04;
    public final WeakReference A05;
    public final AnonymousClass11P A06;

    public AnonymousClass49O(AcceptInviteLinkActivity acceptInviteLinkActivity, AnonymousClass11P r3, AnonymousClass12M r4, String str, int i) {
        super(acceptInviteLinkActivity, true);
        this.A06 = r3;
        this.A03 = r4;
        this.A05 = AnonymousClass3MW.A0z(acceptInviteLinkActivity);
        this.A04 = str;
        this.A02 = i;
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v37, types: [X.1LU, java.lang.Object] */
    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        int i;
        AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A05.get();
        if (acceptInviteLinkActivity != null) {
            AnonymousClass1EC r3 = this.A01;
            int i2 = this.A00;
            int i3 = this.A02;
            if (r3 == null) {
                C17900vP.A0i("acceptlink/sendjoin/failed/", AnonymousClass000.A10(), i2);
                boolean z = true;
                if (i3 != 1) {
                    z = false;
                }
                if (i2 == 401) {
                    i = 2131890297;
                    if (z) {
                        i = 2131890298;
                    }
                } else if (i2 == 404) {
                    i = 2131890301;
                    if (z) {
                        i = 2131890302;
                    }
                } else if (i2 != 419) {
                    i = 2131890296;
                    if (i2 != 429) {
                        if (i2 == 436) {
                            AcceptInviteLinkActivity.A0Q(acceptInviteLinkActivity, 2131891483);
                            C72463Mc.A18(acceptInviteLinkActivity, 2131431961);
                            acceptInviteLinkActivity.findViewById(2131431961).setOnClickListener(new C825348i(acceptInviteLinkActivity));
                            return;
                        } else if (i2 == 409) {
                            AnonymousClass1BI r32 = (AnonymousClass1BI) acceptInviteLinkActivity.A0O.get();
                            Intent A062 = AnonymousClass3MY.A06(acceptInviteLinkActivity, new Object(), r32);
                            C60442o2.A00(A062, acceptInviteLinkActivity.A05, "AcceptInviteLinkActivity");
                            acceptInviteLinkActivity.A3q(A062, true);
                            if (r32 != null) {
                                acceptInviteLinkActivity.A05.CGF(new AnonymousClass3C0(acceptInviteLinkActivity, r32, 28));
                                return;
                            }
                            return;
                        } else if (i2 != 410) {
                            i = 2131895032;
                        } else {
                            i = 2131890303;
                            if (z) {
                                i = 2131890304;
                            }
                        }
                    }
                } else {
                    i = 2131890294;
                    if (z) {
                        i = 2131890305;
                    }
                }
                AcceptInviteLinkActivity.A0Q(acceptInviteLinkActivity, i);
            } else if (!acceptInviteLinkActivity.A04.A0P(r3) || !acceptInviteLinkActivity.A06.A0J(r3)) {
                C17900vP.A0Y(r3, "acceptlink/sendjoin/willwait/", AnonymousClass000.A10());
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("acceptlink/wait/");
                C17900vP.A0b(acceptInviteLinkActivity.A0O.get(), A10);
                Runnable runnable = acceptInviteLinkActivity.A0K;
                if (runnable == null) {
                    runnable = new C70613Bu(acceptInviteLinkActivity, 15);
                    acceptInviteLinkActivity.A0K = runnable;
                }
                acceptInviteLinkActivity.A05.A0K(runnable, 32000);
            } else {
                C17900vP.A0Y(r3, "acceptlink/processcode/exists/", AnonymousClass000.A10());
                Intent A063 = AnonymousClass3MY.A06(acceptInviteLinkActivity, new Object(), r3);
                C60442o2.A00(A063, acceptInviteLinkActivity.A05, "AcceptInviteLinkActivity");
                acceptInviteLinkActivity.A3q(A063, true);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.A03.A0A(new C96594o6(this, 0), new C97514pb(this, 0), this.A04).get(32000, TimeUnit.MILLISECONDS);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 < 500) {
                SystemClock.sleep(500 - elapsedRealtime2);
                return null;
            }
        } catch (Exception e) {
            Log.w("acceptlink/sendjoin/failed/timeout", e);
        }
        return null;
    }
}
