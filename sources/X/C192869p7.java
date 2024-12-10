package X;

import android.app.Application;
import android.telephony.TelephonyManager;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9p7  reason: invalid class name and case insensitive filesystem */
public final class C192869p7 {
    public int A00 = -1;
    public RecaptchaTasksClient A01;
    public AnonymousClass9IK A02 = AnonymousClass9IK.ABPROP_NOT_CHECKED;
    public Exception A03;
    public AtomicBoolean A04 = C108965cb.A0w();
    public Boolean A05;
    public final AnonymousClass11P A06;
    public final C19830z4 A07;
    public final C26031Qo A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass11E A0A;
    public final AnonymousClass11C A0B;
    public final AnonymousClass19D A0C;
    public final AnonymousClass00H A0D = C217517g.A00(49531);

    public final void A00(Application application) {
        String str;
        String str2;
        C18070vi.A0d(application, 0);
        if (!A01()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("RecaptchaClientHandler/recaptcha is not enabled for this user: ");
            str2 = C17880vN.A0t(A10, this.A00);
        } else {
            TelephonyManager A0K = this.A0B.A0K();
            if (A0K != null) {
                str = A0K.getSimCountryIso();
            } else {
                str = null;
            }
            AnonymousClass00H r1 = this.A0D;
            r1.get();
            if (!C29431cG.A18(C197499wn.A00, str)) {
                r1.get();
                if (!"gb".equalsIgnoreCase(str)) {
                    if (this.A01 != null) {
                        str2 = "RecaptchaClientHandler/client already initialised";
                    } else {
                        AtomicBoolean atomicBoolean = this.A04;
                        if (!atomicBoolean.compareAndSet(false, true)) {
                            str2 = "RecaptchaClientHandler/client is already being initialised - exiting early";
                        } else if (!this.A0A.A09()) {
                            Log.i("RecaptchaClientHandler/Not initialising ReCAPTCHA client due to not having network access");
                            this.A08.A00(AnonymousClass8oE.A01, "No internet connectivity");
                            this.A03 = AnonymousClass000.A0n("No internet");
                            this.A02 = AnonymousClass9IK.INIT_FAILED;
                            atomicBoolean.set(false);
                            return;
                        } else {
                            this.A02 = AnonymousClass9IK.INIT_STARTED;
                            AnonymousClass00H r7 = this.A09;
                            AnonymousClass8BR.A0W(r7).A00("RECAPTCHA_INIT_");
                            try {
                                Task tasksClient = Recaptcha.getTasksClient(application, "6LcgaR4pAAAAAFMQmjEQyA7UegLcjegCi241YDXv");
                                AJM.A00(tasksClient, new C22203AzJ(this), 1);
                                AJI.A00(tasksClient, this, 2);
                                return;
                            } catch (Exception e) {
                                this.A08.A01(AnonymousClass8oE.A01, "exceptionThrown", e);
                                C17900vP.A0X(e, "RecaptchaClientHandler/Exception caught in initialisation of client/", AnonymousClass000.A10());
                                this.A03 = e;
                                this.A02 = AnonymousClass9IK.INIT_FAILED;
                                AnonymousClass8BR.A0W(r7).A01("RECAPTCHA_INIT_", "EXCEPTION");
                                atomicBoolean.set(false);
                                return;
                            }
                        }
                    }
                }
            }
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("RecaptchaClientHandler/sim country makes recaptcha unusable: \"");
            A102.append(str);
            Log.i(C17890vO.A0c(A102, '\"'));
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("Ineligible country: \"");
            this.A03 = AnonymousClass000.A0n(AnonymousClass8BW.A0l(str, A103, '\"'));
            this.A02 = AnonymousClass9IK.INIT_FAILED;
            return;
        }
        Log.i(str2);
    }

    public final boolean A01() {
        AnonymousClass9IK r0;
        Boolean bool = this.A05;
        if (bool == null) {
            int i = this.A00;
            boolean z = true;
            if (i < 0) {
                C19830z4 r4 = this.A07;
                int A012 = AnonymousClass8BT.A01(C17890vO.A0B(r4), "more_sheep_random_number");
                i = AnonymousClass1JU.A01.A03(1, 1000);
                if (A012 < 0) {
                    C17900vP.A0M(r4, "more_sheep_random_number", i);
                    this.A00 = i;
                } else {
                    this.A00 = A012;
                    i = A012;
                }
            }
            if (i >= C18020vd.A00(C18040vf.A02, this.A0C, 7343)) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.A05 = valueOf;
            C18070vi.A0z(valueOf, "null cannot be cast to non-null type kotlin.Boolean");
            if (valueOf.booleanValue()) {
                r0 = AnonymousClass9IK.ABPROP_ENABLED;
            } else {
                r0 = AnonymousClass9IK.ABPROP_DISABLED;
            }
            this.A02 = r0;
            bool = this.A05;
        }
        C18070vi.A0z(bool, "null cannot be cast to non-null type kotlin.Boolean");
        return bool.booleanValue();
    }

    public C192869p7(AnonymousClass11E r2, AnonymousClass11C r3, AnonymousClass11P r4, C19830z4 r5, C26031Qo r6, AnonymousClass19D r7, AnonymousClass00H r8) {
        C18070vi.A0w(r4, r3, r7, r6, r8);
        C18070vi.A0l(r5, r2);
        this.A06 = r4;
        this.A0B = r3;
        this.A0C = r7;
        this.A08 = r6;
        this.A09 = r8;
        this.A07 = r5;
        this.A0A = r2;
    }
}
