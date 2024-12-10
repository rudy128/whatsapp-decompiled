package X;

import com.whatsapp.util.Log;

public final class B3D extends AnonymousClass11G implements C22821Di {
    public static final B3D A00 = new B3D();

    public B3D() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C29621ca r3 = (C29621ca) obj;
        C18070vi.A0d(r3, 0);
        C29621ca A0K = r3.A0K("credential_create");
        if (A0K == null) {
            Log.e("PasskeyServer/parseStartRegisterResponse/credential_create node missing");
            return new C175338yY(new AnonymousClass9L4("credential_create node missing"));
        }
        byte[] bArr = A0K.A01;
        if (bArr != null) {
            return new C175348yZ(C108955ca.A13(bArr));
        }
        Log.e("PasskeyServer/parseStartRegisterResponse/credential_create node has no data");
        return new C175338yY(new AnonymousClass9L4("credential_create node not set"));
    }
}
