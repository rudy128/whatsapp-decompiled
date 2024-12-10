package androidx.credentials.playservices;

import X.AnonymousClass000;
import X.AnonymousClass11G;
import X.C17900vP;
import X.C18070vi;
import X.C22821Di;
import X.C23028Ba4;
import X.C27621Wu;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

public final class HiddenActivity$handleBeginSignIn$1$1 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $requestCode;
    public final /* synthetic */ HiddenActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HiddenActivity$handleBeginSignIn$1$1(HiddenActivity hiddenActivity, int i) {
        super(1);
        this.this$0 = hiddenActivity;
        this.$requestCode = i;
    }

    public final void invoke(C23028Ba4 ba4) {
        try {
            HiddenActivity hiddenActivity = this.this$0;
            hiddenActivity.mWaitingForActivityResult = true;
            hiddenActivity.startIntentSenderForResult(ba4.A00.getIntentSender(), this.$requestCode, (Intent) null, 0, 0, 0, (Bundle) null);
        } catch (IntentSender.SendIntentException e) {
            HiddenActivity hiddenActivity2 = this.this$0;
            ResultReceiver resultReceiver = hiddenActivity2.resultReceiver;
            C18070vi.A0b(resultReceiver);
            hiddenActivity2.setupFailure(resultReceiver, CredentialProviderBaseController.GET_UNKNOWN, C17900vP.A0C("During begin sign in, one tap ui intent sender failure: ", AnonymousClass000.A10(), e));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C23028Ba4) obj);
        return C27621Wu.A00;
    }
}
