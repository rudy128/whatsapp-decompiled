package com.whatsapp.mentions;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11T;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E2;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1IZ;
import X.AnonymousClass1MZ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3Rn;
import X.AnonymousClass3UN;
import X.AnonymousClass49G;
import X.AnonymousClass4aJ;
import X.AnonymousClass5Y5;
import X.AnonymousClass5Y6;
import X.AnonymousClass5Y7;
import X.AnonymousClass5a8;
import X.AnonymousClass5a9;
import X.C138836xm;
import X.C1408073d;
import X.C17880vN;
import X.C17900vP;
import X.C17960vV;
import X.C18010vc;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C19620yd;
import X.C19880zA;
import X.C199410f;
import X.C22951Dx;
import X.C22971Dz;
import X.C25731Pk;
import X.C32091gc;
import X.C32951i1;
import X.C40061u6;
import X.C42701yb;
import X.C42751yg;
import X.C43361zg;
import X.C63312sr;
import X.C70503Bi;
import X.C72763Nk;
import X.C72773Nl;
import X.C72783Nm;
import X.C72903Ny;
import X.C77893rh;
import X.C77923ro;
import X.C89584ch;
import X.C89624cl;
import X.C91354fY;
import X.C92954iC;
import X.C96834oU;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MentionableEntry extends C77893rh implements AnonymousClass5a8, AnonymousClass5Y5 {
    public static final String[] A0R = C138836xm.A01;
    public static final String[] A0S = C138836xm.A02;
    public int A00;
    public int A01;
    public int A02;
    public Bundle A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public C19880zA A07;
    public C32951i1 A08;
    public AnonymousClass1CJ A09;
    public AnonymousClass1MZ A0A;
    public AnonymousClass1BI A0B;
    public AnonymousClass5a8 A0C;
    public MentionPickerView A0D;
    public C72773Nl A0E;
    public AnonymousClass5a9 A0F;
    public AnonymousClass5Y7 A0G;
    public C32091gc A0H;
    public C18010vc A0I;
    public AnonymousClass00H A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public AnonymousClass5Y6 A0N;
    public boolean A0O = true;
    public final C40061u6 A0P = new C40061u6();
    public final TextWatcher A0Q = new C89584ch(this);

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r1 != '_') goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(android.text.Editable r7, com.whatsapp.mentions.MentionableEntry r8) {
        /*
            r0 = 0
            int r3 = r8.A06(r7, r0)
            int r2 = r3 + 1
            int r1 = r8.getSelectionEnd()
            java.lang.Class<X.3Nm> r0 = X.C72783Nm.class
            java.lang.Object[] r6 = r7.getSpans(r2, r1, r0)
            X.3Nm[] r6 = (X.C72783Nm[]) r6
            int r5 = r6.length
            if (r5 <= 0) goto L_0x0032
            r4 = 0
            r3 = 0
        L_0x0018:
            r2 = r6[r4]
            int r1 = r7.getSpanEnd(r2)
            if (r1 <= r3) goto L_0x002a
            int r0 = r8.getSelectionEnd()
            if (r1 > r0) goto L_0x002a
            int r3 = r7.getSpanEnd(r2)
        L_0x002a:
            int r4 = r4 + 1
            if (r4 < r5) goto L_0x0018
            int r3 = r8.A06(r7, r3)
        L_0x0032:
            if (r3 < 0) goto L_0x0047
            r0 = 1
            if (r3 == 0) goto L_0x0051
            int r0 = r3 - r0
            char r1 = r7.charAt(r0)
            boolean r0 = java.lang.Character.isLetterOrDigit(r1)
            if (r0 != 0) goto L_0x0047
            r0 = 95
            if (r1 != r0) goto L_0x0051
        L_0x0047:
            X.3Nl r0 = r8.A0E
            A0E(r0, r8)
            r0 = 0
            r8.A0F(r0)
        L_0x0050:
            return
        L_0x0051:
            java.lang.String r2 = r7.toString()
            int r1 = r3 + 1
            int r0 = r8.getSelectionEnd()
            java.lang.String r0 = r2.substring(r1, r0)
            r8.A0F(r0)
            boolean r0 = r8.A0M
            if (r0 == 0) goto L_0x0050
            r8.A0B(r7, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mentions.MentionableEntry.A0C(android.text.Editable, com.whatsapp.mentions.MentionableEntry):void");
    }

    public static int A08(Editable editable, int i) {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, editable.getSpans(i, i, C72783Nm.class));
        Collections.addAll(linkedList, editable.getSpans(i, i, C72763Nk.class));
        for (Object next : linkedList) {
            int spanStart = editable.getSpanStart(next);
            if (next instanceof C72783Nm) {
                spanStart--;
            }
            int spanEnd = editable.getSpanEnd(next);
            int i2 = i;
            i = spanEnd;
            if (i2 <= (spanStart + spanEnd) / 2) {
                i = spanStart;
            }
        }
        return i;
    }

    private void A0A() {
        if (Build.VERSION.SDK_INT == 34 && "xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            setBreakStrategy(0);
        }
    }

    private void A0B(Editable editable, int i) {
        int i2 = i + 1;
        if (((C72773Nl[]) editable.getSpans(i, i2, C72773Nl.class)).length < 1) {
            A0E(this.A0E, this);
            C72773Nl r1 = new C72773Nl(this.A00, false);
            this.A0E = r1;
            editable.setSpan(r1, i, i2, 33);
        }
    }

    public static void A0E(ForegroundColorSpan foregroundColorSpan, MentionableEntry mentionableEntry) {
        if (foregroundColorSpan != null) {
            mentionableEntry.getText().removeSpan(foregroundColorSpan);
        }
    }

    private void A0F(String str) {
        if (this.A06 == null) {
            return;
        }
        if (str != null) {
            MentionPickerView mentionPickerView = this.A0D;
            if (mentionPickerView == null) {
                MentionPickerView mentionPickerView2 = (MentionPickerView) AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(this), this.A06, 2131626012);
                this.A0D = mentionPickerView2;
                this.A06.addView(mentionPickerView2);
                if (this.A0L) {
                    this.A03.putBoolean("ARG_INCLUDE_BOT_CONTACTS", ((C25731Pk) this.A0J.get()).A01(this.A0B));
                }
                this.A0D.setup(this, this.A03);
                View view = this.A05;
                if (view != null) {
                    this.A0D.setAnchorWidthView(view);
                }
                View view2 = this.A04;
                if (view2 != null) {
                    this.A0D.A01 = view2;
                }
                mentionPickerView = this.A0D;
                mentionPickerView.A0H = this;
            }
            if (mentionPickerView.A0O) {
                mentionPickerView.A0J.getFilter().filter(str);
            } else {
                mentionPickerView.A0K.CGD(new AnonymousClass49G(mentionPickerView.A0C, mentionPickerView, C17880vN.A0c(mentionPickerView.A0M), str), mentionPickerView.A0G);
            }
            mentionPickerView.A0N = true;
            return;
        }
        MentionPickerView mentionPickerView3 = this.A0D;
        if (mentionPickerView3 != null) {
            mentionPickerView3.A0J.getFilter().filter((CharSequence) null);
            mentionPickerView3.A0N = false;
            mentionPickerView3.A0Q = false;
        }
    }

    public void A0L() {
        removeTextChangedListener(this.A0Q);
        setText((String) null);
        setCursorVisible(false);
    }

    public void A0M(ViewGroup viewGroup, AnonymousClass1BI r6, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0B = r6;
        addTextChangedListener(this.A0Q);
        Context context = getContext();
        Context context2 = getContext();
        int i = 2130971981;
        int i2 = 2131101293;
        if (z) {
            i = 2130970300;
            i2 = 2131101294;
        }
        this.A01 = AnonymousClass3MZ.A02(context2, context, i, i2);
        Context context3 = getContext();
        Context context4 = getContext();
        int i3 = 2130970492;
        int i4 = 2131101857;
        if (z) {
            i3 = 2130970493;
            i4 = 2131101858;
        }
        this.A00 = AnonymousClass3MZ.A02(context4, context3, i3, i4);
        A0C(getText(), this);
        this.A06 = viewGroup;
        Bundle A0D2 = C17880vN.A0D();
        this.A03 = A0D2;
        A0D2.putString("ARG_JID", C22971Dz.A06(r6));
        this.A03.putBoolean("ARG_IS_DARK_THEME", z);
        this.A03.putBoolean("ARG_HIDE_END_DIVIDER", z2);
        this.A03.putBoolean("ARG_WITH_BACKGROUND", z3);
        this.A0L = z4;
    }

    public void A0N(C42751yg r13, AnonymousClass1E7 r14) {
        AnonymousClass1BI r4;
        if (r14 != null && (r4 = r14.A0J) != null) {
            Editable text = getText();
            if (!this.A0K) {
                this.A02 = getInputType();
                this.A0K = true;
                setInputType(147457);
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                if (!(selectionStart == -1 || selectionEnd == -1)) {
                    setSelection(selectionStart, selectionEnd);
                }
            }
            C70503Bi r10 = new C70503Bi(r4, r13.A01);
            C32091gc r0 = this.A0H;
            C17960vV.A07(r0);
            String A032 = r0.A03(r10);
            int min = Math.min(A06(text, 0), getSelectionStart());
            if (min < 0) {
                min = getSelectionStart();
            }
            int i = min + 1;
            String A1H = AnonymousClass001.A1H("@", A032, AnonymousClass000.A10());
            A0E(this.A0E, this);
            this.A0E = null;
            text.replace(min, getSelectionEnd(), AnonymousClass000.A0y(" ", AnonymousClass000.A11(A1H)));
            C72773Nl r42 = new C72773Nl(this.A00, true);
            text.setSpan(r42, min, i, 33);
            C72783Nm r1 = new C72783Nm(r42, AnonymousClass4aJ.A00(r10), this.A01);
            text.setSpan(r1, i, A032.length() + i, 33);
            setSelection(0);
            setSelection(text.getSpanEnd(r1) + 1);
            A0F((String) null);
            if (this.A0K) {
                this.A0K = false;
                setInputType(this.A02);
                int selectionStart2 = getSelectionStart();
                int selectionEnd2 = getSelectionEnd();
                if (!(selectionStart2 == -1 || selectionEnd2 == -1)) {
                    setSelection(selectionStart2, selectionEnd2);
                }
            }
            AnonymousClass5Y7 r02 = this.A0G;
            if (r02 != null) {
                C96834oU r03 = (C96834oU) r02;
                AnonymousClass3UN r2 = r03.A01;
                C92954iC r12 = r03.A00;
                C18070vi.A0d(r12, 1);
                UserJid botMention = r12.A05.getBotMention();
                if (!C18070vi.A18(botMention, r2.A01)) {
                    r2.A01 = botMention;
                    AnonymousClass10I r15 = r2.A06;
                    Runnable runnable = r2.A07;
                    r15.CEz(runnable);
                    r15.CGF(runnable);
                }
            }
        }
    }

    public void Bo6(boolean z) {
        int A062;
        this.A0M = z;
        AnonymousClass5a8 r0 = this.A0C;
        if (r0 != null) {
            r0.Bo6(z);
        }
        if (!z || (A062 = A06(getEditableText(), 0)) < 0) {
            A0E(this.A0E, this);
            this.A0E = null;
            return;
        }
        A0B(getEditableText(), A062);
    }

    public UserJid getBotMention() {
        C25731Pk r2 = (C25731Pk) this.A07.A04();
        if (r2 == null || !r2.A00() || !((C1408073d) r2.A03.get()).A09()) {
            return null;
        }
        return r2.A00.A03(getMentions());
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.A0O) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C72903Ny r6 = (C72903Ny) parcelable;
        super.onRestoreInstanceState(r6.getSuperState());
        String str = r6.A00;
        if (!TextUtils.isEmpty(str)) {
            String str2 = r6.A01;
            if (!TextUtils.isEmpty(str2)) {
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                C17960vV.A07(str2);
                setMentionableText(str2, AnonymousClass4aJ.A03(str));
                setSelection(selectionStart, selectionEnd);
            }
        }
    }

    public void setInputEnabled(boolean z) {
        if (this.A0O != z) {
            this.A0O = z;
            if (z) {
                setFocusableInTouchMode(true);
            } else {
                setFocusable(false);
            }
        }
    }

    public void setMentionableText(String str, Collection collection) {
        if (collection == null || collection.isEmpty()) {
            setText(str);
            return;
        }
        if (this.A0M) {
            A0F((String) null);
        }
        A0E(this.A0E, this);
        this.A0E = null;
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(str);
        A0D(A092, collection, true);
        setText(A092);
    }

    public MentionableEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0A();
    }

    private int A06(Editable editable, int i) {
        int lastIndexOf = editable.toString().substring(i, getSelectionEnd()).lastIndexOf("@");
        for (C72773Nl r0 : (C72773Nl[]) editable.getSpans(lastIndexOf, lastIndexOf + 1, C72773Nl.class)) {
            if (r0.A00) {
                return -1;
            }
        }
        return lastIndexOf;
    }

    private String A09(int i, int i2) {
        Editable newEditable = Editable.Factory.getInstance().newEditable(getText().subSequence(i, i2));
        for (C72783Nm r3 : (C72783Nm[]) newEditable.getSpans(0, newEditable.length(), C72783Nm.class)) {
            newEditable.replace(newEditable.getSpanStart(r3) - 1, newEditable.getSpanEnd(r3), r3.A01);
        }
        return newEditable.toString();
    }

    private void A0D(SpannableStringBuilder spannableStringBuilder, Collection collection, boolean z) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C70503Bi r2 = (C70503Bi) it.next();
            if (r2 != null) {
                C32091gc r0 = this.A0H;
                C17960vV.A07(r0);
                String A032 = r0.A03(r2);
                String A002 = AnonymousClass4aJ.A00(r2);
                int indexOf = TextUtils.indexOf(spannableStringBuilder, A002);
                if (indexOf < 0) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("unable to set mention for ");
                    A10.append(r2);
                    C17900vP.A0Z(spannableStringBuilder, " in ", A10);
                } else {
                    do {
                        spannableStringBuilder.replace(indexOf, A002.length() + indexOf, AnonymousClass001.A1H("@", A032, AnonymousClass000.A10()));
                        if (z) {
                            C72773Nl r4 = new C72773Nl(this.A00, true);
                            int i = indexOf + 1;
                            spannableStringBuilder.setSpan(r4, indexOf, i, 33);
                            spannableStringBuilder.setSpan(new C72783Nm(r4, A002, this.A01), i, A032.length() + i, 33);
                        }
                        indexOf = TextUtils.indexOf(spannableStringBuilder, A002, indexOf + 1);
                    } while (indexOf >= 0);
                }
            }
        }
    }

    public boolean A0O(AnonymousClass1BI r4) {
        if (C22971Dz.A0e(r4)) {
            if (!this.A09.A0R(r4)) {
                return true;
            }
            if (C18020vd.A05(C18040vf.A02, this.A00, 3097)) {
                return true;
            }
        }
        C19880zA r1 = this.A07;
        if (!r1.A07() || !((C25731Pk) r1.A03()).A02(r4)) {
            return false;
        }
        return true;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A0P.A01();
    }

    public List getMentions() {
        AnonymousClass1BI A032;
        HashSet A12 = C17880vN.A12();
        for (C72783Nm r0 : (C72783Nm[]) getText().getSpans(0, AnonymousClass3Ma.A03(this), C72783Nm.class)) {
            String substring = r0.A01.substring(1);
            String str = null;
            if (this.A0A.A0I(this.A0B)) {
                A032 = PhoneUserJid.Companion.A03(substring);
                if (A032 == null || !C42701yb.A01(A032)) {
                    A032 = AnonymousClass1E2.A01.A02(substring);
                }
            } else {
                try {
                    C22951Dx r02 = PhoneUserJid.Companion;
                    A032 = C22951Dx.A01(substring);
                } catch (AnonymousClass11T unused) {
                    A032 = GroupJid.Companion.A03(substring);
                    if (A032 != null) {
                        str = this.A0H.A03(new C70503Bi(A032, (String) null));
                    }
                }
            }
            if (A032 != null) {
                A12.add(new C70503Bi(A032, str));
            }
        }
        return C17880vN.A10(A12);
    }

    public String getStringText() {
        return A09(0, AnonymousClass3Ma.A03(this));
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArr;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (C22971Dz.A0S(this.A0B)) {
            strArr = A0S;
        } else {
            strArr = A0R;
        }
        if (onCreateInputConnection == null) {
            return onCreateInputConnection;
        }
        EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
        return InputConnectionCompat.createWrapper(onCreateInputConnection, editorInfo, (InputConnectionCompat.OnCommitContentListener) new C91354fY(this));
    }

    public boolean onPrivateIMECommand(String str, Bundle bundle) {
        return super.onPrivateIMECommand(str, bundle);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        C17960vV.A07(onSaveInstanceState);
        String stringText = getStringText();
        String A012 = AnonymousClass4aJ.A01(getMentions());
        C18070vi.A0d(onSaveInstanceState, 0);
        if (A012 == null || A012.length() == 0) {
            stringText = null;
            A012 = null;
        }
        return new C72903Ny(onSaveInstanceState, stringText, A012);
    }

    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        Editable editableText = getEditableText();
        if (!TextUtils.isEmpty(editableText)) {
            setSelection(A08(editableText, i), A08(editableText, i2));
        }
    }

    public boolean onTextContextMenuItem(int i) {
        int i2;
        CharSequence charSequence;
        C43361zg r0;
        int A032 = AnonymousClass3Ma.A03(this);
        if (isFocused()) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            i2 = Math.max(0, Math.min(selectionStart, selectionEnd));
            A032 = Math.max(0, Math.max(selectionStart, selectionEnd));
        } else {
            i2 = 0;
        }
        AnonymousClass1EC A0i = AnonymousClass3MW.A0i(this.A0B);
        if (i == 16908322) {
            if (A0i != null) {
                AnonymousClass11C r02 = this.A02;
                C17960vV.A07(r02);
                ClipboardManager A092 = r02.A09();
                if (A092 == null) {
                    Log.w("mentionableentry/on-text-context-menu-item cm=null");
                } else {
                    ClipData primaryClip = A092.getPrimaryClip();
                    if (!(primaryClip == null || primaryClip.getItemCount() == 0)) {
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        if (itemAt != null) {
                            charSequence = itemAt.getText();
                        } else {
                            charSequence = "";
                        }
                        SharedPreferences A052 = this.A0I.A05(C19620yd.A09);
                        String string = A052.getString("copied_message", "");
                        String string2 = A052.getString("copied_message_jids", "");
                        String string3 = A052.getString("copied_message_without_mentions", "");
                        if (!TextUtils.isEmpty(charSequence) && TextUtils.equals(charSequence, string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                            ArrayList A033 = AnonymousClass4aJ.A03(string2);
                            AnonymousClass1MZ r03 = this.A0A;
                            C17960vV.A07(r03);
                            C199410f A082 = r03.A08.A0C(A0i).A08();
                            HashSet A12 = C17880vN.A12();
                            AnonymousClass1IZ it = A082.iterator();
                            while (it.hasNext()) {
                                A12.add(((C63312sr) it.next()).A04);
                            }
                            Iterator it2 = this.A0H.A04(A0i).iterator();
                            while (it2.hasNext()) {
                                A12.add(((C70503Bi) it2.next()).A00);
                            }
                            if (A033 == null) {
                                r0 = new C43361zg(Collections.emptyList(), Collections.emptyList());
                            } else {
                                HashSet A122 = C17880vN.A12();
                                HashSet A123 = C17880vN.A12();
                                Iterator it3 = A033.iterator();
                                while (it3.hasNext()) {
                                    C70503Bi r1 = (C70503Bi) it3.next();
                                    if (A12.contains(r1.A00)) {
                                        A122.add(r1);
                                    } else {
                                        A123.add(r1);
                                    }
                                }
                                r0 = new C43361zg(A122, A123);
                            }
                            C17960vV.A07(string3);
                            Collection collection = (Collection) r0.A00;
                            Collection collection2 = (Collection) r0.A01;
                            if (this.A0M) {
                                A0F((String) null);
                            }
                            A0E(this.A0E, this);
                            this.A0E = null;
                            SpannableStringBuilder A093 = AnonymousClass3MW.A09(string3);
                            A0D(A093, collection, true);
                            if (collection2 != null) {
                                A0D(A093, collection2, false);
                            }
                            getText().replace(i2, A032, A093);
                            return true;
                        }
                    }
                }
            }
        } else if (i == 16908320 || i == 16908321) {
            C17880vN.A1E(this.A0I.A05(C19620yd.A09).edit().putString("copied_message_without_mentions", A09(i2, A032)).putString("copied_message", getText().subSequence(i2, A032).toString()), "copied_message_jids", AnonymousClass4aJ.A01(getMentions()));
        }
        return super.onTextContextMenuItem(i);
    }

    public void setKeyboardDismissListener(AnonymousClass5Y6 r1) {
        this.A0N = r1;
    }

    public void setMentionPickerVisibilityChangeListener(AnonymousClass5a8 r1) {
        this.A0C = r1;
    }

    public void setOnCommitContentListener(AnonymousClass5a9 r1) {
        this.A0F = r1;
    }

    public void setOnMentionInsertedListener(AnonymousClass5Y7 r1) {
        this.A0G = r1;
    }

    public void setText(String str) {
        for (C72783Nm r1 : (C72783Nm[]) getText().getSpans(0, AnonymousClass3Ma.A03(this), C72783Nm.class)) {
            A0E(r1.A00, this);
            A0E(r1, this);
        }
        A0E(this.A0E, this);
        this.A0E = null;
        super.setText(str);
    }

    public MentionableEntry(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass3Rn.A05(this);
        setEditableFactory(C77923ro.A06);
        setCustomSelectionActionModeCallback(new C89624cl(this, 3));
        A0G();
        A0A();
    }

    public MentionableEntry(Context context) {
        super(context);
        AnonymousClass3Rn.A05(this);
        setEditableFactory(C77923ro.A06);
        setCustomSelectionActionModeCallback(new C89624cl(this, 3));
        A0G();
        A0A();
    }
}
