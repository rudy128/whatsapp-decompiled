package X;

import com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity;

/* renamed from: X.4ja  reason: invalid class name and case insensitive filesystem */
public class C93814ja implements C72213Lb {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C93814ja(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public /* synthetic */ void Bnj() {
        if (this.A00 != 0) {
            ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity = (ChatLockRequestAuthInterstitialActivity) this.A02;
            ChatLockRequestAuthInterstitialActivity.A0Q(chatLockRequestAuthInterstitialActivity);
            chatLockRequestAuthInterstitialActivity.finish();
        }
    }

    public void Bog() {
        if (this.A00 != 0) {
            Object obj = this.A01;
            ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity = (ChatLockRequestAuthInterstitialActivity) this.A02;
            if (obj != null) {
                chatLockRequestAuthInterstitialActivity.setResult(2);
            } else {
                ChatLockRequestAuthInterstitialActivity.A0Q(chatLockRequestAuthInterstitialActivity);
            }
            chatLockRequestAuthInterstitialActivity.finish();
            return;
        }
        AnonymousClass4X3.A00((AnonymousClass4X3) this.A02, (AnonymousClass1BI) this.A01);
    }
}
