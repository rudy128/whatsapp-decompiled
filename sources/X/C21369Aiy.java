package X;

import android.content.Context;
import com.whatsapp.ptt.feedback.Hilt_TranscriptionFeedbackThankYouBottomSheetFragment;

/* renamed from: X.Aiy  reason: case insensitive filesystem */
public final /* synthetic */ class C21369Aiy implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C187939gc A03;
    public final /* synthetic */ String A04;

    public final void run() {
        AnonymousClass1FL r1;
        AnonymousClass1GP supportFragmentManager;
        C187939gc r7 = this.A03;
        long j = this.A01;
        String str = this.A04;
        double d = this.A00;
        long j2 = this.A02;
        C171548rt r12 = new C171548rt();
        r12.A0A = str;
        r12.A08 = Double.valueOf(d);
        r12.A09 = Long.valueOf(j2);
        r12.A00 = AnonymousClass000.A0i();
        r7.A02.CC7(r12);
        C128826gk r5 = r7.A04;
        r5.A01.CGF(new C146487Ph(r5, j, 30));
        Context context = r7.A01.getContext();
        if ((context instanceof AnonymousClass01E) && (r1 = (AnonymousClass1FL) context) != null && (supportFragmentManager = r1.getSupportFragmentManager()) != null) {
            C20098A7b.A01(new Hilt_TranscriptionFeedbackThankYouBottomSheetFragment(), supportFragmentManager);
        }
    }

    public /* synthetic */ C21369Aiy(C187939gc r1, String str, double d, long j, long j2) {
        this.A03 = r1;
        this.A01 = j;
        this.A04 = str;
        this.A00 = d;
        this.A02 = j2;
    }
}
