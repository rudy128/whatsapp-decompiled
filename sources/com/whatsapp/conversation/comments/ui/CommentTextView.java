package com.whatsapp.conversation.comments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass11S;
import X.AnonymousClass126;
import X.AnonymousClass1CJ;
import X.AnonymousClass1EG;
import X.AnonymousClass1M9;
import X.AnonymousClass1Y1;
import X.AnonymousClass1Y5;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4RR;
import X.AnonymousClass4U6;
import X.AnonymousClass4VN;
import X.C000200d;
import X.C18010vc;
import X.C18070vi;
import X.C24901Mc;
import X.C25181Nf;
import X.C25807CmK;
import X.C26302CxJ;
import X.C27691Xc;
import X.C28931bI;
import X.C43251zV;
import X.C53542ch;
import X.C63752td;
import X.C72453Mb;
import X.C72463Mc;
import X.C72483Me;
import X.C74633c7;
import X.C94454ke;
import X.C95874mw;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

public final class CommentTextView extends TextEmojiLabel {
    public int A00;
    public AnonymousClass11S A01;
    public AnonymousClass1M9 A02;
    public AnonymousClass4VN A03;
    public AnonymousClass4RR A04;
    public AnonymousClass1CJ A05;
    public C25181Nf A06;
    public AnonymousClass126 A07;
    public C24901Mc A08;
    public C28931bI A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass206 A0F;
    public boolean A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A0I();
        this.A00 = 1;
    }

    public final void A0T(AnonymousClass4RR r20, AnonymousClass206 r21, C28931bI r22) {
        AnonymousClass205 r2;
        AnonymousClass4U6 r4;
        AnonymousClass4RR r3;
        C25807CmK cmK;
        int charCount;
        AnonymousClass206 r1 = r21;
        AnonymousClass205 r32 = r1.A0v;
        AnonymousClass206 r23 = this.A0F;
        if (r23 != null) {
            r2 = r23.A0v;
        } else {
            r2 = null;
        }
        if (!C18070vi.A18(r32, r2)) {
            this.A00 = 1;
            C72453Mb.A1M(this.A09);
        }
        this.A04 = r20;
        this.A09 = r22;
        this.A0F = r1;
        String A0P = r1.A0P();
        if (A0P == null) {
            A0P = "";
        }
        C63752td r33 = (C63752td) getConversationRowUtils().get();
        C95874mw r14 = new C95874mw(this.A00, 768);
        float A012 = getConversationFont().A01(AnonymousClass3Ma.A06(this), getResources());
        int i = r1.A0u;
        Context context = getContext();
        if (A012 > 0.0f) {
            setTextSize(A012);
        }
        String charSequence = AnonymousClass1EG.A02(A0P).toString();
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(charSequence);
        C43251zV.A00(context, getPaint(), r14, r33.A02, A092, 1.3f);
        int i2 = r14.A04;
        if (i2 <= 0 || i2 >= A092.length() || i == 78 || (charCount = (Character.charCount(charSequence.codePointAt(i2 - 1)) + i2) - 1) == A092.length()) {
            r4 = new AnonymousClass4U6(A092, i2, false);
        } else {
            A092.delete(charCount, A092.length());
            A092.append("... ");
            if (context != null) {
                SpannableStringBuilder A093 = AnonymousClass3MW.A09(context.getString(2131894929));
                A093.setSpan(new C74633c7(getContext(), this, r1), 0, A093.length(), 18);
                A092.append(A093);
            }
            r4 = new AnonymousClass4U6(A092, i2, true);
        }
        C53542ch r6 = r33.A04;
        C18070vi.A0d(charSequence, 2);
        r6.A00.A0N(12655);
        if (context != null) {
            int A002 = AnonymousClass3Ma.A00(context, 2130970892, 2131102330);
            int A003 = AnonymousClass3Ma.A00(context, 2130970132, 2131101250);
            if (AnonymousClass000.A0Y(this) != null) {
                cmK = new C25807CmK(A002, A003, AnonymousClass000.A0Y(this).getDimensionPixelSize(2131169446), false, false, false, false, false);
            } else {
                cmK = new C25807CmK(A002, A003, 0, false, false, false, false, false);
            }
            AnonymousClass11C r62 = r33.A00;
            C18010vc r5 = r33.A05;
            TextPaint paint = getPaint();
            C26302CxJ.A05(getContext(), SpannableStringBuilder.valueOf(A092), paint, r33.A03, cmK, A092, C26302CxJ.A00(r62, r5));
        }
        boolean z = r4.A02;
        if (z) {
            AnonymousClass1Y5.A0C(this, getSystemServices(), getAbProps());
            setAutoLinkMask(0);
            setLinksClickable(false);
            setFocusable(false);
            setClickable(false);
            setLongClickable(false);
        }
        SpannableStringBuilder spannableStringBuilder = r4.A01;
        setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (((C63752td) getConversationRowUtils().get()).A04(r1) && (r3 = this.A04) != null) {
            r3.A00(this, new C94454ke(this, r1, z), r1, spannableStringBuilder);
        }
    }

    public final void setChatsCache(AnonymousClass1CJ r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setContactManager(AnonymousClass1M9 r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setConversationContactManager(C25181Nf r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setConversationFont(AnonymousClass4VN r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setConversationRowUtils(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public final void setGroupChatManager(AnonymousClass126 r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setGroupLinkHelper(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setLinkifierUtils(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0C = r2;
    }

    public final void setMeManager(AnonymousClass11S r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setPhoneLinkHelper(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0D = r2;
    }

    public final void setSpamManager(C24901Mc r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setSuspiciousLinkHelper(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0E = r2;
    }

    public void A0I() {
        if (!this.A0G) {
            this.A0G = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r2 = A0O.A10;
            C72483Me.A0s(r2, this);
            this.A02 = AnonymousClass3Ma.A0f(r2);
            AnonymousClass10G r3 = r2.A00;
            this.A01 = C72463Mc.A0c(r3);
            this.A03 = AnonymousClass3Ma.A0r(r2);
            this.A05 = AnonymousClass3Ma.A0d(r2);
            this.A02 = AnonymousClass10E.A4z(r2);
            this.A06 = AnonymousClass3MZ.A0m(r2);
            this.A03 = C72453Mb.A0i(r2);
            this.A0A = C000200d.A00(r3.A8O);
            this.A07 = AnonymousClass3MY.A0X(r2);
            this.A0B = C000200d.A00(A0O.A0P);
            this.A0C = C000200d.A00(r2.A5j);
            this.A01 = AnonymousClass10E.A17(r2);
            this.A0D = C000200d.A00(A0O.A0W);
            this.A08 = AnonymousClass3Ma.A0u(r2);
            this.A0E = C000200d.A00(A0O.A0h);
        }
    }

    public final AnonymousClass4RR getAsyncLinkifier() {
        return this.A04;
    }

    public final AnonymousClass1CJ getChatsCache() {
        AnonymousClass1CJ r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1I();
        throw null;
    }

    public final AnonymousClass1M9 getContactManager() {
        AnonymousClass1M9 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactManager");
        throw null;
    }

    public final C25181Nf getConversationContactManager() {
        C25181Nf r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("conversationContactManager");
        throw null;
    }

    public final AnonymousClass4VN getConversationFont() {
        AnonymousClass4VN r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("conversationFont");
        throw null;
    }

    public final AnonymousClass00H getConversationRowUtils() {
        AnonymousClass00H r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("conversationRowUtils");
        throw null;
    }

    public final AnonymousClass206 getFMessage() {
        return this.A0F;
    }

    public final AnonymousClass126 getGroupChatManager() {
        AnonymousClass126 r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupChatManager");
        throw null;
    }

    public final AnonymousClass00H getGroupLinkHelper() {
        AnonymousClass00H r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupLinkHelper");
        throw null;
    }

    public final AnonymousClass00H getLinkifierUtils() {
        AnonymousClass00H r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkifierUtils");
        throw null;
    }

    public final AnonymousClass11S getMeManager() {
        AnonymousClass11S r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1D();
        throw null;
    }

    public final int getPageLimit() {
        return this.A00;
    }

    public final AnonymousClass00H getPhoneLinkHelper() {
        AnonymousClass00H r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("phoneLinkHelper");
        throw null;
    }

    public final C24901Mc getSpamManager() {
        C24901Mc r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("spamManager");
        throw null;
    }

    public final AnonymousClass00H getSuspiciousLinkHelper() {
        AnonymousClass00H r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("suspiciousLinkHelper");
        throw null;
    }

    public final C28931bI getSuspiciousLinkViewStub() {
        return this.A09;
    }

    public final void setAsyncLinkifier(AnonymousClass4RR r1) {
        this.A04 = r1;
    }

    public final void setFMessage(AnonymousClass206 r1) {
        this.A0F = r1;
    }

    public final void setPageLimit(int i) {
        this.A00 = i;
    }

    public final void setSuspiciousLinkViewStub(C28931bI r1) {
        this.A09 = r1;
    }

    public CommentTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A0I();
    }

    public /* synthetic */ CommentTextView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }
}
