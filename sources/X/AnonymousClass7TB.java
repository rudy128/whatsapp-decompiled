package X;

import com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel;
import java.util.List;
import java.util.TimerTask;

/* renamed from: X.7TB  reason: invalid class name */
public final class AnonymousClass7TB extends TimerTask {
    public final /* synthetic */ MetaAiVoiceViewModel A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ C98474rD A02;

    public AnonymousClass7TB(MetaAiVoiceViewModel metaAiVoiceViewModel, List list, C98474rD r3) {
        this.A00 = metaAiVoiceViewModel;
        this.A01 = list;
        this.A02 = r3;
    }

    public void run() {
        C41731wy r4 = this.A00.A00;
        List list = this.A01;
        C98474rD r2 = this.A02;
        r4.A0E(list.get(r2.element % list.size()));
        r2.element = (r2.element + 1) % list.size();
    }
}
