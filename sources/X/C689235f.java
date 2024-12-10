package X;

import com.whatsapp.HomeActivity;

/* renamed from: X.35f  reason: invalid class name and case insensitive filesystem */
public class C689235f implements C23571Gu {
    public final int A00;
    public final Object A01;

    public C689235f(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean BlE() {
        String str;
        if (this.A00 != 0) {
            ((AnonymousClass1FO) this.A01).A36();
            return true;
        }
        HomeActivity homeActivity = (HomeActivity) this.A01;
        AnonymousClass1Bd r5 = homeActivity.A02;
        int i = homeActivity.A00;
        if (i == 300) {
            str = "status";
        } else if (i == 400) {
            str = "calls";
        } else if (i == 600) {
            str = "community";
        } else if (i != 700) {
            str = "chat";
        } else {
            str = "biz_tools";
        }
        if (r5.A04 != null) {
            if (C18020vd.A05(C18040vf.A02, r5.A0E, 1807)) {
                r5.A04.A0A("tabs", str, true);
            }
        }
        homeActivity.A02.A03();
        return false;
    }

    public /* synthetic */ void BmV() {
    }
}
