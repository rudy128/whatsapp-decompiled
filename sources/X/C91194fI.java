package X;

import android.content.Intent;
import android.view.MenuItem;
import com.whatsapp.contact.contactform.ContactFormActivity;
import com.whatsapp.contact.contactform.Hilt_DeleteContactDialog;
import com.whatsapp.conversation.ConversationSearchFragment;

/* renamed from: X.4fI  reason: invalid class name and case insensitive filesystem */
public class C91194fI implements AnonymousClass03O {
    public final int A00;
    public final Object A01;

    public C91194fI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [com.whatsapp.contact.contactform.DeleteContactDialog, com.whatsapp.contact.contactform.Hilt_DeleteContactDialog, androidx.fragment.app.DialogFragment] */
    public final boolean onMenuItemClick(MenuItem menuItem) {
        AnonymousClass3UY r1;
        Integer num;
        if (this.A00 != 0) {
            ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) this.A01;
            int itemId = menuItem.getItemId();
            if (itemId == 2131427522) {
                r1 = conversationSearchFragment.A02;
                if (r1 == null) {
                    return true;
                }
                num = AnonymousClass00R.A01;
            } else if (itemId != 2131427521 || (r1 = conversationSearchFragment.A02) == null) {
                return true;
            } else {
                num = AnonymousClass00R.A0C;
            }
            r1.A0T(num);
            return true;
        }
        ContactFormActivity contactFormActivity = (ContactFormActivity) this.A01;
        int A012 = AnonymousClass3MY.A01(menuItem, 1);
        if (A012 == 2131429886) {
            int i = 2131899289;
            if (contactFormActivity.A00 == 1) {
                i = 2131899290;
            }
            AnonymousClass4TM r12 = new AnonymousClass4TM(new AnonymousClass4bA(contactFormActivity, 10), i);
            ? hilt_DeleteContactDialog = new Hilt_DeleteContactDialog();
            hilt_DeleteContactDialog.A00 = r12;
            contactFormActivity.CMl(hilt_DeleteContactDialog);
            return true;
        } else if (A012 != 2131427591) {
            return true;
        } else {
            C19880zA r0 = contactFormActivity.A01;
            if (r0 != null) {
                Intent A002 = C1408473h.A00(contactFormActivity, r0, true);
                A002.addFlags(67108864);
                contactFormActivity.startActivity(A002);
                return true;
            }
            C18070vi.A11("smbActivities");
            throw null;
        }
    }
}
