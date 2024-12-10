package X;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.BqN  reason: case insensitive filesystem */
public class C23812BqN extends AnonymousClass3uL {
    public View A00;
    public FrameLayout A01;
    public WaTextView A02;
    public WaTextView A03;
    public ViewOnceDownloadProgressView A04;
    public ViewOnceDownloadProgressView A05;
    public boolean A06;
    public View A07;
    public ViewGroup A08;
    public ViewGroup A09;
    public TextView A0A;
    public TextView A0B;
    public final AnonymousClass00H A0C = C18150vq.A02(new DWJ(this, 0));
    public final AnonymousClass00H A0D = DWR.A02(this, 49);

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    private void A00() {
        ViewOnceDownloadProgressView viewOnceDownloadProgressView;
        FrameLayout frameLayout;
        View view;
        ViewOnceDownloadProgressView viewOnceDownloadProgressView2;
        View view2;
        FrameLayout frameLayout2;
        C444523m r3 = (C444523m) ((AnonymousClass21V) this.A0I);
        int i = r3.A00;
        if (i != 0) {
            if (i == 1) {
                WaTextView waTextView = this.A02;
                if (waTextView != null && (viewOnceDownloadProgressView2 = this.A04) != null && (view2 = this.A00) != null && (frameLayout2 = this.A01) != null) {
                    waTextView.setText(2131897928);
                    waTextView.setTextColor(getResources().getColor(2131102856));
                    waTextView.A0K();
                    AnonymousClass3MY.A0w(getContext(), waTextView, getViewStateDescription());
                    viewOnceDownloadProgressView2.A00(2131231887, -1, 2131102856);
                    view2.setVisibility(0);
                    frameLayout2.setVisibility(8);
                    return;
                }
                return;
            } else if (i != 2) {
                return;
            }
        }
        WaTextView waTextView2 = this.A03;
        if (waTextView2 != null && (viewOnceDownloadProgressView = this.A05) != null && (frameLayout = this.A01) != null && (view = this.A00) != null) {
            getContext();
            String string = getContext().getString(2131897913);
            HashMap hashMap = C26302CxJ.A01;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            spannableStringBuilder.setSpan(new C22628BGo(), 0, string.length(), 0);
            waTextView2.setText(spannableStringBuilder);
            String string2 = getContext().getString(getViewStateDescription());
            String A002 = A8I.A00(this.A0D, this.A0u.A09(r3.A0I));
            C18000vb r1 = this.A0D;
            String[] A1Z = C17880vN.A1Z();
            AnonymousClass8BS.A1B(string2, A002, A1Z);
            frameLayout.setContentDescription(C60592oI.A00(r1, Arrays.asList(A1Z), false));
            A2K(r3);
            viewOnceDownloadProgressView.A00(2131232411, 2131231887, AnonymousClass4Z9.A00(getContext(), 2130971719));
            if (((C86304Rc) this.A1t.get()).A01()) {
                frameLayout.setOnTouchListener((View.OnTouchListener) this.A0C.get());
            } else {
                frameLayout.setOnClickListener((View.OnClickListener) this.A0D.get());
            }
            AnonymousClass3uP.A0W(frameLayout, this);
            frameLayout.setVisibility(0);
            view.setVisibility(8);
        }
    }

    public void A1M() {
        if (!this.A06) {
            this.A06 = true;
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

    public void A20() {
        C444523m r4 = (C444523m) ((AnonymousClass21V) this.A0I);
        if (r4.A00 == 2) {
            AnonymousClass1E7 A052 = AnonymousClass25A.A05(this.A0w, r4);
            if (A052 != null) {
                C73203Rj A002 = AnonymousClass4a6.A00(getContext());
                A002.A0E(2131897911);
                AnonymousClass3tU.A06(getResources(), A002, this, A052, 2131897910);
                return;
            }
            return;
        }
        Context context = getContext();
        AnonymousClass205 r3 = r4.A0v;
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.messaging.ViewOnceViewerActivity");
        AnonymousClass4aU.A00(intent, r3);
        getContext().startActivity(intent);
        postDelayed(new C98814rl(this, r4, 39), 220);
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A00();
        }
    }

    public TextView getDateView() {
        if (((C444523m) ((AnonymousClass21V) this.A0I)).A00 == 0) {
            return this.A0B;
        }
        return this.A0A;
    }

    public ViewGroup getDateWrapper() {
        if (((C444523m) ((AnonymousClass21V) this.A0I)).A00 == 0) {
            return this.A09;
        }
        return this.A08;
    }

    public C444523m getFMessage() {
        return (C444523m) ((AnonymousClass21V) this.A0I);
    }

    public int getViewStateDescription() {
        int i = ((C444523m) ((AnonymousClass21V) this.A0I)).A00;
        if (i == 1) {
            return 2131897909;
        }
        if (i != 2) {
            return 2131897907;
        }
        return 2131897908;
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof C444523m);
        super.setFMessage(r2);
    }

    public C23812BqN(Context context, C108875cR r5, C444523m r6) {
        super(context, r5, r6);
        A1M();
        if (!r6.A0v.A02) {
            this.A07 = AnonymousClass1HF.A06(this, 2131432248);
            FrameLayout frameLayout = (FrameLayout) AnonymousClass1HF.A06(this, 2131436799);
            this.A01 = frameLayout;
            this.A09 = AnonymousClass3MW.A0C(frameLayout, 2131429812);
            this.A0B = AnonymousClass3MW.A0J(this.A01, 2131429789);
            this.A03 = (WaTextView) AnonymousClass1HF.A06(this, 2131436801);
            this.A05 = (ViewOnceDownloadProgressView) AnonymousClass1HF.A06(this, 2131436795);
            View A062 = AnonymousClass1HF.A06(this, 2131436800);
            this.A00 = A062;
            this.A0A = AnonymousClass3MW.A0J(A062, 2131429789);
            this.A08 = AnonymousClass3MW.A0C(this.A00, 2131429812);
            this.A02 = (WaTextView) AnonymousClass1HF.A06(this, 2131436802);
            this.A04 = (ViewOnceDownloadProgressView) AnonymousClass1HF.A06(this, 2131436796);
            AnonymousClass1HF.A06(this, 2131436797).setVisibility(8);
            this.A01.setForeground(getInnerFrameForegroundDrawable());
            A00();
        }
    }

    public void A1u() {
        super.A1u();
        A00();
    }

    public int getCenteredLayoutId() {
        return 2131624959;
    }

    public int getIncomingLayoutId() {
        return 2131624959;
    }

    public int getOutgoingLayoutId() {
        return 2131624960;
    }
}
