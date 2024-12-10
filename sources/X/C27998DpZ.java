package X;

import android.content.res.Resources;

/* renamed from: X.DpZ  reason: case insensitive filesystem */
public final class C27998DpZ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C24163BwW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27998DpZ(C24163BwW bwW) {
        super(1);
        this.this$0 = bwW;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        C25777Clo clo = (C25777Clo) obj;
        C24163BwW bwW = this.this$0;
        C18070vi.A0b(clo);
        AnonymousClass1FU r3 = (AnonymousClass1FU) AnonymousClass1L9.A01(bwW.A01, AnonymousClass1FU.class);
        Integer num = clo.A01;
        if (num != null) {
            int A00 = bwW.A05.A00();
            int intValue = num.intValue();
            i = 2131890329;
            if (intValue != 1) {
                i = 2131890328;
                if (intValue != 2) {
                    if (intValue == 3) {
                        AnonymousClass1KB r32 = bwW.A02;
                        Resources resources = bwW.getResources();
                        Object[] objArr = new Object[1];
                        C17880vN.A1T(objArr, A00, 0);
                        r32.A0G(resources.getQuantityString(2131755090, A00, objArr), 0);
                    } else if (intValue == 5) {
                        bwW.A02.A08(2131892940, 0);
                    }
                    return C27621Wu.A00;
                }
            }
            r3.CMx((Integer) null, Integer.valueOf(i), (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (Object[]) null);
            return C27621Wu.A00;
        }
        i = 2131890983;
        r3.CMx((Integer) null, Integer.valueOf(i), (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (Object[]) null);
        return C27621Wu.A00;
    }
}
