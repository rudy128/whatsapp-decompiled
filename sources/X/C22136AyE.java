package X;

import com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.AyE  reason: case insensitive filesystem */
public final class C22136AyE extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BusinessApiBrowseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22136AyE(BusinessApiBrowseFragment businessApiBrowseFragment) {
        super(1);
        this.this$0 = businessApiBrowseFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        List<C174358we> list = (List) obj;
        BusinessApiBrowseFragment businessApiBrowseFragment = this.this$0;
        C173758vg r0 = businessApiBrowseFragment.A02;
        if (r0 != null) {
            r0.A0W(list);
            if (list == null) {
                Log.e("BusinessApiBrowseFragment/getTotalNumberOfBusinessProfileShown searchListItems cannot be null");
            } else {
                boolean z = C29431cG.A0d(list) instanceof C174098wE;
                int size = list.size();
                if (!z) {
                    size--;
                }
                if (size != 0) {
                    AnonymousClass0I4 r1 = businessApiBrowseFragment.A01;
                    if (r1 == null) {
                        str = "businessApiSearchLoggingEligibility";
                    } else if (r1.A00(businessApiBrowseFragment.A05)) {
                        A17 a17 = businessApiBrowseFragment.A03;
                        if (a17 != null) {
                            long j = (long) size;
                            int i = 0;
                            for (C174358we r12 : list) {
                                if ((r12 instanceof C174098wE) && ((C174098wE) r12).A00.A08 == 2) {
                                    i++;
                                }
                            }
                            a17.A02(j, 1, (long) i);
                        } else {
                            str = "businessApiSearchAnalyticsManager";
                        }
                    }
                }
            }
            return C27621Wu.A00;
        }
        str = "listAdapter";
        C18070vi.A11(str);
        throw null;
    }
}
