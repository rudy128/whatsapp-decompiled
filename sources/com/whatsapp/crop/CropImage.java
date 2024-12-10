package com.whatsapp.crop;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass1FP;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1T1;
import X.AnonymousClass2E5;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C17880vN;
import X.C17900vP;
import X.C24141Ja;
import X.C25291Nq;
import X.C26631Sw;
import X.C29781cr;
import X.C36361nl;
import X.C39761tb;
import X.C72473Md;
import X.C72483Me;
import X.C88154Yn;
import X.C91004ez;
import X.C98714rb;
import X.C98834rn;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;

public class CropImage extends AnonymousClass1FP {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Bitmap.CompressFormat A09;
    public Bitmap A0A;
    public Matrix A0B;
    public Matrix A0C;
    public Rect A0D;
    public Uri A0E;
    public AnonymousClass1T1 A0F;
    public AnonymousClass1KB A0G;
    public C36361nl A0H;
    public AnonymousClass11C A0I;
    public C29781cr A0J;
    public CropImageView A0K;
    public C88154Yn A0L;
    public AnonymousClass2E5 A0M;
    public AnonymousClass1KW A0N;
    public C25291Nq A0O;
    public C26631Sw A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public String A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public int A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;

    public CropImage() {
        this(0);
        this.A09 = Bitmap.CompressFormat.JPEG;
        this.A0b = true;
        this.A08 = 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (r15.A01 == 0) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A3T(X.AnonymousClass4MX r16) {
        /*
            r15 = this;
            r10 = r15
            com.whatsapp.crop.CropImageView r1 = r15.A0K
            r0 = 1
            r2 = r16
            r1.A07(r2, r0)
            android.graphics.Bitmap r0 = r15.A0A
            if (r0 == 0) goto L_0x009d
            int r7 = r0.getWidth()
            android.graphics.Bitmap r0 = r15.A0A
            int r4 = r0.getHeight()
            r0 = 0
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r0, r0, r7, r4)
            android.graphics.Rect r0 = r15.A0D
            if (r0 == 0) goto L_0x01af
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>(r0)
        L_0x0026:
            com.whatsapp.crop.CropImageView r0 = r15.A0K
            X.4Yn r3 = new X.4Yn
            r3.<init>(r0)
            com.whatsapp.crop.CropImageView r0 = r15.A0K
            android.graphics.Matrix r2 = r0.getImageMatrix()
            boolean r9 = r15.A0T
            int r0 = r15.A00
            if (r0 == 0) goto L_0x003e
            int r0 = r15.A01
            r7 = 1
            if (r0 != 0) goto L_0x003f
        L_0x003e:
            r7 = 0
        L_0x003f:
            boolean r6 = r15.A0U
            int r4 = r15.A04
            int r0 = r15.A08
            int r4 = r4 / r0
            r1 = 1
            if (r9 == 0) goto L_0x004a
            r7 = 1
        L_0x004a:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r2)
            r3.A03 = r0
            r3.A05 = r8
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r5)
            r3.A06 = r0
            r2 = 0
            if (r7 != 0) goto L_0x0060
            if (r6 != 0) goto L_0x0060
            r1 = 0
        L_0x0060:
            r3.A0A = r1
            r3.A08 = r9
            r3.A01 = r4
            android.graphics.RectF r0 = r3.A05
            float r1 = r0.width()
            android.graphics.RectF r0 = r3.A05
            float r0 = r0.height()
            float r1 = r1 / r0
            r3.A00 = r1
            android.graphics.Rect r0 = X.C88154Yn.A00(r3)
            r3.A04 = r0
            android.graphics.Paint r0 = r3.A0B
            r1 = 128(0x80, float:1.794E-43)
            r0.setARGB(r1, r2, r2, r2)
            android.graphics.Paint r0 = r3.A0C
            r0.setARGB(r1, r2, r2, r2)
            android.graphics.Paint r0 = r3.A0D
            X.AnonymousClass3MW.A1P(r0)
            r0.setAntiAlias(r2)
            r3.A02 = r2
            com.whatsapp.crop.CropImageView r1 = r15.A0K
            java.util.ArrayList r0 = r1.A06
            r0.add(r3)
            r1.invalidate()
            r15.A0L = r3
        L_0x009d:
            r0 = 2131428814(0x7f0b05ce, float:1.8479283E38)
            android.view.View r1 = r15.findViewById(r0)
            r0 = 29
            X.C89924dF.A00(r1, r15, r0)
            r0 = 2131433259(0x7f0b172b, float:1.8488299E38)
            android.view.View r1 = r15.findViewById(r0)
            r0 = 39
            X.C825048f.A00(r1, r15, r0)
            r0 = 2131434745(0x7f0b1cf9, float:1.8491313E38)
            android.view.View r1 = r15.findViewById(r0)
            r0 = 30
            X.C89924dF.A00(r1, r15, r0)
            boolean r0 = r15.A0U
            if (r0 == 0) goto L_0x00ca
            r0 = 8
            r1.setVisibility(r0)
        L_0x00ca:
            java.lang.String r0 = r15.A0S
            if (r0 == 0) goto L_0x0181
            X.1KB r12 = r15.A0G
            X.11C r13 = r15.A0I
            X.1nl r11 = r15.A0H
            r0 = 2131889112(0x7f120bd8, float:1.9412878E38)
            java.lang.String r0 = r15.getString(r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r0)
            int r1 = r2.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r6 = 0
            java.lang.Object[] r5 = r2.getSpans(r6, r1, r0)
            android.text.style.URLSpan[] r5 = (android.text.style.URLSpan[]) r5
            if (r5 == 0) goto L_0x01ac
            int r3 = r5.length
        L_0x00f4:
            if (r6 >= r3) goto L_0x01ac
            r4 = r5[r6]
            java.lang.String r1 = "terms-and-privacy-policy"
            java.lang.String r0 = r4.getURL()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01a8
            int r3 = r2.getSpanStart(r4)
            int r1 = r2.getSpanEnd(r4)
            int r0 = r2.getSpanFlags(r4)
            r2.removeSpan(r4)
            java.lang.String r14 = "https://www.whatsapp.com/legal/"
            X.3cE r9 = new X.3cE
            r9.<init>(r10, r11, r12, r13, r14)
            r2.setSpan(r9, r3, r1, r0)
        L_0x011d:
            r5 = -10066330(0xffffffffff666666, float:-3.0625412E38)
            r4 = 0
            r3 = 1069547520(0x3fc00000, float:1.5)
            r6 = 0
            if (r2 == 0) goto L_0x0142
            r0 = 2131436314(0x7f0b231a, float:1.8494495E38)
            android.view.View r1 = r15.findViewById(r0)
            com.whatsapp.TextEmojiLabel r1 = (com.whatsapp.TextEmojiLabel) r1
            r1.setVisibility(r6)
            X.11C r0 = r15.A0I
            X.AnonymousClass3Ma.A1K(r1, r0)
            X.0ve r0 = r15.A01
            X.AnonymousClass3Ma.A1L(r0, r1)
            r1.setText(r2)
            r1.setShadowLayer(r3, r4, r3, r5)
        L_0x0142:
            X.1KB r12 = r15.A0G
            X.11C r13 = r15.A0I
            X.1nl r11 = r15.A0H
            java.lang.String r14 = r15.A0S
            X.3cE r9 = new X.3cE
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.String r0 = r15.A0S
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r0 = r0.getHost()
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r0)
            int r0 = r2.length()
            r2.setSpan(r9, r6, r0, r6)
            r0 = 2131431544(0x7f0b1078, float:1.848482E38)
            android.view.View r1 = r15.findViewById(r0)
            com.whatsapp.TextEmojiLabel r1 = (com.whatsapp.TextEmojiLabel) r1
            r1.setVisibility(r6)
            X.11C r0 = r15.A0I
            X.AnonymousClass3Ma.A1K(r1, r0)
            X.0ve r0 = r15.A01
            X.AnonymousClass3Ma.A1L(r0, r1)
            r1.setText(r2)
            r1.setShadowLayer(r3, r4, r3, r5)
        L_0x0181:
            r0 = 2131431531(0x7f0b106b, float:1.8484794E38)
            android.view.View r3 = r15.findViewById(r0)
            android.graphics.Rect r2 = X.AnonymousClass3MW.A07()
            com.whatsapp.crop.CropImageView r1 = r15.A0K
            X.3Nx r0 = new X.3Nx
            r0.<init>(r2, r1, r15)
            r3.setTouchDelegate(r0)
            java.lang.String r0 = "CropImage/prepareCropInBackground/end"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.10I r2 = r15.A05
            X.1cr r1 = r15.A0J
            r1.getClass()
            r0 = 37
            X.C98834rn.A01(r2, r1, r0)
            return
        L_0x01a8:
            int r6 = r6 + 1
            goto L_0x00f4
        L_0x01ac:
            r2 = 0
            goto L_0x011d
        L_0x01af:
            boolean r0 = r15.A0U
            if (r0 == 0) goto L_0x021a
            int r0 = r15.A05
            if (r0 >= r7) goto L_0x0217
            int r1 = r15.A06
            if (r1 >= r7) goto L_0x0217
            float r2 = (float) r7
            float r1 = (float) r1
            float r2 = r2 * r1
            float r0 = (float) r0
            float r2 = r2 / r0
            int r6 = (int) r2
            r0 = r7
        L_0x01c2:
            int r3 = r15.A00
            if (r3 == 0) goto L_0x01cf
            int r1 = r15.A01
            if (r1 == 0) goto L_0x01cf
            if (r3 <= r1) goto L_0x0213
            int r1 = r1 * r0
            int r6 = r1 / r3
        L_0x01cf:
            if (r6 <= r4) goto L_0x01d8
            float r2 = (float) r6
            float r1 = (float) r4
            float r2 = r2 / r1
            float r0 = (float) r0
            float r0 = r0 / r2
            int r0 = (int) r0
            r6 = r4
        L_0x01d8:
            if (r0 <= r7) goto L_0x01e1
            float r1 = (float) r0
            float r0 = (float) r7
            float r1 = r1 / r0
            float r0 = (float) r6
            float r0 = r0 / r1
            int r6 = (int) r0
            r0 = r7
        L_0x01e1:
            int r2 = r15.A04
            if (r2 <= 0) goto L_0x0200
            int r1 = r15.A08
            int r2 = r2 / r1
            if (r0 >= r2) goto L_0x01f4
            r0 = r2
            if (r3 == 0) goto L_0x01f4
            int r1 = r15.A01
            if (r1 == 0) goto L_0x01f4
            int r1 = r1 * r2
            int r6 = r1 / r3
        L_0x01f4:
            if (r6 >= r2) goto L_0x0200
            r6 = r2
            if (r3 == 0) goto L_0x0200
            int r1 = r15.A01
            if (r1 == 0) goto L_0x0200
            int r3 = r3 * r2
            int r0 = r3 / r1
        L_0x0200:
            int r7 = r7 - r0
            int r1 = r7 / 2
            int r4 = r4 - r6
            int r4 = r4 / 2
            float r3 = (float) r1
            float r2 = (float) r4
            int r1 = r1 + r0
            float r1 = (float) r1
            int r4 = r4 + r6
            float r0 = (float) r4
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>(r3, r2, r1, r0)
            goto L_0x0026
        L_0x0213:
            int r0 = r6 * r3
            int r0 = r0 / r1
            goto L_0x01cf
        L_0x0217:
            int r6 = r15.A06
            goto L_0x01c2
        L_0x021a:
            r0 = r7
            r6 = r4
            goto L_0x01c2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.crop.CropImage.A3T(X.4MX):void");
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        String A0t;
        String string;
        boolean z = true;
        requestWindowFeature(1);
        super.onCreate(bundle);
        AnonymousClass10I r3 = this.A05;
        C29781cr r2 = this.A0J;
        r2.getClass();
        C98834rn.A01(r3, r2, 37);
        getWindow().addFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        setContentView(2131625029);
        AnonymousClass11C r32 = this.A0I;
        C39761tb.A00(findViewById(2131434744), getWindow(), r32);
        this.A0K = (CropImageView) findViewById(2131431526);
        Intent intent = getIntent();
        if (intent != null) {
            bundle2 = intent.getExtras();
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            if (bundle2.getString("circleCrop") != null) {
                this.A0T = true;
                this.A00 = 1;
                this.A01 = 1;
            }
            Uri uri = (Uri) C24141Ja.A00(bundle2, Uri.class, "output");
            this.A0E = uri;
            if (!(uri == null || (string = bundle2.getString("outputFormat")) == null)) {
                this.A09 = Bitmap.CompressFormat.valueOf(string);
            }
            this.A00 = bundle2.getInt("aspectX");
            this.A01 = bundle2.getInt("aspectY");
            this.A05 = bundle2.getInt("outputX");
            this.A06 = bundle2.getInt("outputY");
            this.A04 = bundle2.getInt("minCrop");
            this.A0Y = bundle2.getInt("maxCrop");
            this.A0D = (Rect) C24141Ja.A00(bundle2, Rect.class, "initialRect");
            this.A0U = bundle2.getBoolean("cropByOutputSize", true);
            this.A0a = bundle2.getBoolean("scale", true);
            this.A0b = bundle2.getBoolean("scaleUpIfNeeded", true);
            this.A03 = bundle2.getInt("maxFileSize");
            this.A0V = bundle2.getBoolean("flattenRotation", true);
            this.A0S = bundle2.getString("webImageSource");
            this.A0W = bundle2.getBoolean("rotateAspect", false);
        } else {
            Log.i("CropImage/onCreate/no-extras");
        }
        if (bundle != null) {
            this.A07 = bundle.getInt("rotate");
            this.A0D = (Rect) C24141Ja.A00(bundle, Rect.class, "initialRect");
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CropImage/onCreate/Bitmap:");
        if (this.A0A != null) {
            z = false;
        }
        A10.append(z);
        A10.append(" aspectX:");
        A10.append(this.A00);
        A10.append(" aspectY:");
        A10.append(this.A01);
        A10.append(" outputX:");
        A10.append(this.A05);
        A10.append(" outputY:");
        A10.append(this.A06);
        A10.append(" minCrop:");
        A10.append(this.A04);
        A10.append(" maxCrop:");
        A10.append(this.A0Y);
        A10.append(" cropByOutputSize:");
        A10.append(this.A0U);
        A10.append(" initialRect:");
        Rect rect = this.A0D;
        if (rect == null) {
            A0t = "null";
        } else {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append(rect.left);
            A102.append(",");
            A102.append(rect.top);
            A102.append(",");
            A102.append(rect.right);
            A102.append(",");
            A0t = C17880vN.A0t(A102, rect.bottom);
        }
        A10.append(A0t);
        A10.append(" scale:");
        A10.append(this.A0a);
        A10.append(" scaleUp:");
        A10.append(this.A0b);
        A10.append(" flattenRotation:");
        C17900vP.A0r(A10, this.A0V);
        if (intent != null) {
            C98714rb.A00(this.A05, this, intent, C72483Me.A0D(this), 44);
            return;
        }
        finish();
    }

    private void A00(Rect rect) {
        int i = rect.left;
        int i2 = this.A08;
        rect.left = i * i2;
        rect.right *= i2;
        rect.top *= i2;
        rect.bottom *= i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        X.AnonymousClass0DT.A00(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01b7, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01b8, code lost:
        com.whatsapp.util.Log.e(X.AnonymousClass001.A1I("CropImage/oom: ", X.AnonymousClass000.A10(), r1), r10);
        r0 = r3.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01cd, code lost:
        r3.A0A.recycle();
        r3.A0A = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01dc, code lost:
        r14.recycle();
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01e0, code lost:
        X.C72483Me.A0j(r6);
        r1 = r1 * 2;
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01e9, code lost:
        com.whatsapp.util.Log.e("CropImage/cannot_resample: ", r0);
        com.whatsapp.util.Log.e("CropImage/activityRes/fail/load-image");
        r3.setResult(0, X.C17880vN.A0A().putExtra("io-error", true).putExtra("error_message_id", 2131889981));
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x020b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ad, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:29:0x00c1, B:74:0x016c, B:76:0x0172, B:98:0x01ae] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e8 A[ExcHandler: IOException (r0v22 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:29:0x00c1] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.whatsapp.crop.CropImage r22) {
        /*
            r3 = r22
            X.4Yn r0 = r3.A0L
            if (r0 == 0) goto L_0x03ed
            android.graphics.Paint r7 = X.AnonymousClass3MW.A06()
            r11 = 1
            r7.setAntiAlias(r11)
            r7.setFilterBitmap(r11)
            r7.setDither(r11)
            X.4Yn r0 = r3.A0L
            android.graphics.Rect r6 = r0.A02()
            int r4 = r3.A05
            java.lang.String r5 = "CropImage/cannot_resample: "
            java.lang.String r9 = "CropImage/oom: "
            java.lang.String r2 = "filter"
            java.lang.String r10 = "doodle"
            r15 = 0
            r8 = 0
            if (r4 == 0) goto L_0x0100
            int r1 = r3.A06
            if (r1 == 0) goto L_0x0100
            int r12 = r3.A08
            if (r12 <= r11) goto L_0x0044
            int r0 = r6.left
            int r0 = r0 * r12
            r6.left = r0
            int r0 = r6.right
            int r0 = r0 * r12
            r6.right = r0
            int r0 = r6.top
            int r0 = r0 * r12
            r6.top = r0
            int r0 = r6.bottom
            int r0 = r0 * r12
            r6.bottom = r0
        L_0x0044:
            boolean r0 = r3.A0b
            if (r0 != 0) goto L_0x0058
            int r12 = r6.width()
            int r0 = r3.A05
            if (r12 >= r0) goto L_0x0058
            int r4 = r6.width()
            int r1 = r6.height()
        L_0x0058:
            int r14 = r6.width()
            int r13 = r6.height()
            int r12 = r3.A05
            int r0 = r3.A06
            int r12 = X.AnonymousClass204.A00(r14, r13, r12, r0, r11)
            int r0 = r6.left
            int r0 = r0 / r12
            r6.left = r0
            int r0 = r6.right
            int r0 = r0 / r12
            r6.right = r0
            int r0 = r6.top
            int r0 = r0 / r12
            r6.top = r0
            int r0 = r6.bottom
            int r0 = r0 / r12
            r6.bottom = r0
            int r0 = r3.A08
            if (r0 > r11) goto L_0x0096
            if (r12 > r11) goto L_0x0096
            android.content.Intent r0 = r3.getIntent()
            boolean r0 = r0.hasExtra(r10)
            if (r0 != 0) goto L_0x0096
            android.content.Intent r0 = r3.getIntent()
            int r0 = r0.getIntExtra(r2, r8)
            if (r0 == 0) goto L_0x02b6
        L_0x0096:
            android.graphics.Bitmap r0 = r3.A0A
            if (r0 == 0) goto L_0x009f
            r0.recycle()
            r3.A0A = r15
        L_0x009f:
            android.graphics.BitmapFactory$Options r10 = new android.graphics.BitmapFactory$Options
            r10.<init>()
            r10.inJustDecodeBounds = r8
            r10.inScaled = r8
            r10.inDither = r11
            r10.inPreferQualityOverSpeed = r11
            android.content.Intent r0 = r3.getIntent()
            android.net.Uri r11 = r0.getData()
            r2 = r12
            if (r11 == 0) goto L_0x02b6
        L_0x00b7:
            int r0 = r3.A08
            int r0 = java.lang.Math.max(r0, r12)
            if (r2 > r0) goto L_0x02b6
            r10.inSampleSize = r2
            X.1Nq r13 = r3.A0O     // Catch:{ OutOfMemoryError -> 0x00dd, IOException -> 0x01e8 }
            r0 = 1
            java.io.InputStream r14 = r13.A0A(r11, r0)     // Catch:{ OutOfMemoryError -> 0x00dd, IOException -> 0x01e8 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r14, r15, r10)     // Catch:{ all -> 0x00d3 }
            r3.A0A = r0     // Catch:{ all -> 0x00d3 }
            r14.close()     // Catch:{ OutOfMemoryError -> 0x00dd, IOException -> 0x01e8 }
            goto L_0x02b6
        L_0x00d3:
            r13 = move-exception
            r14.close()     // Catch:{ all -> 0x00d8 }
            goto L_0x00dc
        L_0x00d8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r13, r0)     // Catch:{ OutOfMemoryError -> 0x00dd, IOException -> 0x01e8 }
        L_0x00dc:
            throw r13     // Catch:{ OutOfMemoryError -> 0x00dd, IOException -> 0x01e8 }
        L_0x00dd:
            r13 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.AnonymousClass001.A1I(r9, r0, r2)
            com.whatsapp.util.Log.e(r0, r13)
            android.graphics.Bitmap r0 = r3.A0A
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L_0x00fa
            android.graphics.Bitmap r0 = r3.A0A
            r0.recycle()
            r3.A0A = r15
        L_0x00fa:
            X.C72483Me.A0j(r6)
            int r2 = r2 * 2
            goto L_0x00b7
        L_0x0100:
            int r0 = r3.A08
            if (r0 <= r11) goto L_0x0107
            r3.A00(r6)
        L_0x0107:
            int r0 = r3.A0Y
            r4 = 1
            if (r0 == 0) goto L_0x0126
        L_0x010c:
            int r0 = r6.width()
            int r1 = r0 / 2
            int r0 = r3.A0Y
            if (r1 > r0) goto L_0x0120
            int r0 = r6.height()
            int r1 = r0 / 2
            int r0 = r3.A0Y
            if (r1 <= r0) goto L_0x0126
        L_0x0120:
            int r4 = r4 * 2
            X.C72483Me.A0j(r6)
            goto L_0x010c
        L_0x0126:
            int r0 = r3.A08
            if (r0 > r11) goto L_0x0140
            if (r4 > r11) goto L_0x0140
            android.content.Intent r0 = r3.getIntent()
            boolean r0 = r0.hasExtra(r10)
            if (r0 != 0) goto L_0x0140
            android.content.Intent r0 = r3.getIntent()
            int r0 = r0.getIntExtra(r2, r8)
            if (r0 == 0) goto L_0x020d
        L_0x0140:
            android.graphics.Bitmap r0 = r3.A0A
            if (r0 == 0) goto L_0x0149
            r0.recycle()
            r3.A0A = r15
        L_0x0149:
            android.content.Intent r0 = r3.getIntent()
            android.net.Uri r2 = r0.getData()
            r1 = r4
            r14 = r15
            if (r2 == 0) goto L_0x020c
        L_0x0155:
            int r0 = r3.A08
            int r0 = java.lang.Math.max(r0, r4)
            if (r1 > r0) goto L_0x020c
            android.graphics.BitmapFactory$Options r10 = new android.graphics.BitmapFactory$Options
            r10.<init>()
            r10.inSampleSize = r1
            r10.inJustDecodeBounds = r8
            r10.inScaled = r8
            r10.inDither = r11
            r10.inPreferQualityOverSpeed = r11
            X.1Nq r0 = r3.A0O     // Catch:{ OutOfMemoryError -> 0x01b7, IOException -> 0x01e8 }
            java.io.InputStream r12 = r0.A0A(r2, r11)     // Catch:{ OutOfMemoryError -> 0x01b7, IOException -> 0x01e8 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r12, r15, r10)     // Catch:{ all -> 0x01ad }
            r3.A0A = r0     // Catch:{ all -> 0x01ad }
            int r13 = r6.width()     // Catch:{ all -> 0x01ad }
            int r11 = r6.height()     // Catch:{ all -> 0x01ad }
            int r0 = r3.A0Y     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x0192
            if (r13 > r0) goto L_0x0188
            if (r11 <= r0) goto L_0x0192
        L_0x0188:
            if (r13 <= r11) goto L_0x018b
            goto L_0x018f
        L_0x018b:
            int r13 = r13 * r0
            int r13 = r13 / r11
            r11 = r0
            goto L_0x0192
        L_0x018f:
            int r11 = r11 * r0
            int r11 = r11 / r13
            r13 = r0
        L_0x0192:
            android.graphics.Bitmap r0 = r3.A0A     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x019f
            android.graphics.Bitmap$Config r10 = r0.getConfig()     // Catch:{ all -> 0x01ad }
        L_0x019a:
            boolean r0 = r3.A0T     // Catch:{ all -> 0x01ad }
            if (r0 != 0) goto L_0x01a3
            goto L_0x01a1
        L_0x019f:
            r10 = r15
            goto L_0x019a
        L_0x01a1:
            if (r10 != 0) goto L_0x01a5
        L_0x01a3:
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x01ad }
        L_0x01a5:
            android.graphics.Bitmap r14 = android.graphics.Bitmap.createBitmap(r13, r11, r10)     // Catch:{ all -> 0x01ad }
            r12.close()     // Catch:{ OutOfMemoryError -> 0x01b7, IOException -> 0x01e8 }
            goto L_0x020c
        L_0x01ad:
            r10 = move-exception
            r12.close()     // Catch:{ all -> 0x01b2 }
            goto L_0x01b6
        L_0x01b2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r10, r0)     // Catch:{ OutOfMemoryError -> 0x01b7, IOException -> 0x01e8 }
        L_0x01b6:
            throw r10     // Catch:{ OutOfMemoryError -> 0x01b7, IOException -> 0x01e8 }
        L_0x01b7:
            r10 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.AnonymousClass001.A1I(r9, r0, r1)
            com.whatsapp.util.Log.e(r0, r10)
            android.graphics.Bitmap r0 = r3.A0A
            if (r0 == 0) goto L_0x01d4
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L_0x01d4
            android.graphics.Bitmap r0 = r3.A0A
            r0.recycle()
            r3.A0A = r15
        L_0x01d4:
            if (r14 == 0) goto L_0x01e0
            boolean r0 = r14.isRecycled()
            if (r0 != 0) goto L_0x01e0
            r14.recycle()
            r14 = r15
        L_0x01e0:
            X.C72483Me.A0j(r6)
            int r1 = r1 * 2
            r11 = 1
            goto L_0x0155
        L_0x01e8:
            r0 = move-exception
            com.whatsapp.util.Log.e(r5, r0)
            java.lang.String r0 = "CropImage/activityRes/fail/load-image"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "io-error"
            r0 = 1
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "error_message_id"
            r0 = 2131889981(0x7f120f3d, float:1.941464E38)
            android.content.Intent r0 = r2.putExtra(r1, r0)
            r3.setResult(r8, r0)
            r3.finish()
            return
        L_0x020c:
            r15 = r14
        L_0x020d:
            android.graphics.Bitmap r0 = r3.A0A
            if (r0 == 0) goto L_0x0298
            int r9 = r6.width()
            int r2 = r6.height()
            int r0 = r3.A0Y
            if (r0 == 0) goto L_0x0226
            if (r9 > r0) goto L_0x0221
            if (r2 <= r0) goto L_0x0226
        L_0x0221:
            if (r9 <= r2) goto L_0x0294
            int r2 = r2 * r0
            int r2 = r2 / r9
            r9 = r0
        L_0x0226:
            if (r15 != 0) goto L_0x023a
            android.graphics.Bitmap r0 = r3.A0A
            android.graphics.Bitmap$Config r1 = r0.getConfig()
            boolean r0 = r3.A0T
            if (r0 != 0) goto L_0x0234
            if (r1 != 0) goto L_0x0236
        L_0x0234:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x0236:
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r9, r2, r1)
        L_0x023a:
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r15)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r8, r8, r9, r2)
            android.graphics.Matrix r0 = r3.A0C
            if (r0 == 0) goto L_0x028d
            boolean r0 = r3.A0V
            if (r0 == 0) goto L_0x028d
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            int r1 = r4.left
            int r0 = r4.right
            int r1 = r1 + r0
            int r0 = -r1
            float r2 = (float) r0
            r9 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r9
            int r1 = r4.top
            int r0 = r4.bottom
            int r1 = r1 + r0
            int r0 = -r1
            float r0 = (float) r0
            float r0 = r0 / r9
            r8.preTranslate(r2, r0)
            android.graphics.Matrix r0 = r3.A0C
            r8.postConcat(r0)
            int r0 = r3.A07
            float r0 = (float) r0
            r8.postRotate(r0)
            int r1 = r4.left
            int r0 = r4.right
            int r1 = r1 + r0
            float r2 = (float) r1
            float r2 = r2 / r9
            int r1 = r4.top
            int r0 = r4.bottom
            int r1 = r1 + r0
            float r0 = (float) r1
            float r0 = r0 / r9
            r8.postTranslate(r2, r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r4)
            r8.mapRect(r0)
            r5.setMatrix(r8)
        L_0x028d:
            android.graphics.Bitmap r0 = r3.A0A
            r5.drawBitmap(r0, r6, r4, r7)
            goto L_0x0350
        L_0x0294:
            int r9 = r9 * r0
            int r9 = r9 / r2
            r2 = r0
            goto L_0x0226
        L_0x0298:
            java.lang.String r0 = "CropImage/activityRes/oom-error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "error-oom"
            r0 = 1
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "error_message_id"
            r0 = 2131889999(0x7f120f4f, float:1.9414677E38)
            android.content.Intent r0 = r2.putExtra(r1, r0)
            r3.setResult(r8, r0)
            goto L_0x038f
        L_0x02b6:
            android.graphics.Bitmap r0 = r3.A0A
            if (r0 == 0) goto L_0x0298
            android.graphics.Bitmap$Config r0 = r0.getConfig()
            if (r0 != 0) goto L_0x02c2
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x02c2:
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r4, r1, r0)
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r15)
            float r2 = (float) r4
            float r1 = (float) r1
            r0 = 0
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r0, r0, r2, r1)
            boolean r0 = r3.A0a
            if (r0 != 0) goto L_0x030b
            int r0 = r6.width()
            float r1 = (float) r0
            float r0 = r4.width()
            float r1 = r1 - r0
            int r0 = (int) r1
            int r9 = r0 / 2
            int r0 = r6.height()
            float r1 = (float) r0
            float r0 = r4.height()
            float r1 = r1 - r0
            int r0 = (int) r1
            int r2 = r0 / 2
            int r1 = java.lang.Math.max(r8, r9)
            int r0 = java.lang.Math.max(r8, r2)
            r6.inset(r1, r0)
            int r0 = -r9
            int r0 = java.lang.Math.max(r8, r0)
            float r1 = (float) r0
            int r0 = -r2
            int r0 = java.lang.Math.max(r8, r0)
            float r0 = (float) r0
            r4.inset(r1, r0)
        L_0x030b:
            android.graphics.Matrix r0 = r3.A0C
            if (r0 == 0) goto L_0x034b
            boolean r0 = r3.A0V
            if (r0 == 0) goto L_0x034b
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            float r1 = r4.left
            float r0 = r4.right
            float r1 = r1 + r0
            float r2 = -r1
            r9 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r9
            float r1 = r4.top
            float r0 = r4.bottom
            float r1 = r1 + r0
            float r0 = -r1
            float r0 = r0 / r9
            r8.preTranslate(r2, r0)
            android.graphics.Matrix r0 = r3.A0C
            r8.postConcat(r0)
            int r0 = r3.A07
            float r0 = (float) r0
            r8.postRotate(r0)
            float r2 = r4.left
            float r0 = r4.right
            float r2 = r2 + r0
            float r2 = r2 / r9
            float r1 = r4.top
            float r0 = r4.bottom
            float r1 = r1 + r0
            float r1 = r1 / r9
            r8.postTranslate(r2, r1)
            r8.mapRect(r4)
            r5.setMatrix(r8)
        L_0x034b:
            android.graphics.Bitmap r0 = r3.A0A
            r5.drawBitmap(r0, r6, r4, r7)
        L_0x0350:
            android.graphics.Bitmap r0 = r3.A0A
            if (r0 == 0) goto L_0x0357
            r0.recycle()
        L_0x0357:
            X.4Yn r0 = r3.A0L
            if (r0 == 0) goto L_0x03ed
            android.graphics.Rect r7 = r0.A02()
            int r1 = r3.A08
            r0 = 1
            if (r1 <= r0) goto L_0x0367
            r3.A00(r7)
        L_0x0367:
            android.net.Uri r0 = r3.A0E
            r9 = -1
            java.lang.String r8 = "composerToolToOpenOnComplete"
            if (r0 != 0) goto L_0x0393
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r0 = "rect"
            r2.putExtra(r0, r7)
            java.lang.String r1 = "rotate"
            int r0 = r3.A07
            r2.putExtra(r1, r0)
            android.content.Intent r0 = r3.getIntent()
            android.os.Bundle r0 = r0.getBundleExtra(r8)
            r2.putExtra(r8, r0)
            r3.setResult(r9, r2)
            r15.recycle()
        L_0x038f:
            r3.finish()
            return
        L_0x0393:
            X.0ve r2 = r3.A01
            r1 = 11698(0x2db2, float:1.6392E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x03e1
            X.00H r0 = r3.A0Q
            java.lang.Object r13 = r0.get()
            X.2ib r13 = (X.C57142ib) r13
            android.net.Uri r6 = r3.A0E
            int r5 = r3.A07
            int r4 = r3.A03
            int r2 = r3.A02
            boolean r1 = r3.A0V
            android.graphics.Bitmap$CompressFormat r14 = r3.A09
            android.content.Intent r0 = r3.getIntent()
            int r21 = r0.getIntExtra(r8, r9)
            r17 = r6
            r18 = r5
            r19 = r4
            r20 = r2
            r22 = r1
            r16 = r7
            android.util.Pair r1 = r13.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto L_0x038f
            java.lang.Object r0 = r1.first
            if (r0 == 0) goto L_0x038f
            java.lang.Object r1 = r1.second
            if (r1 == 0) goto L_0x038f
            java.lang.Number r0 = (java.lang.Number) r0
            android.content.Intent r1 = (android.content.Intent) r1
            int r0 = r0.intValue()
            r3.setResult(r0, r1)
            goto L_0x038f
        L_0x03e1:
            X.1KB r2 = r3.A0G
            r1 = 43
            X.4rb r0 = new X.4rb
            r0.<init>(r3, r15, r7, r1)
            r2.CGP(r0)
        L_0x03ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.crop.CropImage.A03(com.whatsapp.crop.CropImage):void");
    }

    public void A2y() {
        if (!this.A0Z) {
            this.A0Z = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K2.AAQ;
            this.A05 = AnonymousClass10E.AL1(r2);
            this.A0G = AnonymousClass10E.A12(r2);
            this.A0N = AnonymousClass3Ma.A0f(r2);
            this.A0H = AnonymousClass3Ma.A0L(r2);
            this.A0R = C000200d.A00(r2.AAV);
            this.A0M = (AnonymousClass2E5) r2.A00.ABG.get();
            this.A0O = (C25291Nq) r2.A6E.get();
            this.A0F = (AnonymousClass1T1) r2.A43.get();
            this.A0I = AnonymousClass3Ma.A0a(r2);
            this.A0J = (C29781cr) r2.AAq.get();
            this.A0P = (C26631Sw) r2.AAO.get();
            this.A0Q = C000200d.A00(A0K2.A0r);
        }
    }

    public void onDestroy() {
        Log.i("CropImage/onDestroy");
        super.onDestroy();
        Bitmap bitmap = this.A0A;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.A0K.A01 = true;
            this.A0A.recycle();
            this.A0A = null;
        }
        AnonymousClass10I r2 = this.A05;
        C29781cr r1 = this.A0J;
        r1.getClass();
        C98834rn.A01(r2, r1, 37);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("rotate", this.A07);
        C88154Yn r0 = this.A0L;
        if (r0 != null) {
            Rect A022 = r0.A02();
            A00(A022);
            bundle.putParcelable("initialRect", A022);
        }
    }

    public CropImage(int i) {
        this.A0Z = false;
        C91004ez.A00(this, 43);
    }
}
