package X;

import android.content.Context;
import android.os.Bundle;
import com.whatsapp.ptt.feedback.TranscriptionFeedbackWhatWentWrongBottomSheetFragment;

/* renamed from: X.Ais  reason: case insensitive filesystem */
public final /* synthetic */ class C21363Ais implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C187939gc A03;

    public final void run() {
        AnonymousClass1FL r7;
        AnonymousClass1GP supportFragmentManager;
        C187939gc r0 = this.A03;
        long j = this.A01;
        double d = this.A00;
        long j2 = this.A02;
        Context context = r0.A01.getContext();
        if ((context instanceof AnonymousClass01E) && (r7 = (AnonymousClass1FL) context) != null && (supportFragmentManager = r7.getSupportFragmentManager()) != null) {
            TranscriptionFeedbackWhatWentWrongBottomSheetFragment transcriptionFeedbackWhatWentWrongBottomSheetFragment = new TranscriptionFeedbackWhatWentWrongBottomSheetFragment();
            Bundle A0D = C17880vN.A0D();
            A0D.putLong("message_row_id", j);
            A0D.putDouble("average_confidence_score", d);
            A0D.putLong("ptt_length_value", j2);
            transcriptionFeedbackWhatWentWrongBottomSheetFragment.A1R(A0D);
            C20098A7b.A01(transcriptionFeedbackWhatWentWrongBottomSheetFragment, supportFragmentManager);
        }
    }

    public /* synthetic */ C21363Ais(C187939gc r1, double d, long j, long j2) {
        this.A03 = r1;
        this.A01 = j;
        this.A00 = d;
        this.A02 = j2;
    }
}
