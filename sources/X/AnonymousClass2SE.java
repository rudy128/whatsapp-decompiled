package X;

import android.util.Base64;
import com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationSideSubResponseImpl;
import com.whatsapp.infra.graphql.generated.usernames.UsernameUpdateNotificationResponseImpl;

/* renamed from: X.2SE  reason: invalid class name */
public abstract class AnonymousClass2SE {
    public C192659ol A00;
    public C36121nN A01;

    public Class A00() {
        if (this instanceof AnonymousClass2JV) {
            return UsernameUpdateNotificationResponseImpl.class;
        }
        return TextStatusUpdateNotificationSideSubResponseImpl.class;
    }

    public String A01() {
        if (this instanceof AnonymousClass2JV) {
            return "UsernameUpdateNotification";
        }
        return "TextStatusUpdateNotificationSideSub";
    }

    public void A02(C172768tz r6) {
        C62592re A02;
        AnonymousClass12E r1;
        if (this instanceof AnonymousClass2JV) {
            AnonymousClass2JV r3 = (AnonymousClass2JV) this;
            C18070vi.A0d(r6, 0);
            String optString = r6.A00.A09(UsernameUpdateNotificationResponseImpl.Xwa2NotifyUsernameOnUpdateSideSub.class, "xwa2_notify_username_on_update_side_sub").A00.optString("hash");
            C18070vi.A0X(optString);
            if (optString.length() != 0) {
                byte[] decode = Base64.decode(C18070vi.A1A(optString, C26571Sq.A05), 0);
                C18070vi.A0X(decode);
                C63212sh A002 = C63212sh.A00(AnonymousClass2R1.A0L);
                A002.A03 = true;
                A002.A00 = C62132qq.A0Q;
                A002.A03(decode);
                A02 = A002.A02();
                r1 = r3.A00;
            } else {
                return;
            }
        } else {
            AnonymousClass2JW r32 = (AnonymousClass2JW) this;
            C18070vi.A0d(r6, 0);
            if (C18020vd.A06(r32.A01)) {
                C20125A8k A09 = r6.A00.A09(TextStatusUpdateNotificationSideSubResponseImpl.Xwa2NotifyTextStatusOnUpdateSideSub.class, "xwa2_notify_text_status_on_update_side_sub");
                C199610h.A04(A09);
                C18070vi.A0X(A09);
                String optString2 = A09.A00.optString("hash");
                C18070vi.A0X(optString2);
                if (optString2.length() != 0) {
                    byte[] decode2 = Base64.decode(C18070vi.A1A(optString2, C26571Sq.A05), 0);
                    C63212sh A003 = C63212sh.A00(AnonymousClass2R1.A0L);
                    A003.A03 = true;
                    A003.A00 = C62132qq.A0P;
                    A003.A03(decode2);
                    A02 = A003.A02();
                    r1 = r32.A00;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        AnonymousClass12E.A00(r1, A02, true);
    }

    public void A03(C29621ca r7) {
        C192659ol r0 = this.A00;
        if (r0 != null) {
            Class A002 = A00();
            String A012 = A01();
            Object A013 = r0.A01(r7, A002, A012);
            if (!(A013 instanceof AnonymousClass1IU)) {
                C17900vP.A0f("BaseMexNotificationHandler/handleNotification: ", A012, AnonymousClass000.A10());
                A02((C172768tz) A013);
            }
            if (C30671eK.A00(A013) != null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("basemexnotificationhandler/handlenotificationjson failed to transform notification into expected type ");
                throw AnonymousClass1UI.A01(AnonymousClass001.A1H(A002.getName(), "", A10));
            }
            return;
        }
        C18070vi.A11("transformer");
        throw null;
    }
}
