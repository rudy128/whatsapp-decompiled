package X;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: X.1bX  reason: invalid class name and case insensitive filesystem */
public class C29051bX extends AnonymousClass1LG {
    public int A00 = 0;
    public int A01;
    public ArrayList A02 = new ArrayList();
    public boolean A03 = true;
    public boolean A04 = false;

    public /* bridge */ /* synthetic */ void A0G(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i < arrayList.size()) {
                ((AnonymousClass1LG) arrayList.get(i)).A0G(view);
                i++;
            } else {
                super.A0G(view);
                return;
            }
        }
    }

    /* renamed from: A0Y */
    public void A0E(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i < arrayList.size()) {
                ((AnonymousClass1LG) arrayList.get(i)).A0E(view);
                i++;
            } else {
                super.A0E(view);
                return;
            }
        }
    }

    public void A0W(long j) {
        ArrayList arrayList;
        this.A00 = j;
        if (j >= 0 && (arrayList = this.A02) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass1LG) this.A02.get(i)).A0C(j);
            }
        }
    }

    public void A0X(TimeInterpolator timeInterpolator) {
        this.A00 |= 1;
        ArrayList arrayList = this.A02;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass1LG) this.A02.get(i)).A0D(timeInterpolator);
            }
        }
        this.A02 = timeInterpolator;
    }

    public void A0a(AnonymousClass1LG r6) {
        this.A02.add(r6);
        r6.A06 = this;
        long j = this.A00;
        if (j >= 0) {
            r6.A0C(j);
        }
        if ((this.A00 & 1) != 0) {
            r6.A0D(this.A02);
        }
        if ((this.A00 & 2) != 0) {
            r6.A0P(this.A05);
        }
        if ((this.A00 & 4) != 0) {
            r6.A0L(this.A03);
        }
        if ((this.A00 & 8) != 0) {
            r6.A0M(this.A04);
        }
    }

    public AnonymousClass1LG A04() {
        C29051bX r4 = (C29051bX) super.clone();
        r4.A02 = new ArrayList();
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass1LG A042 = ((AnonymousClass1LG) this.A02.get(i)).clone();
            r4.A02.add(A042);
            A042.A06 = r4;
        }
        return r4;
    }

    public String A07(String str) {
        String A07 = super.A07(str);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i >= arrayList.size()) {
                return A07;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(A07);
            sb.append("\n");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(((AnonymousClass1LG) arrayList.get(i)).A07(sb2.toString()));
            A07 = sb.toString();
            i++;
        }
    }

    public void A08() {
        super.A08();
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass1LG) this.A02.get(i)).A08();
        }
    }

    public void A0F(View view) {
        super.A0F(view);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass1LG) this.A02.get(i)).A0F(view);
        }
    }

    public void A0H(View view) {
        super.A0H(view);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass1LG) this.A02.get(i)).A0H(view);
        }
    }

    public void A0I(ViewGroup viewGroup) {
        super.A0I(viewGroup);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass1LG) this.A02.get(i)).A0I(viewGroup);
        }
    }

    public void A0L(AnonymousClass1LJ r4) {
        super.A0L(r4);
        this.A00 |= 4;
        if (this.A02 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.A02;
                if (i < arrayList.size()) {
                    ((AnonymousClass1LG) arrayList.get(i)).A0L(r4);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ void A0N(AnonymousClass3M3 r1) {
        super.A0N(r1);
    }

    public /* bridge */ /* synthetic */ void A0O(AnonymousClass3M3 r1) {
        super.A0O(r1);
    }

    public void A0R(C62392rK r4) {
        super.A0R(r4);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass1LG) this.A02.get(i)).A0R(r4);
        }
    }

    public void A0Z(AnonymousClass3M3 r1) {
        super.A0N(r1);
    }
}
