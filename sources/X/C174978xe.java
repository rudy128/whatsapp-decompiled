package X;

import android.content.Context;
import com.whatsapp.WaTextView;

/* renamed from: X.8xe  reason: invalid class name and case insensitive filesystem */
public abstract class C174978xe extends C175028xj {
    public C111735kL A00;
    public final WaTextView A01;
    public final WaTextView A02;

    public void A0D(C173838vo r4) {
        String str;
        WaTextView waTextView;
        int i;
        if (this instanceof C174938xa) {
            str = C108945cZ.A0D(this).getString(2131887039);
        } else if (this instanceof C174968xd) {
            C174968xd r1 = (C174968xd) this;
            boolean A06 = r1.A00.A06();
            Context A0D = C108945cZ.A0D(r1);
            int i2 = 2131887064;
            if (A06) {
                i2 = 2131887150;
            }
            str = C18070vi.A0F(A0D, i2);
        } else if (this instanceof C174958xc) {
            str = C18070vi.A0F(C108945cZ.A0D(this), 2131894702);
        } else {
            C173818vm r12 = (C173818vm) r4;
            C18070vi.A0d(r12, 0);
            str = r12.A00;
        }
        if (str != null) {
            WaTextView waTextView2 = this.A02;
            waTextView2.setText(str);
            C90054dS.A00(waTextView2, r4, 28);
            waTextView = this.A01;
            i = 0;
        } else {
            waTextView = this.A01;
            i = 8;
        }
        waTextView.setVisibility(i);
        waTextView.setText(2131898732);
        C90054dS.A00(waTextView, r4, 27);
        waTextView.setVisibility(0);
        C111735kL r13 = this.A00;
        r13.A00 = r4.A00;
        r13.A0W(r4.A01);
    }

    public void A0B() {
        this.A00.A0W(AnonymousClass000.A13());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C174978xe(android.view.ViewGroup r5, X.C111735kL r6, int r7) {
        /*
            r4 = this;
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r5)
            r0 = 2131625551(0x7f0e064f, float:1.8878313E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r0, r5, r3)
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            r4.<init>(r1)
            android.view.View r1 = r4.A0H
            r0 = 2131436254(0x7f0b22de, float:1.8494373E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r1, r0)
            r4.A02 = r0
            r0 = 2131427500(0x7f0b00ac, float:1.8476618E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r1, r0)
            r4.A01 = r0
            r0 = 2131434428(0x7f0b1bbc, float:1.849067E38)
            androidx.recyclerview.widget.RecyclerView r2 = X.C108945cZ.A0U(r1, r0)
            android.content.Context r1 = r1.getContext()
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r1, r7, r3)
            r2.setLayoutManager(r0)
            r4.A00 = r6
            r2.setAdapter(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174978xe.<init>(android.view.ViewGroup, X.5kL, int):void");
    }
}
