package com.whatsapp.mediacomposer.ui.caption;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1L2;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C108515bp;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18090vk;
import X.C22971Dz;
import X.C28931bI;
import X.C72453Mb;
import X.C72463Mc;
import X.C98254qp;
import android.content.Context;
import android.graphics.Paint;
import android.text.InputFilter;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.WaEditText;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.status.mentions.StatusMentionsView;
import java.util.List;
import java.util.Set;

public final class CaptionView extends LinearLayout implements AnonymousClass009 {
    public C18000vb A00;
    public AnonymousClass1L2 A01;
    public C18030ve A02;
    public C108515bp A03;
    public AnonymousClass00H A04;
    public AnonymousClass031 A05;
    public CharSequence A06;
    public C18090vk A07;
    public boolean A08;
    public boolean A09;
    public final LinearLayout A0A;
    public final MentionableEntry A0B;
    public final C28931bI A0C;
    public final C28931bI A0D;
    public final C28931bI A0E;
    public final C28931bI A0F;
    public final C28931bI A0G;
    public final C28931bI A0H;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CaptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final int getCaptionTop() {
        int[] iArr = new int[2];
        this.A0B.getLocationInWindow(iArr);
        return iArr[1];
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setCaptionButtonsListener(C108515bp r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setCaptionEditTextView(CharSequence charSequence) {
        C18070vi.A0d(charSequence, 0);
        MentionableEntry mentionableEntry = this.A0B;
        mentionableEntry.setText(charSequence);
        mentionableEntry.setSelection(charSequence.length(), charSequence.length());
        mentionableEntry.setInputEnterAction(0);
        C72453Mb.A1H(mentionableEntry, new InputFilter[1], EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 0);
    }

    public final void setEmojiRichFormatterStaticCaller(AnonymousClass1L2 r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setMediaSharingUserJourneyLogger(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void A00(Set set, C18090vk r5, boolean z) {
        this.A07 = r5;
        MentionableEntry mentionableEntry = this.A0B;
        mentionableEntry.setScrollBarStyle(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
        mentionableEntry.setClickable(true);
        mentionableEntry.setFocusable(true);
        mentionableEntry.setFocusableInTouchMode(true);
        mentionableEntry.setImeOptions(6);
        mentionableEntry.setInputType(147457);
        mentionableEntry.requestFocus();
        mentionableEntry.setCursorVisible(true);
        int i = 0;
        this.A0D.A04(0);
        this.A0C.A04(8);
        C28931bI r0 = this.A0F;
        if (!z) {
            i = 8;
        }
        r0.A04(i);
        if (z) {
            setMentionsViewState(set);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final Paint getCaptionPaint() {
        TextPaint paint = this.A0B.getPaint();
        C18070vi.A0X(paint);
        return paint;
    }

    public final String getCaptionStringText() {
        String stringText = this.A0B.getStringText();
        C18070vi.A0X(stringText);
        return stringText;
    }

    public final CharSequence getCaptionText() {
        CharSequence text = this.A0B.getText();
        if (text == null) {
            text = "";
        }
        return text;
    }

    public final WaEditText getCaptionTextView() {
        return this.A0B;
    }

    public final int getCurrentTextColor() {
        return this.A0B.getCurrentTextColor();
    }

    public final AnonymousClass1L2 getEmojiRichFormatterStaticCaller() {
        AnonymousClass1L2 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiRichFormatterStaticCaller");
        throw null;
    }

    public final AnonymousClass00H getMediaSharingUserJourneyLogger() {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mediaSharingUserJourneyLogger");
        throw null;
    }

    public final MentionableEntry getMentionableEntry() {
        return this.A0B;
    }

    public final List getMentions() {
        return this.A0B.getMentions();
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setAddButtonActivated(boolean z) {
        C28931bI r1 = this.A0C;
        if (r1.A00 != null) {
            r1.A02().setActivated(z);
        }
    }

    public final void setAddButtonClickable(boolean z) {
        C28931bI r1 = this.A0C;
        if (r1.A00 != null) {
            r1.A02().setClickable(z);
        }
    }

    public final void setAddButtonEnabled(boolean z) {
        this.A0C.A09(z);
    }

    public final void setCaptionText(CharSequence charSequence) {
        this.A0B.setText(charSequence);
    }

    public final void setMentionsViewState(Set set) {
        ((StatusMentionsView) this.A0F.A02()).setState(set);
    }

    public final void setViewOnceButtonClickable(boolean z) {
        C28931bI r1 = this.A0G;
        if (r1.A00 != null) {
            r1.A02().setClickable(z);
        }
    }

    public final void setupStatusMentions(AnonymousClass1BI r9, ViewGroup viewGroup, View view) {
        MentionableEntry mentionableEntry = this.A0B;
        AnonymousClass1BI r3 = r9;
        if (mentionableEntry.A0O(r9)) {
            mentionableEntry.A04 = view;
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup != null) {
                mentionableEntry.A0M(viewGroup2, r3, true, false, false, false);
            }
        }
    }

    public final void setHandleEnterKeyPress(boolean z) {
        this.A08 = z;
    }

    public final void setNewLineEnabledForNewsletter(AnonymousClass1BI r3) {
        if (C22971Dz.A0V(r3)) {
            this.A0B.setInputEnterAction(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A02 = AnonymousClass10E.A8r(A0O);
            AnonymousClass10G r1 = A0O.A00;
            this.A01 = C72463Mc.A0c(r1);
            this.A04 = C000200d.A00(r1.ADC);
            this.A00 = AnonymousClass10E.A6Q(A0O);
        }
        View.inflate(getContext(), C18020vd.A05(C18040vf.A02, getAbProps(), 10715) ? 2131625957 : 2131625956, this);
        this.A0B = (MentionableEntry) C18070vi.A05(this, 2131428830);
        this.A0A = (LinearLayout) C18070vi.A05(this, 2131431972);
        this.A0D = C28931bI.A00(this, 2131430328);
        this.A0E = C28931bI.A00(this, 2131431973);
        C28931bI A002 = C28931bI.A00(this, 2131427582);
        C98254qp.A00(A002, this, 33);
        this.A0C = A002;
        C28931bI A003 = C28931bI.A00(this, 2131436806);
        C98254qp.A00(A003, this, 34);
        this.A0G = A003;
        this.A0H = C28931bI.A00(this, 2131436807);
        C28931bI A004 = C28931bI.A00(this, 2131435658);
        C98254qp.A00(A004, this, 35);
        this.A0F = A004;
    }

    public /* synthetic */ CaptionView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CaptionView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
