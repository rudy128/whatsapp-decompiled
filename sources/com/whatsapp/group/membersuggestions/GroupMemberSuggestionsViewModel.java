package com.whatsapp.group.membersuggestions;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1BI;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass1OB;
import X.AnonymousClass1OR;
import X.AnonymousClass1OX;
import X.AnonymousClass4DU;
import X.AnonymousClass4GT;
import X.C17880vN;
import X.C17900vP;
import X.C18070vi;
import X.C18460wS;
import X.C18600wl;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30451dy;
import X.C41561wd;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C86854Ti;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

public final class GroupMemberSuggestionsViewModel extends AnonymousClass1J2 {
    public LinkedHashMap A00;
    public LinkedHashMap A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18600wl A05;
    public volatile AnonymousClass1OB A06;

    public final List A0T(List list) {
        Collection values;
        List A0v;
        StringBuilder A10;
        String str;
        C18070vi.A0d(list, 0);
        if (this.A00 == null) {
            try {
                AnonymousClass4GT.A00(AnonymousClass1OR.A00, new GroupMemberSuggestionsViewModel$getContacts$1(this, (C30391dr) null));
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    A10 = AnonymousClass000.A10();
                    str = "GroupMemberSuggestionsViewModel/getContacts/was interrupted: ";
                } else if (e instanceof CancellationException) {
                    A10 = AnonymousClass000.A10();
                    str = "GroupMemberSuggestionsViewModel/getContacts/was cancelled: ";
                } else {
                    throw e;
                }
                C17900vP.A0X(e, str, A10);
            }
        }
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C72473Md.A1N(A0D, it);
        }
        Set A12 = C29431cG.A12(A0D);
        LinkedHashMap linkedHashMap = this.A00;
        if (!(linkedHashMap == null || (values = linkedHashMap.values()) == null || (A0v = C29431cG.A0v(values, 5)) == null)) {
            Iterator it2 = A0v.iterator();
            while (it2.hasNext()) {
                C72463Mc.A1D(C17880vN.A0O(it2), A12);
            }
            return A0v;
        }
        return C18460wS.A00;
    }

    public final void A0U(Set set, int i) {
        C18070vi.A0d(set, 1);
        Log.i("GroupMemberSuggestionsViewModel/loadSuggestions/Starts");
        if (this.A06 == null && this.A00 == null) {
            AnonymousClass1OX A002 = C41561wd.A00(this);
            this.A06 = C30451dy.A02(AnonymousClass00R.A00, this.A05, new GroupMemberSuggestionsViewModel$loadSuggestions$1(this, set, (C30391dr) null, i), A002);
        }
    }

    public static final Integer A00(GroupMemberSuggestionsViewModel groupMemberSuggestionsViewModel, AnonymousClass4DU r2, AnonymousClass1BI r3) {
        C86854Ti r0;
        LinkedHashMap linkedHashMap = groupMemberSuggestionsViewModel.A01;
        if (linkedHashMap == null || (r0 = (C86854Ti) linkedHashMap.get(r2)) == null) {
            return null;
        }
        List list = r0.A01;
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0D.add(C72453Mb.A0l(it));
        }
        return Integer.valueOf(A0D.indexOf(r3));
    }

    public GroupMemberSuggestionsViewModel(AnonymousClass1M9 r1, AnonymousClass00H r2, AnonymousClass00H r3, C18600wl r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A02 = r1;
        this.A04 = r2;
        this.A03 = r3;
        this.A05 = r4;
    }
}
