package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.1px  reason: invalid class name and case insensitive filesystem */
public class C37681px {
    public final Context A00;
    public final AnonymousClass1KB A01;
    public final C34511kb A02;
    public final C203411t A03;
    public final C37661pv A04;
    public final AnonymousClass11P A05;
    public final C22621Co A06;
    public final C34591kk A07;
    public final C36741oO A08;
    public final AnonymousClass10I A09;
    public final C26811To A0A;
    public final AnonymousClass1M9 A0B;
    public final AnonymousClass126 A0C;
    public final AnonymousClass1Nb A0D;
    public final AnonymousClass00H A0E;

    public static void A00(AnonymousClass1GP r4, C37681px r5, AnonymousClass1BI r6, boolean z) {
        DialogFragment dialogFragment;
        AnonymousClass1E7 A0H = r5.A0B.A0H(r6);
        if (r4 != null) {
            if (A0H.A0F()) {
                StringBuilder sb = new StringBuilder();
                sb.append("conversations/delete/group:");
                sb.append(A0H);
                Log.i(sb.toString());
                if (r5.A0C.A0l()) {
                    r5.A01.A08(2131891166, 0);
                    return;
                }
                dialogFragment = new ConversationsFragment.DeleteGroupDialogFragment();
            } else if (C22971Dz.A0N(A0H.A0J)) {
                dialogFragment = new ConversationsFragment.DeleteBroadcastListDialogFragment();
            } else {
                r5.A09.CGD(new C49272Pv((DialogFragment) new ConversationsFragment.DeleteContactDialogFragment(), r4, r5.A07, A0H, z), new Object[0]);
                return;
            }
            C43411zl.A01(dialogFragment, A0H);
            dialogFragment.A15().putBoolean("chatContainsStarredMessages", z);
            dialogFragment.A2C(r4, (String) null);
        }
    }

    public void A02(AnonymousClass1BI r4, Integer num) {
        this.A06.A08(r4, num, true, false);
        this.A09.CGF(new C98714rb(this, r4, num, 41));
    }

    public boolean A03(AnonymousClass1BI r3) {
        if (!((C31191fA) this.A0E.get()).A0L() || C42701yb.A01(r3)) {
            return false;
        }
        return true;
    }

    public C37681px(Context context, AnonymousClass1KB r2, C34511kb r3, C203411t r4, C26811To r5, AnonymousClass1M9 r6, C37661pv r7, AnonymousClass11P r8, C22621Co r9, C34591kk r10, AnonymousClass126 r11, AnonymousClass1Nb r12, C36741oO r13, AnonymousClass10I r14, AnonymousClass00H r15) {
        this.A00 = context;
        this.A05 = r8;
        this.A01 = r2;
        this.A09 = r14;
        this.A06 = r9;
        this.A0A = r5;
        this.A0B = r6;
        this.A0C = r11;
        this.A0D = r12;
        this.A07 = r10;
        this.A08 = r13;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r7;
        this.A0E = r15;
    }

    public void A01(AnonymousClass1BI r4, long j) {
        if (!C22971Dz.A0c(r4)) {
            C26811To r2 = this.A0A;
            Set A062 = r2.A06(r4, true);
            if (this.A0D.A0c(r4, j) != null) {
                r2.A0R(A062);
            } else {
                r2.A0Q(A062);
            }
        }
    }
}
