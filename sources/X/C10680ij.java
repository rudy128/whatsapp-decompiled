package X;

import java.util.List;

/* renamed from: X.0ij  reason: invalid class name and case insensitive filesystem */
public final class C10680ij extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass09H this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10680ij(AnonymousClass09H r2) {
        super(1);
        this.this$0 = r2;
    }

    /* renamed from: A00 */
    public final Boolean invoke(List list) {
        boolean z;
        C26227CvJ A08 = AnonymousClass09H.A00(this.this$0).A08();
        if (A08 != null) {
            C27069DRu A03 = A08.A0N().A03();
            C26251Cvq A02 = C26251Cvq.A02(this.this$0.A05, C05100Qk.A05);
            C25283Ccg A0N = A08.A0N();
            List A082 = A0N.A08();
            int A00 = A0N.A00();
            boolean A09 = A0N.A09();
            int A01 = A0N.A01();
            list.add(A08.A0O(new C25283Ccg(A03, A02, A0N.A05(), A0N.A06(), A0N.A07(), A082, A00, A01, A0N.A02(), A09), A08.A00));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
