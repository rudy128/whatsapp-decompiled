package com.airbnb.lottie;

import X.AnonymousClass00R;
import X.AnonymousClass2RZ;
import X.AnonymousClass3DA;
import X.AnonymousClass3KF;
import X.AnonymousClass9U1;
import X.BHK;
import X.BN4;
import X.BN6;
import X.C122996Ss;
import X.C19740yt;
import X.C21466AkX;
import X.C21491Al0;
import X.C21492Al1;
import X.C21495Al4;
import X.C24983CSi;
import X.C25577CiH;
import X.C25723Ckt;
import X.C26046CrD;
import X.C38591rZ;
import X.C38601ra;
import X.C38611rb;
import X.C38621rc;
import X.C38631rd;
import X.C38651rf;
import X.C38661rg;
import X.C38681ri;
import X.C39771tc;
import X.C39781td;
import X.C39801tf;
import X.C39811tg;
import X.C40221uM;
import X.C49342Qc;
import X.C49412Qj;
import X.C71983Kc;
import X.E3l;
import X.EBL;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.ZipInputStream;

public class LottieAnimationView extends AppCompatImageView {
    public static final C38591rZ A0E = new C38601ra();
    public int A00 = 0;
    public C39801tf A01;
    public C38591rZ A02;
    public boolean A03 = true;
    public int A04;
    public C39811tg A05;
    public String A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public final C38631rd A09 = new C38631rd();
    public final Set A0A = new HashSet();
    public final Set A0B = new HashSet();
    public final C38591rZ A0C = new C38611rb(this);
    public final C38591rZ A0D = new C38621rc(this);

    public LottieAnimationView(Context context) {
        super(context, (AttributeSet) null);
        A01((AttributeSet) null, 2130970375);
    }

    public void A03() {
        this.A07 = false;
        this.A09.A06();
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, (String) null);
    }

    private void A00() {
        C39811tg r1 = this.A05;
        if (r1 != null) {
            r1.A03(this.A0C);
            C39811tg r2 = this.A05;
            C38591rZ r12 = this.A0D;
            synchronized (r2) {
                r2.A01.remove(r12);
            }
        }
    }

    private void setCompositionTask(C39811tg r3) {
        this.A0B.add(C49412Qj.SET_ANIMATION);
        this.A01 = null;
        this.A09.A05();
        A00();
        r3.A02(this.A0C);
        r3.A01(this.A0D);
        this.A05 = r3;
    }

    public void A02() {
        this.A0B.add(C49412Qj.PLAY_OPTION);
        C38631rd r1 = this.A09;
        r1.A0e.clear();
        r1.A0d.cancel();
        if (!r1.isVisible()) {
            r1.A0M = AnonymousClass00R.A00;
        }
    }

    public void A04() {
        this.A0B.add(C49412Qj.PLAY_OPTION);
        this.A09.A07();
    }

    public void A05(C26046CrD crD, E3l e3l, Object obj) {
        this.A09.A0G(crD, new BN6(this, e3l, 0), obj);
    }

    public boolean A06() {
        C38651rf r0 = this.A09.A0d;
        if (r0 == null) {
            return false;
        }
        return r0.A07;
    }

    public C49342Qc getAsyncUpdates() {
        C49342Qc r0 = this.A09.A0D;
        if (r0 == null) {
            return AnonymousClass9U1.A00;
        }
        return r0;
    }

    public boolean getAsyncUpdatesEnabled() {
        C49342Qc r0 = this.A09.A0D;
        if (r0 == null) {
            r0 = AnonymousClass9U1.A00;
        }
        if (r0 == C49342Qc.ENABLED) {
            return true;
        }
        return false;
    }

    public boolean getClipToCompositionBounds() {
        return this.A09.A0R;
    }

    public long getDuration() {
        C39801tf r0 = this.A01;
        if (r0 != null) {
            return (long) r0.A00();
        }
        return 0;
    }

    public int getFrame() {
        return (int) this.A09.A0d.A00;
    }

    public String getImageAssetsFolder() {
        return this.A09.A0P;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.A09.A0W;
    }

    public float getMaxFrame() {
        return this.A09.A0d.A01();
    }

    public float getMinFrame() {
        return this.A09.A0d.A02();
    }

    public C40221uM getPerformanceTracker() {
        C39801tf r0 = this.A09.A0G;
        if (r0 != null) {
            return r0.A0D;
        }
        return null;
    }

    public float getProgress() {
        return this.A09.A0d.A00();
    }

    public C38661rg getRenderMode() {
        if (this.A09.A0b) {
            return C38661rg.SOFTWARE;
        }
        return C38661rg.HARDWARE;
    }

    public int getRepeatCount() {
        return this.A09.A0d.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.A09.A0d.getRepeatMode();
    }

    public float getSpeed() {
        return this.A09.A0d.A04;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof BHK)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        BHK bhk = (BHK) parcelable;
        super.onRestoreInstanceState(bhk.getSuperState());
        this.A06 = bhk.A04;
        Set set = this.A0B;
        C49412Qj r1 = C49412Qj.SET_ANIMATION;
        if (!set.contains(r1) && !TextUtils.isEmpty(this.A06)) {
            setAnimation(this.A06);
        }
        this.A04 = bhk.A01;
        if (!set.contains(r1) && (i = this.A04) != 0) {
            setAnimation(i);
        }
        if (!set.contains(C49412Qj.SET_PROGRESS)) {
            this.A09.A0B(bhk.A00);
        }
        if (!set.contains(C49412Qj.PLAY_OPTION) && bhk.A06) {
            A04();
        }
        if (!set.contains(C49412Qj.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(bhk.A05);
        }
        if (!set.contains(C49412Qj.SET_REPEAT_MODE)) {
            setRepeatMode(bhk.A03);
        }
        if (!set.contains(C49412Qj.SET_REPEAT_COUNT)) {
            setRepeatCount(bhk.A02);
        }
    }

    public void setAnimation(String str) {
        Callable al4;
        boolean z;
        C39811tg A072;
        this.A06 = str;
        this.A04 = 0;
        if (isInEditMode()) {
            Executor executor = C39811tg.A04;
            al4 = new C21491Al0(1, str, this);
            z = true;
        } else {
            boolean z2 = this.A03;
            Context context = getContext();
            if (z2) {
                StringBuilder sb = new StringBuilder();
                sb.append("asset_");
                sb.append(str);
                String obj = sb.toString();
                A072 = C39771tc.A07((Runnable) null, obj, new C21495Al4(context.getApplicationContext(), str, obj, 0));
                setCompositionTask(A072);
            }
            al4 = new C21495Al4(context.getApplicationContext(), str, (String) null, 0);
            z = false;
        }
        A072 = new C39811tg(al4, z);
        setCompositionTask(A072);
    }

    public void setAnimationFromUrl(String str) {
        C39811tg r2;
        boolean z = this.A03;
        Context context = getContext();
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("url_");
            sb.append(str);
            String obj = sb.toString();
            r2 = C39771tc.A07((Runnable) null, obj, new C21495Al4(context, str, obj, 1));
        } else {
            r2 = new C39811tg(new C21495Al4(context, str, (String) null, 1), false);
        }
        setCompositionTask(r2);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.A09.A0U = z;
    }

    public void setAsyncUpdates(C49342Qc r2) {
        this.A09.A0D = r2;
    }

    public void setClipToCompositionBounds(boolean z) {
        C38631rd r1 = this.A09;
        if (z != r1.A0R) {
            r1.A0R = z;
            BN4 bn4 = r1.A0L;
            if (bn4 != null) {
                bn4.A01 = z;
            }
            r1.invalidateSelf();
        }
    }

    public void setComposition(C39801tf r4) {
        boolean z;
        C38631rd r2 = this.A09;
        r2.setCallback(this);
        this.A01 = r4;
        this.A08 = true;
        boolean A0K = r2.A0K(r4);
        this.A08 = false;
        if (getDrawable() == r2) {
            if (!A0K) {
                return;
            }
        } else if (!A0K) {
            C38651rf r0 = r2.A0d;
            if (r0 == null) {
                z = false;
            } else {
                z = r0.A07;
            }
            setImageDrawable((Drawable) null);
            setImageDrawable(r2);
            if (z) {
                r2.A08();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        for (C71983Kc BpV : this.A0A) {
            BpV.BpV();
        }
    }

    public void setDefaultFontFileExtension(String str) {
        C38631rd r3 = this.A09;
        r3.A0O = str;
        if (r3.getCallback() != null) {
            C24983CSi cSi = r3.A0J;
            if (cSi == null) {
                cSi = new C24983CSi(r3.getCallback(), r3.A0E);
                r3.A0J = cSi;
                String str2 = r3.A0O;
                if (str2 != null) {
                    cSi.A01 = str2;
                }
            }
            cSi.A01 = str;
        }
    }

    public void setFontAssetDelegate(C122996Ss r2) {
        C38631rd r0 = this.A09;
        r0.A0E = r2;
        C24983CSi cSi = r0.A0J;
        if (cSi != null) {
            cSi.A00 = r2;
        }
    }

    public void setFontMap(Map map) {
        C38631rd r1 = this.A09;
        if (map != r1.A0Q) {
            r1.A0Q = map;
            r1.invalidateSelf();
        }
    }

    public void setFrame(int i) {
        this.A09.A0C(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.A09.A0T = z;
    }

    public void setImageAssetDelegate(AnonymousClass3KF r2) {
        C38631rd r0 = this.A09;
        r0.A0F = r2;
        C25577CiH ciH = r0.A0K;
        if (ciH != null) {
            ciH.A00 = r2;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.A09.A0P = str;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.A09.A0W = z;
    }

    public void setMaxFrame(int i) {
        this.A09.A0D(i);
    }

    public void setMaxProgress(float f) {
        this.A09.A09(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.A09.A0I(str);
    }

    public void setMinFrame(int i) {
        this.A09.A0E(i);
    }

    public void setMinProgress(float f) {
        this.A09.A0A(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        C38631rd r1 = this.A09;
        if (r1.A0X != z) {
            r1.A0X = z;
            BN4 bn4 = r1.A0L;
            if (bn4 != null) {
                bn4.A0E(z);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        C38631rd r0 = this.A09;
        r0.A0Y = z;
        C39801tf r02 = r0.A0G;
        if (r02 != null) {
            r02.A0D.A00 = z;
        }
    }

    public void setProgress(float f) {
        this.A0B.add(C49412Qj.SET_PROGRESS);
        this.A09.A0B(f);
    }

    public void setRenderMode(C38661rg r2) {
        C38631rd r0 = this.A09;
        r0.A0H = r2;
        C38631rd.A04(r0);
    }

    public void setRepeatCount(int i) {
        this.A0B.add(C49412Qj.SET_REPEAT_COUNT);
        this.A09.A0d.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.A0B.add(C49412Qj.SET_REPEAT_MODE);
        this.A09.A0d.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.A09.A0Z = z;
    }

    public void setSpeed(float f) {
        this.A09.A0d.A04 = f;
    }

    public void setTextDelegate(AnonymousClass2RZ r2) {
        this.A09.A0I = r2;
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.A09.A0d.A08 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        r1 = (X.C38631rd) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unscheduleDrawable(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x0013
            X.1rd r0 = r2.A09
            if (r3 != r0) goto L_0x0017
            X.1rf r0 = r0.A0d
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0017
            r2.A03()
        L_0x0013:
            super.unscheduleDrawable(r3)
            return
        L_0x0017:
            boolean r0 = r3 instanceof X.C38631rd
            if (r0 == 0) goto L_0x0013
            r1 = r3
            X.1rd r1 = (X.C38631rd) r1
            X.1rf r0 = r1.A0d
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0013
            r1.A06()
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.unscheduleDrawable(android.graphics.drawable.Drawable):void");
    }

    private void A01(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C38681ri.A00, i, 0);
        this.A03 = obtainStyledAttributes.getBoolean(2, true);
        boolean hasValue = obtainStyledAttributes.hasValue(13);
        boolean hasValue2 = obtainStyledAttributes.hasValue(8);
        boolean hasValue3 = obtainStyledAttributes.hasValue(18);
        if (hasValue) {
            if (!hasValue2) {
                int resourceId = obtainStyledAttributes.getResourceId(13, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(8);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(18)) != null) {
            setAnimationFromUrl(string);
        }
        this.A00 = obtainStyledAttributes.getResourceId(7, 0);
        if (obtainStyledAttributes.getBoolean(1, false)) {
            this.A07 = true;
        }
        if (obtainStyledAttributes.getBoolean(11, false)) {
            this.A09.A0d.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(16)) {
            setRepeatMode(obtainStyledAttributes.getInt(16, 1));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setRepeatCount(obtainStyledAttributes.getInt(15, -1));
        }
        if (obtainStyledAttributes.hasValue(17)) {
            setSpeed(obtainStyledAttributes.getFloat(17, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(3)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(3, true));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(5));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(10));
        boolean hasValue4 = obtainStyledAttributes.hasValue(12);
        float f = obtainStyledAttributes.getFloat(12, 0.0f);
        if (hasValue4) {
            this.A0B.add(C49412Qj.SET_PROGRESS);
        }
        C38631rd r4 = this.A09;
        r4.A0B(f);
        boolean z2 = obtainStyledAttributes.getBoolean(6, false);
        if (r4.A0S != z2) {
            r4.A0S = z2;
            if (r4.A0G != null) {
                C38631rd.A03(r4);
            }
        }
        if (obtainStyledAttributes.hasValue(4)) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(C19740yt.A03(getContext(), obtainStyledAttributes.getResourceId(4, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP);
            r4.A0G(new C26046CrD("**"), new C25723Ckt(porterDuffColorFilter), EBL.A01);
        }
        if (obtainStyledAttributes.hasValue(14)) {
            int i2 = obtainStyledAttributes.getInt(14, 0);
            if (i2 >= C38661rg.values().length) {
                i2 = 0;
            }
            setRenderMode(C38661rg.values()[i2]);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            if (i3 >= C38661rg.values().length) {
                i3 = 0;
            }
            setAsyncUpdates(C49342Qc.values()[i3]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(9, false));
        if (obtainStyledAttributes.hasValue(19)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(19, false));
        }
        obtainStyledAttributes.recycle();
        if (Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
            z = true;
        }
        r4.A0a = Boolean.valueOf(z).booleanValue();
    }

    public C39801tf getComposition() {
        return this.A01;
    }

    public void invalidate() {
        C38661rg r1;
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof C38631rd) {
            if (((C38631rd) drawable).A0b) {
                r1 = C38661rg.SOFTWARE;
            } else {
                r1 = C38661rg.HARDWARE;
            }
            if (r1 == C38661rg.SOFTWARE) {
                this.A09.invalidateSelf();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C38631rd r0 = this.A09;
        if (drawable2 == r0) {
            super.invalidateDrawable(r0);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.A07) {
            this.A09.A07();
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.view.View$BaseSavedState, X.BHK, android.os.Parcelable] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003f, code lost:
        if (r1 == X.AnonymousClass00R.A0C) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r6 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            X.BHK r5 = new X.BHK
            r5.<init>(r0)
            java.lang.String r0 = r6.A06
            r5.A04 = r0
            int r0 = r6.A04
            r5.A01 = r0
            X.1rd r4 = r6.A09
            X.1rf r3 = r4.A0d
            float r0 = r3.A00()
            r5.A00 = r0
            boolean r0 = r4.isVisible()
            if (r0 == 0) goto L_0x0036
            boolean r2 = r3.A07
        L_0x0023:
            r5.A06 = r2
            java.lang.String r0 = r4.A0P
            r5.A05 = r0
            int r0 = r3.getRepeatMode()
            r5.A03 = r0
            int r0 = r3.getRepeatCount()
            r5.A02 = r0
            return r5
        L_0x0036:
            java.lang.Integer r1 = r4.A0M
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x0041
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r2 = 0
            if (r1 != r0) goto L_0x0023
        L_0x0041:
            r2 = 1
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.onSaveInstanceState():android.os.Parcelable");
    }

    public void setCacheComposition(boolean z) {
        this.A03 = z;
    }

    public void setFailureListener(C38591rZ r1) {
        this.A02 = r1;
    }

    public void setFallbackResource(int i) {
        this.A00 = i;
    }

    public void setImageBitmap(Bitmap bitmap) {
        A00();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        A00();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        A00();
        super.setImageResource(i);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(attributeSet, i);
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(C39771tc.A07(new C21466AkX((Object) inputStream, 28), str, new AnonymousClass3DA(inputStream, str)));
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation((InputStream) new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(C39771tc.A07((Runnable) null, str2, new C21495Al4(getContext(), str, str2, 1)));
    }

    public void setMaxFrame(String str) {
        this.A09.A0H(str);
    }

    public void setMinFrame(String str) {
        this.A09.A0J(str);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(attributeSet, 2130970375);
    }

    public void setAnimation(ZipInputStream zipInputStream, String str) {
        setCompositionTask(C39771tc.A07(new C21466AkX((Object) zipInputStream, 27), str, new C21491Al0(2, str, zipInputStream)));
    }

    public void setAnimation(int i) {
        Callable r2;
        boolean z;
        C39811tg A062;
        this.A04 = i;
        this.A06 = null;
        if (isInEditMode()) {
            Executor executor = C39811tg.A04;
            r2 = new C21492Al1(this, i, 1);
            z = true;
        } else {
            boolean z2 = this.A03;
            Context context = getContext();
            if (z2) {
                A062 = C39771tc.A06(context, i);
                setCompositionTask(A062);
            }
            r2 = new C39781td(context.getApplicationContext(), (String) null, new WeakReference(context), i);
            z = false;
        }
        A062 = new C39811tg(r2, z);
        setCompositionTask(A062);
    }
}
