package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.DFn  reason: case insensitive filesystem */
public class C26831DFn implements C16890tO {
    public final DOZ A00;
    public final DFL A01;
    public final List A02;

    /* JADX INFO: finally extract failed */
    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        List list = this.A02;
        int size = list.size();
        int i = 0;
        while (i < size) {
            DFL A0G = AnonymousClass8BR.A0G(list, i);
            try {
                if (AnonymousClass0O7.A01.A02()) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("bindExtension: ");
                    AnonymousClass0O7.A01(C17880vN.A0t(A10, A0G.A05));
                }
                C25995CqB.A00().A05.A03(this.A00, A0G, this.A01, obj);
                BE9.A13();
                i++;
            } catch (Throwable th) {
                BE9.A13();
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        List list = this.A02;
        int size = list.size();
        int i = 0;
        while (i < size) {
            DFL A0G = AnonymousClass8BR.A0G(list, i);
            try {
                if (AnonymousClass0O7.A01.A02()) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("unbindExtension: ");
                    AnonymousClass0O7.A01(C17880vN.A0t(A10, A0G.A05));
                }
                C25995CqB.A00().A05.A04(this.A00, A0G, this.A01, obj);
                BE9.A13();
                i++;
            } catch (Throwable th) {
                BE9.A13();
                throw th;
            }
        }
    }

    public C26831DFn(DOZ doz, DFL dfl, List list) {
        this.A00 = doz;
        this.A02 = list;
        this.A01 = dfl;
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
