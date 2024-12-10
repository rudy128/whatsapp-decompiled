package X;

import android.os.Bundle;
import com.whatsapp.group.NewGroupRouter;
import java.util.List;

/* renamed from: X.4Gr  reason: invalid class name and case insensitive filesystem */
public abstract class C83794Gr {
    public static final NewGroupRouter A00(AnonymousClass1EC r9, String str, List list, List list2, int i, boolean z, boolean z2, boolean z3) {
        String str2;
        NewGroupRouter newGroupRouter = new NewGroupRouter();
        Bundle A0D = C17880vN.A0D();
        A0D.putStringArrayList("preselected_jids", C22971Dz.A0B(list));
        String str3 = null;
        if (r9 != null) {
            str2 = r9.getRawString();
        } else {
            str2 = null;
        }
        A0D.putString("parent_group", str2);
        A0D.putBoolean("duplicate_ug_found", z);
        A0D.putInt("entry_point", i);
        A0D.putBoolean("create_lazily", false);
        AnonymousClass3MY.A17(A0D, "preselected_jids", list);
        if (r9 != null) {
            str3 = r9.getRawString();
        }
        A0D.putString("parent_group", str3);
        A0D.putBoolean("duplicate_ug_found", z);
        A0D.putInt("entry_point", i);
        A0D.putBoolean("include_captions", z2);
        A0D.putString("appended_message", str);
        A0D.putBoolean("create_lazily", false);
        A0D.putBoolean("optional_participants", z3);
        if (list2 != null && !list2.isEmpty()) {
            Bundle A0D2 = C17880vN.A0D();
            AnonymousClass4aU.A0C(A0D2, list2);
            A0D.putBundle("optional_messages", A0D2);
        }
        newGroupRouter.A1R(A0D);
        return newGroupRouter;
    }
}
