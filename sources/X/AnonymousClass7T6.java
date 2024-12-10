package X;

import com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel;
import java.util.TimerTask;

/* renamed from: X.7T6  reason: invalid class name */
public final class AnonymousClass7T6 extends TimerTask {
    public final /* synthetic */ MetaAiVoiceViewModel A00;

    public AnonymousClass7T6(MetaAiVoiceViewModel metaAiVoiceViewModel) {
        this.A00 = metaAiVoiceViewModel;
    }

    public void run() {
        AnonymousClass1DT r2 = this.A00.A0D;
        if (r2.A06() == AnonymousClass6RF.RESPONDING) {
            r2.A0E(AnonymousClass6RF.LISTENING);
        }
    }
}
