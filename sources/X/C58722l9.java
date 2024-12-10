package X;

import android.view.View;

/* renamed from: X.2l9  reason: invalid class name and case insensitive filesystem */
public class C58722l9 {
    public final View A00;
    public final AnonymousClass206 A01;
    public final C693536w A02;
    public final C130226j5 A03;
    public final AnonymousClass3M2 A04;
    public final Object A05;
    public final boolean A06;
    public final /* synthetic */ C32051gY A07;

    public C58722l9(View view, AnonymousClass206 r2, C693536w r3, C130226j5 r4, AnonymousClass3M2 r5, C32051gY r6, Object obj, boolean z) {
        this.A07 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = view;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = obj;
        this.A06 = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.A0v.equals(((C58722l9) obj).A01.A0v);
    }

    public int hashCode() {
        return this.A01.A0v.hashCode();
    }
}
