package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment;
import com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity;
import com.whatsapp.conversation.ConversationSearchFragment;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.util.Log;

/* renamed from: X.4et  reason: invalid class name and case insensitive filesystem */
public class C90944et implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;

    public C90944et(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2;
        AnonymousClass3UY r1;
        switch (this.A00) {
            case 0:
                EncryptionKeyFragment encryptionKeyFragment = (EncryptionKeyFragment) this.A01;
                if (i != 0) {
                    return false;
                }
                EncBackupViewModel encBackupViewModel = encryptionKeyFragment.A01;
                if (encBackupViewModel == null) {
                    AnonymousClass3MW.A1H();
                    throw null;
                }
                encBackupViewModel.A0W();
                return false;
            case 1:
                C75093dz r2 = (C75093dz) this.A01;
                if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                    if (r2 instanceof ChatLockCreateSecretCodeActivity) {
                        i2 = 5;
                    } else {
                        i2 = 6;
                    }
                    if (i != i2) {
                        return true;
                    }
                }
                if (!r2.A4c().isEnabled()) {
                    return true;
                }
                r2.A4c().callOnClick();
                return true;
            case 2:
                ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) this.A01;
                if (i != 3 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
                    return false;
                }
                r1 = conversationSearchFragment.A02;
                if (r1 == null) {
                    return true;
                }
                break;
            case 3:
                C91094f8 r22 = (C91094f8) this.A01;
                if (i == 3 || (keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0)) {
                    r1 = ((AnonymousClass4aY) r22.A01).A2Z;
                    break;
                } else {
                    return false;
                }
            case 4:
                C108515bp r12 = (C108515bp) this.A01;
                if (i != 6) {
                    return false;
                }
                Log.i("MediaCaptionDialog/dismiss/send");
                r12.onDismiss();
                return true;
            case 5:
                TokenizedSearchInput tokenizedSearchInput = (TokenizedSearchInput) this.A01;
                if (tokenizedSearchInput.A0F == null || !AnonymousClass3Ma.A1b(tokenizedSearchInput.A0g, i)) {
                    return false;
                }
                tokenizedSearchInput.A0F.C4j();
                return true;
            case 6:
                C22821Di r13 = (C22821Di) this.A01;
                if (i != 3) {
                    return true;
                }
                r13.invoke(AnonymousClass3Ma.A13(textView));
                return true;
            default:
                return false;
        }
        r1.A0T(AnonymousClass00R.A00);
        return true;
    }
}
