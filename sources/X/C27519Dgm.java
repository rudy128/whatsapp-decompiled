package X;

import android.os.Handler;
import com.facebook.wearable.airshield.stream.CipherBuilder;
import com.facebook.wearable.datax.LocalChannel;

/* renamed from: X.Dgm  reason: case insensitive filesystem */
public final class C27519Dgm extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C26193CuL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27519Dgm(C26193CuL cuL) {
        super(0);
        this.this$0 = cuL;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        C26193CuL cuL = this.this$0;
        synchronized (cuL.A0A) {
            if (cuL.A0D.get()) {
                cuL.A0G.invoke(new BWK("Unable to encrypt, link setup has been detached"));
            } else {
                C26294Cx6.A06("LinkSetup", "Setting up encryption...");
                Handler handler = cuL.A03;
                if (handler != null) {
                    handler.postDelayed(cuL.A0B, 10000);
                }
                CipherBuilder A00 = C26193CuL.A00(cuL);
                try {
                    LocalChannel localChannel = cuL.A02;
                    byte[] serialize = A00.privateKey.recoverPublicKey().serialize();
                    C0p c0p = C0p.Secp256r1;
                    byte[] bArr = A00.challenge;
                    C18070vi.A0i(serialize, bArr);
                    C23614Bmj bmj = (C23614Bmj) C23654BnN.DEFAULT_INSTANCE.A0N();
                    ((C23654BnN) bmj.A00).publicKey_ = C17900vP.A03(bmj, serialize);
                    ((C23654BnN) bmj.A00).challenge_ = C17900vP.A03(bmj, bArr);
                    C23654BnN bnN = (C23654BnN) C17880vN.A0G(bmj);
                    bnN.keyType_ = Integer.valueOf(c0p.BVW());
                    bnN.keyTypeCase_ = 3;
                    ((C23654BnN) C17880vN.A0G(bmj)).supportedParameters_ = 1;
                    localChannel.send(C24590CAl.A00(bmj.A0C(), 1));
                    C26294Cx6.A06("LinkSetup", "RequestEncryption sent");
                    obj = C27621Wu.A00;
                } catch (Throwable th) {
                    obj = C108945cZ.A1J(th);
                }
                Throwable A002 = C30671eK.A00(obj);
                if (A002 != null) {
                    C26294Cx6.A05("LinkSetup", AnonymousClass001.A1E(A002, "Failed to send RequestEncryption: ", AnonymousClass000.A10()));
                    cuL.A0G.invoke(A002);
                }
            }
        }
        return C27621Wu.A00;
    }
}
