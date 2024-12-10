package androidx.preference;

import X.AFY;
import X.AG8;
import X.AnonymousClass8Gw;
import X.AnonymousClass8J3;
import X.AnonymousClass9UH;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarPreference extends Preference {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View.OnKeyListener A04 = new AFY(this);
    public SeekBar.OnSeekBarChangeListener A05 = new AG8(this);
    public SeekBar A06;
    public TextView A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public static void A00(SeekBarPreference seekBarPreference, int i, boolean z) {
        int i2 = seekBarPreference.A01;
        if (i < i2) {
            i = i2;
        }
        int i3 = seekBarPreference.A00;
        if (i > i3) {
            i = i3;
        }
        if (i != seekBarPreference.A03) {
            seekBarPreference.A03 = i;
            TextView textView = seekBarPreference.A07;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (seekBarPreference.A0Q()) {
                int i4 = i ^ -1;
                if (seekBarPreference.A0Q()) {
                    i4 = seekBarPreference.A0E.A01().getInt(seekBarPreference.A0J, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor A002 = seekBarPreference.A0E.A00();
                    A002.putInt(seekBarPreference.A0J, i);
                    if (!seekBarPreference.A0E.A08) {
                        A002.apply();
                    }
                }
            }
            if (z) {
                seekBarPreference.A05();
            }
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130971120, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass9UH.A0A, 2130971120, 0);
        this.A01 = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.A01;
        i = i < i2 ? i2 : i;
        if (i != this.A00) {
            this.A00 = i;
            A05();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.A02) {
            this.A02 = Math.min(this.A00 - this.A01, Math.abs(i3));
            A05();
        }
        this.A08 = obtainStyledAttributes.getBoolean(2, true);
        this.A09 = obtainStyledAttributes.getBoolean(5, false);
        this.A0B = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public void A0C(Parcelable parcelable) {
        if (!parcelable.getClass().equals(AnonymousClass8Gw.class)) {
            super.A0C(parcelable);
            return;
        }
        AnonymousClass8Gw r3 = (AnonymousClass8Gw) parcelable;
        super.A0C(r3.getSuperState());
        this.A03 = r3.A02;
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        A05();
    }

    public void A0G(AnonymousClass8J3 r4) {
        super.A0G(r4);
        r4.A0H.setOnKeyListener(this.A04);
        this.A06 = (SeekBar) r4.A0B(2131435077);
        TextView textView = (TextView) r4.A0B(2131435078);
        this.A07 = textView;
        if (this.A09) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.A07 = null;
        }
        SeekBar seekBar = this.A06;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.A05);
        this.A06.setMax(this.A00 - this.A01);
        int i = this.A02;
        SeekBar seekBar2 = this.A06;
        if (i != 0) {
            seekBar2.setKeyProgressIncrement(i);
        } else {
            this.A02 = seekBar2.getKeyProgressIncrement();
        }
        this.A06.setProgress(this.A03 - this.A01);
        int i2 = this.A03;
        TextView textView2 = this.A07;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.A06.setEnabled(A0O());
    }
}
