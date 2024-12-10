package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.1k3  reason: invalid class name and case insensitive filesystem */
public abstract class C34171k3 {
    public void A00(AnonymousClass1BI r5) {
        C45882Ca r1 = (C45882Ca) this;
        switch (r1.A00) {
            case 0:
                C18070vi.A0d(r5, 0);
                if (C22971Dz.A0d(r5)) {
                    C37641pt r12 = (C37641pt) r1.A01;
                    Map map = r12.A0C;
                    if (map.containsKey(r5.user)) {
                        Boolean valueOf = Boolean.valueOf(((C26241Rj) r12.A08.get()).A0E(r5));
                        Map map2 = r12.A0A;
                        if (!C18070vi.A18(valueOf, map2.get(r5))) {
                            map2.put(r5, valueOf);
                            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) map.get(r5.user);
                            if (wDSProfilePhoto == null) {
                                return;
                            }
                            if (C18070vi.A18(map2.get(r5), true)) {
                                C18070vi.A11("greenDotBadge");
                                throw null;
                            } else {
                                wDSProfilePhoto.setProfileBadge((C39241sk) null);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ((C40631v1) r1.A01).A00.A0U(r5);
                return;
            default:
                ConversationsFragment.A0m((ConversationsFragment) r1.A01, Collections.singletonList(r5));
                return;
        }
    }

    public void A01(UserJid userJid, String str) {
    }
}
