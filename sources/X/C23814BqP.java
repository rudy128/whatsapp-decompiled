package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Set;

/* renamed from: X.BqP  reason: case insensitive filesystem */
public class C23814BqP extends C23815BqQ {
    public FrameLayout A00 = ((FrameLayout) AnonymousClass1HF.A06(this, 2131436799));
    public final WaTextView A01 = ((WaTextView) AnonymousClass1HF.A06(this, 2131436797));
    public final WaTextView A02 = ((WaTextView) AnonymousClass1HF.A06(this, 2131436801));
    public final ViewOnceDownloadProgressView A03 = ((ViewOnceDownloadProgressView) AnonymousClass1HF.A06(this, 2131436795));
    public final ViewGroup A04 = AnonymousClass3MW.A0C(this.A00, 2131429812);
    public final ViewGroup A05;
    public final TextView A06 = AnonymousClass3MW.A0J(this.A00, 2131429789);
    public final TextView A07;
    public final AnonymousClass00H A08 = DWR.A02(this, 47);

    private void A00(AnonymousClass21V r10, int i) {
        String[] A1b;
        FrameLayout frameLayout = this.A00;
        String valueOf = String.valueOf(frameLayout.getContentDescription());
        String A0C = AnonymousClass25A.A0C(this.A0D, r10.A01);
        String A002 = A8I.A00(this.A0D, this.A0u.A09(r10.A0I));
        C18000vb r1 = this.A0D;
        if (i == 2) {
            A1b = C17880vN.A1b(valueOf, A002, 2, 1);
        } else {
            A1b = C17880vN.A1b(valueOf, A0C, 3, 1);
            A1b[2] = A002;
        }
        frameLayout.setContentDescription(C60592oI.A00(r1, Arrays.asList(A1b), false));
    }

    private void setTransitionNames(AnonymousClass21V r3) {
        AnonymousClass1Xr.A04(this.A0H, AnonymousClass4W0.A00(r3));
        ImageView imageView = this.A0D;
        if (imageView != null) {
            AnonymousClass1Xr.A04(imageView, AnonymousClass3uL.A0O(r3));
        }
    }

    public void A1y() {
        ViewOnceDownloadProgressView viewOnceDownloadProgressView = this.A03;
        AnonymousClass21V fMessage = getFMessage();
        if (!viewOnceDownloadProgressView.isInEditMode()) {
            C88564a8.A01(viewOnceDownloadProgressView.A01, fMessage, viewOnceDownloadProgressView.A04);
        }
    }

    public void A20() {
        AnonymousClass1FU A0O;
        AnonymousClass21V fMessage = getFMessage();
        AnonymousClass215 r2 = (AnonymousClass215) fMessage;
        if (r2.Bbc() == 2) {
            AnonymousClass206 r22 = (AnonymousClass206) r2;
            AnonymousClass1E7 A052 = AnonymousClass25A.A05(this.A0w, r22);
            if (A052 != null) {
                boolean z = r22 instanceof AnonymousClass22W;
                int i = 2131897953;
                int i2 = 2131897952;
                if (z) {
                    i = 2131897934;
                    i2 = 2131897933;
                }
                C73203Rj A002 = AnonymousClass4a6.A00(getContext());
                A002.A0E(i);
                AnonymousClass3tU.A06(getResources(), A002, this, A052, i2);
            }
        } else if (this.A03 != null && !AnonymousClass74O.A0O(getContext(), this.A03)) {
        } else {
            if (!fMessage.A1E()) {
                Log.w("conversation/row/viewOnce/no file");
                if (!A2p() && (A0O = C72473Md.A0O(this)) != null) {
                    ((C139956zi) this.A0O.get()).A03(A0O);
                    return;
                }
                return;
            }
            Context context = getContext();
            AnonymousClass205 r8 = fMessage.A0v;
            AnonymousClass1BI r7 = r8.A00;
            C17960vV.A07(r7);
            getContext().startActivity(AnonymousClass6WZ.A00(context, (AnonymousClass77F) null, r7, r8, 0, 3, -1, 0, -1, 5, false, false, false, true, false));
            postDelayed(new C98814rl(this, fMessage, 38), 220);
        }
    }

    public void setViewMessageOnClickListener(View view, C38471rL r3) {
        if (((C86304Rc) this.A1t.get()).A00()) {
            view.setOnTouchListener((View.OnTouchListener) this.A08.get());
        } else {
            view.setOnClickListener(r3);
        }
    }

    public C23814BqP(Context context, C108875cR r6, AnonymousClass21V r7) {
        super(context, r6, r7);
        A1M();
        View view = this.A01;
        this.A05 = AnonymousClass3MW.A0C(view, 2131429812);
        this.A07 = AnonymousClass3MW.A0J(view, 2131429789);
        this.A00.setForeground(getInnerFrameForegroundDrawable());
        A2v();
    }

    public void A2t() {
        super.A2t();
        A2K(getFMessage());
    }

    public void A2v() {
        super.A2v();
        int Bbc = ((AnonymousClass215) getFMessage()).Bbc();
        if (Bbc == 0) {
            this.A01.setVisibility(8);
            AnonymousClass21V fMessage = getFMessage();
            int A002 = AnonymousClass25A.A00(fMessage);
            setTransitionNames(fMessage);
            BqS.A02(this.A03, fMessage, A002, false);
            A2w(this.A00, A002, false);
            A00(fMessage, A002);
            A2K(fMessage);
        } else if (Bbc == 1) {
            this.A00.setVisibility(8);
            A2t();
            WaTextView waTextView = this.A02;
            waTextView.setText(2131897928);
            AnonymousClass3MY.A0w(getContext(), waTextView, getMediaTypeDescriptionString());
        } else if (Bbc == 2) {
            this.A01.setVisibility(8);
            AnonymousClass21V fMessage2 = getFMessage();
            setTransitionNames(fMessage2);
            BqS.A02(this.A03, fMessage2, 2, false);
            A2w(this.A00, 2, false);
            A00(fMessage2, 2);
            A2K(fMessage2);
        }
    }

    public void A2w(View view, int i, boolean z) {
        super.A2w(view, i, z);
        if (i == 2) {
            this.A01.setVisibility(8);
            return;
        }
        AnonymousClass21V fMessage = getFMessage();
        WaTextView waTextView = this.A01;
        waTextView.setText(AnonymousClass25A.A0C(this.A0D, fMessage.A01));
        waTextView.setVisibility(0);
    }

    public TextView getDateView() {
        if (((AnonymousClass215) getFMessage()).Bbc() == 0) {
            return this.A06;
        }
        return this.A07;
    }

    public ViewGroup getDateWrapper() {
        if (((AnonymousClass215) getFMessage()).Bbc() == 0) {
            return this.A04;
        }
        return this.A05;
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        innerFrameLayouts.add(this.A00);
        return innerFrameLayouts;
    }
}
