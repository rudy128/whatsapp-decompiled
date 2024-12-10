package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.jid.UserJid;
import java.util.LinkedList;

/* renamed from: X.Aj9  reason: case insensitive filesystem */
public class C21380Aj9 implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C21380Aj9(Object obj, Object obj2, Object obj3, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = str;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A05 = str2;
        this.A06 = str3;
    }

    public final void run() {
        if (this.A00 != 0) {
            A5U a5u = (A5U) this.A01;
            String str = this.A04;
            String str2 = this.A05;
            String str3 = this.A06;
            AnonymousClass1OS r4 = (AnonymousClass1OS) this.A03;
            UserJid A0F = AnonymousClass8BV.A0F((UserJid) this.A02, a5u.A05);
            Integer num = a5u.A02(str, AnonymousClass8BW.A07(a5u.A01, 4849)).A01;
            Integer num2 = AnonymousClass00R.A0C;
            C172058si A0T = AnonymousClass8BR.A0T(a5u.A03);
            int hashCode = str.hashCode();
            if (num != num2) {
                A0T.A07(hashCode, "metadata_cache_hit", false);
                AnonymousClass00H r6 = a5u.A04;
                int A0E = AnonymousClass8BR.A0U(r6).A0E(A0F, "screen_transition_integrity_check");
                AnonymousClass8BR.A0V(r6).A09(A0F, str2, str3, str, A0E);
                AnonymousClass8BR.A0V(r6).A07(A0E, "fetch_cache_hit", false);
                a5u.A04(new AS9(a5u, str, r4, A0E), A0F, Integer.valueOf(A0E), (String) null, (String) null, str, false);
                return;
            }
            A0T.A07(hashCode, "metadata_cache_hit", true);
            r4.invoke(true, (Object) null);
            return;
        }
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = (BusinessDirectoryContextualSearchViewModel) this.A01;
        String str4 = this.A04;
        C195699tl r8 = (C195699tl) this.A02;
        A1Z a1z = (A1Z) this.A03;
        String str5 = this.A05;
        String str6 = this.A06;
        LinkedList linkedList = businessDirectoryContextualSearchViewModel.A0f;
        synchronized (linkedList) {
            if (linkedList.isEmpty() && str4.equals(BusinessDirectoryContextualSearchViewModel.A05(businessDirectoryContextualSearchViewModel))) {
                businessDirectoryContextualSearchViewModel.A0B.removeCallbacks(businessDirectoryContextualSearchViewModel.A03);
                if (!r8.A09.isEmpty() || !r8.A06.isEmpty()) {
                    businessDirectoryContextualSearchViewModel.A0Q.A02(new C20288AEw(str4, System.currentTimeMillis()));
                }
                AP5 ap5 = businessDirectoryContextualSearchViewModel.A0P;
                C188769hx r0 = ap5.A09;
                r0.A0D = str5;
                r0.A0E = str6;
                r0.A08 = a1z;
                ap5.Bn0(r8);
            }
        }
    }
}
