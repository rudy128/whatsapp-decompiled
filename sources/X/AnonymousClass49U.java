package X;

import android.content.res.Resources;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.49U  reason: invalid class name */
public class AnonymousClass49U extends A34 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass1FU A01;
    public final /* synthetic */ C33251iW A02;
    public final /* synthetic */ AnonymousClass11C A03;
    public final /* synthetic */ C19830z4 A04;
    public final /* synthetic */ AnonymousClass1NN A05;
    public final /* synthetic */ C24001Il A06;
    public final /* synthetic */ WeakReference A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass49U(AnonymousClass1F9 r2, AnonymousClass1FU r3, C33251iW r4, AnonymousClass11C r5, C19830z4 r6, AnonymousClass1NN r7, C24001Il r8, WeakReference weakReference, List list, long j, boolean z) {
        super(r2, true);
        this.A08 = list;
        this.A02 = r4;
        this.A09 = z;
        this.A00 = j;
        this.A07 = weakReference;
        this.A04 = r6;
        this.A06 = r8;
        this.A05 = r7;
        this.A01 = r3;
        this.A03 = r5;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        List list = this.A08;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 A0O = C17880vN.A0O(it);
            C33251iW r4 = this.A02;
            AnonymousClass1BI A0g = C72463Mc.A0g(A0O);
            boolean z = this.A09;
            boolean z2 = true;
            if (list.size() <= 1) {
                z2 = false;
            }
            r4.A0X(A0g, z, z2);
        }
        AnonymousClass1FU.A0X(this.A00, 300);
        return null;
    }

    public void A0H(Object obj) {
        AnonymousClass1FU r1 = (AnonymousClass1FU) this.A07.get();
        if (r1 != null && !r1.isFinishing()) {
            r1.CEx();
        }
        C19830z4 r3 = this.A04;
        int A002 = C17890vO.A00(C17890vO.A0B(r3), "delete_chat_count");
        List list = this.A08;
        C17900vP.A0M(r3, "delete_chat_count", A002 + list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0l = C72453Mb.A0l(it);
            if (A0l != null) {
                C24001Il r12 = this.A06;
                if (r12.A0A()) {
                    C17890vO.A0r(r12, A0l, 26);
                }
            }
        }
        this.A05.A01(0);
        Log.i("conversations/bulk-deleted");
        AnonymousClass1FU r6 = this.A01;
        AnonymousClass11C r5 = this.A03;
        Resources resources = r6.getResources();
        int size = list.size();
        Object[] A1a = AnonymousClass3MW.A1a();
        C17880vN.A1T(A1a, list.size(), 0);
        AnonymousClass1Y5.A00(r6, r5, resources.getQuantityString(2131755032, size, A1a));
    }
}
