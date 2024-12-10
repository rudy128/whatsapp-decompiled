package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.json.JSONObject;

/* renamed from: X.69c  reason: invalid class name */
public final class AnonymousClass69c extends C1409773u {
    public static Typeface A0J;
    public static Typeface A0K;
    public static Typeface A0L;
    public static Typeface A0M;
    public static Typeface A0N;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06 = 1.0f;
    public float A07;
    public int A08 = 15;
    public int A09;
    public int A0A;
    public StaticLayout A0B;
    public String A0C = "";
    public final Context A0D;
    public final TextPaint A0E = new TextPaint(1);
    public final C18000vb A0F;
    public final AnonymousClass6pZ A0G = new AnonymousClass6pZ();
    public final AnonymousClass1KW A0H;
    public final C18030ve A0I;

    public AnonymousClass69c(Context context, C18000vb r4, AnonymousClass1KW r5, C18030ve r6) {
        C18070vi.A0d(context, 1);
        C18070vi.A0p(r5, r4, r6);
        this.A0D = context;
        this.A0H = r5;
        this.A0F = r4;
        this.A0I = r6;
        C108945cZ.A1L(this.A05);
    }

    public void A0P(C129116hH r8) {
        super.A0P(r8);
        AnonymousClass69P r82 = (AnonymousClass69P) r8;
        this.A06 = r82.A00;
        A0a(r82.A05, this.A07, r82.A04, r82.A02, r82.A03);
    }

    public void A0Q(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        super.A0Q(jSONObject);
        jSONObject.put("orig-w", (int) (this.A03 * 100.0f));
        jSONObject.put("orig-h", (int) (this.A02 * 100.0f));
        jSONObject.put("text", this.A0C);
        jSONObject.put("text-size", (int) (this.A07 * 100.0f));
        jSONObject.put("scale-factor", (int) (this.A06 * 100.0f));
        jSONObject.put("style", this.A09);
        jSONObject.put("alignment", this.A0A);
        jSONObject.put("background_style", this.A0G.A02);
        jSONObject.put("orig-l", (int) (this.A04 * 100.0f));
        jSONObject.put("orig-r", (int) (this.A05 * 100.0f));
        jSONObject.put("editing_tool_flags", this.A08);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r2 != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r2 != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.text.Layout.Alignment A00() {
        /*
            r3 = this;
            X.0vb r0 = r3.A0F
            java.util.Locale r0 = r0.A0N()
            android.text.BidiFormatter r1 = android.text.BidiFormatter.getInstance(r0)
            java.lang.String r0 = r3.A0C
            boolean r2 = r1.isRtl(r0)
            int r1 = r3.A0A
            if (r1 == 0) goto L_0x0024
            r0 = 1
            if (r1 == r0) goto L_0x001f
            r0 = 2
            if (r1 != r0) goto L_0x0024
            if (r2 == 0) goto L_0x0021
        L_0x001c:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r0
        L_0x001f:
            if (r2 == 0) goto L_0x001c
        L_0x0021:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r0
        L_0x0024:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69c.A00():android.text.Layout$Alignment");
    }

    public static final StaticLayout A01(Context context, AnonymousClass1KW r5, AnonymousClass69c r6, String str, int i) {
        TextPaint textPaint = r6.A0E;
        CharSequence A022 = AnonymousClass1EG.A02(C43251zV.A03(context, textPaint, r5, str));
        if (A022 == null) {
            A022 = "";
        }
        int i2 = i;
        if (Build.VERSION.SDK_INT < 23) {
            return new StaticLayout(A022, textPaint, i2, r6.A00(), 1.3f, 0.0f, true);
        }
        StaticLayout build = StaticLayout.Builder.obtain(A022, 0, A022.length(), textPaint, i).setAlignment(r6.A00()).setLineSpacing(0.0f, 1.3f).setIncludePad(true).build();
        C18070vi.A0X(build);
        return build;
    }

    public static final void A02(Context context, AnonymousClass69c r8) {
        float A002;
        float A003;
        StaticLayout staticLayout = r8.A0B;
        if (staticLayout != null) {
            int lineCount = staticLayout.getLineCount();
            int i = 0;
            while (true) {
                if (i < lineCount) {
                    StaticLayout staticLayout2 = r8.A0B;
                    if (staticLayout2 == null) {
                        break;
                    }
                    float lineWidth = staticLayout2.getLineWidth(i);
                    if (lineWidth > r8.A01) {
                        r8.A01 = lineWidth;
                    }
                    i++;
                } else {
                    int i2 = r8.A09;
                    float f = r8.A06;
                    Resources resources = context.getResources();
                    if (i2 == 2) {
                        A002 = (AnonymousClass3MW.A00(resources, 2131165449) * f) + (AnonymousClass3MW.A00(context.getResources(), 2131165450) * f);
                    } else {
                        A002 = AnonymousClass3MW.A00(resources, 2131165452) * f;
                    }
                    int i3 = r8.A09;
                    float f2 = r8.A06;
                    Resources resources2 = context.getResources();
                    if (i3 == 2) {
                        A003 = (AnonymousClass3MW.A00(context.getResources(), 2131165448) * f2) + (AnonymousClass3MW.A00(resources2, 2131165451) * f2);
                    } else {
                        A003 = AnonymousClass3MW.A00(resources2, 2131165453) * f2;
                    }
                    AnonymousClass1D6 A012 = AnonymousClass1D6.A01(Float.valueOf(A002), Float.valueOf(A003));
                    float A042 = AnonymousClass000.A04(A012.first);
                    float A043 = AnonymousClass000.A04(A012.second);
                    r8.A01 += A042;
                    StaticLayout staticLayout3 = r8.A0B;
                    if (staticLayout3 != null) {
                        r8.A00 = ((float) staticLayout3.getHeight()) + A043;
                        return;
                    }
                }
            }
        }
        C18070vi.A11("layout");
        throw null;
    }

    public static final void A03(AnonymousClass69c r8) {
        String str = r8.A0C;
        if (str.length() != 0) {
            TextPaint textPaint = r8.A0E;
            textPaint.setTextSize(r8.A07 * r8.A06);
            textPaint.setColor(r8.A0G.A04);
            Context context = r8.A0D;
            AnonymousClass1KW r1 = r8.A0H;
            RectF rectF = r8.A06;
            r8.A0B = A01(context, r1, r8, str, ((int) rectF.width()) + 1);
            r8.A01 = 0.0f;
            A02(context, r8);
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = rectF.right;
            float f4 = f2 + rectF.bottom;
            float f5 = r8.A00;
            float f6 = (f4 - f5) / 2.0f;
            float f7 = (f4 + f5) / 2.0f;
            int i = r8.A0A;
            if (i == 0) {
                float f8 = f + f3;
                float f9 = r8.A01;
                rectF.set((f8 - f9) / 2.0f, f6, (f8 + f9) / 2.0f, f7);
            } else {
                boolean z = true;
                if ((i != 1 || !AnonymousClass3MY.A1b(r8.A0F)) && (r8.A0A != 2 || AnonymousClass3MY.A1b(r8.A0F))) {
                    z = false;
                }
                float f10 = r8.A01;
                if (z) {
                    rectF.set(f, f6, f10 + f, f7);
                } else {
                    rectF.set(f3 - f10, f6, f3, f7);
                }
            }
            rectF.sort();
        }
    }

    public void A0K(int i) {
        this.A05.setColor(i);
        AnonymousClass6pZ r1 = this.A0G;
        r1.A03 = i;
        r1.A01(i, r1.A02);
    }

    public void A0O(RectF rectF, float f, float f2, float f3, float f4) {
        this.A04 = f;
        this.A05 = f3;
        this.A03 = C108945cZ.A00(f3, f);
        this.A02 = C108945cZ.A00(f4, f2);
        RectF rectF2 = this.A06;
        rectF2.set(f, f2, f3, f4);
        rectF2.sort();
        A03(this);
    }

    public final void A0a(String str, float f, int i, int i2, int i3) {
        float f2;
        float f3;
        float centerY;
        float f4;
        if (!C18070vi.A18(this.A0C, str) || this.A07 != f || this.A09 != i || this.A0A != i2 || this.A0G.A02 != i3) {
            this.A0C = str;
            this.A07 = f;
            this.A09 = i;
            TextPaint textPaint = this.A0E;
            textPaint.setTextSize(f);
            textPaint.setTypeface(C123936Wk.A00(this.A0D, i));
            this.A0A = i2;
            AnonymousClass6pZ r1 = this.A0G;
            r1.A02 = i3;
            r1.A01(r1.A03, i3);
            textPaint.setFakeBoldText(C17890vO.A1R(i));
            if (this.A01 != 0.0f) {
                boolean A052 = C18020vd.A05(C18040vf.A02, this.A0I, 8414);
                RectF rectF = this.A06;
                if (A052) {
                    f3 = 2.0f;
                    f2 = rectF.centerX() - (this.A03 / 2.0f);
                    centerY = rectF.centerY() - (this.A02 / 2.0f);
                    f4 = rectF.centerX() + (this.A03 / 2.0f);
                } else {
                    f2 = this.A04;
                    f3 = 2.0f;
                    centerY = rectF.centerY() - (this.A02 / 2.0f);
                    f4 = this.A05;
                }
                rectF.set(f2, centerY, f4, rectF.centerY() + (this.A02 / f3));
                A03(this);
            }
        }
    }
}
