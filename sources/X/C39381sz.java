package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.1sz  reason: invalid class name and case insensitive filesystem */
public abstract class C39381sz extends CharacterStyle implements C39371sy, UpdateAppearance {
    public Typeface A00;
    public boolean A01;
    public long A02;
    public final Context A03;
    public final int A04;
    public final int A05;
    public final int A06;

    public boolean A01() {
        if (this instanceof C39391t0) {
            return ((C39391t0) this).A01;
        }
        if (this instanceof C45692Bb) {
            return false;
        }
        return true;
    }

    public void updateDrawState(TextPaint textPaint) {
        if (this.A01) {
            textPaint.setColor(this.A06);
            textPaint.bgColor = this.A04;
            textPaint.setUnderlineText(true);
        } else {
            int i = this.A05;
            if (i == 0) {
                i = textPaint.linkColor;
            }
            textPaint.setColor(i);
            textPaint.setUnderlineText(false);
            textPaint.bgColor = 0;
        }
        if (A01() && C22891Dp.A04) {
            Typeface typeface = this.A00;
            if (typeface == null) {
                typeface = C43421zm.A00();
                this.A00 = typeface;
            }
            textPaint.setTypeface(typeface);
        }
    }

    public C39381sz(Context context) {
        this(context, AnonymousClass1YL.A00(context, 2130971981, 2131101293));
    }

    public void C8s(MotionEvent motionEvent, View view) {
        boolean z = true;
        if (motionEvent.getAction() == 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.A02 > 1000) {
                this.A02 = elapsedRealtime;
                if (this.A01) {
                    onClick(view);
                }
            }
        }
        if (motionEvent.getAction() != 0) {
            z = false;
        }
        this.A01 = z;
        view.invalidate();
    }

    public C39381sz(Context context, int i) {
        this.A03 = context;
        this.A05 = C19740yt.A00(context, i);
        int A002 = C19740yt.A00(context, i);
        this.A06 = A002;
        this.A04 = AnonymousClass1Z2.A06(A002, 72);
    }

    public C39381sz(Context context, int i, int i2, int i3) {
        this.A03 = context;
        this.A05 = i;
        this.A06 = i2;
        this.A04 = i3;
    }
}
