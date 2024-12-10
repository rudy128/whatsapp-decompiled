package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* renamed from: X.01l  reason: invalid class name and case insensitive filesystem */
public final class C003201l {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Context A04;
    public Bundle A05;
    public View A06;
    public View A07;
    public ViewGroup A08;
    public C004101u A09;
    public C003301m A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    /* JADX WARNING: type inference failed for: r1v4, types: [X.01t, X.01u, java.lang.Object] */
    public ExpandedMenuView A00(C004301w r6) {
        if (this.A0A == null) {
            return null;
        }
        if (this.A09 == null) {
            Context context = this.A04;
            ? obj = new Object();
            obj.A00 = context;
            obj.A01 = LayoutInflater.from(context);
            this.A09 = obj;
            obj.A05 = r6;
            this.A0A.A0V(obj);
        }
        C004101u r4 = this.A09;
        ViewGroup viewGroup = this.A08;
        if (r4.A02 == null) {
            r4.A02 = (ExpandedMenuView) r4.A01.inflate(2131623949, viewGroup, false);
            C004201v r1 = r4.A03;
            if (r1 == null) {
                r1 = new C004201v(r4);
                r4.A03 = r1;
            }
            r4.A02.setAdapter(r1);
            r4.A02.setOnItemClickListener(r4);
        }
        return r4.A02;
    }

    public void A01(C003301m r3) {
        C004101u r0;
        C003301m r1 = this.A0A;
        if (r3 != r1) {
            if (r1 != null) {
                r1.A0W(this.A09);
            }
            this.A0A = r3;
            if (r3 != null && (r0 = this.A09) != null) {
                r3.A0V(r0);
            }
        }
    }
}
