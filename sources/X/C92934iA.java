package X;

import android.app.Activity;
import com.whatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4iA  reason: invalid class name and case insensitive filesystem */
public class C92934iA implements C107105Yk {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C92934iA(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final void CQ7() {
        switch (this.A00) {
            case 0:
                ((C37551pj) this.A01).A0I((Activity) this.A02, (UserJid) this.A03);
                return;
            case 1:
                SharePhoneNumberBottomSheet sharePhoneNumberBottomSheet = (SharePhoneNumberBottomSheet) this.A01;
                Activity activity = (Activity) this.A02;
                AOI aoi = (AOI) this.A03;
                C18070vi.A0j(activity, aoi);
                AnonymousClass00H r0 = sharePhoneNumberBottomSheet.A02;
                if (r0 != null) {
                    C37551pj A0V = AnonymousClass3MW.A0V(r0);
                    C22941Dw r02 = UserJid.Companion;
                    UserJid A012 = C22941Dw.A01(AnonymousClass3MW.A0h(sharePhoneNumberBottomSheet.A04));
                    C17960vV.A07(A012);
                    C18070vi.A0X(A012);
                    A0V.A0F(activity, aoi, A012);
                    return;
                }
                C18070vi.A11("blockListManager");
                throw null;
            default:
                AnonymousClass4VP r03 = (AnonymousClass4VP) this.A01;
                r03.A02.A0F(r03.A01, (C72073Kn) this.A02, (UserJid) this.A03);
                return;
        }
    }
}
