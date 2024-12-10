package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.group.GroupMembersSelector;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.48t  reason: invalid class name and case insensitive filesystem */
public class C825448t extends A34 {
    public final /* synthetic */ GroupMembersSelector A00;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        if (obj != null) {
            GroupMembersSelector groupMembersSelector = this.A00;
            View A0D = AnonymousClass3MY.A0D(LayoutInflater.from(groupMembersSelector), 2131626075);
            C73203Rj A002 = AnonymousClass4a6.A00(groupMembersSelector);
            A002.A0E(2131889431);
            A002.A0S(groupMembersSelector.getString(2131889430));
            A002.A0c(A0D);
            C010105w create = A002.create();
            TextView A0J = AnonymousClass3MW.A0J(A0D, 2131428579);
            TextView A0J2 = AnonymousClass3MW.A0J(A0D, 2131428580);
            TextView A0J3 = AnonymousClass3MW.A0J(A0D, 2131428581);
            A0J.setText(2131897886);
            AnonymousClass3Ma.A1F(A0J, this, obj, create, 7);
            A0J2.setText(2131889088);
            C90044dR.A00(A0J2, this, 6);
            A0J3.setText(2131898766);
            C90014dO.A00(A0J3, this, create, 38);
            A0J3.setVisibility(0);
            create.show();
            C88474Zv.A01((C88474Zv) groupMembersSelector.A08.get(), 8);
            return;
        }
        GroupMembersSelector.A0z(this.A00, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C825448t(GroupMembersSelector groupMembersSelector) {
        super(groupMembersSelector, true);
        this.A00 = groupMembersSelector;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        GroupMembersSelector groupMembersSelector = this.A00;
        AnonymousClass1MZ r2 = groupMembersSelector.A03;
        AnonymousClass1E8 A0P = AnonymousClass3MY.A0P(groupMembersSelector);
        A0P.getClass();
        UserJid userJid = (UserJid) A0P.A0J;
        userJid.getClass();
        Iterator it = r2.A08.A0G(userJid).iterator();
        while (it.hasNext()) {
            AnonymousClass1E9 r5 = (AnonymousClass1E9) it.next();
            if ((r5 instanceof AnonymousClass1EC) && AnonymousClass3MZ.A1X(groupMembersSelector.A06.A0H(r5))) {
                C63872tp A0B = groupMembersSelector.A04.A0B(r5);
                int A06 = A0B.A06();
                List list = groupMembersSelector.A0i;
                if (A06 == list.size() + 1) {
                    C199410f A07 = A0B.A07();
                    Iterator it2 = list.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        if (A07.contains(C72473Md.A0X(it2))) {
                            i++;
                        }
                    }
                    if (i == list.size()) {
                        return r5;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }
}
