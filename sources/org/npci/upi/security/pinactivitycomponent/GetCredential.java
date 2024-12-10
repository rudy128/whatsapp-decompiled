package org.npci.upi.security.pinactivitycomponent;

import X.A7M;
import X.AnonymousClass01E;
import X.AnonymousClass8CS;
import X.AnonymousClass9ZM;
import X.C109145ct;
import X.C161118Bu;
import X.C17880vN;
import X.C180719Nq;
import X.C181929Sj;
import X.C188559hc;
import X.C21429Ajw;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import java.lang.Thread;
import java.util.Locale;

public class GetCredential extends AnonymousClass01E {
    public static GetCredential A0L;
    public int A00;
    public int A01 = 0;
    public Bitmap A02 = null;
    public TransitionDrawable A03;
    public View A04;
    public View A05;
    public ImageView A06;
    public Fragment A07;
    public Boolean A08 = false;
    public Boolean A09 = false;
    public String A0A = null;
    public String A0B = "";
    public C161118Bu A0C;
    public C180719Nq A0D;
    public A7M A0E;
    public s A0F = null;
    public boolean A0G = false;
    public ImageView A0H;
    public Thread.UncaughtExceptionHandler A0I = null;
    public AnonymousClass8CS A0J;
    public final Context A0K = this;

    public GetCredential() {
        A0L = this;
    }

    public static void A00(View view, float f, float f2) {
        RotateAnimation rotateAnimation = new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(300);
        rotateAnimation.setFillEnabled(true);
        rotateAnimation.setFillAfter(true);
        view.startAnimation(rotateAnimation);
    }

    public static void A03(GetCredential getCredential, boolean z) {
        float f = 0.0f;
        ImageView imageView = getCredential.A06;
        if (z) {
            A00(imageView, 0.0f, 180.0f);
        } else {
            A00(imageView, 180.0f, 0.0f);
        }
        int height = getCredential.A04.getHeight();
        if (height == 0) {
            height = getCredential.A00;
        }
        getCredential.A04.clearAnimation();
        ViewPropertyAnimator animate = getCredential.A04.animate();
        float f2 = 0.0f;
        if (!z) {
            f2 = ((float) height) * -1.0f;
        }
        ViewPropertyAnimator y = animate.y(f2);
        if (z) {
            f = 1.0f;
        }
        y.alpha(f).setDuration(300).setInterpolator(new AccelerateInterpolator()).setListener(new C109145ct(getCredential, height, 1, z));
    }

    public void onDestroy() {
        super.onDestroy();
        if (A0L != null) {
            A0L = null;
        }
        Thread.currentThread().setUncaughtExceptionHandler(this.A0I);
    }

    public void attachBaseContext(Context context) {
        String string = new AnonymousClass9ZM(context).A00.getString("org.npci.upi.language.pref", "en_US");
        if (Build.VERSION.SDK_INT >= 24) {
            context = C181929Sj.A00(context, string);
        } else {
            String[] split = string.split("_");
            Locale locale = new Locale(string);
            if (split.length == 2) {
                locale = new Locale(split[0], split[1]);
            }
            Locale.setDefault(locale);
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            configuration.locale = locale;
            configuration.setLayoutDirection(locale);
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        super.attachBaseContext(context);
    }

    public void onBackPressed() {
        if (this.A0G) {
            Bundle A0D2 = C17880vN.A0D();
            A0D2.putString("error", "USER_ABORTED");
            C188559hc.A0B.send(0, A0D2);
            super.onBackPressed();
            return;
        }
        this.A0G = true;
        Toast.makeText(this, getString(2131898719), 0).show();
        new Handler().postDelayed(new C21429Ajw(this, 23), 2000);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.9Nq] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.9hc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v48, types: [android.os.AsyncTask, X.8CS] */
    /* JADX WARNING: type inference failed for: r4v9, types: [X.9Nz, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v6, types: [java.lang.Object, X.9Nl] */
    /* JADX WARNING: type inference failed for: r3v31, types: [X.9Np, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v420, types: [X.9Ny, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:336|337) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:370|371|378) */
    /* JADX WARNING: Code restructure failed: missing block: B:337:?, code lost:
        r1 = new X.AnonymousClass9LU(X.AnonymousClass9Hf.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:?, code lost:
        r3 = new X.AnonymousClass9LW(r13, "L14", "l14.message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x07c9, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:?, code lost:
        r3 = new X.AnonymousClass9LW(r13, "L09", "l09.message", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x07e0, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x07e1, code lost:
        r3 = new X.AnonymousClass9LW(r13, "L11", "l11.message", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x07eb, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x07ec, code lost:
        r3 = new X.AnonymousClass9LW(r13, "L10", "l10.message", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:?, code lost:
        r1 = new X.AnonymousClass9LU(X.AnonymousClass9Hf.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x080f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x081a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:?, code lost:
        r3 = new X.AnonymousClass9LW(r13, "L09", "l09.message", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0825, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0826, code lost:
        r2.getMessage();
        r3 = new X.AnonymousClass9LW(r13, "L05", "l05.message", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x083d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:?, code lost:
        r3 = new X.AnonymousClass9LW(r13, "L07", "l07.message", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0844, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0845, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0846, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0847, code lost:
        r3 = new X.AnonymousClass9LW(r13, "L07", "l07.message", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x084d, code lost:
        r3 = new X.AnonymousClass9LW(r13, "L15", "l15.message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x0e95, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:?, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append(r4.a);
        r3 = X.AnonymousClass000.A0y("", r1);
        r1 = r4.b;
        r2 = X.C17880vN.A0D();
        r2.putString("errorCode", r3);
        r2.putString("error", r1);
        X.C188559hc.A0B.send(0, r2);
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x0ebc, code lost:
        throw r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:331:0x076d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:336:0x077d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:370:0x07f6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:376:0x0808 */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0291 A[Catch:{ Exception -> 0x030a }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x029f A[Catch:{ Exception -> 0x030a }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0097 A[Catch:{ Exception -> 0x030a }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02f4 A[Catch:{ Exception -> 0x030a }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b3 A[Catch:{ Exception -> 0x030a }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c9 A[Catch:{ Exception -> 0x030a }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00de A[Catch:{ Exception -> 0x030a }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ee A[Catch:{ Exception -> 0x030a }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0100 A[Catch:{ Exception -> 0x030a }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0112 A[Catch:{ Exception -> 0x030a }] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0844 A[Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857, 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }, ExcHandler: 9LW (r0v308 'e' X.9LW A[CUSTOM_DECLARE, Catch:{ Exception -> 0x0ecb }]), Splitter:B:169:0x0431] */
    /* JADX WARNING: Removed duplicated region for block: B:401:? A[ExcHandler: 9LW | Exception (unused java.lang.Throwable), SYNTHETIC, Splitter:B:146:0x0313] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:370:0x07f6=Splitter:B:370:0x07f6, B:376:0x0808=Splitter:B:376:0x0808, B:336:0x077d=Splitter:B:336:0x077d} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:370:0x07f6=Splitter:B:370:0x07f6, B:376:0x0808=Splitter:B:376:0x0808} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r13 = r23
            X.AnonymousClass8BV.A11(r13)
            r0 = r24
            super.onCreate(r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.getUncaughtExceptionHandler()
            r13.A0I = r0
            X.Akf r0 = new X.Akf
            r0.<init>()
            r1.setUncaughtExceptionHandler(r0)
            android.os.Bundle r7 = X.AnonymousClass3MY.A09(r13)
            java.lang.String r16 = "payerBankName"
            java.lang.String r1 = "forgotUpiPINEnabled"
            java.lang.String r2 = "captureCardDetails"
            java.lang.String r3 = "issuerResendOTPLimit"
            java.lang.String r4 = "aadhaarResendOTPLimit"
            java.lang.String r6 = "resendIssuerOTPFeature"
            java.lang.String r9 = "resendAadhaarOTPFeature"
            X.9Nq r5 = new X.9Nq
            r5.<init>()
            r10 = 0
            r5.A0C = r10
            r5.A0D = r10
            r5.A08 = r10
            r5.A0E = r10
            r5.A09 = r10
            java.lang.String r22 = "en_US"
            r0 = r22
            r5.A04 = r0
            r8 = 0
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r8)
            r0 = r17
            r5.A02 = r0
            r5.A03 = r10
            r0 = 2
            r5.A00 = r0
            r5.A0I = r8
            r5.A0J = r8
            r5.A0K = r8
            r5.A0L = r8
            java.lang.String r12 = ""
            r5.A05 = r12
            r5.A06 = r12
            java.util.HashMap r0 = X.C17880vN.A11()
            r5.A07 = r0
            org.json.JSONObject r0 = X.C17880vN.A15()
            r5.A0F = r0
            if (r7 == 0) goto L_0x030a
            r5.A01 = r7
            java.lang.String r0 = "configuration"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ Exception -> 0x030a }
            if (r0 == 0) goto L_0x007e
            org.json.JSONObject r0 = X.C17880vN.A16(r0)     // Catch:{ Exception -> 0x030a }
            r5.A0C = r0     // Catch:{ Exception -> 0x030a }
        L_0x007e:
            org.json.JSONObject r0 = r5.A0C     // Catch:{ Exception -> 0x030a }
            boolean r0 = r0.has(r9)     // Catch:{ Exception -> 0x030a }
            if (r0 == 0) goto L_0x00a4
            org.json.JSONObject r0 = r5.A0C     // Catch:{ Exception -> 0x030a }
            boolean r0 = r0.getBoolean(r9)     // Catch:{ Exception -> 0x030a }
        L_0x008c:
            r5.A0I = r0     // Catch:{ Exception -> 0x030a }
        L_0x008e:
            org.json.JSONObject r0 = r5.A0C     // Catch:{ Exception -> 0x030a }
            boolean r0 = r0.has(r4)     // Catch:{ Exception -> 0x030a }
            r10 = 3
            if (r0 == 0) goto L_0x00b3
            org.json.JSONObject r0 = r5.A0C     // Catch:{ Exception -> 0x030a }
            java.lang.String r0 = r0.getString(r4)     // Catch:{ Exception -> 0x030a }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x030a }
            r5.A00 = r3     // Catch:{ Exception -> 0x030a }
            goto L_0x00c7
        L_0x00a4:
            org.json.JSONObject r0 = r5.A0C     // Catch:{ Exception -> 0x030a }
            boolean r0 = r0.has(r6)     // Catch:{ Exception -> 0x030a }
            if (r0 == 0) goto L_0x008e
            org.json.JSONObject r0 = r5.A0C     // Catch:{ Exception -> 0x030a }
            boolean r0 = r0.getBoolean(r6)     // Catch:{ Exception -> 0x030a }
            goto L_0x008c
        L_0x00b3:
            org.json.JSONObject r0 = r5.A0C     // Catch:{ Exception -> 0x030a }
            boolean r0 = r0.has(r3)     // Catch:{ Exception -> 0x030a }
            if (r0 == 0) goto L_0x00cd
            org.json.JSONObject r0 = r5.A0C     // Catch:{ Exception -> 0x030a }
            java.lang.String r0 = r0.getString(r3)     // Catch:{ Exception -> 0x030a }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x030a }
            r5.A00 = r3     // Catch:{ Exception -> 0x030a }
        L_0x00c7:
            if (r3 <= r10) goto L_0x00ce
            r5.A00 = r10     // Catch:{ Exception -> 0x030a }
            r3 = 3
            goto L_0x00ce
        L_0x00cd:
            r3 = 2
        L_0x00ce:
            boolean r0 = r5.A0I     // Catch:{ Exception -> 0x030a }
            if (r0 == 0) goto L_0x00d6
            if (r3 > 0) goto L_0x00d6
            r5.A0I = r8     // Catch:{ Exception -> 0x030a }
        L_0x00d6:
            org.json.JSONObject r0 = r5.A0C     // Catch:{ Exception -> 0x030a }
            boolean r0 = r0.has(r2)     // Catch:{ Exception -> 0x030a }
            if (r0 == 0) goto L_0x00e6
            org.json.JSONObject r0 = r5.A0C     // Catch:{ Exception -> 0x030a }
            boolean r0 = r0.getBoolean(r2)     // Catch:{ Exception -> 0x030a }
            r5.A0J = r0     // Catch:{ Exception -> 0x030a }
        L_0x00e6:
            org.json.JSONObject r0 = r5.A0C     // Catch:{ Exception -> 0x030a }
            boolean r0 = r0.has(r1)     // Catch:{ Exception -> 0x030a }
            if (r0 == 0) goto L_0x00f6
            org.json.JSONObject r0 = r5.A0C     // Catch:{ Exception -> 0x030a }
            boolean r0 = r0.getBoolean(r1)     // Catch:{ Exception -> 0x030a }
            r5.A0K = r0     // Catch:{ Exception -> 0x030a }
        L_0x00f6:
            org.json.JSONObject r1 = r5.A0C     // Catch:{ Exception -> 0x030a }
            r0 = r16
            boolean r0 = r1.has(r0)     // Catch:{ Exception -> 0x030a }
            if (r0 == 0) goto L_0x010a
            org.json.JSONObject r1 = r5.A0C     // Catch:{ Exception -> 0x030a }
            r0 = r16
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x030a }
            r5.A05 = r0     // Catch:{ Exception -> 0x030a }
        L_0x010a:
            java.lang.String r0 = "controls"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ Exception -> 0x030a }
            if (r0 == 0) goto L_0x0289
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ Exception -> 0x030a }
            r5.A0D = r1     // Catch:{ Exception -> 0x030a }
            java.lang.String r0 = "CredAllowed"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ Exception -> 0x030a }
            if (r1 == 0) goto L_0x0289
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x030a }
            r0.<init>(r1)     // Catch:{ Exception -> 0x030a }
            r5.A08 = r0     // Catch:{ Exception -> 0x030a }
            java.util.ArrayList r11 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x030a }
            r15 = 0
            r6 = r15
            r4 = r15
            r19 = r15
            r18 = r15
            r3 = r15
            r2 = r15
            r14 = 0
        L_0x0135:
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x030a }
            int r0 = r0.length()     // Catch:{ Exception -> 0x030a }
            if (r14 >= r0) goto L_0x01b9
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x01b5 }
            org.json.JSONObject r1 = X.AnonymousClass8BR.A1B(r0, r14)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r0 = "subtype"
            java.lang.String r1 = r1.optString(r0, r12)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r0 = "ATM"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x01b5 }
            if (r0 == 0) goto L_0x0157
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x01b5 }
            org.json.JSONObject r15 = r0.getJSONObject(r14)     // Catch:{ Exception -> 0x01b5 }
        L_0x0157:
            java.lang.String r0 = "ATMPIN"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x01b5 }
            if (r0 == 0) goto L_0x0165
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x01b5 }
            org.json.JSONObject r19 = r0.getJSONObject(r14)     // Catch:{ Exception -> 0x01b5 }
        L_0x0165:
            java.lang.String r0 = "OTP|SMS|HOTP|TOTP"
            boolean r0 = r1.matches(r0)     // Catch:{ Exception -> 0x01b5 }
            if (r0 == 0) goto L_0x0173
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x01b5 }
            org.json.JSONObject r6 = r0.getJSONObject(r14)     // Catch:{ Exception -> 0x01b5 }
        L_0x0173:
            java.lang.String r0 = "MPIN"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x01b5 }
            if (r0 == 0) goto L_0x0181
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x01b5 }
            org.json.JSONObject r4 = r0.getJSONObject(r14)     // Catch:{ Exception -> 0x01b5 }
        L_0x0181:
            java.lang.String r0 = "NMPIN"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x01b5 }
            if (r0 == 0) goto L_0x018f
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x01b5 }
            org.json.JSONObject r3 = r0.getJSONObject(r14)     // Catch:{ Exception -> 0x01b5 }
        L_0x018f:
            java.lang.String r0 = "AADHAAR"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x01b5 }
            if (r0 == 0) goto L_0x01a7
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x01b5 }
            org.json.JSONObject r18 = r0.getJSONObject(r14)     // Catch:{ Exception -> 0x01b5 }
            org.json.JSONObject r0 = r5.A0C     // Catch:{ Exception -> 0x01b5 }
            boolean r0 = r0.has(r9)     // Catch:{ Exception -> 0x01b5 }
            if (r0 != 0) goto L_0x01a7
            r5.A0I = r8     // Catch:{ Exception -> 0x01b5 }
        L_0x01a7:
            java.lang.String r0 = "SIGNATURE"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x01b5 }
            if (r0 == 0) goto L_0x01b5
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x01b5 }
            org.json.JSONObject r2 = r0.getJSONObject(r14)     // Catch:{ Exception -> 0x01b5 }
        L_0x01b5:
            int r14 = r14 + 1
            goto L_0x0135
        L_0x01b9:
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x030a }
            int r0 = r0.length()     // Catch:{ Exception -> 0x030a }
            if (r0 != r10) goto L_0x01d0
            if (r15 == 0) goto L_0x01d0
            if (r6 == 0) goto L_0x01d0
            if (r4 == 0) goto L_0x01d0
            r11.add(r6)     // Catch:{ Exception -> 0x030a }
            r11.add(r15)     // Catch:{ Exception -> 0x030a }
            r11.add(r4)     // Catch:{ Exception -> 0x030a }
        L_0x01d0:
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x030a }
            int r0 = r0.length()     // Catch:{ Exception -> 0x030a }
            if (r0 != r10) goto L_0x01e9
            if (r19 == 0) goto L_0x01e9
            if (r6 == 0) goto L_0x01e9
            if (r4 == 0) goto L_0x01e9
            r11.add(r6)     // Catch:{ Exception -> 0x030a }
            r0 = r19
            r11.add(r0)     // Catch:{ Exception -> 0x030a }
            r11.add(r4)     // Catch:{ Exception -> 0x030a }
        L_0x01e9:
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x030a }
            int r0 = r0.length()     // Catch:{ Exception -> 0x030a }
            if (r0 != r10) goto L_0x0202
            if (r18 == 0) goto L_0x0202
            if (r6 == 0) goto L_0x0202
            if (r4 == 0) goto L_0x0202
            r0 = r18
            r11.add(r0)     // Catch:{ Exception -> 0x030a }
            r11.add(r6)     // Catch:{ Exception -> 0x030a }
            r11.add(r4)     // Catch:{ Exception -> 0x030a }
        L_0x0202:
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x030a }
            int r0 = r0.length()     // Catch:{ Exception -> 0x030a }
            r1 = 2
            if (r0 != r1) goto L_0x0215
            if (r6 == 0) goto L_0x0215
            if (r4 == 0) goto L_0x0215
            r11.add(r6)     // Catch:{ Exception -> 0x030a }
            r11.add(r4)     // Catch:{ Exception -> 0x030a }
        L_0x0215:
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x030a }
            int r0 = r0.length()     // Catch:{ Exception -> 0x030a }
            if (r0 != r1) goto L_0x0227
            if (r4 == 0) goto L_0x0227
            if (r3 == 0) goto L_0x0227
            r11.add(r4)     // Catch:{ Exception -> 0x030a }
            r11.add(r3)     // Catch:{ Exception -> 0x030a }
        L_0x0227:
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x030a }
            int r0 = r0.length()     // Catch:{ Exception -> 0x030a }
            if (r0 != r1) goto L_0x0239
            if (r4 == 0) goto L_0x0239
            if (r2 == 0) goto L_0x0239
            r11.add(r4)     // Catch:{ Exception -> 0x030a }
            r11.add(r2)     // Catch:{ Exception -> 0x030a }
        L_0x0239:
            int r0 = r11.size()     // Catch:{ Exception -> 0x030a }
            if (r0 <= 0) goto L_0x0246
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x030a }
            r0.<init>(r11)     // Catch:{ Exception -> 0x030a }
            r5.A08 = r0     // Catch:{ Exception -> 0x030a }
        L_0x0246:
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x030a }
            org.json.JSONObject r0 = r0.optJSONObject(r8)     // Catch:{ Exception -> 0x030a }
            java.lang.String r1 = "subtype"
            r2 = 1
            if (r0 == 0) goto L_0x0263
            java.lang.String r3 = r0.optString(r1, r12)     // Catch:{ Exception -> 0x030a }
            java.lang.String r0 = "MPIN"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x030a }
            if (r0 == 0) goto L_0x0263
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x030a }
            r5.A02 = r0     // Catch:{ Exception -> 0x030a }
        L_0x0263:
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x030a }
            int r0 = r0.length()     // Catch:{ Exception -> 0x030a }
            if (r0 != r2) goto L_0x0289
            org.json.JSONArray r0 = r5.A08     // Catch:{ Exception -> 0x030a }
            org.json.JSONObject r0 = r0.getJSONObject(r8)     // Catch:{ Exception -> 0x030a }
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x030a }
            if (r1 == 0) goto L_0x027f
            java.lang.String r0 = "IDENTITY"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x030a }
            if (r0 != 0) goto L_0x0287
        L_0x027f:
            java.lang.String r0 = "SIGNATURE"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x030a }
            if (r0 == 0) goto L_0x0289
        L_0x0287:
            r5.A0L = r2     // Catch:{ Exception -> 0x030a }
        L_0x0289:
            java.lang.String r0 = "salt"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ Exception -> 0x030a }
            if (r0 == 0) goto L_0x0297
            org.json.JSONObject r0 = X.C17880vN.A16(r0)     // Catch:{ Exception -> 0x030a }
            r5.A0E = r0     // Catch:{ Exception -> 0x030a }
        L_0x0297:
            java.lang.String r0 = "payInfo"
            java.lang.String r1 = r7.getString(r0)     // Catch:{ Exception -> 0x030a }
            if (r1 == 0) goto L_0x02ec
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x030a }
            r0.<init>(r1)     // Catch:{ Exception -> 0x030a }
            r5.A09 = r0     // Catch:{ Exception -> 0x030a }
        L_0x02a6:
            org.json.JSONArray r0 = r5.A09     // Catch:{ Exception -> 0x030a }
            int r0 = r0.length()     // Catch:{ Exception -> 0x030a }
            if (r8 >= r0) goto L_0x02ec
            org.json.JSONArray r0 = r5.A09     // Catch:{ Exception -> 0x02e9 }
            org.json.JSONObject r1 = X.AnonymousClass8BR.A1B(r0, r8)     // Catch:{ Exception -> 0x02e9 }
            java.lang.String r0 = "name"
            java.lang.String r1 = r1.optString(r0, r12)     // Catch:{ Exception -> 0x02e9 }
            X.9IP r0 = X.AnonymousClass9IP.account     // Catch:{ Exception -> 0x02e9 }
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x02e9 }
            if (r0 == 0) goto L_0x02e9
            org.json.JSONArray r0 = r5.A09     // Catch:{ Exception -> 0x02e9 }
            org.json.JSONObject r1 = X.AnonymousClass8BR.A1B(r0, r8)     // Catch:{ Exception -> 0x02e9 }
            java.lang.String r0 = "value"
            java.lang.String r2 = r1.optString(r0, r12)     // Catch:{ Exception -> 0x02e9 }
            r5.A06 = r2     // Catch:{ Exception -> 0x02e9 }
            int r1 = r2.length()     // Catch:{ Exception -> 0x02e9 }
            int r0 = r1 + -4
            java.lang.String r2 = r2.substring(r0, r1)     // Catch:{ Exception -> 0x02e9 }
            r5.A06 = r2     // Catch:{ Exception -> 0x02e9 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x02e9 }
            java.lang.String r0 = "XXXX"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ Exception -> 0x02e9 }
            r5.A06 = r0     // Catch:{ Exception -> 0x02e9 }
            goto L_0x02ec
        L_0x02e9:
            int r8 = r8 + 1
            goto L_0x02a6
        L_0x02ec:
            java.lang.String r0 = "languagePref"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ Exception -> 0x030a }
            if (r0 == 0) goto L_0x02f6
            r5.A04 = r0     // Catch:{ Exception -> 0x030a }
        L_0x02f6:
            org.json.JSONObject r1 = r5.A0E     // Catch:{ Exception -> 0x030a }
            java.lang.String r0 = "credType"
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ Exception -> 0x030a }
            r5.A0A = r0     // Catch:{ Exception -> 0x030a }
            org.json.JSONObject r1 = r5.A0E     // Catch:{ Exception -> 0x030a }
            java.lang.String r0 = "txnId"
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ Exception -> 0x030a }
            r5.A0B = r0     // Catch:{ Exception -> 0x030a }
        L_0x030a:
            r13.A0D = r5
            X.9hc r3 = new X.9hc     // Catch:{ Exception -> 0x0ecb }
            r3.<init>()     // Catch:{ Exception -> 0x0ecb }
            r5.A0H = r3     // Catch:{ Exception -> 0x0ecb }
            X.9Nz r4 = new X.9Nz     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r4.<init>()     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.util.HashMap r0 = X.C17880vN.A11()     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r4.A03 = r0     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r4.A09 = r3     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.util.Locale r0 = r3.A02     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r4.A02 = r0     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r4.A00 = r13     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            X.9Np r0 = r3.A00     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r4.A01 = r0     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.lang.String r0 = "cl-app.properties"
            java.util.Properties r0 = r4.A00(r0)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r4.A06 = r0     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.lang.String r0 = "validation.properties"
            java.util.Properties r0 = r4.A00(r0)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r4.A04 = r0     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.lang.String r0 = "version.properties"
            java.util.Properties r0 = r4.A00(r0)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r4.A05 = r0     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.util.Locale r0 = r4.A02     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.lang.String r8 = ".properties"
            java.lang.String r2 = "cl-messages_"
            if (r0 == 0) goto L_0x0384
            java.util.Map r7 = r4.A03     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.lang.String r6 = r0.getLanguage()     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r2)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.util.Locale r1 = r4.A02     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
        L_0x0356:
            java.lang.String r0 = r1.getLanguage()     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r8, r2)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.util.Properties r0 = r4.A00(r0)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r7.put(r6, r0)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            X.9oE r0 = r3.A0A     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r4.A07 = r0     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            X.9Nl r7 = new X.9Nl     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r7.<init>()     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r7.A01 = r4     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.lang.String r0 = "MS03LTItNA=="
            r9 = -1
            byte[] r0 = android.util.Base64.decode(r0, r9)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.lang.String r1 = new java.lang.String     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r1.<init>(r0)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.lang.String r0 = "-"
            java.lang.String[] r8 = r1.split(r0)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            int r6 = r8.length     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            goto L_0x0396
        L_0x0384:
            java.util.Locale r1 = new java.util.Locale     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r0 = r22
            r1.<init>(r0)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.util.Map r7 = r4.A03     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.lang.String r6 = r1.getLanguage()     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r2)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            goto L_0x0356
        L_0x0396:
            r0 = r12
            r2 = 0
        L_0x0398:
            if (r2 >= r6) goto L_0x03b4
            r10 = r8[r2]     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            X.9Nz r0 = r7.A01     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.util.Properties r0 = r0.A05     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            if (r0 == 0) goto L_0x03af
            java.lang.String r0 = r0.getProperty(r10)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
        L_0x03aa:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            goto L_0x03b1
        L_0x03af:
            r0 = 0
            goto L_0x03aa
        L_0x03b1:
            int r2 = r2 + 1
            goto L_0x0398
        L_0x03b4:
            byte[] r1 = android.util.Base64.decode(r0, r9)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.lang.String r0 = new java.lang.String     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r0.<init>(r1)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r7.A00 = r0     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r4.A0A = r7     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            X.9Np r0 = r3.A00     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            if (r0 == 0) goto L_0x03da
            java.lang.String r3 = r3.A01     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            if (r3 == 0) goto L_0x03da
            X.9Np r2 = r4.A01     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            X.9oE r1 = r4.A07     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            X.9Ny r0 = new X.9Ny     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r0.<init>()     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r0.A00 = r2     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r0.A01 = r3     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r0.A02 = r1     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r4.A08 = r0     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
        L_0x03da:
            r5.A0G = r4     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            X.9hc r2 = r5.A0H     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            android.os.Bundle r4 = r5.A01     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.lang.String r21 = "l09.message"
            java.lang.String r20 = "L09"
            java.lang.String r6 = "l07.message"
            java.lang.String r5 = "L07"
            java.lang.String r15 = "txnId"
            java.lang.String r0 = "credType"
            X.9oE r1 = new X.9oE     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r1.<init>(r13)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r2.A0A = r1     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            org.json.JSONArray r3 = X.AnonymousClass8BR.A1A()     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            r2.A06 = r3     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            java.lang.String r1 = "setMpin"
            r3.put(r1)     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            org.json.JSONArray r1 = r2.A06     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            java.lang.String r14 = "pay"
            r1.put(r14)     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            org.json.JSONArray r1 = r2.A06     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            java.lang.String r11 = "collect"
            r1.put(r11)     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            org.json.JSONArray r1 = r2.A06     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            java.lang.String r10 = "reqBalChk"
            r1.put(r10)     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            org.json.JSONArray r3 = r2.A06     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            java.lang.String r1 = "reqBalEnq"
            r3.put(r1)     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            org.json.JSONArray r3 = r2.A06     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            java.lang.String r1 = "changeMpin"
            r3.put(r1)     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            org.json.JSONArray r3 = r2.A06     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            java.lang.String r1 = "mandate"
            r3.put(r1)     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            org.json.JSONArray r3 = r2.A06     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            java.lang.String r1 = "binding"
            r3.put(r1)     // Catch:{ Exception -> 0x0846, 9LW | Exception -> 0x0857 }
            java.lang.String r1 = "keyCode"
            java.lang.String r1 = r4.getString(r1)     // Catch:{ 9LW -> 0x0844, Exception -> 0x083d, 9LW | Exception -> 0x0857 }
            r2.A01 = r1     // Catch:{ 9LW -> 0x0844, Exception -> 0x083d, 9LW | Exception -> 0x0857 }
            if (r1 == 0) goto L_0x0833
            boolean r1 = r1.isEmpty()     // Catch:{ 9LW -> 0x0844, Exception -> 0x083d, 9LW | Exception -> 0x0857 }
            if (r1 != 0) goto L_0x0833
            java.lang.String r1 = "keyXmlPayload"
            java.lang.String r5 = r4.getString(r1)     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
            if (r5 == 0) goto L_0x0810
            boolean r1 = r5.isEmpty()     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
            if (r1 != 0) goto L_0x0810
            X.9Np r3 = new X.9Np     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
            r3.<init>()     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
            r3.A03 = r12     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
            org.apache.xml.security.Init.b()     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
            X.9zH r1 = new X.9zH     // Catch:{ 9LU -> 0x0806, Exception -> 0x0808 }
            r1.<init>()     // Catch:{ 9LU -> 0x0806, Exception -> 0x0808 }
            r3.A00 = r1     // Catch:{ 9LU -> 0x0806, Exception -> 0x0808 }
            boolean r1 = r1.A01(r5)     // Catch:{ 9LU -> 0x0806, Exception -> 0x0808 }
            if (r1 == 0) goto L_0x07fe
            X.B4E r1 = new X.B4E     // Catch:{ 9LU -> 0x0806, Exception -> 0x0808 }
            r1.<init>(r5)     // Catch:{ 9LU -> 0x0806, Exception -> 0x0808 }
            r3.A02 = r1     // Catch:{ 9LU -> 0x0806, Exception -> 0x0808 }
            java.util.List r1 = X.B4E.A00     // Catch:{ 9LU -> 0x0806, Exception -> 0x0808 }
            X.C180709Np.A04 = r1     // Catch:{ 9LU -> 0x0806, Exception -> 0x0808 }
            X.9x9 r1 = new X.9x9     // Catch:{ NoSuchAlgorithmException | NoSuchPaddingException -> 0x07f6 }
            r1.<init>()     // Catch:{ NoSuchAlgorithmException | NoSuchPaddingException -> 0x07f6 }
            r3.A01 = r1     // Catch:{ NoSuchAlgorithmException | NoSuchPaddingException -> 0x07f6 }
            r2.A00 = r3     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
            java.lang.String r1 = "controls"
            java.lang.String r3 = r4.getString(r1)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            if (r3 == 0) goto L_0x04a7
            boolean r1 = r3.isEmpty()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            if (r1 != 0) goto L_0x04a7
            java.lang.String r1 = "AADHAAR"
            boolean r1 = r3.contains(r1)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            if (r1 == 0) goto L_0x04a0
            java.lang.String r1 = "ATMPIN"
            boolean r1 = r3.contains(r1)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            if (r1 == 0) goto L_0x04a0
            java.lang.String r2 = "L32"
            java.lang.String r1 = "l32.message"
            X.9LW r0 = new X.9LW     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            r0.<init>(r13, r2, r1)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            throw r0     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
        L_0x04a0:
            org.json.JSONObject r1 = X.C17880vN.A16(r3)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            r2.A07 = r1     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            goto L_0x04d8
        L_0x04a7:
            org.json.JSONObject r6 = X.C17880vN.A15()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            java.lang.String r3 = "type"
            java.lang.String r1 = "PIN"
            r6.put(r3, r1)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            java.lang.String r3 = "subtype"
            java.lang.String r1 = "MPIN"
            r6.put(r3, r1)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            java.lang.String r3 = "dType"
            java.lang.String r1 = "NUM|ALPH"
            r6.put(r3, r1)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            java.lang.String r3 = "dLength"
            r1 = 6
            r6.put(r3, r1)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            org.json.JSONArray r5 = X.AnonymousClass8BR.A1A()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            r5.put(r6)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            r2.A07 = r3     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
            java.lang.String r1 = "CredAllowed"
            r3.put(r1, r5)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07eb, 9LW | Exception -> 0x0857 }
        L_0x04d8:
            java.lang.String r1 = "configuration"
            java.lang.String r3 = r4.getString(r1)     // Catch:{ Exception -> 0x07e0, 9LW | Exception -> 0x0857 }
            if (r3 == 0) goto L_0x04ec
            boolean r1 = r3.isEmpty()     // Catch:{ Exception -> 0x07e0, 9LW | Exception -> 0x0857 }
            if (r1 != 0) goto L_0x04ec
            org.json.JSONObject r1 = X.C17880vN.A16(r3)     // Catch:{ Exception -> 0x07e0, 9LW | Exception -> 0x0857 }
            r2.A08 = r1     // Catch:{ Exception -> 0x07e0, 9LW | Exception -> 0x0857 }
        L_0x04ec:
            java.lang.String r1 = "salt"
            java.lang.String r18 = r4.getString(r1)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            org.json.JSONObject r9 = X.C17880vN.A16(r18)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            if (r18 == 0) goto L_0x05d0
            boolean r1 = r18.isEmpty()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            if (r1 != 0) goto L_0x05d0
            boolean r1 = r9.has(r0)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            java.lang.String r5 = "l24.message"
            java.lang.String r3 = "L24"
            if (r1 == 0) goto L_0x05ca
            java.lang.Object r1 = r9.get(r0)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            boolean r1 = r1 instanceof org.json.JSONArray     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            java.lang.String r8 = "l27.message"
            java.lang.String r7 = "L27"
            if (r1 == 0) goto L_0x05c4
            org.json.JSONArray r0 = r9.getJSONArray(r0)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r2.A05 = r0     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            int r0 = r0.length()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r6 = 1
            if (r0 < r6) goto L_0x05be
            org.json.JSONArray r0 = r2.A05     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            int r1 = r0.length()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r0 = 2
            if (r1 > r0) goto L_0x05b8
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r19 = r1
            r5 = 0
            r6 = 0
        L_0x0532:
            org.json.JSONArray r0 = r2.A05     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            int r0 = r0.length()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            if (r6 >= r0) goto L_0x055f
            r3 = 0
        L_0x053b:
            org.json.JSONArray r0 = r2.A06     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            int r0 = r0.length()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            if (r3 >= r0) goto L_0x055c
            org.json.JSONArray r0 = r2.A05     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            java.lang.String r1 = r0.getString(r6)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            org.json.JSONArray r0 = r2.A06     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            java.lang.String r0 = r0.getString(r3)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            boolean r0 = r1.equals(r0)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r1 = r19
            if (r0 != 0) goto L_0x055c
            r1 = r17
            int r3 = r3 + 1
            goto L_0x053b
        L_0x055c:
            int r6 = r6 + 1
            goto L_0x0532
        L_0x055f:
            boolean r0 = r1.booleanValue()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            if (r0 == 0) goto L_0x05ae
            r6 = r17
            r3 = r6
            r1 = 0
        L_0x0569:
            org.json.JSONArray r0 = r2.A05     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            int r0 = r0.length()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            if (r1 >= r0) goto L_0x0582
            org.json.JSONArray r0 = r2.A05     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            boolean r0 = r0.equals(r10)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            if (r0 == 0) goto L_0x057f
            r6 = r19
        L_0x057f:
            int r1 = r1 + 1
            goto L_0x0569
        L_0x0582:
            boolean r0 = r6.booleanValue()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            if (r0 == 0) goto L_0x05ea
            r1 = 0
        L_0x0589:
            org.json.JSONArray r0 = r2.A05     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            int r0 = r0.length()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            if (r1 >= r0) goto L_0x05da
            org.json.JSONArray r0 = r2.A05     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            boolean r0 = r0.equals(r14)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            if (r0 != 0) goto L_0x05a9
            org.json.JSONArray r0 = r2.A05     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            boolean r0 = r0.equals(r11)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            if (r0 == 0) goto L_0x05ab
        L_0x05a9:
            r3 = r19
        L_0x05ab:
            int r1 = r1 + 1
            goto L_0x0589
        L_0x05ae:
            java.lang.String r1 = "L30"
            java.lang.String r0 = "l30.message"
            X.9LW r2 = new X.9LW     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r2.<init>(r13, r1, r0)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            goto L_0x05e9
        L_0x05b8:
            X.9LW r2 = new X.9LW     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r2.<init>(r13, r3, r5)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            goto L_0x05e9
        L_0x05be:
            X.9LW r2 = new X.9LW     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r2.<init>(r13, r3, r5)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            goto L_0x05e9
        L_0x05c4:
            X.9LW r2 = new X.9LW     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r2.<init>(r13, r7, r8)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            goto L_0x05e9
        L_0x05ca:
            X.9LW r2 = new X.9LW     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r2.<init>(r13, r3, r5)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            goto L_0x05e9
        L_0x05d0:
            java.lang.String r1 = "L12"
            java.lang.String r0 = "l12.message"
            X.9LW r2 = new X.9LW     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r2.<init>(r13, r1, r0)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            goto L_0x05e9
        L_0x05da:
            boolean r0 = r3.booleanValue()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            if (r0 != 0) goto L_0x05ea
            java.lang.String r1 = "L25"
            java.lang.String r0 = "l25.message"
            X.9LW r2 = new X.9LW     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r2.<init>(r13, r1, r0)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
        L_0x05e9:
            throw r2     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
        L_0x05ea:
            boolean r0 = r9.has(r15)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            if (r0 == 0) goto L_0x0649
            java.lang.Object r0 = r9.get(r15)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            boolean r0 = r0 instanceof org.json.JSONArray     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            if (r0 == 0) goto L_0x0643
            org.json.JSONArray r0 = r9.getJSONArray(r15)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r2.A04 = r0     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            int r1 = r0.length()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            org.json.JSONArray r0 = r2.A05     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            int r0 = r0.length()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            if (r1 != r0) goto L_0x0639
            org.json.JSONArray r0 = r2.A04     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            int r1 = r0.length()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r0 = 1
            if (r1 <= r0) goto L_0x0653
            org.json.JSONArray r0 = r2.A04     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            int r1 = r0.length()     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r0 = 2
            if (r1 > r0) goto L_0x0653
            org.json.JSONArray r0 = r2.A04     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            java.lang.String r3 = r0.getString(r5)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            org.json.JSONArray r1 = r2.A04     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r0 = 1
            java.lang.String r0 = r1.getString(r0)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            boolean r0 = r3.equals(r0)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            if (r0 == 0) goto L_0x0653
            java.lang.String r1 = "L29"
            java.lang.String r0 = "l29.message"
            X.9LW r2 = new X.9LW     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r2.<init>(r13, r1, r0)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            goto L_0x05e9
        L_0x0639:
            java.lang.String r1 = "L28"
            java.lang.String r0 = "l28.message"
            X.9LW r2 = new X.9LW     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r2.<init>(r13, r1, r0)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            goto L_0x05e9
        L_0x0643:
            X.9LW r2 = new X.9LW     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r2.<init>(r13, r7, r8)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            goto L_0x05e9
        L_0x0649:
            java.lang.String r1 = "L31"
            java.lang.String r0 = "l31.message"
            X.9LW r2 = new X.9LW     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r2.<init>(r13, r1, r0)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            goto L_0x05e9
        L_0x0653:
            org.json.JSONObject r0 = X.C17880vN.A16(r18)     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            r2.A09 = r0     // Catch:{ 9LW -> 0x0844, Exception -> 0x07d5, 9LW | Exception -> 0x0857 }
            java.lang.String r0 = "trust"
            java.lang.String r1 = r4.getString(r0)     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            if (r1 == 0) goto L_0x07bf
            boolean r0 = r1.isEmpty()     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            if (r0 != 0) goto L_0x07bf
            org.json.JSONObject r19 = X.C17880vN.A16(r1)     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
        L_0x066b:
            org.json.JSONArray r0 = r2.A05     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            int r0 = r0.length()     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            if (r5 >= r0) goto L_0x0785
            org.json.JSONArray r0 = r2.A05     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            java.lang.String r14 = r0.getString(r5)     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            org.json.JSONArray r0 = r2.A04     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            java.lang.String r11 = r0.getString(r5)     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            org.json.JSONArray r0 = r2.A05     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            java.lang.String r1 = r0.getString(r5)     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            r0 = r19
            java.lang.String r18 = r0.getString(r1)     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            java.lang.String r0 = "txnAmount"
            java.lang.String r15 = r1.optString(r0)     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            java.lang.String r0 = "appId"
            java.lang.String r10 = r1.optString(r0)     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            java.lang.String r0 = "deviceId"
            java.lang.String r9 = r1.optString(r0)     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            java.lang.String r0 = "mobileNumber"
            java.lang.String r8 = r1.optString(r0)     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            java.lang.String r0 = "payerAddr"
            java.lang.String r7 = r1.optString(r0)     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            java.lang.String r0 = "payeeAddr"
            java.lang.String r1 = r1.optString(r0)     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            org.json.JSONObject r3 = r2.A09     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            java.lang.String r0 = "random"
            java.lang.String r3 = r3.optString(r0)     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            r0 = 150(0x96, float:2.1E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x077d }
            r6.<init>(r0)     // Catch:{ Exception -> 0x077d }
            java.lang.String r0 = "|"
            if (r14 == 0) goto L_0x06d1
            X.AnonymousClass8BX.A1L(r6, r14)     // Catch:{ Exception -> 0x077d }
        L_0x06d1:
            if (r11 == 0) goto L_0x06d6
            X.AnonymousClass8BX.A1L(r6, r11)     // Catch:{ Exception -> 0x077d }
        L_0x06d6:
            if (r10 == 0) goto L_0x06db
            X.AnonymousClass8BX.A1L(r6, r10)     // Catch:{ Exception -> 0x077d }
        L_0x06db:
            if (r8 == 0) goto L_0x06e0
            X.AnonymousClass8BX.A1L(r6, r8)     // Catch:{ Exception -> 0x077d }
        L_0x06e0:
            if (r9 == 0) goto L_0x06e5
            X.AnonymousClass8BX.A1L(r6, r9)     // Catch:{ Exception -> 0x077d }
        L_0x06e5:
            if (r7 == 0) goto L_0x06ea
            X.AnonymousClass8BX.A1L(r6, r7)     // Catch:{ Exception -> 0x077d }
        L_0x06ea:
            if (r1 == 0) goto L_0x06ef
            X.AnonymousClass8BX.A1L(r6, r1)     // Catch:{ Exception -> 0x077d }
        L_0x06ef:
            if (r15 == 0) goto L_0x06f4
            X.AnonymousClass8BX.A1L(r6, r15)     // Catch:{ Exception -> 0x077d }
        L_0x06f4:
            int r1 = r6.lastIndexOf(r0)     // Catch:{ Exception -> 0x077d }
            r0 = -1
            if (r1 == r0) goto L_0x0706
            int r0 = r6.length()     // Catch:{ Exception -> 0x077d }
            int r0 = r0 + -1
            if (r1 != r0) goto L_0x0706
            r6.deleteCharAt(r1)     // Catch:{ Exception -> 0x077d }
        L_0x0706:
            X.9oE r0 = r2.A0A     // Catch:{ Exception -> 0x077d }
            java.util.ArrayList r0 = r0.A00()     // Catch:{ Exception -> 0x077d }
            java.lang.Object r0 = X.AnonymousClass8BS.A0Y(r0)     // Catch:{ Exception -> 0x077d }
            X.9fB r0 = (X.C187049fB) r0     // Catch:{ Exception -> 0x077d }
            java.lang.String r10 = r0.A01     // Catch:{ Exception -> 0x077d }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x077d }
            X.9x9 r0 = new X.9x9     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            r0.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            r8 = 2
            byte[] r0 = r3.getBytes()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            byte[] r9 = X.C196979vx.A01(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            byte[] r0 = X.C197719x9.A00(r1, r3)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            java.lang.String r7 = X.C196979vx.A00(r0, r8)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            byte[] r0 = r18.getBytes()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            byte[] r6 = X.C196979vx.A01(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            int r0 = r10.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            int r3 = r0 / 2
            byte[] r1 = new byte[r3]     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            r0 = 0
        L_0x073f:
            if (r0 >= r3) goto L_0x0747
            X.AnonymousClass8BY.A1L(r10, r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            int r0 = r0 + 1
            goto L_0x073f
        L_0x0747:
            javax.crypto.spec.SecretKeySpec r3 = X.AnonymousClass8BS.A0v(r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            javax.crypto.Cipher r1 = X.AnonymousClass8BR.A18()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            javax.crypto.spec.GCMParameterSpec r0 = X.AnonymousClass8BT.A11(r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            byte[] r0 = X.AnonymousClass8BS.A1Q(r3, r0, r1, r6, r8)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            java.lang.String r0 = X.C196979vx.A00(r0, r8)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            boolean r0 = r0.equalsIgnoreCase(r7)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            if (r0 == 0) goto L_0x0765
            int r5 = r5 + 1
            goto L_0x066b
        L_0x0765:
            X.9Hf r1 = X.AnonymousClass9Hf.TRUST_NOT_VALID     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            X.9LU r0 = new X.9LU     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            r0.<init>(r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
            throw r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x076d, Exception -> 0x0775 }
        L_0x076d:
            X.9Hf r0 = X.AnonymousClass9Hf.UNKNOWN_ERROR     // Catch:{ Exception -> 0x077d }
            X.9LU r1 = new X.9LU     // Catch:{ Exception -> 0x077d }
            r1.<init>(r0)     // Catch:{ Exception -> 0x077d }
            goto L_0x077c
        L_0x0775:
            X.9Hf r0 = X.AnonymousClass9Hf.UNKNOWN_ERROR     // Catch:{ Exception -> 0x077d }
            X.9LU r1 = new X.9LU     // Catch:{ Exception -> 0x077d }
            r1.<init>(r0)     // Catch:{ Exception -> 0x077d }
        L_0x077c:
            throw r1     // Catch:{ Exception -> 0x077d }
        L_0x077d:
            X.9Hf r0 = X.AnonymousClass9Hf.TRUST_NOT_VALID     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            X.9LU r1 = new X.9LU     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            r1.<init>(r0)     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            goto L_0x07c8
        L_0x0785:
            java.lang.String r0 = "payInfo"
            java.lang.String r1 = r4.getString(r0)     // Catch:{ Exception -> 0x07b4, 9LW | Exception -> 0x0857 }
            if (r1 == 0) goto L_0x079a
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x07b4, 9LW | Exception -> 0x0857 }
            if (r0 != 0) goto L_0x079a
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x07b4, 9LW | Exception -> 0x0857 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x07b4, 9LW | Exception -> 0x0857 }
            r2.A03 = r0     // Catch:{ Exception -> 0x07b4, 9LW | Exception -> 0x0857 }
        L_0x079a:
            java.lang.String r0 = "languagePref"
            java.lang.String r1 = r4.getString(r0)     // Catch:{ Exception -> 0x084d, 9LW | Exception -> 0x0857 }
            if (r1 == 0) goto L_0x07b1
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x084d, 9LW | Exception -> 0x0857 }
            if (r0 != 0) goto L_0x07b1
        L_0x07a8:
            java.util.Locale r0 = new java.util.Locale     // Catch:{ Exception -> 0x084d, 9LW | Exception -> 0x0857 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x084d, 9LW | Exception -> 0x0857 }
            r2.A02 = r0     // Catch:{ Exception -> 0x084d, 9LW | Exception -> 0x0857 }
            goto L_0x0857
        L_0x07b1:
            r1 = r22
            goto L_0x07a8
        L_0x07b4:
            java.lang.String r1 = "L14"
            java.lang.String r0 = "l14.message"
            X.9LW r3 = new X.9LW     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r3.<init>(r13, r1, r0)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            goto L_0x0856
        L_0x07bf:
            java.lang.String r2 = "L17"
            java.lang.String r0 = "l17.message"
            X.9LW r1 = new X.9LW     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
            r1.<init>(r13, r2, r0)     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
        L_0x07c8:
            throw r1     // Catch:{ 9LW -> 0x0844, 9LW -> 0x0844, Exception -> 0x07c9, 9LW | Exception -> 0x0857 }
        L_0x07c9:
            r2 = move-exception
            X.9LW r3 = new X.9LW     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r1 = r20
            r0 = r21
            r3.<init>(r13, r1, r0, r2)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            goto L_0x0856
        L_0x07d5:
            r2 = move-exception
            java.lang.String r1 = "L13"
            java.lang.String r0 = "l13.message"
            X.9LW r3 = new X.9LW     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r3.<init>(r13, r1, r0, r2)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            goto L_0x0856
        L_0x07e0:
            r2 = move-exception
            java.lang.String r1 = "L11"
            java.lang.String r0 = "l11.message"
            X.9LW r3 = new X.9LW     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r3.<init>(r13, r1, r0, r2)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            goto L_0x0856
        L_0x07eb:
            r2 = move-exception
            java.lang.String r1 = "L10"
            java.lang.String r0 = "l10.message"
            X.9LW r3 = new X.9LW     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r3.<init>(r13, r1, r0, r2)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            goto L_0x0856
        L_0x07f6:
            X.9Hf r0 = X.AnonymousClass9Hf.UNKNOWN_ERROR     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
            X.9LU r1 = new X.9LU     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
            r1.<init>(r0)     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
            goto L_0x080f
        L_0x07fe:
            X.9Hf r1 = X.AnonymousClass9Hf.KEYS_NOT_VALID     // Catch:{ 9LU -> 0x0806, Exception -> 0x0808 }
            X.9LU r0 = new X.9LU     // Catch:{ 9LU -> 0x0806, Exception -> 0x0808 }
            r0.<init>(r1)     // Catch:{ 9LU -> 0x0806, Exception -> 0x0808 }
            throw r0     // Catch:{ 9LU -> 0x0806, Exception -> 0x0808 }
        L_0x0806:
            r1 = move-exception
            goto L_0x080f
        L_0x0808:
            X.9Hf r0 = X.AnonymousClass9Hf.UNKNOWN_ERROR     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
            X.9LU r1 = new X.9LU     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
            r1.<init>(r0)     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
        L_0x080f:
            throw r1     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
        L_0x0810:
            java.lang.String r2 = "L08"
            java.lang.String r1 = "l08.message"
            X.9LW r0 = new X.9LW     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
            r0.<init>(r13, r2, r1)     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
            throw r0     // Catch:{ 9LU -> 0x0825, 9LW -> 0x0844, Exception -> 0x081a, 9LW | Exception -> 0x0857 }
        L_0x081a:
            r2 = move-exception
            X.9LW r3 = new X.9LW     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r1 = r20
            r0 = r21
            r3.<init>(r13, r1, r0, r2)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            goto L_0x0856
        L_0x0825:
            r2 = move-exception
            r2.getMessage()     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            java.lang.String r1 = "L05"
            java.lang.String r0 = "l05.message"
            X.9LW r3 = new X.9LW     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r3.<init>(r13, r1, r0, r2)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            goto L_0x0856
        L_0x0833:
            java.lang.String r2 = "L06"
            java.lang.String r1 = "l06.message"
            X.9LW r0 = new X.9LW     // Catch:{ 9LW -> 0x0844, Exception -> 0x083d, 9LW | Exception -> 0x0857 }
            r0.<init>(r13, r2, r1)     // Catch:{ 9LW -> 0x0844, Exception -> 0x083d, 9LW | Exception -> 0x0857 }
            throw r0     // Catch:{ 9LW -> 0x0844, Exception -> 0x083d, 9LW | Exception -> 0x0857 }
        L_0x083d:
            r0 = move-exception
            X.9LW r3 = new X.9LW     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r3.<init>(r13, r5, r6, r0)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            goto L_0x0856
        L_0x0844:
            r0 = move-exception
            throw r0     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
        L_0x0846:
            r0 = move-exception
            X.9LW r3 = new X.9LW     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r3.<init>(r13, r5, r6, r0)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            goto L_0x0856
        L_0x084d:
            java.lang.String r1 = "L15"
            java.lang.String r0 = "l15.message"
            X.9LW r3 = new X.9LW     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
            r3.<init>(r13, r1, r0)     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
        L_0x0856:
            throw r3     // Catch:{ 9LW | Exception -> 0x0857, 9LU -> 0x0e95 }
        L_0x0857:
            java.lang.String r3 = "verifiedMerchant"
            java.lang.String r1 = "bankImage"
            java.lang.String r2 = "bankImageUrl"
            X.9Nq r0 = r13.A0D     // Catch:{ Exception -> 0x08e8 }
            org.json.JSONObject r0 = r0.A0C     // Catch:{ Exception -> 0x08e8 }
            boolean r0 = r0.has(r2)     // Catch:{ Exception -> 0x08e8 }
            r4 = 1
            if (r0 == 0) goto L_0x0878
            X.9Nq r0 = r13.A0D     // Catch:{ Exception -> 0x08e8 }
            org.json.JSONObject r0 = r0.A0C     // Catch:{ Exception -> 0x08e8 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ Exception -> 0x08e8 }
            r13.A0B = r0     // Catch:{ Exception -> 0x08e8 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x08e8 }
            r13.A08 = r0     // Catch:{ Exception -> 0x08e8 }
        L_0x0878:
            X.9Nq r0 = r13.A0D     // Catch:{ Exception -> 0x08e8 }
            org.json.JSONObject r0 = r0.A0C     // Catch:{ Exception -> 0x08e8 }
            boolean r0 = r0.has(r1)     // Catch:{ Exception -> 0x08e8 }
            if (r0 == 0) goto L_0x0896
            X.9Nq r0 = r13.A0D     // Catch:{ Exception -> 0x08e8 }
            org.json.JSONObject r0 = r0.A0C     // Catch:{ Exception -> 0x08e8 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x08e8 }
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r0, r2)     // Catch:{ Exception -> 0x08e8 }
            int r0 = r1.length     // Catch:{ Exception -> 0x08e8 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r0)     // Catch:{ Exception -> 0x08e8 }
            r13.A02 = r0     // Catch:{ Exception -> 0x08e8 }
        L_0x0896:
            X.9Nq r0 = r13.A0D     // Catch:{ Exception -> 0x08e8 }
            org.json.JSONObject r0 = r0.A0C     // Catch:{ Exception -> 0x08e8 }
            boolean r0 = r0.has(r3)     // Catch:{ Exception -> 0x08e8 }
            if (r0 == 0) goto L_0x08ae
            X.9Nq r0 = r13.A0D     // Catch:{ Exception -> 0x08e8 }
            org.json.JSONObject r0 = r0.A0C     // Catch:{ Exception -> 0x08e8 }
            boolean r0 = r0.getBoolean(r3)     // Catch:{ Exception -> 0x08e8 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x08e8 }
            r13.A09 = r0     // Catch:{ Exception -> 0x08e8 }
        L_0x08ae:
            X.9Nq r0 = r13.A0D     // Catch:{ Exception -> 0x08e8 }
            java.lang.String r1 = r0.A04     // Catch:{ Exception -> 0x08e8 }
            java.lang.String r0 = "_"
            java.lang.String[] r2 = r1.split(r0)     // Catch:{ Exception -> 0x08e8 }
            java.util.Locale r3 = new java.util.Locale     // Catch:{ Exception -> 0x08e8 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x08e8 }
            int r1 = r2.length     // Catch:{ Exception -> 0x08e8 }
            r0 = 2
            if (r1 != r0) goto L_0x08cb
            r0 = 0
            r1 = r2[r0]     // Catch:{ Exception -> 0x08e8 }
            r0 = r2[r4]     // Catch:{ Exception -> 0x08e8 }
            java.util.Locale r3 = new java.util.Locale     // Catch:{ Exception -> 0x08e8 }
            r3.<init>(r1, r0)     // Catch:{ Exception -> 0x08e8 }
        L_0x08cb:
            java.util.Locale.setDefault(r3)     // Catch:{ Exception -> 0x08e8 }
            android.content.res.Configuration r2 = new android.content.res.Configuration     // Catch:{ Exception -> 0x08e8 }
            r2.<init>()     // Catch:{ Exception -> 0x08e8 }
            r2.locale = r3     // Catch:{ Exception -> 0x08e8 }
            android.content.Context r0 = r13.getBaseContext()     // Catch:{ Exception -> 0x08e8 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ Exception -> 0x08e8 }
            android.content.Context r0 = r13.getBaseContext()     // Catch:{ Exception -> 0x08e8 }
            android.util.DisplayMetrics r0 = X.C108965cb.A08(r0)     // Catch:{ Exception -> 0x08e8 }
            r1.updateConfiguration(r2, r0)     // Catch:{ Exception -> 0x08e8 }
        L_0x08e8:
            X.9Nq r0 = r13.A0D
            org.json.JSONArray r0 = r0.A08
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "SIGNATURE"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0953
            android.content.Context r5 = r13.A0K     // Catch:{ Exception -> 0x0925 }
            X.9Nq r0 = r13.A0D     // Catch:{ Exception -> 0x0925 }
            org.json.JSONObject r4 = r0.A0E     // Catch:{ Exception -> 0x0925 }
            org.json.JSONArray r3 = r0.A08     // Catch:{ Exception -> 0x0925 }
            org.json.JSONObject r0 = r0.A0C     // Catch:{ Exception -> 0x0925 }
            X.A7M r1 = new X.A7M     // Catch:{ Exception -> 0x0925 }
            r1.<init>(r5, r3, r4, r0)     // Catch:{ Exception -> 0x0925 }
            r13.A0E = r1     // Catch:{ Exception -> 0x0925 }
            X.9Nq r0 = r13.A0D     // Catch:{ Exception -> 0x0925 }
            java.lang.Boolean r0 = r0.A02     // Catch:{ Exception -> 0x0925 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0925 }
            if (r0 == 0) goto L_0x091e
            java.lang.Integer r0 = X.C182339Tz.A01     // Catch:{ Exception -> 0x0925 }
            boolean r0 = r1.A07(r0)     // Catch:{ Exception -> 0x0925 }
        L_0x0919:
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0925 }
            goto L_0x0933
        L_0x091e:
            java.lang.Integer r0 = X.C182339Tz.A00     // Catch:{ Exception -> 0x0925 }
            boolean r0 = r1.A07(r0)     // Catch:{ Exception -> 0x0925 }
            goto L_0x0919
        L_0x0925:
            r1 = move-exception
            boolean r0 = r1 instanceof java.lang.IllegalStateException
            if (r0 == 0) goto L_0x093a
            android.content.Context r1 = r13.A0K
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            java.lang.String r0 = "SYNC_REQUIRED"
        L_0x0930:
            r1.A2x(r0)
        L_0x0933:
            boolean r0 = r17.booleanValue()
            if (r0 != 0) goto L_0x0953
            return
        L_0x093a:
            boolean r0 = r1 instanceof java.lang.IllegalArgumentException
            if (r0 == 0) goto L_0x0945
            android.content.Context r1 = r13.A0K
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            java.lang.String r0 = "INVALID_REQUEST"
            goto L_0x0930
        L_0x0945:
            boolean r0 = r1 instanceof java.security.cert.CertificateException
            android.content.Context r1 = r13.A0K
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            if (r0 == 0) goto L_0x0950
            java.lang.String r0 = "LITE_KEYS_ROTATION_NEEDED"
            goto L_0x0930
        L_0x0950:
            java.lang.String r0 = "TECHNICAL_ERROR"
            goto L_0x0930
        L_0x0953:
            X.9Nq r1 = r13.A0D
            boolean r0 = r1.A0L
            if (r0 == 0) goto L_0x0a77
            java.lang.String r5 = "."
            org.json.JSONArray r0 = r1.A08     // Catch:{ Exception -> 0x0a6d }
            r4 = 0
            org.json.JSONObject r1 = r0.getJSONObject(r4)     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r0 = "subtype"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ Exception -> 0x0a6d }
            X.9Nq r0 = r13.A0D     // Catch:{ Exception -> 0x0a6d }
            org.json.JSONObject r8 = r0.A0C     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r0 = "IDENTITY"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0a6d }
            if (r0 == 0) goto L_0x0a61
            r7 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0a6d }
            if (r8 == 0) goto L_0x0987
            java.lang.String r1 = "enableUserAuth"
            java.lang.String r0 = "true"
            java.lang.String r0 = r8.optString(r1, r0)     // Catch:{ Exception -> 0x0a6d }
            java.lang.Boolean r2 = X.AnonymousClass8BU.A0g(r0)     // Catch:{ Exception -> 0x0a6d }
        L_0x0987:
            boolean r0 = r2.booleanValue()     // Catch:{ Exception -> 0x0a6d }
            if (r0 == 0) goto L_0x09a5
            android.content.Context r1 = r13.A0K     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r0 = "keyguard"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x0a6d }
            android.app.KeyguardManager r1 = (android.app.KeyguardManager) r1     // Catch:{ Exception -> 0x0a6d }
            boolean r0 = r1.isKeyguardSecure()     // Catch:{ Exception -> 0x0a6d }
            if (r0 != 0) goto L_0x09a2
            java.lang.Class<org.npci.upi.security.pinactivitycomponent.UserAuthInfoActivity> r0 = org.npci.upi.security.pinactivitycomponent.UserAuthInfoActivity.class
            X.AnonymousClass8BT.A16(r13, r0)     // Catch:{ Exception -> 0x0a6d }
        L_0x09a2:
            r1.isKeyguardSecure()     // Catch:{ Exception -> 0x0a6d }
        L_0x09a5:
            android.content.Context r3 = r13.A0K     // Catch:{ Exception -> 0x0a6d }
            X.9Nq r0 = r13.A0D     // Catch:{ Exception -> 0x0a6d }
            org.json.JSONObject r1 = r0.A0E     // Catch:{ Exception -> 0x0a6d }
            org.json.JSONArray r0 = r0.A08     // Catch:{ Exception -> 0x0a6d }
            X.A7M r6 = new X.A7M     // Catch:{ Exception -> 0x0a6d }
            r6.<init>(r3, r0, r1, r8)     // Catch:{ Exception -> 0x0a6d }
            r13.A0E = r6     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r3 = "ClientRiskRules"
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0a6d }
            org.json.JSONObject r1 = r6.A0A     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r0 = "deviceId"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x0a6d }
            r8.append(r0)     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r0 = "mobileNumber"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x0a6d }
            r8.append(r0)     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r0 = "accountRef"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r8)     // Catch:{ Exception -> 0x0a6d }
            byte[] r0 = X.A8J.A04(r0)     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r1 = X.C108955ca.A14(r0)     // Catch:{ Exception -> 0x0a6d }
            r6.A08 = r1     // Catch:{ Exception -> 0x0a6d }
            android.content.Context r0 = r6.A03     // Catch:{ Exception -> 0x0a6d }
            X.9s9 r0 = X.C194699s9.A00(r0, r1)     // Catch:{ Exception -> 0x0a6d }
            r6.A0D = r0     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r0 = r0.A01(r3)     // Catch:{ JSONException -> 0x09f5 }
            org.json.JSONObject r0 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x09f5 }
            r6.A0B = r0     // Catch:{ JSONException -> 0x09f5 }
            goto L_0x09fd
        L_0x09f5:
            java.lang.String r0 = "{\"ATC\":\"0\",\"OTC\":\"0\",\"COTA\":\"0\"}"
            org.json.JSONObject r0 = X.C17880vN.A16(r0)     // Catch:{ Exception -> 0x0a6d }
            r6.A0B = r0     // Catch:{ Exception -> 0x0a6d }
        L_0x09fd:
            X.9s9 r0 = r6.A0D     // Catch:{ Exception -> 0x0a6d }
            r0.A02()     // Catch:{ Exception -> 0x0a6d }
            X.9s9 r1 = r6.A0D     // Catch:{ Exception -> 0x0a6d }
            org.json.JSONObject r0 = r6.A0B     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0a6d }
            r1.A03(r0, r3)     // Catch:{ Exception -> 0x0a6d }
            X.A7M r0 = r13.A0E     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r0 = r0.A08     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r6 = X.A8J.A00(r2, r0)     // Catch:{ Exception -> 0x0a6d }
            X.A7M r8 = r13.A0E     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r2 = "AES"
            javax.crypto.KeyGenerator r1 = javax.crypto.KeyGenerator.getInstance(r2)     // Catch:{ Exception -> 0x0a6d }
            r0 = 256(0x100, float:3.59E-43)
            r1.init(r0)     // Catch:{ Exception -> 0x0a6d }
            javax.crypto.SecretKey r0 = r1.generateKey()     // Catch:{ Exception -> 0x0a6d }
            byte[] r0 = r0.getEncoded()     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r3 = X.C108955ca.A14(r0)     // Catch:{ Exception -> 0x0a6d }
            X.9s9 r0 = r8.A0D     // Catch:{ Exception -> 0x0a6d }
            r0.A03(r3, r2)     // Catch:{ Exception -> 0x0a6d }
            X.A7M r2 = r13.A0E     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r0)     // Catch:{ Exception -> 0x0a6d }
            r0 = 0
            r1.load(r0)     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r0 = r2.A08     // Catch:{ Exception -> 0x0a6d }
            java.security.cert.Certificate[] r0 = r1.getCertificateChain(r0)     // Catch:{ Exception -> 0x0a6d }
            r0 = r0[r4]     // Catch:{ Exception -> 0x0a6d }
            byte[] r0 = r0.getEncoded()     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r2 = X.C108955ca.A14(r0)     // Catch:{ Exception -> 0x0a6d }
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ Exception -> 0x0a6d }
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r3, r5, r6)     // Catch:{ Exception -> 0x0a6d }
            java.lang.String r0 = X.AnonymousClass001.A1H(r5, r2, r0)     // Catch:{ Exception -> 0x0a6d }
            r1[r4] = r0     // Catch:{ Exception -> 0x0a6d }
            X.A7M r0 = r13.A0E     // Catch:{ Exception -> 0x0a6d }
            r0.A06(r1)     // Catch:{ Exception -> 0x0a6d }
            return
        L_0x0a61:
            boolean r0 = r1.equals(r2)     // Catch:{ Exception -> 0x0a6d }
            if (r0 == 0) goto L_0x0a76
            X.A7M r0 = r13.A0E     // Catch:{ Exception -> 0x0a6d }
            r0.A04()     // Catch:{ Exception -> 0x0a6d }
            return
        L_0x0a6d:
            android.content.Context r1 = r13.A0K
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            java.lang.String r0 = "TECHNICAL_ERROR"
            r1.A2x(r0)
        L_0x0a76:
            return
        L_0x0a77:
            r0 = 2131624095(0x7f0e009f, float:1.887536E38)
            r13.setContentView((int) r0)
            java.lang.Boolean r0 = r13.A08
            boolean r0 = r0.booleanValue()
            r11 = 0
            if (r0 == 0) goto L_0x0a9b
            java.lang.String r2 = r13.A0B
            X.8CS r1 = new X.8CS
            r1.<init>()
            r0 = 0
            r1.A01 = r0
            r1.A00 = r13
            r1.A02 = r2
            r13.A0J = r1
            java.lang.String[] r0 = new java.lang.String[r11]
            r1.execute(r0)
        L_0x0a9b:
            r0 = 2131428049(0x7f0b02d1, float:1.8477732E38)
            android.widget.ImageView r1 = X.AnonymousClass3MX.A0I(r13, r0)
            r13.A0H = r1
            android.graphics.Bitmap r0 = r13.A02
            if (r0 == 0) goto L_0x0aab
            r1.setImageBitmap(r0)
        L_0x0aab:
            java.lang.String r10 = "mobileNumber"
            java.lang.String r9 = "mandate"
            X.9Nq r0 = r13.A0D
            org.json.JSONObject r1 = r0.A0C
            if (r1 == 0) goto L_0x0ddf
            r0 = r16
            java.lang.String r18 = r1.optString(r0)
        L_0x0abb:
            X.9Nq r0 = r13.A0D
            org.json.JSONObject r2 = r0.A0E
            org.json.JSONArray r14 = r0.A09
            if (r2 != 0) goto L_0x0bec
            java.lang.String r2 = "l12"
            java.lang.String r1 = "l12.message"
            X.9LW r0 = new X.9LW
            r0.<init>(r13, r2, r1)
        L_0x0acc:
            r0 = 2131436355(0x7f0b2343, float:1.8494578E38)
            android.view.ViewGroup r3 = X.AnonymousClass3MX.A0F(r13, r0)
            X.9Nq r0 = r13.A0D
            org.json.JSONArray r0 = r0.A09
            r16 = r0
            r8 = 0
        L_0x0ada:
            int r0 = r16.length()
            if (r8 >= r0) goto L_0x0de3
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r13)
            r0 = 2131625808(0x7f0e0750, float:1.8878834E38)
            android.view.View r7 = r1.inflate(r0, r3, r11)
            r0 = 2131436353(0x7f0b2341, float:1.8494574E38)
            android.widget.TextView r6 = X.C17880vN.A0E(r7, r0)
            r0 = 2131436354(0x7f0b2342, float:1.8494576E38)
            android.widget.TextView r5 = X.C17880vN.A0E(r7, r0)
            r0 = 2131436702(0x7f0b249e, float:1.8495282E38)
            android.widget.TextView r15 = X.C17880vN.A0E(r7, r0)
            r0 = 2131436706(0x7f0b24a2, float:1.849529E38)
            android.view.View r1 = r7.findViewById(r0)
            r0 = r16
            org.json.JSONObject r14 = r0.optJSONObject(r8)
            java.lang.String r4 = "name"
            java.lang.String r2 = r14.optString(r4, r12)
            java.lang.String r0 = "payeeName"
            boolean r0 = r2.equals(r0)
            java.lang.String r2 = "value"
            if (r0 == 0) goto L_0x0b50
            java.lang.String r0 = r13.A0A
            if (r0 == 0) goto L_0x0b4d
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0b4d
            java.lang.String r0 = "Mandate against"
        L_0x0b29:
            java.lang.String r0 = r0.toUpperCase()
            r6.setText(r0)
            java.lang.String r0 = r14.optString(r2)
            r5.setText(r0)
            java.lang.String r0 = "VERIFIED MERCHANT"
            r15.setText(r0)
            java.lang.Boolean r0 = r13.A09
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0b47
            r1.setVisibility(r11)
        L_0x0b47:
            r3.addView(r7)
            int r8 = r8 + 1
            goto L_0x0ada
        L_0x0b4d:
            java.lang.String r0 = "paying to"
            goto L_0x0b29
        L_0x0b50:
            java.lang.String r1 = r14.optString(r4, r12)
            java.lang.String r0 = "txnAmount"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0bc4
            java.lang.String r1 = r14.optString(r4, r12)
            java.lang.String r0 = "Amount"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0bc4
            java.lang.String r1 = r14.optString(r4, r12)
            java.lang.String r0 = "note"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0b85
            java.lang.String r0 = "Details"
        L_0x0b76:
            java.lang.String r0 = r0.toUpperCase()
            r6.setText(r0)
            java.lang.String r0 = r14.optString(r2)
        L_0x0b81:
            r5.setText(r0)
            goto L_0x0b47
        L_0x0b85:
            java.lang.String r0 = r14.optString(r4, r12)
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0b92
            java.lang.String r0 = "Mobile"
            goto L_0x0b76
        L_0x0b92:
            java.lang.String r1 = r14.optString(r4, r12)
            java.lang.String r0 = "refUrl"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0ba1
            java.lang.String r0 = "ref url"
            goto L_0x0b76
        L_0x0ba1:
            java.lang.String r1 = r14.optString(r4, r12)
            java.lang.String r0 = "refId"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0bb0
            java.lang.String r0 = "Ref id"
            goto L_0x0b76
        L_0x0bb0:
            java.lang.String r1 = r14.optString(r4, r12)
            java.lang.String r0 = "mandateSubType"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0bbf
            java.lang.String r0 = "Mandate Type"
            goto L_0x0b76
        L_0x0bbf:
            java.lang.String r0 = r14.optString(r4)
            goto L_0x0b76
        L_0x0bc4:
            java.lang.String r0 = r13.A0A
            if (r0 == 0) goto L_0x0be9
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0be9
            java.lang.String r0 = "Maximum Mandate Amount"
        L_0x0bd0:
            java.lang.String r0 = r0.toUpperCase()
            r6.setText(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "₹ "
            r1.append(r0)
            java.lang.String r0 = r14.optString(r2)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            goto L_0x0b81
        L_0x0be9:
            java.lang.String r0 = "AMOUNT"
            goto L_0x0bd0
        L_0x0bec:
            java.lang.String r0 = "txnAmount"
            java.lang.String r8 = r2.optString(r0)
            X.9Nq r1 = r13.A0D     // Catch:{ JSONException -> 0x0c22 }
            java.lang.String r0 = "credType"
            org.json.JSONArray r0 = r2.getJSONArray(r0)     // Catch:{ JSONException -> 0x0c22 }
            r1.A0A = r0     // Catch:{ JSONException -> 0x0c22 }
            r1 = 0
        L_0x0bfd:
            X.9Nq r0 = r13.A0D     // Catch:{ JSONException -> 0x0c22 }
            org.json.JSONArray r0 = r0.A0A     // Catch:{ JSONException -> 0x0c22 }
            int r0 = r0.length()     // Catch:{ JSONException -> 0x0c22 }
            if (r1 >= r0) goto L_0x0c26
            X.9Nq r0 = r13.A0D     // Catch:{ JSONException -> 0x0c22 }
            org.json.JSONArray r0 = r0.A0A     // Catch:{ JSONException -> 0x0c22 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x0c22 }
            boolean r0 = r0.equals(r9)     // Catch:{ JSONException -> 0x0c22 }
            if (r0 == 0) goto L_0x0c1f
            X.9Nq r0 = r13.A0D     // Catch:{ JSONException -> 0x0c22 }
            org.json.JSONArray r0 = r0.A0A     // Catch:{ JSONException -> 0x0c22 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x0c22 }
            r13.A0A = r0     // Catch:{ JSONException -> 0x0c22 }
        L_0x0c1f:
            int r1 = r1 + 1
            goto L_0x0bfd
        L_0x0c22:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0c26:
            r15 = r12
            r3 = 0
        L_0x0c28:
            int r0 = r14.length()
            java.lang.String r2 = "account"
            java.lang.String r7 = "value"
            java.lang.String r6 = "name"
            if (r3 >= r0) goto L_0x0c7d
            java.lang.String r0 = X.AnonymousClass8BV.A0t(r6, r14, r3)     // Catch:{ Exception -> 0x0c7a }
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0c7a }
            if (r0 == 0) goto L_0x0c65
            org.json.JSONObject r0 = X.AnonymousClass8BR.A1B(r14, r3)     // Catch:{ Exception -> 0x0c7a }
            java.lang.String r15 = r0.optString(r7, r12)     // Catch:{ Exception -> 0x0c7a }
            int r0 = r15.length()     // Catch:{ Exception -> 0x0c7a }
            int r1 = r0 + -4
            int r0 = r15.length()     // Catch:{ Exception -> 0x0c7a }
            java.lang.String r15 = r15.substring(r1, r0)     // Catch:{ Exception -> 0x0c7a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0c7a }
            java.lang.String r0 = "XXXX"
            r1.append(r0)     // Catch:{ Exception -> 0x0c7a }
            r1.append(r15)     // Catch:{ Exception -> 0x0c7a }
            java.lang.String r15 = r1.toString()     // Catch:{ Exception -> 0x0c7a }
            goto L_0x0c7d
        L_0x0c65:
            java.lang.String r1 = X.AnonymousClass8BV.A0t(r6, r14, r3)     // Catch:{ Exception -> 0x0c7a }
            java.lang.String r0 = "payeeVpa"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0c7a }
            if (r0 == 0) goto L_0x0c7a
            org.json.JSONObject r0 = X.AnonymousClass8BR.A1B(r14, r3)     // Catch:{ Exception -> 0x0c7a }
            java.lang.String r15 = r0.optString(r7, r12)     // Catch:{ Exception -> 0x0c7a }
            goto L_0x0c7d
        L_0x0c7a:
            int r3 = r3 + 1
            goto L_0x0c28
        L_0x0c7d:
            r1 = 0
        L_0x0c7e:
            int r0 = r14.length()
            if (r1 >= r0) goto L_0x0cba
            java.lang.String r3 = X.AnonymousClass8BV.A0t(r6, r14, r1)     // Catch:{ Exception -> 0x0cb7 }
            java.lang.String r0 = "payeeName"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0cb7 }
            if (r0 == 0) goto L_0x0c99
            org.json.JSONObject r0 = X.AnonymousClass8BR.A1B(r14, r1)     // Catch:{ Exception -> 0x0cb7 }
        L_0x0c94:
            java.lang.String r5 = r0.optString(r7, r12)     // Catch:{ Exception -> 0x0cb7 }
            goto L_0x0cbb
        L_0x0c99:
            java.lang.String r0 = X.AnonymousClass8BV.A0t(r6, r14, r1)     // Catch:{ Exception -> 0x0cb7 }
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0cb7 }
            if (r0 == 0) goto L_0x0ca8
            org.json.JSONObject r0 = X.AnonymousClass8BR.A1B(r14, r1)     // Catch:{ Exception -> 0x0cb7 }
            goto L_0x0c94
        L_0x0ca8:
            java.lang.String r0 = X.AnonymousClass8BV.A0t(r6, r14, r1)     // Catch:{ Exception -> 0x0cb7 }
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0cb7 }
            if (r0 == 0) goto L_0x0cb7
            java.lang.String r5 = X.AnonymousClass8BV.A0t(r10, r14, r1)     // Catch:{ Exception -> 0x0cb7 }
            goto L_0x0cbb
        L_0x0cb7:
            int r1 = r1 + 1
            goto L_0x0c7e
        L_0x0cba:
            r5 = r12
        L_0x0cbb:
            r0 = 2131436344(0x7f0b2338, float:1.8494556E38)
            android.view.View r20 = r13.findViewById(r0)
            r0 = 2131436456(0x7f0b23a8, float:1.8494783E38)
            android.widget.TextView r17 = X.AnonymousClass3MX.A0L(r13, r0)
            r0 = 2131436457(0x7f0b23a9, float:1.8494785E38)
            android.widget.TextView r16 = X.AnonymousClass3MX.A0L(r13, r0)
            r0 = 2131436371(0x7f0b2353, float:1.849461E38)
            android.widget.TextView r4 = X.AnonymousClass3MX.A0L(r13, r0)
            r0 = 2131436372(0x7f0b2354, float:1.8494613E38)
            android.widget.TextView r3 = X.AnonymousClass3MX.A0L(r13, r0)
            r0 = 2131436341(0x7f0b2335, float:1.849455E38)
            android.widget.TextView r2 = X.AnonymousClass3MX.A0L(r13, r0)
            r0 = 2131436342(0x7f0b2336, float:1.8494552E38)
            android.widget.TextView r1 = X.AnonymousClass3MX.A0L(r13, r0)
            r0 = 2131436343(0x7f0b2337, float:1.8494554E38)
            android.widget.ImageView r0 = X.AnonymousClass3MX.A0I(r13, r0)
            r13.A06 = r0
            r0 = r16
            r0.setText(r15)
            r0 = r18
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0d09
            r15 = r17
            r0 = r18
            r15.setText(r0)
        L_0x0d09:
            boolean r0 = r8.equals(r12)
            r15 = 1
            if (r0 != 0) goto L_0x0da7
            java.lang.String r0 = "null"
            boolean r0 = r8.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0da7
            double r18 = java.lang.Double.parseDouble(r8)
            r16 = 0
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0da7
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r0 = "₹ "
            java.lang.String r6 = X.AnonymousClass001.A1H(r0, r8, r6)
            java.lang.String r0 = r13.A0A
            if (r0 == 0) goto L_0x0d9f
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0d9f
            java.lang.String r0 = "Maximum Mandate Amount: "
            r2.setText(r0)
            java.lang.String r0 = "Mandate Against: "
        L_0x0d3d:
            r4.setText(r0)
            r1.setText(r6)
            r3.setText(r5)
        L_0x0d46:
            android.view.WindowManager r0 = r13.getWindowManager()
            android.view.Display r1 = r0.getDefaultDisplay()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r1.getSize(r0)
            int r0 = r0.y
            r13.A00 = r0
            r1 = 28
            r0 = r20
            X.AnonymousClass3MZ.A1M(r0, r13, r1)
            r0 = 2131436356(0x7f0b2344, float:1.849458E38)
            android.view.View r0 = r13.findViewById(r0)
            r13.A04 = r0
            r0 = 2131436352(0x7f0b2340, float:1.8494572E38)
            android.view.View r0 = r13.findViewById(r0)
            r13.A05 = r0
            android.view.View r2 = r13.A04
            r1 = 2
            X.AFa r0 = new X.AFa
            r0.<init>(r13, r1)
            r2.setOnTouchListener(r0)
            android.view.View r2 = r13.A05
            if (r2 == 0) goto L_0x0d8b
            r1 = 3
            X.AFa r0 = new X.AFa
            r0.<init>(r13, r1)
            r2.setOnTouchListener(r0)
        L_0x0d8b:
            r0 = 2131436361(0x7f0b2349, float:1.849459E38)
            android.view.View r0 = r13.findViewById(r0)
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r13.A03 = r0
            r0.setCrossFadeEnabled(r15)
            goto L_0x0acc
        L_0x0d9f:
            java.lang.String r0 = "Sending: "
            r2.setText(r0)
            java.lang.String r0 = "To: "
            goto L_0x0d3d
        L_0x0da7:
            r2.setText(r12)
            r4.setText(r12)
            r1.setText(r12)
            r3.setText(r12)
            r3 = 0
        L_0x0db4:
            int r0 = r14.length()
            if (r3 >= r0) goto L_0x0dd2
            java.lang.String r1 = X.AnonymousClass8BV.A0t(r6, r14, r3)     // Catch:{ Exception -> 0x0dcf }
            java.lang.String r0 = "note"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0dcf }
            if (r0 == 0) goto L_0x0dcf
            org.json.JSONObject r0 = X.AnonymousClass8BR.A1B(r14, r3)     // Catch:{ Exception -> 0x0dcf }
            java.lang.String r5 = r0.optString(r7, r12)     // Catch:{ Exception -> 0x0dcf }
            goto L_0x0dd2
        L_0x0dcf:
            int r3 = r3 + 1
            goto L_0x0db4
        L_0x0dd2:
            r2.setText(r5)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r0)
            r2.setSingleLine(r15)
            goto L_0x0d46
        L_0x0ddf:
            r18 = r12
            goto L_0x0abb
        L_0x0de3:
            android.view.View r4 = new android.view.View
            r4.<init>(r13)
            r1 = 1077936128(0x40400000, float:3.0)
            android.util.DisplayMetrics r0 = X.C108965cb.A08(r13)
            int r0 = r0.densityDpi
            int r0 = r0 / 160
            float r0 = (float) r0
            float r1 = r1 * r0
            int r2 = (int) r1
            r1 = -1
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r1, r2)
            r4.setLayoutParams(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4.setBackgroundColor(r0)
            r0 = 1051260355(0x3ea8f5c3, float:0.33)
            r4.setAlpha(r0)
            r3.addView(r4)
            r0 = 2131430996(0x7f0b0e54, float:1.8483709E38)
            android.view.View r5 = r13.findViewById(r0)
            org.npci.upi.security.pinactivitycomponent.Keypad r5 = (org.npci.upi.security.pinactivitycomponent.Keypad) r5
            if (r5 == 0) goto L_0x0e1e
            X.AmC r0 = new X.AmC
            r0.<init>(r13)
            r5.A04 = r0
        L_0x0e1e:
            r0 = 2131436267(0x7f0b22eb, float:1.84944E38)
            android.view.View r1 = r13.findViewById(r0)
            r0 = 10
            r1.setPadding(r11, r0, r11, r11)
            r0 = 2131432247(0x7f0b1337, float:1.8486246E38)
            android.view.View r4 = r13.findViewById(r0)
            r0 = 2131436361(0x7f0b2349, float:1.849459E38)
            android.view.View r3 = r13.findViewById(r0)
            android.util.DisplayMetrics r2 = X.C108965cb.A08(r13)
            int r1 = r2.densityDpi
            r0 = 320(0x140, float:4.48E-43)
            if (r1 > r0) goto L_0x0e77
            int r1 = r2.heightPixels
            r0 = 1184(0x4a0, float:1.659E-42)
            if (r1 > r0) goto L_0x0e77
            r0 = 800(0x320, float:1.121E-42)
            if (r1 > r0) goto L_0x0e57
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            r0 = 280(0x118, float:3.92E-43)
            r1.height = r0
            r5.setLayoutParams(r1)
        L_0x0e57:
            r1 = 0
        L_0x0e58:
            X.9Nq r0 = r13.A0D
            java.lang.Boolean r0 = r0.A02
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0e73
            r0 = 8
            r3.setVisibility(r0)
        L_0x0e67:
            org.npci.upi.security.pinactivitycomponent.w r2 = new org.npci.upi.security.pinactivitycomponent.w
            r2.<init>()
            r13.A07 = r2
            android.os.Bundle r1 = X.AnonymousClass3MY.A09(r13)
            goto L_0x0e7a
        L_0x0e73:
            r4.setPadding(r11, r1, r11, r11)
            goto L_0x0e67
        L_0x0e77:
            r1 = 50
            goto L_0x0e58
        L_0x0e7a:
            X.1GP r0 = r13.getSupportFragmentManager()     // Catch:{ Exception -> 0x0ebd }
            if (r1 == 0) goto L_0x0e83
            r2.A1R(r1)     // Catch:{ Exception -> 0x0ebd }
        L_0x0e83:
            X.1jj r1 = new X.1jj     // Catch:{ Exception -> 0x0ebd }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0ebd }
            r0 = 2131432247(0x7f0b1337, float:1.8486246E38)
            r1.A09(r2, r0)     // Catch:{ Exception -> 0x0ebd }
            r0 = 1
            r1.A00(r0)     // Catch:{ Exception -> 0x0ebd }
            r13.A0F = r2     // Catch:{ Exception -> 0x0ebd }
            goto L_0x0ebd
        L_0x0e95:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0ecb }
            int r0 = r4.a     // Catch:{ Exception -> 0x0ecb }
            r1.append(r0)     // Catch:{ Exception -> 0x0ecb }
            java.lang.String r3 = X.AnonymousClass000.A0y(r12, r1)     // Catch:{ Exception -> 0x0ecb }
            java.lang.String r1 = r4.b     // Catch:{ Exception -> 0x0ecb }
            android.os.Bundle r2 = X.C17880vN.A0D()     // Catch:{ Exception -> 0x0ecb }
            java.lang.String r0 = "errorCode"
            r2.putString(r0, r3)     // Catch:{ Exception -> 0x0ecb }
            java.lang.String r0 = "error"
            r2.putString(r0, r1)     // Catch:{ Exception -> 0x0ecb }
            android.os.ResultReceiver r1 = X.C188559hc.A0B     // Catch:{ Exception -> 0x0ecb }
            r0 = 0
            r1.send(r0, r2)     // Catch:{ Exception -> 0x0ecb }
            r13.finish()     // Catch:{ Exception -> 0x0ecb }
            throw r4     // Catch:{ Exception -> 0x0ecb }
        L_0x0ebd:
            r0 = 2131431154(0x7f0b0ef2, float:1.848403E38)
            android.view.View r1 = r13.findViewById(r0)
            if (r1 == 0) goto L_0x0ecb
            r0 = 27
            X.AnonymousClass3MZ.A1M(r1, r13, r0)
        L_0x0ecb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.GetCredential.onCreate(android.os.Bundle):void");
    }

    public void A2x(String str) {
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putString("error", str);
        C188559hc.A0B.send(0, A0D2);
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 0) {
            try {
                A7M a7m = this.A0E;
                a7m.A05(a7m.A05);
            } catch (Exception unused) {
                ((GetCredential) this.A0K).A2x("TECHNICAL_ERROR");
            }
        } else if (i == 1) {
            this.A0E.A04();
        }
    }

    public void onPause() {
        super.onPause();
        try {
            C161118Bu r0 = this.A0C;
            if (r0 != null) {
                unregisterReceiver(r0);
                this.A0C = null;
            }
        } catch (Throwable unused) {
        }
    }

    public void onResume() {
        super.onResume();
        if (checkCallingOrSelfPermission("android.permission.RECEIVE_SMS") == 0) {
            this.A0C = new C161118Bu(this);
            IntentFilter intentFilter = new IntentFilter();
            try {
                intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
                intentFilter.setPriority(999);
                registerReceiver(this.A0C, intentFilter);
            } catch (Throwable unused) {
            }
        }
    }
}
