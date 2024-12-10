package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1DS;
import X.AnonymousClass1F9;
import X.AnonymousClass1HF;
import X.AnonymousClass1L9;
import X.AnonymousClass1PP;
import X.AnonymousClass1ZG;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass210;
import X.AnonymousClass3MW;
import X.AnonymousClass3uO;
import X.AnonymousClass3uP;
import X.AnonymousClass47H;
import X.AnonymousClass5YN;
import X.C003101k;
import X.C108675c7;
import X.C108875cR;
import X.C18070vi;
import X.C26993DOp;
import X.C27691Xc;
import X.C41761x1;
import X.C441822l;
import X.C72463Mc;
import X.C75863lu;
import X.C78753ta;
import X.C84664Kj;
import X.C94874lK;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class WallpaperMockChatView extends LinearLayout implements AnonymousClass009, C108875cR {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public AnonymousClass11S A05;
    public C78753ta A06;
    public C78753ta A07;
    public AnonymousClass11P A08;
    public AnonymousClass00H A09;
    public AnonymousClass031 A0A;
    public boolean A0B;

    public /* synthetic */ void BC4(Drawable drawable, View view) {
    }

    public /* synthetic */ void BCy(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BCz(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BId() {
    }

    public /* synthetic */ void BLL() {
    }

    public /* synthetic */ void BLe(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C2C(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C2F(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C3D(AnonymousClass206 r1, boolean z) {
    }

    public /* synthetic */ void CH6(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CJr(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void CKg(List list, boolean z) {
    }

    public /* synthetic */ void CMe(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CNC(C441822l r1) {
    }

    public void CND(View view, AnonymousClass206 r2, int i, int i2, boolean z) {
    }

    public /* synthetic */ void CNE(View view, AnonymousClass206 r2, Runnable runnable, int i, int i2, boolean z) {
    }

    public /* synthetic */ void CNF(int i) {
    }

    public /* synthetic */ void COH(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CRK(AnonymousClass206 r1) {
    }

    public /* synthetic */ AnonymousClass5YN getAsyncLabelUpdater() {
        return null;
    }

    public /* synthetic */ void setAnimationNye(AnonymousClass205 r1) {
    }

    public /* synthetic */ void setQuotedMessage(AnonymousClass206 r1) {
    }

    public /* synthetic */ boolean Bcq() {
        return false;
    }

    public /* synthetic */ boolean BfZ() {
        return false;
    }

    public /* synthetic */ boolean Bfy() {
        return false;
    }

    public /* synthetic */ boolean Bgu() {
        return false;
    }

    public /* synthetic */ boolean Bjq() {
        return true;
    }

    public /* synthetic */ boolean CMM() {
        return false;
    }

    public /* synthetic */ boolean CMu() {
        return false;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0A;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public /* synthetic */ int getContainerType() {
        return 0;
    }

    public /* synthetic */ AnonymousClass206 getFirstEverKnownLastMessage() {
        return null;
    }

    public /* synthetic */ AnonymousClass1DS getHasOutgoingMessagesLiveData() {
        return null;
    }

    public /* synthetic */ AnonymousClass1DS getLastMessageLiveData() {
        return null;
    }

    public AnonymousClass3uP getOutgoingRow() {
        return this.A07;
    }

    public /* synthetic */ C41761x1 getPreferredLabel() {
        return null;
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        return null;
    }

    public /* synthetic */ String getSearchText() {
        return null;
    }

    public /* synthetic */ EditText getTextEntryField() {
        return null;
    }

    public WallpaperMockChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0B) {
            this.A0B = true;
            C27691Xc.A13((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    public /* synthetic */ Object BPO(Class cls) {
        return null;
    }

    public /* synthetic */ int BW6(AnonymousClass206 r2) {
        return 1;
    }

    public /* synthetic */ boolean Bfa(AnonymousClass206 r2) {
        return false;
    }

    public /* synthetic */ boolean Bgo(AnonymousClass206 r2) {
        return false;
    }

    public /* synthetic */ boolean CPY(AnonymousClass206 r2) {
        return false;
    }

    public C108675c7 getConversationRowCustomizer() {
        return new C94874lK(getContext());
    }

    public AnonymousClass1F9 getLifecycleOwner() {
        AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(this);
        A002.getClass();
        return A002;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.3uP, X.3ta, X.3uO] */
    /* JADX WARNING: type inference failed for: r0v21, types: [X.3ta, X.3uO] */
    /* JADX WARNING: type inference failed for: r0v37, types: [X.3ta, X.3uO] */
    public void setMessages(String str, String str2, C108875cR r12) {
        Context context = getContext();
        AnonymousClass210 r4 = new AnonymousClass210(new AnonymousClass205((AnonymousClass1BI) null, AnonymousClass1PP.A00(this.A05, this.A08, false), false), AnonymousClass11P.A01(this.A08));
        r4.A0i(str);
        AnonymousClass11P r5 = this.A08;
        AnonymousClass11S r0 = this.A05;
        AnonymousClass210 r6 = new AnonymousClass210(new AnonymousClass205(AnonymousClass11S.A00(r0), AnonymousClass1PP.A00(r0, r5, false), true), AnonymousClass11P.A01(this.A08));
        r6.A0I = AnonymousClass11P.A01(this.A08);
        r6.A0a(5);
        r6.A0i(str2);
        setBackgroundResource(0);
        setOrientation(1);
        C18070vi.A0d(context, 1);
        ? r02 = new AnonymousClass3uO(context, this, r4);
        this.A06 = r02;
        r02.A2W(true);
        this.A06.setEnabled(false);
        C78753ta r1 = this.A06;
        r1.A2i = false;
        this.A00 = AnonymousClass1HF.A06(r1, 2131429812);
        this.A03 = AnonymousClass3MW.A0J(this.A06, 2131432683);
        this.A02 = AnonymousClass3MW.A0J(this.A06, 2131429594);
        if (AnonymousClass1L9.A00(context) instanceof AnonymousClass47H) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130970642, typedValue, true);
            this.A07 = new AnonymousClass3uO(new C003101k(context, typedValue.resourceId), r12, r6);
            C75863lu r13 = new C75863lu(new C26993DOp(context, ((C84664Kj) this.A09.get()).A00));
            this.A07.setBubbleResolver(r13);
            this.A06.setBubbleResolver(r13);
            this.A07.invalidate();
        } else {
            this.A07 = new AnonymousClass3uO(context, r12, r6);
        }
        this.A07.A2W(false);
        this.A07.setEnabled(false);
        C78753ta r03 = this.A07;
        r03.A2i = false;
        this.A01 = AnonymousClass1HF.A06(r03, 2131429812);
        this.A04 = AnonymousClass3MW.A0J(this.A07, 2131432683);
        if (AnonymousClass1L9.A00(context) instanceof AnonymousClass47H) {
            int A012 = AnonymousClass3MW.A01(AnonymousClass000.A0Y(this), 2131165871);
            LinearLayout.LayoutParams A0R = C72463Mc.A0R();
            A0R.setMargins(A012, 0, 0, 0);
            this.A07.setLayoutParams(A0R);
        }
        addView(this.A06);
        addView(this.A07);
    }

    public WallpaperMockChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A0B) {
            this.A0B = true;
            C27691Xc.A13((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    public WallpaperMockChatView(Context context) {
        this(context, (AttributeSet) null);
    }
}
