package X;

import android.content.Context;

/* renamed from: X.4pv  reason: invalid class name and case insensitive filesystem */
public class C97714pv implements AnonymousClass1Bh {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C97714pv(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj;
        this.A02 = obj3;
    }

    public void BJ9(C223419n r5) {
        String str;
        if (this.A00 != 0) {
            C85344Na Bbh = ((AnonymousClass1Nb) ((AnonymousClass4RS) this.A01).A03.get()).Bbh((AnonymousClass1BI) this.A02, C28281Zt.A0B((Context) this.A03));
            if (Bbh != null) {
                r5.A04("wallpaper", Bbh.A01);
                return;
            }
            return;
        }
        int A012 = ((AnonymousClass1NJ) ((AnonymousClass4RS) this.A01).A07.get()).A01((AnonymousClass1BI) this.A02, ((AnonymousClass206) this.A03).A0y);
        if (A012 < 100) {
            int i = A012 / 25;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(i * 25);
            A10.append("-");
            str = C17880vN.A0t(A10, ((i + 1) * 25) - 1);
        } else if (A012 < 1000) {
            str = "100-999";
        } else if (A012 < 10000) {
            str = "1000-9999";
        } else {
            str = "10000+";
        }
        r5.A04("offset_from_end_of_chat", str);
    }

    public String BU9() {
        if (this.A00 != 0) {
            return "wallpaper";
        }
        return "offset_from_end_of_chat";
    }
}
