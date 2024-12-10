package X;

import android.content.res.Resources;

/* renamed from: X.Dpb  reason: case insensitive filesystem */
public final class C28000Dpb extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C23797Bpg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28000Dpb(C23797Bpg bpg) {
        super(1);
        this.this$0 = bpg;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1KB r1;
        int i;
        C25777Clo clo = (C25777Clo) obj;
        C23797Bpg bpg = this.this$0;
        C18070vi.A0b(clo);
        Integer num = clo.A01;
        if (num != null) {
            int A00 = bpg.A04.A00();
            AnonymousClass1FU r9 = (AnonymousClass1FU) AnonymousClass1L9.A01(bpg.A00, AnonymousClass1FU.class);
            int intValue = num.intValue();
            int i2 = 2131890329;
            if (intValue != 1) {
                i2 = 2131890328;
                if (intValue != 2) {
                    if (intValue == 3) {
                        AnonymousClass1KB r3 = bpg.A01;
                        Resources resources = bpg.getResources();
                        Object[] objArr = new Object[1];
                        C17880vN.A1T(objArr, A00, 0);
                        r3.A0G(resources.getQuantityString(2131755090, A00, objArr), 0);
                    } else if (intValue == 5) {
                        bpg.A01.A08(2131892940, 0);
                    }
                }
            }
            r9.CMx((Integer) null, Integer.valueOf(i2), (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (Object[]) null);
        }
        Integer num2 = clo.A00;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (intValue2 == 403) {
                r1 = bpg.A01;
                i = 2131890985;
            } else if (intValue2 != 406) {
                r1 = bpg.A01;
                i = 2131890983;
            } else {
                int A002 = bpg.A04.A00();
                AnonymousClass1KB r32 = bpg.A01;
                Resources resources2 = bpg.getResources();
                Object[] objArr2 = new Object[1];
                C17880vN.A1T(objArr2, A002, 0);
                r32.A0G(resources2.getQuantityString(2131755090, A002, objArr2), 0);
            }
            r1.A08(i, 0);
        }
        return C27621Wu.A00;
    }
}
