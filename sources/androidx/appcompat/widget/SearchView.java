package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass056;
import X.AnonymousClass05O;
import X.AnonymousClass0Bl;
import X.AnonymousClass0Bm;
import X.C002801g;
import X.C03790Kq;
import X.C04190Me;
import X.C06550Yt;
import X.C15310qQ;
import X.C15320qR;
import X.C16530sa;
import X.C16560sd;
import X.C73093Oy;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements C16530sa {
    public static final C04190Me A0o;
    public SearchableInfo A00;
    public Bundle A01;
    public View.OnClickListener A02;
    public View.OnFocusChangeListener A03;
    public View.OnKeyListener A04;
    public C15310qQ A05;
    public C16560sd A06;
    public C73093Oy A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int[] A0C;
    public int[] A0D;
    public int A0E;
    public int A0F;
    public Rect A0G;
    public Rect A0H;
    public TextWatcher A0I;
    public C15320qR A0J;
    public AnonymousClass056 A0K;
    public CharSequence A0L;
    public CharSequence A0M;
    public Runnable A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final int A0S;
    public final int A0T;
    public final Intent A0U;
    public final Intent A0V;
    public final Drawable A0W;
    public final ImageView A0X;
    public final ImageView A0Y;
    public final ImageView A0Z;
    public final ImageView A0a;
    public final SearchAutoComplete A0b;
    public final Runnable A0c;
    public final View.OnClickListener A0d;
    public final View A0e;
    public final View A0f;
    public final View A0g;
    public final View A0h;
    public final AdapterView.OnItemClickListener A0i;
    public final AdapterView.OnItemSelectedListener A0j;
    public final ImageView A0k;
    public final TextView.OnEditorActionListener A0l;
    public final CharSequence A0m;
    public final WeakHashMap A0n;

    public class SearchAutoComplete extends AnonymousClass05O {
        public int A00;
        public SearchView A01;
        public boolean A02;
        public final Runnable A03;

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.A01.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void A00() {
            if (Build.VERSION.SDK_INT >= 29) {
                C03790Kq.A01(this);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C04190Me r0 = SearchView.A0o;
            C04190Me.A00();
            Method method = r0.A02;
            if (method != null) {
                try {
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1N(objArr, true);
                    method.invoke(this, objArr);
                } catch (Exception unused) {
                }
            }
        }

        public void A01() {
            if (this.A02) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.A02 = false;
            }
        }

        public boolean enoughToFilter() {
            if (this.A00 <= 0 || super.enoughToFilter()) {
                return true;
            }
            return false;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.A03 = new C06550Yt(this);
            this.A00 = getThreshold();
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001b A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private int getSearchViewTextMinWidthDp() {
            /*
                r4 = this;
                android.content.res.Resources r0 = r4.getResources()
                android.content.res.Configuration r3 = r0.getConfiguration()
                int r2 = r3.screenWidthDp
                int r1 = r3.screenHeightDp
                r0 = 960(0x3c0, float:1.345E-42)
                if (r2 < r0) goto L_0x001e
                r0 = 720(0x2d0, float:1.009E-42)
                if (r1 < r0) goto L_0x001b
                int r2 = r3.orientation
                r0 = 2
                r1 = 256(0x100, float:3.59E-43)
                if (r2 == r0) goto L_0x001d
            L_0x001b:
                r1 = 192(0xc0, float:2.69E-43)
            L_0x001d:
                return r1
            L_0x001e:
                r0 = 600(0x258, float:8.41E-43)
                r1 = 160(0xa0, float:2.24E-43)
                if (r2 < r0) goto L_0x001d
                goto L_0x001b
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.SearchAutoComplete.getSearchViewTextMinWidthDp():int");
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.A02) {
                Runnable runnable = this.A03;
                removeCallbacks(runnable);
                post(runnable);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.A01.A0J();
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.A01.hasFocus() && getVisibility() == 0) {
                this.A02 = true;
                Context context = getContext();
                C04190Me r0 = SearchView.A0o;
                if (context.getResources().getConfiguration().orientation == 2) {
                    A00();
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.A02 = false;
                removeCallbacks(this.A03);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.A02 = false;
                removeCallbacks(this.A03);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.A02 = true;
            }
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.A00 = i;
        }

        public void setSearchView(SearchView searchView) {
            this.A01 = searchView;
        }

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 2130968710);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r1 == null) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(int r9) {
        /*
            r8 = this;
            r6 = 0
            X.3Oy r0 = r8.A07
            android.database.Cursor r4 = r0.BQ4()
            if (r4 == 0) goto L_0x00cb
            boolean r0 = r4.moveToPosition(r9)
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = "suggest_intent_action"
            java.lang.String r7 = X.AnonymousClass0Bl.A02(r4, r0)     // Catch:{ RuntimeException -> 0x009c }
            if (r7 != 0) goto L_0x0021
            android.app.SearchableInfo r0 = r8.A00     // Catch:{ RuntimeException -> 0x009c }
            java.lang.String r7 = r0.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x009c }
            if (r7 != 0) goto L_0x0021
            java.lang.String r7 = "android.intent.action.SEARCH"
        L_0x0021:
            java.lang.String r0 = "suggest_intent_data"
            java.lang.String r1 = X.AnonymousClass0Bl.A02(r4, r0)     // Catch:{ RuntimeException -> 0x009c }
            if (r1 != 0) goto L_0x0031
            android.app.SearchableInfo r0 = r8.A00     // Catch:{ RuntimeException -> 0x009c }
            java.lang.String r1 = r0.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x009c }
            if (r1 == 0) goto L_0x004c
        L_0x0031:
            java.lang.String r0 = "suggest_intent_data_id"
            java.lang.String r2 = X.AnonymousClass0Bl.A02(r4, r0)     // Catch:{ RuntimeException -> 0x009c }
            if (r2 == 0) goto L_0x0063
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)     // Catch:{ RuntimeException -> 0x009c }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ RuntimeException -> 0x009c }
            java.lang.String r0 = android.net.Uri.encode(r2)     // Catch:{ RuntimeException -> 0x009c }
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ RuntimeException -> 0x009c }
            if (r1 != 0) goto L_0x0063
        L_0x004c:
            java.lang.String r0 = "suggest_intent_query"
            java.lang.String r5 = X.AnonymousClass0Bl.A02(r4, r0)     // Catch:{ RuntimeException -> 0x009c }
            java.lang.String r0 = "suggest_intent_extra_data"
            java.lang.String r2 = X.AnonymousClass0Bl.A02(r4, r0)     // Catch:{ RuntimeException -> 0x009c }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ RuntimeException -> 0x009c }
            r3.<init>(r7)     // Catch:{ RuntimeException -> 0x009c }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r0)     // Catch:{ RuntimeException -> 0x009c }
            goto L_0x0068
        L_0x0063:
            android.net.Uri r6 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x009c }
            goto L_0x004c
        L_0x0068:
            if (r6 == 0) goto L_0x006d
            r3.setData(r6)     // Catch:{ RuntimeException -> 0x009c }
        L_0x006d:
            java.lang.String r1 = "user_query"
            java.lang.CharSequence r0 = r8.A08     // Catch:{ RuntimeException -> 0x009c }
            r3.putExtra(r1, r0)     // Catch:{ RuntimeException -> 0x009c }
            if (r5 == 0) goto L_0x007b
            java.lang.String r0 = "query"
            r3.putExtra(r0, r5)     // Catch:{ RuntimeException -> 0x009c }
        L_0x007b:
            if (r2 == 0) goto L_0x0082
            java.lang.String r0 = "intent_extra_data_key"
            r3.putExtra(r0, r2)     // Catch:{ RuntimeException -> 0x009c }
        L_0x0082:
            android.os.Bundle r1 = r8.A01     // Catch:{ RuntimeException -> 0x009c }
            if (r1 == 0) goto L_0x008b
            java.lang.String r0 = "app_data"
            r3.putExtra(r0, r1)     // Catch:{ RuntimeException -> 0x009c }
        L_0x008b:
            android.app.SearchableInfo r0 = r8.A00     // Catch:{ RuntimeException -> 0x009c }
            android.content.ComponentName r0 = r0.getSearchActivity()     // Catch:{ RuntimeException -> 0x009c }
            r3.setComponent(r0)     // Catch:{ RuntimeException -> 0x009c }
            android.content.Context r0 = r8.getContext()     // Catch:{ RuntimeException -> 0x00bb }
            r0.startActivity(r3)     // Catch:{ RuntimeException -> 0x00bb }
            return
        L_0x009c:
            r3 = move-exception
            int r2 = r4.getPosition()     // Catch:{ RuntimeException -> 0x00a2 }
            goto L_0x00a3
        L_0x00a2:
            r2 = -1
        L_0x00a3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Search suggestions cursor at row "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " returned exception."
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "SearchView"
            android.util.Log.w(r0, r1, r3)
            return
        L_0x00bb:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed launch activity: "
            java.lang.String r1 = X.AnonymousClass001.A1E(r3, r0, r1)
            java.lang.String r0 = "SearchView"
            android.util.Log.e(r0, r1, r2)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.A04(int):void");
    }

    public void A0H() {
        A07(false);
        SearchAutoComplete searchAutoComplete = this.A0b;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.A02;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public boolean A0Q(int i) {
        A04(i);
        SearchAutoComplete searchAutoComplete = this.A0b;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
        return true;
    }

    public void clearFocus() {
        this.A0O = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.A0b;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.A0O = false;
    }

    static {
        C04190Me r0;
        if (Build.VERSION.SDK_INT < 29) {
            r0 = new C04190Me();
        } else {
            r0 = null;
        }
        A0o = r0;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchView(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            r18 = this;
            r11 = r18
            r12 = r19
            r3 = r20
            r2 = r21
            r11.<init>(r12, r3, r2)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r11.A0G = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r11.A0H = r0
            r1 = 2
            int[] r0 = new int[r1]
            r11.A0C = r0
            int[] r0 = new int[r1]
            r11.A0D = r0
            X.0Yr r0 = new X.0Yr
            r0.<init>(r11)
            r11.A0c = r0
            X.0Ys r0 = new X.0Ys
            r0.<init>(r11)
            r11.A0N = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r11.A0n = r0
            r10 = 1
            X.0Rc r9 = new X.0Rc
            r9.<init>(r11, r10)
            r11.A0d = r9
            X.0Rf r0 = new X.0Rf
            r0.<init>(r11)
            r11.A04 = r0
            X.0Rz r8 = new X.0Rz
            r8.<init>(r11)
            r11.A0l = r8
            X.0Rs r7 = new X.0Rs
            r7.<init>(r11)
            r11.A0i = r7
            X.0Rv r6 = new X.0Rv
            r6.<init>(r11, r10)
            r11.A0j = r6
            X.0RQ r0 = new X.0RQ
            r0.<init>(r11)
            r11.A0I = r0
            int[] r1 = X.C002501d.A0K
            r0 = 0
            X.01c r5 = X.C002401c.A00(r12, r3, r1, r2, r0)
            android.content.res.TypedArray r4 = r5.A02
            r14 = r3
            r15 = r11
            r16 = r1
            r17 = r2
            r13 = r4
            X.AnonymousClass1HF.A0K(r12, r13, r14, r15, r16, r17)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r12)
            r1 = 17
            r0 = 2131623961(0x7f0e0019, float:1.8875088E38)
            int r0 = r4.getResourceId(r1, r0)
            r2.inflate(r0, r11, r10)
            r0 = 2131434969(0x7f0b1dd9, float:1.8491767E38)
            android.view.View r12 = r11.findViewById(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r12 = (androidx.appcompat.widget.SearchView.SearchAutoComplete) r12
            r11.A0b = r12
            r12.setSearchView(r11)
            r0 = 2131434880(0x7f0b1d80, float:1.8491586E38)
            android.view.View r0 = r11.findViewById(r0)
            r11.A0f = r0
            r0 = 2131434948(0x7f0b1dc4, float:1.8491724E38)
            android.view.View r17 = r11.findViewById(r0)
            r0 = r17
            r11.A0g = r0
            r0 = 2131435880(0x7f0b2168, float:1.8493615E38)
            android.view.View r16 = r11.findViewById(r0)
            r0 = r16
            r11.A0h = r0
            r0 = 2131434860(0x7f0b1d6c, float:1.8491546E38)
            android.view.View r14 = r11.findViewById(r0)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r11.A0Z = r14
            r0 = 2131434892(0x7f0b1d8c, float:1.849161E38)
            android.view.View r13 = r11.findViewById(r0)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r11.A0Y = r13
            r0 = 2131434869(0x7f0b1d75, float:1.8491564E38)
            android.view.View r3 = r11.findViewById(r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r11.A0X = r3
            r0 = 2131434990(0x7f0b1dee, float:1.849181E38)
            android.view.View r2 = r11.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r11.A0a = r2
            r0 = 2131434914(0x7f0b1da2, float:1.8491655E38)
            android.view.View r1 = r11.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r11.A0k = r1
            r0 = 18
            android.graphics.drawable.Drawable r0 = r5.A03(r0)
            r15 = r0
            r0 = r17
            r0.setBackground(r15)
            r0 = 23
            android.graphics.drawable.Drawable r15 = r5.A03(r0)
            r0 = r16
            r0.setBackground(r15)
            r0 = 21
            r15 = 21
            android.graphics.drawable.Drawable r0 = r5.A03(r0)
            r14.setImageDrawable(r0)
            r0 = 13
            android.graphics.drawable.Drawable r0 = r5.A03(r0)
            r13.setImageDrawable(r0)
            r0 = 10
            android.graphics.drawable.Drawable r0 = r5.A03(r0)
            r3.setImageDrawable(r0)
            r0 = 26
            android.graphics.drawable.Drawable r0 = r5.A03(r0)
            r2.setImageDrawable(r0)
            android.graphics.drawable.Drawable r0 = r5.A03(r15)
            r1.setImageDrawable(r0)
            r0 = 20
            android.graphics.drawable.Drawable r0 = r5.A03(r0)
            r11.A0W = r0
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131898663(0x7f123127, float:1.943225E38)
            java.lang.String r0 = r1.getString(r0)
            X.AnonymousClass03N.A00(r14, r0)
            r1 = 24
            r0 = 2131623960(0x7f0e0018, float:1.8875086E38)
            int r0 = r4.getResourceId(r1, r0)
            r11.A0T = r0
            r1 = 11
            r0 = 0
            int r0 = r4.getResourceId(r1, r0)
            r11.A0S = r0
            r14.setOnClickListener(r9)
            r3.setOnClickListener(r9)
            r13.setOnClickListener(r9)
            r2.setOnClickListener(r9)
            r12.setOnClickListener(r9)
            android.text.TextWatcher r0 = r11.A0I
            r12.addTextChangedListener(r0)
            r12.setOnEditorActionListener(r8)
            r12.setOnItemClickListener(r7)
            r12.setOnItemSelectedListener(r6)
            android.view.View$OnKeyListener r0 = r11.A04
            r12.setOnKeyListener(r0)
            X.0Re r0 = new X.0Re
            r0.<init>(r11)
            r12.setOnFocusChangeListener(r0)
            r0 = 16
            boolean r0 = r4.getBoolean(r0, r10)
            r11.setIconifiedByDefault(r0)
            r1 = -1
            r0 = 2
            int r0 = r4.getDimensionPixelSize(r0, r1)
            if (r0 == r1) goto L_0x0195
            r11.setMaxWidth(r0)
        L_0x0195:
            r0 = 12
            java.lang.CharSequence r0 = r4.getText(r0)
            r11.A0m = r0
            r0 = 19
            java.lang.CharSequence r0 = r4.getText(r0)
            r11.A0M = r0
            r0 = 6
            int r0 = r4.getInt(r0, r1)
            if (r0 == r1) goto L_0x01af
            r11.setImeOptions(r0)
        L_0x01af:
            r0 = 5
            int r0 = r4.getInt(r0, r1)
            if (r0 == r1) goto L_0x01b9
            r11.setInputType(r0)
        L_0x01b9:
            boolean r0 = r4.getBoolean(r10, r10)
            r11.setFocusable(r0)
            r4.recycle()
            java.lang.String r0 = "android.speech.action.WEB_SEARCH"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            r11.A0V = r3
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r2)
            java.lang.String r1 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r0 = "web_search"
            r3.putExtra(r1, r0)
            java.lang.String r1 = "android.speech.action.RECOGNIZE_SPEECH"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            r11.A0U = r0
            r0.addFlags(r2)
            int r0 = r12.getDropDownAnchor()
            android.view.View r1 = r11.findViewById(r0)
            r11.A0e = r1
            if (r1 == 0) goto L_0x01f8
            X.0Rg r0 = new X.0Rg
            r0.<init>(r11)
            r1.addOnLayoutChangeListener(r0)
        L_0x01f8:
            boolean r0 = r11.A09
            r11.A07(r0)
            r11.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void A00() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.A0b.getText());
        int i = 0;
        if (!z2 && (!this.A09 || this.A0P)) {
            z = false;
        }
        ImageView imageView = this.A0X;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = View.ENABLED_STATE_SET;
            } else {
                iArr = View.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    private void A02() {
        SearchAutoComplete searchAutoComplete = this.A0b;
        searchAutoComplete.setThreshold(this.A00.getSuggestThreshold());
        searchAutoComplete.setImeOptions(this.A00.getImeOptions());
        int inputType = this.A00.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.A00.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        searchAutoComplete.setInputType(inputType);
        C73093Oy r1 = this.A07;
        if (r1 != null) {
            r1.BEZ((Cursor) null);
        }
        if (this.A00.getSuggestAuthority() != null) {
            AnonymousClass0Bl r0 = new AnonymousClass0Bl(this.A00, getContext(), this, this.A0n);
            this.A07 = r0;
            searchAutoComplete.setAdapter(r0);
            AnonymousClass0Bl r12 = (AnonymousClass0Bl) this.A07;
            if (this.A0R) {
                i = 2;
            }
            r12.A07(i);
        }
    }

    private void A03() {
        int i;
        if ((this.A0A || this.A0B) && !A0P() && (this.A0Y.getVisibility() == 0 || this.A0a.getVisibility() == 0)) {
            i = 0;
        } else {
            i = 8;
        }
        this.A0h.setVisibility(i);
    }

    public static void A05(SearchView searchView, int i) {
        CharSequence BFv;
        Editable text = searchView.A0b.getText();
        Cursor BQ4 = searchView.A07.BQ4();
        if (BQ4 == null) {
            return;
        }
        if (!BQ4.moveToPosition(i) || (BFv = searchView.A07.BFv(BQ4)) == null) {
            searchView.setQuery(text);
        } else {
            searchView.setQuery(BFv);
        }
    }

    private void A06(boolean z) {
        int i;
        if (!this.A0A || A0P() || !hasFocus() || (!z && this.A0B)) {
            i = 8;
        } else {
            i = 0;
        }
        this.A0Y.setVisibility(i);
    }

    private void A07(boolean z) {
        this.A0Q = z;
        int i = 0;
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        boolean z2 = !TextUtils.isEmpty(this.A0b.getText());
        this.A0Z.setVisibility(i2);
        A06(z2);
        View view = this.A0f;
        int i3 = 0;
        if (z) {
            i3 = 8;
        }
        view.setVisibility(i3);
        ImageView imageView = this.A0k;
        if (imageView.getDrawable() == null || this.A09) {
            i = 8;
        }
        imageView.setVisibility(i);
        A00();
        boolean z3 = !z2;
        int i4 = 8;
        if (this.A0B && !A0P() && z3) {
            this.A0Y.setVisibility(8);
            i4 = 0;
        }
        this.A0a.setVisibility(i4);
        A03();
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.A0b;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    public void A0E() {
        int i;
        int i2;
        View view = this.A0e;
        if (view.getWidth() > 1) {
            Resources A0Y2 = AnonymousClass000.A0Y(this);
            int paddingLeft = this.A0g.getPaddingLeft();
            Rect rect = new Rect();
            boolean z = C002801g.A01;
            boolean z2 = true;
            if (getLayoutDirection() != 1) {
                z2 = false;
            }
            if (this.A09) {
                i = A0Y2.getDimensionPixelSize(2131165225) + A0Y2.getDimensionPixelSize(2131165226);
            } else {
                i = 0;
            }
            SearchAutoComplete searchAutoComplete = this.A0b;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            int i3 = rect.left;
            if (z2) {
                i2 = -i3;
            } else {
                i2 = paddingLeft - (i3 + i);
            }
            searchAutoComplete.setDropDownHorizontalOffset(i2);
            searchAutoComplete.setDropDownWidth((((view.getWidth() + rect.left) + rect.right) + i) - paddingLeft);
        }
    }

    public void A0F() {
        if (Build.VERSION.SDK_INT >= 29) {
            C03790Kq.A00(this.A0b);
            return;
        }
        C04190Me r3 = A0o;
        SearchAutoComplete searchAutoComplete = this.A0b;
        C04190Me.A00();
        Method method = r3.A01;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C04190Me.A00();
        Method method2 = r3.A00;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void A0G() {
        SearchAutoComplete searchAutoComplete = this.A0b;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.A09 && this.A05 == null) {
            clearFocus();
            A07(true);
        }
    }

    public void A0I() {
        SearchAutoComplete searchAutoComplete = this.A0b;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C16560sd r1 = this.A06;
            if (r1 == null || !r1.C2Q(text.toString())) {
                if (this.A00 != null) {
                    A0O(text.toString());
                }
                searchAutoComplete.setImeVisibility(false);
                searchAutoComplete.dismissDropDown();
            }
        }
    }

    public void A0K() {
        int[] iArr;
        if (this.A0b.hasFocus()) {
            iArr = View.FOCUSED_STATE_SET;
        } else {
            iArr = View.EMPTY_STATE_SET;
        }
        Drawable background = this.A0g.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.A0h.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void A0M(CharSequence charSequence) {
        Editable text = this.A0b.getText();
        this.A08 = text;
        boolean z = !TextUtils.isEmpty(text);
        A06(z);
        boolean z2 = !z;
        int i = 8;
        if (this.A0B && !A0P() && z2) {
            this.A0Y.setVisibility(8);
            i = 0;
        }
        this.A0a.setVisibility(i);
        A00();
        A03();
        if (this.A06 != null && !TextUtils.equals(charSequence, this.A0L)) {
            this.A06.C2P(charSequence.toString());
        }
        this.A0L = charSequence.toString();
    }

    public void A0N(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.A0b;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.A08 = charSequence;
        }
    }

    public void A0O(String str) {
        Intent intent = new Intent("android.intent.action.SEARCH");
        intent.addFlags(268435456);
        intent.putExtra("user_query", this.A08);
        if (str != null) {
            intent.putExtra("query", str);
        }
        Bundle bundle = this.A01;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.A00.getSearchActivity());
        getContext().startActivity(intent);
    }

    public boolean A0R(int i, KeyEvent keyEvent) {
        int i2;
        if (this.A00 != null && this.A07 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return A0Q(this.A0b.getListSelection());
            }
            if (i == 21) {
                i2 = 0;
            } else if (i == 22) {
                i2 = this.A0b.length();
            } else if (i == 19) {
                this.A0b.getListSelection();
            }
            SearchAutoComplete searchAutoComplete = this.A0b;
            searchAutoComplete.setSelection(i2);
            searchAutoComplete.setListSelection(0);
            searchAutoComplete.clearListSelection();
            searchAutoComplete.A00();
            return true;
        }
        return false;
    }

    public int getImeOptions() {
        return this.A0b.getImeOptions();
    }

    public int getInputType() {
        return this.A0b.getInputType();
    }

    public CharSequence getQuery() {
        return this.A0b.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.A0M;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.A00;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.A0m;
        }
        return getContext().getText(this.A00.getHintId());
    }

    public void onActionViewCollapsed() {
        A0N("");
        clearFocus();
        A07(true);
        this.A0b.setImeOptions(this.A0E);
        this.A0P = false;
    }

    public void onActionViewExpanded() {
        if (!this.A0P) {
            this.A0P = true;
            SearchAutoComplete searchAutoComplete = this.A0b;
            int imeOptions = searchAutoComplete.getImeOptions();
            this.A0E = imeOptions;
            searchAutoComplete.setImeOptions(imeOptions | 33554432);
            searchAutoComplete.setText("");
            A0H();
        }
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.A0c);
        post(this.A0N);
        super.onDetachedFromWindow();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AnonymousClass0Bm)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass0Bm r2 = (AnonymousClass0Bm) parcelable;
        super.onRestoreInstanceState(r2.A00());
        A07(r2.A00);
        requestLayout();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.A0O || !isFocusable()) {
            return false;
        }
        if (A0P()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.A0b.requestFocus(i, rect);
        if (requestFocus) {
            A07(false);
        }
        return requestFocus;
    }

    public void setIconified(boolean z) {
        if (z) {
            A0G();
        } else {
            A0H();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.A09 != z) {
            this.A09 = z;
            A07(z);
            A01();
        }
    }

    public void setImeOptions(int i) {
        this.A0b.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.A0b.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.A0F = i;
        requestLayout();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.A0M = charSequence;
        A01();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.A0R = z;
        C73093Oy r1 = this.A07;
        if (r1 instanceof AnonymousClass0Bl) {
            AnonymousClass0Bl r12 = (AnonymousClass0Bl) r1;
            int i = 1;
            if (z) {
                i = 2;
            }
            r12.A07(i);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        Intent intent;
        this.A00 = searchableInfo;
        if (searchableInfo != null) {
            A02();
            A01();
        }
        SearchableInfo searchableInfo2 = this.A00;
        boolean z = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.A00.getVoiceSearchLaunchWebSearch()) {
                intent = this.A0V;
            } else if (this.A00.getVoiceSearchLaunchRecognizer()) {
                intent = this.A0U;
            }
            if (!(intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null)) {
                z = true;
            }
        }
        this.A0B = z;
        if (z) {
            this.A0b.setPrivateImeOptions("nm");
        }
        A07(A0P());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.A0A = z;
        A07(A0P());
    }

    public void setSuggestionsAdapter(C73093Oy r2) {
        this.A07 = r2;
        this.A0b.setAdapter(r2);
    }

    private void A01() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.A0b;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.A09 && (drawable = this.A0W) != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    private int getPreferredHeight() {
        return AnonymousClass000.A0Y(this).getDimensionPixelSize(2131165238);
    }

    private int getPreferredWidth() {
        return AnonymousClass000.A0Y(this).getDimensionPixelSize(2131165239);
    }

    public void A0J() {
        A07(A0P());
        post(this.A0c);
        if (this.A0b.hasFocus()) {
            A0F();
        }
    }

    public boolean A0P() {
        return this.A0Q;
    }

    public int getMaxWidth() {
        return this.A0F;
    }

    public int getSuggestionCommitIconResId() {
        return this.A0S;
    }

    public int getSuggestionRowLayout() {
        return this.A0T;
    }

    public C73093Oy getSuggestionsAdapter() {
        return this.A07;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.A0b;
            Rect rect = this.A0G;
            int[] iArr = this.A0C;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.A0D;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            rect.set(i6, i5, searchAutoComplete.getWidth() + i6, searchAutoComplete.getHeight() + i5);
            Rect rect2 = this.A0H;
            rect2.set(rect.left, 0, rect.right, i4 - i2);
            AnonymousClass056 r2 = this.A0K;
            if (r2 == null) {
                AnonymousClass056 r0 = new AnonymousClass056(rect2, rect, searchAutoComplete);
                this.A0K = r0;
                setTouchDelegate(r0);
                return;
            }
            r2.A04.set(rect2);
            Rect rect3 = r2.A03;
            rect3.set(rect2);
            int i7 = -r2.A01;
            rect3.inset(i7, i7);
            r2.A02.set(rect);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0 > 0) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5.A0P()
            if (r0 != 0) goto L_0x0038
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r4 = android.view.View.MeasureSpec.getSize(r6)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r3) goto L_0x004e
            if (r0 == 0) goto L_0x0045
            if (r0 != r2) goto L_0x0020
            int r0 = r5.A0F
            if (r0 <= 0) goto L_0x0020
        L_0x001c:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0020:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 == r3) goto L_0x003c
            if (r0 != 0) goto L_0x0030
            int r1 = r5.getPreferredHeight()
        L_0x0030:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
        L_0x0038:
            super.onMeasure(r6, r7)
            return
        L_0x003c:
            int r0 = r5.getPreferredHeight()
            int r1 = java.lang.Math.min(r0, r1)
            goto L_0x0030
        L_0x0045:
            int r4 = r5.A0F
            if (r4 > 0) goto L_0x0020
            int r4 = r5.getPreferredWidth()
            goto L_0x0020
        L_0x004e:
            int r0 = r5.A0F
            if (r0 > 0) goto L_0x001c
            int r0 = r5.getPreferredWidth()
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass0Bm r1 = new AnonymousClass0Bm(super.onSaveInstanceState());
        r1.A00 = A0P();
        return r1;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.A0c);
    }

    public void A0L(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void setAppSearchData(Bundle bundle) {
        this.A01 = bundle;
    }

    public void setOnCloseListener(C15310qQ r1) {
        this.A05 = r1;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A03 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C16560sd r1) {
        this.A06 = r1;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.A02 = onClickListener;
    }

    public void setOnSuggestionListener(C15320qR r1) {
        this.A0J = r1;
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971094);
    }
}
