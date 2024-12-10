package X;

import android.graphics.RectF;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6Ul  reason: invalid class name and case insensitive filesystem */
public abstract class C123436Ul {
    public C1409773u A00;

    public String A00() {
        if (this instanceof C1196769k) {
            return "undo_modify_shape";
        }
        if (this instanceof AnonymousClass69j) {
            return "undo_delete_shape";
        }
        if (this instanceof C1196669i) {
            return "undo_change_z_order";
        }
        if (this instanceof C1196569h) {
            return "undo_bulk_actions";
        }
        return "undo_add_shape";
    }

    public void A01(List list) {
        C1409773u r1;
        int i;
        C1409773u r0;
        if (this instanceof C1196769k) {
            C1196769k r02 = (C1196769k) this;
            C129116hH r12 = r02.A00;
            if (r12 != null && (r0 = r02.A00) != null) {
                r0.A0P(r12);
                return;
            }
            return;
        }
        if (this instanceof AnonymousClass69j) {
            AnonymousClass69j r03 = (AnonymousClass69j) this;
            r1 = r03.A00;
            if (r1 != null) {
                i = r03.A00;
            } else {
                return;
            }
        } else if (this instanceof C1196669i) {
            C1196669i r04 = (C1196669i) this;
            r1 = r04.A00;
            if (r1 != null) {
                list.remove(r1);
                i = r04.A00;
            } else {
                return;
            }
        } else if (this instanceof C1196569h) {
            List list2 = ((C1196569h) this).A00;
            for (int A04 = AnonymousClass1ZU.A04(list2); -1 < A04; A04--) {
                ((C123436Ul) list2.get(A04)).A01(list);
            }
            return;
        } else {
            C41681wt.A00(list).remove(this.A00);
            return;
        }
        list.add(i, r1);
    }

    public void A02(List list, JSONObject jSONObject) {
        String str;
        int i;
        AnonymousClass69P r3;
        if (this instanceof C1196769k) {
            C1196769k r32 = (C1196769k) this;
            C129116hH r4 = r32.A00;
            if (r4 != null) {
                jSONObject.put("color", r4.A02);
                jSONObject.put("rotate", (double) r4.A00);
                jSONObject.put("strokeWidth", (double) r4.A01);
                RectF rectF = r4.A03;
                jSONObject.put("left", (double) rectF.left);
                jSONObject.put("right", (double) rectF.right);
                jSONObject.put("top", (double) rectF.top);
                jSONObject.put("bottom", (double) rectF.bottom);
                C129116hH r33 = r32.A00;
                if ((r33 instanceof AnonymousClass69P) && (r3 = (AnonymousClass69P) r33) != null) {
                    jSONObject.put("text", r3.A05);
                    jSONObject.put("text-size", (double) r3.A01);
                    jSONObject.put("scale-factor", (double) r3.A00);
                    jSONObject.put("fontStyle", r3.A04);
                    jSONObject.put("alignment", r3.A02);
                    str = "background_style";
                    i = r3.A03;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass69j) {
            str = "index";
            i = ((AnonymousClass69j) this).A00;
        } else if (this instanceof C1196569h) {
            AnonymousClass82R r0 = new AnonymousClass82R((C1196569h) this, list);
            JSONArray jSONArray = new JSONArray();
            r0.invoke(jSONArray);
            jSONObject.put("actions", jSONArray);
            return;
        } else {
            return;
        }
        jSONObject.put(str, i);
    }
}
