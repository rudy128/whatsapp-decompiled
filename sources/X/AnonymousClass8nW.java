package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import java.util.Collections;

/* renamed from: X.8nW  reason: invalid class name */
public class AnonymousClass8nW extends AnonymousClass3uP {
    public AnonymousClass1VP A00;
    public AnonymousClass1TD A01;
    public C32481hG A02;
    public AnonymousClass1TA A03;
    public C27081Uq A04;
    public C33231iU A05;
    public AnonymousClass1PP A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public boolean A09;
    public final TextEmojiLabel A0A;
    public final TextEmojiLabel A0B;
    public final TextEmojiLabel A0C;
    public final WaImageView A0D;
    public final C40981vc A0E = new C21051Adh(this, 1);
    public final C28931bI A0F;
    public final C28931bI A0G;
    public final C28931bI A0H;

    public boolean A2Z() {
        return false;
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    private AnonymousClass12O getVoipErrorFragmentBridge() {
        return (AnonymousClass12O) ((C219117w) this.A1s.get()).A01(AnonymousClass12O.class);
    }

    private void setupActionButtons(Context context, C444223j r9) {
        boolean z;
        C693136s r0;
        if (!(r9 instanceof C444323k) || !((r0 = (C693136s) ((C444323k) r9).A00.A02) == null || r0.A00 == null)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C28931bI r2 = this.A0G;
            r2.A04(0);
            r2.A05(new C90074dU(this, r9, 31));
            setupJoinCallViewContent(r9.A01);
            AnonymousClass205 r02 = r9.A0v;
            AnonymousClass1BI r1 = r02.A00;
            if ((r02.A02 || ((r1 instanceof GroupJid) && this.A0z.A0K((GroupJid) r1))) && r9.A01 >= System.currentTimeMillis()) {
                C28931bI r22 = this.A0F;
                r22.A04(0);
                r22.A05(new C90084dV((Object) this, (Object) r9, (Object) context, 48));
            } else {
                this.A0F.A04(8);
            }
            this.A0H.A04(8);
            return;
        }
        this.A0G.A04(8);
        this.A0F.A04(8);
        C28931bI r23 = this.A0H;
        r23.A04(0);
        r23.A05(new C90074dU(this, r9, 32));
    }

    private void setupBubbleIcon(C444223j r3) {
        int i;
        C693136s r0;
        WaImageView waImageView = this.A0D;
        if (!(r3 instanceof C444323k) || !((r0 = (C693136s) ((C444323k) r3).A00.A02) == null || r0.A00 == null)) {
            i = 2131233289;
        } else {
            i = 2131233223;
        }
        waImageView.setImageResource(i);
    }

    private void setupCallTypeView(C444223j r6) {
        boolean A1T = AnonymousClass000.A1T(r6.A00, 2);
        Context context = getContext();
        int i = 2131895419;
        if (A1T) {
            i = 2131895418;
        }
        String string = context.getString(i);
        int i2 = 2131231762;
        if (r6.A00 == 2) {
            i2 = 2131232406;
        }
        Drawable A0B2 = AnonymousClass3MZ.A0B(this, i2);
        C17960vV.A07(A0B2);
        TextEmojiLabel textEmojiLabel = this.A0B;
        AnonymousClass3uQ.A0q(AnonymousClass4aX.A08(A0B2, textEmojiLabel.getCurrentTextColor()), textEmojiLabel, string);
    }

    /* access modifiers changed from: private */
    public void setupJoinCallViewContent(long j) {
        Resources resources;
        Context context;
        int i;
        int i2;
        TextView A0E2 = C17880vN.A0E(this.A0G.A02(), 2131431867);
        if (A0E2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (j < currentTimeMillis - 86400000) {
                A0E2.setVisibility(0);
                A0E2.setText(2131895427);
                resources = getResources();
                context = A0E2.getContext();
                i = 2130971113;
                i2 = 2131102439;
            } else if (currentTimeMillis < j) {
                A0E2.setVisibility(8);
                return;
            } else {
                A0E2.setVisibility(0);
                A0E2.setText(2131895428);
                resources = getResources();
                context = A0E2.getContext();
                i = 2130971981;
                i2 = 2131101293;
            }
            A0E2.setTextColor(AnonymousClass3Ma.A01(context, resources, i, i2));
        }
    }

    public void A1M() {
        if (!this.A09) {
            this.A09 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r1 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r1, A0O, this);
            AnonymousClass10G r2 = r1.A00;
            AnonymousClass3uQ.A16(r2, this);
            AnonymousClass3uQ.A0w(A0n, r1, r2, this);
            AnonymousClass3uQ.A12(r1, r2, this);
            AnonymousClass3uQ.A0y(A0n, r1, this, BE8.A0d(r1));
            AnonymousClass3uQ.A13(r1, r2, this, r1.ABq);
            AnonymousClass3uQ.A0x(A0n, r1, r2, this, r1.AIy);
            C19890zB r0 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r0, r1, r2, A0O, this);
            AnonymousClass3uQ.A11(r1, r2, this);
            AnonymousClass3uQ.A15(r1, this);
            AnonymousClass3uQ.A0s(r0, A0n, r1, r2, this);
            AnonymousClass3uQ.A0u(r0, r1, r2, A0O, this);
            AnonymousClass3uQ.A0t(r0, A0n, r1, A0O, this);
            AnonymousClass3uQ.A10(r1, r2, this);
            AnonymousClass3uQ.A0z(r1, r2, A0O, this, AnonymousClass3uQ.A0o(r1));
            this.A02 = (C32481hG) r1.A3Z.get();
            this.A01 = (AnonymousClass1TD) r1.A1m.get();
            this.A06 = (AnonymousClass1PP) r1.A3y.get();
            this.A04 = (C27081Uq) r1.A9g.get();
            this.A03 = (AnonymousClass1TA) r1.A5X.get();
            this.A08 = C000200d.A00(r1.A9f);
            this.A05 = (C33231iU) r1.A6K.get();
            this.A07 = C000200d.A00(r1.APG);
            this.A00 = (AnonymousClass1VP) r1.A1l.get();
        }
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A2i();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2i() {
        /*
            r7 = this;
            X.206 r5 = r7.A0I
            X.23j r5 = (X.C444223j) r5
            boolean r0 = r5 instanceof X.C444723o
            if (r0 == 0) goto L_0x0012
            r0 = r5
            X.23o r0 = (X.C444723o) r0
            X.1BI r0 = r0.A01
            if (r0 == 0) goto L_0x0012
            r5.A0d(r0)
        L_0x0012:
            long r1 = r5.A01
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Integer r6 = X.C17880vN.A0i()
            int r3 = X.A87.A00(r6, r3, r1)
            r0 = 1
            if (r3 != r0) goto L_0x0085
            X.0vb r3 = r7.A0D
            X.11Y r0 = X.AnonymousClass11X.A00
            java.lang.String r0 = r0.A05(r3)
        L_0x002b:
            if (r0 == 0) goto L_0x00ac
            X.0vb r6 = r7.A0D
            r4 = 2131895425(0x7f122481, float:1.9425683E38)
            java.lang.Object[] r3 = X.C17890vO.A1a(r0)
            X.11Y r0 = X.AnonymousClass11X.A00
            java.lang.String r1 = r0.A06(r6, r1)
            r0 = 1
            r3[r0] = r1
            java.lang.String r6 = r6.A0C(r4, r3)
        L_0x0043:
            X.0vb r2 = r7.A0D
            long r0 = r5.A01
            java.lang.String r4 = X.A8I.A00(r2, r0)
            com.whatsapp.TextEmojiLabel r3 = r7.A0A
            java.lang.String r2 = r5.A02
            int r1 = r2.length()
            r0 = 32
            if (r1 <= r0) goto L_0x0061
            int r1 = X.AnonymousClass1EG.A00(r2, r0)
            java.lang.String r0 = r5.A02
            java.lang.String r2 = X.AnonymousClass8BS.A0o(r0, r1)
        L_0x0061:
            r3.setText(r2)
            com.whatsapp.TextEmojiLabel r3 = r7.A0C
            android.content.Context r2 = r7.getContext()
            r1 = 2131895426(0x7f122482, float:1.9425685E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1b()
            X.AnonymousClass001.A1Q(r6, r4, r0)
            X.AnonymousClass3MY.A0y(r2, r3, r0, r1)
            r7.setupBubbleIcon(r5)
            r7.setupCallTypeView(r5)
            android.content.Context r0 = r7.getContext()
            r7.setupActionButtons(r0, r5)
            return
        L_0x0085:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = X.A87.A00(r0, r3, r1)
            if (r0 != 0) goto L_0x009a
            X.0vb r0 = r7.A0D
            java.lang.String r0 = X.AnonymousClass11X.A00(r0)
            goto L_0x002b
        L_0x009a:
            long r3 = java.lang.System.currentTimeMillis()
            int r3 = X.A87.A00(r6, r3, r1)
            r0 = -1
            if (r3 != r0) goto L_0x00ac
            X.0vb r0 = r7.A0D
            java.lang.String r0 = X.AnonymousClass11X.A01(r0)
            goto L_0x002b
        L_0x00ac:
            X.0vb r0 = r7.A0D
            java.lang.String r6 = X.AnonymousClass11Y.A01(r0, r1)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8nW.A2i():void");
    }

    public /* synthetic */ void A2j(Context context, C444223j r6) {
        AnonymousClass205 r0 = r6.A0v;
        AnonymousClass1BI r1 = r0.A00;
        if (r0.A02 || ((r1 instanceof GroupJid) && this.A0z.A0K((GroupJid) r1))) {
            SpannableString spannableString = new SpannableString(context.getString(2131895422));
            spannableString.setSpan(new ForegroundColorSpan(-65536), 0, spannableString.length(), 0);
            C73203Rj A002 = AnonymousClass4a6.A00(context);
            A002.A0k(context.getString(2131895423));
            A002.A0T(true);
            A002.A0X((DialogInterface.OnClickListener) null, 2131895421);
            A002.A0L(new C20153A9p(r6, this, 10), spannableString);
            A002.create().show();
        }
    }

    public /* synthetic */ void A2k(AnonymousClass1EC r13, C444223j r14) {
        AnonymousClass11P r4 = this.A0u;
        Context context = getContext();
        AnonymousClass1KB r1 = this.A0S;
        long j = r14.A0x;
        AnonymousClass1VP r2 = this.A00;
        AnonymousClass1TD r5 = this.A01;
        C27081Uq r7 = this.A04;
        C63982u1.A05(context, r1, r2, getVoipErrorFragmentBridge(), r4, r5, this.A03, r7, r13, 21, j);
    }

    public C444223j getFMessage() {
        return (C444223j) this.A0I;
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof C444223j);
        this.A0I = r2;
    }

    public AnonymousClass8nW(Context context, C108875cR r4, C444223j r5) {
        super(context, r4, r5);
        A1M();
        setClickable(true);
        setLongClickable(false);
        this.A0B = (TextEmojiLabel) AnonymousClass1HF.A06(this, 2131428746);
        this.A0A = (TextEmojiLabel) AnonymousClass1HF.A06(this, 2131428744);
        this.A0C = (TextEmojiLabel) AnonymousClass1HF.A06(this, 2131434822);
        this.A0D = (WaImageView) AnonymousClass1HF.A06(this, 2131434819);
        this.A0G = C28931bI.A00(this, 2131427499);
        this.A0F = C28931bI.A00(this, 2131427488);
        this.A0H = C28931bI.A00(this, 2131428827);
        A1u();
    }

    public void A1u() {
        A2i();
        super.A1u();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4Rb, java.lang.Object] */
    public /* synthetic */ void A2l(C444223j r8) {
        C693136s r0;
        AnonymousClass212 r1;
        Object A0H2;
        Activity A052 = AnonymousClass3Ma.A05(this);
        if ((A052 instanceof AnonymousClass1FU) && (r8 instanceof C444323k) && (r0 = (C693136s) ((C444323k) r8).A00.A02) != null && (r1 = r0.A00) != null) {
            if (AnonymousClass25A.A0P(this.A0U, r1)) {
                AnonymousClass11S r02 = this.A0U;
                r02.A0I();
                A0H2 = r02.A0E;
            } else {
                A0H2 = r1.A0H();
            }
            Bundle A0D2 = C17880vN.A0D();
            if (A0H2 != null) {
                A0D2.putParcelableArrayList("user_jids", C17880vN.A10(Collections.singletonList(A0H2)));
            }
            getVoipErrorFragmentBridge();
            ? obj = new Object();
            Bundle A0D3 = C17880vN.A0D();
            A0D3.putAll(A0D2);
            A0D3.putInt("error", 32);
            VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
            voipErrorDialogFragment.A1R(A0D3);
            voipErrorDialogFragment.A02 = obj;
            ((AnonymousClass1FU) A052).CMk(voipErrorDialogFragment, (String) null);
        }
    }

    public int getCenteredLayoutId() {
        return 2131624921;
    }

    public int getIncomingLayoutId() {
        return 2131624921;
    }

    public int getOutgoingLayoutId() {
        return 2131624922;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((AnonymousClass10T) this.A08.get()).registerObserver(this.A0E);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((AnonymousClass10T) this.A08.get()).unregisterObserver(this.A0E);
    }
}
