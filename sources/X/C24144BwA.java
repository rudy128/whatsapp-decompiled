package X;

import android.os.Bundle;
import android.view.View;
import com.whatsapp.conversation.conversationrow.BotRichResponseCodeBottomSheet;
import java.util.List;

/* renamed from: X.BwA  reason: case insensitive filesystem */
public final class C24144BwA extends C38471rL {
    public final /* synthetic */ BMM A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C24144BwA(BMM bmm, String str, String str2) {
        this.A00 = bmm;
        this.A02 = str;
        this.A01 = str2;
    }

    public void A04(View view) {
        BMM bmm = this.A00;
        List list = C42011xT.A0I;
        AnonymousClass1FU A002 = AnonymousClass1FU.A00(bmm.A03);
        if (A002 != null) {
            String str = this.A02;
            String str2 = this.A01;
            BotRichResponseCodeBottomSheet botRichResponseCodeBottomSheet = new BotRichResponseCodeBottomSheet();
            Bundle A0D = C17880vN.A0D();
            A0D.putString("title", str);
            A0D.putString("code", str2);
            botRichResponseCodeBottomSheet.A1R(A0D);
            A002.CMl(botRichResponseCodeBottomSheet);
        }
    }
}
