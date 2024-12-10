package X;

import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingActivity;
import com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView;
import java.util.List;

/* renamed from: X.7yi  reason: invalid class name and case insensitive filesystem */
public final class C157827yi extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ MetaAiVoiceSettingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157827yi(MetaAiVoiceSettingActivity metaAiVoiceSettingActivity) {
        super(1);
        this.this$0 = metaAiVoiceSettingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        boolean isEmpty = ((List) obj).isEmpty();
        MetaAiVoiceSettingActivity metaAiVoiceSettingActivity = this.this$0;
        CenteredSelectionRecyclerView centeredSelectionRecyclerView = metaAiVoiceSettingActivity.A07;
        if (isEmpty) {
            if (centeredSelectionRecyclerView != null) {
                centeredSelectionRecyclerView.setVisibility(8);
                WaImageView waImageView = metaAiVoiceSettingActivity.A02;
                if (waImageView != null) {
                    waImageView.setVisibility(8);
                    WaImageView waImageView2 = metaAiVoiceSettingActivity.A01;
                    if (waImageView2 != null) {
                        waImageView2.setVisibility(8);
                        WaTextView waTextView = metaAiVoiceSettingActivity.A04;
                        if (waTextView != null) {
                            waTextView.setVisibility(8);
                        }
                        str = "voiceOptionSelectionText";
                        C18070vi.A11(str);
                        throw null;
                    }
                    str = "voiceOptionNextButton";
                    C18070vi.A11(str);
                    throw null;
                }
                str = "voiceOptionPrevButton";
                C18070vi.A11(str);
                throw null;
            }
            str = "voiceSelectionRecyclerview";
            C18070vi.A11(str);
            throw null;
        }
        if (centeredSelectionRecyclerView != null) {
            centeredSelectionRecyclerView.setVisibility(0);
            WaImageView waImageView3 = metaAiVoiceSettingActivity.A02;
            if (waImageView3 != null) {
                waImageView3.setVisibility(0);
                WaImageView waImageView4 = metaAiVoiceSettingActivity.A01;
                if (waImageView4 != null) {
                    waImageView4.setVisibility(0);
                    WaTextView waTextView2 = metaAiVoiceSettingActivity.A04;
                    if (waTextView2 != null) {
                        waTextView2.setVisibility(0);
                        C112245lA r0 = this.this$0.A06;
                        if (r0 == null) {
                            str = "adapter";
                            C18070vi.A11(str);
                            throw null;
                        }
                        r0.notifyDataSetChanged();
                    }
                    str = "voiceOptionSelectionText";
                    C18070vi.A11(str);
                    throw null;
                }
                str = "voiceOptionNextButton";
                C18070vi.A11(str);
                throw null;
            }
            str = "voiceOptionPrevButton";
            C18070vi.A11(str);
            throw null;
        }
        str = "voiceSelectionRecyclerview";
        C18070vi.A11(str);
        throw null;
        MetaAiVoiceSettingActivity.A03(this.this$0);
        return C27621Wu.A00;
    }
}
