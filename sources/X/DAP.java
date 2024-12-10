package X;

import com.whatsapp.util.Log;

public class DAP implements E93 {
    public final int A00;

    public DAP(int i) {
        this.A00 = i;
    }

    public void BnS(Exception exc) {
        if (this.A00 != 0) {
            C17900vP.A0X(exc, "voip/video/VoipCamera/ VoipLiteCamera/onCameraError: ", C18070vi.A0K(exc));
        }
    }

    public void BnZ() {
        if (this.A00 != 0) {
            Log.e("voip/video/VoipCamera/ VoipLiteCamera/onCameraInitialised");
        } else {
            Log.i("AvatarSparkEffectProcessor/onCameraInitialised");
        }
    }

    public void Bna(String str, String str2) {
        if (this.A00 != 0) {
            C18070vi.A0h(str, str2);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/video/VoipCamera/ VoipLiteCamera/onCameraLocallyEvicted: ");
            A10.append(str);
            A10.append('>');
            C17890vO.A19(A10, str2);
        }
    }

    public void Bni() {
        if (this.A00 != 0) {
            Log.e("voip/video/VoipCamera/ VoipLiteCamera/onCameraSwitched");
        }
    }
}
