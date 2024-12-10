package X;

import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.SearchFragment;

/* renamed from: X.4i2  reason: invalid class name and case insensitive filesystem */
public class C92864i2 implements AnonymousClass1M6 {
    public final int A00;
    public final Object A01;

    public C92864i2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bmw(UserJid userJid) {
        switch (this.A00) {
            case 0:
                if (userJid != null) {
                    BusinessProfileExtraFieldsActivity businessProfileExtraFieldsActivity = (BusinessProfileExtraFieldsActivity) this.A01;
                    if (userJid.equals(businessProfileExtraFieldsActivity.A09)) {
                        businessProfileExtraFieldsActivity.A01.A0D(new C92824hy(businessProfileExtraFieldsActivity, 0), businessProfileExtraFieldsActivity.A09);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A01;
                if (userJid.equals(C22941Dw.A02(C72453Mb.A0u(contactInfoActivity))) && contactInfoActivity.A0i.A0C != null) {
                    ContactInfoActivity.A1F(contactInfoActivity, false, false);
                    return;
                }
                return;
            case 2:
                C18070vi.A0d(userJid, 0);
                C75433hU r1 = (C75433hU) this.A01;
                if (r1.A0G(userJid)) {
                    r1.A0I();
                    return;
                }
                return;
            case 3:
                AnonymousClass4aY r3 = (AnonymousClass4aY) this.A01;
                if (userJid != null && userJid.equals(r3.A3R)) {
                    r3.A4c.CGF(new C98794rj((Object) this, 45));
                    r3.A2Q.invalidateOptionsMenu();
                    AnonymousClass8F7 r0 = r3.A1c;
                    if (r0 != null) {
                        r0.A0V();
                        return;
                    }
                    return;
                }
                return;
            default:
                SearchFragment.A03(userJid, (SearchFragment) this.A01);
                return;
        }
    }

    public /* synthetic */ void Bmt(UserJid userJid) {
    }
}
