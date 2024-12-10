package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.safetycheck.ui.SafetyCheckBottomSheet;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.4fK  reason: invalid class name and case insensitive filesystem */
public class C91214fK implements C15950rT {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C91214fK(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final Object apply(Object obj) {
        String str;
        if (this.A00 != 0) {
            AnonymousClass1FR r3 = (AnonymousClass1FR) this.A01;
            SafetyCheckBottomSheet safetyCheckBottomSheet = (SafetyCheckBottomSheet) this.A02;
            C86844Th r12 = (C86844Th) obj;
            C18070vi.A0d(r12, 2);
            r3.CEx();
            AnonymousClass1EC r1 = safetyCheckBottomSheet.A0C;
            if (r1 != null) {
                C34511kb r0 = safetyCheckBottomSheet.A01;
                if (r0 != null) {
                    DialogFragment A002 = AnonymousClass4GA.A00(r0, r1, true);
                    if (A002 == null) {
                        AnonymousClass1EC r02 = safetyCheckBottomSheet.A0C;
                        if (r02 != null) {
                            A002 = C83754Gn.A00(r12.A01, "group_safety_check_bottom_sheet", C18070vi.A0P(r02), r12.A00, 2, true, false);
                        }
                    }
                    r3.CMl(A002);
                    return null;
                }
                str = "communityChatManager";
                C18070vi.A11(str);
                throw null;
            }
            str = "groupJid";
            C18070vi.A11(str);
            throw null;
        }
        AnonymousClass1FR r13 = (AnonymousClass1FR) this.A01;
        Object obj2 = this.A02;
        C86844Th r122 = (C86844Th) obj;
        r13.CEx();
        Set singleton = Collections.singleton(obj2);
        int i = r122.A00;
        AnonymousClass1EC r2 = r122.A01;
        int i2 = 0;
        if (r2 != null) {
            i2 = 2;
        }
        r13.CMk(C83754Gn.A00(r2, (String) null, singleton, i, i2, false, true), (String) null);
        return null;
    }
}
