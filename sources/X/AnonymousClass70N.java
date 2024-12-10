package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.70N  reason: invalid class name */
public final class AnonymousClass70N {
    public C129116hH A00;
    public C1409773u A01;
    public C1409773u A02;
    public final C139446yr A03 = new C139446yr();
    public final List A04 = AnonymousClass000.A13();

    public final C1409773u A02(PointF pointF, boolean z) {
        Object obj;
        C18070vi.A0d(pointF, 0);
        ListIterator A18 = C108955ca.A18(this.A04);
        while (true) {
            if (!A18.hasPrevious()) {
                obj = null;
                break;
            }
            obj = A18.previous();
            C1409773u r3 = (C1409773u) obj;
            if (r3.A0W() && (!z || !(r3 instanceof AnonymousClass69K))) {
                float f = pointF.x;
                float f2 = pointF.y;
                if (r3 instanceof AnonymousClass69U) {
                    RectF rectF = r3.A06;
                    if (rectF.contains(f, f2)) {
                        float centerX = f - rectF.centerX();
                        float centerY = f2 - rectF.centerY();
                        float width = rectF.width() / 2.0f;
                        float height = rectF.height() / 2.0f;
                        if (((centerX * centerX) / (width * width)) + ((centerY * centerY) / (height * height)) <= 1.0f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    boolean z2 = r3 instanceof AnonymousClass69Q;
                    float f3 = -r3.A02;
                    if (z2) {
                        RectF rectF2 = r3.A06;
                        float centerX2 = rectF2.centerX();
                        float centerY2 = rectF2.centerY();
                        float[] A1V = C108945cZ.A1V();
                        A1V[0] = f;
                        A1V[1] = f2;
                        Matrix A0J = C108945cZ.A0J();
                        A0J.setRotate(f3, centerX2, centerY2);
                        A0J.mapPoints(A1V);
                        float f4 = A1V[0];
                        float f5 = A1V[1];
                        if (rectF2.contains(f4, f5)) {
                            float f6 = rectF2.left;
                            float f7 = rectF2.bottom;
                            float f8 = rectF2.right;
                            float f9 = rectF2.top;
                            float f10 = f9 - f7;
                            float f11 = f10 * f4;
                            float f12 = f8 - f6;
                            if (((double) C108945cZ.A00((f11 - (f12 * f5)) + (f8 * f7), f9 * f6)) / Math.sqrt((double) ((f10 * f10) + (f12 * f12))) < ((double) C1409773u.A09)) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        RectF rectF3 = r3.A06;
                        float centerX3 = rectF3.centerX();
                        float centerY3 = rectF3.centerY();
                        float[] A1V2 = C108945cZ.A1V();
                        A1V2[0] = f;
                        A1V2[1] = f2;
                        Matrix A0J2 = C108945cZ.A0J();
                        A0J2.setRotate(f3, centerX3, centerY3);
                        A0J2.mapPoints(A1V2);
                        if (rectF3.contains(A1V2[0], A1V2[1])) {
                            break;
                        }
                    }
                }
            }
        }
        return (C1409773u) obj;
    }

    public final void A05() {
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A04.clear();
        this.A03.A00.clear();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.6Ul, X.69k] */
    public static void A00(C129116hH r2, C1409773u r3, AnonymousClass70N r4) {
        ? obj = new Object();
        obj.A00 = r3;
        obj.A00 = r2;
        r4.A03.A00.add(obj);
    }

    public final AnonymousClass69K A01() {
        AnonymousClass69K r2;
        Object obj;
        Iterator it = this.A04.iterator();
        while (true) {
            r2 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj != null) {
                if (obj instanceof AnonymousClass69K) {
                    break;
                }
            } else {
                break;
            }
        }
        if (obj instanceof AnonymousClass69K) {
            r2 = obj;
        }
        return r2;
    }

    public final List A03() {
        List list = this.A04;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            AnonymousClass3MZ.A1V(next, A13, next instanceof AnonymousClass69K ? 1 : 0);
        }
        return A13;
    }

    public final List A04() {
        return AnonymousClass1b2.A06(AnonymousClass1b2.A0C(C1591783n.A00, AnonymousClass1b2.A09(C1591683m.A00, C29431cG.A0V(this.A04))));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.6Ul] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047 A[LOOP:1: B:17:0x0041->B:19:0x0047, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C1409773u r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.AnonymousClass69V
            if (r0 == 0) goto L_0x0067
            java.util.List r3 = r4.A04
            boolean r0 = X.AnonymousClass000.A1a(r3)
            if (r0 == 0) goto L_0x0067
            r0 = r5
            X.69V r0 = (X.AnonymousClass69V) r0
            X.70B r0 = r0.A04
            boolean r0 = r0 instanceof X.C1196869l
            java.util.Iterator r2 = r3.iterator()
            if (r0 == 0) goto L_0x004f
        L_0x0019:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0062
            X.73u r1 = X.C108945cZ.A0k(r2)
            boolean r0 = r1 instanceof X.AnonymousClass69K
            if (r0 != 0) goto L_0x0019
            boolean r0 = r1 instanceof X.AnonymousClass69V
            if (r0 == 0) goto L_0x0034
            r0 = r1
            X.69V r0 = (X.AnonymousClass69V) r0
            X.70B r0 = r0.A04
            boolean r0 = r0 instanceof X.C1196869l
            if (r0 != 0) goto L_0x0019
        L_0x0034:
            int r0 = r3.indexOf(r1)
        L_0x0038:
            r3.add(r0, r5)
        L_0x003b:
            r4.A01 = r5
            java.util.Iterator r1 = r3.iterator()
        L_0x0041:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006d
            X.73u r0 = X.C108945cZ.A0k(r1)
            r0.A0G()
            goto L_0x0041
        L_0x004f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass69K
            if (r0 != 0) goto L_0x004f
            boolean r0 = r1 instanceof X.AnonymousClass69V
            if (r0 != 0) goto L_0x004f
            goto L_0x0034
        L_0x0062:
            int r0 = r3.size()
            goto L_0x0038
        L_0x0067:
            java.util.List r3 = r4.A04
            r3.add(r5)
            goto L_0x003b
        L_0x006d:
            X.69g r1 = new X.69g
            r1.<init>()
            r1.A00 = r5
            X.6yr r0 = r4.A03
            java.util.List r0 = r0.A00
            r0.add(r1)
            r0 = 0
            r4.A02 = r0
            r4.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70N.A06(X.73u):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.6Ul, X.69j] */
    public final void A07(C1409773u r5) {
        List list = this.A04;
        int indexOf = list.indexOf(r5);
        if (indexOf != -1) {
            ? obj = new Object();
            obj.A00 = r5;
            obj.A00 = indexOf;
            this.A03.A00.add(obj);
            list.remove(r5);
            if (r5 == this.A01) {
                this.A01 = null;
            }
        }
    }

    public final void A08(String str) {
        if (str != null) {
            try {
                C139446yr r2 = this.A03;
                List list = this.A04;
                C18070vi.A0d(list, 1);
                JSONArray jSONArray = C17880vN.A16(str).getJSONArray("actions");
                List list2 = r2.A00;
                list2.clear();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C18070vi.A0b(jSONObject);
                    C123436Ul A002 = C137306vF.A00(list, jSONObject);
                    if (A002 != null) {
                        list2.add(A002);
                    }
                }
            } catch (JSONException e) {
                Log.e("ShapeRepository/loadUndoState", e);
            }
        }
    }

    public final boolean A09() {
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            if (C108945cZ.A0k(it).A0U()) {
                return true;
            }
        }
        return false;
    }
}
