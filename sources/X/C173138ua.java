package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.group.NotificationCommunityOwnerUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.group.enums.GraphQLXWA2GroupParticipantRole;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.8ua  reason: invalid class name and case insensitive filesystem */
public final class C173138ua extends AnonymousClass2SE {
    public final AnonymousClass11P A00;
    public final AnonymousClass126 A01;

    public void A02(C172768tz r24) {
        String str;
        Long l;
        UserJid userJid;
        long parseLong;
        C172768tz r2 = r24;
        C18070vi.A0d(r2, 0);
        C42941yz r1 = AnonymousClass1EC.A01;
        C20125A8k a8k = r2.A00;
        Class<NotificationCommunityOwnerUpdateResponseImpl.Xwa2NotifyGroupOnParticipantsRolesChange> cls = NotificationCommunityOwnerUpdateResponseImpl.Xwa2NotifyGroupOnParticipantsRolesChange.class;
        AnonymousClass1EC A02 = r1.A02(a8k.A09(cls, "xwa2_notify_group_on_participants_roles_change").A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        C22941Dw r3 = UserJid.Companion;
        C20125A8k A09 = a8k.A09(cls, "xwa2_notify_group_on_participants_roles_change").A09(NotificationCommunityOwnerUpdateResponseImpl.Xwa2NotifyGroupOnParticipantsRolesChange.UpdatedBy.class, "updated_by");
        Enum enumR = null;
        if (A09 != null) {
            str = A09.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        } else {
            str = null;
        }
        UserJid A04 = r3.A04(str);
        String A0F = a8k.A09(cls, "xwa2_notify_group_on_participants_roles_change").A0F("update_time");
        if (A0F == null || (l = Long.valueOf(parseLong)) == null || (parseLong = Long.parseLong(A0F)) <= 0) {
            l = AnonymousClass8BU.A0l(this.A00);
        }
        long longValue = l.longValue();
        AnonymousClass1IX A0A = a8k.A09(cls, "xwa2_notify_group_on_participants_roles_change").A0A(NotificationCommunityOwnerUpdateResponseImpl.Xwa2NotifyGroupOnParticipantsRolesChange.RoleUpdates.class, "role_updates");
        C18070vi.A0X(A0A);
        C20125A8k a8k2 = (C20125A8k) C29431cG.A0c(A0A);
        if (a8k2 != null) {
            try {
                userJid = C22941Dw.A03(a8k2.A00.optString("user_jid"));
            } catch (Throwable th) {
                Log.e(C17900vP.A0C("Failed to parse UserJid due to: ", AnonymousClass000.A10(), th), th);
                userJid = null;
            }
        } else {
            userJid = null;
        }
        if (!(A02 == null || userJid == null)) {
            if (a8k2 != null) {
                enumR = a8k2.A0D(GraphQLXWA2GroupParticipantRole.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "new_role");
            }
            if (enumR == GraphQLXWA2GroupParticipantRole.SUPERADMIN_MEMBER) {
                AnonymousClass126 r10 = this.A01;
                C17900vP.A0m("groupmgr/onCommunityOwnershipChanged/ownership changed time:", AnonymousClass000.A10(), longValue);
                AnonymousClass1EC A002 = ((C58632l0) r10.A0n.get()).A00(A02);
                C17960vV.A0F(AnonymousClass000.A1W(A002), "groupmgr/onCommunityOwnershipChanged/null CAG");
                if (A002 == null) {
                    r10.A03.A0G("groupmgr/onCommunityOwnershipChanged", AnonymousClass000.A0y(" has a null CAG", C17890vO.A0f(A02)), false);
                    return;
                }
                r10.A0Y(A02, A002, userJid, A04, longValue, true);
                r10.A0Y(A002, A002, userJid, A04, longValue, false);
                if (r10.A05.A0O(A04)) {
                    AnonymousClass3MW.A0Z(r10.A0m).A0O(A02, true);
                    return;
                }
                return;
            }
        }
        C17900vP.A0X(a8k2, "NotificationCommunityOwnerHandler/handleNotification/unexpected input:", AnonymousClass000.A10());
    }

    public C173138ua(AnonymousClass11P r1, AnonymousClass126 r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public Class A00() {
        return NotificationCommunityOwnerUpdateResponseImpl.class;
    }

    public String A01() {
        return "NotificationCommunityOwnerUpdate";
    }
}
