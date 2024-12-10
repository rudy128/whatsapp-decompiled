package X;

import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;
import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4rT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98634rT implements Runnable {
    public final /* synthetic */ BlockReasonListFragment A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C22811Dh A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public final void run() {
        String str;
        Integer num;
        BlockReasonListFragment blockReasonListFragment = this.A00;
        String str2 = this.A01;
        C22811Dh r9 = this.A03;
        boolean z = this.A04;
        String str3 = this.A02;
        boolean z2 = this.A05;
        C18070vi.A0d(r9, 2);
        C87904Xn r1 = blockReasonListFragment.A0C;
        if (r1 != null) {
            UserJid userJid = blockReasonListFragment.A0A;
            if (userJid == null) {
                C18070vi.A11("userJid");
                throw null;
            }
            r1.A01(userJid);
            AnonymousClass1FU r14 = (AnonymousClass1FU) C72453Mb.A0Z(blockReasonListFragment);
            AnonymousClass3XH r0 = blockReasonListFragment.A03;
            if (r0 == null) {
                C18070vi.A11("adapter");
                throw null;
            }
            C87014Ty r02 = (C87014Ty) C29431cG.A0f(r0.A02, r0.A00);
            if (r02 != null) {
                str = r02.A01;
                if ("scam".equalsIgnoreCase(str) || "impersonation".equalsIgnoreCase(str)) {
                    str = "other";
                }
            } else {
                str = null;
            }
            AnonymousClass3XH r03 = blockReasonListFragment.A03;
            if (r03 == null) {
                C18070vi.A11("adapter");
                throw null;
            }
            C87014Ty r12 = (C87014Ty) C29431cG.A0f(r03.A02, r03.A00);
            AnonymousClass3XH r04 = blockReasonListFragment.A03;
            if (r04 == null) {
                C18070vi.A11("adapter");
                throw null;
            }
            String obj = r04.A01.toString();
            if (r12 != null) {
                String str4 = r12.A01;
                if ("scam".equalsIgnoreCase(str4) || "impersonation".equalsIgnoreCase(str4)) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append('[');
                    A10.append(str4);
                    obj = AnonymousClass000.A0y("]:", A10);
                    if (obj == null) {
                        obj = "";
                    }
                }
            }
            BlockReasonListViewModel blockReasonListViewModel = (BlockReasonListViewModel) blockReasonListFragment.A0J.getValue();
            AnonymousClass3XH r05 = blockReasonListFragment.A03;
            if (r05 == null) {
                C18070vi.A11("adapter");
                throw null;
            }
            int i = r05.A00;
            Integer valueOf = Integer.valueOf(i);
            C87014Ty r06 = (C87014Ty) C29431cG.A0f(r05.A02, i);
            if (r06 != null) {
                num = r06.A00;
            } else {
                num = null;
            }
            boolean z3 = r9.element;
            C18070vi.A0d(r14, 0);
            C22941Dw r07 = UserJid.Companion;
            UserJid A032 = C22941Dw.A03(str3);
            AnonymousClass1E7 A0H = blockReasonListViewModel.A05.A0H(A032);
            String str5 = null;
            if (obj != null && !AnonymousClass1YF.A0T(obj)) {
                str5 = obj;
            }
            C61552ps r8 = (C61552ps) blockReasonListViewModel.A0D.get();
            if (z) {
                C61552ps.A00(r8, A032, str2, 3);
            } else {
                C61552ps.A00(r8, A032, str2, C18070vi.A17(str2, A032) ? 1 : 0);
            }
            blockReasonListViewModel.A03.A0J(new C98674rX(r14, blockReasonListViewModel, A0H, valueOf, num, str, str5, str2, z2, z, z3));
            if (z2) {
                C18030ve r08 = blockReasonListFragment.A02;
                C18070vi.A0W(r08);
                if (!AnonymousClass3MX.A1X(r08)) {
                    AnonymousClass1KB r2 = blockReasonListFragment.A02;
                    if (r2 != null) {
                        r2.A0J(new C21445AkC(blockReasonListFragment, 13));
                    } else {
                        C18070vi.A11("globalUi");
                        throw null;
                    }
                }
            }
        } else {
            C18070vi.A11("shareReportOrBlockToMetaHelper");
            throw null;
        }
    }

    public /* synthetic */ C98634rT(BlockReasonListFragment blockReasonListFragment, String str, String str2, C22811Dh r4, boolean z, boolean z2) {
        this.A00 = blockReasonListFragment;
        this.A01 = str;
        this.A03 = r4;
        this.A04 = z;
        this.A02 = str2;
        this.A05 = z2;
    }
}
