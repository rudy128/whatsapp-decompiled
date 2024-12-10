package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl;
import com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode;
import com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupMemberAddMode;
import com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupParticipantRole;
import com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupState;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashMap;

public abstract class A95 {
    public static final int A01(GraphQLXWA2GroupMemberAddMode graphQLXWA2GroupMemberAddMode) {
        int ordinal;
        if (graphQLXWA2GroupMemberAddMode == null) {
            ordinal = -1;
        } else {
            ordinal = graphQLXWA2GroupMemberAddMode.ordinal();
        }
        if (ordinal == -1) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal == 2 || ordinal == 0) {
            return 0;
        }
        throw AnonymousClass3MW.A14();
    }

    public static final String A0B(GraphQLXWA2GroupAddressingMode graphQLXWA2GroupAddressingMode) {
        int ordinal;
        if (graphQLXWA2GroupAddressingMode == null) {
            ordinal = -1;
        } else {
            ordinal = graphQLXWA2GroupAddressingMode.ordinal();
        }
        if (ordinal == -1 || ordinal == 1 || ordinal == 0) {
            return "pn";
        }
        if (ordinal == 2) {
            return "lid";
        }
        throw AnonymousClass3MW.A14();
    }

    public static final LinkedHashMap A0C(GroupCommonFragmentImpl.Participants participants) {
        C18070vi.A0d(participants, 0);
        if (participants.A0G("participants_phash_match")) {
            return null;
        }
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass1IX A0J = C108955ca.A0J(participants, GroupCommonFragmentImpl.Participants.Edges.class, "edges");
        C18070vi.A0X(A0J);
        Iterator it = A0J.iterator();
        while (it.hasNext()) {
            C20125A8k A0V = C108945cZ.A0V(it);
            C22941Dw r0 = UserJid.Companion;
            Class<GroupCommonFragmentImpl.Participants.Edges.Node> cls = GroupCommonFragmentImpl.Participants.Edges.Node.class;
            UserJid A03 = C22941Dw.A03(C20125A8k.A08(C108985cd.A0I(A0V, cls, "node")));
            String str = null;
            AnonymousClass1E2 r7 = null;
            PhoneUserJid phoneUserJid = null;
            Enum A0D = A0V.A0D(GraphQLXWA2GroupParticipantRole.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "role");
            C18070vi.A0X(A0D);
            int A04 = C108955ca.A04((GraphQLXWA2GroupParticipantRole) A0D, 0);
            String str2 = "";
            if (A04 != 1) {
                if (A04 == 2) {
                    str2 = "admin";
                } else if (A04 == 3) {
                    str2 = "superadmin";
                } else if (A04 != 0) {
                    throw AnonymousClass3MW.A14();
                }
            }
            String A0F = C108985cd.A0I(A0V, cls, "node").A0F("lid");
            if (A0F != null) {
                C42501yH r02 = AnonymousClass1E2.A01;
                r7 = C42501yH.A00(A0F);
            }
            String A0F2 = C108985cd.A0I(A0V, cls, "node").A0F("display_name");
            if (A0F2 != null) {
                str = A0F2;
            }
            String A0F3 = C108985cd.A0I(A0V, cls, "node").A0F("pn");
            if (A0F3 != null) {
                C22951Dx r03 = PhoneUserJid.Companion;
                phoneUserJid = C22951Dx.A00(A0F3);
            }
            A13.put(A03, C61202pI.A00(A03, r7, phoneUserJid, str, str2));
        }
        return A13;
    }

    public static int A00(C20125A8k a8k) {
        return A01((GraphQLXWA2GroupMemberAddMode) a8k.A0E(GraphQLXWA2GroupMemberAddMode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "member_add_mode"));
    }

    public static final long A02(GroupCommonFragmentImpl groupCommonFragmentImpl) {
        return C20099A7c.A02(C72453Mb.A0z(groupCommonFragmentImpl, "creation_time"));
    }

    public static final AnonymousClass1EC A04(GroupCommonFragmentImpl groupCommonFragmentImpl) {
        C42941yz r0 = AnonymousClass1EC.A01;
        return C42941yz.A01(C72453Mb.A0z(groupCommonFragmentImpl, PublicKeyCredentialControllerUtility.JSON_KEY_ID));
    }

    public static final PhoneUserJid A05(GroupCommonFragmentImpl groupCommonFragmentImpl) {
        String A0F;
        C20125A8k A09 = groupCommonFragmentImpl.A09(GroupCommonFragmentImpl.Creator.class, "creator");
        if (A09 == null || (A0F = A09.A0F("pn")) == null) {
            return null;
        }
        return PhoneUserJid.Companion.A03(A0F);
    }

    public static final UserJid A07(GroupCommonFragmentImpl groupCommonFragmentImpl) {
        String A08;
        C20125A8k A09 = groupCommonFragmentImpl.A09(GroupCommonFragmentImpl.Creator.class, "creator");
        if (A09 == null || (A08 = C20125A8k.A08(A09)) == null) {
            return null;
        }
        return C22941Dw.A02(A08);
    }

    public static final C42661yX A09(GroupCommonFragmentImpl groupCommonFragmentImpl) {
        UserJid userJid;
        String A0F;
        String A0F2;
        C20125A8k A09 = groupCommonFragmentImpl.A09(GroupCommonFragmentImpl.Description.class, "description");
        if (A09 != null) {
            String A0F3 = A09.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            long A03 = C20099A7c.A03(A09.A0F("creation_time"));
            Class<GroupCommonFragmentImpl.Description.Creator> cls = GroupCommonFragmentImpl.Description.Creator.class;
            C20125A8k A092 = A09.A09(cls, "creator");
            PhoneUserJid phoneUserJid = null;
            if (A092 == null || (A0F2 = A092.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) == null) {
                userJid = null;
            } else {
                userJid = C22941Dw.A02(A0F2);
            }
            String A0z = C72453Mb.A0z(A09, "value");
            C20125A8k A093 = A09.A09(cls, "creator");
            if (!(A093 == null || (A0F = A093.A0F("pn")) == null)) {
                phoneUserJid = PhoneUserJid.Companion.A04(A0F);
            }
            return new C42661yX(phoneUserJid, userJid, A0F3, A0z, A03);
        }
        C42661yX r4 = C42661yX.A05;
        C18070vi.A0Z(r4);
        return r4;
    }

    public static final C29741cn A0A(Boolean bool) {
        if (bool == null) {
            return null;
        }
        return new C29741cn(bool.booleanValue() ? 1 : 0, 0);
    }

    public static final boolean A0E(GroupCommonFragmentImpl groupCommonFragmentImpl) {
        Enum A0D = groupCommonFragmentImpl.A0D(GraphQLXWA2GroupState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "state");
        C18070vi.A0X(A0D);
        return AnonymousClass000.A1Z(A0D, GraphQLXWA2GroupState.SUSPENDED);
    }

    public static final long A03(GroupCommonFragmentImpl groupCommonFragmentImpl) {
        String str;
        GroupCommonFragmentImpl.Subject A0I = groupCommonFragmentImpl.A0I();
        if (A0I != null) {
            str = A0I.A0F("creation_time");
        } else {
            str = null;
        }
        return C20099A7c.A02(str);
    }

    public static final PhoneUserJid A06(GroupCommonFragmentImpl groupCommonFragmentImpl) {
        C20125A8k A09;
        String A0F;
        GroupCommonFragmentImpl.Subject A0I = groupCommonFragmentImpl.A0I();
        if (A0I == null || (A09 = A0I.A09(GroupCommonFragmentImpl.Subject.Creator.class, "creator")) == null || (A0F = A09.A0F("pn")) == null) {
            return null;
        }
        return PhoneUserJid.Companion.A03(A0F);
    }

    public static final UserJid A08(GroupCommonFragmentImpl groupCommonFragmentImpl) {
        C20125A8k A09;
        GroupCommonFragmentImpl.Subject A0I = groupCommonFragmentImpl.A0I();
        if (A0I == null || (A09 = A0I.A09(GroupCommonFragmentImpl.Subject.Creator.class, "creator")) == null) {
            return null;
        }
        return UserJid.Companion.A04(C20125A8k.A08(A09));
    }

    public static LinkedHashMap A0D(GroupCommonFragmentImpl groupCommonFragmentImpl) {
        return A0C(groupCommonFragmentImpl.A0H());
    }
}
