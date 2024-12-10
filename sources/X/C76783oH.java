package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.view.custom.BusinessChatInfoLayout;
import com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2;
import com.whatsapp.components.ScalingFrameLayout;
import com.whatsapp.wds.components.topbar.WDSToolbar;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.3oH  reason: invalid class name and case insensitive filesystem */
public abstract class C76783oH extends AnonymousClass41I {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public View.OnClickListener A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public ListView A0J;
    public TextView A0K;
    public Toolbar A0L;
    public C72043Kk A0M;
    public C42141xh A0N;
    public AnonymousClass5X6 A0O;
    public ScalingFrameLayout A0P;
    public AnonymousClass1VW A0Q;
    public C24921Me A0R;
    public C18000vb A0S;
    public C88504Zz A0T;
    public AnonymousClass1KW A0U;
    public C18030ve A0V;
    public C133736pP A0W;
    public AnonymousClass73F A0X;
    public CharSequence A0Y;
    public boolean A0Z = false;
    public boolean A0a;
    public boolean A0b = false;
    public View A0c;
    public TextView A0d;
    public TextEmojiLabel A0e;
    public CharSequence A0f;
    public String A0g;
    public final ViewTreeObserver.OnGlobalLayoutListener A0h = new C90584eJ((Object) this, 10);

    public C76783oH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A03(context);
    }

    public int A07(int i) {
        ImageView imageView;
        ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) this;
        if (!(chatInfoLayoutV2 instanceof BusinessChatInfoLayout) || (imageView = chatInfoLayoutV2.A02) == null || imageView.getDrawable() == null) {
            return chatInfoLayoutV2.A08(i);
        }
        return (int) (((float) i) * 0.5625f);
    }

    public abstract int A08(int i);

    public void A09() {
        this.A06 = 0;
        if (this.A0G.getVisibility() != 0) {
            this.A0G.setVisibility(0);
        }
    }

    public void A0H(View view, View view2, Adapter adapter) {
        this.A0J.getViewTreeObserver().addOnGlobalLayoutListener(new C90504eB(view, view2, adapter, this, 0));
    }

    public abstract int getToolbarColorResId();

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        View view2;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingTop = getPaddingTop();
        int paddingBottom = i6 - getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        if (i6 > i5 || this.A0Z) {
            View view3 = this.A0E;
            view3.layout(paddingLeft, paddingTop, paddingRight, view3.getMeasuredHeight() + paddingTop);
            this.A0J.layout(paddingLeft, paddingTop, paddingRight, paddingBottom);
            if (this.A0c != null) {
                int i7 = 1;
                if (AnonymousClass3MW.A1Z(this.A0S)) {
                    i7 = i5 - 1;
                }
                if (!AnonymousClass3MW.A1Z(this.A0S)) {
                    i5 = 0;
                }
                this.A0c.layout(i5, 0, i7, getHeight());
                return;
            }
            return;
        }
        if (AnonymousClass3MW.A1Z(this.A0S)) {
            ListView listView = this.A0J;
            listView.layout(0 + paddingLeft, paddingTop, listView.getMeasuredWidth() + paddingLeft, paddingBottom);
            view = this.A0E;
            view2 = this.A0J;
        } else {
            View view4 = this.A0E;
            view4.layout(paddingLeft, paddingTop, view4.getMeasuredWidth() + paddingLeft, paddingBottom);
            view = this.A0J;
            view2 = this.A0E;
        }
        view.layout(paddingLeft + view2.getMeasuredWidth(), paddingTop, paddingRight, paddingBottom);
    }

    public abstract void setOnPhotoClickListener(View.OnClickListener onClickListener);

    public abstract void setRadius(float f);

    public abstract void setStatusData(C139106yE r1);

    private void A03(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(2130968592, typedValue, true)) {
            this.A07 = TypedValue.complexToDimensionPixelSize(typedValue.data, AnonymousClass3Ma.A09(this));
        }
        boolean z = C22891Dp.A09;
        Resources resources = getResources();
        int i = 2131166057;
        if (z) {
            i = 2131169446;
        }
        this.A02 = AnonymousClass3MW.A00(resources, i);
    }

    private void A04(CharSequence charSequence) {
        if (this.A0e != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            TextEmojiLabel textEmojiLabel = this.A0e;
            if (isEmpty) {
                textEmojiLabel.setVisibility(8);
            } else {
                textEmojiLabel.setVisibility(0);
                this.A0e.A0R(charSequence);
            }
            this.A0e.setOnClickListener(this.A0A);
            AnonymousClass1Y5.A02(this.A0e, 2131886435);
        }
    }

    private void setSubtitleSingleLine(boolean z) {
        TextView textView = this.A0d;
        if (textView != null) {
            textView.setSingleLine(z);
        }
    }

    public void A06(boolean z) {
        this.A0Z = z;
        A0C();
        if (this.A0c == null) {
            this.A0c = getVerticalDivider();
            getOverlay().add(this.A0c);
        }
        View view = this.A0c;
        if (view != null) {
            view.setVisibility(C72453Mb.A07(z ? 1 : 0));
        }
    }

    public void A0B() {
        CharSequence charSequence = this.A0Y;
        if (charSequence != null) {
            this.A0G.setContentDescription(C60592oI.A00(this.A0S, Arrays.asList(this.A0g == null ? new String[]{charSequence.toString()} : new String[]{charSequence.toString(), this.A0g}), false));
        }
    }

    public void A0C() {
        AEB aeb;
        Integer num;
        AEB aeb2;
        int i;
        View A0F2 = AnonymousClass3MY.A0F(this.A0J);
        if (A0F2 != null) {
            if (this.A0J.getFirstVisiblePosition() == 0) {
                i = A0F2.getTop();
            } else {
                i = -getHeight();
            }
            setScrollPos(i);
        }
        if (this.A0T.A03() && this.A0b && C42491yG.A0D(this.A0D)) {
            C17880vN.A1F(C18070vi.A03(((C85234Mp) this.A0W.A00.get()).A01).edit(), "pref_chat_info_new_icon_shown", true);
        }
        AnonymousClass5X6 r1 = this.A0O;
        if (r1 != null) {
            C93744jT r12 = (C93744jT) r1;
            int i2 = r12.A00;
            Object obj = r12.A01;
            if (2 - i2 != 0) {
                C92874i3 r13 = (C92874i3) obj;
                C76783oH r2 = r13.A0m;
                Integer num2 = null;
                if (r13.A0N || r13.A0M || r13.A0L) {
                    AEW aew = r13.A0G;
                    if (aew != null) {
                        C20248ADg aDg = aew.A06;
                        if (r13.A0M && C92874i3.A08(r13.A0C)) {
                            if (aDg == null || (aeb2 = aDg.A00) == null) {
                                num = null;
                            } else {
                                num = Integer.valueOf(aeb2.A00);
                            }
                            r13.A0d.A06(r13.A1E, num, C22971Dz.A06(r13.A0h.A0T()), 16, 0, r13.A0D());
                            r13.A0M = false;
                        }
                        if (r13.A0N && C92874i3.A08(r13.A0D)) {
                            if (!(aDg == null || (aeb = aDg.A01) == null)) {
                                num2 = Integer.valueOf(aeb.A00);
                            }
                            r13.A0d.A06(r13.A1E, num2, C22971Dz.A06(r13.A0h.A0T()), 16, 1, r13.A0D());
                            r13.A0N = false;
                        }
                        if (r13.A0L && C92874i3.A08(r13.A03)) {
                            r13.A0d.A05(r13.A0F, 14, AnonymousClass000.A1W(r13.A0h.A00.A0H));
                            r13.A0L = false;
                        }
                        if (r13.A0M && C92874i3.A08(r13.A0A)) {
                            r13.A0d.A04(r13.A0F, 19);
                            r13.A0M = false;
                        }
                        if (r13.A0N && C92874i3.A08(r13.A0B)) {
                            r13.A0d.A04(r13.A0F, 22);
                            r13.A0N = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                r2.A0O = null;
                return;
            }
            ContactInfoActivity contactInfoActivity = (ContactInfoActivity) obj;
            if (!((C60122nQ) contactInfoActivity.A29.get()).A02()) {
                contactInfoActivity.A0i.A0O = null;
            } else if (C72463Mc.A1V(contactInfoActivity.A1s) && C42491yG.A0D(contactInfoActivity.A01)) {
                SharedPreferences.Editor edit = C138936xw.A00((C138936xw) ((C138616xO) ((C60122nQ) contactInfoActivity.A29.get()).A00.get()).A03.get()).edit();
                edit.putBoolean("key_chat_info_new_icon_shown", false);
                edit.apply();
            }
        }
    }

    public void A0F(int i, int i2) {
        this.A04 = i;
        this.A03 = i2;
        if ((getHeight() > getWidth() && this.A00 > 0.0f) || this.A0Z) {
            float f = this.A00;
            int i3 = (int) (((float) this.A04) * f * f);
            int i4 = (int) (((float) this.A03) * f * f);
            C27641Ww.A05(this.A0I, this.A0S, i3, i4);
        }
    }

    public void A0G(Bitmap bitmap) {
        View view;
        int i;
        if (this instanceof BusinessChatInfoLayout) {
            ImageView A0G2 = AnonymousClass3MW.A0G(this, 2131433831);
            if (bitmap != null) {
                A0G2.setImageBitmap(bitmap);
                view = this.A0B;
                i = 0;
            } else {
                A0G2.setImageDrawable((Drawable) null);
                view = this.A0B;
                i = 8;
            }
            setToolbarIconColorIfNeeded(C19740yt.A00(AnonymousClass3MX.A04(view, this, i), getToolbarColorResId()));
            A0D();
            C90584eJ.A00(this.A0J.getViewTreeObserver(), this, 9);
        }
    }

    public View getBusinessDetailsCard() {
        return this.A0C;
    }

    public int getColor() {
        return this.A05;
    }

    public TextView getContactNameView() {
        return this.A0K;
    }

    public void setColor(int i) {
        int i2 = (i & 16777215) | (this.A05 & -16777216);
        this.A05 = i2;
        this.A0H.setBackgroundColor(i2);
    }

    public void setPushName(String str) {
        this.A0f = str;
        A04(str);
    }

    public void setSubtitleText(String str) {
        TextView textView = this.A0d;
        if (textView != null && str != null) {
            this.A0g = str;
            textView.setText(str);
            this.A0d.setVisibility(C72453Mb.A01(TextUtils.isEmpty(str) ? 1 : 0));
            A0B();
        }
    }

    public void setTitleTextMessageYourself(AnonymousClass1E7 r4) {
        this.A0N.A09(r4, (C43351zf) null, (List) null, 0.9f);
        C42141xh r0 = this.A0N;
        r0.A01.setOnClickListener(this.A0A);
        A0B();
    }

    public void setTitleVerified(boolean z) {
        C42141xh r1 = this.A0N;
        int i = 0;
        if (z) {
            i = 3;
        }
        r1.A03(i);
    }

    public void setToolbarIconColorIfNeeded(int i) {
        if (!C22891Dp.A02 && !C28281Zt.A0B(getContext())) {
            Drawable navigationIcon = this.A0L.getNavigationIcon();
            Drawable overflowIcon = this.A0L.getOverflowIcon();
            if (navigationIcon != null && overflowIcon != null) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                overflowIcon.setColorFilter(i, mode);
                navigationIcon.setColorFilter(i, mode);
                this.A0L.setNavigationIcon(navigationIcon);
                this.A0L.setOverflowIcon(overflowIcon);
            }
        }
    }

    private View getVerticalDivider() {
        View A0R2 = C72453Mb.A0R(this);
        C72463Mc.A0x(A0R2.getContext(), getResources(), A0R2, 2130971336, 2131102585);
        return A0R2;
    }

    public void A0A() {
        AnonymousClass1Y3 r3;
        Activity A002 = C18050vg.A00(getContext());
        this.A00 = A002;
        if (A002 != null) {
            AnonymousClass3MX.A0j(getSplitWindowManager()).A04(A002, this.A01);
        }
        this.A0H = findViewById(2131433806);
        this.A0I = findViewById(2131435877);
        this.A0B = AnonymousClass1HF.A06(this, 2131428343);
        TextView A0J2 = AnonymousClass3MW.A0J(this, 2131429556);
        this.A0K = A0J2;
        if (C22891Dp.A09) {
            C29261bv.A08(A0J2, 2132084409);
        }
        this.A0N = C42141xh.A01(this, this.A0M, 2131429556);
        AnonymousClass1Y5.A02(this.A0K, 2131886435);
        this.A0P = (ScalingFrameLayout) findViewById(2131429558);
        Toolbar toolbar = (Toolbar) AnonymousClass1HF.A06(this, 2131436270);
        this.A0L = toolbar;
        if ((toolbar instanceof WDSToolbar) && C22891Dp.A02) {
            if (C28281Zt.A0B(getContext())) {
                r3 = AnonymousClass2QJ.A00;
            } else {
                r3 = AnonymousClass1YM.A00;
            }
            ((WDSToolbar) this.A0L).setIconSet(r3);
            TextView textView = this.A0K;
            Context context = getContext();
            C18070vi.A0d(context, 0);
            AnonymousClass3MX.A1C(context, textView, r3.A00);
        }
        C28261Zr.A01(this.A0L, C27871Xy.GONE);
        TextView A0E2 = C17880vN.A0E(this, 2131429560);
        this.A0d = A0E2;
        if (A0E2 != null) {
            A0E2.setClickable(false);
        }
        this.A0e = AnonymousClass3MX.A0W(this, 2131434233);
        this.A0E = findViewById(2131431358);
        this.A0J = (ListView) findViewById(16908298);
        this.A0G = AnonymousClass1HF.A06(this, 2131431381);
        this.A01 = this.A0N.A01.getTextSize();
        A0D();
        C90584eJ.A00(this.A0J.getViewTreeObserver(), this, 9);
    }

    public void A0D() {
        Display defaultDisplay = AnonymousClass3Ma.A05(this).getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.A0G.setLayoutParams(new LinearLayout.LayoutParams(-1, A07(point.x)));
    }

    public void A0E(int i) {
        this.A0J = (ListView) AnonymousClass1HF.A06(this, 16908298);
        View inflate = AnonymousClass3MZ.A0D(this).inflate(i, this.A0J, false);
        this.A0F = inflate;
        this.A0J.addHeaderView(inflate, (Object) null, false);
        this.A0F.setImportantForAccessibility(2);
    }

    public int getToolbarColor() {
        return C19740yt.A00(getContext(), getToolbarColorResId());
    }

    public void onMeasure(int i, int i2) {
        ListView listView;
        int makeMeasureSpec;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (getMeasuredHeight() >= measuredWidth || this.A0Z) {
            View view = this.A0G;
            if (!(view == null || view.getVisibility() == 0)) {
                this.A0H.setOnClickListener((View.OnClickListener) null);
                this.A0H.setClickable(false);
                this.A0G.setVisibility(0);
                this.A0J.getViewTreeObserver().addOnGlobalLayoutListener(this.A0h);
            }
            AnonymousClass3MY.A1C(this.A0E, Math.max(this.A07, this.A06), 1073741824, View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824));
            listView = this.A0J;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        } else {
            if (this.A0G.getVisibility() != 8) {
                this.A0H.setOnClickListener(this.A0A);
                AnonymousClass1Y5.A02(this.A0H, 2131886435);
                this.A0H.setClickable(true);
                C42141xh r0 = this.A0N;
                r0.A01.setOnClickListener(this.A0A);
                this.A0G.setVisibility(8);
                this.A0J.post(new AnonymousClass7R9(this, 41));
            }
            int i3 = (int) (((float) measuredWidth) * 0.618f);
            this.A0E.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - i3, 1073741824), i2);
            listView = this.A0J;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        listView.measure(makeMeasureSpec, i2);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.A0A = onClickListener;
    }

    public void setOnScrollListener(AnonymousClass5X6 r1) {
        this.A0O = r1;
    }

    public void setScrollPos(int i) {
        C27871Xy r0;
        ImageView imageView;
        if (getWidth() < getHeight() || this.A0Z) {
            if (this.A0a) {
                A09();
            }
            this.A0a = false;
            this.A09 = Math.max(this.A09, -((long) (((((float) (i - this.A08)) / ((float) getHeight())) * 100.0f) - 100.0f)));
            int max = Math.max(this.A07, A07(getWidth()) + i);
            int A082 = A08(getWidth());
            this.A00 = Math.max(0.0f, ((float) (A082 - max)) / ((float) (A082 - this.A07)));
            TextUtils.TruncateAt ellipsize = this.A0N.A01.getEllipsize();
            int i2 = this.A07 * 2;
            TextEmojiLabel textEmojiLabel = this.A0N.A01;
            if (max < i2) {
                textEmojiLabel.setSingleLine(true);
                C42141xh r02 = this.A0N;
                r02.A01.setEllipsize(TextUtils.TruncateAt.END);
                setSubtitleSingleLine(true);
                AnonymousClass3MW.A0B(this.A0N.A01).setMargins(0, 0, 0, 0);
            } else {
                textEmojiLabel.setSingleLine(false);
                this.A0N.A01.setEllipsize((TextUtils.TruncateAt) null);
                setSubtitleSingleLine(false);
                ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(this.A0N.A01);
                int i3 = this.A07;
                A0B2.setMargins(0, Math.min(i3, max - (i3 * 2)), 0, 0);
            }
            A04(this.A0f);
            if (ellipsize != this.A0N.A01.getEllipsize()) {
                C42141xh r03 = this.A0N;
                r03.A01.setText(this.A0Y);
                A0B();
            }
            if (this.A06 != max) {
                this.A06 = max;
                int i4 = this.A05 >> 24;
                if (max == this.A07) {
                    if (i4 != -1) {
                        this.A0N.A01.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                        TextView textView = this.A0d;
                        if (textView != null) {
                            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                        }
                    }
                } else if (i4 == -1) {
                    this.A0N.A01.setShadowLayer(1.0f, 1.0f, 1.0f, -10066330);
                    TextView textView2 = this.A0d;
                    if (textView2 != null) {
                        textView2.setShadowLayer(1.0f, 1.0f, 1.0f, -10066330);
                    }
                }
                ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) this;
                float f = chatInfoLayoutV2.A00;
                float f2 = 1.0f - f;
                int i5 = (int) (f * 255.0f);
                int i6 = (int) (((float) chatInfoLayoutV2.A04) * f * f);
                int i7 = (int) (((float) chatInfoLayoutV2.A03) * f * f);
                float f3 = chatInfoLayoutV2.A01;
                float f4 = (f3 - ((f3 - chatInfoLayoutV2.A02) * f)) / f3;
                boolean z = false;
                int i8 = (f > 0.8f ? 1 : (f == 0.8f ? 0 : -1));
                TextView textView3 = chatInfoLayoutV2.A0K;
                if (i8 > 0) {
                    textView3.setAlpha((float) i5);
                    chatInfoLayoutV2.A0K.setVisibility(0);
                } else {
                    textView3.setVisibility(8);
                }
                ScalingFrameLayout scalingFrameLayout = chatInfoLayoutV2.A0P;
                scalingFrameLayout.A00 = f4;
                AnonymousClass3MW.A0B(scalingFrameLayout).setMargins(0, 0, 0, 0);
                chatInfoLayoutV2.A05 = (i5 << 24) | (chatInfoLayoutV2.A05 & 16777215);
                chatInfoLayoutV2.A0I();
                chatInfoLayoutV2.A0H.setBackgroundColor(chatInfoLayoutV2.A05);
                if (!C28281Zt.A0B(chatInfoLayoutV2.getContext()) && (((imageView = chatInfoLayoutV2.A02) == null || imageView.getDrawable() == null) && !C22891Dp.A02)) {
                    int i9 = (int) (chatInfoLayoutV2.A00 * 255.0f);
                    if (i9 < 111) {
                        i9 = 111;
                    }
                    int i10 = i9 & 255;
                    chatInfoLayoutV2.setToolbarIconColorIfNeeded((i10 << 0) | (i10 << 16) | -16777216 | (i10 << 8));
                }
                C27641Ww.A05(chatInfoLayoutV2.A0I, chatInfoLayoutV2.A0S, i6, i7);
                ChatInfoLayoutV2.A01(chatInfoLayoutV2);
                if (chatInfoLayoutV2.A00 <= 0.95f) {
                    z = true;
                }
                chatInfoLayoutV2.A06 = z;
                ViewGroup.MarginLayoutParams A0B3 = AnonymousClass3MW.A0B(chatInfoLayoutV2.A02);
                A0B3.setMargins(A0B3.leftMargin, A0B3.topMargin, A0B3.rightMargin, (int) (AnonymousClass3MW.A00(chatInfoLayoutV2.getResources(), 2131165561) * f2));
                chatInfoLayoutV2.A02.setLayoutParams(A0B3);
                chatInfoLayoutV2.A0H.setLayoutParams(A0B3);
                chatInfoLayoutV2.A0B.setLayoutParams(A0B3);
                chatInfoLayoutV2.A04.setAnimationValue(chatInfoLayoutV2.A00);
                ChatInfoLayoutV2.A02(chatInfoLayoutV2);
                Toolbar toolbar = chatInfoLayoutV2.A0L;
                if (chatInfoLayoutV2.A00 > 0.8f) {
                    r0 = C27871Xy.VISIBLE;
                } else {
                    r0 = C27871Xy.GONE;
                }
                C28261Zr.A01(toolbar, r0);
                chatInfoLayoutV2.requestLayout();
            }
        } else if (!this.A0a) {
            this.A0a = true;
            ChatInfoLayoutV2 chatInfoLayoutV22 = (ChatInfoLayoutV2) this;
            chatInfoLayoutV22.A0G.setVisibility(8);
            chatInfoLayoutV22.A0H.setBackgroundColor(0);
            chatInfoLayoutV22.A0P.setVisibility(8);
            ChatInfoLayoutV2.A01(chatInfoLayoutV22);
            ViewGroup.MarginLayoutParams A0B4 = AnonymousClass3MW.A0B(chatInfoLayoutV22.A02);
            A0B4.setMargins(0, 0, 0, 0);
            chatInfoLayoutV22.A02.setLayoutParams(A0B4);
            chatInfoLayoutV22.A0H.setLayoutParams(A0B4);
            chatInfoLayoutV22.A0B.setLayoutParams(A0B4);
            chatInfoLayoutV22.setToolbarIconColorIfNeeded(chatInfoLayoutV22.getToolbarColor());
        }
    }

    public void setShowCtwaMMNewIcon(boolean z) {
        this.A0b = z;
    }

    public void setTitleText(String str) {
        CharSequence A042 = C43251zV.A04(getContext(), this.A0N.A01.getPaint(), this.A0U, str, 0.9f);
        this.A0Y = A042;
        this.A0N.A01.setText(A042);
        C42141xh r0 = this.A0N;
        r0.A01.setOnClickListener(this.A0A);
        A0B();
    }

    public C76783oH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03(context);
    }

    public C76783oH(Context context) {
        super(context, (AttributeSet) null, 0);
        A03(context);
    }
}
