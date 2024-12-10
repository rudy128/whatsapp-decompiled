package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;
import com.whatsapp.group.ExitGroupsDialogFragment;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4b3  reason: invalid class name */
public class AnonymousClass4b3 implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public AnonymousClass4b3(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A01 = i;
        this.A03 = obj3;
        this.A04 = obj;
        this.A05 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        if (this.A00 != 0) {
            ExitGroupsDialogFragment exitGroupsDialogFragment = (ExitGroupsDialogFragment) this.A02;
            int i2 = this.A01;
            List list = (List) this.A03;
            Object obj = this.A04;
            String str2 = this.A05;
            C18070vi.A0d(list, 2);
            Log.i("ExitGroupsDialogFragment/user-try-leaveGroup");
            AnonymousClass11E r0 = exitGroupsDialogFragment.A01;
            if (r0 != null) {
                if (r0.A09()) {
                    AnonymousClass1KB r2 = exitGroupsDialogFragment.A00;
                    if (r2 != null) {
                        if (i2 != 1) {
                            r2.A0J(new C70813Cp(7, (Object) r2, true));
                            if (i2 == 2) {
                                if (exitGroupsDialogFragment.A0E != null) {
                                    Intent addFlags = AnonymousClass1LU.A02(exitGroupsDialogFragment.A14()).addFlags(603979776);
                                    C18070vi.A0X(addFlags);
                                    exitGroupsDialogFragment.A1k(addFlags);
                                } else {
                                    str = "waIntents";
                                }
                            }
                        }
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            AnonymousClass1BI A0Q = C17880vN.A0Q(it);
                            C17900vP.A0Y(A0Q, "ExitGroupsDialogFragment/exit/group:", AnonymousClass000.A10());
                            AnonymousClass1NN r02 = exitGroupsDialogFragment.A08;
                            if (r02 == null) {
                                break;
                            }
                            r02.A03(A0Q, true);
                            exitGroupsDialogFragment.A04.CGF(new C98824rm(obj, exitGroupsDialogFragment, A0Q, str2, i2, 8));
                        }
                        str = "conversationObservers";
                    }
                    str = "globalUI";
                } else {
                    AnonymousClass1KB r1 = exitGroupsDialogFragment.A00;
                    if (r1 != null) {
                        r1.A08(2131890316, 0);
                    }
                    str = "globalUI";
                }
                C19830z4 r3 = exitGroupsDialogFragment.A05;
                if (r3 != null) {
                    C17900vP.A0M(r3, "delete_chat_count", C17890vO.A00(C17890vO.A0B(r3), "delete_chat_count") + list.size());
                    if (i2 == 1) {
                        AnonymousClass1NN r03 = exitGroupsDialogFragment.A08;
                        if (r03 != null) {
                            r03.A01(2);
                        }
                        str = "conversationObservers";
                    }
                    exitGroupsDialogFragment.A28();
                    return;
                }
                str = "waSharedPreferences";
            } else {
                str = "connectivityStateProvider";
            }
            C18070vi.A11(str);
            throw null;
        }
        SingleChoiceListDialogFragment singleChoiceListDialogFragment = (SingleChoiceListDialogFragment) this.A02;
        boolean[] zArr = (boolean[]) this.A03;
        int i3 = this.A01;
        String[] strArr = (String[]) this.A04;
        String str3 = this.A05;
        int i4 = i;
        if (zArr == null || zArr[i]) {
            singleChoiceListDialogFragment.A01.C5j(strArr, i3, i4);
            singleChoiceListDialogFragment.A02.set(true);
            dialogInterface.dismiss();
        } else if (str3 != null) {
            singleChoiceListDialogFragment.A00.A0G(str3, 0);
        }
    }
}
