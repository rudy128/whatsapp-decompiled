package com.whatsapp.storage;

import X.AnonymousClass009;
import X.AnonymousClass00R;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aX;
import X.AnonymousClass65B;
import X.AnonymousClass7H2;
import X.AnonymousClass7HY;
import X.AnonymousClass7RI;
import X.AnonymousClass891;
import X.C108355bZ;
import X.C108965cb;
import X.C110465fg;
import X.C136166tN;
import X.C1420778b;
import X.C144417Hf;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C19740yt;
import X.C24771Lp;
import X.C27691Xc;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.WaTextView;
import java.util.List;

public class StorageUsageMediaPreviewView extends LinearLayout implements AnonymousClass009 {
    public static final Bitmap A0E = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public int A00;
    public C108355bZ A01;
    public C24771Lp A02;
    public AnonymousClass11C A03;
    public AnonymousClass031 A04;
    public String A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final Drawable A0A;
    public final int A0B;
    public final int A0C;
    public final C136166tN A0D;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public void setPreviewMediaItems(List list, int i, String str) {
        this.A06 = list;
        this.A00 = i;
        this.A05 = str;
        removeAllViews();
        if (list.size() == 0) {
            return;
        }
        if (getMeasuredWidth() == 0) {
            addOnLayoutChangeListener(new C1420778b(this, str, list, i));
        } else {
            setPreviewMediaItemsInternal(list, i, str);
        }
    }

    public StorageUsageMediaPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A07) {
            this.A07 = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r2.A10;
            this.A02 = C108965cb.A0K(r1);
            this.A03 = AnonymousClass3Ma.A0a(r1);
            this.A01 = AnonymousClass3MZ.A0V(r2.A0z);
        }
        setOrientation(0);
        this.A0C = getResources().getDimensionPixelSize(2131168946);
        this.A0B = getResources().getDimensionPixelSize(2131168945);
        int A002 = C19740yt.A00(getContext(), 2131103204);
        this.A09 = A002;
        this.A0A = new ColorDrawable(A002);
        this.A0D = new C136166tN(C17890vO.A0D(), this.A02, this.A03, "image-loader-storage-usage-media-preview");
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [X.65B, X.5h5, android.view.View, X.657] */
    /* access modifiers changed from: private */
    public void setPreviewMediaItemsInternal(List list, int i, String str) {
        ViewGroup.LayoutParams layoutParams;
        AnonymousClass65B r2;
        int measuredWidth = getMeasuredWidth();
        int i2 = this.A0B;
        int i3 = (measuredWidth + (i2 / 2)) / i2;
        int measuredWidth2 = getMeasuredWidth();
        int i4 = this.A0C;
        int i5 = (measuredWidth2 - ((i3 - 1) * i4)) / i3;
        int min = Math.min(list.size(), i3);
        Drawable BS0 = this.A01.BS0(AnonymousClass00R.A01, 2, false);
        int A022 = AnonymousClass3MZ.A02(getContext(), getContext(), 2130970830, 2131102245);
        C17960vV.A07(BS0);
        Drawable A082 = AnonymousClass4aX.A08(BS0, A022);
        for (int i6 = 0; i6 < min; i6++) {
            AnonymousClass7H2 r3 = (AnonymousClass7H2) list.get(i6);
            if (i6 != min - 1 || i <= min) {
                ? r22 = new AnonymousClass65B(getContext());
                r22.A06();
                r22.A00 = 1;
                r22.A00 = 3;
                if (!this.A08) {
                    r22.setSelectable(true);
                }
                r22.setFrameDrawable(A082);
                addView(r22);
                layoutParams = r22.getLayoutParams();
                r2 = r22;
            } else {
                AnonymousClass65B r23 = new AnonymousClass65B(getContext());
                C110465fg r13 = new C110465fg(getContext());
                int i7 = i - min;
                AnonymousClass65B r0 = r13.A00;
                if (r0 != null) {
                    r13.removeView(r0);
                }
                r13.addView(r23, 0);
                r13.A00 = r23;
                WaTextView waTextView = r13.A03;
                Context context = r13.getContext();
                Object[] A1a = AnonymousClass3MW.A1a();
                C17880vN.A1T(A1a, i7, 0);
                AnonymousClass3MY.A0y(context, waTextView, A1a, 2131896563);
                r13.setFrameDrawable(A082);
                addView(r13);
                layoutParams = r13.getLayoutParams();
                r2 = r23;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i6 != 0) {
                marginLayoutParams.leftMargin = i4;
            }
            marginLayoutParams.width = i5;
            marginLayoutParams.height = i5;
            r2.setMediaItem(r3);
            AnonymousClass3MW.A1R(r2);
            r2.setSelector((Drawable) null);
            C136166tN r9 = this.A0D;
            r9.A01((AnonymousClass891) r2.getTag());
            AnonymousClass7HY r1 = new AnonymousClass7HY(r3, this, str, i5);
            r2.setTag(r1);
            r9.A02(r1, new C144417Hf(r3, r2, r1, this));
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A06 != null && this.A05 != null) {
            post(AnonymousClass7RI.A00(this, 43));
        }
    }

    public void setUnsupportedMediaSelectionDisabled(boolean z) {
        this.A08 = z;
    }

    public StorageUsageMediaPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StorageUsageMediaPreviewView(Context context) {
        this(context, (AttributeSet) null);
    }
}
