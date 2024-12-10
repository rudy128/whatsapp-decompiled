package X;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.ui.media.MediaCard;
import com.whatsapp.ui.media.MediaCardGrid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.48V  reason: invalid class name */
public abstract class AnonymousClass48V extends C74833cy {
    public int A00;
    public HorizontalScrollView A01;
    public ImageView A02;
    public C18000vb A03;
    public View A04;
    public ImageView A05;
    public LinearLayout A06;
    public RelativeLayout A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public C107695aR A0C;
    public C28931bI A0D;
    public TextView A0E;

    public static void A00(C107695aR r1) {
        C18070vi.A0d(r1, 0);
        r1.Bp1();
    }

    public C77523qH A02(ViewGroup.LayoutParams layoutParams, C85774Or r4, int i) {
        C18070vi.A0d(r4, 0);
        C77523qH r1 = new C77523qH(getContext());
        AnonymousClass3MW.A1R(r1);
        r1.setLayoutParams(layoutParams);
        r1.A00 = (float) (i / 6);
        r1.A03 = getThumbnailTextGravity();
        r1.A01 = getThumbnailIconGravity();
        String str = r4.A04;
        if (str != null) {
            r1.A05 = str;
        }
        String str2 = r4.A03;
        if (str2 != null) {
            r1.setContentDescription(str2);
        }
        Drawable drawable = r4.A00;
        if (drawable != null) {
            r1.A04 = drawable;
        }
        AnonymousClass3Ma.A1E(r1, r4, 20);
        AnonymousClass1Xr.A04(r1, r4.A05);
        r4.A02.BuS(r1, i);
        return r1;
    }

    public final void A08(List list, int i) {
        C18070vi.A0d(list, 0);
        if (list.isEmpty()) {
            A03();
            return;
        }
        A04();
        int thumbnailPixelSize = getThumbnailPixelSize();
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131167706);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(thumbnailPixelSize, thumbnailPixelSize);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        if (this.A02 == null) {
            ImageView A0U = C72453Mb.A0U(this);
            this.A02 = A0U;
            A0U.setLayoutParams(layoutParams);
            AnonymousClass3MY.A0w(A0U.getContext(), A0U, 2131899186);
            A0U.setScaleType(ImageView.ScaleType.CENTER);
            A0U.setBackgroundResource(2131232942);
            A0U.setImageDrawable(AnonymousClass4aX.A08(AnonymousClass3NL.A00(getContext(), getWhatsAppLocale(), 2131231560), C19740yt.A00(getContext(), 2131101841)));
            C107695aR r1 = this.A0C;
            if (r1 != null) {
                AnonymousClass3Ma.A1E(A0U, r1, 21);
            }
        }
        if (this instanceof MediaCardGrid) {
            MediaCardGrid mediaCardGrid = (MediaCardGrid) this;
            ArrayList arrayList = mediaCardGrid.A02;
            arrayList.clear();
            int size = list.size();
            if (size > i) {
                size = i;
            }
            for (int i2 = 0; i2 < size; i2++) {
                C77523qH A022 = mediaCardGrid.A02(new AbsListView.LayoutParams(thumbnailPixelSize, thumbnailPixelSize), (C85774Or) list.get(i2), thumbnailPixelSize);
                A022.A01 = mediaCardGrid.getResources().getDimension(2131165780);
                arrayList.add(A022);
            }
            if (mediaCardGrid.A01 == null) {
                C72953Ok r12 = new C72953Ok(arrayList);
                mediaCardGrid.A01 = r12;
                GridView gridView = mediaCardGrid.A00;
                if (gridView != null) {
                    gridView.setAdapter(r12);
                }
            }
            C72953Ok r0 = mediaCardGrid.A01;
            if (r0 != null) {
                r0.notifyDataSetChanged();
                return;
            }
            return;
        }
        MediaCard mediaCard = (MediaCard) this;
        LinearLayout linearLayout = mediaCard.A00;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linearLayout.addView(mediaCard.A02(layoutParams, (C85774Or) it.next(), thumbnailPixelSize));
            }
            HorizontalScrollView horizontalScrollView = mediaCard.A01;
            if (horizontalScrollView != null) {
                C27641Ww.A0A(horizontalScrollView, mediaCard.getWhatsAppLocale());
            }
            if (list.size() >= i) {
                linearLayout.addView(mediaCard.A02);
            }
            HorizontalScrollView horizontalScrollView2 = mediaCard.A01;
            if (horizontalScrollView2 != null) {
                horizontalScrollView2.setVisibility(0);
            }
        }
    }

    public int getThumbnailIconGravity() {
        return 3;
    }

    public abstract int getThumbnailPixelSize();

    public int getThumbnailTextGravity() {
        return 5;
    }

    public final void setSeeMoreClickListener(C107695aR r3) {
        C18070vi.A0d(r3, 0);
        this.A0C = r3;
        ImageView imageView = this.A02;
        if (imageView != null) {
            AnonymousClass3Ma.A1E(imageView, r3, 15);
        }
        TextView textView = this.A0B;
        if (textView != null) {
            AnonymousClass3Ma.A1E(textView, r3, 16);
        }
        TextView textView2 = this.A0A;
        if (textView2 != null) {
            AnonymousClass3Ma.A1E(textView2, r3, 17);
        }
        TextView textView3 = this.A09;
        if (textView3 != null) {
            AnonymousClass3Ma.A1E(textView3, r3, 18);
        }
        TextView textView4 = this.A08;
        if (textView4 != null) {
            AnonymousClass3Ma.A1E(textView4, r3, 19);
        }
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public void A03() {
        C72453Mb.A1C(this.A06);
        int A0D2 = C72453Mb.A0D(this.A04);
        RelativeLayout relativeLayout = this.A07;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(A0D2);
        }
        TextView textView = this.A0E;
        if (textView != null) {
            textView.setVisibility(A0D2);
        }
    }

    public void A04() {
        int A0D2 = C72453Mb.A0D(this.A06);
        View view = this.A04;
        if (view != null) {
            view.setVisibility(0);
        }
        RelativeLayout relativeLayout = this.A07;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        TextView textView = this.A0E;
        if (textView != null) {
            textView.setVisibility(A0D2);
        }
    }

    public void A05(int i, int i2) {
        View view = this.A04;
        if (view != null) {
            if (i < 0) {
                i = view.getPaddingLeft();
            }
            if (i2 < 0) {
                i2 = view.getPaddingRight();
            }
            C72463Mc.A15(view, i, i2);
            TextView textView = this.A0E;
            if (textView != null) {
                C72463Mc.A15(textView, i, i2);
            }
        }
    }

    public void A07(View.OnClickListener onClickListener, int i) {
        if (this instanceof MediaCardGrid) {
            MediaCardGrid mediaCardGrid = (MediaCardGrid) this;
            ArrayList arrayList = mediaCardGrid.A02;
            arrayList.clear();
            for (int i2 = 0; i2 < i; i2++) {
                int thumbnailPixelSize = mediaCardGrid.getThumbnailPixelSize();
                AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(thumbnailPixelSize, thumbnailPixelSize);
                ThumbnailButton thumbnailButton = new ThumbnailButton(mediaCardGrid.getContext());
                thumbnailButton.setBackgroundResource(mediaCardGrid.A00);
                thumbnailButton.setLayoutParams(layoutParams);
                thumbnailButton.A01 = mediaCardGrid.getResources().getDimension(2131165780);
                AnonymousClass3MX.A1D(mediaCardGrid.getResources(), thumbnailButton, 2131886139);
                arrayList.add(thumbnailButton);
            }
            C72953Ok r1 = new C72953Ok(arrayList);
            mediaCardGrid.A01 = r1;
            GridView gridView = mediaCardGrid.A00;
            if (gridView != null) {
                gridView.setAdapter(r1);
                return;
            }
            return;
        }
        MediaCard mediaCard = (MediaCard) this;
        int thumbnailPixelSize2 = mediaCard.getThumbnailPixelSize();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(thumbnailPixelSize2, thumbnailPixelSize2);
        int dimensionPixelSize = mediaCard.getResources().getDimensionPixelSize(2131167706);
        layoutParams2.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        for (int i3 = 0; i3 < i; i3++) {
            LinearLayout linearLayout = mediaCard.A00;
            if (linearLayout != null) {
                ThumbnailButton thumbnailButton2 = new ThumbnailButton(mediaCard.getContext());
                thumbnailButton2.setBackgroundResource(mediaCard.A00);
                thumbnailButton2.setLayoutParams(layoutParams2);
                if (onClickListener != null) {
                    thumbnailButton2.setOnClickListener(onClickListener);
                }
                linearLayout.addView(thumbnailButton2);
            }
        }
        HorizontalScrollView horizontalScrollView = mediaCard.A01;
        if (horizontalScrollView != null) {
            horizontalScrollView.setVisibility(0);
        }
    }

    public String getError() {
        TextView textView = this.A0E;
        CharSequence charSequence = null;
        if (textView == null || textView.getVisibility() != 0) {
            return null;
        }
        TextView textView2 = this.A0E;
        if (textView2 != null) {
            charSequence = textView2.getText();
        }
        return String.valueOf(charSequence);
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setCatalogBrandingDrawable(Drawable drawable) {
        ImageView imageView = this.A05;
        if (imageView != null) {
            int i = 8;
            if (drawable != null) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
        ImageView imageView2 = this.A05;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setError(String str) {
        TextView textView = this.A0E;
        if (textView != null) {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    public final void setMediaInfo(String str) {
        TextView textView = this.A0A;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.A08;
        if (textView2 != null) {
            textView2.setText(str);
        }
        if (str != null && str.length() != 0) {
            TextView textView3 = this.A0A;
            if (textView3 != null) {
                C27641Ww.A0B(textView3, getWhatsAppLocale(), 2131233242);
            }
            TextView textView4 = this.A08;
            if (textView4 != null) {
                C27641Ww.A0B(textView4, getWhatsAppLocale(), 2131233242);
            }
        }
    }

    public final void setMediaTitleTextAppearance(int i) {
        TextView textView = this.A0B;
        if (textView != null) {
            C29261bv.A08(textView, i);
        }
    }

    public final void setSeeMoreColor(int i) {
        TextView textView = this.A0A;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public final void setTitle(String str) {
        TextView textView = this.A0B;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.A09;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    public final void setTitleTextColor(int i) {
        TextView textView = this.A0B;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* JADX INFO: finally extract failed */
    public void A06(AttributeSet attributeSet) {
        AnonymousClass3MZ.A0D(this).inflate(2131625950, this, true);
        this.A0B = AnonymousClass3MW.A0J(this, 2131432379);
        this.A09 = AnonymousClass3MW.A0J(this, 2131432370);
        this.A0A = AnonymousClass3MW.A0J(this, 2131432374);
        this.A08 = AnonymousClass3MW.A0J(this, 2131432369);
        this.A04 = AnonymousClass1HF.A06(this, 2131436225);
        this.A01 = (HorizontalScrollView) AnonymousClass1HF.A06(this, 2131432375);
        this.A0E = AnonymousClass3MW.A0J(this, 2131432371);
        this.A07 = (RelativeLayout) AnonymousClass1HF.A06(this, 2131432377);
        this.A06 = AnonymousClass3MX.A0K(this, 2131432368);
        this.A05 = AnonymousClass3MW.A0G(this, 2131428410);
        this.A0D = C28931bI.A00(this, 2131432367);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = AnonymousClass3Ma.A06(this).obtainStyledAttributes(attributeSet, AnonymousClass4IQ.A00, 0, 0);
            C18070vi.A0X(obtainStyledAttributes);
            try {
                String A0E2 = getWhatsAppLocale().A0E(obtainStyledAttributes, 1);
                String A0E3 = getWhatsAppLocale().A0E(obtainStyledAttributes, 0);
                obtainStyledAttributes.recycle();
                TextView textView = this.A0B;
                if (textView != null) {
                    textView.setText(A0E2);
                    AnonymousClass1HF.A0q(textView, true);
                }
                TextView textView2 = this.A09;
                if (textView2 != null) {
                    textView2.setText(A0E2);
                }
                setMediaInfo(A0E3);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public final void setThumbnailBg(int i) {
        this.A00 = i;
    }

    public final void setTopShadowVisibility(int i) {
        int i2;
        int paddingLeft = getPaddingLeft();
        if (i == 0) {
            i2 = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131167073);
        } else {
            i2 = 0;
        }
        C72463Mc.A14(this, paddingLeft, i2);
    }

    public static final void setSeeMoreClickListener$lambda$20(C107695aR r0, View view) {
        A00(r0);
    }

    public static final void setSeeMoreClickListener$lambda$21(C107695aR r0, View view) {
        A00(r0);
    }

    public static final void setSeeMoreClickListener$lambda$22(C107695aR r0, View view) {
        A00(r0);
    }

    public static final void setSeeMoreClickListener$lambda$23(C107695aR r0, View view) {
        A00(r0);
    }

    public static final void setSeeMoreClickListener$lambda$24(C107695aR r0, View view) {
        A00(r0);
    }

    public static final void setup$lambda$12$lambda$11$lambda$10(C107695aR r0, View view) {
        A00(r0);
    }
}
