package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;

/* renamed from: X.3tP  reason: invalid class name and case insensitive filesystem */
public final class C78713tP extends AnonymousClass3uL {
    public boolean A00;
    public final TextView A01;
    public final ConversationRowVideo$RowVideoView A02 = ((ConversationRowVideo$RowVideoView) AnonymousClass1HF.A06(this, 2131436123));
    public final View A03;
    public final View A04;
    public final TextView A05 = C17880vN.A0E(this, 2131429541);
    public final AnonymousClass3M2 A06 = new C98124qc(this, 1);
    public final C28931bI A07;
    public final C28931bI A08;

    public void A1u() {
        A00(false);
        AnonymousClass3uP.A0h(this, false);
    }

    public boolean A2r() {
        return true;
    }

    private void A00(boolean z) {
        String A022;
        AnonymousClass21V r2 = (AnonymousClass21V) this.A0I;
        C62572rc r8 = r2.A02;
        C17960vV.A07(r8);
        if (z) {
            this.A05.setTag(Collections.singletonList(r2));
        }
        TextView textView = this.A01;
        textView.setVisibility(8);
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A02;
        conversationRowVideo$RowVideoView.setKeepRatio(this.A0V);
        conversationRowVideo$RowVideoView.setInAlbum(this.A0V);
        conversationRowVideo$RowVideoView.setFullWidth(this.A0l.Bew(this.A0I));
        conversationRowVideo$RowVideoView.setPortraitPreviewEnabled(A2q());
        AnonymousClass1Xr.A04(conversationRowVideo$RowVideoView, AnonymousClass4W0.A01(r2));
        AnonymousClass1Xr.A04(this.A0H, AnonymousClass4W0.A00(r2));
        C28931bI r3 = this.A1V;
        if (r3 != null) {
            View A023 = r3.A02();
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("view-count-transition-");
            AnonymousClass1Xr.A04(A023, C17890vO.A0V(r2.A0v, A10));
        }
        ImageView imageView = this.A0D;
        if (imageView != null) {
            AnonymousClass1Xr.A04(imageView, AnonymousClass3uL.A0O(r2));
        }
        if (this.A0V) {
            int A002 = (int) (C72463Mc.A00(getContext()) * 83.333336f);
            int A003 = C32021gV.A00(r2, A002);
            if (A003 <= 0) {
                A003 = (A002 * 9) / 16;
            }
            conversationRowVideo$RowVideoView.A03(A002, A003, true);
        }
        if (AnonymousClass25A.A11(getFMessage())) {
            View view = this.A03;
            C28931bI r11 = this.A08;
            C28931bI r12 = this.A07;
            TextView textView2 = this.A05;
            AnonymousClass3uL.A0P(view, textView2, r11, r12, true, !z);
            conversationRowVideo$RowVideoView.setVisibility(0);
            AnonymousClass3MY.A0w(getContext(), conversationRowVideo$RowVideoView, 2131897859);
            conversationRowVideo$RowVideoView.setOnClickListener((View.OnClickListener) null);
            C38471rL r5 = this.A0C;
            textView2.setOnClickListener(r5);
            r11.A05(r5);
        } else if (C79103uS.A1L(this)) {
            conversationRowVideo$RowVideoView.setVisibility(0);
            View view2 = this.A03;
            C28931bI r52 = this.A08;
            C28931bI r9 = this.A07;
            TextView textView3 = this.A05;
            AnonymousClass3uL.A0P(view2, textView3, r52, r9, false, false);
            textView3.setVisibility(8);
            r9.A04(0);
            ((ImageView) r9.A02()).setImageResource(2131232397);
            AnonymousClass3MY.A0w(getContext(), r9.A02(), 2131894629);
            conversationRowVideo$RowVideoView.setContentDescription(getContext().getString(2131897841, new Object[]{C64052u8.A02(this.A0D, r2.A0D, 0)}));
            C38471rL r53 = this.A0F;
            r9.A05(r53);
            textView3.setOnClickListener(r53);
            conversationRowVideo$RowVideoView.setOnClickListener(r53);
            if (A2s(r2)) {
                A1s();
            }
        } else {
            TextView textView4 = this.A05;
            A2E(textView4, (Integer) null, Collections.singletonList(r2), r2.A01);
            textView4.setCompoundDrawablesWithIntrinsicBounds(2131231868, 0, 0, 0);
            C38471rL r54 = this.A0D;
            textView4.setOnClickListener(r54);
            conversationRowVideo$RowVideoView.setOnClickListener(r54);
            AnonymousClass3MY.A0w(getContext(), conversationRowVideo$RowVideoView, 2131887592);
            textView4.setVisibility(0);
            C28931bI r122 = this.A07;
            r122.A04(8);
            AnonymousClass3uL.A0P(this.A03, textView4, this.A08, r122, false, !z);
        }
        A1y();
        AnonymousClass3uP.A0W(conversationRowVideo$RowVideoView, this);
        conversationRowVideo$RowVideoView.A04 = this.A09.BS0(AnonymousClass00R.A01, 2, false);
        this.A1S.A0D(conversationRowVideo$RowVideoView, r2, this.A06);
        if (r2.A0D == 0) {
            r2.A0D = C26511Sk.A03(r8.A0G);
        }
        int i = r2.A0D;
        C18000vb r7 = this.A0D;
        if (i != 0) {
            A022 = BE7.A0j(r7, r2.A0D);
        } else {
            A022 = C88584aA.A02(r7, r2.A01);
        }
        textView.setText(A022);
        textView.setVisibility(0);
        AnonymousClass206 r6 = this.A0I;
        int i2 = 2131232596;
        if (C63652tT.A00(this.A0F, (C139506yx) this.A2W.get(), r6)) {
            i2 = 2131231961;
        }
        Resources resources = getResources();
        AnonymousClass206 r62 = this.A0I;
        int i3 = 2131166313;
        if (C63652tT.A00(this.A0F, (C139506yx) this.A2W.get(), r62)) {
            i3 = 2131166249;
        }
        C72463Mc.A14(textView, resources.getDimensionPixelSize(i3), textView.getPaddingTop());
        if (AnonymousClass3MY.A1b(this.A0D)) {
            textView.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, AnonymousClass3MZ.A0B(this, i2), (Drawable) null);
        }
        A2m(this.A04, getFMessage().A18());
        A2P(r2);
        A2N(r2);
    }

    public void A1M() {
        if (!this.A00) {
            this.A00 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r4 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r4, A0O, this);
            AnonymousClass10G r2 = r4.A00;
            AnonymousClass3uQ.A16(r2, this);
            AnonymousClass3uQ.A0w(A0n, r4, r2, this);
            AnonymousClass3uQ.A12(r4, r2, this);
            AnonymousClass3uQ.A0y(A0n, r4, this, BE8.A0d(r4));
            AnonymousClass3uQ.A13(r4, r2, this, r4.ABq);
            AnonymousClass3uQ.A0x(A0n, r4, r2, this, r4.AIy);
            C19890zB r1 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A11(r4, r2, this);
            AnonymousClass3uQ.A15(r4, this);
            AnonymousClass3uQ.A0s(r1, A0n, r4, r2, this);
            AnonymousClass3uQ.A0u(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A0t(r1, A0n, r4, A0O, this);
            AnonymousClass3uQ.A10(r4, r2, this);
            AnonymousClass3uQ.A0z(r4, r2, A0O, this, AnonymousClass3uQ.A0o(r4));
            AnonymousClass3tU.A08(r1, r4, r2, this);
        }
    }

    public boolean A1X() {
        return C79103uS.A1K(this, this.A0I, this.A1h);
    }

    public void A1y() {
        C28931bI r2 = this.A08;
        C32861hs r0 = this.A05;
        C17960vV.A07(r0);
        A2j(r2, C88564a8.A01(r0, (AnonymousClass21V) this.A0I, r2));
    }

    public void A20() {
        boolean z;
        if (this.A03 == null || AnonymousClass74O.A0O(getContext(), this.A03)) {
            AnonymousClass21V r4 = (AnonymousClass21V) this.A0I;
            C62572rc r3 = r4.A02;
            C17960vV.A07(r3);
            if (r3.A0V) {
                int i = 1;
                if (r3.A07 == 1) {
                    this.A0S.A06(2131890637, 1);
                    return;
                }
                File file = r3.A0G;
                if (file != null) {
                    z = C108975cc.A1M(Uri.fromFile(file).getPath());
                } else {
                    z = false;
                }
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("viewmessage/ from_me:");
                AnonymousClass205 r9 = r4.A0v;
                A10.append(r9.A02);
                A10.append(" type:");
                A10.append(r4.A0u);
                A10.append(" url:");
                A10.append(C137256vA.A00(r4.A07));
                A10.append(" file:");
                A10.append(r3.A0G);
                A10.append(" progress:");
                A10.append(r3.A0C);
                A10.append(" transferred:");
                A10.append(r3.A0V);
                A10.append(" transferring:");
                A10.append(r3.A0f);
                A10.append(" fileSize:");
                A10.append(r3.A0A);
                A10.append(" media_size:");
                A10.append(r4.A01);
                A10.append(" timestamp:");
                C17890vO.A16(A10, r4.A0I);
                if (!z) {
                    Log.w("viewmessage/ no file");
                    if (A2p()) {
                        return;
                    }
                    if (this.A0l.CLq()) {
                        AnonymousClass1FU A0O = C72473Md.A0O(this);
                        if (A0O != null) {
                            ((C139956zi) this.A0O.get()).A03(A0O);
                            return;
                        }
                        return;
                    }
                    getContext().startActivity(AnonymousClass1LU.A0b(getContext(), r9.A00, r9.hashCode()));
                    return;
                }
                boolean CLq = this.A0l.CLq();
                if (CLq) {
                    i = 3;
                }
                AnonymousClass1BI r8 = r9.A00;
                if (C22971Dz.A0V(r8)) {
                    C18030ve r1 = this.A0F;
                    C18040vf r2 = C18040vf.A02;
                    if (C18020vd.A05(r2, r1, 7170) || C18020vd.A05(r2, this.A0F, 8890)) {
                        i = 6;
                    }
                }
                Context context = getContext();
                C17960vV.A07(r8);
                Intent A002 = AnonymousClass6WZ.A00(context, (AnonymousClass77F) null, r8, r9, 0, 1, -1, 0, -1, i, false, false, AnonymousClass000.A1W(C88404Zo.A01(getContext())), CLq, false);
                C18030ve r12 = this.A0F;
                Context context2 = getContext();
                ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A02;
                AnonymousClass745.A09(context2, A002, conversationRowVideo$RowVideoView, r12);
                AnonymousClass745.A08(getContext(), A002, conversationRowVideo$RowVideoView, new AnonymousClass4ZR(getContext()), AnonymousClass4W0.A01(r4));
            }
        }
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A00(A1Z);
        }
    }

    public boolean A2a() {
        return TextUtils.isEmpty(((AnonymousClass21V) this.A0I).A18());
    }

    public AnonymousClass21Y getFMessage() {
        return (AnonymousClass21Y) ((AnonymousClass21V) this.A0I);
    }

    public int getMainChildMaxWidth() {
        if (this.A0l.Bew(this.A0I)) {
            return 0;
        }
        return C88264Yz.A01(getContext(), 72);
    }

    public int getOutgoingLayoutId() {
        throw AnonymousClass000.A0n("this row type does not support outgoing messages");
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof AnonymousClass21Y);
        super.setFMessage(r2);
    }

    public C78713tP(Context context, C108875cR r6, AnonymousClass21Y r7) {
        super(context, r6, r7);
        A1M();
        C28931bI A0s = C72453Mb.A0s(this, 2131434181);
        this.A08 = A0s;
        this.A01 = C17880vN.A0E(this, 2131431625);
        this.A07 = C72453Mb.A0s(this, 2131428820);
        this.A03 = findViewById(2131429544);
        this.A04 = findViewById(2131436057);
        A0s.A07(new C98244qo(5));
        A00(true);
    }

    public boolean A1V() {
        if (!C79103uS.A1L(this) || !this.A0l.CMI()) {
            return false;
        }
        return true;
    }

    public boolean A1Y() {
        return A1f();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public int getCenteredLayoutId() {
        return 2131624855;
    }

    public int getIncomingLayoutId() {
        return 2131624855;
    }
}
