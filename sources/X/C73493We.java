package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupChangedParticipantsBottomSheet;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3We  reason: invalid class name and case insensitive filesystem */
public final class C73493We extends C38391rD {
    public ArrayList A00;
    public List A01 = AnonymousClass000.A13();
    public final /* synthetic */ GroupChangedParticipantsBottomSheet A02;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        List list = C42011xT.A0I;
        GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet = this.A02;
        return new AnonymousClass3ZL(AnonymousClass3MX.A0B(groupChangedParticipantsBottomSheet.A16(), viewGroup, 2131625490, false), groupChangedParticipantsBottomSheet);
    }

    public C73493We(GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet) {
        this.A02 = groupChangedParticipantsBottomSheet;
    }

    public int A0Q() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        String str;
        AnonymousClass3ZL r82 = (AnonymousClass3ZL) r8;
        C18070vi.A0d(r82, 0);
        AnonymousClass1E7 r3 = (AnonymousClass1E7) this.A01.get(i);
        C42141xh r1 = r82.A01;
        ArrayList arrayList = this.A00;
        if (arrayList != null) {
            r1.A0A(r3, arrayList);
            GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet = this.A02;
            C37451pZ r12 = groupChangedParticipantsBottomSheet.A07;
            if (r12 != null) {
                r12.A07(r82.A00, r3);
            }
            C24921Me r13 = groupChangedParticipantsBottomSheet.A06;
            if (r13 != null) {
                if (!r13.A0j(r3, -1) || r3.A0c == null) {
                    r82.A02.A04(8);
                } else {
                    C28931bI r2 = r82.A02;
                    r2.A02().getLayoutParams().width = -1;
                    View A022 = r2.A02();
                    C18000vb r0 = groupChangedParticipantsBottomSheet.A09;
                    if (r0 != null) {
                        A022.setTextAlignment(C72453Mb.A05(AnonymousClass3MW.A1Z(r0) ? 1 : 0));
                        View A0I = AnonymousClass3MY.A0I(r2, 0);
                        C18070vi.A0X(A0I);
                        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) A0I;
                        C24921Me r02 = groupChangedParticipantsBottomSheet.A06;
                        if (r02 != null) {
                            String A17 = AnonymousClass3MX.A17(r02, r3);
                            ArrayList arrayList2 = this.A00;
                            if (arrayList2 != null) {
                                textEmojiLabel.A0S(A17, arrayList2, 0, false);
                            }
                        }
                    } else {
                        str = "whatsAppLocale";
                        C18070vi.A11(str);
                        throw null;
                    }
                }
                r82.A0H.setTag(AnonymousClass1E7.A01(r3));
                return;
            }
            str = "waContactNames";
            C18070vi.A11(str);
            throw null;
        }
        C18070vi.A11("filterTerms");
        throw null;
    }
}
