package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.AeA  reason: case insensitive filesystem */
public class C21080AeA implements C108165bE {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C21080AeA(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void Byx() {
        switch (this.A00) {
            case 0:
                AnonymousClass3MW.A1V(this.A01);
                return;
            case 1:
                AnonymousClass3MW.A1V(this.A01);
                return;
            default:
                AnonymousClass3MW.A1V(this.A01);
                return;
        }
    }

    public void C11(boolean z) {
        AnonymousClass1FU r2;
        AnonymousClass11C r4;
        AnonymousClass1E7 r7;
        AnonymousClass10I r9;
        C33251iW r3;
        C24001Il r8;
        C19830z4 r5;
        AnonymousClass1NN r6;
        switch (this.A00) {
            case 0:
                Log.i("conversations/delete-list");
                ConversationsFragment.DeleteBroadcastListDialogFragment deleteBroadcastListDialogFragment = (ConversationsFragment.DeleteBroadcastListDialogFragment) this.A01;
                deleteBroadcastListDialogFragment.A28();
                r2 = (AnonymousClass1FU) deleteBroadcastListDialogFragment.A1B();
                r4 = deleteBroadcastListDialogFragment.A03;
                r7 = (AnonymousClass1E7) this.A02;
                r9 = deleteBroadcastListDialogFragment.A08;
                r3 = deleteBroadcastListDialogFragment.A00;
                r8 = (C24001Il) deleteBroadcastListDialogFragment.A09.get();
                r5 = deleteBroadcastListDialogFragment.A05;
                r6 = deleteBroadcastListDialogFragment.A06;
                break;
            case 1:
                Log.i("conversations/delete-contact");
                ConversationsFragment.DeleteContactDialogFragment deleteContactDialogFragment = (ConversationsFragment.DeleteContactDialogFragment) this.A01;
                deleteContactDialogFragment.A29();
                r2 = (AnonymousClass1FU) deleteContactDialogFragment.A1B();
                r4 = deleteContactDialogFragment.A03;
                r7 = (AnonymousClass1E7) this.A02;
                r9 = deleteContactDialogFragment.A08;
                r3 = deleteContactDialogFragment.A00;
                r8 = (C24001Il) deleteContactDialogFragment.A09.get();
                r5 = deleteContactDialogFragment.A05;
                r6 = deleteContactDialogFragment.A06;
                break;
            default:
                Log.i("conversations/user-deleteGroup");
                ConversationsFragment.DeleteGroupDialogFragment deleteGroupDialogFragment = (ConversationsFragment.DeleteGroupDialogFragment) this.A01;
                deleteGroupDialogFragment.A28();
                r2 = (AnonymousClass1FU) deleteGroupDialogFragment.A1B();
                r4 = deleteGroupDialogFragment.A03;
                r7 = (AnonymousClass1E7) this.A02;
                r9 = deleteGroupDialogFragment.A09;
                r3 = deleteGroupDialogFragment.A00;
                r8 = (C24001Il) deleteGroupDialogFragment.A0A.get();
                r5 = deleteGroupDialogFragment.A05;
                r6 = deleteGroupDialogFragment.A06;
                break;
        }
        AnonymousClass4GS.A00(r2, r3, r4, r5, r6, r7, r8, r9, z);
    }
}
