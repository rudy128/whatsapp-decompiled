package X;

import com.whatsapp.voipcalling.camera.VoipCameraManager;

/* renamed from: X.5C5  reason: invalid class name */
public final class AnonymousClass5C5 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ VoipCameraManager $voipCameraManager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5C5(VoipCameraManager voipCameraManager) {
        super(0);
        this.$voipCameraManager = voipCameraManager;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C82864Cj r0;
        if (this.$voipCameraManager.canCameraBindToCameraProcessor()) {
            r0 = C82864Cj.SUPPORTS_AR_EFFECTS_AND_OPEN;
        } else {
            r0 = C82864Cj.DOES_NOT_SUPPORT_AR_EFFECTS;
        }
        return AnonymousClass3MW.A18(r0);
    }
}
