package X;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.2va  reason: invalid class name and case insensitive filesystem */
public class C64942va implements AnonymousClass1XI {
    public final int A00;
    public final Object A01;

    public C64942va(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bv0(String str, Bundle bundle) {
        String string;
        C38391rD r1;
        if (this.A00 != 0) {
            RecyclerView recyclerView = ((ConversationsFragment) this.A01).A0O;
            if (recyclerView != null && (r1 = recyclerView.A0B) != null) {
                AnonymousClass28H r12 = (AnonymousClass28H) r1;
                r12.A0V(r12.A00);
                return;
            }
            return;
        }
        AnonymousClass1FS r4 = (AnonymousClass1FS) this.A01;
        C18070vi.A0d(bundle, 2);
        String string2 = bundle.getString("dialog_tag");
        if (string2 != null && (string = bundle.getString("action_type")) != null) {
            int hashCode = string.hashCode();
            if (hashCode != -1743220960) {
                if (hashCode != -997076054) {
                    if (hashCode == -297673372 && string.equals("negative_button_clicked")) {
                        r4.BkF(string2);
                    }
                } else if (string.equals("message_dialog_dismissed")) {
                    r4.Bjo(string2);
                }
            } else if (string.equals("positive_button_clicked")) {
                r4.CBt(string2);
            }
        }
    }
}
