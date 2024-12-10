package X;

import com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingActivity;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel;
import com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView;

/* renamed from: X.7Da  reason: invalid class name and case insensitive filesystem */
public final class C143347Da implements E8D {
    public final /* synthetic */ MetaAiVoiceSettingActivity A00;

    public void C4x(int i) {
    }

    public C143347Da(MetaAiVoiceSettingActivity metaAiVoiceSettingActivity) {
        this.A00 = metaAiVoiceSettingActivity;
    }

    public void Bo5(int i, boolean z, boolean z2) {
        if (z2) {
            MetaAiVoiceSettingActivity metaAiVoiceSettingActivity = this.A00;
            C18100vl r3 = metaAiVoiceSettingActivity.A0C;
            ((MetaAiVoiceSettingViewModel) r3.getValue()).A0U(i, true);
            CenteredSelectionRecyclerView centeredSelectionRecyclerView = metaAiVoiceSettingActivity.A07;
            if (centeredSelectionRecyclerView == null) {
                C18070vi.A11("voiceSelectionRecyclerview");
                throw null;
            }
            AnonymousClass4a5.A01(centeredSelectionRecyclerView, metaAiVoiceSettingActivity.A08);
            ((MetaAiVoiceSettingViewModel) r3.getValue()).A0T();
        }
    }
}
