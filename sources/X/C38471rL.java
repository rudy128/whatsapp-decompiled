package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.1rL  reason: invalid class name and case insensitive filesystem */
public abstract class C38471rL implements View.OnClickListener {
    public long A00;

    public void A04(View view) {
        int i;
        if (this instanceof C449125g) {
            C449125g r1 = (C449125g) this;
            if (r1.A00 != 0) {
                ConversationsFragment conversationsFragment = (ConversationsFragment) r1.A01;
                AnonymousClass1L9 r4 = conversationsFragment.A0e;
                Context context = view.getContext();
                conversationsFragment.A3c.get();
                Context context2 = view.getContext();
                Intent intent = new Intent();
                intent.setClassName(context2.getPackageName(), "com.whatsapp.conversationslist.ArchivedConversationsActivity");
                r4.A08(context, intent);
                AnonymousClass18K r3 = conversationsFragment.A27;
                C81333z4 r12 = new C81333z4();
                r12.A02 = "Archive";
                r12.A00 = null;
                r3.CC7(r12);
                return;
            }
            Fragment fragment = (Fragment) r1.A01;
            if (fragment.A1D() instanceof C23311Fn) {
                ((C23311Fn) fragment.A1D()).CNH();
                return;
            }
            return;
        }
        AnonymousClass2PA r6 = (AnonymousClass2PA) this;
        C453328n r5 = r6.A03;
        List list = C42011xT.A0I;
        AnonymousClass1CJ r0 = r5.A06;
        GroupJid groupJid = r6.A04;
        if (!r0.A0P(groupJid) || !r5.A07.A0J(groupJid)) {
            r5.A04.CAv(groupJid, new AnonymousClass3AT((AnonymousClass1FU) AnonymousClass1L9.A01(r6.A01, AnonymousClass1FU.class), 0), r6.A00);
            i = 2;
        } else {
            C32111gf r2 = r5.A04;
            Context context3 = r6.A01;
            C18070vi.A0b(context3);
            r2.CAt(context3, groupJid, r6.A00);
            i = 1;
        }
        r5.A0D.CGF(new C21470Akb((Object) r5, i, 30, (Object) r6.A02));
    }

    public void onClick(View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.A00 > 1000) {
            this.A00 = elapsedRealtime;
            A04(view);
        }
    }
}
