package X;

import com.whatsapp.calling.areffects.CallArEffectsViewModel;
import com.whatsapp.voipcalling.camera.VoipCameraManager;

/* renamed from: X.5C1  reason: invalid class name */
public final class AnonymousClass5C1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CallArEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5C1(CallArEffectsViewModel callArEffectsViewModel) {
        super(0);
        this.this$0 = callArEffectsViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return ((VoipCameraManager) this.this$0.A09.get()).getSharedCameraThread();
    }
}
