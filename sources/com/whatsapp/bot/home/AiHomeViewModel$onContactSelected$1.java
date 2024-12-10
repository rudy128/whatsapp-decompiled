package com.whatsapp.bot.home;

import X.AnonymousClass000;
import X.AnonymousClass11P;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.AnonymousClass8B7;
import X.C1401970i;
import X.C143307Cw;
import X.C18070vi;
import X.C18460wS;
import X.C20125A8k;
import X.C25741Pl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C446324e;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBot;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBotImpl;
import com.whatsapp.jid.UserJid;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.home.AiHomeViewModel$onContactSelected$1", f = "AiHomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AiHomeViewModel$onContactSelected$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass8B7 $contact;
    public int label;
    public final /* synthetic */ AiHomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiHomeViewModel$onContactSelected$1(AnonymousClass8B7 r2, AiHomeViewModel aiHomeViewModel, C30391dr r4) {
        super(2, r4);
        this.$contact = r2;
        this.this$0 = aiHomeViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AiHomeViewModel$onContactSelected$1(this.$contact, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1BI r8;
        String str;
        String str2;
        String str3;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C143307Cw r3 = (C143307Cw) this.$contact;
            long A01 = AnonymousClass11P.A01((AnonymousClass11P) this.this$0.A0D.get());
            C18070vi.A0d(r3, 0);
            AiHomeBot aiHomeBot = r3.A00;
            String str4 = null;
            if (!(aiHomeBot == null || (r8 = r3.A01) == null)) {
                UserJid userJid = (UserJid) r8;
                AiHomeBotImpl.Persona BX1 = aiHomeBot.BX1();
                if (BX1 == null || (str = BX1.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) == null) {
                    str = "";
                }
                List A02 = C1401970i.A02(r3);
                if (A02 == null) {
                    A02 = C18460wS.A00;
                }
                AiHomeBotImpl.Persona BX12 = aiHomeBot.BX1();
                if (BX12 != null) {
                    str2 = BX12.A0F("full_image_url");
                } else {
                    str2 = null;
                }
                String A012 = C1401970i.A01(r3);
                C18460wS r21 = C18460wS.A00;
                C20125A8k a8k = (C20125A8k) aiHomeBot;
                boolean A0G = a8k.A0G("is_meta_created");
                Class<AiHomeBotImpl.Creator> cls = AiHomeBotImpl.Creator.class;
                C20125A8k A09 = a8k.A09(cls, "creator");
                if (A09 != null) {
                    str3 = A09.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                } else {
                    str3 = null;
                }
                C20125A8k A092 = a8k.A09(cls, "creator");
                if (A092 != null) {
                    str4 = A092.A0F("profile_uri");
                }
                ((C25741Pl) this.this$0.A0C.get()).A02(new C446324e(userJid, (Boolean) null, str, "", "", "", str2, A012, (String) null, str3, str4, (String) null, A02, r21, 0, a8k.A00.optInt("social_signal_message_count"), 0, A01, false, A0G));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AiHomeViewModel$onContactSelected$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
