package com.whatsapp.usercontrol.protocol;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1MD;
import X.AnonymousClass1OS;
import X.AnonymousClass1OZ;
import X.AnonymousClass3MW;
import X.AnonymousClass7RC;
import X.AnonymousClass9MQ;
import X.C108945cZ;
import X.C108955ca;
import X.C108995ce;
import X.C128786gg;
import X.C173538vF;
import X.C173548vG;
import X.C173558vH;
import X.C17890vO;
import X.C18070vi;
import X.C27621Wu;
import X.C29591cX;
import X.C29601cY;
import X.C29621ca;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usercontrol.protocol.UpdatePreferenceProtocolApi$sendUpdatePreference$2", f = "UpdatePreferenceProtocolApi.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatePreferenceProtocolApi$sendUpdatePreference$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isInterested;
    public final /* synthetic */ String $preference;
    public final /* synthetic */ UserJid $userJid;
    public int label;
    public final /* synthetic */ C128786gg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatePreferenceProtocolApi$sendUpdatePreference$2(UserJid userJid, C128786gg r3, String str, C30391dr r5, boolean z) {
        super(2, r5);
        this.this$0 = r3;
        this.$userJid = userJid;
        this.$isInterested = z;
        this.$preference = str;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C128786gg r2 = this.this$0;
        return new UpdatePreferenceProtocolApi$sendUpdatePreference$2(this.$userJid, r2, this.$preference, r8, this.$isInterested);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        boolean A0h;
        String str2;
        Object obj2 = obj;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj2);
            String A0T = C17890vO.A0T(this.this$0.A01);
            UserJid userJid = this.$userJid;
            boolean z = this.$isInterested;
            String str3 = this.$preference;
            C18070vi.A0d(userJid, 1);
            C18070vi.A0d(str3, 3);
            if (z) {
                str = "interested";
            } else {
                str = "not_interested";
            }
            String[] strArr = new String[2];
            strArr[0] = "set_preference";
            List A0O = C18070vi.A0O("unset_preference", strArr, 1);
            String[] strArr2 = new String[3];
            strArr2[0] = "interested";
            strArr2[1] = "no_preference";
            List A0O2 = C18070vi.A0O("not_interested", strArr2, 2);
            C29591cX A0Y = C108955ca.A0Y();
            C29591cX.A01(A0Y, "xmlns", "w:biz:msg_feedback");
            C108995ce.A1E(A0Y);
            C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
            if (C29601cY.A04(A0T, 0, 9007199254740991L, false)) {
                C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T);
            }
            C29591cX A0t = C108945cZ.A0t("user_feedback");
            A0t.A04(new AnonymousClass1MD((Jid) userJid, "jid"));
            A0t.A09(str3, "action", A0O);
            A0t.A08(str, "feedback", A0O2);
            C29621ca A00 = C29591cX.A00(A0t, A0Y);
            this.label = 1;
            obj2 = ((AnonymousClass1OZ) C18070vi.A0E(this.this$0.A01)).A0A(A00, A0T, this, 454, 32000, false);
            if (obj2 == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj2);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass9MQ r3 = (AnonymousClass9MQ) obj2;
        if (r3 instanceof C173548vG) {
            A0h = true;
            str2 = null;
        } else if (r3 instanceof C173538vF) {
            C29621ca r32 = ((C173538vF) r3).A00;
            C108945cZ.A0a(this.this$0.A00).A0J(AnonymousClass7RC.A00(this.this$0, 47));
            A0h = AnonymousClass000.A0h();
            str2 = String.valueOf(r32);
        } else if (r3 instanceof C173558vH) {
            A0h = AnonymousClass000.A0h();
            str2 = "DeliveryFailure";
        } else {
            throw AnonymousClass3MW.A14();
        }
        return AnonymousClass1D6.A01(A0h, str2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UpdatePreferenceProtocolApi$sendUpdatePreference$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
