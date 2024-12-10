package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.status.playback.StatusPlaybackActivity;

/* renamed from: X.7R1  reason: invalid class name */
public class AnonymousClass7R1 implements Runnable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final String A04;

    public AnonymousClass7R1(C34401kQ r3, String str, int i, int i2) {
        int i3;
        this.A00 = i2;
        if (1 - i2 != 0) {
            i3 = 2131231578;
            this.A03 = r3;
            this.A01 = 44;
        } else {
            i3 = 2131231578;
            this.A03 = r3;
            this.A01 = i;
        }
        this.A04 = str;
        this.A02 = i3;
    }

    public final void run() {
        int i;
        String str;
        C128086fQ r5;
        Intent A0A;
        switch (this.A00) {
            case 0:
                StatusPlaybackActivity.A0r((StatusPlaybackActivity) this.A03, this.A04, this.A01, this.A02);
                return;
            case 1:
                C34401kQ r1 = (C34401kQ) this.A03;
                i = this.A01;
                str = this.A04;
                r5 = (C128086fQ) r1.A08.get();
                Context A0E = C108945cZ.A0E(r1.A00);
                A0A = C17880vN.A0A();
                A0A.setClassName(A0E.getPackageName(), "com.whatsapp.settings.SettingsTabActivity");
                A0A.putExtra("target_settings_wfal", true);
                break;
            default:
                C34401kQ r12 = (C34401kQ) this.A03;
                str = this.A04;
                i = 44;
                r5 = (C128086fQ) r12.A08.get();
                A0A = AnonymousClass1LU.A0A(C108945cZ.A0E(r12.A00));
                break;
        }
        Context context = r5.A00.A00;
        C1409673t r2 = new C1409673t(context, "critical_app_alerts@1");
        r2.A06(3);
        C17890vO.A0m(r2, (CharSequence) null, str, true);
        C17880vN.A1G(r2);
        C17900vP.A0L(r2, str);
        r2.A0A = C1408573i.A00(context, 0, A0A, 0);
        r2.A03 = 0;
        C27301Vn r13 = r5.A01;
        Notification A05 = r2.A05();
        C18070vi.A0X(A05);
        r13.BkR(i, A05);
    }

    public AnonymousClass7R1(StatusPlaybackActivity statusPlaybackActivity, String str, int i, int i2) {
        this.A00 = 0;
        this.A03 = statusPlaybackActivity;
        this.A04 = str;
        this.A01 = i;
        this.A02 = i2;
    }
}
