package X;

import android.content.DialogInterface;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.Collections;

/* renamed from: X.2uN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64192uN implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass1GP A00;
    public final /* synthetic */ AnonymousClass1F9 A01;
    public final /* synthetic */ AnonymousClass1FR A02;
    public final /* synthetic */ C34511kb A03;
    public final /* synthetic */ C34591kk A04;
    public final /* synthetic */ AnonymousClass1E7 A05;
    public final /* synthetic */ AnonymousClass1EC A06;
    public final /* synthetic */ AnonymousClass10I A07;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass1FR r6 = this.A02;
        AnonymousClass10I r5 = this.A07;
        AnonymousClass1F9 r8 = this.A01;
        C34591kk r10 = this.A04;
        C34511kb r9 = this.A03;
        AnonymousClass1EC r2 = this.A06;
        AnonymousClass1E7 r1 = this.A05;
        AnonymousClass1GP r4 = this.A00;
        r6.CNB(0, 2131895077);
        r5.CGD(new AnonymousClass2PS(new C91214fK(r6, r2, 0), r8, r9, r10, Collections.singleton(r2)), new Object[0]);
        ConversationsFragment.DeleteGroupDialogFragment deleteGroupDialogFragment = new ConversationsFragment.DeleteGroupDialogFragment();
        C43411zl.A01(deleteGroupDialogFragment, r1);
        deleteGroupDialogFragment.A15().putBoolean("chatContainsStarredMessages", false);
        deleteGroupDialogFragment.A2C(r4, (String) null);
    }

    public /* synthetic */ C64192uN(AnonymousClass1GP r1, AnonymousClass1F9 r2, AnonymousClass1FR r3, C34511kb r4, C34591kk r5, AnonymousClass1E7 r6, AnonymousClass1EC r7, AnonymousClass10I r8) {
        this.A02 = r3;
        this.A07 = r8;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r7;
        this.A05 = r6;
        this.A00 = r1;
    }
}
