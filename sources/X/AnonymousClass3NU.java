package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.AbsListView;
import com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;
import com.whatsapp.conversation.ConversationListView;
import java.util.Map;

/* renamed from: X.3NU  reason: invalid class name */
public class AnonymousClass3NU extends Handler {
    public final int A00;
    public final Object A01;

    public static AnonymousClass3NU A00(ConversationListView conversationListView) {
        conversationListView.A0M = true;
        conversationListView.A0P = true;
        return new AnonymousClass3NU(Looper.getMainLooper(), conversationListView, 3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3NU(Looper looper, Object obj, int i) {
        super(looper);
        this.A00 = i;
        this.A01 = obj;
    }

    public void handleMessage(Message message) {
        switch (this.A00) {
            case 0:
                int i = AnonymousClass4aN.A0X;
                C107845ai r0 = ((AnonymousClass4aN) this.A01).A02;
                if (r0 != null) {
                    r0.BmC();
                    sendEmptyMessageDelayed(0, (long) AnonymousClass4aN.A0X);
                    return;
                }
                return;
            case 1:
                C18070vi.A0d(message, 0);
                if (message.what == 0) {
                    VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = (VerifyTwoFactorAuthCodeDialogFragment) this.A01;
                    if (verifyTwoFactorAuthCodeDialogFragment.A00 == 0) {
                        Object obj = message.obj;
                        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.String");
                        verifyTwoFactorAuthCodeDialogFragment.A04.CGN(new C21452AkJ(15, (String) obj, verifyTwoFactorAuthCodeDialogFragment));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                C18070vi.A0d(message, 0);
                Object obj2 = message.obj;
                C18070vi.A0z(obj2, "null cannot be cast to non-null type com.whatsapp.protocol.FMessage");
                C67502zt r2 = (C67502zt) this.A01;
                Map map = r2.A06;
                AnonymousClass205 A0A = AnonymousClass25A.A0A((AnonymousClass206) obj2);
                C18070vi.A0X(A0A);
                AnonymousClass206 r02 = (AnonymousClass206) map.get(A0A);
                if (r02 != null) {
                    C67502zt.A00(r2, r02);
                    return;
                }
                return;
            case 3:
                C18070vi.A0d(message, 0);
                if (message.what == 0) {
                    ((ConversationListView) this.A01).A0B(true);
                }
                ((AbsListView) this.A01).setTranscriptMode(0);
                return;
            default:
                C18070vi.A0d(message, 0);
                Object obj3 = message.obj;
                C18070vi.A0z(obj3, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, kotlin.Int>");
                C87784Wy.A00((C87784Wy) this.A01, AnonymousClass000.A0M(((AnonymousClass1D6) obj3).second));
                return;
        }
    }
}
