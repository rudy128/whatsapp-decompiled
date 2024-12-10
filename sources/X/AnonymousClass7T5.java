package X;

import com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: X.7T5  reason: invalid class name */
public final class AnonymousClass7T5 extends TimerTask {
    public final /* synthetic */ MetaAiVoiceViewModel A00;

    public AnonymousClass7T5(MetaAiVoiceViewModel metaAiVoiceViewModel) {
        this.A00 = metaAiVoiceViewModel;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.4rD] */
    public void run() {
        MetaAiVoiceViewModel metaAiVoiceViewModel = this.A00;
        List list = metaAiVoiceViewModel.A04;
        if (list != null) {
            ? obj = new Object();
            Timer timer = metaAiVoiceViewModel.A05;
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = new Timer("VoiceHintsRotationTimer", false);
            timer2.schedule(new AnonymousClass7TB(metaAiVoiceViewModel, list, obj), 0, 5000);
            metaAiVoiceViewModel.A05 = timer2;
        }
    }
}
