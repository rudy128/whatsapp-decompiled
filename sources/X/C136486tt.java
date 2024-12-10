package X;

import android.content.Context;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.bot.home.BotPhotoLoader$createAndCollectFlow$1$1;
import com.whatsapp.bot.home.BotPhotoLoader$loadPhoto$1;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBot;

/* renamed from: X.6tt  reason: invalid class name and case insensitive filesystem */
public final class C136486tt {
    public final int A00;
    public final C122616Rb A01;
    public final C122626Rc A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final C18100vl A06;
    public final C18600wl A07;
    public final AnonymousClass1F9 A08;

    public final AnonymousClass1G7 A01(ImageView imageView, C42971z2 r11, C18090vk r12) {
        C18070vi.A0h(imageView, r11);
        AnonymousClass1G7 A002 = C34071js.A00((Object) null);
        C88604aC.A03(AnonymousClass2SS.A00(this.A08), C108955ca.A0I(new BotPhotoLoader$createAndCollectFlow$1$1(imageView, this, r11, (C30391dr) null, r12), A002));
        return A002;
    }

    public final void A02(AiHomeBot aiHomeBot, AnonymousClass1G4 r6) {
        C18070vi.A0d(r6, 1);
        String A0F = ((C20125A8k) aiHomeBot).A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (A0F != null) {
            C122616Rb r2 = this.A01;
            if (((C25131Mz) this.A06.getValue()).A0A(A00(r2, aiHomeBot)) != null) {
                int i = 1;
                if (r2 == C122616Rb.A02) {
                    i = 2;
                }
                r6.CPw(AnonymousClass1D6.A00(A0F, i));
                return;
            }
            AnonymousClass3MW.A1X(this.A07, new BotPhotoLoader$loadPhoto$1(this, aiHomeBot, (C30391dr) null, r6), AnonymousClass2SS.A00(this.A08));
        }
    }

    public C136486tt(AnonymousClass1F9 r5, C122626Rc r6, AnonymousClass118 r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, C18600wl r12) {
        C122616Rb r0;
        C18070vi.A0w(r7, r8, r9, r10, r11);
        C18070vi.A0d(r12, 6);
        this.A05 = r9;
        this.A04 = r10;
        this.A03 = r11;
        this.A07 = r12;
        this.A02 = r6;
        this.A08 = r5;
        Context context = r7.A00;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(r6.dimenResId);
        this.A00 = dimensionPixelSize;
        if (((float) dimensionPixelSize) > C72463Mc.A00(context) * 96.0f) {
            r0 = C122616Rb.A02;
        } else {
            r0 = C122616Rb.A03;
        }
        this.A01 = r0;
        this.A06 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C148527ha(r8));
    }

    public final String A00(C122616Rb r4, AiHomeBot aiHomeBot) {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        this.A04.get();
        A10.append(C139536z0.A00(r4, aiHomeBot));
        if (r4 == C122616Rb.A02) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append('-');
            str = AnonymousClass000.A0y(this.A02.loaderName, A102);
        } else {
            str = "";
        }
        return AnonymousClass000.A0y(str, A10);
    }
}
