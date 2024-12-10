package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBot;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBotImpl;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.70i  reason: invalid class name and case insensitive filesystem */
public abstract class C1401970i {
    public static final ArrayList A02(C143307Cw r5) {
        AiHomeBotImpl.Persona BX1;
        ArrayList arrayList = null;
        AiHomeBot aiHomeBot = r5.A00;
        if (!(aiHomeBot == null || (BX1 = aiHomeBot.BX1()) == null)) {
            AnonymousClass1IX A0C = BX1.A0C("icebreaker_prompt_list");
            C199610h.A04(A0C);
            C18070vi.A0X(A0C);
            arrayList = C29351c6.A0D(A0C);
            Iterator it = A0C.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                C18070vi.A0b(A0v);
                arrayList.add(new AnonymousClass24Z(A0v, ""));
            }
        }
        return arrayList;
    }

    public static final String A00(C143307Cw r1) {
        AiHomeBotImpl.Persona BX1;
        String A0F;
        AiHomeBot aiHomeBot = r1.A00;
        if (aiHomeBot == null || (BX1 = aiHomeBot.BX1()) == null || (A0F = BX1.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) == null) {
            return "";
        }
        return A0F;
    }

    public static final String A01(C143307Cw r5) {
        String str;
        AiHomeBotImpl.Persona BX1;
        StringBuilder A0K = C18070vi.A0K(r5);
        AiHomeBot aiHomeBot = r5.A00;
        String str2 = null;
        if (aiHomeBot != null) {
            str = ((C20125A8k) aiHomeBot).A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        } else {
            str = null;
        }
        A0K.append(str);
        A0K.append('$');
        if (!(aiHomeBot == null || (BX1 = aiHomeBot.BX1()) == null)) {
            str2 = BX1.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        }
        return AnonymousClass000.A0y(str2, A0K);
    }
}
