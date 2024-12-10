package X;

import android.widget.TextView;
import com.whatsapp.group.GroupChangedParticipantsBottomSheet;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.49N  reason: invalid class name */
public final class AnonymousClass49N extends A34 {
    public final C24921Me A00;
    public final C18000vb A01;
    public final String A02;
    public final WeakReference A03;
    public final List A04;
    public final /* synthetic */ GroupChangedParticipantsBottomSheet A05;

    public AnonymousClass49N(C24921Me r3, C18000vb r4, GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet, GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet2, String str, List list) {
        C18070vi.A0d(list, 5);
        this.A05 = groupChangedParticipantsBottomSheet;
        this.A00 = r3;
        this.A01 = r4;
        ArrayList A13 = AnonymousClass000.A13();
        this.A04 = A13;
        this.A03 = AnonymousClass3MW.A0z(groupChangedParticipantsBottomSheet2);
        A13.addAll(list);
        this.A02 = str;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        String str = this.A02;
        if (str == null || str.length() == 0) {
            return this.A04;
        }
        ArrayList A13 = AnonymousClass000.A13();
        C18000vb r5 = this.A01;
        ArrayList A032 = C20103A7h.A03(r5, str);
        C18070vi.A0X(A032);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 A0O = C17880vN.A0O(it);
            if (this.A00.A0l(A0O, A032) || C20103A7h.A04(r5, A0O.A0c, A032, true)) {
                A13.add(A0O);
            }
        }
        return A13;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        String str;
        String str2;
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet = (GroupChangedParticipantsBottomSheet) this.A03.get();
        if (groupChangedParticipantsBottomSheet != null && !groupChangedParticipantsBottomSheet.A1D().isFinishing()) {
            C73493We r2 = groupChangedParticipantsBottomSheet.A0A;
            if (r2 == null) {
                str = "adapter";
            } else {
                String str3 = groupChangedParticipantsBottomSheet.A0C;
                r2.A01 = list;
                C18000vb r0 = r2.A02.A09;
                if (r0 != null) {
                    ArrayList A032 = C20103A7h.A03(r0, str3);
                    C18070vi.A0X(A032);
                    r2.A00 = A032;
                    r2.notifyDataSetChanged();
                    C28931bI A002 = C28931bI.A00(groupChangedParticipantsBottomSheet.A17(), 2131434939);
                    if (!list.isEmpty() || (str2 = groupChangedParticipantsBottomSheet.A0C) == null || str2.length() == 0) {
                        A002.A04(8);
                        return;
                    }
                    ((TextView) AnonymousClass3MY.A0I(A002, 0)).setText(AnonymousClass3MX.A16(groupChangedParticipantsBottomSheet, groupChangedParticipantsBottomSheet.A0C, AnonymousClass3MW.A1a(), 0, 2131895497));
                    return;
                }
                str = "whatsAppLocale";
            }
            C18070vi.A11(str);
            throw null;
        }
    }
}
