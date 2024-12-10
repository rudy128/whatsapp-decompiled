package X;

import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.mediacomposer.ui.bottomsheet.VideoQualitySettingsBottomSheetFragment;
import java.util.Map;

/* renamed from: X.7w1  reason: invalid class name */
public final class AnonymousClass7w1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass85N $mediaQualityUpdateListener;
    public final /* synthetic */ Integer $selectedMediaQuality;
    public final /* synthetic */ VideoComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7w1(VideoComposerFragment videoComposerFragment, AnonymousClass85N r3, Integer num) {
        super(0);
        this.$mediaQualityUpdateListener = r3;
        this.$selectedMediaQuality = num;
        this.this$0 = videoComposerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass85N r4 = this.$mediaQualityUpdateListener;
        Integer num = this.$selectedMediaQuality;
        Map map = this.this$0.A0q;
        C18070vi.A0d(map, 2);
        new VideoQualitySettingsBottomSheetFragment(r4, num, map).A2C(this.this$0.A1D().getSupportFragmentManager(), "media_quality_fragment");
        return C27621Wu.A00;
    }
}
