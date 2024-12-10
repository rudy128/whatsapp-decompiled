package X;

import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.security.PrivateKey;
import com.facebook.wearable.airshield.security.PublicKey;
import java.util.UUID;

/* renamed from: X.Dsr  reason: case insensitive filesystem */
public final class C28181Dsr extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C25647Cjd $result;
    public final /* synthetic */ Cw1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28181Dsr(C25647Cjd cjd, Cw1 cw1) {
        super(2);
        this.this$0 = cw1;
        this.$result = cjd;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        UUID uuid = (UUID) obj;
        byte[] bArr = (byte[]) obj2;
        C18070vi.A0h(uuid, bArr);
        PrivateKey A00 = Cw1.A00(this.this$0);
        PublicKey publicKey = new PublicKey((HybridData) null);
        publicKey.setRaw(bArr);
        BTW btw = new BTW(A00, publicKey, uuid);
        this.this$0.A0E.put(uuid, btw);
        Cw1.A01(btw, this.this$0, C24337BzY.BTC, uuid, new C27981DpI(this.$result));
        return C27621Wu.A00;
    }
}
