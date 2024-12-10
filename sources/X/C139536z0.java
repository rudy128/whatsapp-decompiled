package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBot;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBotImpl;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.6z0  reason: invalid class name and case insensitive filesystem */
public final class C139536z0 {
    public final C18600wl A00;
    public final AnonymousClass1OX A01;
    public final File A02;
    public final File A03;

    public final File A02(C122616Rb r3, boolean z) {
        File file;
        int A04 = C108955ca.A04(r3, 0);
        if (A04 == 0) {
            file = this.A03;
        } else if (A04 == 1) {
            file = this.A02;
        } else {
            throw AnonymousClass3MW.A14();
        }
        if (file.exists()) {
            return file;
        }
        if (z) {
            if (file.mkdirs()) {
                return file;
            }
            Log.w("BotPhotoHelper/getBotPhotosDir unable to create directory");
        }
        return null;
    }

    public C139536z0(AnonymousClass118 r3, C18600wl r4, AnonymousClass1OX r5) {
        C18070vi.A0o(r3, r4, r5);
        this.A00 = r4;
        this.A01 = r5;
        File A0e = C17880vN.A0e(C108945cZ.A16(r3), "Bot Photos");
        this.A03 = C17880vN.A0e(A0e, C122616Rb.A03.dirName);
        this.A02 = C17880vN.A0e(A0e, C122616Rb.A02.dirName);
    }

    public static final String A00(C122616Rb r4, AiHomeBot aiHomeBot) {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(((C20125A8k) aiHomeBot).A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        A10.append('-');
        AiHomeBotImpl.Persona BX1 = aiHomeBot.BX1();
        if (BX1 != null) {
            str = BX1.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        } else {
            str = null;
        }
        A10.append(str);
        A10.append('-');
        return AnonymousClass000.A0y(r4.dirName, A10);
    }

    public final File A01(C122616Rb r6, AiHomeBot aiHomeBot) {
        File A022 = A02(r6, C18070vi.A16(aiHomeBot, r6));
        String str = null;
        if (A022 == null) {
            return null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(((C20125A8k) aiHomeBot).A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        A10.append('-');
        AiHomeBotImpl.Persona BX1 = aiHomeBot.BX1();
        if (BX1 != null) {
            str = BX1.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        }
        A10.append(str);
        return C17880vN.A0e(A022, AnonymousClass000.A0y(".jpg", A10));
    }
}
