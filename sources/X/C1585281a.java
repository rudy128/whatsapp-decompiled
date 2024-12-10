package X;

import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.81a  reason: invalid class name and case insensitive filesystem */
public final class C1585281a extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ UpdatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1585281a(UpdatesFragment updatesFragment) {
        super(1);
        this.this$0 = updatesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C132706nQ r8 = (C132706nQ) obj;
        C18070vi.A0d(r8, 0);
        UpdatesFragment updatesFragment = this.this$0;
        C132696nP r6 = r8.A02;
        if (!C108945cZ.A1U(r6.A00)) {
            List list = r8.A03;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(list));
            for (Object next : list) {
                AnonymousClass205 r0 = ((AnonymousClass206) next).A0v;
                C18070vi.A0W(r0);
                linkedHashMap.put(r0, next);
            }
            StringBuilder A10 = AnonymousClass000.A10();
            C17890vO.A15("\n        UpdatesFragment/updateParamsForMessageUndo Message state changed: \n        total no of messages: ", A10, list);
            A10.append("\n        message state: ");
            A10.append(r6);
            Log.i(AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n        ", A10)));
            Iterator it = r6.A02.iterator();
            while (true) {
                if (it.hasNext()) {
                    AnonymousClass206 r2 = (AnonymousClass206) linkedHashMap.get(it.next());
                    if (r2 != null) {
                        AnonymousClass00H r02 = updatesFragment.A0t;
                        if (r02 == null) {
                            break;
                        }
                        ((C41751x0) r02.get()).A05(updatesFragment.A14(), r2);
                    }
                } else if (r8.A00()) {
                    for (Object obj2 : r6.A03) {
                        AnonymousClass206 r22 = (AnonymousClass206) linkedHashMap.get(obj2);
                        if (r22 != null) {
                            AnonymousClass00H r03 = updatesFragment.A0t;
                            if (r03 != null) {
                                ((C41751x0) r03.get()).A06(updatesFragment.A14(), r22, updatesFragment);
                            }
                        }
                    }
                }
            }
            C18070vi.A11("statusUndoHandlerLazy");
            throw null;
        }
        return C27621Wu.A00;
    }
}
