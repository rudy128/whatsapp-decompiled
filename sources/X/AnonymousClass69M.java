package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.json.JSONObject;

/* renamed from: X.69M  reason: invalid class name */
public final class AnonymousClass69M extends AnonymousClass69a {
    public Drawable A00;
    public AnonymousClass737 A01;
    public final Context A02;
    public final AnonymousClass1KW A03;
    public final boolean A04;

    public AnonymousClass69M(Context context, AnonymousClass1KW r5, JSONObject jSONObject) {
        this.A02 = context;
        this.A03 = r5;
        this.A04 = false;
        if (jSONObject.has("emoji")) {
            this.A01 = new AnonymousClass737(C18070vi.A0J("emoji", jSONObject));
            A00(this, true);
            A0R(jSONObject);
        }
    }

    public void A0O(RectF rectF, float f, float f2, float f3, float f4) {
        C18070vi.A0d(rectF, 0);
        super.A0O(rectF, f, f2, f3, f4);
        if (!this.A04) {
            RectF rectF2 = this.A06;
            if (rectF2.width() > 128.0f || rectF2.height() > 128.0f) {
                A0H(C108945cZ.A01(128.0f, rectF2.height(), 128.0f / rectF2.width()));
            }
        }
    }

    public void A0Q(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        super.A0Q(jSONObject);
        AnonymousClass737 r0 = this.A01;
        if (r0 != null) {
            jSONObject.put("emoji", String.valueOf(r0));
        }
    }

    public static final void A00(AnonymousClass69M r9, boolean z) {
        BitmapDrawable A07;
        AnonymousClass737 r0 = r9.A01;
        if (r0 != null) {
            C117025z5 r6 = new C117025z5(r0.A00);
            long A002 = C43291zZ.A00(r6, false);
            if (!r9.A04) {
                AnonymousClass1KW r3 = r9.A03;
                Context context = r9.A02;
                if (z) {
                    Resources A0D = C108955ca.A0D(context);
                    C58852lM A042 = AnonymousClass1KW.A04(r6, r3, A002);
                    if (A042 == null) {
                        A07 = null;
                    } else {
                        A07 = AnonymousClass1KW.A02(A0D, A042, r3);
                        if (A07 == null) {
                            A07 = AnonymousClass1KW.A01(A0D, A042, r3);
                        }
                    }
                } else {
                    A07 = r3.A06(C108955ca.A0D(context), new AnonymousClass7G1(r9), r6, A002);
                }
            } else {
                A07 = r9.A03.A07(C108955ca.A0D(r9.A02), r6, A002);
            }
            r9.A00 = A07;
        }
    }

    public AnonymousClass69M(Context context, AnonymousClass737 r3, AnonymousClass1KW r4, boolean z) {
        C18070vi.A0o(r3, context, r4);
        this.A01 = r3;
        this.A02 = context;
        this.A03 = r4;
        this.A04 = z;
        A00(this, false);
    }
}
