package X;

import android.app.Activity;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.70C  reason: invalid class name */
public class AnonymousClass70C {
    public final AnonymousClass1KB A00;
    public final AnonymousClass1NM A01;
    public final C219217x A02;
    public final AnonymousClass18K A03;
    public final C132526mx A04;
    public final C33251iW A05;
    public final AnonymousClass1HS A06;
    public final AnonymousClass11C A07;
    public final C18030ve A08;
    public final AnonymousClass10I A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;

    public void A02(AnonymousClass72K r9, long j, boolean z) {
        this.A09.CGN(new C70743Ci(this, r9, 1, j, z));
    }

    public void A01(AnonymousClass34B r4, C441822l r5, File file) {
        if (file != null) {
            if (C18020vd.A05(C18040vf.A02, this.A08, 746)) {
                this.A09.CGM(new C121796Ln(this.A05, r4, r5, file), new Void[0]);
                return;
            }
        }
        this.A05.A0a(r4, r5);
        if (file != null) {
            this.A09.CGF(new C146757Qm((Object) file, 45));
        }
    }

    public boolean A05(AnonymousClass1FR r5) {
        AnonymousClass1KB r2;
        int i;
        int callStateForSubscription;
        TelephonyManager A0K = this.A07.A0K();
        if (A0K != null) {
            if (Build.VERSION.SDK_INT < 31) {
                callStateForSubscription = A0K.getCallState();
            } else {
                try {
                    if (this.A02.A0I()) {
                        callStateForSubscription = A0K.getCallStateForSubscription();
                    }
                } catch (SecurityException unused) {
                }
            }
            if (callStateForSubscription != 0) {
                r2 = this.A00;
                i = 46;
                r2.CGP(new C146757Qm((Object) r5, i));
                return false;
            }
        }
        if (!this.A06.A01()) {
            return true;
        }
        r2 = this.A00;
        i = 47;
        r2.CGP(new C146757Qm((Object) r5, i));
        return false;
    }

    public AnonymousClass70C(AnonymousClass1KB r1, C33251iW r2, AnonymousClass1HS r3, AnonymousClass1NM r4, AnonymousClass11C r5, C219217x r6, C18030ve r7, AnonymousClass18K r8, AnonymousClass10I r9, C132526mx r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        this.A08 = r7;
        this.A00 = r1;
        this.A09 = r9;
        this.A03 = r8;
        this.A05 = r2;
        this.A0B = r11;
        this.A04 = r10;
        this.A06 = r3;
        this.A07 = r5;
        this.A0A = r12;
        this.A01 = r4;
        this.A02 = r6;
    }

    public static void A00(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        int i2 = 2131894458;
        if (i >= 30) {
            i2 = 2131894461;
            if (i < 33) {
                i2 = 2131894460;
            }
        }
        AnonymousClass74O.A08(activity, 2131894459, i2);
    }

    public void A03(AnonymousClass72K r6, long j, boolean z) {
        try {
            r6.A05();
        } catch (Exception e) {
            if (!z || j < 1000) {
                C17900vP.A0Y(e, "PttUtils/stopAudioRecordAndVisualization ", AnonymousClass000.A10());
            } else {
                Log.e("PttUtils/stopAudioRecordAndVisualization ", e);
            }
        } catch (Throwable th) {
            A02(r6, j, z);
            throw th;
        }
        A02(r6, j, z);
    }

    public boolean A04(AnonymousClass1FL r7, AnonymousClass1FR r8, AnonymousClass1BI r9) {
        AnonymousClass1KB r2;
        Runnable r1;
        if (A05(r8)) {
            Log.i("PttUtils/canStartRecording");
            if (this.A01.A04(new C143697El(r7, this, 0))) {
                if (C108975cc.A07(this.A0B) < C108995ce.A08(this.A08, 3657)) {
                    r2 = this.A00;
                    r1 = new AnonymousClass3C5(this, r7, r8, 25);
                } else if (!AnonymousClass3MW.A0V(this.A0A).A0P(C22941Dw.A00(r9))) {
                    return true;
                } else {
                    r2 = this.A00;
                    r1 = new C146757Qm((Object) r7, 48);
                }
                r2.CGP(r1);
            }
        }
        return false;
    }
}
