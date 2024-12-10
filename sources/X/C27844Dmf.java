package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.UUID;

/* renamed from: X.Dmf  reason: case insensitive filesystem */
public final class C27844Dmf extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24374C0r $state;
    public final /* synthetic */ UUID $txLinkId;
    public final /* synthetic */ C26193CuL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27844Dmf(C26193CuL cuL, C24374C0r c0r, UUID uuid) {
        super(0);
        this.$txLinkId = uuid;
        this.$state = c0r;
        this.this$0 = cuL;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        UUID uuid = this.$txLinkId;
        C24374C0r c0r = this.$state;
        boolean A15 = C18070vi.A15(uuid, c0r);
        C23624Bmt A0N = C23652BnL.DEFAULT_INSTANCE.A0N();
        ((C23652BnL) C17880vN.A0G(A0N)).state_ = c0r.BVW();
        ((C23652BnL) C17880vN.A0G(A0N)).uuid_ = DSQ.A01(C24591CAm.A00(uuid), A15 ? 1 : 0, 16);
        C25527ChP A00 = C24590CAl.A00(A0N.A0C(), ZipDecompressor.UNZIP_BUFFER_SIZE);
        C26294Cx6.A06("LinkSetup", AnonymousClass001.A1E(A00, "Sending EndLinkSetupMessage: ", AnonymousClass000.A10()));
        this.this$0.A02.send(A00);
        C26193CuL.A03(this.this$0, new C28049DqO(this.$state, this.$txLinkId));
        this.this$0.A0E.invoke();
        return C27621Wu.A00;
    }
}
