package X;

import com.whatsapp.accountswitching.AccountSwitchingContentProvider;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3Hy  reason: invalid class name and case insensitive filesystem */
public final class C71683Hy extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $makeActiveDirId;
    public final /* synthetic */ String $removeAccountDirId;
    public final /* synthetic */ AccountSwitchingContentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71683Hy(AccountSwitchingContentProvider accountSwitchingContentProvider, String str, String str2) {
        super(0);
        this.this$0 = accountSwitchingContentProvider;
        this.$removeAccountDirId = str;
        this.$makeActiveDirId = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C64012u4 A0J = AnonymousClass11G.A0J(this.this$0);
        String str = this.$removeAccountDirId;
        C17900vP.A0f("AccountSwitchingDataRepo/removeAccountByDirId/dirId=", str, AnonymousClass000.A10());
        C59692mj A01 = C64012u4.A01(A0J);
        ArrayList A04 = C64012u4.A04(A01);
        if (C64012u4.A03(str, A04) != null) {
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = A04.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!C64012u4.A09(str, ((C62562rb) next).A05)) {
                    A13.add(next);
                }
            }
            if (C64012u4.A08(C64012u4.A00(A01, A13), A0J)) {
                AnonymousClass11G.A0J(this.this$0).A0H(this.$makeActiveDirId);
                return C27621Wu.A00;
            }
        } else {
            Log.e("AccountSwitchingDataRepo/removeAccountByDirId/Account doesn't exist");
        }
        throw AnonymousClass000.A0n("Check failed.");
    }
}
