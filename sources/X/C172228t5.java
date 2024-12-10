package X;

import com.whatsapp.util.Log;

/* renamed from: X.8t5  reason: invalid class name and case insensitive filesystem */
public abstract class C172228t5 extends C20663ATv {
    public final A0W A00;

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, X.AN6] */
    public void A03(C1404571m r9, int i) {
        int i2 = i;
        if (this instanceof C168508j0) {
            C168508j0 r3 = (C168508j0) this;
            C168508j0.A00(r3);
            Log.e("GetSingleCollectionGraphQLService/sendRequest/onErrorResponse");
            if (!r3.A07(r3.A02.A04, r9.A01, true)) {
                r3.A03.Btx(i);
            }
        } else if (this instanceof C168548j4) {
            int i3 = r9.A01;
            ? obj = new Object();
            obj.A00 = 2;
            C168548j4.A00(obj, (C168548j4) this, (Exception) null, "/onErrorResponse", i2, i3, true);
        } else if (this instanceof C168538j3) {
            C168538j3.A00((C168538j3) this, (Exception) null, "/onErrorResponse", i2, r9.A01, true);
        } else if (this instanceof C168528j2) {
            C168528j2.A00((C168528j2) this, (Exception) null, "/onErrorResponse", r9.A01, i2, true, false);
        } else if (this instanceof C168518j1) {
            C168518j1 r4 = (C168518j1) this;
            C168518j1.A00(r4);
            C17900vP.A0i("GetCollectionsGraphQLService/onErrorResponse/error - ", AnonymousClass000.A10(), i);
            C195539tV r32 = r4.A04;
            if (!r4.A07(r32.A05, r9.A01, true)) {
                r4.A02.A01(r32, i);
            }
        } else if (this instanceof C168488iy) {
            C168488iy r42 = (C168488iy) this;
            try {
                int i4 = r9.A01;
                C195149ss r2 = r42.A01;
                if (!r42.A07(r2.A02, i4, true)) {
                    r42.A03.Btm(r2, i);
                }
            } catch (Exception unused) {
                r42.A03.Btm(r42.A01, i);
            }
        } else {
            C168498iz r33 = (C168498iz) this;
            try {
                if (!r33.A07(r33.A01.A00, r9.A01, true)) {
                    C168498iz.A00(r33, i);
                }
            } catch (Exception unused2) {
                C168498iz.A00(r33, i);
            }
        }
    }

    public C172228t5(A0W a0w) {
        this.A00 = a0w;
    }
}
