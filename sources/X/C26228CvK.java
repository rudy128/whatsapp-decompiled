package X;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.CvK  reason: case insensitive filesystem */
public class C26228CvK {
    public static int A03;
    public int A00 = -1;
    public int A01 = -1;
    public final AccessibilityNodeInfo A02;

    public static String A01(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH /*1024*/:
                return "ACTION_NEXT_HTML_ELEMENT";
            case EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH /*2048*/:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case ZipDecompressor.UNZIP_BUFFER_SIZE:
                return "ACTION_SCROLL_FORWARD";
            case DefaultCrypto.BUFFER_SIZE:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case A7Y.A0F:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908382:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public void A09() {
        this.A02.setContentInvalid(true);
    }

    public void A0E(View view) {
        this.A00 = -1;
        this.A02.setParent(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0029
            r2 = 0
            if (r5 == 0) goto L_0x0014
            boolean r0 = r5 instanceof X.C26228CvK
            if (r0 == 0) goto L_0x0014
            X.CvK r5 = (X.C26228CvK) r5
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.A02
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.A02
            if (r1 != 0) goto L_0x0015
            if (r0 == 0) goto L_0x001c
        L_0x0014:
            return r2
        L_0x0015:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x001c
            return r2
        L_0x001c:
            int r1 = r4.A01
            int r0 = r5.A01
            if (r1 != r0) goto L_0x0014
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 == r0) goto L_0x0029
            return r2
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26228CvK.equals(java.lang.Object):boolean");
    }

    private ArrayList A02(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList A13 = AnonymousClass000.A13();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, A13);
        return A13;
    }

    private void A03(int i, boolean z) {
        Bundle extras = this.A02.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private boolean A04(int i) {
        Bundle extras = this.A02.getExtras();
        if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) != i) {
            return false;
        }
        return true;
    }

    public int A05() {
        return this.A02.getMovementGranularities();
    }

    public AccessibilityNodeInfo A06() {
        return this.A02;
    }

    public CharSequence A07() {
        if (!C17880vN.A1X(A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"))) {
            return this.A02.getText();
        }
        ArrayList A022 = A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList A023 = A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList A024 = A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList A025 = A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < A022.size(); i++) {
            spannableString.setSpan(new BGW(this, BE9.A0I(A025, i), accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), BE9.A0I(A022, i), BE9.A0I(A023, i), BE9.A0I(A024, i));
        }
        return spannableString;
    }

    public List A08() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.A02.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList A13 = AnonymousClass000.A13();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            A13.add(new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, actionList.get(i), 0));
        }
        return A13;
    }

    public void A0A(int i) {
        this.A02.addAction(i);
    }

    public void A0B(int i) {
        this.A02.setMovementGranularities(i);
    }

    public void A0C(int i, int i2) {
        this.A02.setTextSelection(i, i2);
    }

    public void A0D(Rect rect) {
        this.A02.setBoundsInScreen(rect);
    }

    public void A0F(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.A02.setTraversalAfter(view);
        }
    }

    public void A0G(View view, int i) {
        this.A02.addChild(view, i);
    }

    public void A0H(View view, int i) {
        this.A00 = i;
        this.A02.setParent(view, i);
    }

    public void A0I(View view, int i) {
        this.A01 = i;
        this.A02.setSource(view, i);
    }

    public void A0J(View view, int i) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.A02.setTraversalBefore(view, i);
        }
    }

    public void A0K(View view, CharSequence charSequence) {
        int length;
        int i;
        if (Build.VERSION.SDK_INT < 26) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(2131436006);
            if (sparseArray != null) {
                ArrayList A13 = AnonymousClass000.A13();
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    if (((Reference) sparseArray.valueAt(i2)).get() == null) {
                        C17890vO.A1D(A13, i2);
                    }
                }
                for (int i3 = 0; i3 < A13.size(); i3++) {
                    sparseArray.remove(BE9.A0I(A13, i3));
                }
            }
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, charSequence.length(), ClickableSpan.class);
                if (clickableSpanArr != null && (length = clickableSpanArr.length) > 0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", 2131427376);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(2131436006);
                    if (sparseArray2 == null) {
                        sparseArray2 = BE6.A0Q();
                        view.setTag(2131436006, sparseArray2);
                    }
                    int i4 = 0;
                    do {
                        ClickableSpan clickableSpan = clickableSpanArr[i4];
                        int i5 = 0;
                        while (true) {
                            if (i5 >= sparseArray2.size()) {
                                i = A03;
                                A03 = i + 1;
                                break;
                            } else if (clickableSpan.equals(((Reference) sparseArray2.valueAt(i5)).get())) {
                                i = sparseArray2.keyAt(i5);
                                break;
                            } else {
                                i5++;
                            }
                        }
                        sparseArray2.put(i, AnonymousClass3MW.A0z(clickableSpanArr[i4]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i4];
                        C17890vO.A1D(A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"), spanned.getSpanStart(clickableSpan2));
                        C17890vO.A1D(A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"), spanned.getSpanEnd(clickableSpan2));
                        C17890vO.A1D(A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"), spanned.getSpanFlags(clickableSpan2));
                        C17890vO.A1D(A02("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"), i);
                        i4++;
                    } while (i4 < length);
                }
            }
        }
    }

    public void A0L(C26137Ct0 ct0) {
        this.A02.addAction((AccessibilityNodeInfo.AccessibilityAction) ct0.A03);
    }

    public void A0M(C26137Ct0 ct0) {
        this.A02.removeAction((AccessibilityNodeInfo.AccessibilityAction) ct0.A03);
    }

    public void A0N(C25477CgW cgW) {
        this.A02.setRangeInfo((AccessibilityNodeInfo.RangeInfo) cgW.A00);
    }

    public void A0O(CharSequence charSequence) {
        this.A02.setClassName(charSequence);
    }

    public void A0P(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (i >= 34) {
            C26158CtU.A03(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY", charSequence);
        }
    }

    public void A0Q(CharSequence charSequence) {
        this.A02.setContentDescription(charSequence);
    }

    public void A0R(CharSequence charSequence) {
        this.A02.setError(charSequence);
    }

    public void A0S(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void A0T(CharSequence charSequence) {
        this.A02.setPackageName(charSequence);
    }

    public void A0U(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void A0V(CharSequence charSequence) {
        this.A02.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void A0W(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (i >= 30) {
            C25295Ccx.A01(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void A0X(CharSequence charSequence) {
        this.A02.setText(charSequence);
    }

    public void A0Y(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (i >= 28) {
            accessibilityNodeInfo.setTooltipText(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public void A0Z(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((C25475CgU) obj).A00;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public void A0a(Object obj) {
        this.A02.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((C25476CgV) obj).A00);
    }

    public void A0b(String str) {
        this.A02.setViewIdResourceName(str);
    }

    public void A0c(boolean z) {
        this.A02.setAccessibilityFocused(z);
    }

    public void A0d(boolean z) {
        this.A02.setCheckable(z);
    }

    public void A0e(boolean z) {
        this.A02.setChecked(z);
    }

    public void A0f(boolean z) {
        this.A02.setClickable(z);
    }

    public void A0g(boolean z) {
        this.A02.setEditable(z);
    }

    public void A0h(boolean z) {
        this.A02.setEnabled(z);
    }

    public void A0i(boolean z) {
        this.A02.setFocusable(z);
    }

    public void A0j(boolean z) {
        this.A02.setFocused(z);
    }

    public void A0k(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.A02.setHeading(z);
        } else {
            A03(2, z);
        }
    }

    public void A0l(boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.A02.setImportantForAccessibility(z);
        }
    }

    public void A0m(boolean z) {
        this.A02.setLongClickable(z);
    }

    public void A0n(boolean z) {
        this.A02.setPassword(z);
    }

    public void A0o(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.A02.setScreenReaderFocusable(z);
        } else {
            A03(1, z);
        }
    }

    public void A0p(boolean z) {
        this.A02.setScrollable(z);
    }

    public void A0q(boolean z) {
        this.A02.setSelected(z);
    }

    public void A0r(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.A02.setShowingHintText(z);
        } else {
            A03(4, z);
        }
    }

    public void A0s(boolean z) {
        this.A02.setVisibleToUser(z);
    }

    public boolean A0t() {
        return this.A02.isFocusable();
    }

    public boolean A0u() {
        return this.A02.isFocused();
    }

    public boolean A0v() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.A02.isShowingHintText();
        }
        return A04(4);
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A02);
    }

    public C26228CvK(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A02 = accessibilityNodeInfo;
    }

    public static C26228CvK A00() {
        return new C26228CvK(AccessibilityNodeInfo.obtain());
    }

    public String toString() {
        CharSequence charSequence;
        CharSequence charSequence2;
        String string;
        boolean z;
        CharSequence charSequence3;
        boolean z2;
        boolean A04;
        boolean A042;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(super.toString());
        Rect A07 = AnonymousClass3MW.A07();
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        accessibilityNodeInfo.getBoundsInParent(A07);
        A10.append(AnonymousClass001.A1E(A07, "; boundsInParent: ", AnonymousClass000.A10()));
        accessibilityNodeInfo.getBoundsInScreen(A07);
        A10.append(AnonymousClass001.A1E(A07, "; boundsInScreen: ", AnonymousClass000.A10()));
        if (Build.VERSION.SDK_INT >= 34) {
            C26158CtU.A02(A07, accessibilityNodeInfo);
        } else {
            Rect rect = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect != null) {
                A07.set(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
        A10.append(AnonymousClass001.A1E(A07, "; boundsInWindow: ", AnonymousClass000.A10()));
        A10.append("; packageName: ");
        A10.append(accessibilityNodeInfo.getPackageName());
        A10.append("; className: ");
        A10.append(accessibilityNodeInfo.getClassName());
        A10.append("; text: ");
        A10.append(A07());
        A10.append("; error: ");
        A10.append(accessibilityNodeInfo.getError());
        A10.append("; maxTextLength: ");
        A10.append(accessibilityNodeInfo.getMaxTextLength());
        A10.append("; stateDescription: ");
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            charSequence = C25295Ccx.A00(accessibilityNodeInfo);
        } else {
            charSequence = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        A10.append(charSequence);
        A10.append("; contentDescription: ");
        A10.append(accessibilityNodeInfo.getContentDescription());
        A10.append("; tooltipText: ");
        if (i >= 28) {
            charSequence2 = accessibilityNodeInfo.getTooltipText();
        } else {
            charSequence2 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        A10.append(charSequence2);
        A10.append("; viewIdResName: ");
        A10.append(accessibilityNodeInfo.getViewIdResourceName());
        A10.append("; uniqueId: ");
        if (i >= 33) {
            string = C25296Ccy.A00(accessibilityNodeInfo);
        } else {
            string = accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        A10.append(string);
        A10.append("; checkable: ");
        A10.append(accessibilityNodeInfo.isCheckable());
        A10.append("; checked: ");
        A10.append(accessibilityNodeInfo.isChecked());
        A10.append("; focusable: ");
        A10.append(accessibilityNodeInfo.isFocusable());
        A10.append("; focused: ");
        A10.append(accessibilityNodeInfo.isFocused());
        A10.append("; selected: ");
        A10.append(accessibilityNodeInfo.isSelected());
        A10.append("; clickable: ");
        A10.append(accessibilityNodeInfo.isClickable());
        A10.append("; longClickable: ");
        A10.append(accessibilityNodeInfo.isLongClickable());
        A10.append("; contextClickable: ");
        if (i >= 23) {
            z = accessibilityNodeInfo.isContextClickable();
        } else {
            z = false;
        }
        A10.append(z);
        A10.append("; enabled: ");
        A10.append(accessibilityNodeInfo.isEnabled());
        A10.append("; password: ");
        A10.append(accessibilityNodeInfo.isPassword());
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("; scrollable: ");
        A102.append(accessibilityNodeInfo.isScrollable());
        AnonymousClass8BS.A1D(A102, A10);
        A10.append("; containerTitle: ");
        if (i >= 34) {
            charSequence3 = C26158CtU.A01(accessibilityNodeInfo);
        } else {
            charSequence3 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        A10.append(charSequence3);
        A10.append("; granularScrollingSupported: ");
        A10.append(A04(67108864));
        A10.append("; importantForAccessibility: ");
        if (i >= 24) {
            z2 = accessibilityNodeInfo.isImportantForAccessibility();
        } else {
            z2 = true;
        }
        A10.append(z2);
        A10.append("; visible: ");
        A10.append(accessibilityNodeInfo.isVisibleToUser());
        A10.append("; isTextSelectable: ");
        if (i >= 33) {
            A04 = C25296Ccy.A01(accessibilityNodeInfo);
        } else {
            A04 = A04(8388608);
        }
        A10.append(A04);
        A10.append("; accessibilityDataSensitive: ");
        if (i >= 34) {
            A042 = C26158CtU.A04(accessibilityNodeInfo);
        } else {
            A042 = A04(64);
        }
        A10.append(A042);
        A10.append("; [");
        List A08 = A08();
        for (int i2 = 0; i2 < A08.size(); i2++) {
            C26137Ct0 ct0 = (C26137Ct0) A08.get(i2);
            String A012 = A01(((AccessibilityNodeInfo.AccessibilityAction) ct0.A03).getId());
            if (A012.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) ct0.A03).getLabel() != null) {
                A012 = ((AccessibilityNodeInfo.AccessibilityAction) ct0.A03).getLabel().toString();
            }
            A10.append(A012);
            if (i2 != AnonymousClass3MX.A02(A08, 1)) {
                A10.append(", ");
            }
        }
        return AnonymousClass000.A0z(A10);
    }
}
