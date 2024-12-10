package X;

import android.os.SystemClock;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4qV  reason: invalid class name and case insensitive filesystem */
public class C98054qV implements C108165bE {
    public final /* synthetic */ ConversationsFragment.BulkDeleteConversationDialogFragment A00;
    public final /* synthetic */ List A01;

    public C98054qV(ConversationsFragment.BulkDeleteConversationDialogFragment bulkDeleteConversationDialogFragment, List list) {
        this.A00 = bulkDeleteConversationDialogFragment;
        this.A01 = list;
    }

    public void Byx() {
        this.A00.A28();
    }

    public void C11(boolean z) {
        Log.i("conversations/bulk-delete");
        ConversationsFragment.BulkDeleteConversationDialogFragment bulkDeleteConversationDialogFragment = this.A00;
        bulkDeleteConversationDialogFragment.A28();
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass3MY.A1O(bulkDeleteConversationDialogFragment.A01, C17880vN.A0Q(it), A13);
        }
        AnonymousClass1FL A1B = bulkDeleteConversationDialogFragment.A1B();
        C17960vV.A07(A1B);
        AnonymousClass1FU r4 = (AnonymousClass1FU) A1B;
        AnonymousClass11C r7 = bulkDeleteConversationDialogFragment.A02;
        AnonymousClass10I r1 = bulkDeleteConversationDialogFragment.A07;
        C33251iW r6 = bulkDeleteConversationDialogFragment.A00;
        C24001Il A0j = AnonymousClass3MX.A0j(bulkDeleteConversationDialogFragment.A08);
        C19830z4 r8 = bulkDeleteConversationDialogFragment.A04;
        AnonymousClass1NN r9 = bulkDeleteConversationDialogFragment.A05;
        r4.CNA(2131895077);
        AnonymousClass1FU r5 = r4;
        r1.CGD(new AnonymousClass49U(r4, r5, r6, r7, r8, r9, A0j, AnonymousClass3MW.A0z(r4), A13, SystemClock.elapsedRealtime(), z), new Object[0]);
    }
}
