package X;

import com.whatsapp.calling.areffects.state.CallArEffectsStateHolder$action$2$1;
import com.whatsapp.calling.areffects.state.CallArEffectsStateHolder$action$2$2;
import com.whatsapp.voipcalling.camera.VoipCameraManager;

/* renamed from: X.5PF  reason: invalid class name */
public final class AnonymousClass5PF extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1OX $viewModelScope;
    public final /* synthetic */ VoipCameraManager $voipCameraManager;
    public final /* synthetic */ C85794Ot this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5PF(C85794Ot r2, VoipCameraManager voipCameraManager, AnonymousClass1OX r4) {
        super(0);
        this.$voipCameraManager = voipCameraManager;
        this.this$0 = r2;
        this.$viewModelScope = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        if (this.$voipCameraManager.canCameraBindToCameraProcessor()) {
            obj = new C93124iT("");
        } else {
            obj = C93144iV.A00;
        }
        C85794Ot r0 = this.this$0;
        C23421Fz r5 = r0.A04;
        C23421Fz A18 = AnonymousClass3MX.A18(r0.A03);
        C85794Ot r3 = this.this$0;
        return AnonymousClass4Z7.A01(obj, this.$viewModelScope, new C27182DXr(obj, new CallArEffectsStateHolder$action$2$2((C30391dr) null), AnonymousClass4Z8.A01(new CallArEffectsStateHolder$action$2$1(r3, (C30391dr) null), r5, A18, r3.A05)), C99654tF.A00());
    }
}
